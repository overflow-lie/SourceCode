package net.sirun.work.handle.servise.ngtp;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import java.util.Map;

import net.sirun.bean.GetALLDownlinkBean;
import net.sirun.work.handle.servise.ServiceCallInInterface;

/**
 * 
 * NGTP接口的接口定义<br>
 * NGTP消息的具体处理的接口<br>
 * 每个协议的实现均不一样,仅作为后续版本升级时用<br>
 * 
 * 所有响应分为2种,一种为独占响应 HttpResponse 权利 下交到具体业务进行响应<br>
 * 另外一种为Proxy代理处理,不会进入将控制权给予具体业务,但是getAll 最后是由具体业务返回
 * 
 * @author jnad
 * 
 */
public interface NGTPServiceInterface  extends  ServiceCallInInterface{

	public static int downlink = 1;
	public static int alldownlink = 2;
	public static int non_downlink = 3;
	public static int uplink = 4;


	/**
	 * 选择器认为当前URL为独占业务 已经将控制权交出,假如返回为0 则转入callService 进行处理 独占业务的评定标准为 不可识别为
	 * non-downlink 和 getall的请求 在依次问询所有注册业务后,均不可匹配的话,则返回404
	 * 匹配是否是当前注册的URL,检查能否匹配,假如匹配成功,则返回注册ID,无法匹配则返回null
	 * 
	 * @param url
	 * @return
	 */
	public Integer matchUplinkUri(String ServiceName, String url);

	/**
	 * 基于当前项目已经对此独占Service进行uplink响应(not null)
	 * 
	 * @param matchID
	 * @param request
	 * @param requestMap
	 * @return
	 */

	public HttpResponse uplink(HttpRequest request,
			Map<String, String> requestMap);

	/**
	 * 基于当前项目已经对此独占Service进行uplink响应(not null)
	 * 
	 * @param matchID
	 * @param request
	 * @param requestMap
	 * @return
	 */

	public HttpResponse downlink(HttpRequest request,
			Map<String, String> requestMap);

	public HttpResponse downlink(String dataType, String vin, String vinType,
			String eventID, String messageID);

	// 处理非独占业务,有2个,为 getall downlink 和 持续获取消息

	/**
	 * 对GetAllDownlink 进行相应 本方法为同步方法,在得到消息后 进行返回.<br>
	 * 同步是为了减少系统的复杂度<br>
	 * 对于getNon来说,Proxy实现的方式是轮训获取所有实现的getall,假如有实现,那么就进行获取
	 */

	public GetALLDownlinkBean getAllDownlink(String vin, String vinType);

}
