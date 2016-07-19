package net.sirun.work.handle.servise.simplify.v1;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import java.util.Map;

import net.sirun.work.handle.servise.simplify.SimplifyServiceInterface;
/**
 * 精简接口的实现类
 * @author jnad
 *
 */
public class SimplifyServiceImpl  implements SimplifyServiceInterface{

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {
		return null;
	}

	@Override
	public Integer matchUplinkUri(String ServiceName, String url) {
		return null;
	}

}
