package net.sirun.work.handle.servise;

import net.sirun.bin.ProxyContorlList;
import net.sirun.work.handle.servise.ngtp.NGTPServiceInterface;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

/**
 * HTTP 接口实现文件 依靠matchUri 来标定是否当前service的规则 <br>
 * 载入新版service接口
 * 
 * @version 0.2
 * 
 * @author jnad
 * 
 */
public interface BusinessServiceInterface extends ServiceCallInInterface {

	/**
	 * @deprecated 已失效,由配置文件进行定义返回代码
	 */
	@Deprecated
	public static final String NOTFOUNT404 = ProxyContorlList.getPropertyForString("HTTP_STAT_404");

	/**
	 * 通过此接口实现请求逻辑的实际处理,为参与的返回null
	 * @deprecated 已失效,由Call service 进行实现
	 * 
	 * @param ctx
	 * @param request
	 * @return
	 */
	@Deprecated
	public HttpResponse routingRequest(HttpRequest request, String buf);

	/**
	 * 对传入的URI进行匹配,假如匹配成功则返回 内部定义的方法标识 没有匹配返回null
	 * 
	 * @deprecated 已失效
	 * @param uri
	 * @return
	 */

	@Deprecated
	public String matchUri(String uri);

	 
	/**
	 * 获取当前service的拦截器,经由判断后,发现为当前service的url,那么则转入callservice
	 * 
	 * @param url
	 * @return
	 */
	public String getThisUrlFilter();

}
