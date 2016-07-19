package net.sirun.util.trans;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import hoperun.loginfo.SelfLogger;
import hoperun.util.ByteUtil;
import net.sirun.bin.ProxyContorlList;
import net.sirun.ngtp.ngtp_dispatch.MessageLength;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataUnencrypted;
import net.sirun.util.NGTPUtil;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DsptAsnTransTest {

	private final static boolean isenum = ProxyContorlList.getPropertyForString("Proxy_TransASN_2ndValue").equalsIgnoreCase("enum");

	@Before
	public void setUp() throws Exception {

	}

	public static void main(String[] args) {
		System.out.println("333");
	}

	@Test
	public void testToJSONByteArray() {
		String asn = "B4000336 F034063F 83083103 183220A0 A2A2A222 7BF1EEE3 3BAEDC59 792DAD87 675CA437 37BA16BB 30B63AB2 C0";
		String json = DsptAsnTrans.toJSON(NGTPUtil.parseHstring(asn));
		String ex2 = "{\"control\":{\"common\":{\"challenge\":\"41414545 4444\",\"dsptAckRequired\":\"true\",\"eventCreationTime\":{\"millis\":\"26\",\"seconds\":\"26334\"},\"eventInitiator\":\"tu\",\"messageType\":\"crqm\",\"mobileId\":{\"equipmentIdentifier\":\"b\",\"iccId\":\"d\",\"publicAddress\":\"a\",\"subscriberIdentity\":\"c\"},\"serviceType\":\"3\",\"statelessNGTPmessage\":\"true\"},\"extension\":{\"crqNumber\":\"cnqNumber-Value\",\"errorInfo\":\"dataMismatchError\",\"messagesPending\":\"true\",\"notificationData\":\"6E6F742D 76616C75 65\"}}}";
		String ex1 = "{\"control\":{\"common\":{\"challenge\":\"41414545 4444\",\"dsptAckRequired\":\"true\",\"eventCreationTime\":{\"millis\":\"26\",\"seconds\":\"26334\"},\"eventInitiator\":\"0\",\"messageType\":\"1\",\"mobileId\":{\"equipmentIdentifier\":\"b\",\"iccId\":\"d\",\"publicAddress\":\"a\",\"subscriberIdentity\":\"c\"},\"serviceType\":\"3\",\"statelessNGTPmessage\":\"true\"},\"extension\":{\"crqNumber\":\"cnqNumber-Value\",\"errorInfo\":\"10\",\"messagesPending\":\"true\",\"notificationData\":\"6E6F742D 76616C75 65\"}}}";
		String ex = isenum ? ex1 : ex2;
		assertTrue(json.equals(ex));
	}

	@Test
	public void testToASN() {

		String json2 = "{\"control\":{\"common\":{\"challenge\":\"41414545 4444\",\"dsptAckRequired\":\"true\",\"eventCreationTime\":{\"millis\":\"26\",\"seconds\":\"26334\"},\"eventInitiator\":\"tu\",\"messageType\":\"crqm\",\"mobileId\":{\"equipmentIdentifier\":\"b\",\"iccId\":\"d\",\"publicAddress\":\"a\",\"subscriberIdentity\":\"c\"},\"serviceType\":\"3\",\"statelessNGTPmessage\":\"true\"},\"extension\":{\"crqNumber\":\"cnqNumber-Value\",\"errorInfo\":\"dataMismatchError\",\"messagesPending\":\"true\",\"notificationData\":\"6E6F742D 76616C75 65\"}}}";
		String json1 = "{\"control\":{\"common\":{\"challenge\":\"41414545 4444\",\"dsptAckRequired\":\"true\",\"eventCreationTime\":{\"millis\":\"26\",\"seconds\":\"26334\"},\"eventInitiator\":\"0\",\"messageType\":\"1\",\"mobileId\":{\"equipmentIdentifier\":\"b\",\"iccId\":\"d\",\"publicAddress\":\"a\",\"subscriberIdentity\":\"c\"},\"serviceType\":\"3\",\"statelessNGTPmessage\":\"true\"},\"extension\":{\"crqNumber\":\"cnqNumber-Value\",\"errorInfo\":\"10\",\"messagesPending\":\"true\",\"notificationData\":\"6E6F742D 76616C75 65\"}}}";
		String json = isenum ? json1 : json2;
		byte bytes[] = DsptAsnTrans.toASN(json);
		// print Trans
		NGTPUtil.printByteArray(bytes);
		byte ex[] = NGTPUtil.parseHstring("B4000336 F034063F 83083103 183220A0 A2A2A222 7BF1EEE3 3BAEDC59 792DAD87 675CA437 37BA16BB 30B63AB2 C0");
		assertArrayEquals(bytes, ex);
	}

	@Test
	public void testToASNByUnencrypted() {
		System.out.println("1");

		String jsonString2 = "{\"deviceIdentification\":\"01234567890123456789\",\"messageCreationTime\":{\"millis\":\"36\",\"seconds\":\"22336\"},\"messageTimeToLive\":\"26\",\"msgCounter\":{\"downlinkCount\":\"1\",\"uplinkCount\":\"6\"},\"vehicleIdentification\":{\"vin\":{\"isovds\":\"123456\",\"isovisModelyear\":\"x\",\"isovisSeqPlant\":\"9xyzrst\",\"isowmi\":\"ABC\"}}}";
		byte[] bytes = DsptAsnTrans.toASNByUnencrypted(jsonString2);
		NGTPUtil.printByteArray(bytes);
		byte[] ex = NGTPUtil.parseHstring("C0002BA0 04806818 04F06143 62C99B46 ADBC39F1 E7D72E7D 183164CD A356CDDC 3960C593 368D5B37 70E4");
		assertArrayEquals(bytes, ex);
	}

	@Test
	@Ignore
	public void testToJSONByUnencryptedObject() {
		/*
		 * 测试未加密+已加密数据是否可以都解出来
		 */
		String unenAsn = "C0002BA0 04806818 04F06143 62C99B46 ADBC39F1 E7D72E7D 183164CD A356CDDC 3960C593 368D5B37 70E4";
		String enAsn = "B4000336 F034063F 83083103 183220A0 A2A2A222 7BF1EEE3 3BAEDC59 792DAD87 675CA437 37BA16BB 30B63AB2 C0";
		String all = unenAsn + enAsn;
		byte bytes[] = NGTPUtil.parseHstring(all);
		int asnlength = 0;
		// asnlength =
		// DsptAsnTrans.toASNByUnencrypted(DsptAsnTrans.toJSONByUnencrypted(NGTPUtil.parseHstring(unenAsn+enAsn))).length;
		asnlength = NGTPUtil.getPer4ByteArray(NGTPUtil.parseHexToObject(bytes, new NGTPDispatcherDataUnencrypted())).length;

		byte enByte[] = new byte[bytes.length - asnlength];
		// 截断
		System.arraycopy(bytes, asnlength, enByte, 0, bytes.length - asnlength);
		System.out.println("解析 DSPT数据");
		String json = DsptAsnTrans.toJSON(enByte);
		System.out.println(json);
		// String ex =
		// "{\"uplink\":{\"common\":{\"dsptAckRequired\":\"false\",\"eventCreationTime\":{\"millis\":\"1\",\"seconds\":\"456488720\"},\"eventInitiator\":\"0\",\"messageType\":\"2\",\"serviceType\":\"2\",\"statelessNGTPmessage\":\"false\"},\"extension\":{\"basicPosition\":{\"latitude\":\"143880966\",\"longitude\":\"419076064\"},\"crqmRequest\":\"true\",\"messagePendingCheck\":\"false\",\"serviceDataEncoding\":{\"encodingType\":\"1\",\"encodingVersion\":{\"majorVersion\":\"0\",\"minorVersion\":\"1\"}},\"serviceDataMessageLength\":{\"messageLength8\":\"0\"},\"serviceDataProtocolVersion\":{\"majorVersion\":\"1\",\"minorVersion\":\"2\"}}}}";
		// assertTrue(json.equals(ex));

	}

	@Test
	public void testToJSONByUnencryptedByteArray() {
		String asn = "C0002BA0 04806818 04F06143 62C99B46 ADBC39F1 E7D72E7D 183164CD A356CDDC 3960C593 368D5B37 70E4";
		String json = DsptAsnTrans.toJSONByUnencrypted(NGTPUtil.parseHstring(asn));
		System.out.println(json);
		String ex2 = "{\"deviceIdentification\":\"01234567890123456789\",\"messageCreationTime\":{\"millis\":\"36\",\"seconds\":\"22336\"},\"messageTimeToLive\":\"26\",\"msgCounter\":{\"downlinkCount\":\"1\",\"uplinkCount\":\"6\"},\"vehicleIdentification\":{\"vin\":{\"isovds\":\"123456\",\"isovisModelyear\":\"x\",\"isovisSeqPlant\":\"9xyzrst\",\"isowmi\":\"ABC\"}}}";
		String ex1 = "{\"deviceIdentification\":\"01234567890123456789\",\"messageCreationTime\":{\"millis\":\"36\",\"seconds\":\"22336\"},\"messageTimeToLive\":\"26\",\"msgCounter\":{\"downlinkCount\":\"1\",\"uplinkCount\":\"6\"},\"vehicleIdentification\":{\"vin\":{\"isovds\":\"123456\",\"isovisModelyear\":\"x\",\"isovisSeqPlant\":\"9xyzrst\",\"isowmi\":\"ABC\"}}}";
		String ex = isenum ? ex1 : ex2;

		assertTrue(json.equals(ex));
	}

}
