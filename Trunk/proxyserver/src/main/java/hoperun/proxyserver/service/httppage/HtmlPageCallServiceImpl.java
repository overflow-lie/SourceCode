package hoperun.proxyserver.service.httppage;

import hoperun.loginfo.SelfLogger;
import hoperun.proxybusiness.business.ICallServiceInterface;
import hoperun.proxyserver.bean.FileInfo;
import hoperun.proxyserver.bin.ProxyConstant;
import hoperun.proxyserver.util.HTTPContentUtil;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

import java.io.IOException;
import java.util.Map;

/**
 * 
 * 用于显示Http页面的Call Service
 * 
 * @author jnad
 * 
 */
public class HtmlPageCallServiceImpl implements ICallServiceInterface {

	private static final boolean isLoadHtml = ProxyConstant.getProperty("Html_Enabled").toString().equalsIgnoreCase("true");
	private static final String namespace = ProxyConstant.getProperty("Html_Namespace").toString();
	private static final boolean isDebug = ProxyConstant.getProperty("Proxy_debug").toString().equalsIgnoreCase("debug");
//	private static final Logger logger = Logger.getLogger(HtmlPageCallServiceImpl.class.getName());
	// 所有以 载入配置文件的路径
	private String filter = "^" + namespace + ".*$";
	// 允许的文件后缀
	private String[] allowSuffix = null;

	@Override
	public HttpResponse callService(HttpRequest request, Map<String, String> requestMap) {

		if (!isLoadHtml) {
			if (isDebug) {
				SelfLogger.info("HtmlPageCallServiceImpl"," 已经被关闭,不在获取uri信息 " + request.getUri());
			}
			return null;
		}
		SelfLogger.info("HtmlPageCallServiceImpl","" + request.getUri());

		FileInfo fileInfo = null;
		try {
			String uri = resetNamespaceURI(request.getUri());
			if(uri.indexOf("?")>0){
				uri = uri.substring(0,uri.indexOf("?"));
			}
			fileInfo = LoadFile.loadFile(uri);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (fileInfo == null) {
			SelfLogger.info("HtmlPageCallServiceImpl","\"" + request.getUri() + "\"  File Not Found");
			return null;
		}
		// 返回文件数据,以文本的格式
		return HTTPContentUtil.getFullHttpResponse(fileInfo.getContent(), fileInfo.getType());
	}

	/**
	 * 删掉Namespace信息
	 * 
	 * @param uri
	 * @return
	 */
	private String resetNamespaceURI(String uri) {

		return uri.substring(uri.indexOf(namespace) + namespace.length());
	}

	@Override
	public String getThisUrlFilter() {
		return filter;
	}

}
