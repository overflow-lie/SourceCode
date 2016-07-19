package hoperun.proxyserver.nettyserver;

import static io.netty.handler.codec.http.HttpHeaders.is100ContinueExpected;
import hoperun.loginfo.SelfLogger;
import hoperun.proxybusiness.business.ICallServiceInterface;
import hoperun.proxyserver.bean.HttpInfo;
import hoperun.proxyserver.bin.ProxyConstant;
import hoperun.proxyserver.util.HTTPContentUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSONObject;

/**
 * 对TU消息进行处理线程
 * 
 * @author jnad
 * 
 */
public class MessageHandle implements Runnable {
	private ChannelHandlerContext ctx;
	private Object msg;
	private String buf;
	private static final Logger logger = Logger.getLogger(MessageHandle.class.getName());
	private String threadName = null;

	public MessageHandle(ChannelHandlerContext ctx, Object msg) {
		this.ctx = ctx;
		this.msg = msg;
	}

	public MessageHandle(ChannelHandlerContext ctx, Object msg, String buf) {
		this.ctx = ctx;
		this.msg = msg;
		this.buf = buf;
	}

	// 保存着当前线程的请求是否存活
	public static final Map<String, Boolean> connectionMap = new ConcurrentHashMap<String, Boolean>();

	@Override
	public void run() {
		try {
			work();
		} catch (Exception e) {
			e.printStackTrace();
			// 报错 返回500错误
			writeResponse((HttpRequest) msg, notFound500(), ctx);

		}
	}

	/**
	 * 解析当前请求的字段,判断是否是需要cgi响应的请求,假如不是则检查是否是页面 都不是,则返回404 @
	 */
	private void work() {

		// HTTP 返回
		HttpResponse resp = null;
		// uri 处理
		// type of
		if (msg instanceof HttpObject) {
			HttpRequest request = (HttpRequest) msg;
			if (is100ContinueExpected(request)) {
				HTTPContentUtil.send100Continue(ctx);
			}
			Map<String, String> requestMap = getrequestMap(request, buf);
			// 添加远程Ip信息
			request.headers().add("RemoteAddress", ctx.channel().remoteAddress().toString());
			// 当前通道是否存活的标志
			threadName = Thread.currentThread().getName();
			connectionMap.put(threadName, true);
			SelfLogger.tempParam("接受请求", "remoteAddress: " + ctx.channel().remoteAddress().toString(),
					"uri:" + request.getUri() + " request:" + JSONObject.toJSONString(requestMap));
			// 添加关闭事件处理
			ctx.channel().closeFuture().addListener(CLOSE_LISTENER);

			try {
				long startTime = System.currentTimeMillis();
				// 调用服务
				resp = jumpCallService(request, ctx, requestMap);
				// 记录本次请求
				recordVisit(request, requestMap, resp, startTime);
			} catch (Exception e) {
				writeResponse(request, notFound500(), ctx);
				e.printStackTrace();
				logger.log(Level.WARNING, JSONObject.toJSONString(e));
				SelfLogger.tempParam("HTTPERR", JSONObject.toJSONString(e), JSONObject.toJSONString(request), requestMap);
				return;
			}
			if (resp == null) {
				// SelfLogger.tempParam("X.J.2",
				// "service Not matches Return 404");
				// logger.log(Level.INFO, "service Not matches Return 404");
				resp = notFound404();
			}
			// 确认当前请求是否还存活
			writeResponse(request, resp, ctx);
		}

	}

	/**
	 * 记录当前请求信息
	 * 
	 * @param request
	 * @param requestMap
	 * @param resp
	 * @param startTime
	 */
	private void recordVisit(HttpRequest request, Map<String, String> requestMap, HttpResponse resp, long startTime) {
		HttpInfo httpInfo = getVisit(request, requestMap, resp, startTime);
		// 记录信息
		ProxyConstant.WorkClass.RECORDVISITSERVICE.record(httpInfo);

	}

