package hoperun.tumanagementdebugging.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import hoperun.proxybusiness.business.ICallServiceInterface;
import hoperun.tumanagementdebugging.dao.TBoxLog;
import hoperun.tutransmanagement.zotye.util.HttpUtil;
import hoperun.tutransmanagement.zotye.util.HttpUtil.HttpResponseContentType;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;

/**
 * Http版本 T-Box模拟器
 * 
 * @classname: TBoxSimulatorHttpService.java
 * @description:
 *
 * @author: jnad
 * @version: V1.0
 * @createdate: 2016年5月15日 下午2:09:43
 */
public class TBoxSimulatorHttpService implements ICallServiceInterface {
	private final String filter = "^/zotyeSimulator/v2/.*";

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {

		try {
			String serviceName = getUriData(request.getUri(), "v2");
			switch (serviceName) {
			case "start":
				return start(requestMap);
			case "status":
				return status(requestMap);
			case "stop":
				return stop(requestMap);
			case "log":
				return log(requestMap);
			case "config":
				return config(requestMap);
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return returnProxyResponse("服务器产生了以下错误: " + e.getMessage(), HttpResponseStatus.valueOf(500));
		}

		return returnProxyResponse("未知的命令", HttpResponseStatus.valueOf(404));
	}

	/**
	 * 开启模拟器
	 * 
	 * @Title: start
	 * @Description: 需要IP,port 以及静态配置信息
	 * @param: @param
	 *             request
	 * @param: @return
	 * @return: HttpResponse
	 * @throws:
	 * @author: jnad
	 * @Date: 2016年5月15日 下午2:14:19
	 */
	public HttpResponse start(Map<String, String> request) {
		
		Map<String,String> map =  Maps.newConcurrentMap();
		Map<String,Object> resultMap = new HashMap<>();
		//判断是否已经开启 如果开启返回最新20条日志
		if(TBoxSimulatorServiceImpl.getISOPENED()){
			List<TBoxLog> logs = TBoxSimulatorServiceImpl.getTBoxSimulatorService().getlogs(TBoxSimulatorService.getLogsAi().get(),20);
			resultMap.put("logs", logs);
			resultMap.put("logs.lastShowIndex",TBoxSimulatorService.getLogsAi().get());
			return HttpUtil.getFullHttpResponse(JSONObject.toJSON(resultMap), HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
		}
		
		String bid = request.get("bid");
		String ip = request.get("ip");
		String port = request.get("port");
		
		if(ip==null||port==null||bid==null){
			resultMap.put("status","!OK");
			resultMap.put("errorMsg", "请输入完整信息");
			return returnProxyResponse(JSONObject.toJSON(resultMap),HttpResponseStatus.OK );
		}
		
		if (bid != null && ip != null && port != null) {
			map.put("bid", bid);
			map.put("ip", ip);
			map.put("port", port);
		}
		
//		String numStr = request.get("num");
//		int num = 10;
//		try{
//			num = Integer.parseInt(numStr);
//		}catch(Exception e){
//		}

//		List<TBoxLog> logs = TBoxSimulatorServiceImpl.getTBoxSimulatorService().getlogs(num);
//		resultMap.put("logs", logs);
//		
		TBoxSimulatorServiceImpl.setStaticConfig(map);
		TBoxSimulatorServiceImpl.getTBoxSimulatorService().start(TBoxSimulatorServiceImpl.getStaticConfig());
		return HttpUtil.getFullHttpResponse(JSONObject.toJSON(resultMap), HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
	}

	/**
	 * 关闭模拟器
	 * 
	 * @Title: stop
	 * @Description:
	 * @param: @param
	 *             request
	 * @param: @return
	 * @return: HttpResponse
	 * @throws:
	 * @author: jnad
	 * @Date: 2016年5月15日 下午2:14:19
	 */
	public HttpResponse stop(Map<String, String> request) {
		Map<String,Object> resultMap = Maps.newConcurrentMap();
		TBoxSimulatorServiceImpl.getTBoxSimulatorService().stop();
		return HttpUtil.getFullHttpResponse(resultMap, HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
	}

	/**
	 * 获取模拟器当前状态
	 * 
	 * @Title: status
	 * @Description:
	 * @param: @param
	 *             request
	 * @param: @return
	 * @return: HttpResponse
	 * @throws:
	 * @author: jnad
	 * @Date: 2016年5月15日 下午2:14:19
	 */
	public HttpResponse status(Map<String, String> request) {
		Map<String,Object> resultMap = Maps.newConcurrentMap();
			Map<String,Object> statusMap= TBoxSimulatorServiceImpl.getTBoxSimulatorService().status();
			resultMap.put("status", statusMap);
		if(TBoxSimulatorServiceImpl.getISOPENED()){
			return HttpUtil.getFullHttpResponse(JSONObject.toJSON(resultMap), HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
		}
		return HttpUtil.getFullHttpResponse(JSONObject.toJSON(resultMap), HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
	}

	/**
	 * 配置模拟器相关运行时参数信息
	 * 
	 * @Title: status
	 * @Description:
	 * @param: @param
	 *             request
	 * @param: @return
	 * @return: HttpResponse
	 * @throws:
	 * @author: jnad
	 * @Date: 2016年5月15日 下午2:14:19
	 */
	public HttpResponse config(Map<String, String> request) {

		return HttpUtil.getFullHttpResponse("", HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
	}

	/**
	 * 获取模拟器Log
	 * 
	 * @Title: log
	 * @Description:
	 * @param: @param
	 *             request
	 * @param: @return
	 *             isopened,isclosed及相关配置信息
	 * @return: HttpResponse
	 * @throws:
	 * @author: jnad
	 * @Date: 2016年5月15日 下午2:14:19
	 */
	public HttpResponse log(Map<String, String> request) {
		
		Map<String,Object> resultMap = Maps.newConcurrentMap();
		
		if(!TBoxSimulatorServiceImpl.getISOPENED()){
			return returnProxyResponse("模拟器已经关闭: ", HttpResponseStatus.valueOf(500));
		}
		
		String firstLoadStr = request.get("firstLoad");
		Boolean firstLoad = false;
		int lastShowIndex = 0;
		try{
			firstLoad = Boolean.parseBoolean(firstLoadStr);
			String lastShowIndexStr = request.get("lastShowIndex");
			lastShowIndex = Integer.parseInt(lastShowIndexStr);
		}catch(Exception e){
		}
		if(firstLoad){
			String numStr = request.get("num");
			int num = 20;
			try {
				num = Integer.parseInt(numStr);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			List<TBoxLog> logs = TBoxSimulatorServiceImpl.getTBoxSimulatorService().getlogs(lastShowIndex,num);
			resultMap.put("logs", logs);
			resultMap.put("logs.lastShowIndex",TBoxSimulatorService.getLogsAi().get());
			return HttpUtil.getFullHttpResponse(JSONObject.toJSON(resultMap), HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
		}
		List<TBoxLog> logs = TBoxSimulatorServiceImpl.getTBoxSimulatorService().getlogs(lastShowIndex);
		
		resultMap.put("logs", logs);
		resultMap.put("logs.lastShowIndex",TBoxSimulatorService.getLogsAi().get());
		//更新显示索引
		//TBoxLog.setLastShowIndex(TBoxSimulatorService.getLogsAi().get());
		return HttpUtil.getFullHttpResponse(JSONObject.toJSON(resultMap), HttpResponseContentType.proxy_json, HttpResponseStatus.OK);
	}

	@Override
	public String getThisUrlFilter() {
		return filter;
	}

	private FullHttpResponse returnProxyResponse(Object content, HttpResponseStatus stat) {
		return HttpUtil.getFullHttpResponse(content, HttpResponseContentType.proxy_json, stat);
	}

	private String getUriData(String uri, String dataTypeStr) {
		String s[] = uri.split("\\?")[0].split("/");
		for (int i = s.length - 1; i >= 0; i--) {
			if (s[i].equalsIgnoreCase(dataTypeStr)) {
				// 得到下一个参数
				return s[i + 1];
			}
		}
		return null;
	}
}
