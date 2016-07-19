package net.sirun.test;

//先加入dom4j.jar包 
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sirun.bean.GetALLDownlinkBean;
import net.sirun.ngtp.ngtp_service_data.NGTPCore;
import net.sirun.util.NGTPUtil;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.oss.asn1.ISO8601Duration.Fractional_part;

/**
 * @Title: TestDom4j.java
 * @Package
 * @Description: 解析xml字符串
 * @author 无处不在
 * @date 2012-11-20 下午05:14:05
 * @version V1.0
 */
public class TestDom4j {

	public void readStringXml(String xml) {
		Document doc = null;
		try {

			// 读取并解析XML文档
			// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			//
			// SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
			// Document document = reader.read(new File("User.hbm.xml"));
			// 下面的是通过解析xml字符串的
			doc = DocumentHelper.parseText(xml); // 将字符串转为XML

			Element rootElt = doc.getRootElement(); // 获取根节点
			System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称

			Iterator iter = rootElt.elementIterator("head"); // 获取根节点下的子节点head

			// 遍历head节点
			while (iter.hasNext()) {

				Element recordEle = (Element) iter.next();
				String title = recordEle.elementTextTrim("title"); // 拿到head节点下的子节点title值
				System.out.println("title:" + title);

				Iterator iters = recordEle.elementIterator("script"); // 获取子节点head下的子节点script

				// 遍历Header节点下的Response节点
				while (iters.hasNext()) {

					Element itemEle = (Element) iters.next();

					String username = itemEle.elementTextTrim("username"); // 拿到head下的子节点script下的字节点username的值
					String password = itemEle.elementTextTrim("password");

					System.out.println("username:" + username);
					System.out.println("password:" + password);
				}
			}
			Iterator iterss = rootElt.elementIterator("body"); // /获取根节点下的子节点body
			// 遍历body节点
			while (iterss.hasNext()) {

				Element recordEless = (Element) iterss.next();
				String result = recordEless.elementTextTrim("result"); // 拿到body节点下的子节点result值
				System.out.println("result:" + result);

				Iterator itersElIterator = recordEless.elementIterator("form"); // 获取子节点body下的子节点form
				// 遍历Header节点下的Response节点
				while (itersElIterator.hasNext()) {

					Element itemEle = (Element) itersElIterator.next();

					String banlce = itemEle.elementTextTrim("banlce"); // 拿到body下的子节点form下的字节点banlce的值
					String subID = itemEle.elementTextTrim("subID");

					System.out.println("banlce:" + banlce);
					System.out.println("subID:" + subID);
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * @description 将xml字符串转换成map
	 * @param xml
	 * @return Map
	 */
	public static Map readStringXmlOut(String xml) {
		Map map = new HashMap();
		Document doc = null;
		try {
			// 将字符串转为XML
			doc = DocumentHelper.parseText(xml);
			// 获取根节点
			Element rootElt = doc.getRootElement();
			// 拿到根节点的名称
			System.out.println("根节点：" + rootElt.getName());

			// 获取根节点下的子节点head
			Iterator iter = rootElt.elementIterator("head");
			// 遍历head节点
			while (iter.hasNext()) {

				Element recordEle = (Element) iter.next();
				// 拿到head节点下的子节点title值
				String title = recordEle.elementTextTrim("title");
				System.out.println("title:" + title);
				map.put("title", title);
				// 获取子节点head下的子节点script
				Iterator iters = recordEle.elementIterator("script");
				// 遍历Header节点下的Response节点
				while (iters.hasNext()) {
					Element itemEle = (Element) iters.next();
					// 拿到head下的子节点script下的字节点username的值
					String username = itemEle.elementTextTrim("username");
					String password = itemEle.elementTextTrim("password");

					System.out.println("username:" + username);
					System.out.println("password:" + password);
					map.put("username", username);
					map.put("password", password);
				}
			}

			// 获取根节点下的子节点body
			Iterator iterss = rootElt.elementIterator("body");
			// 遍历body节点
			while (iterss.hasNext()) {
				Element recordEless = (Element) iterss.next();
				// 拿到body节点下的子节点result值
				String result = recordEless.elementTextTrim("result");
				System.out.println("result:" + result);
				// 获取子节点body下的子节点form
				Iterator itersElIterator = recordEless.elementIterator("form");
				// 遍历Header节点下的Response节点
				while (itersElIterator.hasNext()) {
					Element itemEle = (Element) itersElIterator.next();
					// 拿到body下的子节点form下的字节点banlce的值
					String banlce = itemEle.elementTextTrim("banlce");
					String subID = itemEle.elementTextTrim("subID");

					System.out.println("banlce:" + banlce);
					System.out.println("subID:" + subID);
					map.put("result", result);
					map.put("banlce", banlce);
					map.put("subID", subID);
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public static String inputStream2String(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i = -1;
		while ((i = is.read()) != -1) {
			baos.write(i);
		}
		return baos.toString();
	}

	public static void main(String[] args) {

		// // 下面是需要解析的xml字符串例子
		// String xmlString = "<html>" + "<head>" + "<title>dom4j解析一个例子</title>"
		// + "<script>" + "<username>yangrong</username>"
		// + "<password>123456</password>" + "</script>" + "</head>"
		// + "<body>" + "<result>0</result>" + "<form>"
		// + "<banlce>1000</banlce>" + "<subID>36242519880716</subID>"
		// + "</form>" + "</body>" + "</html>";
		//
		// /*
		// * Test2 test = new Test2(); test.readStringXml(xmlString);
		// */
		// Map map = readStringXmlOut(xmlString);
		// Iterator iters = map.keySet().iterator();
		// while (iters.hasNext()) {
		// String key = iters.next().toString(); // 拿到键
		// String val = map.get(key).toString(); // 拿到值
		// System.out.println(key + "=" + val);
		// }
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("NGTP32.xml");

		Document doc = null;
		try {

			// 读取并解析XML文档
			// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			//
			// SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
			// Document document = reader.read(new File("User.hbm.xml"));
			// 下面的是通过解析xml字符串的
			System.out.println("as22");
			doc = DocumentHelper.parseText(inputStream2String(in));

			Element rootElt = doc.getRootElement(); // 获取根节点

			Object o = parseData(JSONTransTest.getObjects(), rootElt);
			System.out.println("val:" + JSON.toJSONString(o, true));

			// System.out.println("根节点：" + rootElt.getName()); // 拿到根节点的名称
			//
			// Iterator<Element> iter = rootElt.elementIterator();
			// Element e = null;
			// while (iter.hasNext()) {
			// e = iter.next();
			// System.out.println(e.getName());
			// String thismode = getXmlAttribute(e, "mode");
			//
			// }
		} catch (Exception e) {
			e.printStackTrace();

		}
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

		// 正常模式下值的显示方式是基于下一级的type来区分的
		switch (getXmlAttribute(e, "type")) {
		case "object":
			// 假如下级还需要被迭代,那么就送入迭代(不需要上方的调用好的方法)
			put.put(e.getName(), parseData(o, e));
			break;
		case "integer":
			// 这一级为数字,目前的话转成字符放入
			put.put(e.getName(), o.toString());
			break;
		case "utf8string":
			// 这一级为字符,目前的话转成字符放入
			// string 解的其实对应的是utfString ,需要另外解析一层
			// put.put(e.getName(), o.toString());

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
		case "null":
			// 这一级标记为null,写入字符null
			put.put(e.getName(), "null");
			break;
		case "byte":
			// 这一级标记为null,写入字符null
			put.put(e.getName(), "null");
			break;
		default:
			// 未知的,先直接装在里面
			put.put(e.getName(), o.toString());
			break;
		}

		return null;
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

	/**
	 * 迭代数据
	 * 
	 * @param formasn
	 * @param thisElt
	 * @return
	 */
	private static Object parseData(Object formasn, Element thisElt,boolean isArrayMode) {
		// 首先查看当前方法的模式 (mode),默认为空,即为正常模式
		// 2rd 第二及数据为第一级值(终点)
		// choies 选择 在得到非空节点后开始向下数据
		// array 数组模式
		if (formasn == null || thisElt == null) {
			System.out.println("内部编译错误,已忽略 在" + (thisElt!=null?thisElt.getName():"未知节点"));
			return null;
		}
		Object o = null;
		// 得到当前的模式
		String thismode = getXmllementMode(thisElt);

		// 首先判断是当前的模式,由于array在解包的时候使用一样的方法

		if (thismode.equals("normal")|| isArrayMode) {
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
				// 使用可以带默认值的
				funName = getXmllementFun(e);
				System.out.println("Funname  " + funName);
				// 首先判断下一级的模式,假如非正常模式直接扔到下一级
				if (!"normal".equals(getXmllementMode(e))) {
					put.put(e.getName(), parseData(formasn, e));
					continue;
				}
				try {
					o = TransformTest.invokeMethod(formasn, funName);
				} catch (Exception e1) {
					System.out.println("正常迭代的时候发生错误,无法找到转换的方法");
					e1.printStackTrace();
					continue;
//					return put;
				}
				parseNormalData(put, o, e);
			}
			return put;
		}
		if (thismode.equals("2ndValue")) {
			// 二次为值模式,这时候需要将唯一子集的值给予当前级
			try {
				// 第一次得到方法值
				o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));
				// 执行第二级方法
				o = TransformTest.invokeMethod(o, getXmlAttribute(thisElt, "ndfun"));

			} catch (Exception e1) {
				e1.printStackTrace();
			}
			return o.toString();
		}
		if (thismode.equals("array")) {
			// 数组模式,那么将数据组装成数据格式
			System.out.println("发现一个数组");
			List<Object> putlist = new ArrayList<Object>();
			// putlist.add(e)
			int size = 0;
			Object e =null;
			String choice=null;
			choice= getXmlAttribute(thisElt, "choice");
			try {
				if(choice==null){
//					//choice会影响选择,判断是否影响
					o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));						
				}else{
					o = formasn;
				}
				
				if(o==null){
					System.out.println("在数组内部没有获取到值");
					return putlist;
				}
				size = (int) TransformTest.invokeMethod(o, "getSize");
				System.out.println("["+thisElt.getName()+"] 数组长度为"+size);
				String type=getXmlAttribute(thisElt, "type");
				//当前模式是数组选择
				boolean arraymode= true;
				if("arraychoice".equals(type)){
					System.out.println("发现一个数组直接选择");
//					将结构标记为choice进行循环
						thisElt.addAttribute("mode", "choice");
						arraymode=false;
				}


				for (int i = 0; i < size; i++) {
					// 获取数组的对象
					e = TransformTest.invokeMethodForInteger(o, "get",i);
					putlist.add( parseData(e,thisElt,arraymode));
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
			List<Object> putlist = new ArrayList<Object>();
			// putlist.add(e)
			int size = 0;
			Object e =null;
			try {
				// 首先要获取数组长度
				o =  TransformTest.invokeMethod(formasn, getXmllementFun(thisElt) );
				size = (int) TransformTest.invokeMethod(o, "getSize");

				for (int i = 0; i < size; i++) {
					// 获取数组的对象
					e = TransformTest.invokeMethodForInteger(o, "get",0);
					//判断数据类型
					String type=getXmlAttribute(thisElt, "type");
					switch (type) {
					case "integer":
						e = TransformTest.invokeMethod(e, getXmlAttribute(thisElt, "ndfun"));
						putlist.add(e.toString());
						break;
					case "2ndvalue":
						e = TransformTest.invokeMethod(e,getXmllementFun(thisElt));
						e = TransformTest.invokeMethod(e, getXmlAttribute(thisElt, "ndfun"));
						putlist.add(e.toString());
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
			// 选择模式 ,这个时候会先确定选择的是哪个,然后把名字以map的key的形式作为2级key]
			// 二次为值模式,这时候需要将唯一子集的值给予当前级
			Map<String, Object> put = new HashMap<String, Object>();
			int choice_flag = -1;
			String type=getXmlAttribute(thisElt, "type");
			String choice=null;
			choice= getXmlAttribute(thisElt, "choice");
			try {
				// 首先要获取方法的选择标记
				// 第一次得到方法值,在数组直接选择模式时不启用
			 
				if(!"arraychoice".equals(type)){
					if(choice==null){
						//choice会影响选择,判断是否影响
						o = TransformTest.invokeMethod(formasn, getXmllementFun(thisElt));						
					}else{
						o = TransformTest.invokeMethod(formasn, getXmlAttribute(thisElt, "ndfun"));		
					}
				}
				else{
					o=formasn;
				}
				// 这个时候对象里有对选择的值的标定,执行获取值的方法
				choice_flag = (int) TransformTest.invokeMethod(o, getXmlAttribute(thisElt, "ndfun"));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			// 执行失败
			if (choice_flag == -1) {
				return null;
			}
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

				System.out.println("chisce_name: " + e.getName());
				// 找到当前标记 以 key:choiceKey:val的形式组装,其中第一级的key已经在上面赋完了
				put.put(e.getName(), parseData(o, e));
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
					o=parseUTFString(formasn);

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
			o = TransformTest.invokeMethod(o, "stringValue");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o.toString();

	}
}