package net.sirun.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import net.sirun.ngtp.Ngtp;
import net.sirun.ngtp.ngtp_dispatch.BasicPosition;
import net.sirun.ngtp.ngtp_dispatch.DSPTMessageType;
import net.sirun.ngtp.ngtp_dispatch.DataEncoding;
import net.sirun.ngtp.ngtp_dispatch.EncodingType;
import net.sirun.ngtp.ngtp_dispatch.EventInitiator;
import net.sirun.ngtp.ngtp_dispatch.MajMinVersion16;
import net.sirun.ngtp.ngtp_dispatch.MajMinVersion6;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherData;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataCommon;
import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherDataUnencrypted;
import net.sirun.ngtp.ngtp_dispatch.ProtocolVersionSingle8;
import net.sirun.ngtp.ngtp_dispatch.TimeStamp;
import net.sirun.ngtp.ngtp_dispatch.UplinkNGTPDispatcherData;
import net.sirun.ngtp.ngtp_dispatch.UplinkNGTPDispatcherDataExtension;
import net.sirun.ngtp.ngtp_dispatch.VIN;
import net.sirun.ngtp.ngtp_dispatch.VehicleIdentification;
import net.sirun.ngtp.ngtp_service_data.BOOLEXT;
import net.sirun.ngtp.ngtp_service_data.BasicPearlChain;
import net.sirun.ngtp.ngtp_service_data.CrashInformation;
import net.sirun.ngtp.ngtp_service_data.CrashInformation.Type;
import net.sirun.ngtp.ngtp_service_data.ExtendedPosition;
import net.sirun.ngtp.ngtp_service_data.FullPosition;
import net.sirun.ngtp.ngtp_service_data.GenericParameter;
import net.sirun.ngtp.ngtp_service_data.GenericParameterKey;
import net.sirun.ngtp.ngtp_service_data.GenericParameterValue;
import net.sirun.ngtp.ngtp_service_data.NGTPCore;
import net.sirun.ngtp.ngtp_service_data.NGTPDownlinkCore;
import net.sirun.ngtp.ngtp_service_data.NGTPDownlinkCore.GenericParams;
import net.sirun.ngtp.ngtp_service_data.NGTPServiceData;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.Trigger;
import net.sirun.ngtp.ngtp_service_data.ServiceMessageType;
import net.sirun.ngtp.ngtp_service_data.TUPowerSource;
import net.sirun.ngtp.ngtp_service_data.TelematicUnitStatus;
import net.sirun.ngtp.ngtp_service_data.TriggerType;
import net.sirun.ngtp.ngtp_service_data.TuActivationStatus;
import net.sirun.ngtp.ngtp_service_data.TuConfigVersion;
import net.sirun.ngtp.ngtp_servicetypes.ApplicationServiceType;
import net.sirun.util.NGTPUtil;
import net.sirun.util.NGTPValueUtil;
import net.sirun.util.VeDate;

import com.oss.asn1.BOOLEAN;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.INTEGER;
import com.oss.asn1.PrintableString;
import com.oss.asn1.UTF8String16;
import com.oss.util.HexTool;

public class BeseTest {

	public static void main(String s[]) {
		int i=4;int a=2;
		i=i|a;
		System.out.println(i);
		
		
//		test9();
	}

	// 创建密钥对象(全局)

	// private static key.getPERUnalignedCoder()ƒ
	// 创建编码器
	private static Coder coder = Ngtp.getPERAlignedCoder();

	
	public static void test9(){

		VehicleIdentification vi = new VehicleIdentification();
	NGTPDispatcherDataUnencrypted nddu = new NGTPDispatcherDataUnencrypted();
//	nddu.getVehicleIdentification()
	
	VIN v = new VIN();
//	v.getIsovds()
		
	}
	

    public static String convertString(String gbk){  
         String utf8 = "";  
         try {  
             utf8 = new String(gbk2utf8(gbk),"UTF-8");  
         } catch (UnsupportedEncodingException e) {  
             e.printStackTrace();  
         }  
         return utf8;  
     }  

