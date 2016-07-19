package net.sirun.util.trans;

//先加入dom4j.jar包 
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sirun.bin.ProxyContorlList;
import net.sirun.test.TransformTest;
import net.sirun.util.NGTPUtil;

import org.apache.commons.lang.ArrayUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.oss.asn1.BOOLEAN;
import com.oss.asn1.BitString;
import com.oss.asn1.INTEGER;
import com.oss.metadata.EnumeratedInfo;

/**
 * 基于DOM将ASN转换为JSON
 * 
 * @author jnad
 * 
 */
public class Dom4json {
	// 对象的存放地
	private static String classPath = "";

	public static String inputStream2String(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i = -1;
		while ((i = is.read()) != -1) {
			baos.write(i);
		}
		return baos.toString();
	}

	// private static Document doc = null;

	// static {
	//
	// // 初始化结构
	// main(null);
	// }

	private static Document staticload(String fileName) {
		Document doc = null;
		// 解析的xml文件
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		try {
			// 读取并解析XML文档
			// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			//
			// SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
			// Document document = reader.read(new File("User.hbm.xml"));
			// 下面的是通过解析xml字符串的
			doc = DocumentHelper.parseText(inputStream2String(in));
			Element rootElt = doc.getRootElement();
			classPath = getXmlAttribute(rootElt, "asnclass");

			// Element rootElt = doc.getRootElement();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return doc;
	}

	/*
	 * 检查当前的枚举配置是否基于索引的
	 */
	private final static boolean isnum = ProxyContorlList.getPropertyForString("Proxy_TransASN_2ndValue").equalsIgnoreCase("enum");

	/**
	 * 得到当前枚举类的ValueOF所对应的字符名称
	 * 
	 * @param Object
	 *            当前对象
	 * @param i
	 *            当前值
	 */
	private static String ndValue2String(String oclassName, String str) {
		if (isnum) {
			return str;
		}
		Object o = null;
		long i = 0;
		try {
			if (oclassName.equals("AvgFuelConsumptionCl")) {
				System.out.println();
			}
			i = Integer.valueOf(str);
			// 获取静态标签
			o = TransformTest.invokeStaticMethod(classPath + "." + oclassName, "getStaticTypeInfo");
			if (o instanceof EnumeratedInfo) {
			} else {
				System.out.println(oclassName + "无法转换枚举值!,返回携带的内容");
				return str;
			}
			// 获取内容list
			o = TransformTest.invokeMethod(o, "getEnumerationList");
			// 获取内容字符
			o = TransformTest.invokeMethod(o, "getMemberName", i);
		} catch (Exception e) {
			System.out.println(oclassName + " 转换失败,返回输入内容:" + str);
			e.printStackTrace();
			return str;
		}
		return o.toString();
	}

	/**
	 * 获取结构内的key值
	 * 
	 * @param e
	 * @param key
	 * @return
	 */
	private static String getXmlAttribute(Element e, String key) {
		Attribute data = e.attribute(key);
		if (data == null) {
			return null;
		}
		return data.getData().toString();
	}

	/**
	 * 获取当前结构的执行方法,假如为空,则返回默认的名称
	 * 
	 * @param thisElt
	 * @return
	 */
	private static String getXmllementFun(Element thisElt) {
		String thisfun = getXmlAttribute(thisElt, "fun");
		if (thisfun == null || "".equals(thisfun)) {
			byte[] e = thisElt.getName().getBytes();
			// 首字母大写
			e[0] -= 32;
			thisfun = "get" + new String(e);
		}
		return thisfun;
	}

	private static String getXmllementMode(Element thisElt) {
		String thismode = getXmlAttribute(thisElt, "mode");
		if (thismode == null || "".equals(thismode)) {
			thismode = "normal";
		}
		return thismode;
	}

	/**
	 * 解析正常模式的数据
	 * 
	 * @param formasn
	 * @param thisElt
	 * @return
	 */
	private static Map<String, Object> parseNormalData(Map<String, Object> put, Object o, Element e) {
		if (o == null) {
			System.out.println("[NormalData]  " + e.getName() + "传入的数据为空");
			// put.put(e.getName(), "null");
			return put;
		}
		if (e.getName().equals("operationTimeoutSec")) {
			System.out.println();
		}
		// 正常模式下值的显示方式是基于下一级的type来区分的
		switch (getXmlAttribute(e, "type")) {
		case "object":
			// 假如下级还需要被迭代,那么就送入迭代(不需要上方的调用好的方法)
			put.put(e.getName(), parseData(o, e));
			break;
		case "integer":
			// 这一级为数字,目前的话转成字符放入
			put.put(e.getName(), parseBaseType(o));
			break;
		case "utf8string":
			// 这一级为字符,目前的话转成字符放入
			// string 解的其实对应的是utfString ,需要另外解析一层
			put.put(e.getName(), parseUTFString(o));
			break;
		case "printablestring":
			// 这一级为打印字符,目前直接转换为现实字符
			// string 解的其实对应的是utfString ,需要另外解析一层
			// put.put(e.getName(), o.toString());

			put.put(e.getName(), parseUTFString(o));
			break;

		case "boolean":
			// 这一级为布尔型,目前的话转成字符放入
			put.put(e.getName(), o.toString());
			break;
		case "bitstring":
			// 这一级为布尔型,目前的话转成字符放入

			put.put(e.getName(), parseBaseType(o));
			break;
		case "null":
			// 这一级标记为null,写入字符null
			put.put(e.getName(), "null");
			break;
		case "byte":
			// System.out.println(e.getName()+"9!!!!!!!!!!!!!!!!!!!!!");
			// 这一级标记为null,写入字符null
			put.put(e.getName(), NGTPUtil.toByteArray(parsebytetype(o)));
			break;
		default:
			System.out.println("[NormalData] 发现未知类型: [" + getXmlAttribute(e, "type") + "] 在 :" + e.getName());
			// 未知的,先直接装在里面
			put.put(e.getName(), o.toString());
			break;
		}

		return put;
	}

	/**
	 * 判断当前父节点是否为choice模式
	 * 
	 * @param thisElt
	 * @return
	 */

	private static boolean isSuperEltchoicemode(Element thisElt) {
		// System.out.println("c:"+thisElt.getParent().getName());
		String c = getXmlAttribute(thisElt, "choice");
		if (c == null || "".equals(c)) {
			return false;
		}
		return true;

	}

	/**
	 * 正常的迭代方法
	 * 
	 * @param formasn
	 * @param thisElt
	 * @return
	 */
	private static Object parseData(Object formasn, Element thisElt) {
		return parseData(formasn, thisElt, false);
	}

	public static String parseData(Object formasn, boolean jsonformat) {
		// 初始化DOM

		String o = parseDataByDOM(formasn, jsonformat, "NGTP32.xml");
		// String val = JSON.toJSONString(o, jsonformat);
		// System.out.println("转换为:====1======\n" + val);
		return o;
	}

	/**
	 * 
	 * @param formasn
	 * @param jsonformat
	 * @param service
	 *            名称 有 serviceData 和 dspt 2种,默认不传为serviceData
	 * @return
	 */
	public static String parseDataByDOM(Object formasn, boolean jsonformat, String service) {
		service = service == null ? "serviceData" : service;
		// 初始化DOM
		Document doc = null;
		switch (service) {
		case "serviceData":
			doc = staticload("NGTP32.xml");
			break;
		case "dspt":
			doc = staticload("dspt.xml");
			break;
		case "dsptUn":
			doc = staticload("dsptUnencrypted.xml");
			break;
		default:
			doc = staticload("NGTP32.xml");
			break;
		}
		Object o = parseData(formasn, doc.getRootElement());
		System.out.println(o.toString());
		String val = JSON.toJSONString(o, jsonformat);
		System.out.println("转换为:==========\n" + val);
		return val;
	}

	/**
	 * 迭代数据
	 * 
	 * @param formasn
	 * @param thisElt
	 * @return
	 */
	private static Object parseData(Object formasn, Element thisElt, boolean isArrayMode) {
		// 首先查看当前方法的模式 (mode),默认为空,即为正常模式
		// 2rd 第二及数据为第一级值(终点)
		// choies 选择 在得到非空节点后开始向下数据
		// array 数组模式
		if (formasn == null || thisElt == null) {
			System.out.println("解释错误 已忽略 在" + (thisElt != null ? thisElt.getName() : "未知节点(或节点为必选)"));
			return null;
		}
		Object o = null;
		// 得到当前的模式
		String thismode = getXmllementMode(thisElt);

		// 首先判断是当前的模式,由于array在解包的时候使用一样的方法

		if (thismode.equals("normal") || isArrayMode) {
			// 正常的模式
			Map<String, Object> put = new HashMap<String, Object>();
			// 迭代所有的节点并将内容数据放入其中
			Iterator<Element> iter = thisElt.elementIterator();
			String funName = null;
			Element e = null;
			// 判断是否是选择模式,假如是则不再迭代
			// if(isSuperEltchoicemode(thisElt)){
			// return parseNormalData(put,o,e);
			// }

			while (iter.hasNext()) {
				e = iter.next();
				// funName = getXmlAttribute(e, "fun");
				// 使用可以带默认值的e
				funName = getXmllementFun(e);
				System.out.println("Funname  " + funName);
				// 首先判断下一级的模式,假如非正常模式直接扔到下一级
				if (funName.equals("getExt")) {
					System.out.println();
				}
				if (!"normal".equals(getXmllementMode(e))) {
					Object s = parseData(formasn, e);
					if (s != null) {
						put.put(e.getName(), s);
					}
					continue;
				}
				try {
					o = TransformTest.invokeMethod(formasn, funName);
				} catch (Exception e1) {
					System.out.println("正常迭代的时候发生错误,无法找到转换的方法 [" + e.getPath() + "]");
					e1.printStackTrace();
					continue;
					// return put;
				}
				parseNormalData(put, o, e);
			}
			if (put.size() == 0) {
				return null;
			}
			return put;
		}
		if (thismode.equals("2ndValue")) {
			// 二次为值模式,这时候需要将唯一子集的值给予当前级
			try {
				if (thisElt.getName().equals("trigger")) {
					System.out.println();
				}
				// 第一次得到方法值
				o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));
				if (o == null) {
					return null;
				}
				// 执行第二级方法
				o = TransformTest.invokeMethod(o, getXmlAttribute(thisElt, "ndfun"));
				o = ndValue2String(getXmlAttribute(thisElt, "class"), o.toString());

			} catch (Exception e1) {
				System.out.println("2ndvalue:" + thisElt.getName() + "[  " + thisElt.getPath());
				e1.printStackTrace();
			}
			return o.toString();
		}
		if (thismode.equals("array")) {
			// 数组模式,那么将数据组装成数据格式
			System.out.println("发现一个数组");
			if (thisElt.getName().equals("trigger")) {
				System.out.println("1");
			}
			List<Object> putlist = new ArrayList<Object>();
			// putlist.add(e)
			int size = 0;
			Object e = null;
			String choice = null;
			choice = getXmlAttribute(thisElt, "choice");
			try {
				if (choice == null) {
					// //choice会影响选择,判断是否影响
					o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));
				} else {
					o = formasn;
				}
				if (o == null) {
					System.out.println("在数组内部没有获取到值");
					return putlist;
				}
				size = (int) TransformTest.invokeMethod(o, "getSize");
				System.out.println("[" + thisElt.getName() + "] 数组长度为" + size);
				String type = getXmlAttribute(thisElt, "type");
				// 当前模式是数组选择
				boolean arraymode = true;
				if ("arraychoice".equals(type)) {
					System.out.println("发现一个数组直接选择");
					// 将结构标记为choice进行循环
					thisElt.addAttribute("mode", "choice");
					arraymode = false;
				}
				for (int i = 0; i < size; i++) {
					// 在type为2ndValue 时,直接解析内容,不再进行下面递归
					switch (type) {
					case "2ndValue":
						e = TransformTest.invokeMethod(o, "get", Integer.valueOf(i));
						e = TransformTest.invokeMethod(e, getXmlAttribute(thisElt, "ndfun"));

						// putlist.add(e.toString());
						// 字符转换
						putlist.add(ndValue2String(getXmlAttribute(thisElt, "class"), e.toString()));
						break;
					default:
						// 获取数组的对象 (其他默认类型)
						e = TransformTest.invokeMethodForInteger(o, "get", i);
						putlist.add(parseData(e, thisElt, arraymode));
						break;
					}

				}

			} catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("数组解析失败");

			}
			thisElt.addAttribute("mode", "array");

			return putlist;

		}
		if (thismode.equals("2ndArray")) {
			// 第二级为数组模式,那么将数据组装成数据格式
			System.out.println("发现一个单一数组");
			if (thisElt.getName().equals("bulbFailures")) {
				System.out.println("1");
			}
			List<Object> putlist = new ArrayList<Object>();
			// putlist.add(e)
			int size = 0;
			Object e = null;
			try {
				// 首先要获取数组长度
				o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));
				if (o == null) {
					System.out.println("[ERROR] 得到 单一数组   为空值! ");
					return null;
				}
				size = (int) TransformTest.invokeMethod(o, "getSize");

				for (int i = 0; i < size; i++) {
					// 获取数组的对象
					e = TransformTest.invokeMethodForInteger(o, "get", i);
					// 判断数据类型
					String type = getXmlAttribute(thisElt, "type");
					switch (type) {
					case "integer":
						e = TransformTest.invokeMethod(e, getXmlAttribute(thisElt, "ndfun"));
						putlist.add(e.toString());
						break;
					case "2ndArray":
						e = TransformTest.invokeMethod(e, getXmlAttribute(thisElt, "ndfun"));
						// 字符转换
						putlist.add(ndValue2String(getXmlAttribute(thisElt, "class"), e.toString()));
						break;
					case "2ndvalue":
						// e = TransformTest.invokeMethod(e,
						// getXmllementFun(thisElt));
						// System.out.println();
						e = TransformTest.invokeMethod(e, getXmlAttribute(thisElt, "ndfun"));
						// putlist.add(e.toString());
						// 字符转换
						putlist.add(ndValue2String(getXmlAttribute(thisElt, "class"), e.toString()));
						break;
					default:
						putlist.add(e.toString());
						break;
					}

				}

			} catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("数组解析失败");

			}
			return putlist;

		}

		if (thismode.equals("choice")) {
			System.out.println("发现一个选择");
			if (thisElt.getName().equals("ext")) {
				System.out.println("1");
			}
			// 选择模式 ,这个时候会先确定选择的是哪个,然后把名字以map的key的形式作为2级key]
			// 二次为值模式,这时候需要将唯一子集的值给予当前级
			Map<String, Object> put = new HashMap<String, Object>();
			int choice_flag = -1;
			String type = getXmlAttribute(thisElt, "type");
			String choice = null;
			choice = getXmlAttribute(thisElt, "choice");
			try {
				// 首先要获取方法的选择标记
				// 第一次得到方法值,在数组直接选择模式时不启用

				if (!"arraychoice".equals(type)) {
					if (choice == null) {
						// choice会影响选择,判断是否影响
						o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));
					} else {
						o = TransformTest.invokeMethod(formasn, getXmlAttribute(thisElt, "ndfun"));
					}
				} else {
					o = formasn;
				}
				// 这个时候对象里有对选择的值的标定,执行获取值的方法
				choice_flag = (int) TransformTest.invokeMethod(o, getXmlAttribute(thisElt, "ndfun"));
			} catch (Exception e1) {
				System.out.println("选择内部为空");
				e1.printStackTrace();
			}
			// 执行失败
			if (choice_flag == -1) {
				return null;
			}
			// if(thisElt.getName().equals("key")){
			// int a=1;
			// System.out.println("value");
			// }
			// 使用迭代器获取当前选择标记的对象参数
			Iterator<Element> citer = thisElt.elementIterator();
			while (citer.hasNext()) {
				Element e = citer.next();
				// 判断是否是当前标记
				if (!getXmlAttribute(e, "choice").equals("" + choice_flag)) {
					continue;
				}

				try {
					// 获取值对象
					o = TransformTest.invokeMethod(o, getXmllementFun(e));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				if (e.getName().equals("address_ascii")) {
					System.out.println();
				}
				System.out.println("chisce_name: " + e.getName());
				// 找到当前标记 以 key:choiceKey:val的形式组装,其中第一级的key已经在上面赋完了
				// 判断当前choice的类型,假如是object 则转到正常,否则则转到 基本类型处理

				String ctype = getXmlAttribute(e, "type");
				if (ctype == null || ctype.equals("object")) {
					put.put(e.getName(), parseData(o, e));
				} else {
					o = parseBaseType(o);
					// 形参传递
					parseNormalData(put, o, e);
				}

				return put;
			}

		}
		if (thismode.equals("subchoice")) {
			// 选择模式的子节点特有模式,用于标识特殊的结构
			// 此结构基于类型进行处理
			String type = getXmlAttribute(thisElt, "type");
			switch (type) {
			case "octetbytes":
				// 当前方法是标识选择的是一个可见二进制数组
				try {
					// 第一次得到方法值
					// 执行第二级方法
					o = TransformTest.invokeMethod(formasn, getXmlAttribute(thisElt, "ndfun"));
					o = NGTPUtil.toByteArray((byte[]) o);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				break;
			case "printablestring":
				// 当前方法是标识选择的是一个可见二进制数组
				try {
					// 第一次得到方法值
					// 执行第二级方法
					o = parseUTFString(formasn);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
				break;
			case "integer":
				// 当前方法是标识选择的
				try {
					// 第一次得到方法值
					// 执行第二级方法
					o = TransformTest.invokeMethod(formasn, getXmlAttribute(thisElt, "ndfun"));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				break;

			default:
				break;
			}
			return o.toString();

		}

		return null;
	}

	/**
	 * 解析Integer 格式数据
	 * 
	 * @param o
	 * @return
	 */
	private static Object parseBaseType(Object o) {
		// 先使用字符串及的解析
		if (o == null) {
			return null;
		}
		try {
			// 有些没有被解释的integer 类型混入进来,重新校验一次
			if (o instanceof INTEGER) {
				o = TransformTest.invokeMethod(o, "longValue");
				// 带引号
				o = o.toString();
			}
			if (o instanceof Integer) {
				// o = TransformTest.invokeMethod(o, "longValue");
				// 带引号
				o = o.toString();
			}
			if (o instanceof Long) {
				// o = TransformTest.invokeMethod(o, "longValue");
				// 带引号
				o = o.toString();
			}
			// if (o instanceof OctetString) {
			// o = TransformTest.invokeMethod(o, "byteArrayValue");
			// }
			//  同上
			if (o instanceof BOOLEAN) {
				o = TransformTest.invokeMethod(o, "booleanValue");
				o = o.toString();
			}

			if (o instanceof BitString) {
				// 此种类型会生成2个数据,所以需要再增加一层
				Map<String, Object> amap = new HashMap<String, Object>();
				amap.put("sigBits", TransformTest.invokeMethod(o, "getSize"));
				byte[] nno = (byte[]) TransformTest.invokeMethod(o, "byteArrayValue");
				List<Byte> alist = new ArrayList<Byte>();

				for (byte b : nno) {
					alist.add(b);
				}
				amap.put("value", alist);
				o = amap;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;

	}

	/**
	 * 解析字节格式的数据
	 * 
	 * @param o
	 * @return
	 */
	private static byte[] parsebytetype(Object o) {
		// 先使用字符串及的解析
		if (o == null) {
			return null;
		}
		try {
			o = TransformTest.invokeMethod(o, "byteArrayValue");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (byte[]) o;

	}

	/**
	 * 解析UTF8的字符串
	 * 
	 * @param o
	 * @return
	 */
	private static String parseUTFString(Object o) {
		// 先使用字符串及的解析
		if (o == null) {
			return null;
		}
		try {
			if (o instanceof String) {
				return o.toString();
			}

			o = TransformTest.invokeMethod(o, "stringValue");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o.toString();

	}
}