package hoperun.proxyserver.service.httppage;

import hoperun.loginfo.SelfLogger;
import hoperun.proxyserver.bean.FileInfo;
import hoperun.proxyserver.bin.ProxyConstant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 载入文件,基于配置文件的Dir路径
 * 
 * @author jnad
 * 
 */
public class LoadFile {
	private static final String separator = File.separator;

	private static final String r1 = Class.class.getClass().getResource("/").getPath();

	// 载入的基准路径
	private static final String[] dirs = new String[] { 
			r1.substring(0,r1.lastIndexOf("classes"))+separator
			+ "webcontent" + separator,
			System.getProperty("user.dir")+separator+"src"+separator+"main"+separator+"webcontent"+ separator,
			System.getProperty("user.dir"), Class.class.getClass().getResource("/").getPath(),
			Thread.currentThread().getContextClassLoader().getResource("").getPath(),
			Thread.currentThread().getContextClassLoader().getResource("").getPath() + separator + "webcontent" + separator };
	// 目录默认载入页面
	private static final String defaultPage = ProxyConstant.getProperty("Html_DirectoryDefaultPage").toString();

	/**
	 * 取得各个路径下是否存在文件
	 * 
	 * @param subFilePath
	 * @return
	 */
	private static boolean isExist(String FilePath) {

		return false;
	}

	/**
	 * 取文件数据,基于配置组装全路径获取
	 * 
	 * @param subFilePath
	 * @return
	 * @throws IOException
	 */
	public static FileInfo loadFile(String subFilePath) throws IOException {
		subFilePath = subFilePath.replace("/", separator);
 
		for (String dir : dirs) {
//			System.out.println( dir + subFilePath);
			File f = new File(dir + subFilePath);
			//System.out.println("-  "+f.getPath()  );
			if (f.exists()) { 
				if (f.isDirectory()) {// 假如是目录则使用默认文件进行装载
					f = new File(f.getPath() + separator + defaultPage);
					if (!f.exists()) {// 默认文件不存在,进行下一步
						continue;
					}
				}
				FileInfo fi = new FileInfo();
				FileInputStream fis = new FileInputStream(f);
				byte[] b = new byte[fis.available()];// 新建一个字节数组
				fis.read(b);// 将文件中的内容读取到字节数组中
				fis.close();

				fi.setContent(b);
				fi.setFileName(f.getName());
				fi.setSize(b.length + "");

				fi.setType(fi.getFileName().substring(fi.getFileName().lastIndexOf(".") + 1));
				return fi;
			}
		}
		return null;
		// File f1 = new File(System.getProperty("user.dir") + separator +
		// subFilePath);
		// System.out.println("f1:" + f1.exists());
		//
		// File f2 = new File(Class.class.getClass().getResource("/").getPath()
		// + subFilePath);
		// System.out.println("f1:" + f2.exists());
		//
		// File f3 = new File(Class.class.getClass().getResource("/").getPath()
		// + separator + subFilePath);
		// System.out.println("f1:" + f3.exists());
		//
		// System.out.println("1		" + System.getProperty("user.dir"));
		// System.out.println("2		" +
		// Class.class.getClass().getResource("/").getPath());
		// System.out.println("3		" +
		// Thread.currentThread().getContextClassLoader().getResource("").getPath());

	}

}
