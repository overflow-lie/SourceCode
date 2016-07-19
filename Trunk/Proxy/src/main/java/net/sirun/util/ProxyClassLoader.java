package net.sirun.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import net.sirun.bin.ProxyContorlList;
import net.sirun.work.handle.servise.BusinessServiceInterface;

public class ProxyClassLoader extends ClassLoader {
	// 类加载器的名称
	private String name;
	// 类存放的路径
	// 对于不同的项目结构来说 类存放的路径可能不太一样,这里需要扩充
	private String[] path = (String[]) ProxyContorlList.getProperty("Class_LoadPath");

	ProxyClassLoader(String name) {
		this.name = name;
	}

	ProxyClassLoader(ClassLoader parent, String name) {
		super(parent);
		this.name = name;
	}

	/**
	 * 重写findClass方法
	 */
	@Override
	public Class<?> findClass(String name) {

		byte[] data = null;
		int pi = 0;
		while (data != null) {
			// 因为路径有可能不同,需要多次进行尝试获取类文件
			if (new File(path[pi] + name + ".class").exists()) {
				data = loadClassData(pi++, name);
			}
		}
		return this.defineClass(name, data, 0, data.length);
	}

	public byte[] loadClassData(int pi, String name) {
		try {
			name = name.replace(".", "//");
			FileInputStream is = new FileInputStream(new File(path[pi] + name + ".class"));
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

	/**
	 * 返回需要加载的服务实现
	 * 
	 * @param vers
	 * @return
	 * @throws ClassNotFoundException
	 */
	public BusinessServiceInterface classloadVerServiceImpl(String classpath) throws ClassNotFoundException {

		// 加载类，得到Class对象
		Class<?> clazz = this.loadClass(classpath);
		// 得到类的实例
		try {
			BusinessServiceInterface b = (BusinessServiceInterface) clazz.newInstance();
			return b;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void initProxyClassLoad() {
		ProxyClassLoader pcl = new ProxyClassLoader("Proxy Handle Service Class Load");
		// 更新缓存 本地业务和文件读取 服务

		// 加载类，得到Class对象
		try {
			Class<?> y = pcl.loadClass("net.sirun.work.handle.servise.business.BusinessServiceImpl");
			Class<?> f = pcl.loadClass("net.sirun.work.handle.servise.business.FileBusinessServiceImpl");
			try {
				ProxyContorlList.WorkClass.SERVICECLASS.put("sFile", (BusinessServiceInterface) f.newInstance());
				ProxyContorlList.WorkClass.SERVICECLASS.put("sWork", (BusinessServiceInterface) y.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		// 更新缓存处理服务处理class
		String vers[] = (String[]) ProxyContorlList.getProperty("Proxy_handle_serviceClass");

		for (String s : vers) {
			try {
				ProxyContorlList.WorkClass.SERVICECLASS.put(s, pcl.classloadVerServiceImpl(s));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
