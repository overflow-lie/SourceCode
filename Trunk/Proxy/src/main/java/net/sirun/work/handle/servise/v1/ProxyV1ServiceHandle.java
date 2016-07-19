package net.sirun.work.handle.servise.v1;

import static io.netty.handler.codec.http.HttpHeaders.getHost;
import io.netty.buffer.AbstractByteBuf;
import io.netty.buffer.UnpooledUnsafeDirectByteBuf;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.handler.codec.http.multipart.DefaultHttpDataFactory;
import io.netty.handler.codec.http.multipart.HttpDataFactory;
import io.netty.util.CharsetUtil;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import net.sirun.bean.NGTPRequestBean;
import net.sirun.bin.ProxyContorlList;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherData;
import net.sirun.ngtp.ngtp_dispatch.UplinkNGTPDispatcherData;
import net.sirun.queue.NettyChannelMap;
import net.sirun.util.ByteUtil;
import net.sirun.util.HTTPContentUtil;
import net.sirun.util.NGTPUtil;
import net.sirun.work.http.client.HTTPPostClient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oss.asn1.INTEGER;

/**
 * 对业务的处理 实现方法,本类均是 static
 * 
 * @author jnad
 * @deprecated 已删除
 * 
 */
@Deprecated
public class ProxyV1ServiceHandle {
	private static final Logger logger = Logger
			.getLogger(ProxyV1ServiceHandle.class.getName());
	private static final HttpDataFactory factory = new DefaultHttpDataFactory(
			DefaultHttpDataFactory.MINSIZE); // Disk

	private static final HttpResponseStatus UPLINKNOTRESPONSE = new HttpResponseStatus(
			504, "Gateway/DSPT Timeout");

	// 扫描周期
	private static int client_sleepScan = ProxyContorlList
			.getPropertyForInteger("Client_sleepScan");
	// 总等待周期
	private static int client_waitTime = ProxyContorlList
			.getPropertyForInteger("Client_waitTime");

	public static final HttpResponse v1index(HttpRequest request) {

		String content = "这是V1版本的详细介绍,V1版本共有....";

		// 返回内容需要加载默认的Response
		return HTTPContentUtil.getFullHttpResponse(content,
				HttpResponseStatus.OK);

	}

	/**
	 * 测试的返回方法
	 * 
	 * @param request
	 * @return
	 */
	public static final HttpResponse getjson(HttpRequest request) {

		Map<String, String> amap = new HashMap<String, String>();
		amap.put("json", "asd");

		String content = JSONObject.toJSON(amap).toString();

		// 返回内容需要加载默认的Response
		return HTTPContentUtil.getFullHttpResponse(content,
				HttpResponseStatus.OK);

	}

	/**
	 * upLink
	 * 
	 * @param request
	 * @return
	 */
	// public static final HttpResponse uplink(HttpRequest request, String buf)
	// {
	// JSONObject jo = new JSONObject();
	// // 得到消息的JSON对象
	// // jo = getFullURIORPOSTData(request, buf);
	// // 将数据转换为TUBean方式
	// TUMessageBean tmb = JSONObject.parseObject(
	// getFullURIORPOSTData(request, buf).toJSONString(),
	// TUMessageBean.class);
	//
	// // 返回内容需要加载默认的Response
	// return HTTPContentUtil.getFullHttpResponse(jo.toJSONString(tmb)
	// .toString(), HttpResponseStatus.OK);
	//
	// }

