package net.sirun.work.handle.servise.business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

import net.sirun.bin.ProxyContorlList;
import net.sirun.util.HTTPContentUtil;
import net.sirun.work.handle.URIDecode;
import net.sirun.work.handle.servise.BusinessServiceInterface;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;

/**
 * 对Proxy内部文件的处理类
 * 
 * @author jnad
 * 
 */
public class FileBusinessServiceImpl implements BusinessServiceInterface {
	private static final String f = File.separator;

	@Override
	public HttpResponse routingRequest(HttpRequest request,String buf) {
		String[] us = URIDecode.uriCheck(request.getUri());
		String content = null;
		if (us == null) {

		}
		// 地址匹配模式
		StringBuffer sb = new StringBuffer();
		sb.append(System.getProperty("user.dir") + f + "WebContent");
		for (String s : us) {
			if (!s.equals("")) {
				sb.append(f + s);
			}
		}
		if (us.length == 0) {
			// 判断为结束 / 那么就加上一个index.html
			sb.append(f + "index.html");
		}
		content = fileLoad(sb.toString());
		if (content != null) {
			return HTTPContentUtil.getFullHttpResponse(content,
					URIDecode.getUriFileType(sb.toString()));
		}
		return HTTPContentUtil.getFullHttpResponse(NOTFOUNT404,
				HttpResponseStatus.NOT_FOUND);
	}

	@Override
	public String matchUri(String uri) {
		return null;
	}
 

	private static String fileLoad(String path) {
		// System.out.println(path);
		return readTxtFile(path);

	}

	public static String readTxtFile(String filePath) {
		StringBuffer sb = new StringBuffer();
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file));// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					sb.append(lineTxt + "\r\n");
				}
				read.close();
				return sb.toString();
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {
		return null;
	}

	@Override
	public String getThisUrlFilter() {
		//通配符 所有的 都拦截
		String url="*/*";
		return url;
	}

}
