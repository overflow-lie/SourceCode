package net.sirun.test;

import hoperun.util.ByteUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Date;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Coder;
import com.oss.asn1.INTEGER;
import com.oss.asn1.PrintableString;

import net.sirun.ngtp.Ngtp;
import net.sirun.ngtp.ngtp_dispatch.MessageCounter;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataUnencrypted;
import net.sirun.ngtp.ngtp_dispatch.TimeStamp;
import net.sirun.ngtp.ngtp_dispatch.VehicleIdentification;
import net.sirun.util.NGTPUtil;
import net.sirun.util.VeDate;
import net.sirun.util.trans.DsptAsnTrans;
import net.sirun.util.trans.ServiceDataAsnTrans;

public class NGTPTest {
	// 将转换方式置为 PER 非对称方式
	private static final Coder coder = Ngtp.getPERUnalignedCoder();

	public static void main(String args[]) {

		String str = "asdasdasd";
		System.out.println(str.substring(0, str.length()-1));
		
		// 使用测试数据得到asn字节码数据
		encode();
		// 使用提供数据解析asn对象
		// decode();
	}

	/**
	 * 使用测试数据得到asn字节码数据
	 */
	public static void encode() {

		// VehicleIdentification vif =
		// VehicleIdentification.createVehicleIdentificationWithEquipmentId(new
		// INTEGER(12345678));
		VehicleIdentification vif = VehicleIdentification.createVehicleIdentificationWithEquipmentId(12345678);

		byte[] bvif = getPer4ByteArray(vif);
		System.out.println("\n-VehicleIdentification-");
		NGTPUtil.printByteArray(bvif);

		TimeStamp ts = new TimeStamp(99999, 888);
		byte[] bts = getPer4ByteArray(ts);
		System.out.println("\n-TimeStamp-");
		NGTPUtil.printByteArray(bts);

		INTEGER i = new INTEGER(360);
		byte[] bi = getPer4ByteArray(i);
		System.out.println("\n-INTEGER-");
		NGTPUtil.printByteArray(bi);

		MessageCounter mc = new MessageCounter(200, 100);

		byte[] bmc = getPer4ByteArray(mc);
		System.out.println("\n-MessageCounter-");
		NGTPUtil.printByteArray(bmc);

		// 测试数据
		// {"messageCreationTime":{"millis":"389","seconds":"457702541"},"messageTimeToLive":"2014","msgCounter":{"downlinkCount":"124","uplinkCount":"2"},"vehicleIdentification":{"equipmentId":"12345678"}}

		// new test NGTPDispatcherDataUnencrypted object
		NGTPDispatcherDataUnencrypted nddu = new NGTPDispatcherDataUnencrypted();
		// messageCreationTime [TimeStamp] :{seconds 457702541,millis 389} 当前时间
		nddu.setMessageCreationTime(new TimeStamp(99999, 888));
		// messageTimeToLive [INTEGER(0..2047)]: 2014
		nddu.setMessageTimeToLive(new INTEGER(360));
		// msgCounter [MessageCounter] :{uplinkCount 2,downlinkCount 124 }
		nddu.setMsgCounter(new MessageCounter(200, 100));
		// NGTPDispatcherDataUnencrypted.VehicleIdentification.EquipmentId=12345678
		nddu.setVehicleIdentification(VehicleIdentification.createVehicleIdentificationWithEquipmentId(12345678));

		// trans
		byte[] asnbytes = getPer4ByteArray(nddu);
		// print asn bytes hex
		System.out.println("-- oss ");
		NGTPUtil.printByteArray(asnbytes);
		// console print :
		// 4DA3FE46 B0BF7809 F200BC61 4E
		String binary = toBinaryString(asnbytes);
		System.out.println("\nbinary :");
		System.out.println(binary);
		System.out.println("-- sirun");
		NGTPUtil.printByteArray(toBytesForBinaryString(binary));
		System.out.println("-- wcar");
		NGTPUtil.printByteArray(toBytesForBinaryString(binary.substring(1) + "0"));
		System.out.println("--");
	}

	/**
	 * 使用提供数据解析asn对象
	 */

	public static void decode() {
		String asnstr = "8001869fde0b4643240178c29c";
		System.out.println("test 2 decoder ");
		byte[] asnbytes = NGTPUtil.parseHstring(asnstr);
		AbstractData ad = parseHexToObject(asnbytes, new NGTPDispatcherDataUnencrypted());
		System.out.println(ad.toString());

	}

	public static AbstractData parseHexToObject(byte[] bytes, AbstractData ad) {
		// 解析
		ByteArrayInputStream source = new ByteArrayInputStream(bytes);
		System.out.println("\nThe decoder's trace messages ...\n");
		AbstractData decodeNgtp = null;
		try {
			decodeNgtp = coder.decode(source, ad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decodeNgtp;
	}

	/**
	 * 返回当前对象的PER Unaligned编码
	 * 
	 * @param ad
	 * @return 字节数组
	 */
	public static byte[] getPer4ByteArray(AbstractData ad) {
		ByteArrayOutputStream sink = new ByteArrayOutputStream();
		// 创建编码器
		try {
			coder.encode(ad, sink);
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		// 返回字节码
		byte[] encoding = sink.toByteArray();
		return encoding;
	}

	/**
	 * 将2进制字符串转换为字节数组
	 * 
	 * @param binary
	 * @return
	 */
	public static byte[] toBytesForBinaryString(String binary) {
		binary = binary.replace(" ", "");
		int l = binary.length();
		byte[] bytes = new byte[l / 8];
		String substr;
		for (int i = l; i > 0; i -= 8) {
			substr = binary.substring(i - 8 < 0 ? 0 : i - 8, i);
			bytes[i / 8 - 1] = (byte) Integer.parseInt(substr, 2);
		}
		return bytes;

	}

	/**
	 * 将字节数组转为二进制字符串
	 * 
	 * @param bytes
	 * @return
	 */
	public static String toBinaryString(byte[] bytes) {
		String bstr;
		StringBuffer sb = new StringBuffer();

		for (byte b : bytes) {
			bstr = fixZeros(Integer.toBinaryString((int) b < 0 ? b + 0x100 : b));
			sb.append(bstr + " ");
		}

		return sb.toString();
	}

	/**
	 * 减少2进制字符串前面的00 每2个00 删除
	 * 
	 * @param binary
	 * @return
	 */
	private static String simplifyZeros(String binary) {
		byte bytes[] = binary.getBytes();
		if (bytes[0] == '0' && bytes[1] == '0') {
			return binary.substring(2);
		}

		return binary;

	}

	/**
	 * 将字符串凑成8位,不足前面补零
	 * 
	 * @param binary
	 * @return
	 */
	private static String fixZeros(String binary) {

		switch (binary.length()) {
		case 1:
			binary = "0000000" + binary;
			break;
		case 2:
			binary = "000000" + binary;
			break;
		case 3:
			binary = "00000" + binary;
			break;
		case 4:
			binary = "0000" + binary;
			break;
		case 5:
			binary = "000" + binary;
			break;
		case 6:
			binary = "00" + binary;
			break;
		case 7:
			binary = "0" + binary;
			break;
		default:
			break;
		}
		return binary;

	}

}
