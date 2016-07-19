package net.sirun.bin;

import java.util.logging.Logger;

import net.sirun.util.HTTPContentUtil;
import net.sirun.util.ProxyClassLoader;
import net.sirun.work.http.NettyHTTPServerBoot;
import net.sirun.work.http.client.HTTPPostClient;

/**
 * Sirun Proxy 启动类
 * 
 * @author jnad
 * 
 */
public class ProxyServerBoot {
	private static final Logger logger = Logger.getLogger(ProxyServerBoot.class
			.getName());

	public static void main(String args[]) {
		logger.info("开始启动Proxy");
		// 初始化控制参数
		logger.info("初始化控制参数");
		ProxyContorlList.initContorlList();
		mainInit(args);
		logger.info("加载Proxy服务Handle");
		ProxyClassLoader.initProxyClassLoad();
		HTTPContentUtil.setresponseTypeMap();
		logger.info("加载客户端线程");
		HTTPPostClient.initHTTPPostClient();

		logger.warning("启动Proxy Http服务, 端口绑定在 :"
				+ ProxyContorlList.getPropertyForString("Proxy_Port"));

		new Thread(new NettyHTTPServerBoot()).start();

	}

	private static void mainInit(String args[]) {
		Integer v = 8080;
		if (args != null &&  args.length!=0&&args[0] != null) {
			try {
				v = Integer.valueOf(args[0]);
			} catch (Exception e) {
			}
			ProxyContorlList.addProperty("Proxy_Port", v + "");
		}
	}
}
