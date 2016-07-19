package net.sirun.work.handle;

import static io.netty.handler.codec.http.HttpHeaders.is100ContinueExpected;
import static io.netty.handler.codec.http.HttpHeaders.isKeepAlive;

import java.util.logging.Logger;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.util.CharsetUtil;
import net.sirun.bin.ProxyContorlList;
import net.sirun.util.HTTPContentUtil;
import net.sirun.work.handle.servise.BusinessServiceInterface;
import net.sirun.work.http.HttpSnoopServerHandler;

/**
 * 对TU消息进行处理线程(多线程)
 * 
 * @author jnad
 * 
 */
public class TUMessageHandle implements Runnable {
	private ChannelHandlerContext ctx;
	private Object msg;
	private String buf;
	private static final Logger logger = Logger.getLogger(TUMessageHandle.class.getName());

	public TUMessageHandle(ChannelHandlerContext ctx, Object msg) {
		this.ctx = ctx;
		this.msg = msg;
	}

	public TUMessageHandle(ChannelHandlerContext ctx, Object msg, String buf) {
		this.ctx = ctx;
		this.msg = msg;
		this.buf = buf;
	}

	@Override
	public void run() {
		try {
			work();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

 
	/**
	 * 解析当前请求的字段,判断是否是需要cgi响应的请求,假如不是则检查是否是页面 都不是,则返回404
	 * @
	 */
	private void work() {

		// HttpContent httpContent = (HttpContent) msg;
		// ByteBuf content = httpContent.content();
		// System.out.println(content.toString(CharsetUtil.UTF_8));
		//

		// HTTP 返回
		HttpResponse resp;
		// uri 处理
		// type of
		if (msg instanceof HttpObject) {
			HttpRequest request = (HttpRequest) msg;
			if (is100ContinueExpected(request)) {
				HTTPContentUtil.send100Continue(ctx);
			}

			String s[] = URIDecode.uriCheck(request.getUri());
			// 判断是否是服务,不是则转文件处理
			if (s.length >= 2 && URIDecode.isServiceMode(s[1])) {
				// service mode 用于连接的服务请求
				resp = serviceMode(ctx, request, s[2]);

			} else {
				// showmode 用于显示的,非服务请求
				resp = showMode(ctx, request);
			}
			// 确认当前请求是否还存活
			writeResponse(request, resp, ctx);

		}

	}

	/**
	 * 更新写回数据方法,将resq定义在外围
	 * 
	 * @param resp
	 * @param ctx
	 * @return
	 */
	private boolean writeResponse(HttpRequest request, HttpResponse resp, ChannelHandlerContext ctx) {

		System.out.println(isKeepAlive(request));
		ctx.write(resp).addListener(ChannelFutureListener.CLOSE);
		ctx.flush();
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
		ctx.write(BusinessServiceInterface.NOTFOUNT404);
		return true;
	}

	/**
	 * service mode 用于连接的服务请求 开始分析连接所有的属性,并将其投入到服务队列里
	 * 
	 * @param ctx
	 * @param request
	 */

	private HttpResponse serviceMode(ChannelHandlerContext ctx, HttpObject ho, String ver) {
		// 分析 url 判断版本号,假如版本号未知,则转为show模式
		HttpRequest request = (HttpRequest) ho;
		BusinessServiceInterface bs = ProxyContorlList.WorkClass.SERVICECLASS.get(ver);
		if (bs == null) {
			// 假如版本号未知/未定义,则转为show模式
			return showMode(ctx, ho);
		}

		return bs.routingRequest(request, buf);
	}

	/**
	 * 新版本业务分配,统一由业务入口进行导入<br>
	 * 分析 url 判断业务,在未得到业务匹配后交由显示(show 文本)模式
	 * 
	 * @param ctx
	 * @param ho
	 * @param ver
	 * @return
	 */

	private HttpResponse serviceMode_new(ChannelHandlerContext ctx, HttpObject ho, String ver) {
		// 分析 url 判断业务,在未得到业务匹配后交由显示(show 文本)模式
		HttpRequest request = (HttpRequest) ho;
		BusinessServiceInterface bs = ProxyContorlList.WorkClass.SERVICECLASS.get(ver);
		if (bs == null) {
			// 假如版本号未知/未定义,则转为show模式
			return showMode(ctx, ho);
		}
		return bs.routingRequest(request, buf);
	}

	/**
	 * showmode 用于显示的,非服务请求,并直接处理 显示的请求
	 * 
	 * @param ctx
	 * @param request
	 */
	private HttpResponse showMode(ChannelHandlerContext ctx, HttpObject ho) {
		HttpResponse resp;
		// 分两个方向匹配请求 按优先 为 页面服务,页面(文件) 进行匹配
		HttpRequest request = (HttpRequest) ho;
		// 首先校验URI是否是已经定义的请求,假如是则直接返回,否则进行文件匹配
		String[] uris = URIDecode.uriCheck(request.getUri());
		// 首先确认是否是页面服务,假如是则不再查找页面
		BusinessServiceInterface bs = ProxyContorlList.WorkClass.SERVICECLASS.get("sWork");
		resp = bs.routingRequest(request, buf);
		if (resp != null) {
			return resp;
		}
		bs = ProxyContorlList.WorkClass.SERVICECLASS.get("sFile");
		return bs.routingRequest(request, buf);

	}

}