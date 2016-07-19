package net.sirun.queue;

import java.util.HashMap;
import java.util.Map;

public class NettyChannelMap {

	private static Map<String, Object> channelMap = new HashMap<String, Object>();

	/**
	 * 获取指定key的属性信息
	 * 
	 * @param key
	 * @return
	 */
	public static Object getProperty(String key) {

		return channelMap.get(key);
	}
	
	
	

	/**
	 * 获取指定key的属性信息
	 * 
	 * @param key
	 * @return
	 */
	public static Object getPropertyAndDelte(String key) {
		Object o = channelMap.get(key);
		deleteKey(key);
		return o;
	}
	/**
	 * 查看当前通道是否有值
	 * @param key
	 * @return
	 */
	
	
	public static boolean hasProperty(String key){
		
		if(channelMap.get(key)!=null){
			return true;
		}
		return false;
		
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

	public static void deleteKey(String key ){
		channelMap.remove(key);
	}
	
	/**
	 * 保存新增配置信息
	 * 
	 * @param key
	 * @param val
	 */
	public static void addProperty(String key, Object val) {
		channelMap.put(key, val);
	}

	/**
	 * 保存新增配置信息
	 * 
	 * @param key
	 * @param val
	 */

	public static void addProperty(String key, String val) {
		channelMap.put(key, val);
	}
}
