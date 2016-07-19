package hoperun.proxyserver.bin;

import hoperun.proxyserver.nettyserver.NettyHTTPServer;
import hoperun.proxyserver.nettyserver.ProxyServiceLoader;

import java.util.logging.Logger;

/**
 * Proxy Server 引导入口,启动类
 * 
 * @author jnad
 * 
 */
public class ProxyServerBootstrap {

	private static final Logger logger = Logger.getLogger(ProxyServerBootstrap.class.getName());

	public static void main(String args[]) {
		// mainInit(args);
		begin();
	}

	public static void begin() {
		logger.info("开始启动Proxy");
		// 初始化控制参数
		logger.info("初始化控制参数");
		ProxyConstant.initContorlList();
		logger.info("初始化 business service业务类");
		if (!ProxyServiceLoader.loadService()) {
			logger.warning("无法启动Proxy: Service 业务类无法载入或载入不完全");
			return;
		}
		logger.info("初始化 访问日志记录");
		if (!ProxyServiceLoader.loadVisitService()) {
			logger.warning("无法启动Proxy: 访问日志记录 类无法载入");
			return;
		}

		logger.warning("启动Proxy Http服务, 端口绑定在 :" + ProxyConstant.getPropertyForString("Proxy_Port"));
		new Thread(new NettyHTTPServer()).start();

	}

	private static void mainInit(String args[]) {
		Integer v = 8080;
		if (args != null && args.length != 0 && args[0] != null) {
			try {
				v = Integer.valueOf(args[0]);
			} catch (Exception e) {
			}
			ProxyConstant.addProperty("Proxy_Port", v + "");
		}
	}

}
