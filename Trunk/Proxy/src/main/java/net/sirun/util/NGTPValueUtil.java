package net.sirun.util;

import net.sirun.ngtp.ngtp_dispatch.MessageLength;

public class NGTPValueUtil {

	public static long getMilliarcsecondByPosition(double latorlat) {
		return (long) latorlat * 3600000;
	}

	/**
	 * 获取消息长度的包装类,假如为负数,则置为0
	 * 
	 * @param val
	 * @return MessageLength
	 */
	public static MessageLength getMessageLengthForChosen(long val) {
		MessageLength messageLength = new MessageLength();
		if (val < 0) {
			val = 0;
		}
		if (val < 256) {
			messageLength.setMessageLength8(val);
		}

		if (val < 65535) {
			messageLength.setMessageLength16(val);
		}
		if (val < 16777215) {
			messageLength.setMessageLength24(val);
		}
		return messageLength;

	}
}