	/**
	 * 上行消息
	 * 
	 * @param request
	 * @param buf
	 * @return
	 */
	public static final HttpResponse uplink(HttpRequest request, String buf) {
		String vehicleIdentifier = "";
		String vehicleIdentifierType = "";

		String content = "";
		// JSONObject.parse(text)

		// NGTPUtil.

		long begin_client_time = System.currentTimeMillis();

		NGTPRequestBean ngtprequest = parseReques4NGTPMessageBean(request,
				getRequesData(request, buf));
		ngtprequest.getNgtpMessage().setO_ngtpDispatcherData(null);
		System.out.println(JSON.toJSON(ngtprequest).toString());
		List<Entry<String, String>> postBody = new ArrayList<Map.Entry<String, String>>();
		postBody.add(new AbstractMap.SimpleEntry<String, String>(
				"071AF7C0 2C007801 220C885E 5580C098 E4120080 23590301", ""));
		String url = "http://www.baidu.com/sirun/v1/Ecall/v213/uplink";
		String key = HTTPPostClient.pushHTTPPOST(url, postBody, null);
		Object o = null;
		for (;;) {
			if (NettyChannelMap.hasProperty(key)) {
				// 得到并删除
				o = NettyChannelMap.getPropertyAndDelte(key);
				System.out.println("已经返回,key: " + key + " , value: " + o);
				break;
			}
			try {
				Thread.sleep(client_sleepScan);
				System.out.print(".");
				if (begin_client_time < System.currentTimeMillis()
						- client_waitTime) {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// o = null;

		// 返回内容需要加载默认的Response
		return hendleuplinkDSPT(o);
	}

	/**
	 * uplink的客户端返回处理
	 * 
	 * @param msg
	 * @return
	 */
	private static HttpResponse hendleuplinkDSPT(Object msg) {
		// 假如没有返回 则显示 Gateway/DSPT Timeout
		if (msg == null) {
			FullHttpResponse fhp = HTTPContentUtil.getFullHttpResponse("",
					ProxyV1ServiceHandle.UPLINKNOTRESPONSE);
			return fhp;
		}

		FullHttpResponse fhp = HTTPContentUtil.getFullHttpResponse("",
				HttpResponseStatus.OK);

		if (msg instanceof HttpResponse) {
			HttpResponse response = (HttpResponse) msg;
			fhp.setStatus(((HttpResponse) msg).getStatus());
			if (!response.headers().isEmpty()) {
				// for (String name : response.headers().names()) {
				// for (String value : response.headers().getAll(name)) {
				// fhp.headers().add()
				// sb.append("HEADER: " + name + " = " + value+"\n");
				// }
				// }
				for (String name : response.headers().names()) {
					// 导入返回的headers
					fhp.headers().set(name, response.headers().get(name));
					// fhp.headers().add(name,response.headers().get(name));
				}

			}

		}
		if (msg instanceof HttpContent) {
			HttpContent chunk = (HttpContent) msg;

			// String s = chunk.content().toString(CharsetUtil.UTF_8);
			//
			// System.out.println("SSSSSSSSSSSSSSSSSSSSSS"+s);
			io.netty.buffer.ByteBuf bf = chunk.content();
			// byte[] s = new byte[999];
			// bf.readBytes(s);
			// bf.alloc().buffer().array();
			// NGTPUtil.printByteArray(s);

			fhp.content().writeBytes(bf);
			// logger.info(chunk.content().toString(CharsetUtil.UTF_8));

		}

		return fhp;

	}

	

	/**
	 * uplink的客户端返回处理
	 * 
	 * @param msg
	 * @return
	 */
	private static HttpResponse hendledownlinkDSPT(Object msg) {
		// 假如没有返回 则显示 Gateway/DSPT Timeout
		if (msg == null) {
			FullHttpResponse fhp = HTTPContentUtil.getFullHttpResponse("",
					ProxyV1ServiceHandle.UPLINKNOTRESPONSE);
			return fhp;
		}

		FullHttpResponse fhp = HTTPContentUtil.getFullHttpResponse("",
				HttpResponseStatus.OK);

		if (msg instanceof HttpResponse) {
			HttpResponse response = (HttpResponse) msg;
			fhp.setStatus(((HttpResponse) msg).getStatus());
			if (!response.headers().isEmpty()) {
				// for (String name : response.headers().names()) {
				// for (String value : response.headers().getAll(name)) {
				// fhp.headers().add()
				// sb.append("HEADER: " + name + " = " + value+"\n");
				// }
				// }
				for (String name : response.headers().names()) {
					// 导入返回的headers
					fhp.headers().set(name, response.headers().get(name));
					// fhp.headers().add(name,response.headers().get(name));
				}

			}

		}
		if (msg instanceof HttpContent) {
			HttpContent chunk = (HttpContent) msg;

			// String s = chunk.content().toString(CharsetUtil.UTF_8);
			//
			// System.out.println("SSSSSSSSSSSSSSSSSSSSSS"+s);
			io.netty.buffer.ByteBuf bf = chunk.content();
			// byte[] s = new byte[999];
			// bf.readBytes(s);
			// bf.alloc().buffer().array();
			// NGTPUtil.printByteArray(s);
 System.out.println(".12");
			System.out.format("%08x%n",bf.getInt(0));

			fhp.content().writeBytes(bf);
			// logger.info(chunk.content().toString(CharsetUtil.UTF_8));

		}

		return fhp;

	}
	
	/**
	 * 基于NGTP消息的字节对象
	 * 
	 * @param request
	 * @param requestData
	 * @return
	 */
	private static final NGTPRequestBean parseReques4NGTPMessageBean(
			HttpRequest request, JSONObject requestData) {
		NGTPRequestBean nGTPRequestBean = new NGTPRequestBean();
		nGTPRequestBean.initNGTPRequestBean();
		String urikeys[] = request.getUri().split("\\?")[0].split("/");

		// 倒数第二个为车辆识别码
		nGTPRequestBean.setVehicleIdentifier(urikeys[urikeys.length - 2]);
		// 数据为uri/或者其他各部分的提交数据
		nGTPRequestBean.setVehicleIdentifierType(requestData
				.getString("vehicleIdentifierType"));
		// 解析编译的数据
		String nGTPMessage = null;

		// 根据目前的格式 他传输的数据被转换为 keyvalue="空"的格式
		Iterator<String> kit = requestData.keySet().iterator();
		String key = null;
		while (kit.hasNext()) {
			key = kit.next();
			if (requestData.getString(key).equals("")) {
				nGTPMessage = key;
			}
		}

		if (nGTPMessage == null) {
			//     未找到消息数据返回400
			nGTPRequestBean.setErrorCode(400);
			nGTPRequestBean
					.setErrorContent("Bad Request (InvalidInput):NGTPData Not found");
			return nGTPRequestBean;
		}

		byte[] ngtpBytes = NGTPUtil.parseHstring(nGTPMessage);
		// --消息头
		// 传输协议版本号
		nGTPRequestBean.getNgtpMessage().setTransportHeaderVersion(
				ByteUtil.subBytes(ngtpBytes, 0, 1));
		// 消息ID
		nGTPRequestBean.getNgtpMessage().setMessageID(
				ByteUtil.subBytes(ngtpBytes, 1, 2));
		// 节/段ID ，暂不知含义
		nGTPRequestBean.getNgtpMessage().setSegment(
				ByteUtil.subBytes(ngtpBytes, 2, 3));
		// --NGTP 消息头开始

		// 协议版本号
		nGTPRequestBean.getNgtpMessage().setProtocolVersion(
				ByteUtil.subBytes(ngtpBytes, 3, 4));
		// 安全Key
		nGTPRequestBean.getNgtpMessage().setSecurityContext(
				ByteUtil.subBytes(ngtpBytes, 4, 6));
		// NGTP头长度 包括消息头5长度(在确认消息的时候需要减掉)
		nGTPRequestBean.getNgtpMessage().setNgtpHeaderLength(
				ByteUtil.subBytes(ngtpBytes, 6, 7));
		// NGTP编码方式
		nGTPRequestBean.getNgtpMessage().setNgtpHeaderEncoding(
				ByteUtil.subBytes(ngtpBytes, 7, 8));

		// --开始得到DISPPTACHER 目前先不管未加密的 ,因为他们也没有涉及到(目前)

		// 长度计算为dispatchDatalength
		int dispatchDatalength = nGTPRequestBean.getNgtpMessage()
				.getNgtpHeaderLength()[0] - 5;
		// +8是因为偏移
		// 设置serviceData
		nGTPRequestBean.getNgtpMessage().setNgtpDispatcherData(
				ByteUtil.subBytes(ngtpBytes, 8, dispatchDatalength + 8));

		// 解释dspt层消息 得到serviceData
		NGTPDispatcherData decodeNgtpdspt;
		try {
			decodeNgtpdspt = (NGTPDispatcherData) NGTPUtil.parseHexToObject(
					nGTPRequestBean.getNgtpMessage().getNgtpDispatcherData(),
					new NGTPDispatcherData());

			nGTPRequestBean.getNgtpMessage().setO_ngtpDispatcherData(
					decodeNgtpdspt);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("调度层消息解释错误");
			nGTPRequestBean.setErrorCode(2001);
			nGTPRequestBean.setErrorContent(e.getMessage());
			return nGTPRequestBean;

		}
		// 开始解释serviceData
		// 期望得到一个uplink的头消息
		UplinkNGTPDispatcherData uplinkmessage = (UplinkNGTPDispatcherData) decodeNgtpdspt
				.getChosenValue();
		System.out.println(uplinkmessage.getExtension()
				.getServiceDataMessageLength().getTrueChosenValue());
		INTEGER i = (INTEGER) uplinkmessage.getExtension()
				.getServiceDataMessageLength().getTrueChosenValue();
		System.out.println(i.shortValue());
		return nGTPRequestBean;
	}

	private static final JSONObject getRequesData(HttpRequest request,
			String buf) {
		QueryStringDecoder queryStringDecoder = null;

		// 假如是get协议,则解析URI进行分析
		// 转而使用Get方式进行获取数据,查找默认字段为sirun和json的是否使用get进行传值
		if (request.getMethod().name().equals(HttpMethod.GET.name())) {
			queryStringDecoder = new QueryStringDecoder(request.getUri());
		} else {
			queryStringDecoder = new QueryStringDecoder(request.getUri() + "?"
					+ buf);
		}
		return getParM4JSON(queryStringDecoder);
	}

	private static final JSONObject getFullURIORPOSTData(HttpRequest request,
			String buf) {
		QueryStringDecoder queryStringDecoder = null;

		// 假如是get协议,则解析URI进行分析
		// 转而使用Get方式进行获取数据,查找默认字段为sirun和json的是否使用get进行传值
		if (request.getMethod().name().equals(HttpMethod.GET.name())) {
			queryStringDecoder = new QueryStringDecoder(request.getUri());
		} else {
			queryStringDecoder = new QueryStringDecoder(request.getUri() + "?"
					+ buf);
		}
		return getParM4JSON(queryStringDecoder);
	}

	private static final JSONObject getParM4JSON(
			QueryStringDecoder queryStringDecoder) {
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

	public static final HttpResponse getDownlink(HttpRequest request, String buf) {
		String vehicleIdentifier = "";
		String vehicleIdentifierType = "";

		String content = "";
		// JSONObject.parse(text)

		// NGTPUtil.

		long begin_client_time = System.currentTimeMillis();

		NGTPRequestBean ngtprequest = parseReques4NGTPMessageBean(request,
				getRequesData(request, buf));
		ngtprequest.getNgtpMessage().setO_ngtpDispatcherData(null);
		System.out.println(JSON.toJSON(ngtprequest).toString());
		List<Entry<String, String>> postBody = new ArrayList<Map.Entry<String, String>>();
		postBody.add(new AbstractMap.SimpleEntry<String, String>(
				"071AF7C0 2C007801 220C885E 5580C098 E4120080 23590301", ""));
		String url = "http://172.32.5.217/sirun/v1/Ecall/v213/downlink";
		String key = HTTPPostClient.pushHTTPPOST(url, postBody, null);
		Object o = null;
		for (;;) {
			if (NettyChannelMap.hasProperty(key)) {
				// 得到并删除
				o = NettyChannelMap.getPropertyAndDelte(key);
				System.out.println("已经返回,key: " + key + " , value: " + o);
				break;
			}
			try {
				Thread.sleep(client_sleepScan);
				System.out.print(".");
				if (begin_client_time < System.currentTimeMillis()
						- client_waitTime) {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// o = null;

		// 返回内容需要加载默认的Response
		return hendledownlinkDSPT(o);
	}

	public static final HttpResponse getNextnondeilvered(HttpRequest request) {

		Map<String, String> amap = new HashMap<String, String>();
		amap.put("json", "asd");

		String content = JSONObject.toJSON(amap).toString();

		// 返回内容需要加载默认的Response
		return HTTPContentUtil.getFullHttpResponse(content,
				HttpResponseStatus.OK);

	}

	public static final HttpResponse getAlldownlink(HttpRequest request) {
		StringBuilder buf = new StringBuilder();
		HttpObject msg = request;

		if (msg instanceof HttpRequest) {

			buf.setLength(0);
			buf.append("WELCOME TO THE WILD WILD WEB SERVER\r\n");
			buf.append("===================================\r\n");

			buf.append("VERSION: ").append(request.getProtocolVersion())
					.append("\r\n");
			buf.append("HOSTNAME: ").append(getHost(request, "unknown"))
					.append("\r\n");
			buf.append("REQUEST_URI: ").append(request.getUri())
					.append("\r\n\r\n");

			HttpHeaders headers = request.headers();
			if (!headers.isEmpty()) {
				for (Map.Entry<String, String> h : headers) {
					String key = h.getKey();
					String value = h.getValue();
					buf.append("HEADER: ").append(key).append(" = ")
							.append(value).append("\r\n");
				}
				buf.append("\r\n");
			}

			QueryStringDecoder queryStringDecoder = new QueryStringDecoder(
					request.getUri());
			Map<String, List<String>> params = queryStringDecoder.parameters();
			if (!params.isEmpty()) {
				for (Entry<String, List<String>> p : params.entrySet()) {
					String key = p.getKey();
					List<String> vals = p.getValue();
					for (String val : vals) {
						buf.append("PARAM: ").append(key).append(" = ")
								.append(val).append("\r\n");
					}
				}
				buf.append("\r\n");
			}

		}

		if (msg instanceof HttpContent) {
			HttpContent httpContent = (HttpContent) msg;

			// ByteBuf content = httpContent.content();
			// if (content.isReadable()) {
			// buf.append("CONTENT: ");
			// buf.append(content.toString(CharsetUtil.UTF_8));
			// buf.append("\r\n");
			// }

			if (msg instanceof LastHttpContent) {
				buf.append("END OF CONTENT\r\n");

				LastHttpContent trailer = (LastHttpContent) msg;
				if (!trailer.trailingHeaders().isEmpty()) {
					buf.append("\r\n");
					for (String name : trailer.trailingHeaders().names()) {
						for (String value : trailer.trailingHeaders().getAll(
								name)) {
							buf.append("TRAILING HEADER: ");
							buf.append(name).append(" = ").append(value)
									.append("\r\n");
						}
					}
					buf.append("\r\n");
				}

			}
		}
		// 返回内容需要加载默认的Response
		return HTTPContentUtil.getFullHttpResponse(buf.toString(),
				HttpResponseStatus.OK);
	}

	/**
	 * 对传入的JSON进行检查,检查是否符合JSON规范,假如符合则返回当前字符的JSON对象,否则返回Null
	 * 
	 * @param json
	 * @return
	 */
	private static final JSONObject checkBest4JSON(String json) {
		JSONObject jo = JSONObject.parseObject(json);
		return jo;

	}
}
