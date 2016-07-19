package hoperun.proxyserver.service.visitrecord;

import hoperun.proxyserver.bean.HttpInfo;

/**
 * 请求记录接口,Http server会将每次请求信息都会转入此方法
 * 
 * @author jnad
 * 
 */
public interface IRecordVisitService {

	public void record(HttpInfo httpInfo);

}
