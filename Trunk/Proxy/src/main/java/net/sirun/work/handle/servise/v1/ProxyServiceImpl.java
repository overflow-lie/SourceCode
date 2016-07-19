package net.sirun.work.handle.servise.v1;

import java.util.Map;

import com.oss.asn1.BitString;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import net.sirun.util.HTTPContentUtil;
import net.sirun.work.handle.servise.BusinessServiceInterface;

/**
 * 
 * Proxy 实现服务处理类,本服务为v1版本
 * 
 * @deprecated 已删除 ,已升级为基于接口模式
 * @author jnad
 * 
 */
@Deprecated
public class ProxyServiceImpl implements BusinessServiceInterface {
	private final String path = "/sirun/v1/";
	private final String UPLINK = "uplink";
	private final String GETDOWNLINK = "getDownlink";
	private final String GETNEXTNONDEILVERED = "getNextNonDeilvered";
	private final String GETALLDOWNLINK = "getallDownlink";

	@Override
	public HttpResponse routingRequest(HttpRequest request, String buf) {
		// 进行URI的匹配,假如没有匹配的 则返回null
		String keywork = matchUri(request.getUri().split("\\?")[0]);
		System.out.println("uri:" + request.getUri() + "keywork:" + keywork);
		if (keywork == null) {
			return null;
		}
//		BitString bs = new BitString();
//		bs.setValue(arg0);
		// 可以考虑用动态代理来做 先这样实现,使用语法糖
		switch (keywork) {

		case "uplink":
			return ProxyV1ServiceHandle.uplink(request, buf);
		case "getDownlink":
			return ProxyV1ServiceHandle.getDownlink(request, buf);

		case "getNextnondeilvered":
			return ProxyV1ServiceHandle.getNextnondeilvered(request);

		case "getAlldownlink":
			return ProxyV1ServiceHandle.getAlldownlink(request);

		case "index":
			return ProxyV1ServiceHandle.v1index(request);
		case "json":
			return ProxyV1ServiceHandle.getjson(request);
		case "404":
			return HTTPContentUtil.getFullHttpResponse(NOTFOUNT404, HttpResponseStatus.NOT_FOUND);
		}

		return null;
	}

	/**
	 * 目前只校验最后的一个正确,那么就会转到相应的地方
	 * 
	 */
	@Override
	public String matchUri(String uri) {
		String[] uris = uri.split("/");
		uri = uris[uris.length - 1];

		// 发送上行消息
		if (uri.equals(UPLINK)) {
			return "uplink";
		}
		// 获取指定会话和消息ID的下行消息
		if (uri.equals(GETDOWNLINK)) {
			return "getDownlink";
		}
		// 长连接获取指定会话的指定消息
		if (uri.equals(GETNEXTNONDEILVERED)) {
			return "getNextnondeilvered";
		}
		// 获取所有会话未获取消息
		if (uri.equals(GETALLDOWNLINK)) {
			return "getAlldownlink";
		}

		if (uri.equals(path)) {
			return "index";
		}

		if (uri.equals(path + "json")) {
			return "json";
		}

		return "404";
	}

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {

		return routingRequest(request, null);
	}

	@Override
	public String getThisUrlFilter() {
		// 基于正则匹配
		String url = "";

		return url;
	}

}
