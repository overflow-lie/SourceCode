package hoperun.proxyserver.service.visitrecord;

import hoperun.loginfo.SelfLogger;
import hoperun.proxyserver.bean.HttpInfo;

/**
 * 基于Log记录当前Http访问请求信息
 * 
 * @author jnad
 * 
 */
public class LogRecordVisitServiceImpl implements IRecordVisitService {

	@Override
	public void record(HttpInfo httpInfo) {
		SelfLogger.tempParam("本次Http请求信息为:", httpInfo);

	}

}
