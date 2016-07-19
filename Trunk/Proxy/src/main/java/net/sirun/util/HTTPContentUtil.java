package net.sirun.util;

import static io.netty.handler.codec.http.HttpHeaders.Names.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpResponseStatus.CONTINUE;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.util.CharsetUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 对HTTP类的一些操控工具
 * 
 * @author jnad
 * 
 */
public class HTTPContentUtil {

	private static final Map<String, String> responseTypeMap = new HashMap<String, String>();

	public static final void setresponseTypeMap() {
		responseTypeMap.put("css", "text/css");
		responseTypeMap.put("png", "image/png");
		responseTypeMap.put("jpg", "image/jpg");
		responseTypeMap.put("gif", "image/gif");
		responseTypeMap.put("js", "text/javascript");
		responseTypeMap.put("html", "text/html");

	}

	/**
	 * 创建一个返回请求的对象
	 * 
	 * @param content
	 * @param stat
	 * @return
	 */
	public static final FullHttpResponse getFullHttpResponse(String content,
			HttpResponseStatus stat) {
		// 编译整个对象
		FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, stat,
				Unpooled.copiedBuffer(content, CharsetUtil.UTF_8));

		response.headers().set("Content-Type", "text/html; charset=UTF-8");

		// Add 'Content-Length' header only for a keep-alive connection.
		response.headers().set(CONTENT_LENGTH,
				response.content().readableBytes());
		// Add keep alive header as per:
//		response.headers().set(CONNECTION, HttpHeaders.Values.KEEP_ALIVE);

		return response;
	}
	/**
	 * 重新调整HttpResponse 的内部内容 
	 * @param fhq
	 * @return
	 */
	public static final FullHttpResponse resetHttpResponse (FullHttpResponse response){
		response.headers().set("Content-Type", "text/html; charset=UTF-8");

		// Add 'Content-Length' header only for a keep-alive connection.
		response.headers().set(CONTENT_LENGTH,
				response.content().readableBytes());
		//  close this connection
		response.headers().set(CONNECTION, HttpHeaders.Values.CLOSE);
		
		return response;
	}
	

	/**
	 * 创建一个返回请求的对象
	 * 
	 * @param content
	 * @param stat
	 * @return
	 */
	public static final FullHttpResponse getFullHttpResponse(String content,
			String filetype) {
		// 编译整个对象
		FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1,
				HttpResponseStatus.OK, Unpooled.copiedBuffer(content,
						CharsetUtil.UTF_8));
		if (responseTypeMap.get(filetype) == null) {
			response.headers().set("Content-Type", "text/html; charset=UTF-8");
		} else {
			response.headers().set("Content-Type",
					responseTypeMap.get(filetype) + "; charset=UTF-8");
		}

		// Add 'Content-Length' header only for a keep-alive connection.
		response.headers().set(CONTENT_LENGTH,
				response.content().readableBytes());
		// Add keep alive header as per:
		response.headers().set(CONNECTION, HttpHeaders.Values.KEEP_ALIVE);

		return response;
	}

	/**
	 * 创建一个文件下载对象
	 * 
	 * @param content
	 * @param stat
	 * @return
	 */
	public static final FullHttpResponse getFullHttpFileResponse(
			String fileName, String filecontent) {
		// 编译整个对象
		FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1,
				HttpResponseStatus.OK, Unpooled.copiedBuffer(filecontent,
						CharsetUtil.UTF_8));

		// Add 'Content-Length' header only for a keep-alive connection.
		response.headers().set(CONTENT_LENGTH,
				response.content().readableBytes());
		// Add keep alive header as per:
		response.headers().set(CONNECTION, HttpHeaders.Values.KEEP_ALIVE);

		response.headers().set("Content-Disposition",
				"attachment;filename=" + fileName);
		response.headers().set("Content-Length",
				response.content().readableBytes());
		return response;
	}

	public static final void send100Continue(ChannelHandlerContext ctx) {
		FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1,
				CONTINUE);
		ctx.write(response);
	}
}
