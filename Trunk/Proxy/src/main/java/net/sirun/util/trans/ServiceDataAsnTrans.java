package net.sirun.util.trans;

import net.sirun.bin.ProxyContorlList;
import net.sirun.ngtp.ngtp_service_data.DtcStatusBitsIso14229;
import net.sirun.ngtp.ngtp_service_data.NGTPServiceData;
import net.sirun.test.JSONTransTest;
import net.sirun.util.ByteUtil;
import net.sirun.util.NGTPUtil;

import com.oss.asn1.BitString;

public class ServiceDataAsnTrans {

	/**
	 * 将asn的字节码转换为json字符串
	 * 
	 * @return json 字符串(压缩未格式化)
	 */
	public static String asn2JsonAtServiceData(byte[] bytes) {
		return asn2JsonAtServiceData(bytes, false);
	}

	/**
	 * 将asn的字节码转换为json字符串 ,同时格式化json ,默认 sirun mode
	 * 
	 * @return json 字符串
	 */
	public static String asn2JsonAtServiceData(byte[] bytes, boolean jsonFormat) {
		return asn2JsonAtServiceData(bytes, jsonFormat, TransMode.sirun);
	}

	/**
	 * 将asn的字节码转换为json字符串 ,同时格式化json
	 * 
	 * @return json 字符串
	 */
	public static String asn2JsonAtServiceData(byte[] bytes, boolean jsonFormat, TransMode tm) {
		if (TransMode.wcar == tm) {
			// Sirun-->wcar
			String bs = ByteUtil.toBinaryString(bytes).replace(" ", "");
			bytes = ByteUtil.toBytesForBinaryString("0" + bs.substring(0, bs.length() - 1));
		}
		Object o = NGTPUtil.parseHexToObject(bytes, new NGTPServiceData());
		return asn2JsonAtServiceData(o, jsonFormat);

	}

	/**
	 * 将可见Hex字符串转换为json
	 * 
	 * @param str
	 * @return json 字符串(压缩未格式化)
	 */
	public static String asn2JsonAtServiceData(String str) {
		return asn2JsonAtServiceData(NGTPUtil.parseHstring(str));
	}

	/**
	 * 将asn的对象直接转换为json对象
	 * 
	 * @param asnobject
	 * @return json 字符串(压缩未格式化)
	 */
	public static String asn2JsonAtServiceData(Object asnobject) {
		return Dom4json.parseData(asnobject, false);

	}

	/**
	 * 将asn的对象直接转换为json对象
	 * 
	 * @param asnobject
	 * @return json 字符串
	 */
	public static String asn2JsonAtServiceData(Object asnobject, boolean jsonFormat) {
		return Dom4json.parseData(asnobject, jsonFormat);

	}

	/**
	 * 将Service Data JSON对象 转为ASN对象
	 * 
	 * @exception json
	 *                解析失败 将会返回null
	 * 
	 * @param json
	 *            字符串
	 * @return asn字节数组
	 */
	public static byte[] json2AsnAtServiceData(String json) {
		return Dom4Asn.parseServiceData2Asnbytes(json);
	}

	/**
	 * 将Service Data JSON对象 转为ASN对象<br>
	 * 默认是 sirun mode
	 * 
	 * @exception json
	 *                解析失败会提示 "JSON FORMAT ERROR"
	 * @param json
	 *            字符串
	 * @return asn字节数组 十六进制字符串
	 */
	public static String json2AsnAtServiceDataHexString(String json) {

		return json2AsnAtServiceDataHexString(json, TransMode.sirun);
	}

	/**
	 * 将Service Data JSON对象 转为ASN对象<br>
	 * 默认是 sirun mode
	 * 
	 * @exception json
	 *                解析失败会提示 "JSON FORMAT ERROR"
	 * @param json
	 *            字符串
	 * @return asn字节数组 十六进制字符串
	 */
	public static String json2AsnAtServiceDataHexString(String json, TransMode tm) {
		byte[] bytes = Dom4Asn.parseServiceData2Asnbytes(json);
		if (bytes == null) {
			return "JSON FORMAT ERROR";
		}
		if (TransMode.wcar == tm) {
			// wcar-->sirun
			bytes = ByteUtil.toBytesForBinaryString(ByteUtil.toBinaryString(bytes).substring(1) + "0");
		}

		return NGTPUtil.toByteArray(bytes);
	}

	/**
	 * 测试方法
	 * 
	 */
	public static void test() {
		// 测试正反转
		// Dom4Asn.main(null);
	}

