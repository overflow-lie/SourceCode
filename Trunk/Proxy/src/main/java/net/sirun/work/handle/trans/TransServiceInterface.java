package net.sirun.work.handle.trans;

/**
 * 正反转接口<br>
 * 转换Service需要实现此方法<br>
 * 需要实现此接口,并在程序内进行注册
 * 
 * @author jnad
 * @param <T>
 * 
 */
public interface TransServiceInterface {
	/**
	 * 将协议转换为标准协议
	 * 
	 * @param from
	 * @param fromtype
	 * @param version
	 * @param clazz
	 * @return
	 */
	public <T> Object toStandard(Object from, String fromtype,  Class<T> clazz);

	/**
	 * 将标准协议转为预定协议
	 * 
	 * @param from
	 * @param fromtype
	 * @param version
	 * @param clazz
	 * @return
	 */
	public <T> Object formStandard(Object from, String fromtype, Class<T> clazz);

	/**
	 * 返回当前转换的服务名称
	 * 
	 * @return
	 */
	public String currentService();

	/**
	 * 返回转换的协议名称
	 * 
	 * @return
	 */
	public String currentAgreement();
	/**
	 * 当前转换的版本
	 * @return
	 */
	public String currentVersion();

}
