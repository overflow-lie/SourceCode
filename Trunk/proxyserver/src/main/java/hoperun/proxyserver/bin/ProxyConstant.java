package hoperun.proxyserver.bin;

import hoperun.proxybusiness.business.ICallServiceInterface;
import hoperun.proxyserver.service.visitrecord.IRecordVisitService;
import hoperun.proxyserver.util.PropertiesUtil;
import hoperun.util.StringUtil;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Proxy 运行参数的集中类,本服务的所有共性配置均使用此方法进行获取</br>
 * 
 * 读取配置文档,或者查找配置
 * 
 * @author jnad
 * 
 */

public class ProxyConstant {
	private final static String proxyProperties = "proxy.properties";

	/**
	 * 处理服务的线程池
	 * 
	 * @author jnad
	 * 
	 */
	public final static class ThreadPoll {
		// 服务端线程池
		public static EventLoopGroup bossGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyConstant.getPropertyForString("Proxy_bossThreadNum")));
		public static EventLoopGroup workerGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyConstant.getPropertyForString("Proxy_workThreadNum")));
		public static ExecutorService handleGroup = Executors.newCachedThreadPool();

	}

	public final static class WorkClass {
		@Deprecated
		public static final Map<String, ICallServiceInterface> SERVICECLASS = new HashMap<String, ICallServiceInterface>();
		// service 实现类存放地
		public static final List<ICallServiceInterface> SERVICELIST = new ArrayList<ICallServiceInterface>();

		public static  IRecordVisitService RECORDVISITSERVICE = null;

	}

	// 所有控制属性列表保存地址
	private static Map<String, Object> consoleMap = null;

	/**
	 * 用于初始化整个参数列表
	 */
	public static void initContorlList() {
		// 读取内置的默认配置信息
		getconsolelist();
		// 使用配置信息进行覆盖
		loadProertiesConstant();

	}

	/**
	 * 读取配置文件内的信息
	 */
	private static void loadProertiesConstant() {
		Properties pu = PropertiesUtil.loadProperties(proxyProperties);

		//  存入默认配置信息
		// Netty接待线程
		addProperty("Proxy_Port", pu.getProperty("Proxy.Port", "8080"));
		// Netty Boss 线程数
		addProperty("Proxy_bossThreadNum", pu.getProperty("Proxy.bossThreadNum", "6"));
		// 是否开启HTTPS模式
		addProperty("Proxy_SSL", pu.getProperty("Proxy.SSL", "false"));
		// 接待线程
		addProperty("Proxy_workThreadNum", pu.getProperty("Proxy.workThreadNum", "80"));
		// 处理线程数
		addProperty("Proxy_handleThreadNum", pu.getProperty("Proxy.handleThreadNum", "600"));
		// Proxy模式
		addProperty("Proxy_debug", pu.getProperty("Proxy.debug", "debug"));
		addProperty("HTTP_STAT_404", pu.getProperty("HTTP.STAT.404"));
		addProperty("HTTP_STAT_500", pu.getProperty("HTTP.STAT.500"));

		addProperty("Html_Enabled", pu.getProperty("Html.Enabled"));
		addProperty("Html_Namespace", pu.getProperty("Html.Namespace"));
		addProperty("Html_DirectoryDefaultPage", pu.getProperty("Html.DirectoryDefaultPage"));

		addProperty("Class_LoadPath", pu.getProperty("Class_LoadPath", ""));

		addProperty("Proxy_RecordVisitPath", pu.getProperty("Proxy.RecordVisitPath", "hoperun.proxyserver.service.visitrecord.LogRecordVisitServiceImpl"));

	}

	/**
	 * 获取控制信息
	 */
	@Deprecated
	private static void getconsolelist() {
		consoleMap = consoleMap == null ? new HashMap<String, Object>() : consoleMap;

		// 是否区分大小写
		addProperty("Proxy_URI_casesensitive", "true");

		addProperty("Proxy_TransASN_2ndValue", "enum");
	}

	/**
	 * 获取指定key的属性信息
	 * 
	 * @param key
	 * @return
	 */
	public static Object getProperty(String key) {
		if (consoleMap == null) {
			ProxyConstant.initContorlList();
		}

		return consoleMap.get(key);
	}

	/**
	 * 获取指定key的String类型属性信息
	 * 
	 * @param key
	 * @return
	 */
	public static String getPropertyForString(String key) {
		Object o = getProperty(key);
		if (o == null) {

			return null;
		}
		return o.toString();
	}

	/**
	 * 获取指定key的Integer 类型属性信息
	 * 
	 * @param key
	 * @return
	 */
	public static Integer getPropertyForInteger(String key) {
		String o = getPropertyForString(key);
		if (o == null) {
			return null;
		}
		return Integer.valueOf(o);
	}

	/**
	 * 保存新增配置信息
	 * 
	 * @param key
	 * @param val
	 */
	public static void addProperty(String key, Object val) {
		consoleMap.put(key, val);
	}

	/**
	 * 保存新增配置信息
	 * 
	 * @param key
	 * @param val
	 */

	public static void addProperty(String key, String val) {
		consoleMap.put(key, val);
	}
}
