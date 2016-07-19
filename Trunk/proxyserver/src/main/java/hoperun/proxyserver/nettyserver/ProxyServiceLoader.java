package hoperun.proxyserver.nettyserver;

import hoperun.loginfo.SelfLogger;
import hoperun.proxybusiness.business.ICallServiceInterface;
import hoperun.proxyserver.bin.ProxyConstant;
import hoperun.proxyserver.service.visitrecord.IRecordVisitService;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.alibaba.fastjson.JSONObject;

/**
 * 载入Proxy的服务service类
 * 
 * @author jnad
 * 
 */
public class ProxyServiceLoader extends ClassLoader {

	private static final Logger logger = Logger.getLogger(ProxyServiceLoader.class.getName());

	/**
	 * 载入Service 类 ,在没有,或无法载入完全的情况下返回false ,终止初始化
	 * 
	 * @return is ok
	 */
	public static boolean loadService() {
		logger.info("开始载入service Class");
		String paths[] = ProxyConstant.getPropertyForString("Class_LoadPath").split(",");
		if (paths.length == 0) {
			logger.log(Level.WARNING, "没有发现需要载入的Service 类");
			return false;
		}
		ProxyServiceLoader psl = new ProxyServiceLoader();
		return psl.loadServices(paths);
	}

	/**
	 * 载入访问记录类
	 * 
	 * @return
	 */
	public static boolean loadVisitService() {
		String visitpath = ProxyConstant.getPropertyForString("Proxy_RecordVisitPath");
		ProxyServiceLoader psl = new ProxyServiceLoader();
		return psl.loadVisitServices(visitpath);
	}

	public boolean loadVisitServices(String path) {
		SelfLogger.tempParam("开始装载 访问记录服务 " +  path);

		try {
			IRecordVisitService o = (IRecordVisitService) loadClassContent(path).newInstance();
			ProxyConstant.WorkClass.RECORDVISITSERVICE = o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	/**
	 * 根据名称载入类
	 * 
	 * @param paths
	 */
	public boolean loadServices(String[] paths) {
		SelfLogger.tempParam("开始装载以下Http服务 " + JSONObject.toJSONString(paths));

		for (String path : paths) {
			try {
				// 以匹配URL作为Key 进行存入,按照次序 工作的依次进行匹配
				// ICallServiceInterface o = (ICallServiceInterface)
				// findClass(path).newInstance();
				ICallServiceInterface o = (ICallServiceInterface) loadClassContent(path).newInstance();
				ProxyConstant.WorkClass.SERVICELIST.add(o);
				SelfLogger.tempParam("load class: " + path + "successfully");

			} catch (Exception e) {
				SelfLogger.errorException(e, null, null, path);
				return false;
			}
		}
		return true;
	}

	/**
	 * 读取数据
	 * 
	 * @param pi
	 * @param name
	 * @return
	 */
	public byte[] loadClassData(String name) {
		try {
			name = name.replace(".", "//");
			String path = System.getProperty("user.dir") + "target/classes";
			FileInputStream is = new FileInputStream(path + File.separator + new File(name + ".class"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int b = 0;
			while ((b = is.read()) != -1) {
				baos.write(b);
			}
			return baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Class<?> loadClassContent(String name) throws ClassNotFoundException {
		return Thread.currentThread().getContextClassLoader().loadClass(name);
	}

	/**
	 * 重写findClass方法
	 */
	@Override
	public Class<?> findClass(String name) {
		byte[] data = null;
		data = loadClassData(name);
		return this.defineClass(name, data, 0, data.length);
	}
}
