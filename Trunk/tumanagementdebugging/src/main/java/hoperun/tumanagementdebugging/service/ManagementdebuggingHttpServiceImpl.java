package hoperun.tumanagementdebugging.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import hoperun.adapter.comm.util.HttpSendUtil;
import hoperun.adapter.comm.util.LangUtil;
import hoperun.adapter.comm.util.MsgDateUtil;
import hoperun.tumanagementdebugging.constant.Ring;
import hoperun.tumanagementdebugging.constant.TuDebuggingCanstant;
import hoperun.tumanagementdebugging.util.RingUtil;
import hoperun.tutransmanagement.zotye.bean.BasicServiceMonitorBean;
import hoperun.tutransmanagement.zotye.bean.RingTaskBean;
import hoperun.tutransmanagement.zotye.bean.ServiceErrorLogBean;
import hoperun.tutransmanagement.zotye.bean.ServiceHandleBean;
import hoperun.tutransmanagement.zotye.bean.TBoxBean;
import hoperun.tutransmanagement.zotye.bin.ManagmentSqlSessionFactory;
import hoperun.tutransmanagement.zotye.dao.RingInfoDao;
import hoperun.tutransmanagement.zotye.dao.ServiceErrorLogDao;
import hoperun.tutransmanagement.zotye.dao.ServiceHandleDao;
import hoperun.tutransmanagement.zotye.dao.ServiceLoginDao;
import hoperun.tutransmanagement.zotye.dao.TboxInfoDao;
import hoperun.tutransmanagement.zotye.util.FJSONUtil;
import hoperun.tutransmanagement.zotye.util.ServiceMonitorUtil;

public class ManagementdebuggingHttpServiceImpl {
	public static void main(String[] args) {
		System.out.println(TuDebuggingCanstant.getConstant().getMapProperties("ring.basicurl"));
	}
	private static final String ServiceHandleEventResultResponseBodyModelString = "{\"amount\":\"\",\"results\":[],\"head\":{\"status\":\"\",\"reason\":\"\"}}";
	private static final String RingSrvStatusResponseBodyModelString = "{\"head\":{\"reason\":\"\",\"status\":\"\"},\"ringSrvStatusList\":[{\"ringSrvAddr\":\"\",\"availableComNumbers\":\"\",\"comSum\":\"\",\"taskSum\":\"\",\"all\":\"\"}]}";
	private static final String RingSrvStatusInterFaceUrl = "http://{ipport}/call/callid/Server/status";
	private static final String RingTaskLogResponseBodyModelString = "{\"head\":{\"reason\":\"\",\"status\":\"\"},\"RingTaskLogList\":[]}";
	private static final String GetVinLikeModelString = "{\"amount\":\"\",\"head\":{\"reason\":\"\",\"status\":\"\"},\"vins\":[]}";
	private static final String GetMonitorLogModelString="{\"body\":{},\"head\":{\"status\":\"\",\"reason\":\"\"}}";
	public static final String CallResponseBodyModelString="{\"body\":{\"callId\":\"\",\"status\":\"\",\"timestamp\":\"\"},\"head\":{\"status\":\"\",\"reason\":\"\"}}";
	private static final int MaxReturnSizeServiceHandleEventResult = TuDebuggingCanstant.getConstant().getMapPropertiesByInt("MaxReturnSizeServiceHandleEventResult");
	private static final String[] ringaddr = TuDebuggingCanstant.getConstant().getMapProperties("ring.basicurl").split(",");//振铃服务器的连接地址
//	private static final String ipportRegex = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}:$\\d{1,5}";
	/**
	 * 查询bid(十进制/十六进制)/VIN绑定关系
	 * 
	 * @Title: getVinByBid
	 * @Description:
	 * @param: @param
	 *             rmap
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月11日 下午5:12:59
	 */
	public static String getVinByBid(String bid, String hex) {
		String vin = null;
		long tbox_bid = 0;
		try (SqlSession session = ManagmentSqlSessionFactory.getSession()) {
			// 判断是十进制还是十六进制
			if (isHex(bid) && "16".equals(hex)) {// 十六进制
				try {
					tbox_bid=Integer.valueOf(bid, 16);
				} catch (Exception e) {
					Preconditions.checkArgument(e == null, String.format("bid :%s格式错误", bid));
				}
			} else if("10".equals(hex)){// 十进制
				try {
					tbox_bid = Long.valueOf(bid);
				} catch (Exception e) {
					Preconditions.checkArgument(e == null, String.format("bid :%s格式错误", bid));
				}
			}
			Preconditions.checkArgument(tbox_bid != 0, String.format("bid :%s格式错误", bid));
			TBoxBean tbox = null;
			ServiceLoginDao login = session.getMapper(ServiceLoginDao.class);
			tbox = login.findOneTboxBybid(tbox_bid + "");
			Preconditions.checkArgument(tbox != null, String.format("bid :%s not found", bid));
			vin = tbox.getVin();
		}
		return vin;
	}

