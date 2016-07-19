package hoperun.proxyserver.nettyserver;

import hoperun.proxyserver.bin.ProxyConstant;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoop;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import hoperun.util.*;

/**
 * 负责启动Netty HTTP服务
 * 
 * @author jnad
 * 
 */
public class NettyHTTPServer implements Runnable {
	private static final InternalLogger logger = InternalLoggerFactory.getInstance(NettyHTTPServer.class);

	@Override
	public void run() {
		logger.debug("Starting Netty HTTP Server port in: " + ProxyConstant.getPropertyForString("Proxy_Port"));
		try {
			new HttpSnoopServer(StringUtil.toInt(ProxyConstant.getPropertyForString("Proxy_Port"))).run();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
