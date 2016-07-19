package hoperun.proxyserver.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties 文件操作类
 * 
 * @author jnad
 * 
 */
public class PropertiesUtil {
	public static void main(String... s) {
		// System.out.println(System.getProperty("user.dir"));
		// /Users/jnad/Documents/workspace/sirun/proxyserver/src/main/resources/proxy.properties
		// /Users/jnad/Documents/workspace/sirun/proxyserver
		System.out.println(File.separator);
	}

	/**
	 * 读取配置文件
	 * 
	 * @param fileName
	 * @return
	 */
	public static Properties loadProperties(String fileName) {
		Properties props = new Properties();
		InputStream inputStream = null;
		// 查找Class目录
		try {
			inputStream = new FileInputStream(fileName);
		} catch (Exception e) {

		}
		// 查找Jar包中的目录
		if (inputStream == null) {
			try {
				inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
			} catch (Exception e) {
			}
		}
		// 查找同级目录
		if (inputStream == null) {
			try {
				inputStream = PropertiesUtil.class.getResourceAsStream(fileName);
			} catch (Exception e) {
			}
		}
		// 指定目录
		if (inputStream == null) {
			try {
				inputStream = new FileInputStream(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator
						+ fileName);
			} catch (Exception e) {
			}
		}
		if (inputStream == null) {
			System.out.println("无法加载properties配置文件：" + fileName);
			return null;
		} else {
			try {
				props.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		return props;
	}
}
