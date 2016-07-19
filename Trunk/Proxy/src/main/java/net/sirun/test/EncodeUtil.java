package net.sirun.test;

import java.lang.Character.UnicodeBlock;

public class EncodeUtil {

    private static final int MASKBITS = 0x3F;
    private static final int MASKBYTE = 0x80;
    private static final int MASK2BYTES = 0xC0;
    private static final int MASK3BYTES = 0xE0;

    public static String gbk2utf8(String gbk) {
        String l_temp = GBK2Unicode(gbk);
        l_temp = unicodeToUtf8(l_temp);

        return l_temp;
    }
 
    public String utf82gbk(String utf) {
        String l_temp = utf8ToUnicode(utf);
        l_temp = Unicode2GBK(l_temp);

        return l_temp;
    }

    /**
     * @param str
     * @return String
     */

    public static String GBK2Unicode(String str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char chr1 = (char) str.charAt(i);

            if (!isNeedConvert(chr1)) {
                result.append(chr1);
                continue;
            }

            result.append("\\u" + Integer.toHexString((int) chr1));
        }

        return result.toString();
    }

    /**
     * @param dataStr
     * @return String
     */

    public static String Unicode2GBK(String dataStr) {
        int index = 0;
        StringBuffer buffer = new StringBuffer();

        int li_len = dataStr.length();
        while (index < li_len) {
            if (index >= li_len - 1
                    || !"\\u".equals(dataStr.substring(index, index + 2))) {
                buffer.append(dataStr.charAt(index));

                index++;
                continue;
            }

            String charStr = "";
            charStr = dataStr.substring(index + 2, index + 6);

            char letter = (char) Integer.parseInt(charStr, 16);

            buffer.append(letter);
            index += 6;
        }

        return buffer.toString();
    }

    public static boolean isNeedConvert(char para) {
        return ((para & (0x00FF)) != para);
    }

    public static byte[] utf82Unicode(byte[] utf8Bytes) {
        byte[] unicodeBytes = null;

        return unicodeBytes;

    }

    /**
     * utf-8 转unicode
     *
     * @param inStr
     * @return String
     */
    public static String utf8ToUnicode(String inStr) {
        char[] myBuffer = inStr.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inStr.length(); i++) {
            UnicodeBlock ub = UnicodeBlock.of(myBuffer[i]);
            if (ub == UnicodeBlock.BASIC_LATIN) {
                sb.append(myBuffer[i]);
            } else if (ub == UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
                int j = (int) myBuffer[i] - 65248;
                sb.append((char) j);
            } else {
                short s = (short) myBuffer[i];
                String hexS = Integer.toHexString(s);
                String unicode = "\\u" + hexS;
                sb.append(unicode.toLowerCase());
            }
        }
        return sb.toString();
    }

    /**
     * @param theString
     * @return String
     */
    public static String unicodeToUtf8(String theString) {
        char aChar;
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = theString.charAt(x++);
            if (aChar == '\\') {
                aChar = theString.charAt(x++);
                if (aChar == 'u') {
                    // Read the xxxx
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = theString.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed   \\uxxxx   encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't')
                        aChar = '\t';
                    else if (aChar == 'r')
                        aChar = '\r';
                    else if (aChar == 'n')
                        aChar = '\n';
                    else if (aChar == 'f')
                        aChar = '\f';
                    outBuffer.append(aChar);
                }
            } else
                outBuffer.append(aChar);
        }
        return outBuffer.toString();
    }

    /**
     * @功能: 将UNICODE（UTF-16LE）编码转成UTF-8编码
     * @参数: byte[] b 源字节数组
     * @返回值: byte[] b 转为UTF-8编码后的数组
     * @作者: imuse
     */
    public static byte[] UNICODE_TO_UTF8(byte[] b) {
        int i = 0;
        int j = 0;
        byte[] utf8Byte = new byte[b.length * 2];
        while (i < b.length) {
            byte[] bUTF = new byte[1];
            int nCode = (b[i] & 0xFF) | ((b[i + 1] & 0xFF) << 8);
            if (nCode < 0x80) {
                bUTF = new byte[1];
                bUTF[0] = (byte) nCode;
            }
            // 110xxxxx 10xxxxxx
            else if (nCode < 0x800) {
                bUTF = new byte[2];
                bUTF[0] = (byte) (MASK2BYTES | nCode >> 6);
                bUTF[1] = (byte) (MASKBYTE | nCode & MASKBITS);
            }
            // 1110xxxx 10xxxxxx 10xxxxxx
            else if (nCode < 0x10000) {
                bUTF = new byte[3];
                bUTF[0] = (byte) (MASK3BYTES | nCode >> 12);
                bUTF[1] = (byte) (MASKBYTE | nCode >> 6 & MASKBITS);
                bUTF[2] = (byte) (MASKBYTE | nCode & MASKBITS);
            }
            for (int k = 0; k < bUTF.length; k++) {
                utf8Byte[j++] = bUTF[k];
            }
            i += 2;
        }
        b = new byte[j];
        System.arraycopy(utf8Byte, 0, b, 0, j);
        return b;
    }

    /** */
    /**
     * @功能: 将一个长度为2 byte数组转为short
     * @参数: byte[] bytesShort要转的字节数组
     * @返回值: short sRet 转后的short值
     */
    public static short bytesToShort(byte[] bytesShort) {
        short sRet = 0;
        sRet += (bytesShort[0] & 0xFF) << 8;
        sRet += bytesShort[1] & 0xFF;
        return sRet;
    }

    /** */
    /**
     * @功能: 将一个short值转为byte数组
     * @参数: short sNum 要转的short值
     * @返回值: byte[] bytesRet 转后的byte数组
     */
    public static byte[] shortToBytes(short sNum) {
        byte[] bytesRet = new byte[2];
        bytesRet[0] = (byte) ((sNum >> 8) & 0xFF);
        bytesRet[1] = (byte) (sNum & 0xFF);
        return bytesRet;
    }

    /** */
    /**
     * @功能: 将一个长度为4 byte数组转为int
     * @参数: byte[] bNum要转的字节数组
     * @返回值: int retInt 转后的int值
     */
    public static int bytesToInt(byte[] bNum) {
        int retInt = 0;
        retInt = ((bNum[0] & 0xFF) << 24);
        retInt += (bNum[1] & 0xFF) << 16;
        retInt += (bNum[2] & 0xFF) << 8;
        retInt += bNum[3] & 0xFF;
        return retInt;
    }

    /** */
    /**
     * @功能: 将一个int值转为byte数组
     * @参数: int nNum 要转的int值
     * @返回值: byte[] bytesRet 转后的byte数组
     */
    public static byte[] intToBytes(int nNum) {
        byte[] bytesRet = new byte[4];
        bytesRet[0] = (byte) ((nNum >> 24) & 0xFF);
        bytesRet[1] = (byte) ((nNum >> 16) & 0xFF);
        bytesRet[2] = (byte) ((nNum >> 8) & 0xFF);
        bytesRet[3] = (byte) (nNum & 0xFF);
        return bytesRet;
    }

}