	/**
	 * 获取本次请求的信息
	 * 
	 * @param request
	 * @param requestMap
	 * @param resp
	 * @param startTime
	 * @return
	 */
	private HttpInfo getVisit(HttpRequest request, Map<String, String> requestMap, HttpResponse resp, long startTime) {
		long totalMillis = System.currentTimeMillis() - startTime;// 本次请求总用时
		FullHttpResponse fhp = (FullHttpResponse) resp;

		HttpInfo httpInfo = new HttpInfo();
		if (fhp != null) {
			io.netty.buffer.ByteBuf bf = (ByteBuf) fhp.content().copy();
			byte[] data = new byte[bf.readableBytes()];
			bf.readBytes(data);
			httpInfo.setResponseBytesLength(data.length);
			httpInfo.setResponseContent(new String(data));
			httpInfo.setContentType(fhp.headers().get("Content-Type"));
			httpInfo.setResponseCode(fhp.getStatus().code());
		} else {
			httpInfo.setResponseCode(404);
		}
		httpInfo.setUrl(request.getUri());
		httpInfo.setTotalMillis(totalMillis);
		httpInfo.setRequestCookies(request.headers().get("Cookie"));
		httpInfo.setRequestBody(requestMap);
		httpInfo.setMethod(request.getMethod().name());

//		httpInfo.setRequestBytes(request.toString().getBytes().length);
//		SelfLogger.tempParam("访问Url信息统计", JSONObject.toJSONString(httpInfo));
		return httpInfo;

	}

	/**
	 * 解析buf携带数据
	 * 
	 * @param request
	 * @param buf
	 * @return
	 */
	public static final Map<String, String> getRequesData(HttpRequest request, String buf) {
		QueryStringDecoder queryStringDecoder = null;

		// 假如是get协议,则解析URI进行分析
		// 转而使用Get方式进行获取数据,查找默认字段为sirun和json的是否使用get进行传值
		if (request.getMethod().name().equals(HttpMethod.GET.name())) {
			queryStringDecoder = new QueryStringDecoder(request.getUri());
		} else {
			// uri 内含有值
			boolean urihasVal = request.getUri().split("\\?").length > 1;

			// uri post 赋值
			if (buf.getBytes().length != 0) {
				// 有内容,根据uri判断是否还有值

				queryStringDecoder = new QueryStringDecoder(request.getUri() + (urihasVal ? "&" : "?") + buf);
			} else {
				// 没有内容 直接解析
				queryStringDecoder = new QueryStringDecoder(request.getUri());
			}
		}
		return getPar4MapStringString(queryStringDecoder);
	}

	/**
	 * 将数据转换为json对象
	 * 
	 * @param queryStringDecoder
	 * @return
	 */
	private static final JSONObject getParM4JSON(QueryStringDecoder queryStringDecoder) {
		JSONObject jo = new JSONObject();

		Map<String, List<String>> params = queryStringDecoder.parameters();
		if (!params.isEmpty()) {
			for (Entry<String, List<String>> p : params.entrySet()) {
				String key = p.getKey();
				List<String> vals = p.getValue();
				for (String val : vals) {
					jo.put(key, val);
				}
			}
		}

		return jo;

	}

	/**
	 * 将数据转换为Map对象(重复数据会被覆盖掉)
	 * 
	 * @param queryStringDecoder
	 * @return
	 */
	private static final Map<String, String> getPar4MapStringString(QueryStringDecoder queryStringDecoder) {
		Map<String, String> returnMap = new HashMap<String, String>();

		Map<String, List<String>> params = queryStringDecoder.parameters();
		if (!params.isEmpty()) {
			for (Entry<String, List<String>> p : params.entrySet()) {
				String key = p.getKey();
				List<String> vals = p.getValue();
				for (String val : vals) {
					try {
						returnMap.put(URLDecoder.decode(key, "utf-8"), URLDecoder.decode(val, "utf-8"));
					} catch (UnsupportedEncodingException e) {
						SelfLogger.tempParam("E.J.3", "can't decode this:" + key + "[" + val + "]");

						e.printStackTrace();
					}
				}
			}
		}

		return returnMap;

	}

	/**
	 * 返回请求参数及body体携带的参数信息
	 * 
	 * @param uri
	 * @param buf
	 * @return
	 */
	private Map<String, String> getrequestMap(HttpRequest request, String buf) {

		// try {
		// buf = URLEncoder.encode(buf, "utf-8");
		// } catch (UnsupportedEncodingException e1) {
		// e1.printStackTrace();
		// }

		return getRequesData(request, buf);
	}

