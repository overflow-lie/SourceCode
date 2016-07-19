package net.sirun.work.handle.servise;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import java.util.Map;

/**
 * 协议的标准传入接口<br>
 * 在消息被识别成当前协议后,会将控制权转入此接口的实现类
 * 
 * @version 0.1
 * @author jnad
 * 
 */
public interface ServiceCallInInterface {

	/**
	 * 标准传入接口 Proxy将识别协议后,将控制权转入此进行后续操作
	 * 
	 * 
	 * @param request
	 * @param requestMap
	 * @return
	 */
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap);

}
