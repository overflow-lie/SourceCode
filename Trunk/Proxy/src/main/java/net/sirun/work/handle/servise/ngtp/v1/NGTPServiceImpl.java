package net.sirun.work.handle.servise.ngtp.v1;

import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import java.util.Map;

import net.sirun.bean.GetALLDownlinkBean;
import net.sirun.bin.ProxyContorlList;
import net.sirun.work.handle.servise.ngtp.NGTPServiceInterface;

/**
 * Proxy 对NGTP协议的实现
 * 
 * @version 1.01
 * @NGTPVersion 3-8
 * @DSPTVersion 3.2
 * @author jnad
 * 
 */
public class NGTPServiceImpl implements NGTPServiceInterface {

	private final boolean CASESENSITIVE = ProxyContorlList
			.getProperty("Proxy_URI_casesensitive").toString().toUpperCase()
			.equals("TRUE");
	private final String BASEURL = ProxyContorlList
			.getPropertyForString("Proxy_baseURL");
	private final Integer BASEURLHEARTNUM = BASEURL.split("/").length;

	/**
	 * 实现的接口
	 */
	private final static int downlink = 1;
	private final static int alldownlink = 2;
	private final static int not_downlink = 3;
	private final static int uplink = 4;

	private final static String evntHaeat = "NG";

	/**
	 * 检查url符合基本的规则,基本规则基于所有通用的协议
	 * 
	 * @return
	 */
	private boolean matchBaseRoules(String uris[]) {

		//
		//
		// //设置是否区分大小写
		// // url = CASESENSITIVE?url:url.toUpperCase();
		// String uri = url.split("\\?")[0];
		// String [] uris=uri.split("/");
		//
		//
		//
		//
		//
		// /**
		// * 标签 downlink
		// * 格式
		// {BASEURL}/datatype/{dataType}/vehicles/{vehicleIdentifier}/events/N{eventId}/downlink/{messageId}
		// *
		// */
		// if(uris.length==8&& matchBaseRoules(uris) ){
		// if(CASESENSITIVE){
		// if(uris[BASEURLHEARTNUM+6].equals("downlink")&&uris[BASEURLHEARTNUM+5].length()>2&&uris[BASEURLHEARTNUM+5].substring(0,
		// 2).equals("NG")){
		// return 1;
		// }
		// }else{
		// if(uris[BASEURLHEARTNUM+6].equalsIgnoreCase("downlink")&&uris[BASEURLHEARTNUM+5].length()>2&&uris[BASEURLHEARTNUM+5].substring(0,
		// 2).equalsIgnoreCase("NG")){
		// return 1;
		// }
		// }
		//
		// }
		// /**
		// * 标签 Get All Non-Delivered Downlink
		// * 内容获取所有尚未获取的消息的事件编号和消息ID
		// * 格式 /datatype/{dataType}/vehicles/{vehicleIdentifier}/events
		// *
		// */
		// if(uris.length==8&& matchBaseRoules(uris) ){
		// if(CASESENSITIVE){
		// if(uris[BASEURLHEARTNUM+4].equals("downlink")){
		// return 1;
		// }
		// }else{
		// if(uris[BASEURLHEARTNUM+4].equalsIgnoreCase("DOWNLINK")){
		// return 1;
		// }
		// }
		//
		// }

		if (CASESENSITIVE) {
			if (uris[0].equals("datatype") && uris[2].equals("vehicles")) {
				return true;
			}
		} else {
			if (uris[0].equalsIgnoreCase("DATATYPE")
					&& uris[2].equalsIgnoreCase("VEHICLES")) {
				return true;
			}
		}

		return false;
	}

	@Override
	public Integer matchUplinkUri(String ServiceName, String url) {

		return null;
	}

	@Override
	public HttpResponse uplink(HttpRequest request,
			Map<String, String> requestMap) {
		return null;
	}

	@Override
	public HttpResponse downlink(HttpRequest request,
			Map<String, String> requestMap) {
		return null;
	}

	@Override
	public HttpResponse downlink(String dataType, String vin, String vinType,
			String eventID, String messageID) {
		return null;
	}

	@Override
	public GetALLDownlinkBean getAllDownlink(String vin, String vinType) {
		
		
		return null;
	}

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {
		// TODO NGTP协议的传入方法
		return null;
	}
}
