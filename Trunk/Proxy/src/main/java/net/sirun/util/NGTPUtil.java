package net.sirun.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import net.sirun.ngtp.Ngtp;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.util.HexTool;

/**
 * 对于NGTP的一些工具类
 * 
 * @author jnad
 * 
 */
public class NGTPUtil {

	//将转换方式置为非对称方式
	private static final Coder coder = Ngtp.getPERUnalignedCoder();

	/**
	 * 返回当前对象的PER编码
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
		// 输出
		byte[] encoding = sink.toByteArray();
		return encoding;
	}

	public static AbstractData parseHexToObject(byte[] bytes, AbstractData ad) {
		// 解析
		ByteArrayInputStream source = new ByteArrayInputStream(bytes);
		// Decode the card whose encoding is in the 'encoding' byte array.
		System.out.println("\nThe decoder's trace messages ...\n");
		// Ngtp decodedCard = (Ngtp)key.decode(source, new Ngtp());
		AbstractData decodeNgtp = null;
		try {
			decodeNgtp = coder.decode(source, ad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decodeNgtp;
	}

	/**
	 * 打印当前字节数组,并8个 空一格
	 * 
	 * @param bytes
	 */
	public static void printByteArray(byte[] bytes) {
		HexTool.printHex(bytes);
	}

	/**
	 * 获取当前的Hex的显示版
	 * 
	 * @param bytes
	 * @return
	 */
	public static String toByteArray(byte[] bytes) {
		String back = HexTool.getHex(bytes);
		 byte[] bc= back.getBytes();
		 if(bc[bc.length-1]==' '){
			 byte[] nbc = new byte[bc.length-1];
			 System.arraycopy(bc, 0, nbc, 0, bc.length-1);
			 back = new String(nbc);
		 }
		
		return back;
	}

	/**
	 * 将当前字符数据转换为HEX
	 * 
	 * @param str
	 * @return
	 */
	public static byte[] parseHstring(String str) {
		return HexTool.parseHstring("'" + str + "'H");
	}

	
	
	
}
