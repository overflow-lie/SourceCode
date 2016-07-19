package net.sirun.util;

import io.netty.channel.nio.NioEventLoopGroup;
import net.sirun.bin.ProxyContorlList;
import net.sirun.bin.ProxyServerBoot;
import net.sirun.work.handle.servise.BusinessServiceInterface;

public class ClassLoaderTest {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		ProxyContorlList.initContorlList();
		
		ProxyContorlList.ThreadPoll.bossGroup = new  NioEventLoopGroup(
				StringUtil.toInt(ProxyContorlList
						.getPropertyForString("Proxy_workThreadNum")));
		// 新建一个类加载器
		ProxyClassLoader cl = new ProxyClassLoader(
				"BusinessServiceModeClassLoad");
		// 加载类，得到Class对象
		Class<?> clazz = cl
				.loadClass("net.sirun.work.handle.BusinessServiceImpl");
		// 得到类的实例
		BusinessServiceInterface b = (BusinessServiceInterface) clazz
				.newInstance();
	 
	}

}
