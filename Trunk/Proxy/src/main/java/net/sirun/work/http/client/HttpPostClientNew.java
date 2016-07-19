package net.sirun.work.http.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.socket.nio.NioSocketChannel;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sirun.bean.HTTPRequestBean;
import net.sirun.bin.ProxyContorlList;
import net.sirun.queue.NettyChannelMap;

public class HttpPostClientNew {
	private static final Logger logger = Logger.getLogger(HTTPPostClient.class
			.getName());
	private static final Bootstrap httpClient = new Bootstrap();
	private static final Bootstrap httpSsl_client = new Bootstrap();
	private static int rool = 0;

	private static synchronized int getroo() {
		rool += 1;
		return rool;
	}

	public static void main(String s[]) {
		initboot();
		String url = "http://172.32.5.217/VOC_TicketSystem/newticket";
		List<Entry<String, String>> headers = new LinkedList<Entry<String, String>>();
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.AUTHORIZATION, "basic dGlhbnlhbmc6NTk0NDkz"));

		List<Entry<String, String>> cookie = new LinkedList<Entry<String, String>>();
		cookie.add(new AbstractMap.SimpleEntry<String, String>(
				"trac_form_token", "0d8d87d59f6ca50777c6d71d"));
		
		List<Entry<String, String>> postat = new LinkedList<Entry<String, String>>();
		postat.add(new AbstractMap.SimpleEntry<String, String>(
				"__FORM_TOKEN", "0d8d87d59f6ca50777c6d71d"));
		postat.add(new AbstractMap.SimpleEntry<String, String>(
				"field_summary", "namex2"));
		postat.add(new AbstractMap.SimpleEntry<String, String>(
				"submit", "Create"));

		post(url, headers, cookie,postat);

	}

	public static void main2(String s[]) {
		initboot();
		String url = "https://passport.csdn.net/ajax/accounthandler.ashx?t=log&u=u013420181&p=qaz123456&remember=0&f=http%3A%2F%2Fwww.csdn.net%2F&rand=0.24184880848042667";
		final String url2 = "http://172.32.5.217/";
		// List<Entry<String, String>> headers = new LinkedList<Entry<String,
		// String>>();
		// headers.add(new AbstractMap.SimpleEntry<String, String>(
		// HttpHeaders.Names.REFERER,
		// "https://passport.csdn.net/account/login"));
		// headers.add(new AbstractMap.SimpleEntry<String, String>(
		// HttpHeaders.Names.ORIGIN, "https://passport.csdn.net"));
		for (int i = 0; i < 999; i++) {
			// post(url, headers);

			new Thread(new Runnable() {

				@Override
				public void run() {
					int i = getroo();
					post(url2, i);
					System.out.println("------" + i);
				}
			}).start();

		}
		logger.setLevel(Level.WARNING);

	}

	private static void post(String url, List<Entry<String, String>> headers,
			List<Entry<String, String>> cookie,List<Entry<String, String>>  postAttribute) {
		// cookie = new LinkedList<Entry<String, String>>();
		// cookie.add(new AbstractMap.SimpleEntry<String, String>("stid", ""
		// + System.currentTimeMillis()));

		HTTPRequestBean hrb = new HTTPRequestBean();
		hrb.setUri(url);
		hrb.setHeaders(headers);
		hrb.setHttpMethod(HttpMethod.POST);
		hrb.setPostAttribute(postAttribute);

		push(hrb);
	}
	
	private static void post(String url, List<Entry<String, String>> headers) {
		post(url, headers, null);
	}

	private static void post(String url, List<Entry<String, String>> headers,
			List<Entry<String, String>> cookie) {
		// cookie = new LinkedList<Entry<String, String>>();
		// cookie.add(new AbstractMap.SimpleEntry<String, String>("stid", ""
		// + System.currentTimeMillis()));

		HTTPRequestBean hrb = new HTTPRequestBean();
		hrb.setUri(url);
		hrb.setHeaders(headers);
		hrb.setHttpMethod(HttpMethod.POST);

		push(hrb);
	}

	private static void post(String url, int pool) {
		// cookie = new LinkedList<Entry<String, String>>();
		// cookie.add(new AbstractMap.SimpleEntry<String, String>("stid", ""
		// + System.currentTimeMillis()));

		HTTPRequestBean hrb = new HTTPRequestBean();
		hrb.setUri(url);
		// hrb.setHeaders(headers);
		hrb.setPool(pool);
		hrb.setHttpMethod(HttpMethod.POST);

		push(hrb);
	}

	private static void initboot() {
		logger.info("开始启动Proxy Client");
		// 初始化控制参数
		logger.info("初始化控制参数");
		ProxyContorlList.initContorlList();
		httpClient.group(ProxyContorlList.ThreadPoll.client_bossGroup)
				.channel(NioSocketChannel.class)
				.handler(new HTTPPostClientIntializer(false));
		httpSsl_client.group(ProxyContorlList.ThreadPoll.client_sslbossGroup)
				.channel(NioSocketChannel.class)
				.handler(new HTTPPostClientIntializer(true));

	}

	/**
	 * 获取Post的Request
	 * 
	 * @param hrb
	 * @return
	 */
	private static HttpRequest getpushRequest(URI uri, HTTPRequestBean hrb) {
		if (uri == null) {
			logger.warning("URI 无法解析");
			return null;
		}
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
		List<Entry<String, String>> entrys = HTTPClientDefend
				.getDefaultHeaders(uri.getHost(), hrb.getCookies());
		// 将得到的头放入本次request
		for (Entry<String, String> entry : entrys) {
			request.headers().set(entry.getKey(), entry.getValue());
		}
		// 添加自定义的头
		if (hrb.getHeaders() != null) {
			for (Entry<String, String> entry : hrb.getHeaders()) {
				request.headers().set(entry.getKey(), entry.getValue());
			}
		}
		// POST模式的 Attribute 内容
		if (hrb.getPostAttribute() != null) {
			try {
				for (Entry<String, String> entry : hrb.getPostAttribute()) {
					bodyRequestEncoder.addBodyAttribute(entry.getKey(),
							entry.getValue());
				}
			} catch (ErrorDataEncoderException e) {
				logger.warning("POST 添加Attribute 错误!");
				e.printStackTrace();
			}
		}
		try {
			bodyRequestEncoder.addBodyAttribute("getform", "POST");
			request = bodyRequestEncoder.finalizeRequest();
		} catch (ErrorDataEncoderException e) {
			e.printStackTrace();
		}
		return request;

	}

	/**
	 * 开始推送
	 * 
	 * @param hrb
	 */
	public static void push(HTTPRequestBean hrb) {
		HttpRequest hr = null;
		String host;
		int port;
		boolean isssl;
		if (hrb == null) {
			return;
		}
		// 解析URI
		URI uri = checkURL(hrb.getUri());
		if (uri == null) {
			return;
		}
		if (HttpMethod.POST.equals(hrb.getHttpMethod())) {
			hr = getpushRequest(uri, hrb);
		}
		host = uri.getHost() == null ? "localhost" : uri.getHost();
		port = resetPort(uri, uri.getPort());
		isssl = "https".equalsIgnoreCase(uri.getScheme());
		pushHTTP(isssl, host, port, hr);
	}

	private static void pushHTTP(boolean ssl, String host, int port,
			HttpRequest hr) {

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
		NettyChannelMap.addProperty(channel.toString(), rool);
		System.out.print(rool);
		;
		// if (bodyRequestEncoder.isChunked()) {
		// channel.writeAndFlush(bodyRequestEncoder).awaitUninterruptibly();
		// } else {
		channel.flush();
		// }
		try {
			channel.writeAndFlush(hr).sync();
			// Wait for the server to close the connection.
			channel.closeFuture();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static URI checkURL(String url) {
		URI uri;
		try {
			uri = new URI(url);
		} catch (URISyntaxException e) {
			logger.log(Level.WARNING, "无法解析URL", e);
			return null;
		}
		String scheme = uri.getScheme() == null ? "http" : uri.getScheme();
		if (!"http".equalsIgnoreCase(scheme)
				&& !"https".equalsIgnoreCase(scheme)) {
			logger.log(Level.WARNING, "只有HTTP/HTTPS是被支持的!.");
			return null;
		}
		return uri;

	}

	private static int resetPort(URI uri, int port) {
		if (port == -1) {
			if ("http".equalsIgnoreCase(uri.getScheme())) {
				port = 80;
			} else if ("https".equalsIgnoreCase(uri.getScheme())) {
				port = 443;
			}
		}
		return port;
	}

}
