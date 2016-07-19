package hoperun.tumanagementdebugging.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Maps;

import hoperun.tumanagementdebugging.dao.TBoxLog;

/**
 * T-Box的模拟器
 * 
 * @classname: TBoxSimulatorService.java
 * @description:
 *
 * @author: jnad
 * @version: V1.0
 * @createdate: 2016年5月15日 下午2:21:14
 */
public abstract class TBoxSimulatorService {

	// 当前服务是否开启
	private static Boolean ISOPENED = false;
	// 偏移点
	private static AtomicInteger logsAi = new AtomicInteger();
	// 静态启动配置
	private static Map<String, String> staticConfig = Maps.newConcurrentMap();
	// 运行时配置
	private static Map<String, String> runningConfig = Maps.newConcurrentMap();
	// 日志缓存
	public static Cache<String,Object> logcache = CacheBuilder.newBuilder()
			// 超时时间是8小时,最大10000条数据
			.expireAfterAccess(8, TimeUnit.HOURS).maximumSize(10_000).build();

	/**
	 * 获取日志 基于偏移点获取指定数量的log,最多500条
	 * 
	 * @Title: getlogs
	 * @Description:
	 * @param: @param
	 *             offset
	 * @param: @param
	 *             num
	 * @param: @return
	 * @return: List<Map<String,String>>
	 * @throws:
	 * @author: i
	 * @Date: 2016年5月15日 下午2:34:12
	 */
	public abstract List<TBoxLog> getlogs(int offset, int num);

	/**
	 * 获取最新的前指定数量log
	 * 
	 * @Title: getlogs
	 * @Description: 如果没有那么多,就返回全部,最多500条
	 * @param: @param
	 *             num
	 * @param: @return
	 * @return: List<Map<String,String>>
	 * @throws:
	 * @author: i
	 * @Date: 2016年5月15日 下午2:35:37
	 */
	public abstract List<TBoxLog> getlogs(int num);

	/**
	 * 开启模拟器
	 * 
	 * @Title: start
	 * @Description:
	 * @param: @param
	 *             config
	 * @return: void
	 * @throws:
	 * @author: i
	 * @Date: 2016年5月15日 下午2:36:28
	 */
	public abstract void start(Map<String, String> config);

	/**
	 * 关闭模拟器
	 * 
	 * @Title: stop
	 * @Description:
	 * @param:
	 * @return: void
	 * @throws:
	 * @author: i
	 * @Date: 2016年5月15日 下午2:36:40
	 */
	public  abstract  void stop();

	/**
	 * 更新运行时配置
	 * 
	 * @Title: runningConfig
	 * @Description:
	 * @param: @param
	 *             config
	 * @return: void
	 * @throws:
	 * @author: i
	 * @Date: 2016年5月15日 下午2:36:46
	 */
	public abstract void runningConfig(Map<String, String> config);

	/**
	 * 返回目前的配置信息
	 * 
	 * @Title: statua
	 * @Description: 包括当前状态,静态配置,运行时配置,log指针等
	 * @param: @param 
	 *             config
	 * @return: Map<String, String> 
	 * @throws:
	 * @author: i
	 * @Date: 2016年5月15日 下午2:37:10
	 */
	public abstract Map<String, Object>  status();
	
	
	public static Map<String, String> getStaticConfig() {
		return staticConfig;
	}

	public static void setStaticConfig(Map<String, String> staticConfig) {
		TBoxSimulatorService.staticConfig = staticConfig;
	}

	public static Boolean getISOPENED() {
		return ISOPENED;
	}

	public static AtomicInteger getLogsAi() {
		return logsAi;
	}

	public static Map<String, String> getRunningConfig() {
		return runningConfig;
	}

	public static Cache<String, Object> getLogcache() {
		return logcache;
	}

	public static void setISOPENED(Boolean iSOPENED) {
		ISOPENED = iSOPENED;
	}

}
