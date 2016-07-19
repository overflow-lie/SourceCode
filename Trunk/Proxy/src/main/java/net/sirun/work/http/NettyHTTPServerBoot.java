package net.sirun.work.http;

import net.sirun.bin.ProxyContorlList;
import net.sirun.util.StringUtil;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoop;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * 负责启动Netty HTTP服务
 * 
 * @author jnad
 * 
 */
public class NettyHTTPServerBoot implements Runnable {
	private static final InternalLogger logger = InternalLoggerFactory
			.getInstance(NettyHTTPServerBoot.class);

	@Override
	public void run() {
		logger.debug("Starting Netty HTTP Server port in: "
				+ ProxyContorlList.getPropertyForString("Proxy_Port"));
		try {
			new HttpSnoopServer(StringUtil.toInt(ProxyContorlList
					.getPropertyForString("Proxy_Port"))).run();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
