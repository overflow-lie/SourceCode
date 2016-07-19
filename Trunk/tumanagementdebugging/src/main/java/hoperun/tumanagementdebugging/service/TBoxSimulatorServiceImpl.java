package hoperun.tumanagementdebugging.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.common.collect.Maps;

import hoperun.tumanagementdebugging.dao.TBoxLog;

/**
 * T-Box的模拟器的实现类
 * 
 * @author jiaxin
 *
 */
public class TBoxSimulatorServiceImpl extends TBoxSimulatorService{
	
	private static TBoxSimulatorServiceImpl tbssi;
	
	@Override
	public List<TBoxLog> getlogs(int lastShowIndex, int num) {
	    //ConcurrentMap<String, Object> asMap = getLogcache().asMap();
		List<TBoxLog> resultList = new ArrayList<>();
		ConcurrentMap<String, Object> asMap = getLogcache().asMap();
		if(lastShowIndex < num){
			for(int i = 0;i <= lastShowIndex; i++){
				resultList.add((TBoxLog)asMap.get(i+""));
			}
			return resultList;
		}
		for(int i = lastShowIndex - num ; i <= lastShowIndex; i++){
			resultList.add((TBoxLog)asMap.get(i+""));
		}
		return resultList;
	}
	
	@Override
	public List<TBoxLog> getlogs(int lastShowIndex) {
		
		int allNum = getLogsAi().get();
		List<TBoxLog> resultList = new ArrayList<>();
		ConcurrentMap<String, Object> asMap = getLogcache().asMap();
		for(int i = lastShowIndex ; i < allNum; i++){
			resultList.add((TBoxLog)asMap.get(i+""));
		}
		
		return resultList;
	}
	
	@Override
	public void start(Map<String, String> config) {
		getLogcache().cleanUp();
		TBoxSimulator tBoxSimulator = new TBoxSimulator(config.get("ip"),config.get("port"));
		tBoxSimulator.setBid(config.get("bid"));
		new Thread(tBoxSimulator).start();
		TBoxSimulatorService.setISOPENED(true);
	}

	@Override
	public void stop() {
		if(TBoxSimulatorService.getISOPENED()){
			new Thread(new TBoxSimulator()).start();
			TBoxSimulatorService.setISOPENED(true);
		}
		getLogcache().asMap().clear();
	}

	/**
	 * 包括当前状态,静态配置,运行时配置,log指针等
	 */
	@Override
	public Map<String, Object> status() {
		Map<String,Object> statusMap = Maps.newConcurrentMap();
		statusMap.put("ISOPENED", getISOPENED());
		if(getISOPENED()){
			statusMap.put("staticConfig",getStaticConfig());
			statusMap.put("runningConfig", getRunningConfig());
			statusMap.put("lastShowIndex",getLogsAi().get());
		}
		return statusMap;
	}
	
	public static TBoxSimulatorServiceImpl getTBoxSimulatorService(){
		
		synchronized(TBoxSimulatorServiceImpl.class){
			if(tbssi==null){
				tbssi = new TBoxSimulatorServiceImpl();
			}
		}
		return tbssi;
	}

	@Override
	public void runningConfig(Map<String, String> config) {
		
	}

}
