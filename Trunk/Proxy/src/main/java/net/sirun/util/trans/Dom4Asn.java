package net.sirun.util.trans;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;

import net.sirun.bin.ProxyContorlList;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherData;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataUnencrypted;
import net.sirun.ngtp.ngtp_service_data.NGTPServiceData;
import net.sirun.test.TransformTest;
import net.sirun.util.NGTPUtil;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.oss.asn1.Choice;
import com.oss.asn1.Enumerated;
import com.oss.asn1.INTEGER;
import com.oss.asn1.SequenceOf;
import com.oss.metadata.EnumeratedInfo;

public class Dom4Asn {

	public static JSONObject getJSONObject() {
		String json = "{\"appAck\":\"1\",\"appAckRequired\":\"false\",\"messageType\":\"10\",\"serviceDataCoreMessage\":{\"downlink\":{\"configuration\":{\"configVersion\":\"25\",\"countries\":[{\"activated\":\"false\",\"addresses\":[{\"address\":{\"absolute\":{\"address\":{\"address_ascii\":\"02063024\"},\"networkID\":\"5\",\"validityRange\":\"2\"}},\"addressId\":\"1\",\"addressUsage\":\"4\"}],\"applicationConfig\":{\"eCall_psapType\":\"3\",\"eCall_requestCscNumber\":\"false\"},\"applications\":[\"25\",\"25\"],\"validCountryCode\":\"13\"}]},\"errorCodes\":[{\"alarmActive\":\"null\"},{\"genericError\":\"123\"}],\"genericParams\":[{\"key\":{\"id\":\"2004\"},\"value\":{\"boolVal\":\"true\"}},{\"key\":{\"id\":\"2\"},\"value\":{\"positions\":[{\"basicPos\":{\"latitude\":\"25\",\"longitude\":\"36666\"},\"extendedPos\":{\"altitudeMtr\":\"366\",\"fixtime\":{\"seconds\":\"264\"},\"gnssSpeedKmph\":\"497\",\"headingDeg\":\"114\",\"reliability\":{\"deadReckoning\":\"0\",\"differentialGPSAvailable\":\"1\",\"drCalibrated\":\"1\",\"drDistanceMtr\":\"26\",\"fixType\":\"4\",\"fullyDigitizedArea\":\"1\",\"hdopx10\":\"64\",\"insideDigitizedArea\":\"0\",\"matchedToDigitalMap\":\"2\",\"noOfSatellites\":\"47\"}}}]}}],\"genericText\":{\"text\":\"Good Week!\"},\"poiDataSet\":[{\"attributes\":[{\"key\":\"jnad\",\"value\":\"hello\"}],\"subject\":\"3rd\",\"useAsDestination\":\"true\"},{\"attributes\":[],\"subject\":\"asd\",\"useAsDestination\":\"false\"},{\"attributes\":[],\"subject\":\"2rd\",\"useAsDestination\":\"false\"}],\"remoteOperations\":{\"executionTrigger\":{\"externalTemperatureAboveDeg\":\"24\"},\"name\":\"16\",\"occurs\":\"15\",\"operationScriptVersion\":{\"majorVersion\":\"123\",\"minorVersion\":\"21\"},\"periodSecx10\":\"98\",\"remoteOperations\":[{\"initialWaitTimeSecx10\":\"12\",\"occurs\":\"36\",\"operationDesc\":{\"component\":\"PrintableString\",\"operationType\":\"5\"},\"operationTimeoutSec\":\"25\",\"periodSecx10\":\"123\",\"requiredVehicleStates\":\"1\",\"stopIfFail\":\"false\",\"waitForPreviousCommand\":\"true\"}]}}},\"testFlag\":\"true\"}";
		return JSONObject.parseObject(json);
	}

	public static String inputStream2String(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i = -1;
		while ((i = is.read()) != -1) {
			baos.write(i);
		}
		return baos.toString();
	}

	// 对象的存放地
	private static String classPath = "";

	private static Document loadDocument(String fileName) {

		// 初始化结构
		Document doc = null;
		// 解析的xml文件
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		try {
			// 读取并解析XML文档
			// SAXReader就是一个管道，用一个流的方式，把xml文件读出来
			// SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档
			// Document document = reader.read(new File("User.hbm.xml"));
			// 下面的是通过解析xml字符串的
			doc = DocumentHelper.parseText(inputStream2String(in));
			Element rootElt = doc.getRootElement();
			classPath = getXmlAttribute(rootElt, "asnclass");
		} catch (Exception e) {
			e.printStackTrace();

		}
		return doc;
	}

