package net.sirun.queue;

import java.util.concurrent.ConcurrentHashMap;

import net.sirun.bean.TUBean;

/**
 * 负责维护当前Proxy负责的TU的状态<br>
 * 所有的状态消息均可通过本方法进行获得<br>
 * 主要为了获取TU使用协议版本,等信息
 * 
 * @author jnad
 * 
 */
public class TUStatusMaps {

	// 使用线程安全的 HashMap进行保存
	private static ConcurrentHashMap<String, TUBean> tubean = new ConcurrentHashMap<String, TUBean>();

	
//	public static void 
	
}