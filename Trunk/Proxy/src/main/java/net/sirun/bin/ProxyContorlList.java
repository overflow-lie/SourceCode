package net.sirun.bin;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.sirun.util.StringUtil;
import net.sirun.work.handle.servise.BusinessServiceInterface;

/**
 * Proxy 运行参数的集中类,本服务的所有共性配置均使用此方法进行获取</br>
 * 
 * 读取配置文档,或者查找配置
 * 
 * @author jnad
 * 
 */

public class ProxyContorlList {

	/**
	 * 处理服务的线程池
	 * 
	 * @author jnad
	 * 
	 */
	public static final class ThreadPoll {

		public static EventLoopGroup bossGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyContorlList.getPropertyForString("Proxy_workThreadNum")));
		public static EventLoopGroup workerGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyContorlList.getPropertyForString("Proxy_workThreadNum")));
		public static EventLoopGroup handleGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyContorlList.getPropertyForString("Proxy_handleThreadNum")));

		public static EventLoopGroup client_bossGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyContorlList.getPropertyForString("Proxy_workThreadNum")));
		public static EventLoopGroup client_sslbossGroup = new NioEventLoopGroup(StringUtil.toInt(ProxyContorlList.getPropertyForString("Proxy_handleThreadNum")));

	}

	public static final class WorkClass {
		public static final Map<String, BusinessServiceInterface> SERVICECLASS = new HashMap<String, BusinessServiceInterface>();
	}

	// 所有控制属性列表保存地址
	private static Map<String, Object> consoleMap = null;

	/**
	 * 用于初始化整个参数列表
	 */
	public static void initContorlList() {
		getconsolelist();
	}

	/**
	 * 获取控制信息
	 */
	private static void getconsolelist() {
		consoleMap = consoleMap == null ? new HashMap<String, Object>() : consoleMap;
		// Netty接待线程
		addProperty("Proxy_Port", "8080");
		// Netty Boss 线程数
		addProperty("Proxy_workThreadNum", "6");
		// 是否开启HTTPS模式
		addProperty("Proxy_SSL", "false");
		// 接待线程
		addProperty("Proxy_workThreadNum", "60");
		// 处理线程数
		addProperty("Proxy_handleThreadNum", "600");
		// Proxy模式
		addProperty("Proxy_debug", "debug");
		// URI ServiceName
		addProperty("URI_serviceName", "sirun");
		// Proxy 的类加载器地址,按顺序进行查找
		addProperty("Class_LoadPath",
				new String[] { System.getProperty("user.dir") + File.separator + "build" + File.separator + "classes" + File.separator,
						System.getProperty("user.dir") + File.separator + "classes" + File.separator });

		addProperty("HTTP_STAT_404", "	404 Not found <br> SiRun Web Server 0.2 ");
		addProperty("Proxy_handle_serviceClass", new String[] { "net.sirun.work.handle.servise.v1.ProxyServiceImpl" });
		// 同步返回客户端延迟读取周期
		addProperty("Client_sleepScan", "10");
		// 同步客户端线程等待时间
		addProperty("Client_waitTime", "60000");

		// 是否区分大小写
		addProperty("Proxy_URI_casesensitive", "False");
		addProperty("Proxy_baseURL", "sirun/");

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
			ProxyContorlList.initContorlList();
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
