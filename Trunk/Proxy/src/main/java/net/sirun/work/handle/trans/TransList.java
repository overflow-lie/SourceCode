package net.sirun.work.handle.trans;

/**
 * 所有转换协议实现的合集
 * 
 * @author jnad
 * 
 */
public class TransList {
 
	/**
	 * 根据ServiceName 及当前协议的标识符 将协议转换到标准协议上
	 * @param serviceName
	 * @param pro
	 * @param from
	 * @param clazz
	 * @return
	 */
	public static <T> Object toStandard(String serviceName,String standard,String version,Object from, Class<T> clazz) {
		return null;
	}

	
	

	/**
	 * 将标准协议的数据,转换到 标识协议上,根据ServiceName  
	 * @param serviceName
	 * @param pro
	 * @param from
	 * @param clazz
	 * @return
	 */
	public static <T> Object formStandard(String serviceName,String standard,String version,Object from, Class<T> clazz) {
		return null;
	}

}
