package net.sirun.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;

/**
 * 转换测试方法
 * 
 * @author jnad
 * 
 */
public class TransformTest {
	public static void main(String s[]) {
		test2();
	}

	// 反射测试1
	private static void test1() {

		Person p = null;

		// String clazzName =
		// "net.sirun.ngtp.ngtp_service_data.NGTPServiceData";
		String clazzName = "net.sirun.test.Person";
		Class<?> test1 = null;

		try {
			test1 = Class.forName(clazzName);
			p = (Person) test1.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 取得全部的构造函数
		Constructor<?> cons[] = test1.getConstructors();
		try {
			// p = (Person) cons[1].newInstance("String2");
			// System.out.println(cons[1].getModifiers());

			for (java.lang.reflect.Type tpye : cons[1].getGenericParameterTypes()) {
				System.out.println(tpye.toString());

			}

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		p.setAge(2);

		// test1

		System.out.println(JSON.toJSONString(p).toString());

	}

	/**
	 * 使用讲构造方法进行注册.
	 */

	private static void test2() {
		String clazzName = "net.sirun.test.Person";
		Class<?> test1 = null;
		Person p = null;
		try {
			test1 = Class.forName(clazzName);
			p = (Person) newObject(test1, new A("34", "123"));
			System.out.println(JSON.toJSONString(p));
			invokeMethod(p, "print", new Object[] { "print" });
			invokeMethod(p, "print", "asd");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

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
	 * @param clazz
	 * @return clazz<basic>
	 */
	private static Class<?> replaceBasicType(Class<?> clazz){
		
		if (clazz.equals(Boolean.class)) {
			clazz = boolean.class;
		} else if (clazz.equals(Integer.class)) {
			clazz = int.class;
		} else if ( clazz.equals(Long.class)) {
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