	/**
	 * 解析数据 将json 转为asn对象
	 * 
	 * @param json
	 * @return
	 */
	public static Object parseData(JSONObject json, String serviceName) {
		Object o = null;

		// 初始化DOM
		Document doc = null;
		switch (serviceName) {
		case "serviceData":
			doc = loadDocument("NGTP32.xml");
			o = new NGTPServiceData();
			break;
		case "dspt":
			doc = loadDocument("dspt.xml");
			o = new NGTPDispatcherData();
			break;
		case "dsptUn":
			doc = loadDocument("dsptUnencrypted.xml");
			o = new NGTPDispatcherDataUnencrypted();
			break;
		default:
			doc = loadDocument("NGTP32.xml");
			o = new NGTPDispatcherData();
			break;
		}

		return parseData(o, json, doc.getRootElement());
	}

	/**
	 * 解析数据 将json 转为asn对象
	 * 
	 * @param json
	 * @return
	 */
	public static byte[] parseServiceData2Asnbytes(String json) {
		JSONObject jo = null;
		try {
			jo = JSONObject.parseObject(json);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		Object o = parseData(jo, "serviceData");
		// ServiceDataAsnTrans.json2AsnAtServiceData(ServiceDataAsnTrans.asn2JsonAtServiceData(o));
		return NGTPUtil.getPer4ByteArray((NGTPServiceData) o);
	}

	 public static void main(String[] args) {
	System.out.println("222");
	
	 }

	/**
	 * 获取结构内的key值
	 * 
	 * @param e
	 * @param key
	 * @return
	 */
	private static String getXmlAttribute(Element e, String key) {
		if (e == null) {
			return null;
		}
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
	private static String getXmlElmentSetFun(Element thisElt) {
		String thisfun = getXmlAttribute(thisElt, "setfun");
		if (thisfun == null || "".equals(thisfun)) {
			byte[] e = thisElt.getName().getBytes();
			// 首字母大写
			e[0] -= 32;
			thisfun = "set" + new String(e);
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
	 * 解析当前级的数据,并将数据放入OBject里
	 * 
	 * @param ServiceData
	 *            Object
	 * @param JSONObject
	 * @param Element
	 * @return ServiceData Object
	 */
	private static Object parseData(Object o, JSONObject jo, Element thisElt) {
		// if(jo==null){
		// System.out.println();
		// }
		// 按照等级进行解析,在发现非基本类型后则迭代创建新的结构,并进入解析
		if (o == null || jo == null || jo.size() == 0 || thisElt == null) {
			System.out.print("异常数据或对象 [" + thisElt != null ? thisElt.getName() : "节点为空" + "]");
			o = null;
			return null;
		}
		String mode = null;
		// 首先判断是否正常的模式,假如不是,则特殊处理

		mode = getXmllementMode(thisElt);
		// if ("normal".equals(mode))

		switch (mode) {
		case "normal":
			// 形参
			o = parseNormalData(o, jo, thisElt);
			break;
		case "choice":
			o = parseChoiceData(o, jo, thisElt);
			break;
		case "2ndValue":
			o = parse2ndValueData(o, jo, thisElt);
			break;
		case "array":
			o = parseArrayData(o, jo, thisElt);
			break;
		case "2ndArray":
			o = parseArrayData(o, jo, thisElt);
			break;
		default:
			System.out.println("发现未识别的结构[" + mode + "]");
			break;

		}
		return o;

	}

	/**
	 * 解析选择结构数据(结构解析)
	 * 
	 * @param 上级
	 *            ServiceData Object
	 * @param 上级
	 *            JSONObject
	 * @param 本级
	 *            Element
	 * @return ServiceData Object
	 */
	private static Object parseChoiceData(Object o, JSONObject jo, Element thisElt) {
		if (thisElt.getName().equals("node")) {
			System.out.println();
		}
		String ename = thisElt.getName();
		// String value = jo.getString(ename);
		// 得到的选择是上层为解析的原包,所以需要先解开一层
		jo = jo.getJSONObject(ename);

		String selectchoiceName = null;
		String classNmae = null;
		// 装载类名
		String choiceHub = null;
		// load名称
		String choiceHubLoadName = null;
		// 模式
		String choiceMode = null;
		// 标准选择模式
		// 得到集成的类名称
		choiceHub = getXmlAttribute(thisElt, "choiceclass");
		// 假如说类名内带有$ 子类模式,说明属于数据arraychoice 模式,这时需要重置classHub的类名
		// 正常情况下load名称和使用类名保持一致
		choiceHubLoadName = choiceHub;
		boolean issubclass = issubclass(choiceHub);
		// 被误杀的解决办法.. 标记是否直接返回 在最后面
		boolean isNotSubMode = getXmlAttribute(thisElt, "subchoicemode") == null ? true : false;
		// 在type="arraychoice" 也是子模式
		issubclass = (issubclass || "arraychoice".equals(getXmlAttribute(thisElt, "type")));
		if (issubclass) {
			// System.out.println("!!!!!!!!!!!!!!mode:"+getXmllementMode(thisElt.element(selectchoiceName)));
			// 使用装载类
			choiceHub = getXmlAttribute(thisElt, "class");
			// 出现拆分,显示和使用名称会有区别 (重载)
			choiceHubLoadName = getXmlAttribute(thisElt, "choiceclass");
			;
		}

		// 得到选择的对象的名称
		selectchoiceName = jo.keySet().toArray()[0].toString();

		// 根据类型分别处理
		String type = getXmlAttribute(thisElt.element(selectchoiceName), "type");
		choiceMode = getXmllementMode(thisElt.element(selectchoiceName));
		// 得到选择的子类型
		// if ("value".equals(thisElt.getName())) {
		// System.out.println();
		// }
		Object newo = null;
		try {
			switch (type) {
			case "object":
				/*
				 * 分2种情况,直接是choice--> object 默认模式,另外还有 choice-->Array<object>
				 * 此时会在节点上标记mode="array"
				 */
				// 获取对象的允许类名
				// Object s = TransformTest.newObject(clazz, objects)
				classNmae = getXmlAttribute(thisElt.element(selectchoiceName), "class");
				// 根据模式进行放入放入选择类的属性
				switch (choiceMode) {
				case "normal":
					// 正常模式
					// 创建选择类
					newo = TransformTest.newObject(classPath + "." + classNmae);
					parseData(newo, jo.getJSONObject(selectchoiceName), thisElt.element(selectchoiceName));
					break;
				case "array":
					// 数组模式
					// 创建选择类
					newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt.element(selectchoiceName), "arrayclass"));
					// 加入数组设置属性,用于返回非置入上层对象
					newo = parseArrayData(newo, jo, thisElt.element(selectchoiceName), true);
					break;
				default:
					System.out.println("[WANR] choice 错误的模式 [" + thisElt.getName() + "]");
					parseData(newo, jo.getJSONObject(selectchoiceName), thisElt.element(selectchoiceName));
					break;
				}
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				break;
			case "null":
				// 获取对象的允许类名
				// 创建选择类 (OSS的 integer 封装类)
				newo = TransformTest.newObject("com.oss.asn1.Null");
				// 放入内部数据
				// TransformTest.invokeMethod(newo, "setValue",
				// Long.valueOf(jo.getString(selectchoiceName)));
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				break;
			case "utf8string":
				// 获取对象的允许类名
				// 创建选择类 (OSS的 integer 封装类)
				newo = TransformTest.newObject("com.oss.asn1.UTF8String");
				// 放入内部数据 byte
				TransformTest.invokeMethod(newo, "setValue", jo.getString(selectchoiceName).toString());
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				break;
			case "integer":
				// 获取对象的允许类名
				// 创建选择类 (OSS的 integer 封装类)
				newo = TransformTest.newObject("com.oss.asn1.INTEGER");
				// 放入内部数据
				TransformTest.invokeMethod(newo, "setValue", Long.valueOf(jo.getString(selectchoiceName)));
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				break;
			case "printablestring":
				// System.out.println("[choice] 选择尚未实现  printablestring");
				// 获取对象的允许类名
				// 创建选择类 (OSS的 integer 封装类)
				newo = TransformTest.newObject("com.oss.asn1.PrintableString");
				// 放入内部数据 byte
				TransformTest.invokeMethod(newo, "setValue", jo.getString(selectchoiceName).toString());
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				break;
			case "byte":
				// 获取对象的允许类名
				// 创建选择类 (OSS的 integer 封装类)
				newo = TransformTest.newObject("com.oss.asn1.OctetString");
				// 放入内部数据 byte
				TransformTest.invokeMethod(newo, "setValue", NGTPUtil.parseHstring(jo.getString(selectchoiceName)));
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				break;
			case "boolean":
				// 获取对象的允许类名
				// 创建选择类 (OSS的 integer 封装类)
				newo = TransformTest.newObject("com.oss.asn1.BOOLEAN");
				// 放入内部数据
				TransformTest.invokeMethod(newo, "setValue", Boolean.valueOf(jo.getString(selectchoiceName)));
				// 创建choice类
				newo = TransformTest.invokeStaticMethod(classPath + "." + choiceHubLoadName, "create" + choiceHub + "With" + firstUper(selectchoiceName), newo);
				// 放入到主对象内
				// 抽调放到最后
				// TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt),
				// newo);
				break;
			default:
				System.out.println("[choice] 未知类型数据略过  " + type);
				break;
			}
			// 在子模式下是不会将数据放入到主对象内的 前面是被误杀的解决标记
			if (isNotSubMode && issubclass) {
				// 直接返回
				return newo;
			} else {
				if (!isEmptyComponents(newo)) {
					// 放入到主对象内
					TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] xml choice Class 未填写 [" + thisElt.getName() + "]");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 选择 转换错误 [" + thisElt.getName() + "]");
			e.printStackTrace();
		}

		return o;
	}

	/**
	 * 检测传入是否是子类模式,假如是 NGTPDownlinkCore$ErrorCodes -->ErrorCodes
	 * 
	 * @param classname
	 * 
	 * @return 是 TRUE
	 */
	private static boolean issubclass(String classname) {
		String cs[] = classname.split("\\$");
		if (cs.length == 2) {
			return true;
		}

		return false;
	}

	/**
	 * 将传入字符的首字母大写
	 * 
	 * @param str
	 * @return
	 */
	private static String firstUper(String str) {
		byte bytes[] = str.getBytes();
		bytes[0] -= 32;
		return new String(bytes);
	}

	/**
	 * 解析数组结构数据(结构解析)
	 * 
	 * @param ServiceData
	 *            Object
	 * @param JSONObject
	 * @param Element
	 * @param isParsePaent
	 *            设置是否将数据置入上层,在选择时需要使用,其他时刻使用parseArrayData(Object o, JSONObject
	 *            jo, Element thisElt)
	 * @return ServiceData Object
	 */
	private static Object parseArrayData(Object o, JSONObject jo, Element thisElt, boolean isParsePaent) {

		String ename = thisElt.getName();
		System.out.println("解析数组 ["+ename+"]");
		if("pearlChain".equals(ename)){
			System.out.println();
		}
		// 得到的选择是上层为解析的原包,所以需要先解开一层 数组数据被转换为 jsonarray
		JSONArray ja = null;
		try {
			ja = jo.getJSONArray(ename);
			if (ja == null || ja.size() == 0) {
				System.out.println("无法解释节点,数据为空或者无法将JSON对象取转换为Array [" + thisElt.getName() + "]");
				o = null;
				return null;
				// return o;

			}
		} catch (Exception e) {
			System.out.println("无法解释节点,数据为空或者无法将JSON对象取转换为Array [" + thisElt.getName() + "]");
			e.printStackTrace();
			o = null;

			return null;

			// return o;
		}

		if ("errorCodes".equals(ename)) {
			System.out.println();
		}
		String type = getXmlAttribute(thisElt, "type");
		// 将未填写致为 对象格式
		type = type == null ? "object" : type;
		Object arrayHub = null;
		Object arrayChild = null;
		Iterator it = null;
		// 基于数组的格式进行解析数据
		try {
			switch (type) {
			case "object":
				it = ja.iterator();
				// 首先,创建一个数组装载类
				arrayHub = TransformTest.newObject(loadXmlAttribute4Class(thisElt, "arrayclass"));
				while (it.hasNext()) {
					jo = (JSONObject) it.next();
					// 创建数组内部Object类
					arrayChild = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
					// 将对象按照正常的对象模式进行解析
					parseNormalData(arrayChild, jo, thisElt);
					// 将得到的装载好的对象放入到hub里面
					TransformTest.invokeMethod(arrayHub, "add", arrayChild);
				}

				/*
				 * 设置是否需要解析到上层,在一般时刻不会用到 默认值为 falas 即需要装载
				 */
				if (!isParsePaent) {
					if (!isEmptyComponents(arrayHub)) {
						// 利用数组装载类进行装载数据到上层对象
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), arrayHub);
					}
				} else {
					return arrayHub;
				}
				break;

			case "integer":
				// 创建数组装类
				arrayHub = TransformTest.newObject(loadXmlAttribute4Class(thisElt, "arrayclass"));
				it = ja.iterator();
				// 创建一个用于传值解析的json map
				JSONObject tejo = new JSONObject();
				while (it.hasNext()) {
					Object os = it.next();
					// 创建数组内部Object类 (未填写,使用默认的type携带的类型 INTEGER)
					arrayChild = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
					System.out.println();
					// 放入数据
					TransformTest.invokeMethod(arrayChild, "setValue", Integer.valueOf(os.toString()));
					// 整合
					TransformTest.invokeMethod(arrayHub, "add", arrayChild);

				}
				if (!isParsePaent) {
					if (!isEmptyComponents(arrayHub)) {
						// 利用数组装载类进行装载数据到上层对象
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), arrayHub);
					}
				} else {
					return arrayHub;
				}
				break;
			/*
			 * 数组->枚举 解析方法
			 */
			case "2ndValue":
				// 创建数组装类
				arrayHub = TransformTest.newObject(loadXmlAttribute4Class(thisElt, "arrayclass"));
				it = ja.iterator();
				// 创建一个用于传值解析的json map
				// JSONObject tejo = new JSONObject();
				while (it.hasNext()) {
					Object os = it.next();
					// 创建数组内部Object类 (未填写,使用默认的type携带的类型 INTEGER)
					// arrayChild =
					// TransformTest.newObject(loadXmlAttribute4Class(thisElt));
					// 放入数据
					arrayChild = new Object();
					//字符串整合
//					arrayChild = TransformTest.invokeStaticMethod(loadXmlAttribute4Class(thisElt), "valueOf", Long.valueOf(os.toString()));
					arrayChild = TransformTest.invokeStaticMethod(loadXmlAttribute4Class(thisElt), "valueOf", Long.valueOf(string2ndValue(loadXmlAttribute4Class(thisElt),os.toString())));

					// 整合
					TransformTest.invokeMethod(arrayHub, "add", arrayChild);

				}
				if (!isParsePaent) {
					if (!isEmptyComponents(arrayHub)) {
						// 利用数组装载类进行装载数据到上层对象
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), arrayHub);
					}
				} else {
					return arrayHub;
				}
				break;
			case "2ndArray":
				// 创建数组装类
				arrayHub = TransformTest.newObject(loadXmlAttribute4Class(thisElt, "arrayclass"));
				it = ja.iterator();
				// 创建一个用于传值解析的json map
				// JSONObject tejo = new JSONObject();
				while (it.hasNext()) {
					Object os = it.next();
					// 创建数组内部Object类 (未填写,使用默认的type携带的类型 INTEGER)
					// arrayChild =
					// TransformTest.newObject(loadXmlAttribute4Class(thisElt));
					// 放入数据
					arrayChild = new Object();
					//字符串整合
//					arrayChild = TransformTest.invokeStaticMethod(loadXmlAttribute4Class(thisElt), "valueOf", Long.valueOf(os.toString()));
					arrayChild = TransformTest.invokeStaticMethod(loadXmlAttribute4Class(thisElt), "valueOf", Long.valueOf(string2ndValue(loadXmlAttribute4Class(thisElt),os.toString())));
					// 整合
					TransformTest.invokeMethod(arrayHub, "add", arrayChild);

				}
				if (!isParsePaent) {
					if (!isEmptyComponents(arrayHub)) {
						// 利用数组装载类进行装载数据到上层对象
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), arrayHub);
					}
				} else {
					return arrayHub;
				}
				break;
			/*
			 * 整合 arraychoice 这种数组每个值都是选择
			 */
			case "arraychoice":
				arrayHub = TransformTest.newObject(loadXmlAttribute4Class(thisElt, "arrayclass"));
				// arrayChild = TransformTest.n
				it = ja.iterator();
				JSONObject njo = new JSONObject();
				while (it.hasNext()) {
					// 创建数组内部Object类 (未填写,使用默认的type携带的类型 INTEGER)
					arrayChild = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
					njo.put(thisElt.getName(), it.next());
					// 放入数据 依赖返回
					arrayChild = parseChoiceData(arrayChild, njo, thisElt);
					// 整合
					TransformTest.invokeMethod(arrayHub, "add", arrayChild);
				}

				if (!isParsePaent) {
					if (!isEmptyComponents(arrayHub)) {
						// 利用数组装载类进行装载数据到上层对象
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), arrayHub);
					}
				} else {
					return arrayHub;
				}
				break;
			default:
				System.out.println("[ array ] 发现尚未处理的类型:" + type + " 在[" + ename + "]");
				break;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ array ] 错误:" + type + " 在[" + ename + "] " + thisElt.getPath());
			e.printStackTrace();
		}
		return o;

	}

	/**
	 * 解析数组结构数据(结构解析)
	 * 
	 * @param ServiceData
	 *            Object
	 * @param JSONObject
	 * @param Element
	 * @return ServiceData Object
	 */
	private static Object parseArrayData(Object o, JSONObject jo, Element thisElt) {
		return parseArrayData(o, jo, thisElt, false);

	}
	/*
	 *检查当前的枚举配置是否基于索引的 
	 */
	private final static boolean isnum = ProxyContorlList.getPropertyForString("Proxy_TransASN_2ndValue").equalsIgnoreCase("enum");
	
	
	/**
	 * 得到当前枚举类的ValueOF所对应的索引值
	 * 
	 * @param Object
	 *            当前对象
	 * @param i
	 *            当前值
	 */
	private static String string2ndValue(String oclassName, String str) {
		Object o=null;
		if(isnum){
			return str;
		}
		
		try {
			if(oclassName.equals("AvgFuelConsumptionCl")){
				System.out.println();
			}
			// 获取静态标签
			o = TransformTest.invokeStaticMethod( oclassName, "getStaticTypeInfo");
			if (o instanceof EnumeratedInfo) {
			} else {
				System.out.println(oclassName+"无法转换枚举值!,返回携带的内容");
				return str;
			}
			// 获取内容list
			o = TransformTest.invokeMethod(o, "getEnumerationList");
			// 获取内容字符
			o = TransformTest.invokeMethod(o, "getMemberValue", str);
		} catch (Exception e) {
			System.out.println(oclassName+" 转换失败,返回输入内容:" + str);
			e.printStackTrace();
			return str;
		}
		return o.toString();
	}
	
