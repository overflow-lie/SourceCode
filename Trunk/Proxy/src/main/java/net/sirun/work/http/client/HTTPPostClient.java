package net.sirun.work.http.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.ClientCookieEncoder;
import io.netty.handler.codec.http.Cookie;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.multipart.DefaultHttpDataFactory;
import io.netty.handler.codec.http.multipart.HttpDataFactory;
import io.netty.handler.codec.http.multipart.HttpPostRequestEncoder;
import io.netty.handler.codec.http.multipart.HttpPostRequestEncoder.ErrorDataEncoderException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import sun.security.provider.MD5;
import net.sirun.bin.ProxyContorlList;
import net.sirun.queue.NettyChannelMap;
import net.sirun.util.NGTPUtil;

public class HTTPPostClient {
	private static final Logger logger = Logger.getLogger(HTTPPostClient.class
			.getName());
	private static final Bootstrap httpClient = new Bootstrap();
	private static final Bootstrap httpSsl_client = new Bootstrap();
	//扫描周期
	private static int client_sheelScan = ProxyContorlList.getPropertyForInteger("Client_sleepScan");
	//总等待周期
	private static int client_waitTime = ProxyContorlList.getPropertyForInteger("Client_waitTime");

	
	public static void initHTTPPostClient(){
		httpClient.group(ProxyContorlList.ThreadPoll.client_bossGroup)
		.channel(NioSocketChannel.class)
		.handler(new HTTPPostClientIntializer(false));
httpSsl_client.group(ProxyContorlList.ThreadPoll.client_sslbossGroup)
		.channel(NioSocketChannel.class)
		.handler(new HTTPPostClientIntializer(true));
	}

	public static void main(String sss[]) {

		logger.info("开始启动Proxy Client");
		// 初始化控制参数
		logger.info("初始化控制参数");
		ProxyContorlList.initContorlList();
		initHTTPPostClient();
		String url = null;
	 
		List<Entry<String, String>> postBody  = new ArrayList<Map.Entry<String,String>>();
//		NGTPUtil.parseHstring("071AF7C0 2C007801 220C885E 5580C098 E4120080 23590301 ")
			postBody.add(new AbstractMap.SimpleEntry<String, String>("071AF7C0 2C007801 220C885E 5580C098 E4120080 23590301",""));
			url = "http://127.0.0.1:8080/sirun/v1/Ecall/v213/uplink";
		String key = 	pushHTTPPOST(url, postBody, null);
		 for(;;){
			 if(NettyChannelMap.hasProperty(key)){
				 System.out.println("已经返回,key: " +key+" , value: "+NettyChannelMap.getProperty(key));
				 break;
			 }
			 try {
				Thread.sleep(client_sheelScan);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
			 
		 }
		
//			headers.add(new AbstractMap.SimpleEntry<String, String>(HttpHeaders.Names.REFERER,"https://passport.csdn.net/account/login"));
//			headers.add(new AbstractMap.SimpleEntry<String, String>(HttpHeaders.Names.ORIGIN,"https://passport.csdn.net"));


	}
 
	public static String pushHTTPPOST(String url,
			List<Entry<String, String>> postBody, List<Cookie> cookies) {
		URI uri;
		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			logger.log(Level.WARNING, "无法解析URL", e);
			return null;
		}

		String scheme = uri.getScheme() == null ? "http" : uri.getScheme();
		String host = uri.getHost() == null ? "localhost" : uri.getHost();
		int port = uri.getPort();
		if (port == -1) {
			if ("http".equalsIgnoreCase(scheme)) {
				port = 80;
			} else if ("https".equalsIgnoreCase(scheme)) {
				port = 443;
			}
		} else {
			// 保持host为IP/domain+port方式
//			host += ":"+port;
		}
		if (!"http".equalsIgnoreCase(scheme)
				&& !"https".equalsIgnoreCase(scheme)) {
			logger.log(Level.WARNING, "只有HTTP/HTTPS是被支持的!.");
			return null;
		}
		boolean ssl = "https".equalsIgnoreCase(scheme);
		HttpDataFactory factory = new DefaultHttpDataFactory(
				DefaultHttpDataFactory.MINSIZE); // Disk if MINSIZE exceed

		HttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1,
				HttpMethod.POST, uri.toASCIIString());

		HttpPostRequestEncoder bodyRequestEncoder = null;
		try {
			bodyRequestEncoder = new HttpPostRequestEncoder(factory, request,
					false); // flase 为 单次post
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ErrorDataEncoderException e) {
			e.printStackTrace();
		}
		// 获得消息头
		for (Entry<String, String> entry : getDefaultHeaders(host)) {
			request.headers().set(entry.getKey(), entry.getValue());
		}

		// add Form attribute
		try {
			bodyRequestEncoder.addBodyAttribute("getform", "POST");
			bodyRequestEncoder.addBodyAttribute("info", "first value");
			bodyRequestEncoder
					.addBodyAttribute("secondinfo", "secondvalue 中文&");

		} catch (NullPointerException e) {
			// should not be since not null args
			e.printStackTrace();
		} catch (ErrorDataEncoderException e) {
			// if an encoding error occurs
			e.printStackTrace();
		}
		// finalize request
		try {
			request = bodyRequestEncoder.finalizeRequest();
		} catch (ErrorDataEncoderException e) {
			// if an encoding error occurs
			e.printStackTrace();
		}

		Channel channel = null;
		try {
			if (ssl) {
				channel = httpSsl_client.connect(host, port).sync().channel();
			} else {
				channel = httpClient.connect(host, port).sync().channel();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(channel.toString());
		
		if (bodyRequestEncoder.isChunked()) {
			channel.writeAndFlush(bodyRequestEncoder).awaitUninterruptibly();
		} else {
			channel.flush();
		}
		try {
			channel.writeAndFlush(request).sync();
			// Wait for the server to close the connection.
			channel.closeFuture();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	return channel.toString();

	}

	private static void startPostClient(String url, HttpMethod httpMethod,
			List<Entry<String, String>> postBody, Cookie... cookies) {
		// Channel channel = bootstrap.connect(host, port).sync().channel();

	}

	public static void startPostClient(String url, String postBodyString) {

	}

	private static final List<Entry<String, String>> getDefaultHeaders(
			String host, Cookie... cookies) {
		List<Entry<String, String>> headers = new LinkedList<Entry<String, String>>();

		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.HOST, host));

		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.CONNECTION, HttpHeaders.Values.CLOSE));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT_ENCODING, HttpHeaders.Values.GZIP
						+ ',' + HttpHeaders.Values.DEFLATE));

		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT_CHARSET, "utf-8;q=0.7,*;q=0.7"));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT_LANGUAGE,
				"zh-CN,zh;q=0.8,en-US;q=0.6,en;q=0.4"));
//		Referer:

		// 不加前置连接
		// headers.set(HttpHeaders.Names.REFERER, uriSimple.toString());
		// 伪装chrome 30版本 浏览器
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.USER_AGENT,
				"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1588.0 Safari/537.36"));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT,
				"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"));
		if (cookies != null) {
			headers.add(new AbstractMap.SimpleEntry<String, String>(
					HttpHeaders.Names.COOKIE, ClientCookieEncoder
							.encode(cookies)));
		}

		return headers;

	}

}
