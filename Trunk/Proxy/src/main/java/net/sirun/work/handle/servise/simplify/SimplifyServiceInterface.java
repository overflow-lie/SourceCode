package net.sirun.work.handle.servise.simplify;

import net.sirun.work.handle.servise.ServiceCallInInterface;

/**
 * 精简接口的接口定义
 * @version 1.01
 * @author jnad
 *
 */
public interface SimplifyServiceInterface  extends ServiceCallInInterface {

	
	
	
	/**
	 * 选择器认为当前URL为独占业务 已经将控制权交出,假如返回为0 则转入callService 进行处理 独占业务的评定标准为 不可识别为
	 * non-downlink 和 getall的请求 在依次问询所有注册业务后,均不可匹配的话,则返回404
	 * 匹配是否是当前注册的URL,检查能否匹配,假如匹配成功,则返回注册ID,无法匹配则返回null
	 * 
	 * @param url
	 * @return
	 */
	public Integer matchUplinkUri(String ServiceName, String url);
	
	
}
