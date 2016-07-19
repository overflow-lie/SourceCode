package hoperun.proxyserver.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;

/**
 * 反射工具类
 * 
 * @author jnad
 * 
 */
public class ReflectionUtil {

	/**
	 * 执行静态方法
	 * 
	 * @param owner
	 * @param methodName
	 * @param args
	 * @return
	 * @throws Exception
	 */
	public static Object invokeStaticMethod(String classPath, String methodName, Object... args) throws Exception {

		Class<?> c = Class.forName(classPath);
		// 得到class
		Class<?>[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			// 对于基本数据类型反封装
			argsClass[i] = replaceBasicType(args[i].getClass());
		}
		// 得到方法
		Method method = c.getMethod(methodName, argsClass);
		return method.invoke(c, args);

	}

	/**
	 * 将包装类替换为基本数据类型,非基本数据类型的包装类 则直接返回
	 * 
	 * @param clazz
	 * @return clazz<basic>
	 */
	private static Class<?> replaceBasicType(Class<?> clazz) {

		if (clazz.equals(Boolean.class)) {
			clazz = boolean.class;
		} else if (clazz.equals(Integer.class)) {
			clazz = int.class;
		} else if (clazz.equals(Long.class)) {
			clazz = long.class;
		}
		return clazz;
	}

	/**
	 * 执行对象内的方法 基本数据类型不封箱
	 * 
	 * @param owner
	 * @param methodName
	 * @param args
	 *            传入参数们
	 * @return
	 * @throws Exception
	 */
	public static Object invokeMethod(Object owner, String methodName, Object... args) throws Exception {
		if (methodName.equals("")) {
			return owner;
		}

		Class<?> ownerClass = owner.getClass();

		// 得到class
		Class<?>[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = replaceBasicType(args[i].getClass());
		}

		// 得到方法
		Method method = ownerClass.getMethod(methodName, argsClass);
		return method.invoke(owner, args);
	}

	/**
	 * 执行对象内的方法
	 * 
	 * @param owner
	 * @param methodName
	 * @param args
	 *            传入参数们
	 * @return
	 * @throws Exception
	 */
	public static Object invokeMethodForInteger(Object owner, String methodName, int i) throws Exception {
		Class<?> ownerClass = owner.getClass();
		// 得到方法
		Method method = ownerClass.getMethod(methodName, Integer.TYPE);
		return method.invoke(owner, i);
	}

	/**
	 * 根据Class名称和构造方法进行匹配构建对象,传参为有序的
	 * 
	 * @param classPath
	 * @param objects
	 *            [] 假如使用默认构造函数,可以传入空,或者不传入
	 * @return
	 */
	public static Object newObject(String classPath, Object... objects) throws ClassNotFoundException {
		return newObject(Class.forName(classPath), objects);
	}

	/**
	 * 根据Class的构造方法进行匹配构建对象,传参为有序的
	 * 
	 * @param clazz
	 * @param objects
	 *            [] 假如使用默认构造函数,可以传入空,或者不传入
	 * @return
	 */
	public static Object newObject(Class<?> clazz, Object... objects) {
		objects = objects == null ? new Object[0] : objects;
		try {
			Constructor<?>[] cons = clazz.getConstructors();
			Type[] types = null;
			for (Constructor<?> con : cons) {
				types = con.getGenericParameterTypes();
				if (types.length == objects.length) {
					if (objects.length == 0) {
						// 返回为空的构造方法类型对象
						return con.newInstance(objects);
					}
					for (int i = 0; i < objects.length; i++) {
						if (objects[i].getClass().hashCode() != types[i].hashCode()) {
							// 假如不等于,则返回最上层继续查找
							break;
						}
						// 发现最后一个也类型相等,那么则返回构造方法
						if (i == objects.length - 1) {
							// 发现全等,则以当前的构造方法进行构建
							return con.newInstance(objects);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

}
