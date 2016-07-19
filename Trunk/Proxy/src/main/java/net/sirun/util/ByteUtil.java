package net.sirun.util;

/**
 * 对字节的各种操作
 * 
 * @author jnad
 * 
 */
public class ByteUtil {

	/**
	 * 字节数组的截取，从索引号至结束索引号-1 [begin,end)
	 * 
	 * @param b
	 * @param begin
	 * @param end
	 * @return
	 */
	public static byte[] subBytes(byte[] b, int begin, int end) {
		// 为0时 将end至为 数组b的长度
		if (end == 0) {
			end = b.length;
		}
		if (begin >= b.length || end > b.length || begin > end) {
			return null;
		}
		byte re[] = new byte[end - begin];
		for (int i = 0; i < re.length; i++) {
			re[i] = b[begin + i];
		}
		return re;

	}

	public static byte[] subBytes(byte[] b, int begin) {

		return subBytes(b, begin, 0);
	}

	/**
	 * 字节数组附加 [begin,end) [sourcebeginIndex]
	 * 
	 * @param source
	 *            第一个字节数组
	 * @param target
	 *            第二个字节数组
	 * @param begin
	 *            第二个字节数组的开始复制索引
	 * @param end
	 *            第二个字节数组的结束索引
	 * @param end
	 *            第二个字节数组的结束索引
	 * @param sourcebeginIndex
	 *            第一个字节数组开始索引（后面的就要覆盖了）
	 * @return
	 */
	public static byte[] appendBytes(byte[] source, byte[] target, int begin, int end, int sourcebeginIndex) {
		// 校验各个属性
		if (sourcebeginIndex == 0) {
			sourcebeginIndex = source.length;
		}
		if (end < begin || end == 0) {
			begin = 0;
			end = target.length;
		}
		// 第一个包的长度
		int firstLength = sourcebeginIndex;
		// 重新构造的字节数组大小
		byte[] re = new byte[firstLength + end - begin];
		// 首先复制第一个数组的数据
		for (int i = 0; i < firstLength; i++) {
			re[i] = source[i];
		}
		// 处理第二个
		for (; firstLength < re.length; firstLength++) {
			re[firstLength] = target[begin++];
		}
		return re;
	}

	/**
	 * 字节数组附加 [begin,end)
	 * 
	 * @param source
	 *            第一个字节数组
	 * @param target
	 *            第二个字节数组
	 * @param begin
	 *            第二个字节数组的开始复制索引
	 * @param end
	 *            第二个字节数组的结束索引
	 * @param end
	 *            第二个字节数组的结束索引
	 * @return
	 */
	public static byte[] appendBytes(byte[] source, byte[] target, int begin, int end) {
		return appendBytes(source, target, begin, end, source.length);
	}

	/**
	 * 字节数组附加 ALL
	 * 
	 * @param source
	 *            第一个字节数组
	 * @param target
	 *            第二个字节数组
	 * @return
	 */
	public static byte[] appendBytes(byte[] source, byte[] target) {
		return appendBytes(source, target, 0, target.length);
	}

	public static void main(String agrs[]) {

	}

	private static String hexStr = "0123456789ABCDEF";


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