//	private static 

	/**
	 * 解析2级直接值模式数据结构(结构解析)
	 * 
	 * @param ServiceData
	 *            Object
	 * @param JSONObject
	 * @param Element
	 * @return ServiceData Object
	 */
	private static Object parse2ndValueData(Object o, JSONObject jo, Element thisElt) {
		// 2ndvalue 模式 是指 当前条目的下一级就为值,(枚举类型)
		// nsd.setMessageType(ServiceMessageType.valueOf(10));

		String ename = thisElt.getName();
		String value = jo.getString(ename);
		String type = getXmlAttribute(thisElt, "type");

		try {
			// 针对不同的类型进行特殊处理
			switch (type) {
			case "integer":
				// o = TransformTest.invokeMethod(o,
				// getXmlElmentSetFun(thisElt),
				// Boolean.getBoolean(jo.getString(ename)));
				if (value == null || "".equals(value) || "null".equals(type)) {
					System.out.println("无法解释节点,数据为空 [" + thisElt.getName() + "]");
					o = null;

					return o;
				} else {
					System.out.println(" 解析节点 [" + thisElt.getName() + "]");
				}
				if ("minorVersion".equals(thisElt.getName())) {
					System.out.println();
				}
				// 两种处理方法 根据setmode 进行区分
				/*
				 * 一共有2种,分别是 2ndValue 二级值模式 另外还有 emun 枚举类型 (默认类型)
				 */
				String setmode = getXmlAttribute(thisElt, "setmode");
				if (setmode != null && "2ndValue".equals(setmode)) {
					// 创建一个标准对象
					Object s = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
					// 将值赋予
					TransformTest.invokeMethod(s, "setValue", Long.valueOf(value));

					// 主对象接收对象
					// TransformTest.invokeMethod(o,
					// getXmlElmentSetFun(thisElt), s);
					if (!isEmptyComponents(s)) {
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), s);
					}
				} else {

					// 枚举类型
					// 首先得到即将set的值对象
					//使用字符串来并转换值
					Object s = TransformTest.invokeStaticMethod(loadXmlAttribute4Class(thisElt), "valueOf", Long.valueOf(string2ndValue(loadXmlAttribute4Class(thisElt),value)));
					// 主对象接收对象
					if (!isEmptyComponents(s)) {
						TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), s);
					}
				}

				break;

			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("[2ndValue Error]  EltName: " + thisElt.getName() + " path: [" + thisElt.getPath() + "]");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return o;
	}

	/**
	 * 返回当前节点的class 名称 假如当前节点为空 则根据type 进行返回<br>
	 * 
	 * type: integer --> com.oss.asn1.INTEGER<br>
	 * type: boolean ->> <br>
	 * type: utf8string->>com.oss.asn1.UTF8String16
	 * 
	 * @param thisElt
	 * @return 不符合任何条件 , 则返回 预定义path+".null"
	 */

	private static String loadXmlAttribute4Class(Element thisElt, String classTypeName) {
		if (getXmlAttribute(thisElt, classTypeName) == null) {
			String type = getXmlAttribute(thisElt, "type");
			if (type == null) {
				System.out.println("[load xml Class]  [" + thisElt.getName() + "] Element class null:" + thisElt.getPath() + " -> [" + thisElt.getName() + "]");
			}
			// 假如是基本数据类型切没有定义指定类,则返回基础数据类型
			switch (type) {
			case "integer":
				System.out.println("[load xml Class] [" + thisElt.getName() + "] Element class null,but type is [ " + type + "] return com.oss.asn1.INTEGER");
				return "com.oss.asn1.INTEGER";
			case "byte":
				System.out.println("[load xml Class] [" + thisElt.getName() + "] Element class null,but type is [ " + type + "] return com.oss.asn1.INTEGER");
				return "com.oss.asn1.OctetString";
			case "utf8string":
				System.out.println("[load xml Class] [" + thisElt.getName() + "] Element class null,but type is [ " + type + "] return com.oss.asn1.UTF8String16");
				return "com.oss.asn1.UTF8String16";
			case "printablestring":
				System.out.println("[load xml Class] [" + thisElt.getName() + "]  Element class null,but type is [ " + type + "] return com.oss.asn1.PrintableString");
				return "com.oss.asn1.PrintableString";
			case "Null":
				System.out.println("[load xml Class] [" + thisElt.getName() + "]  Element class null,but type is [ " + type + "] return com.oss.asn1.Null");
				return "com.oss.asn1.Null";
			case "bitstring":
				System.out.println("[load xml Class] [" + thisElt.getName() + "]  Element class null,but type is [ " + type + "] return com.oss.asn1.Null");
				return "com.oss.asn1.BitString";
			default:
				System.out.println("[load xml Class] [" + thisElt.getName() + "]  Element class null, and type is not reset :[" + type + "] ");
				break;
			}
		}

		return classPath + "." + getXmlAttribute(thisElt, classTypeName);
	}

	/**
	 * 返回当前节点的class 名称 假如当前节点为空 则根据type 进行返回<br>
	 * 
	 * type: integer --> com.oss.asn1.INTEGER<br>
	 * type: boolean ->> <br>
	 * 
	 * @param thisElt
	 * @return 不符合任何条件 , 则返回 预定义path+".null"
	 */

	private static String loadXmlAttribute4Class(Element thisElt) {
		return loadXmlAttribute4Class(thisElt, "class");
	}

	/**
	 * 解析正常结构的数据,并将数据对象返回(结构解析)
	 * 
	 * @param 同级
	 *            ServiceData Object
	 * @param 同级
	 *            JSONObject
	 * @param 同级
	 *            Element
	 * @return ServiceData Object
	 */
	private static Object parseNormalData(Object o, JSONObject jo, Element thisElt) {
		String mode = null;
		// 根据结构进行循环读取
		Iterator<Element> it = thisElt.elementIterator();
		Element e = null;
		String type = null;
		while (it.hasNext()) {
			e = it.next();
//			System.out.println("解释:[" + e.getName() + "]");
			mode = getXmllementMode(e);
			// 验证解析的子节点是基本类型且模式为正常

			// 首先验证他的子节点模式
			if (mode.equals("normal")) {
				// 再验证是否是基本数据类型,基本数据类型可以直接进行处理
				type = getXmlAttribute(e, "type");
				if (isBaseTypes(type)) {
					// 是基本数据类型 则直接解析,否则则继续拆分
					parseBaseTypeData(o, jo, e);
				} else {
					// 不是基本数据类型则 单独按类型进行处理
					switch (type) {
					case "object":
						// 将子节点是object的数据放入到对象内
						try {
							String ename = e.getName();
							System.out.println("Debug:" + ename);
							// if(ename.equals("operationScriptVersion")){
							// }
							Object newo = TransformTest.newObject(classPath + "." + getXmlAttribute(e, "class"));
							// 三个属性都进行解析了
							parseData(newo, jo.getJSONObject(ename), e);
							// 形参 newo
							// 将数据放入到上级内
							if (!isEmptyComponents(newo)) {
								TransformTest.invokeMethod(o, getXmlElmentSetFun(e), newo);
							}
						} catch (ClassNotFoundException e1) {
							e1.printStackTrace();
						} catch (ClassCastException e2) {
							System.out.println("无法解释节点,数据为空或者无法将JSON对象取转换为Object [" + thisElt.getName() + "]");
							e2.printStackTrace();
						}

						catch (Exception e1) {
							e1.printStackTrace();
						}

						break;
					default:
						System.out.println("[ERROR] 在基本数据类型拆分时发现无法解释的结构:[ " + type + " ]");
						break;
					}

				}

			} else {
				// 非正常模式,直接转到相应的处理模式上
				parseData(o, jo, e);
			}

		}
		return o;
	}

	private static Enumeration<?> getEnumeration(Object o) {
		if (o == null) {
			return null;
		}

		Enumeration ee = null;
		try {
			// 数组的 使用 elements 来获取组件, 对象则使用 enumeratedComponents来进行获取 枚举的 将不获取内部组建
			if (o instanceof Enumerated) {
				return null;
			}
			if (o instanceof INTEGER) {
				return null;
			}
			
			if(o instanceof Choice){
				return null;
			}
			if (o instanceof SequenceOf) {
				ee = (Enumeration) TransformTest.invokeMethod(o, "elements");
			} else {
				ee = (Enumeration) TransformTest.invokeMethod(o, "enumeratedComponents");
			}
			// bpc.elements()
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ee;

	}

	private static boolean isEmptyComponents(Object o) {
		Enumeration ee = getEnumeration(o);
		if(ee==null){
			return false;
		}
		// 检测当前实体内的零件,假如发现不为null的,那么放过
		boolean rest = false;
		while (ee.hasMoreElements()) {
			o = ee.nextElement();
			rest = rest | o != null ;
		}
		return !rest;
	}

	/**
	 * 
	 * 解析基本数据类型数据(类型解析)
	 * 
	 * @param 上级
	 *            ServiceData Object
	 * @param 上级
	 *            JSONObject
	 * @param 同级
	 *            Element
	 * @return ServiceData Object
	 */
	private static Object parseBaseTypeData(Object o, JSONObject superjo, Element thisElt) {
		String ename = thisElt.getName();
		// 当前级的value
		String value = superjo.getString(ename);
		String type = getXmlAttribute(thisElt, "type");

		if (type == null) {
			System.out.println("Error:[" + ename + "]的类型为空,略过");
			return o;
		}
		if (value == null || "".equals(value)) {
			System.out.println("Error:[" + ename + "]的值为空,略过");
			return o;
		}
		if ("fixtime".equals(thisElt.getName())) {
			System.out.println();
		}
		Object newo = null;
		try {
			// 针对不同的类型进行特殊处理
			switch (type) {
			case "boolean":
				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), Boolean.parseBoolean(value));
				break;
			case "integer":
				// 使用setValue 的方式进行赋值
				newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
				TransformTest.invokeMethod(newo, "setValue", Integer.valueOf(value));
				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
				break;
			case "utf8string":
				// 使用setValue 的方式进行赋值
				newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
				TransformTest.invokeMethod(newo, "setValue", String.valueOf(value));
				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
				break;
			case "byte":
				// 使用setValue 的方式进行赋值
				newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
				TransformTest.invokeMethod(newo, "setValue", NGTPUtil.parseHstring(value));
				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
				break;
			case "printablestring":
				// 使用setValue 的方式进行赋值
				newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
				TransformTest.invokeMethod(newo, "setValue", String.valueOf(value));
				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
				break;
			case "null":
				// 当前传入的是为Null的对象
				newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
				// TransformTest.invokeMethod(newo, "setValue",
				// String.valueOf(value));
				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
			case "bitstring":
				// 首先构造外层包装类
				newo = TransformTest.newObject(loadXmlAttribute4Class(thisElt));
				// 构造bitstring对象 typeValue 是指向了一个不可大的位置以获取默认的 对象路径
				// Object tempo =
				// TransformTest.newObject(loadXmlAttribute4Class(thisElt,"typeValue"));
				JSONObject jo = JSON.parseObject(value);
				// 导入2个固定类型值
				TransformTest.invokeMethod(newo, "setSignificantBits", Integer.valueOf(jo.getString("sigBits")));
				JSONArray jas= jo.getJSONArray("value");
				byte [] bytes = new byte[jas.size()];
				int i=0;
				for(Object oas :jas){
					bytes[i++]=(byte)(int)Integer.valueOf(oas.toString());
				}
				TransformTest.invokeMethod(newo, "setValue",bytes );
				// TransformTest.invokeMethod(newo, "setValue",
				// String.valueOf(value));
				// TransformTest.invokeMethod(newo, getXmlElmentSetFun(thisElt),
				// tempo);

				TransformTest.invokeMethod(o, getXmlElmentSetFun(thisElt), newo);
			default:
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return o;
	}

	/**
	 * 判断模式是否是基本数据类型
	 * 
	 * @param mode
	 * @return isBaseTypes
	 */
	private static boolean isBaseTypes(String type) {
		// 假如type是空则返回true
		// octetbytes
		final String baseTypes[] = new String[] { "integer", "utf8string", "printablestring", "boolean", "Null", "null", "printablestring", "bitstring", "byte" };

		if (type == null) {
			return true;
		}
		for (String baseType : baseTypes) {
			if (baseType.equalsIgnoreCase(type)) {
				return true;
			}
		}
		return false;
	}

}
