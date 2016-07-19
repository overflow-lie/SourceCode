package hoperun.proxyserver.service.httppage;

import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import hoperun.loginfo.SelfLogger;
import hoperun.proxybusiness.business.ICallServiceInterface;
import hoperun.proxyserver.nettyserver.MessageHandle;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.util.CharsetUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.alibaba.fastjson.JSONObject;

/**
 * 用于测试ProxyServer Timeout性能的服务
 * 
 * @author jnad
 * 
 */
public class TimeoutTestServiceImpl implements ICallServiceInterface {
	private static ConcurrentLinkedQueue<ClientBean> queueMap = new ConcurrentLinkedQueue<ClientBean>();
	private static String fileName = "/root/x.list";
	// private static String fileName = "/Users/jnad/Downloads/x.list.log";
	private static final String filter = "^/functionaltest/.*$";
	private static final String TIMEOUT = "timeout";
	private static final String TOKEN = "token";
	private static final String SHOW = "show";
	private static final String SUBMIT = "save";

	private static final String SHOWHTML = "<html><body><form method=\"POST\" action=\"/functionaltest/\"> Please sync client and server time!{loadbody}<input type=\"submit\"/></form><script>{script}</script></body></html>";
	private static final String NULL = "";
	private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	// private long timeoutMillis = 0;
	// private long startTimeMillis = 0;
	static {
		parsingQueueTask();
	}

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {
		String timeout = getUriData(request.getUri(), requestMap, TIMEOUT);
		String token = getUriData(request.getUri(), requestMap, TOKEN);
		String show = getUriData(request.getUri(), requestMap, SHOW);
		String submit = getUriData(request.getUri(), requestMap, SUBMIT);
		// long timeoutMillis=0;
		// long startTimeMillis = 0;
		if (show != null) { // 显示页面
			final String script = "document.getElementsByName(\"token\")[0].value= (new Date().getTime()+\"\").substr(6)+(Math.random()*10E16)%(64*7E12);var stime = function (){document.getElementsByName(\"sendtime\")[0].value=new Date().getTime();};var si=setInterval(stime,100)";
			final String loadbody = "<br>token:<input size=\"35\" name=\"token\"/><br>sendtime<input name=\"sendtime\"/><br><input type=\"hidden\" value=\"" + show
					+ "\" name=\"timeout\"/>";
			return getFullHttpResponse(replaceStr(replaceStr(SHOWHTML, "script", script), "loadbody", loadbody), HttpResponseStatus.OK);
		}
		if (submit != null) {// 记录时间
			String sendtime = getUriData(request.getUri(), requestMap, "sendtime");
			String startTimeMillis = getUriData(request.getUri(), requestMap, "startTimeMillis");
			String timeoutMillis = getUriData(request.getUri(), requestMap, "timeoutMillis");
			String clientrecv = getUriData(request.getUri(), requestMap, "clientrecv");
			ClientBean cb = new ClientBean();
			if (sendtime.contains("-")) {
				// format.format("sendtime");
				try {
					System.out.println("时间已经被转换 ex:" + sendtime);
					sendtime = "" + format.parse(sendtime).getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if (clientrecv.contains("-")) {
				// format.format("sendtime");
				try {
					System.out.println("时间已经被转换 ex:" + clientrecv);
					clientrecv = "" + format.parse(clientrecv).getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			cb.setClientsend(Long.valueOf(sendtime));
			cb.setServerReceive(Long.valueOf(startTimeMillis));
			cb.setServerCallback(Long.valueOf(timeoutMillis));
			cb.setClientReceive(Long.valueOf(clientrecv));
			cb.setToken(token);
			queueMap.add(cb);
			return getFullHttpResponse("save.->" + JSONObject.toJSONString(cb), HttpResponseStatus.OK);
		}
		long startTimeMillis = 0;
		long timeoutMillis = 0;
		if (timeout == null) {
			final String script = "window.location.href='./functionaltest/show/300';";
			final String loadbody = "";
			return getFullHttpResponse(replaceStr(replaceStr(SHOWHTML, "script", script), "loadbody", loadbody), HttpResponseStatus.OK);

		} else { // 返回服务器时间
			try {
				System.out.println(Thread.currentThread().getName() + " , " + Thread.currentThread().getId());
				startTimeMillis = System.currentTimeMillis();
				timeoutMillis = startTimeMillis + Integer.valueOf(timeout) * 1000;
				whenMustOpenForSleepClose(timeoutMillis, token);// 啥时候关闭了或者超时啥时候返回
				// SelfLogger.debug( "V.T.X.1", "Connnection is successful.  " +
				// "startMillis:" + startTimeMillis + "    endMillis:" +
				// timeoutMillis);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		final String script = "document.getElementsByName(\"clientrecv\")[0].value=new Date().getTime();";
		String sendtime = getUriData(request.getUri(), requestMap, "sendtime");

		final String loadbody = "<br>token:<input size=\"35\" name = \"token\" value=\"" + token + "\"/> <br>sendtime<input value=\"" + sendtime
				+ "\" name=\"sendtime\"/><br>serverStartTimeMillis:" + startTimeMillis + "<input size=\"20\"  type=\"hidden\" name = \"startTimeMillis\" value=\""
				+ startTimeMillis + "\"/><br> timeoutMillis:" + timeoutMillis + "<input size=\"20\" type=\"hidden\" name = \"timeoutMillis\" value=\"" + timeoutMillis
				+ "\"/> <br>clientrecv <input name=\"clientrecv\" value=\"\"/> <input name=\"save\" type=\"hidden\" value=\"true\"/> ";
		return getFullHttpResponse(replaceStr(replaceStr(SHOWHTML, "script", script), "loadbody", loadbody), HttpResponseStatus.OK);

		// return getFullHttpResponse(token + "," + startTimeMillis + "," +
		// timeoutMillis, HttpResponseStatus.OK);
	}

	// private final void throwE(String token) {
	// if (true) {

	// throw new RuntimeException("Connnection is close.  " + "startMillis:" +
	// startTimeMillis + "     endMillis:" + timeoutMillis);
	// }
	// }

	private void whenMustOpenForSleepClose(long timeoutMillis, String token) {
		while (true) {
			if (!mustOpenForSleep(timeoutMillis) || !isOpenConnection()) { // 已经超时或者已经关闭通道
				SelfLogger.debug("E.X.R", Thread.currentThread().getName() +( mustOpenForSleep(timeoutMillis)?"   timeout":"  Connect close")+""+" e:" + timeoutMillis + " T:" + token);
				return;
			} else {
				sleep(1000);
			}
		}

	}

	/**
	 * 在没有超时及close情况下才会继续睡眠
	 * 
	 * @param timeoutTimeMillis
	 * @return
	 */
	private boolean mustOpenForSleep(long endTimeMillis) {

		if (endTimeMillis > System.currentTimeMillis()) {// 假如超时时间-当前时间大于超时时间则睡眠标准间隔
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 检测当前请求是否开着,假如是,那么返回true
	 * 
	 * @return
	 */
	private boolean isOpenConnection() {

		String threadName = Thread.currentThread().getName();
		Boolean b = MessageHandle.connectionMap.get(threadName);
		if (b != null) {
			return b;
		}
		return false;
	}

	private void sleep(long sleepMillis) {
		try {
			Thread.sleep(sleepMillis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 判断传入时间是否超过了当前系统时间
	 * 
	 * @param exMillisecond
	 * @return
	 */
	private boolean n_Istimeout(long exMillisecond) {
		return System.currentTimeMillis() > exMillisecond;
	}

	/**
	 * 创建一个返回请求的对象
	 * 
	 * @param content
	 * @param contentType
	 *            对象字符串
	 * @param stat
	 * @return
	 */
	public static final FullHttpResponse getFullHttpResponse(String content, HttpResponseStatus stat) {
		// 编译整个对象
		FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, stat, Unpooled.copiedBuffer(content, CharsetUtil.UTF_8));
		response.headers().set("Content-Type", "text/html");
		response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
		// Add keep alive header as per:
		// response.headers().set(CONNECTION, HttpHeaders.Values.KEEP_ALIVE);
		return response;
	}

	private String getUriData(String uri, Map<String, String> request, String typeStr) {
		/*
		 * 直接根据URL 进行分析.因为在前面已经校验过url直接截取判断
		 */
		String restr = null;
		String s[] = uri.split("\\?")[0].split("/");
		for (int i = s.length - 1; i >= 0; i--) {
			if (s[i].equalsIgnoreCase(typeStr)) {
				// 得到下一个参数
				restr = s[i + 1];
			}
		}
		if (restr == null) {
			try { // uri携带数据有可能得不到
				restr = uri.split("\\?")[1].split(typeStr)[1].split("&")[0].substring(1);
			} catch (Exception e) {
			}
		}
		if (restr == null) {
			restr = request.get(typeStr);
		}
		return restr;
	}

	/**
	 * 获取uripath上数据
	 * 
	 * @param uri
	 * @return
	 */
	private String getUriData(String uri, String typeStr) {
		return getUriData(uri, null, typeStr);
	}

	@Override
	public String getThisUrlFilter() {
		// TODO Auto-generated method stub
		return filter;
	}

	/**
	 * 根据传入的Str进行替换
	 * 
	 * @param jsonStr
	 *            需要修改的key以{key} 进行封装
	 * @param valmap
	 * @return
	 */
	public static String replaceStr(String jsonStr, String d_source, String d_desc) {

		jsonStr = jsonStr.replaceAll("\\{" + d_source + "\\}", d_desc);

		return jsonStr;
	}

	// 开去处理队列的线程
	private static void parsingQueueTask() {

		new Thread(new Runnable() {
			StringBuffer sb = new StringBuffer();

			@Override
			public void run() {
				sb.append("token,clientsend,serverreceive,servercallback,clientreceive,error \n");
				ClientBean cb = null;
				int savetag = 1;
				int sleep = 1;
				int savelen = 0;
				while (true) {
					cb = queueMap.poll();
					if (cb == null) {
						sleep++;
						sleep();
					} else { // 处理
						savetag++;
						savelen++;
						sb.append(cb.getToken() + "," + cb.getClientsend() + "," + cb.getServerReceive() + "," + cb.getServerCallback() + "," + cb.getClientReceive() + ","
								+ (cb.getError() == null ? "" : cb.getError()) + "\n");
					}
					if (savetag % 300 == 0 || sleep % 1000 == 0) {
						sleep = 1;
						savetag = 1;
						System.out.println(" 收集300行数据,或者超过30秒没有数据提交,执行保存....");

						saveStr(sb.toString());
						sb = null;
						sb = new StringBuffer();
					}

				}

			}

			/**
			 * B方法追加文件：使用FileWriter
			 */
			public void appendMethodB(String fileName, String content) {
				try {
					// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
					FileWriter writer = new FileWriter(fileName, true);
					writer.write(content);
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			private void saveStr(String str) {
				if (str != null && !str.equals(""))
					appendMethodB(fileName, str);

			}

			private void sleep() {
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		;

	}
}