     public static byte[] gbk2utf8(String chenese) {  
         char c[] = chenese.toCharArray();  
         byte[] fullByte = new byte[3 * c.length];  
         for (int i = 0; i < c.length; i++) {  
             int m = (int) c[i];  
             String word = Integer.toBinaryString(m);  

             StringBuffer sb = new StringBuffer();  
             int len = 16 - word.length();  
             for (int j = 0; j < len; j++) {  
                 sb.append("0");  
             }  
             sb.append(word);  
             sb.insert(0, "1110");  
             sb.insert(8, "10");  
             sb.insert(16, "10");  

             String s1 = sb.substring(0, 8);  
             String s2 = sb.substring(8, 16);  
             String s3 = sb.substring(16);  

             byte b0 = Integer.valueOf(s1, 2).byteValue();  
             byte b1 = Integer.valueOf(s2, 2).byteValue();  
             byte b2 = Integer.valueOf(s3, 2).byteValue();  
             byte[] bf = new byte[3];  
             bf[0] = b0;  
             fullByte[i * 3] = bf[0];  
             bf[1] = b1;  
             fullByte[i * 3 + 1] = bf[1];  
             bf[2] = b2;  
             fullByte[i * 3 + 2] = bf[2];  

         }  
         return fullByte;  
     }  

	
	/**
	 * 测试 独立解码能力
	 */
	public static void test2() {
		byte[] b = HexTool
				.parseHstring("'220000820f04b2b1b0b6363230ba30942a811000000000000461d8d40412e1fc01e0418200000000000000001400'H");
		// .parseHstring("'22040002 00800000 0400017E A0008800 00000000 0230EC6A 020970FE 00F020C1 00000000 00000000 0A00'H");

		// 解析
		ByteArrayInputStream source = new ByteArrayInputStream(b);
		// Decode the card whose encoding is in the 'encoding' byte array.
		System.out.println("\nThe decoder's trace messages ...\n");
		// Ngtp decodedCard = (Ngtp)key.decode(source, new Ngtp());
		NGTPServiceData decodeNgtp = null;
		try {
			decodeNgtp = (NGTPServiceData) coder.decode(source,
					new NGTPServiceData());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(decodeNgtp.toString());
		// System.out.println(JSONObject.toJSONString(decodeNgtp));

	}

	/**
	 * 测试 NGTP JavaBean 转换解码
	 */
	public static void test1() {
		// 创建密钥对象
		Ngtp key = new Ngtp();
		// 构建对象
		NGTPServiceData nsd = new NGTPServiceData();
		// 初始化对象
		nsd.initComponents();
		// 各种对象关系
		nsd.setMessageType(ServiceMessageType.dataRequest);
		NGTPDownlinkCore ndlc = new NGTPDownlinkCore();
		GenericParams gps = new GenericParams();
		GenericParameter gp = new GenericParameter();
		gp.setKey(GenericParameterKey.createGenericParameterKeyWithId(2004));
		gp.setValue(GenericParameterValue
				.createGenericParameterValueWithBoolVal(true));

		GenericParameter gp2 = new GenericParameter();
		gp2.setKey(GenericParameterKey
				.createGenericParameterKeyWithName(new PrintableString("HELLO")));
		gp2.setValue(GenericParameterValue
				.createGenericParameterValueWithStringVal(new UTF8String16(
						"JNAD @ 3.1415")));
		gps.add(gp2);

		ndlc.setGenericParams(gps);

		// TODO 问题1 ---必须指定核心消息 的类别,因为他是CHOICE ???

		NGTPCore nc = NGTPCore.createNGTPCoreWithDownlink(ndlc);
		nsd.setServiceDataCoreMessage(nc);
		// 创建输出流
		ByteArrayOutputStream sink = new ByteArrayOutputStream();
		// 创建编码器
		Coder c = coder;
		try {
			c.encode(nsd, sink);
		} catch (EncodeFailedException e) {
			e.printStackTrace();
		} catch (EncodeNotSupportedException e) {
			e.printStackTrace();
		}
		// 输出
		byte[] encoding = sink.toByteArray();

		System.out.println("NGTP encoded into " + encoding.length + " bytes.");
		HexTool.printHex(encoding);

		// 解析
		ByteArrayInputStream source = new ByteArrayInputStream(encoding);
		// Decode the card whose encoding is in the 'encoding' byte array.
		System.out.println("\nThe decoder's trace messages ...\n");
		// Ngtp decodedCard = (Ngtp)key.decode(source, new Ngtp());
		NGTPServiceData decodeNgtp = null;
		try {
			decodeNgtp = (NGTPServiceData) c.decode(source,
					new NGTPServiceData());

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(decodeNgtp.toString());
		// System.out.println(JSONObject.toJSONString(decodeNgtp));

	}

	/**
	 * 本测试只要模拟了展示了Ecall的例子数据
	 */
	private static void test3() {
		// 创建密钥对象
		Ngtp key = new Ngtp();
		// 构建对象
		NGTPServiceData nsd = new NGTPServiceData();
		// 初始化对象
		nsd.initComponents();
		// 各种对象关系
		nsd.setMessageType(ServiceMessageType.update);

		NGTPDownlinkCore ndlc = new NGTPDownlinkCore();
		GenericParams gps = new GenericParams();
		GenericParameter gp = new GenericParameter();
		gp.setKey(GenericParameterKey.createGenericParameterKeyWithId(2004));
		gp.setValue(GenericParameterValue
				.createGenericParameterValueWithBoolVal(true));

		GenericParameter gp2 = new GenericParameter();
		gp2.setKey(GenericParameterKey
				.createGenericParameterKeyWithName(new PrintableString("HELLO")));
		gp2.setValue(GenericParameterValue
				.createGenericParameterValueWithStringVal(new UTF8String16(
						"JNAD @ 3.1415")));
		gps.add(gp2);

		ndlc.setGenericParams(gps);

		// TODO 问题1 ---必须指定核心消息 的类别,因为他是CHOICE ???

		NGTPCore nc = NGTPCore.createNGTPCoreWithDownlink(ndlc);
		nsd.setServiceDataCoreMessage(nc);
		// 创建输出流
		ByteArrayOutputStream sink = new ByteArrayOutputStream();
		// 创建编码器
		Coder c = key.getDefaultCoder();
		try {
			c.encode(nsd, sink);
		} catch (EncodeFailedException e) {
			e.printStackTrace();
		} catch (EncodeNotSupportedException e) {
			e.printStackTrace();
		}
		// 输出
		byte[] encoding = sink.toByteArray();

		System.out.println("NGTP encoded into " + encoding.length + " bytes.");
		HexTool.printHex(encoding);
	}

	/**
	 * 生成DSPT的ASN数据 (上行 UPLINK)
	 */
	public static void test4() {
		// 创建密钥对象
		Ngtp key = new Ngtp();
		// 创建总对象 Root
		NGTPDispatcherData nGTPDispatcherData = new NGTPDispatcherData();
		// 创建上行链路 21
		UplinkNGTPDispatcherData uplinkNGTPDispatcherData = new UplinkNGTPDispatcherData();
		// 创建 公共 31
		NGTPDispatcherDataCommon nGTPDispatcherDataCommon = new NGTPDispatcherDataCommon();
		// 创建上行Dspt 拓展 32
		UplinkNGTPDispatcherDataExtension uplinkNGTPDispatcherDataExtension = new UplinkNGTPDispatcherDataExtension();
		// --> 分支,公共部分数据
		{
			// 设置事件发起者 (必须)
			nGTPDispatcherDataCommon.setEventInitiator(EventInitiator.tu);
			// 设置事件创建时间 (必须)
			nGTPDispatcherDataCommon.setEventCreationTime(new TimeStamp());
			nGTPDispatcherDataCommon.getEventCreationTime().setSeconds(
					VeDate.getSecondsFor20000101000000());
			nGTPDispatcherDataCommon.getEventCreationTime().setMillis(
					VeDate.getMillis());
			;

			// 设置事件类型 目前设置为ECall (必须)
			nGTPDispatcherDataCommon
					.setServiceType(ApplicationServiceType.Value.emergency_call);
			// 设置消息类型 目前设置为 上行Service数据 (2) (必须)
			nGTPDispatcherDataCommon
					.setMessageType(DSPTMessageType.upServiceData);
			// 设置 是否需要调度层 数据返回 (目前为否)(必须)
			nGTPDispatcherDataCommon.setDsptAckRequired(new BOOLEAN(false));
			// 假如为真不期待任何回应,除了可能的应用消息()
			nGTPDispatcherDataCommon
					.setStatelessNGTPmessage(new BOOLEAN(false));
		}
		// --> 分支,上行部分数据
		{
			// 只有在Ecall/BCall 语音请求时才为TRUE
			uplinkNGTPDispatcherDataExtension
					.setCrqmRequest(new BOOLEAN(false));
			// 消息待检查?
			uplinkNGTPDispatcherDataExtension
					.setMessagePendingCheck(new BOOLEAN(false));
			// 基础位置点 通常是被省略的 (可选,已设置一个点)
			uplinkNGTPDispatcherDataExtension
					.setBasicPosition(new BasicPosition(new INTEGER(
							NGTPValueUtil.getMilliarcsecondByPosition(39.915)),
							new INTEGER(NGTPValueUtil
									.getMilliarcsecondByPosition(116.404))));
			// 设置Service数据的长度 (必选)

			// Service Data 的长度 基于数据长度 获取相对应的包装类(必选)
			uplinkNGTPDispatcherDataExtension
					.setServiceDataMessageLength(NGTPValueUtil
							.getMessageLengthForChosen(35));
			// Service Data的编码方式 要求的方式 asn1_per_unaligned PER 非对称 ,后面参数未使用 (必选)
			uplinkNGTPDispatcherDataExtension
					.setServiceDataEncoding(new DataEncoding(
							EncodingType.asn1_per_unaligned,
							new MajMinVersion6(new INTEGER(3), new INTEGER(1))));
			// Service 网络服务协议版本 目前先预设 3.1 (必选)
			uplinkNGTPDispatcherDataExtension
					.setServiceDataProtocolVersion(new MajMinVersion16(
							new ProtocolVersionSingle8(3),
							new ProtocolVersionSingle8(1)));

		}

		uplinkNGTPDispatcherData
				.setExtension(uplinkNGTPDispatcherDataExtension);
		uplinkNGTPDispatcherData.setCommon(nGTPDispatcherDataCommon);
		// 放入上行选择
		nGTPDispatcherData.setUplink(uplinkNGTPDispatcherData);

		// 创建输出流
		ByteArrayOutputStream sink = new ByteArrayOutputStream();
		// 创建编码器
		try {
			coder.encode(nGTPDispatcherData, sink);
		} catch (EncodeFailedException e) {
			e.printStackTrace();
		} catch (EncodeNotSupportedException e) {
			e.printStackTrace();
		}
		// 输出
		byte[] encoding = sink.toByteArray();

		System.out.println("NGTP encoded into 0x"
				+ Integer.toHexString(encoding.length) + " bytes.");
		HexTool.printHex(encoding);
 
		
		NGTPDispatcherData decodeNgtpdspt = (NGTPDispatcherData) NGTPUtil
				.parseHexToObject(NGTPUtil.parseHstring("071AF7BF FA00D801 220C885E 5580C098 E4120080 23590301"), new NGTPDispatcherData());
		System.out.println(decodeNgtpdspt.toString());

	}

	public static void test5() {
		//
		byte b[] = NGTPUtil.parseHstring("c18c 3953 6a54 60c1"
				+ "8306 0c18 b068 5ec4 79fc 7b10 0805 f4eb"
				+ "9383 a5eb d8b2 6eb9 82e6 0b98 ba62 e1ab"
				+ "66ee 66d5 a376 0e58 3462 cdcb 562c 5829"
				+ "8b36 2c18 3060 c183 0605 70e5 c366 0c4b"
				+ "d88f 450f 7d01 79cd 4905 393f 4012 3d0a"
				+ "54c2 5799 0670 3085 4008 0088 1120 0c60"
				+ "0c20 0d20 0d40 0d20 0da0 0d20 0dc0 0ce6"
				+ "0031 0032 0033 0034 0035 0036 ");

		NGTPDispatcherData decodeNgtp = (NGTPDispatcherData) NGTPUtil
				.parseHexToObject(b, new NGTPDispatcherData());
		// System.out.println(JSON.toJSONString(decodeNgtp));
		// System.out.println(decodeNgtp.getXMLProperties());
		// NGTPUtil.parseHstring()
		System.out.println(decodeNgtp.toString());
	}

	/**
	 * 生成一个serviceData(上行Ecall)
	 */
	public static void test6() {

		// 构建对象
		NGTPServiceData nsd = new NGTPServiceData();
		// 初始化对象
		// nsd.initComponents();
		// 各种对象关系(开始创建请求)
		nsd.setMessageType(ServiceMessageType.startRequest);

		nsd.setTestFlag(BOOLEAN.FALSE);
		nsd.setAppAckRequired(BOOLEAN.FALSE);

		NGTPCore nc = new NGTPCore();
		NGTPUplinkCore nuc = new NGTPUplinkCore();
		// nuc.initComponents();

		// nuc.getVehicleStatus().setState(VehicleStateType.key_on_engine_off);

		// 触发按钮 基于Ecall的按钮
		nuc.setTrigger(new Trigger(
				new TriggerType[] { TriggerType.eCallButton }));

		// 填写碰撞数据
		nuc.setCrashData(new CrashInformation());
		// 初始化内部变量
		// cif.initComponents();
		nuc.getCrashData().setType(new Type());

		nuc.getCrashData().getType().setFrontCrash(BOOLEXT.isTrue);
		nuc.getCrashData().getType().setRearCrash(BOOLEXT.isTrue);
		nuc.getCrashData().getType().setSideCrash(BOOLEXT.isTrue);
		nuc.getCrashData().getType().setRollover(BOOLEXT.isTrue);

		// 添加车辆信息

		nuc.setTuStatus(new TelematicUnitStatus());
		// nuc.getTuStatus().initComponents();
		// 设置版本号（必选）
		nuc.getTuStatus().setConfigVersion(new TuConfigVersion(65535));
		// 设置车辆已经激活（必选）
		nuc.getTuStatus().setActivation(TuActivationStatus.activated);
		// 设置电源选项
		nuc.getTuStatus().setPower(TUPowerSource.mainBattery);
		// 设置是否手机已经连接（必选）
		nuc.getTuStatus().setMobilePhoneConnected(BOOLEXT.isUnused);
		// 标注是否有拓展天线（必选）
		nuc.getTuStatus().setUsesExternalGnss(BOOLEXT.isUnknown);

		// 添加位置链
		FullPosition fp = new FullPosition();
		// 添加基本的位置数据
		fp.setBasicPos(new net.sirun.ngtp.ngtp_service_data.BasicPosition(
				new INTEGER(NGTPValueUtil.getMilliarcsecondByPosition(39.915)),
				new INTEGER(NGTPValueUtil.getMilliarcsecondByPosition(116.404))));
		// 设置拓展的位置数据
		fp.setExtendedPos(new ExtendedPosition(33, 26, null,
				new net.sirun.ngtp.ngtp_service_data.TimeStamp(VeDate
						.getSecondsFor20000101000000()), 0));
		nuc.setPearlChain(new BasicPearlChain());
		nuc.getPearlChain().add(fp);

		//

		nc.setUplink(nuc);
		nsd.setServiceDataCoreMessage(nc);

		NGTPUtil.printByteArray(NGTPUtil.getPer4ByteArray(nsd));

	}

	// ASN.1 转 json DSPT

	public static void test7() {

		NGTPDispatcherData decodeNgtpdspt = (NGTPDispatcherData) NGTPUtil
				.parseHexToObject(
						NGTPUtil.parseHstring("071AF7C0 2C007801 220C885E 5580C098 E4120080 23590301 "),
						new NGTPDispatcherData());
		decodeNgtpdspt.getXMLProperties();

		System.out.println(decodeNgtpdspt.toString());

		// JSON.toJSON(decodeNgtpdspt);÷

	}
	
	public static void test8() {
		
		System.currentTimeMillis();
		
	}
	
	
	
	
	
}
//
//
//
// public void readNGTPMessage(String filePath)throws Exception{
// //
// byte b[] = NGTPUtil
// .parseHstring("c18c 3953 6a54 60c1"+
// "8306 0c18 b068 5ec4 79fc 7b10 0805 f4eb"+
// "9383 a5eb d8b2 6eb9 82e6 0b98 ba62 e1ab"+
// "66ee 66d5 a376 0e58 3462 cdcb 562c 5829"+
// "8b36 2c18 3060 c183 0605 70e5 c366 0c4b"+
// "d88f 450f 7d01 79cd 4905 393f 4012 3d0a"+
// "54c2 5799 0670 3085 4008 0088 1120 0c60"+
// "0c20 0d20 0d40 0d20 0da0 0d20 0dc0 0ce6"+
// "0031 0032 0033 0034 0035 0036 ");
//
//
// int dispatcherDataLength,dispactherDataEncodingType;
//
// byte[] source = Util.readFileAsByteArray(filePath);
// byte[] headerData = new byte[5];
// System.arraycopy(source, 0, headerData, 0, 5);
// dispatcherDataLength = headerData[3] - 5;
// dispactherDataEncodingType = headerData[4];
//
// System.out.println("=========Start Decode Dispatcher Data=========");
//
// byte[] dispatcherData = new byte[dispatcherDataLength];
// System.arraycopy(source, 5, dispatcherData, 0, dispatcherDataLength);
//
// ByteArrayInputStream dispatch_ios = new ByteArrayInputStream(dispatcherData);
//
// NGTPDispatcherData dispatch_decoded = NGTPDispatcherData.per_decode(false,
// dispatch_ios);
//
// System.out.println(dispatch_decoded.getDownlink().getCommon().getServiceType());
//
// System.out.println("ServiceType " +
// dispatch_decoded.getUplink().getCommon().getServiceType());
//
// System.out.println("========Start Decode Service Data==========");
// int startPos = dispatcherDataLength + 5;
// serviceDataLength = source.length - startPos ;
//
// byte[] serviceData = new byte[serviceDataLength];
// System.out.println(serviceDataLength);
// System.arraycopy(source, startPos, serviceData, 0, serviceDataLength);
//
// ByteArrayInputStream service_ios = new ByteArrayInputStream(serviceData);
// NGTPServiceData service_decoded = NGTPServiceData.per_decode(false,
// service_ios);
// System.out.println(service_decoded.getServiceDataUserMessage().getPRequest_Login().getUserName());
//
// System.out.println("=========Decode Complete!=============");
//
// }
//
//
//
//
// public String generateServiceData() {
// //生成服务数据service data
// boolean testCallFlag = false;
// boolean serviceDataUpdateRequest = false;
// boolean serviceDataUpdateResponse = false;
// Acknowledge appAck = Acknowledge.ack;
// boolean appAckRequired = false;
// Account acount = new Account();
// acount.setPassword(password);
// acount.setUserName(username);
// NGTPUserData userData = NGTPUserData.Account(acount);
//
//
// NGTPServiceData serviceData = new NGTPServiceData();
// serviceData.setTestCallFlag(testCallFlag);
// serviceData.setServiceDataUpdateRequest(serviceDataUpdateRequest);
// serviceData.setServiceDataUpdateResponse(serviceDataUpdateResponse);
// serviceData.setAppAck(appAck);
// serviceData.setAppAckRequired(appAckRequired);
// serviceData.setServiceDataUserMessage(userData);
// ByteArrayOutputStream bos=new ByteArrayOutputStream();
// serviceData.per_encode(false, bos); //per编码需要用到相应的开发包
// byte[] bs=bos.toByteArray();
// System.out.println(HexConvert.toHexString(bs));
// return HexConvert.toHexString(bs);
// }
//
//
// public byte[] generateUplinkNGTPDispatcherData(byte[] serviceData) throws
// Exception{
// //生成NGTP消息
// UplinkNGTPDispatcherDataExtension extension = new
// UplinkNGTPDispatcherDataExtension();
// extension.setCrqmRequest(false);
// BasicPosition bp = new BasicPosition();
// bp.setLatitude(12379812);
// bp.setLongitude(43818912);
// extension.setBasicPosition(bp);
// extension.setHmiLanguage(3);
// int msgLength = serviceData.length;
// MessageLength messageLength = MessageLength.messageLength8(msgLength);
// extension.setServiceDataMessageLength(messageLength);
// EncodingType encodingType = EncodingType.asn1_per_unaligned;
// EncodingVersion encodingVersion = new EncodingVersion();
// encodingVersion.setMajorVersion(2);
// encodingVersion.setMinorVersion(0);
// DataEncoding dataEncoding = new DataEncoding();
// dataEncoding.setEncodingType(encodingType);
// dataEncoding.setEncodingVersion(encodingVersion);
// extension.setServiceDataEncoding(dataEncoding);
// ProtocolVersion16 pv16 = new ProtocolVersion16();
// pv16.setMajorVersion(2);
// pv16.setMinorVersion(0);
// extension.setServiceDataProtocolVersion(pv16);
// extension.setHomeNetwork("WLAN");
// extension.setCurrentNetwork("GPRS");
// UplinkNGTPDispatcherData uplink = new UplinkNGTPDispatcherData();
// NGTPDispatcherDataCommon common =
// DispatcherData.generateCommon(DSPTMessageType.upServiceData);
// uplink.setCommon(common);
// uplink.setExtension(extension);
// NGTPDispatcherData dspt = NGTPDispatcherData.uplink(uplink);
// ByteArrayOutputStream bos=new ByteArrayOutputStream();
// dspt.per_encode(false, bos);
// byte[] bs=bos.toByteArray();
// return bs;
// }
//
// public static NGTPDispatcherDataCommon generateCommon(DSPTMessageType
// messageType) throws Exception{
//
// NGTPDispatcherDataCommon common = new NGTPDispatcherDataCommon();
// common.setServiceType(Integer.valueOf(QorosContants.getProperties("serviceType")));
// VIN vin = DispatcherData.setupVIN(QorosContants.getProperties("vin"));
//
// VehicleIdentification vi = VehicleIdentification.vin(vin);
// common.setVehicleIdentification(vi);
//
// TimeStamp eventCreationTime = new TimeStamp();
// eventCreationTime.setSeconds(397483647);
// eventCreationTime.setMillis(123);
// common.setEventCreationTime(eventCreationTime);
//
// EventInitiator eventInitiator = EventInitiator.tu;
// common.setEventInitiator(eventInitiator);
//
// common.setMessageType(messageType);
//
// Integer uplinkCount = 1;
// Integer downlinkCount = 0;
// MessageCounter messageCounter = new MessageCounter();
// messageCounter.setDownlinkCount(downlinkCount);
// messageCounter.setUplinkCount(uplinkCount);
// common.setMessageCounter(messageCounter);
//
// common.setDsptAckRequired(true);
// common.setStatelessNGTPmessage(false);
//
//
// MobileDeviceIdentifier mdi = new MobileDeviceIdentifier();
//
// mdi.setPublicAddress(QorosContants.getProperties("udp"));
// mdi.setEquipmentIdentifier("354709041395110");
// mdi.setSubscriberIdentity("13100000000");
// mdi.setIccId("898601");
// common.setMobileId(mdi);
//
// TimeStamp messageCreationTime = new TimeStamp();
//
// messageCreationTime.setSeconds(397483658);
// messageCreationTime.setMillis(123);
// common.setMessageCreationTime(messageCreationTime);
//
// return common;
//
// }
// }