	/**
	 * 判断是否是十六进制
	 * 
	 * @Title: isHex
	 * @Description: bid 4个字节范围 :0-FFFFFFFF
	 * @param: @param
	 *             s
	 * @param: @return
	 * @return: boolean
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月12日 上午10:52:39
	 */
	private static boolean isHex(String s) {
		String regEx = "[0-9a-fA-F]{1,8}$";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(s);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	/**
	 * 查询登陆/注册 事件结果
	 * 
	 * @Title: getServiceHandleEventResult
	 * @Description:
	 * @param: @param
	 *             rmap
	 * @param: @param
	 *             vin
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月12日 下午2:42:33
	 */
	public static String getServiceHandleEventResult(Map<String, String> rmap, String bid) {
		JSONObject jo = JSONObject.parseObject(ServiceHandleEventResultResponseBodyModelString);
		try (SqlSession session = ManagmentSqlSessionFactory.getSession()) {
			ServiceHandleDao servicehandledao = session.getMapper(ServiceHandleDao.class);
			// 1时间段
			String endTime = rmap.get("endtime");
			String startTime = rmap.get("starttime");
			// XXX 检查日期时间格式 建议使用正则
			String timeslot = " and T.eventCreationTime<=DATE_FORMAT('{endtime}', '%Y-%m-%d %T') AND T.eventCreationTime>=DATE_FORMAT('{starttime}', '%Y-%m-%d %T')";
			String result = rmap.get("resultcode");
			String commkey = rmap.get("aid");

			if (StringUtils.isBlank(endTime) && StringUtils.isNotBlank(startTime)) {
				timeslot=" AND T.eventCreationTime>=DATE_FORMAT('{starttime}', '%Y-%m-%d %T')".replace("{starttime}", startTime);
			} else if(StringUtils.isNotBlank(endTime) && StringUtils.isBlank(startTime)){
				timeslot=" AND T.eventCreationTime<=DATE_FORMAT('{endtime}', '%Y-%m-%d %T')".replace("{endtime}", endTime);
			} else if(StringUtils.isBlank(startTime) && StringUtils.isBlank(endTime)){
				timeslot = "";
			}else {
				timeslot = timeslot.replace("{endtime}", endTime);
			    timeslot = timeslot.replace("{starttime}", startTime);
			}
			// 2执行结果
			if (StringUtils.isBlank(result)) {
				result = "";
			} else {
				result = " AND T.resultcode='{resultcode}'".replace("{resultcode}", result);
			}
			// 3bid
			if (StringUtils.isBlank(bid)) {
				bid = "";
			} else {
				bid = " and bid={bid}".replace("{bid}", bid);
			}
			// 4事件aid
			if (StringUtils.isBlank(commkey)) {
				commkey = "";
			} else {
				commkey = " AND T.commkey='{commkey}'".replace("{commkey}", "0," + commkey);
			}
			int maxReturnSize = MaxReturnSizeServiceHandleEventResult;
			String wherecondition = " 1=1" + timeslot + " and 1=1" + result + " and  1=1" + commkey + " and 1=1 " + bid
					+ " order by T.eventCreationTime desc limit " + maxReturnSize;
//			System.err.println(wherecondition);
			Map<String, String> amap = Maps.newHashMap();
			amap.put("wherecondition", wherecondition);
			List<ServiceHandleBean> lshb = servicehandledao.findByWhereCondition(amap);
			Preconditions.checkArgument((lshb != null && lshb.size() > 0)||lshb.size()==0,
					String.format("查询指定事件结果失败,bid %s", rmap.get("bid")));
//			System.err.println(lshb.size());
			FJSONUtil.setJSONValue(jo, "results", lshb);
			FJSONUtil.setJSONValue(jo, "amount", lshb.size());
			FJSONUtil.setJSONValue(jo, "head/status", 0);
			FJSONUtil.setJSONValue(jo, "head/reason", "成功");
		}
//		System.err.println(jo.toJSONString());
		String jsonStr = setJsonValue(jo);
		return replaceAll(jsonStr);
	}

	/**
	 * 将返回内容翻译
	 * 
	 * @Title: replaceAll
	 * @Description:resultCode 0--未执行 1--正在执行 2--执行完成
	 * @param: @param
	 *             s
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月12日 下午6:03:08
	 */
	private static String replaceAll(String s) {
		s = s.replaceAll("\"commKey\":\"0,1\"", getCommKey(1));
		s = s.replaceAll("\"commKey\":\"0,2\"", getCommKey(2));
		s = s.replaceAll("\"commKey\":\"0,5\"", getCommKey(5));
		s = s.replaceAll("\"commKey\":\"0,6\"", getCommKey(6));
		s = s.replaceAll("\"commKey\":\"0,7\"", getCommKey(7));

		// s = s.replaceAll("\"resultCode\":0", getResultCode(0));
		// s = s.replaceAll("\"resultCode\":1", getResultCode(1));
		// s = s.replaceAll("\"resultCode\":2", getResultCode(2));

		return s;
	}
	
	/**
	 * 设置json字符串的value值
	 * @Title:			setJsonValue 
	 * @Description:	
	 * @param:			@param jsonStr    
	 * @return:			void    
	 * @throws: 
	 * @author:			shemi
	 * @Date:			2016年1月25日 上午11:18:14
	 */
	public static String setJsonValue(JSONObject jsonObject){
		
		JSONArray jsonArr = jsonObject.getJSONArray("results");
		
		for(int index = 0; index < jsonArr.size(); index++){
			JSONObject jsonObj = jsonArr.getJSONObject(index);
			String value = jsonObj.getString("resultCode");
			switch (value) {
			case "0":
				jsonObj.put("resultCode", "未执行");
				break;
			case "1":
				jsonObj.put("resultCode", "正在执行");
				break;
			case "2":
				jsonObj.put("resultCode", "已执行");
				break;
			default:
				break;
			}
			jsonArr.set(index, jsonObj);
		}
		jsonObject.put("results", jsonArr);
		return jsonObject.toJSONString();
	}

	/**
	 * 将commkey字段翻译成文字
	 * 
	 * @Title: getCommKey
	 * @Description:
	 * @param: @param
	 *             commkey
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月12日 下午5:30:06
	 */
	private static String getCommKey(int commkey) {
		String s = null;
		switch (commkey) {
		case 1:
			s = "\"commkey\":\"注册绑定\"";
			break;
		case 2:
			s = "\"commkey\":\"登陆\"";
			break;
		case 5:
			s = "\"commkey\":\"配置读取\"";
			break;
		case 6:
			s = "\"commkey\":\"版本升级\"";
			break;
		case 7:
			s = "\"commkey\":\"配置下发\"";
			break;

		default:
			break;
		}
		return s;
	}

	/**
	 * 将resultCode字段翻译成文字
	 * 
	 * @Title: getResultCode
	 * @Description:
	 * @param: @param
	 *             resultCode
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月12日 下午5:53:42
	 */
	// private static String getResultCode(int resultCode) {
	// String s = null;
	// switch (resultCode) {
	// case 0:
	// s = "\"resultCode\":\"未执行\"";
	// break;
	// case 1:
	// s = "\"resultCode\":\"已执行,未完成\"";
	// break;
	// case 2:
	// s = "\"resultCode\":\"已完成\"";
	// break;
	// default:
	// break;
	// }
	// return s;
	// }

	/**
	 * 检测所有振铃服务器 可用性信息
	 * 
	 * @Title: getRingSrvStatus
	 * @Description: ringaddrs eg:{192.168.9.20:9081}
	 * @param: @param
	 *             rmap
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月12日 下午6:43:02
	 */
	public static String getRingSrvStatus(Map<String, String> rmap) {
		String rs = rmap.get("ringaddrs");
//		Preconditions.checkArgument(StringUtils.isNotBlank(rs), String.format("ringaddrs: %s,请正确填写振铃服务器列表", rs));
		String[] ringaddrs = null;
		try {
			if(StringUtils.isBlank(rs)){//ringaddrs参数为空查询所有的
				ringaddrs=ringaddr;
						String s="";
					    for (int i = 0; i < ringaddrs.length; i++) {
					    	s=getURL(ringaddrs[i]);
					    	ringaddrs[i]=s;
						}
			}else{
				if(rs.lastIndexOf(",")!=rs.length()){
					rs+=",";
				}
				Preconditions.checkArgument(rs.indexOf(",") > 0, String.format("ringaddrs: %s,请正确填写振铃服务器列表,使用逗号分隔!", rs));
				ringaddrs = rs.split(",");
			}
		} catch (Exception e) {
			Preconditions.checkArgument(e == null, String.format("ringaddrs: %s,请正确填写振铃服务器列表,格式错误!", rs));
		}
		JSONArray ja = new JSONArray();
		JSONObject jor = JSONObject.parseObject(RingSrvStatusResponseBodyModelString);
		for (int i = 0; i < ringaddrs.length; i++) {
			String callUrl = RingSrvStatusInterFaceUrl;
			int availableComNumbers = 0;
			int comnums = 0;
			int taskSum = 0;
			callUrl = callUrl.replace("{ipport}", ringaddrs[i]);
			JSONObject jo = null;
			HttpSendUtil.UrlInfoEntity uie = null;
			try {
				uie = HttpSendUtil.httpSend(callUrl, 5 * 1000);
			} catch (Exception e) {
				Preconditions.checkArgument(
						e == null && uie != null && uie.getResponseCode() == 200 && uie.getContent() != null,
						String.format("错误!!无法与振铃服务器-->ringaddr: %s建立连接!", ringaddrs[i]));
			}
			jo = JSONObject.parseObject(uie.getContentString().replaceAll("\\s", "").replaceAll("<br>", ""));
			Set<Entry<String, Object>> taskset = jo.getJSONObject("info").getJSONObject("task").entrySet();
			taskSum = taskset.size();
			Set<Entry<String, Object>> comset = jo.getJSONObject("info").getJSONObject("com").entrySet();
			for (Entry<String, Object> entry : comset) {
				JSONObject jo2 = JSONObject.parseObject(entry.getValue().toString());
				if (jo2.getBooleanValue("error") == false && jo2.getLongValue("phoneNum") != 0) {
					availableComNumbers++;
				}
				if (jo2.getLongValue("phoneNum") != 0) {
					comnums++;
				}
			}

			// System.err.println("当前振铃服务器:" + ringaddrs[i]);
			// System.err.println("可用串口数量:" + availableComNumbers);
			// System.err.println("串口总数:" + comnums);
			// System.err.println("任务总数:" + taskSum);
			FJSONUtil.setJSONValue(jor, "head/reason", "成功");
			FJSONUtil.setJSONValue(jor, "head/status", 0);
			Map<String, String> amap = Maps.newHashMap();
			amap.put("ringSrvAddr", ringaddrs[i]);
			amap.put("availableComNumbers", availableComNumbers + "");
			amap.put("comSum", comnums + "");
			amap.put("taskSum", taskSum + "");
			amap.put("all", null);
			ja.add(amap);
		}
		FJSONUtil.setJSONValue(jor, "ringSrvStatusList", ja);
		return jor.toJSONString();
	}

	/**
	 * 检测某个vin的振铃任务日志
	 * 
	 * @Title: getRingTaskLog
	 * @Description:
	 * @param: @param
	 *             rmap
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月13日 上午10:17:29
	 */
	public static String getRingTaskLog(Map<String, String> rmap) {
		String s = null;
		String vin = rmap.get("vin");
		// 1时间段
		String endTime = rmap.get("endtime");
		String startTime = rmap.get("starttime");
		
		// XXX 检查日期时间格式 建议使用正则
		String timeslot = " AND CI.RINGTASKTIME+0<={endtime} AND CI.RINGTASKTIME+0>={starttime}";
		if (StringUtils.isBlank(endTime) && StringUtils.isNotBlank(startTime)) {
			if(startTime.length()==19)startTime+=" 000";
			timeslot=" AND CI.RINGTASKTIME+0>={starttime}".replace("{starttime}", MsgDateUtil.getDate(startTime.replace("%20", " ")).getTime()/1000+"");
		} else if(StringUtils.isNotBlank(endTime) && StringUtils.isBlank(startTime)){
			if(endTime.length()==19)endTime+=" 000";
			timeslot=" AND CI.RINGTASKTIME+0<={endtime}".replace("{endtime}", MsgDateUtil.getDate(endTime.replace("%20", " ")).getTime()/1000+"");

		} else if(StringUtils.isBlank(startTime) && StringUtils.isBlank(endTime)){
			timeslot = "";
		}else {
			if(endTime.length()==19)endTime+=" 000";
			if(startTime.length()==19)startTime+=" 000";
			timeslot = timeslot.replace("{endtime}", MsgDateUtil.getDate(endTime.replace("%20", " ")).getTime()/1000+"");
		    timeslot = timeslot.replace("{starttime}", MsgDateUtil.getDate(startTime.replace("%20", " ")).getTime()/1000+"");
		}
		JSONObject jo = JSONObject.parseObject(RingTaskLogResponseBodyModelString);
		try (SqlSession session = ManagmentSqlSessionFactory.getSession()) {
			RingInfoDao ringInfoDao = session.getMapper(RingInfoDao.class);
			RingTaskBean rtb = new RingTaskBean();
			rtb.setVin(vin);
			rtb.setTimeslot(timeslot);
			List<RingTaskBean> rtbl = ringInfoDao.getRingTaskStatusAll(rtb);
//			rtbl = rtbl.subList(0, maxReturnSize > rtbl.size() ? rtbl.size() : maxReturnSize);
			for (int i = 0; i < rtbl.size(); i++) {
				rtbl.get(i).setTboxTimeoutperiod(null);
				rtbl.get(i).setIsactive4Tbox(null);
				rtbl.get(i).setTboxLastTboxActiveTime(null);
				rtbl.get(i).setTimeslot(null);
			}
			FJSONUtil.setJSONValue(jo, "amount", rtbl.size());
			FJSONUtil.setJSONValue(jo, "head/status", 0);
			FJSONUtil.setJSONValue(jo, "head/reason", "成功");
			FJSONUtil.setJSONValue(jo, "RingTaskLogList", rtbl);
			String regex ="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2} [0-9]{0,3}";
			List<String> vinRingSatusTime=getMatches(regex, JSONObject.toJSONString(rtbl));
			//去除ringSrvAddr的内容中时间以外的数据
			delDataOutOfTime(rtbl, vinRingSatusTime);
			regex="\"ringtaskTime\":[0-9]{10}|\"ringtaskTime\":0";
			List<String> ringtaskTimel=getMatches(regex, JSONObject.toJSONString(rtbl));
//			System.err.println(JSONObject.toJSONString(ringtaskTimel, true));
			for (int i = 0; i < ringtaskTimel.size(); i++) {
				int len=ringtaskTimel.get(i).length();
//				System.out.println(ringtaskTimel.get(i).substring(15, len>1?len:16));
				long time=Long.valueOf(ringtaskTimel.get(i).substring(15, len>1?len:16));
				ringtaskTimel.set(i, MsgDateUtil.formatDate(time));
			}
			ringtaskTime2String(rtbl, ringtaskTimel);
			s = repalceAllForRingTaskLog(JSONObject.toJSONString(jo));

		}

		return s;
	}
	/**
	 * 模糊查询vin
	 * 
	 * @Title:			getVinLike 
	 * @Description:	
	 * @param:			@param rmap
	 * @param:			@return    
	 * @return:			String    
	 * @throws: 
	 * @author:			pj
	 * @Date:			2016年1月27日 下午12:16:25
	 */
	public static String getVinLike(Map<String, String> rmap) {
		String vin = "%"+rmap.get("vinlike").trim()+"%";
		Preconditions.checkArgument(vin != null, String.format("参数vin不能为空,vin说明: 车架号的一部分连续的字符"));
		JSONObject jo = JSONObject.parseObject(GetVinLikeModelString);
		try (SqlSession session = ManagmentSqlSessionFactory.getSession()) {
			TboxInfoDao tboxInfoDao = session.getMapper(TboxInfoDao.class);
			List<String> vins= tboxInfoDao.getVinLike(vin);
			FJSONUtil.setJSONValue(jo, "amount", vins!=null?vins.size():0);
			FJSONUtil.setJSONValue(jo, "head/status", 0);
			FJSONUtil.setJSONValue(jo, "head/reason", "成功");
			FJSONUtil.setJSONValue(jo, "vins", vins);
		return JSONObject.toJSONString(jo, true);
		}
	}
	/**
	 * 查询基本服务错误监控日志
	 * @Title:			getMonitorLog 
	 * @Description:	
	 * @param:			@param rmap
	 * @param:			@return    
	 * @return:			String    
	 * @throws: 
	 * @author:			pj
	 * @Date:			2016年4月7日 上午11:39:35
	 */
	public static String getMonitorLog(Map<String, String> rmap) {
		JSONObject jo=JSONObject.parseObject(GetMonitorLogModelString);
		try (SqlSession session = ManagmentSqlSessionFactory.getSession()) {
			ServiceErrorLogDao dao=session.getMapper(ServiceErrorLogDao.class);
			String bid=rmap.get("bid");
			String serviceName=rmap.get("servicename");
			String startTime=rmap.get("starttime");
			String endTime=rmap.get("endtime");
			//XXX 防注入
			Map<String,String> map=Maps.newHashMap();
			if (StringUtils.isNotBlank(bid)) {
				map.put("bid", bid);
			}
			if (StringUtils.isNotBlank(serviceName)) {
				map.put("serviceName",serviceName);
			}
			if (StringUtils.isNotBlank(startTime)) {
				map.put("startTime",startTime);
			}
			if (StringUtils.isNotBlank(endTime)) {
				map.put("endTime", endTime);
			}
			List<BasicServiceMonitorBean> list=dao.getBasicMonitorLog(map);
			for (int i = 0; i < list.size(); i++) {//由于json中值为null的节点不显示,所以需要设置返回Body中的必填项值为空串
				BasicServiceMonitorBean basicServiceMonitorBean=list.get(i);
				if (StringUtils.isBlank(basicServiceMonitorBean.getBid())) {
					list.get(i).setBid("");
				}
				if (StringUtils.isBlank(basicServiceMonitorBean.getVin())) {
					list.get(i).setVin("");
				}
				if (StringUtils.isBlank(basicServiceMonitorBean.getErrorNumber())) {
					list.get(i).setErrorNumber("");;
				}
				if (StringUtils.isBlank(basicServiceMonitorBean.getLogRecordTime())) {
					list.get(i).setLogRecordTime("");;
				}
				if (StringUtils.isBlank(basicServiceMonitorBean.getServiceName())) {
					list.get(i).setServiceName("");;
				}
				
			}
			System.err.println(JSONObject.toJSONString(list));
			FJSONUtil.setJSONValue(jo, "head/status", 0);
			FJSONUtil.setJSONValue(jo, "head/reason", "成功");
			FJSONUtil.setJSONValue(jo, "body", list);
		}
		return JSONObject.toJSONString(jo, true);
	}
	/**
	 * 查询详细服务错误日志
	 * @Title:			getMonitorLogDetail 
	 * @Description:	
	 * @param:			@param rmap
	 * @param:			@return    
	 * @return:			String    
	 * @throws: 
	 * @author:			pj
	 * @Date:			2016年4月11日 下午1:30:53
	 */
	public static String getMonitorLogDetail(Map<String, String> rmap) {
		JSONObject jo=JSONObject.parseObject(GetMonitorLogModelString);
		try (SqlSession session = ManagmentSqlSessionFactory.getSession()) {
			ServiceErrorLogDao dao=session.getMapper(ServiceErrorLogDao.class);
			String bid=rmap.get("bid");
			String vin=rmap.get("vin");
			String serviceName=rmap.get("servicename");
			String startTime=rmap.get("starttime");
			String endTime=rmap.get("endtime");
			Preconditions.checkArgument(bid != null, String.format("bid为必填项,不能为null"));
			Preconditions.checkArgument(vin != null, String.format("vin为必填项,不能为null"));
			Preconditions.checkArgument(serviceName != null, String.format("serviceName为必填项,不能为null"));
			Preconditions.checkArgument(startTime != null, String.format("startTime为必填项,不能为null"));
			Preconditions.checkArgument(endTime != null, String.format("endTime为必填项,不能为null"));
			
			Map<String,String> map=Maps.newHashMap();
			map.put("bid", bid);
			map.put("vin", vin);
			map.put("servicename", serviceName);
			if (StringUtils.isNotBlank(startTime)) {
				map.put("startTime",startTime);
			}
			if (StringUtils.isNotBlank(endTime)) {
				map.put("endTime", endTime);
			}
			List<ServiceErrorLogBean> list=dao.getMonitorLogDetail(map);
			//翻译resultCode并赋值给resultCodeDesc
			for (ServiceErrorLogBean serviceErrorLogBean : list) {
				if (StringUtils.isBlank(serviceErrorLogBean.getResultCode())) {
					serviceErrorLogBean.setResultCodeDescription("");
				}else {
					serviceErrorLogBean.setResultCodeDescription(ServiceMonitorUtil.getResultCodeDescription(serviceErrorLogBean.getResultCode()));
				}
				
			}
			FJSONUtil.setJSONValue(jo, "head/status", 0);
			FJSONUtil.setJSONValue(jo, "head/reason", "成功");
			FJSONUtil.setJSONValue(jo, "body", list);
		}
		return JSONObject.toJSONString(jo, true);
	}
	/**
	 * managementDebugging振铃接口
	 * @Title:			call 
	 * @Description:	
	 * @param:			@param rmap
	 * @param:			@return    
	 * @return:			String    
	 * @throws: 
	 * @author:			pj
	 * @Date:			2016年4月11日 上午11:04:07
	 */
	public static String call(Map<String, String> rmap) {
		JSONObject joReturn=JSONObject.parseObject(CallResponseBodyModelString);
		String phoneNumber=rmap.get("phonenumber");
		String ringServerParams=rmap.get("ringserverparams");
		if(StringUtils.isBlank(phoneNumber)){
			FJSONUtil.setJSONValue(joReturn, "head/status", 1);
			FJSONUtil.setJSONValue(joReturn, "head/reason", "请求参数不合法");
			return JSONObject.toJSONString(joReturn, true);
		}
		String ip="";
		String port="";
		String callUrl=Ring.callByPhoneNumberIFUrl;
		if (StringUtils.isNotBlank(ringServerParams)) {
			JSONObject joRingServerParams=JSONObject.parseObject(ringServerParams);
			ip=FJSONUtil.getJSONValue(joRingServerParams, "ip",String.class);
			port=FJSONUtil.getJSONValue(joRingServerParams, "port",String.class);
			callUrl=callUrl.replace("{ip}", ip);
			callUrl=callUrl.replace("{port}", port);
			callUrl=callUrl.replace("{phoneNumber}", phoneNumber);
		}else{
			callUrl=RingUtil.getRandomRingBasicUrl(LangUtil.getRandomString(17));
			callUrl=callUrl.replace("{phone}", phoneNumber);
		}
		
		
		HttpSendUtil.UrlInfoEntity uie = null;
		try {
			uie=HttpSendUtil.httpSend(callUrl, 5 * 1000);//5秒未执行完成认为,超时
		} catch (Exception e) {
			Preconditions.checkArgument(e==null, String.format("无法连接到振铃服务器,ip: %s,port: %s", ip,port));
		}

		if(uie!=null && StringUtils.isNotBlank(uie.getContentString())){
			FJSONUtil.setJSONValue(joReturn, "head/status", "0");
			FJSONUtil.setJSONValue(joReturn, "head/reason", "成功");
			FJSONUtil.setJSONValue(joReturn, "body", JSONObject.parse(uie.getContentString()));
		}
		
		return JSONObject.toJSONString(joReturn, true);
	}
	/**
	 * 去除ringSrvAddr的内容中时间以外的数据
	 * @Title:			a 
	 * @Description:	
	 * @param:			@param rtbl
	 * @param:			@param vinRingSatusTime    
	 * @return:			void    
	 * @throws: 
	 * @author:			pj
	 * @Date:			2016年1月13日 下午2:16:03
	 */
	private static void delDataOutOfTime(List<RingTaskBean> rtbl, List<String> vinRingSatusTime) {
		String ringSrvAddr;
		for (int i = 0; i < rtbl.size() && vinRingSatusTime!=null && vinRingSatusTime.size()>0; i++) {
			ringSrvAddr=rtbl.get(i).getRingSrvAddr();
			if(!ringSrvAddr.startsWith("[")){
				continue;
			}
			ringSrvAddr=vinRingSatusTime.get(i);
			rtbl.get(i).setRingSrvAddr(ringSrvAddr);
		}
	}
	private static void ringtaskTime2String(List<RingTaskBean> rtbl, List<String> ringtaskTimel) {
		String ringtaskTime;
		for (int i = 0; i < rtbl.size() && ringtaskTimel!=null && ringtaskTimel.size()>0; i++) {
			ringtaskTime=ringtaskTimel.get(i);
			rtbl.get(i).setUuid(ringtaskTime);
		}
	}

	/**
	 * repalceAllForRingTaskLog
	 * 
	 * @Title: repalceAllForRingTaskLog
	 * @Description: vinRingStatus: awaiting--重试等待中 finished--重试结束 failed--重试失败
	 *               timeout--重试超时 recalling--重试进行中<br>
	 *               retrySum: 0--重试等待中,任务初始化,task init 1--重试第一次 2--重试第二次 3重试第三次
	 * @param: @param
	 *             s
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月13日 下午12:32:57
	 */
	private static String repalceAllForRingTaskLog(String s) {
		s = s.replaceAll("ringSrvAddr", "vinRingStatusTime");
		s = s.replaceAll(",\"ringtaskTime\":[0-9]{10}|,\"ringtaskTime\":0", "");
		s = s.replaceAll("uuid", "ringtaskTime");
		
		s = s.replaceAll("\"vinRingStatus\":\"awaiting\"", "\"vinRingStatus\":\"重试等待中\"");
		s = s.replaceAll("\"vinRingStatus\":\"finished\"", "\"vinRingStatus\":\"重试结束\"");
		s = s.replaceAll("\"vinRingStatus\":\"failed\"", "\"vinRingStatus\":\"重试失败\"");
		s = s.replaceAll("\"vinRingStatus\":\"timeout\"", "\"vinRingStatus\":\"重试超时\"");
		s = s.replaceAll("\"vinRingStatus\":\"recalling\"", "\"vinRingStatus\":\"重试进行中\"");
		
		// ringtaskTime
		return s;
	}

	/**
	 * 得到与regex匹配的字符串
	 * 
	 * @Title: getMatches
	 * @Description: String s1 = "得到与regex匹配的字符串";<br>
	 *               String regex = "[\u4E00-\u9FFF]+";<br>
	 *               String s = getMatches(regex, s1);<br>
	 *               System.err.println(s);<br>
	 * @param: @param
	 *             regex 正则
	 * @param: @param
	 *             str 原字符串
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2016年1月13日 下午1:18:08
	 */
	public static List<String> getMatches(String regex, String str) {
		List<String> s = Lists.newArrayList();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			s.add(matcher.group());
		}
		return s;
	}
	/**
	 * 提取URL
	 * 
	 * @Title: getURL
	 * @Description:
	 * @param: @return
	 * @return: String
	 * @throws:
	 * @author: pj
	 * @Date: 2015年10月29日 下午8:23:00
	 */
	public static String getURL(String s) {
		String r = null;
		Pattern p = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+):+(\\d+)");// 取得ip:port;
		Matcher m = p.matcher(s);
		while (m.find()) {
			r = m.group();
		}
		return r;
	}
}