	/**
	 * 得到一个仅供测试的JSON数据格式
	 * 
	 * @return json 字符串
	 */
	public static String getTestJSON() {
		return "{\"appAck\":\"1\",\"appAckRequired\":\"false\",\"messageType\":\"10\",\"serviceDataCoreMessage\":{\"downlink\":{\"configuration\":{\"configVersion\":\"25\",\"countries\":[{\"activated\":\"false\",\"addresses\":[{\"address\":{\"absolute\":{\"address\":{\"address_ascii\":\"02063024\"},\"networkID\":\"5\",\"validityRange\":\"2\"}},\"addressId\":\"1\",\"addressUsage\":\"4\"}],\"applicationConfig\":{\"eCall_psapType\":\"3\",\"eCall_requestCscNumber\":\"false\"},\"applications\":[\"25\",\"25\"],\"validCountryCode\":\"13\"}]},\"errorCodes\":[{\"alarmActive\":\"null\"},{\"genericError\":\"123\"}],\"genericParams\":[{\"key\":{\"id\":\"2004\"},\"value\":{\"boolVal\":\"true\"}},{\"key\":{\"id\":\"2\"},\"value\":{\"positions\":[{\"basicPos\":{\"latitude\":\"25\",\"longitude\":\"36666\"},\"extendedPos\":{\"altitudeMtr\":\"366\",\"fixtime\":{\"seconds\":\"264\"},\"gnssSpeedKmph\":\"497\",\"headingDeg\":\"114\",\"reliability\":{\"deadReckoning\":\"0\",\"differentialGPSAvailable\":\"1\",\"drCalibrated\":\"1\",\"drDistanceMtr\":\"26\",\"fixType\":\"4\",\"fullyDigitizedArea\":\"1\",\"hdopx10\":\"64\",\"insideDigitizedArea\":\"0\",\"matchedToDigitalMap\":\"2\",\"noOfSatellites\":\"47\"}}}]}}],\"genericText\":{\"text\":\"Good Week!\"},\"poiDataSet\":[{\"attributes\":[{\"key\":\"jnad\",\"value\":\"hello\"}],\"geoCoordinates\":{\"latitude\":\"22336664\",\"longitude\":\"1359644155\"},\"phone1\":{\"number\":\"18643278xx\",\"type\":\"1\"},\"phone2\":{\"number\":\"18643278xx\",\"type\":\"1\"},\"phone3\":{\"number\":\"18643278xx\",\"type\":\"1\"},\"phone4\":{\"number\":\"18643278xx\",\"type\":\"1\"},\"subject\":\"3rd\",\"useAsDestination\":\"true\"}],\"remoteOperations\":{\"executionTrigger\":{\"externalTemperatureAboveDeg\":\"24\"},\"name\":\"16\",\"occurs\":\"15\",\"operationScriptVersion\":{\"majorVersion\":\"123\",\"minorVersion\":\"21\"},\"periodSecx10\":\"98\",\"remoteOperations\":[{\"initialWaitTimeSecx10\":\"12\",\"occurs\":\"36\",\"operationDesc\":{\"component\":\"PrintableString\",\"operationType\":\"5\"},\"operationTimeoutSec\":\"25\",\"periodSecx10\":\"123\",\"requiredVehicleStates\":\"1\",\"stopIfFail\":\"false\",\"waitForPreviousCommand\":\"true\"}]}}},\"testFlag\":\"true\"}";
	}

	static {
		ProxyContorlList.initContorlList();
		System.out.println("static Load");
	}

	public static void main(String s[]) {
		// test object
		// System.out.println(asn2JsonAtServiceData(JSONTransTest.getObjects()));
		// // test byte
		// byte[] bytes = NGTPUtil.getPer4ByteArray(JSONTransTest.getObjects());
		// System.out.println("========bytes:");
		// NGTPUtil.printByteArray(bytes);
		// asn2JsonAtServiceData(bytes);
		// // test json format
		// Node.createNodeWithId(id)
		BitString bs = new BitString();
		// bs.se
		net.sirun.ngtp.ngtp_service_data.TriggerType.valueOf(2);
		DtcStatusBitsIso14229 dsb = new DtcStatusBitsIso14229();
		// dsb.
		// asn2JsonAtServiceData(bytes, true);
		NGTPUtil.printByteArray(Dom4Asn.parseServiceData2Asnbytes(asn2JsonAtServiceData(JSONTransTest.getUplinkObjects())));
		// NGTPUtil.printByteArray(DsptAsnTrans.toASNByUnencrypted("{\"messageCreationTime\":{\"seconds\":\"456488720\",\"millis\":\"1\"},\"messageTimeToLive\":\"0\",\"msgCounter\":{\"uplinkCount\":\"1\",\"downlinkCount\":\"0\"},\"vehicleIdentification\":{\"vin\":{\"isowmi\":\"LB0\",\"isovds\":\"000000\",\"isovisModelyear\":\"0\",\"isovisSeqPlant\":\"Y000001\"}}}"));

	}
}
