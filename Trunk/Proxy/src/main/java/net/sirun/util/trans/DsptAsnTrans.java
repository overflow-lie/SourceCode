package net.sirun.util.trans;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oss.asn1.BOOLEAN;
import com.oss.asn1.INTEGER;
import com.oss.asn1.OctetString;
import com.oss.asn1.PrintableString;

import net.sirun.bin.ProxyContorlList;
import net.sirun.ngtp.ngtp_dispatch.ControlNGTPDispatcherData;
import net.sirun.ngtp.ngtp_dispatch.ControlNGTPDispatcherDataExtension;
import net.sirun.ngtp.ngtp_dispatch.DSPTMessageType;
import net.sirun.ngtp.ngtp_dispatch.EventInitiator;
import net.sirun.ngtp.ngtp_dispatch.MessageCounter;
import net.sirun.ngtp.ngtp_dispatch.MobileDeviceIdentifier;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherData;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataCommon;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataUnencrypted;
import net.sirun.ngtp.ngtp_dispatch.NGTPErrorCodes;
import net.sirun.ngtp.ngtp_dispatch.NGTP_Dispatch;
import net.sirun.ngtp.ngtp_dispatch.TimeStamp;
import net.sirun.ngtp.ngtp_dispatch.VIN;
import net.sirun.ngtp.ngtp_dispatch.VehicleIdentification;
import net.sirun.ngtp.ngtp_service_data.NGTPCore;
import net.sirun.ngtp.ngtp_service_data.NGTPServiceData;
import net.sirun.util.ByteUtil;
import net.sirun.util.NGTPUtil;

/**
 * 对DSPT与json间的转换
 * 
 * @author jnad
 * 
 */
/**
 * @author yangweijun
 * 
 */
public class DsptAsnTrans {
	/**
	 * 将DSPT 转换为json
	 * 
	 * @param o
	 * @return
	 */
	public static String toJSON(Object o) {
		return Dom4json.parseDataByDOM(o, false, "dspt");
	}

	/**
	 * 将DSPT 转换为json,默认sirun mode
	 * 
	 * @param o
	 * @return
	 */
	public static String toJSON(byte[] bytes) {
		return toJSON(bytes, TransMode.sirun);
	}

	/**
	 * 将DSPT 转换为json
	 * 
	 * @param o
	 * @return
	 */
	public static String toJSON(byte[] bytes, TransMode tm) {
		if (TransMode.wcar == tm) {
			//Sirun-->wcar
			String bs = ByteUtil.toBinaryString(bytes).replace(" ", "");
			bytes = ByteUtil.toBytesForBinaryString("0" + bs.substring(0, bs.length() - 1));
		}

		Object o = NGTPUtil.parseHexToObject(bytes, new NGTPDispatcherData());
		return Dom4json.parseDataByDOM(o, false, "dspt");
	}

