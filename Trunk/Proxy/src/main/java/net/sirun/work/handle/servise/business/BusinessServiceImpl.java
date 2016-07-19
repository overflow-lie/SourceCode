package net.sirun.work.handle.servise.business;

import java.util.Map;

import org.omg.SendingContext.RunTime;

import net.sirun.util.HTTPContentUtil;
import net.sirun.work.handle.URIDecode;
import net.sirun.work.handle.servise.BusinessServiceInterface;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.multipart.DefaultHttpDataFactory;
import io.netty.handler.codec.http.multipart.HttpDataFactory;

/**
 * 对 Proxy 业务页面的处理实现
 * 
 * @author jnad
 * 
 */

public class BusinessServiceImpl implements BusinessServiceInterface {

	private static final HttpDataFactory factory = new DefaultHttpDataFactory(
			DefaultHttpDataFactory.MINSIZE); // Disk

	@Override
	public HttpResponse routingRequest(HttpRequest request,String buf) {
		// 进行URI的匹配,假如没有匹配的 则返回null
		String keywork = matchUri(request.getUri());
		if (keywork == null) {
			return null;
		}
		// 可以考虑用动态代理来做 先这样实现
		switch (keywork) {
		case "Hello":
			return hello(request);
		case "getfreeMemory":
			return getfreeMemory(request);
		}

		return null;
	}

	@Override
	public String matchUri(String uri) {
		if (uri == null) {
			return null;
		}
		String res = null;
		String us[] = URIDecode.uriCheck(uri);
		// hello
		if (us.length > 2 && "hello".equals(us[2])) {
			// hello
			res = "Hello";
		}
		// URL 匹配模式
		if ("/getfreeMemory".equals(uri)) {
			// URL 匹配模式
			res = "getfreeMemory";
		}
		
		

		return res;
	}

 

	/**
	 * hello
	 * 
	 * @param ctx
	 * @param request
	 * @return
	 */
	private HttpResponse hello(HttpRequest request) {
		String content = "Hello";

		// 返回内容需要加载默认的Response
		return HTTPContentUtil.getFullHttpResponse(content,
				HttpResponseStatus.OK);
	}
	
	/**
	 * 获取剩余内存
	 * 
	 * @param ctx
	 * @param request
	 * @return
	 */
	private HttpResponse getfreeMemory(HttpRequest request) {
		String content = Runtime.getRuntime().freeMemory()+"";

		// 返回内容需要加载默认的Response
		return HTTPContentUtil.getFullHttpResponse(content,
				HttpResponseStatus.OK);
	}

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {

		/*
		 * 新版本,调用方法,直接转入到就旧版本进行适配,不再修改
		 */
		return routingRequest(request,null);
	}

	@Override
	public String getThisUrlFilter(){
		/*
		 * 当前方法的 url判别方式是<br>
		 * * // sirun//manage//*
		 * 
		 */
		//判别方法是正则匹配

		String url ="sirun/*";
		
		
		return url;
	}

}