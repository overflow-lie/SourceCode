package net.sirun.work.handle;

import net.sirun.bin.ProxyContorlList;

/**
 * 对传入的URL进行解析
 * 
 * @author jnad
 * 
 */
public class URIDecode {

	private static final String serviceName = ProxyContorlList
			.getPropertyForString("URI_serviceName");

	/**
	 * 用于检测返回当前请求是否是Sirun服务类型
	 * 
	 * @param path1
	 * @return
	 */
	public static final boolean isServiceMode(String path1) {
		if (path1 == null) {
			return false;
		}
		return serviceName.equals(path1);
	}

	public static final String[] uriCheck(String url) {
		String s[] = url.split("\\?")[0].split("/");
		return s;
	}

	public static final String getUriFileType(String url) {
		String s[] = url.split("\\.");
		if (s.length == 0) {
			return null;
		} else {
			
			return s[s.length - 1];
		}

	}

}