	/**
	 *   得到404的返回
	 * 
	 * @return
	 */
	private HttpResponse notFound404() {
		return HTTPContentUtil.getFullHttpResponse(ProxyConstant.getPropertyForString("HTTP_STAT_404"), HttpResponseStatus.NOT_FOUND);
	}

	/**
	 *   得到500的返回
	 * 
	 * @return
	 */
	private HttpResponse notFound500() {
		return HTTPContentUtil.getFullHttpResponse(ProxyConstant.getPropertyForString("HTTP_STAT_500"), HttpResponseStatus.valueOf(500));
	}

	/**
	 * 跳转到的注册的service上 ,假如所有的Service 无法匹配或者匹配后返回null继续匹配 失败,返回null
	 * 
	 * @param request
	 * @param resp
	 * @param ctx
	 */
	private HttpResponse jumpCallService(HttpRequest request, ChannelHandlerContext ctx, Map<String, String> requestMap) {
		//  根据URL依次进行匹配
		int serviceSize = ProxyConstant.WorkClass.SERVICELIST.size();
		HttpResponse callback = null;

		final String uri = request.getUri();
		for (int i = 0; i < serviceSize; i++) {
			// 不可派生
			ICallServiceInterface isi = ProxyConstant.WorkClass.SERVICELIST.get(i);

			if (Pattern.matches(isi.getThisUrlFilter(), uri)) {
				callback = isi.callService(request, requestMap);
				// logger.log(Level.INFO, "handle:" + isi.getClass().getName());
				if (callback == null) {
					// =null 继续循环
					SelfLogger.info("", "请求:" + uri + "当前服务[" + isi.getClass().getName() + "]执行完毕,没有得到返回,继续执行下一个服务 Return empty,Repeat the cycle");
					continue;
				} else {
					SelfLogger.info("", "请求:" + uri + "当前服务[" + isi.getClass().getName() + "]执行完毕 Return callback");
					break;
				}
			}

		}

		return callback;
	}

	/**
	 * 更新写回数据方法,将resq定义在外围
	 * 
	 * @param resp
	 * @param ctx
	 * @return
	 */
	private boolean writeResponse(HttpRequest request, HttpResponse resp, ChannelHandlerContext ctx) {

		if (resp == null) {
			SelfLogger.tempParam("X.J.2", "返回为空", request, JSONObject.toJSONString(ctx));
			resp = notFound500();
		}

		// System.out.println(isKeepAlive(request));
		ctx.write(resp).addListener(ChannelFutureListener.CLOSE);
		ctx.flush();
		try {
			ctx.channel().closeFuture().sync().channel().close();
			ctx.close();
			// SelfLogger.tempParam("X.J.3", JSONObject.toJSONString(ctx));
			// System.out.println("X.J.3" + JSONObject.toJSONString(ctx));
		} catch (InterruptedException e) {
			SelfLogger.tempParam("E.J.1", e.getMessage());
			e.printStackTrace();
		}
		//
		// 确认当前请求是否还存活
		// if (isKeepAlive(request)) {
		// ctx.write(resp);
		// ctx.flush();
		// } else {
		// }
		return true;
	}

	/**
	 * 写回非HTTP的指令,例如 SOCKET的访问,目前没有SOCKET 在 HTTP服务端口
	 * 
	 * @param resp
	 * @param ctx
	 * @return
	 */
	private boolean writeResponseInSocket(ChannelHandlerContext ctx) {
		ctx.write(ProxyConstant.getProperty("HTTP_STAT_404"));
		return true;
	}

	private GenericFutureListener<Future<? super Void>> CLOSE_LISTENER = new GenericFutureListener<Future<? super Void>>() {
		@Override
		public void operationComplete(Future<? super Void> future) throws Exception {
			future.cancel(true);
			// System.out.println("关闭内:  [  "+System.currentTimeMillis()+"  ]" +
			// ctx.channel().remoteAddress()+",  "+threadName);
			connectionMap.put(threadName, false);
		}
	};
}