	/**
	 * 将DSPT JSON 字符串转换为字节数组
	 * 
	 * 
	 * @param json
	 *            字符串
	 * @return
	 */
	public static byte[] toASN(String json, TransMode tm) {
		JSONObject jo = null;
		try {
			jo = JSONObject.parseObject(json);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// 因为dspt 第一层为choice 所以需要在jo上多加一个层级
		JSONObject nj = new JSONObject();
		nj.put("nGTPDispatcherData", jo);
		byte[] bytes = NGTPUtil.getPer4ByteArray((NGTPDispatcherData) Dom4Asn.parseData(nj, "dspt"));
		if (TransMode.wcar == tm) {
			// wcar mode 会将字节
			bytes = ByteUtil.toBytesForBinaryString(ByteUtil.toBinaryString(bytes).substring(1)+"0");
		}

		return bytes;
	}

	/**
	 * 将DSPT JSON 字符串转换为字节数组 默认是 sirun mode
	 * 
	 * 
	 * @param json
	 *            字符串
	 * @return
	 */
	public static byte[] toASN(String json) {
		return toASN(json, TransMode.sirun);
	}

	/**
	 * 解析未加密JSON调度数据
	 * 
	 * @param json
	 * @return ASN 对象
	 */
	@Deprecated
	public static Object _toASNByUnencrypted(String json) {
		JSONObject jo = null;
		try {
			jo = JSONObject.parseObject(json);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// 因为dspt 第一层为choice 所以需要在jo上多加一个层级
		JSONObject nj = new JSONObject();
		nj.put("nGTPDispatcherData", jo);
		return NGTPUtil.getPer4ByteArray((NGTPDispatcherData) Dom4Asn.parseData(nj, "dsptUn"));
	}

	/**
	 * 解析未加密JSON调度数据,默认 sirun mode
	 * 
	 * @param json
	 * @return 字节 对象
	 */
	public static byte[] toASNByUnencrypted(String json) {
		return toASNByUnencrypted(json, TransMode.sirun);
	}

	/**
	 * 解析未加密JSON调度数据
	 * 
	 * @param json
	 * @return 字节 对象
	 */
	public static byte[] toASNByUnencrypted(String json, TransMode tm) {
		JSONObject jo = null;
		try {
			jo = JSONObject.parseObject(json);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// 因为dspt 第一层为choice 所以需要在jo上多加一个层级
		JSONObject nj = new JSONObject();
//		 nj.put("nGTPDispatcherDataUnencrypted", jo);
 
		byte[] bytes = NGTPUtil.getPer4ByteArray((NGTPDispatcherDataUnencrypted) Dom4Asn.parseData(jo, "dsptUn"));
		if (TransMode.wcar == tm) {
			// sirun-wcar
			bytes = ByteUtil.toBytesForBinaryString(ByteUtil.toBinaryString(bytes).substring(1)+"0");
		}
		return bytes;
	}

	/**
	 * 将JSON数据 转换为 为加密 DSPT 数据
	 * 
	 * @param o
	 * @return JSON 字符串
	 */
	public static String toJSONByUnencrypted(Object o) {
		return Dom4json.parseDataByDOM(o, false, "dsptUn");
	}

	/**
	 * 将JSON数据 转换为 为加密 DSPT 数据 默认sirun mode
	 * 
	 * @param o
	 * @return JSON 字符串
	 */
	public static String toJSONByUnencrypted(byte[] bytes) {
		return toJSONByUnencrypted(bytes, TransMode.sirun);
	}

	/**
	 * 将JSON数据 转换为 为加密 DSPT 数据
	 * 
	 * @param o
	 * @return JSON 字符串
	 */
	public static String toJSONByUnencrypted(byte[] bytes, TransMode tm) {
		if (TransMode.wcar == tm) {
			// wcar mode 会将字节右移一位 即 前面补0
			String bs = ByteUtil.toBinaryString(bytes).replace(" ", "");
			bytes = ByteUtil.toBytesForBinaryString("0" + bs.substring(0, bs.length() - 1));
		}
		Object o = NGTPUtil.parseHexToObject(bytes, new NGTPDispatcherDataUnencrypted());
		return Dom4json.parseDataByDOM(o, false, "dsptUn");
	}

	static {
		ProxyContorlList.initContorlList();
		System.out.println("static Load");
	}

	public static void main(String s[]) {
		System.out.println(DsptAsnTrans.toJSONByUnencrypted(getTestObjectUnencrtpted()));
		NGTPUtil.printByteArray(DsptAsnTrans.toASNByUnencrypted(toJSONByUnencrypted(getTestObjectUnencrtpted())));
		System.out.println("-------------");
		System.out.println(NGTPUtil.toByteArray(toASN(getTestJSON())));
		// String str =
		// " A566DE00 1A031FC0 61006200 630064B7 80636E71 4E756D62 65722D56 616C7565 80";
		// System.out.println(toJSON(NGTPUtil.parseHstring(str)));

	}

	/**
	 * 获取一个用于测试的数据
	 * 
	 * @return
	 */
	private static String getTestJSON() {
		return toJSON(getTestObject());
	}

	/**
	 * 获取一个用于测试的数据(未加密)
	 * 
	 * @return
	 */
	private static Object getTestObjectUnencrtpted() {
		NGTPDispatcherDataUnencrypted nddu = new NGTPDispatcherDataUnencrypted();
		nddu.setMessageCreationTime(new TimeStamp(22336, 36));
		nddu.setMessageTimeToLive(new INTEGER(26));
		nddu.setMsgCounter(new MessageCounter(new INTEGER(6), new INTEGER(1)));
		nddu.setVehicleIdentification(VehicleIdentification.createVehicleIdentificationWithVin(new VIN(new PrintableString("ABC"), new PrintableString("123456"),
				new PrintableString("x"), new PrintableString("9xyzrst"))));
		nddu.setDeviceIdentification(new PrintableString("01234567890123456789"));
		return nddu;
	}

	private static Object getTestObject() {
		NGTPDispatcherData nd = new NGTPDispatcherData();
		ControlNGTPDispatcherData cnd = new ControlNGTPDispatcherData();
		nd.setControl(cnd);
		NGTPDispatcherDataCommon cnc = new NGTPDispatcherDataCommon();
		ControlNGTPDispatcherDataExtension cnde = new ControlNGTPDispatcherDataExtension();
		cnd.setCommon(cnc);
		cnd.setExtension(cnde);

		// Common 都是一样的
		cnc.setEventCreationTime(new TimeStamp(26334, 26));
		cnc.setEventInitiator(EventInitiator.tu);
		cnc.setServiceType(3);
		cnc.setMessageType(DSPTMessageType.crqm);
		cnc.setDsptAckRequired(new BOOLEAN(true));
		cnc.setMobileId(new MobileDeviceIdentifier(new PrintableString("a"), new PrintableString("b"), new PrintableString("c"), new PrintableString("d")));
		cnc.setStatelessNGTPmessage(new BOOLEAN(true));
		cnc.setChallenge(new OctetString("AAEEDD".getBytes()));

		// control
		cnde.setCrqNumber(new PrintableString("cnqNumber-Value"));
		cnde.setNotificationData(new OctetString("not-value".getBytes()));
		cnde.setMessagesPending(new BOOLEAN(true));
		cnde.setErrorInfo(NGTPErrorCodes.dataMismatchError);

		// downlink

		return nd;

	}
}
