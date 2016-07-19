package net.sirun.test;

import java.util.HashMap;

import javax.security.auth.login.Configuration;
import javax.tools.DiagnosticCollector;

import net.sirun.ngtp.ngtp_service_data.*;
import net.sirun.ngtp.ngtp_service_data.AddressBlock.AddressUsage;
import net.sirun.ngtp.ngtp_service_data.ApplicationConfiguration.ECall_psapType;
import net.sirun.ngtp.ngtp_service_data.CommunicationAddress.ValidityRange;
import net.sirun.ngtp.ngtp_service_data.CountryConfigurationBlock.Addresses;
import net.sirun.ngtp.ngtp_service_data.CountryConfigurationBlock.Applications;
import net.sirun.ngtp.ngtp_service_data.CrashInformation.Type;
import net.sirun.ngtp.ngtp_service_data.DiagnosticTroubleCode.Node;
import net.sirun.ngtp.ngtp_service_data.ExtendedVehicleStatus.BulbFailures;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.Alerts;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.GenericParameters;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.Journeys;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.Trackpoints;
import net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.Trigger;
import net.sirun.ngtp.ngtp_service_data.RemoteOperationResponseList.Responses;
import net.sirun.ngtp.ngtp_service_data.TUDiagnosticData.TroubleCodes;
import net.sirun.ngtp.ngtp_service_data.GenericParameterValue.Positions;
import net.sirun.ngtp.ngtp_service_data.NGTPDownlinkCore.ErrorCodes;
import net.sirun.ngtp.ngtp_service_data.NGTPDownlinkCore.GenericParams;
import net.sirun.ngtp.ngtp_service_data.NGTPDownlinkCore.PoiDataSet;
import net.sirun.ngtp.ngtp_service_data.PointOfInterest.Attributes;
import net.sirun.ngtp.ngtp_service_data.RemoteOperationRequestList.RemoteOperations;
import net.sirun.ngtp.ngtp_service_data.RemoteOperationTrigger.DoorStatusChange;
import net.sirun.ngtp.ngtp_service_data.RemoteOperationTrigger.Periodic;
import net.sirun.ngtp.ngtp_service_data.TuConfiguration.Countries;
import net.sirun.util.NGTPUtil;
import net.sirun.util.trans.Dom4Asn;
import net.sirun.util.trans.Dom4json;
import net.sirun.util.trans.ServiceDataAsnTrans;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.oss.asn1.BOOLEAN;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Null;
import com.oss.asn1.OctetString;
import com.oss.asn1.PrintableString;
import com.oss.asn1.UTF8String;
import com.oss.asn1.UTF8String16;
 

public class JSONTransTest {

	public static void main(String s[]) {
		System.out.println("   !!!!" + Boolean.getBoolean("true"));
		// test1();
		// setObject();
		getObjects();
		// System.out.println(JsonAsnTrans.asn2JsonAtServiceData(getObjects()));
	}

	// 获取当前类型
	// getTypeInfo().getASN1TypeName()
	// 获取当前类的地址
	// .getTypeInfo().getClassName()

	// 讲ASN转换为JSON
	// 其实是JAVABean 转JSON
	private static void test1() {
		UTF8String16 uf = new UTF8String16("Good Week!");

		// ro.getOperationScriptVersion().getMajorVersion().longValue();

		System.out.println(uf.stringValue());

		NGTPServiceData nsd = getObjects();
		System.out.println(nsd.toString());
		NGTPDownlinkCore ndlc = (NGTPDownlinkCore) nsd.getServiceDataCoreMessage().getChosenValue();
		System.out.println("v:" + ndlc.getPoiDataSet().get(0).getSubject());
		Object o = null;
		try {
			o = TransformTest.invokeMethod(nsd, "getServiceDataCoreMessage");
			o = TransformTest.invokeMethod(o, "getTypeInfo");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(o);

		// JSON.toJSONString(nsd,SerializerFeature.DisableCircularReferenceDetect)
		// nsd.

	}

	private static void test2() {
		JSONSerializer js = new JSONSerializer();
		js.config(SerializerFeature.WriteEnumUsingToString, false);

		Person p = new Person();

		p.setSex(SEX.FEMALE);
		// System.out.println(JSON.toJSON(p))

		SerializeWriter out = new SerializeWriter();
		JSONSerializer serializer = new JSONSerializer(out);

		String s = JSON.toJSONString(p, SerializerFeature.PrettyFormat, SerializerFeature.WriteEnumUsingToString);

		SerializerFeature[] features = { SerializerFeature.UseISO8601DateFormat, SerializerFeature.UseSingleQuotes };

		System.out.println(JSON.toJSONString(p, features)); //

		System.out.println(s);
		SEX.FEMALE.setSex("asd333");
		System.out.println(SEX.FEMALE);

	}

	public static void setObject() {
		NGTPServiceData nsd = new NGTPServiceData();
		nsd.setAppAck(Acknowledge.valueOf(1));
		nsd.setTestFlag(Boolean.getBoolean("false"));
		nsd.setMessageType(net.sirun.ngtp.ngtp_service_data.ServiceMessageType.valueOf(6));
		nsd.setAppAckRequired(Boolean.getBoolean("true"));
		NGTPDownlinkCore nd = new NGTPDownlinkCore();
		nsd.setServiceDataCoreMessage(NGTPCore.createNGTPCoreWithDownlink(nd));
		RemoteOperationRequestList ror = new RemoteOperationRequestList();
		nd.setRemoteOperations(ror);
		MajMinVersion16 mj = new MajMinVersion16();
		ror.setOperationScriptVersion(mj);
		ProtocolVersionSingle8 pvs = new ProtocolVersionSingle8();
		// pvs.setValue();
		mj.setMinorVersion(pvs);
		RemoteOperationTrigger rot = new RemoteOperationTrigger();
		// rot.setExternalTemperatureAboveDeg(new INTEGER(26));
		rot.createRemoteOperationTriggerWithExternalTemperatureBelowDeg(new INTEGER(26));
		// rot.createRemoteOperationTriggerWithDistanceMtrx100()
		ror.setExecutionTrigger(rot);
		// ror.setName(RemoteOperationName.valueOf(value));
		GenericText gt = new GenericText();
		UTF8String16 ut816 = new UTF8String16();
		ElectricVehicleStatus evs = new ElectricVehicleStatus();
		// evs.setChargingProfile(chargingProfile);
		ror.setRemoteOperations(new RemoteOperations());
		RemoteOperationRequest ro = new RemoteOperationRequest();
		ro.setRequiredVehicleStates(VehicleStateType.engine_on_moving);
		// nd.setConfiguration(TuConfiguration);
		ro.setOperationDesc(new SimpleRemoteOperation(null, RemoteOperationType.diagnostics_cancel));
		INTEGER it = new INTEGER();
		// it.
		SimpleRemoteOperation sro = new SimpleRemoteOperation();
		PrintableString ps = new PrintableString();
		// ps.setValue(arg0);
		System.out.println(new RemoteOperations().getClass().getName());

		ror.setRemoteOperations(new RemoteOperations(new RemoteOperationRequest[] {}));
		// nd.setConfiguration(new TuConfiguration);

		TuConfiguration tc = new TuConfiguration();
		// tc.setCountries(new Countries);
		Countries ct = new Countries();
		CountryConfigurationBlock ccb = new CountryConfigurationBlock();
		// ccb.setApplicationConfig(new
		// ApplicationConfiguration().setECall_psapType(
		// ECall_psapType.manualOnly););
		Addresses ad = new Addresses();

		ccb.setAddresses(ad);
		AddressBlock ab = new AddressBlock();
		ab.setAddressUsage(AddressUsage.destination);
		ad.add(ab);
		AddressType at = new AddressType();
		Null n = new Null();
		// AddressUsage.class
		CommunicationAddress ca = new CommunicationAddress();
		ca.setNetworkID(NetworkType.gsm_bs24);
		ca.setValidityRange(ValidityRange.reserved);
		Address adr = new Address();

		OctetString os = new OctetString();
		// os.byteArrayValue();
		// os.setValue(arg0);
		adr.createAddressWithAddress_ascii(os);
		ca.setAddress(adr);
		at.createAddressTypeWithAbsolute(ca);
		// INTEGER it = new INTEGER();
		// it.longValue()

		// at.selectPrimitive(arg0)
		ab.setAddress(at);

		ct.add(ccb);
		RemoteOperationRequest rorc = new RemoteOperationRequest();
		SimpleRemoteOperation sro2 = new SimpleRemoteOperation();
		sro.setOperationType(RemoteOperationType.diagnostics_cancel);
		rorc.setOperationDesc(sro2);
		ut816.setValue("asd");
		gt.setText(ut816);
		PointOfInterest p = new PointOfInterest();
		p.setName(new PersonName());
		p.setAddress(new PostalAddress());
		p.setPhone1(new Phone(new PrintableString(), PhoneType.home));
		p.setGeoCoordinates(new BasicPosition());
		p.setAttributes(new Attributes(new PointOfInterestAttribute[] {}));

		nd.setGenericParams(new GenericParams(new GenericParameter[] {}));
		GenericParameter gp = new GenericParameter();
		GenericParameterKey gkey = new GenericParameterKey();
		GenericParameterValue gvalue = new GenericParameterValue();
		// gvalue.createGenericParameterValueWithPoi(new
		// PointOfInterest().setAttributes(new Attributes(new
		// PointOfInterestAttribute[]{})));
		gvalue.createGenericParameterValueWithPositions(new Positions(new FullPosition[] {}));
		Positions pss = new Positions();
		// new BasicPearlChain();
		CrashInformation cif = new CrashInformation();

		NGTPUplinkCore nuc = new NGTPUplinkCore();
		// nuc.setErrorCodes(new ErrorCodes(new ErrorCode[]{}));
		NGTPUplinkCore.ErrorCodes ec = new NGTPUplinkCore.ErrorCodes();
		ErrorCode ecc = new ErrorCode();
		// ecc.createErrorCodesW
		// ec.add(ecc);
		// new PrintableString().setValue(arg0);

		nuc.setErrorCodes(ec);
		nuc.setGenericParameters(new GenericParameters(new GenericParameter[] {}));
		TelematicUnitStatus tus = new TelematicUnitStatus();
		// tus.setDiagnostics(;);
		// tus.setConfigVersion(new TuConfigVersion());
		// new TroubleCodes(new
		// DiagnosticTroubleCode().setNode(Node.createNodeWithTelematicUnit());
		//
		// Countries ct2 new Countries();
		// ct2.add(new CountryConfigurationBlock);
		CountryConfigurationBlock ccbBlock = new CountryConfigurationBlock();

		ccbBlock.setApplications(new Applications(new INTEGER[] {}));
		nuc.setTrigger(new Trigger(new TriggerType[] {}));
		nuc.setAlerts(new Alerts(new AlertType[] {}));
		nuc.setTrackpoints(new Trackpoints(new TrackPoint[] {}));
		nuc.setJourneys(new Journeys(new JourneySummary[] {}));
		// NetworkLocation.createNetworkLocationWithGsmNwLocation(gsmNwLocation)
		nd.setErrorCodes(new ErrorCodes(new ErrorCode[] {}));
		gvalue.createGenericParameterValueWithTrackPoint(new TrackPoint());
		TrackPoint tp = new TrackPoint();
		// GenericParameterValue.createGenericParameterValueWithBoolVal( );
		// GenericParameterValue.createGenericParameterValueWithBoolVal();// n.
		// TriggerType.diagRoutine
		CollectionId cid = new CollectionId();
		FullPosition fp = new FullPosition();
		// VehicleTrackPointData
		fp.setExtendedPos(new ExtendedPosition());
		ExtendedPosition ep = new ExtendedPosition();
		ep.setReliability(new PositionReliability());
		PositionReliability pr = new PositionReliability();
		pr.setFixType(GnssFixType.fix3D);
		pr.setInsideDigitizedArea(BOOLEXT.isTrue);
		gp.setValue(new GenericParameterValue());
		gp.setKey(new GenericParameterKey());
		nd.setPoiDataSet(new PoiDataSet(new PointOfInterest[] {}));
		// operationScriptVersion
		// nsd.setServiceDataCoreMessage(NGTPCore.createNGTPCoreWithDownlink(new
		// NGTPDownlinkCore())));
		INTEGER i = new INTEGER();
		// externalTemperatureAboveDeg
		// i.setValue(arg0);
		NGTPUtil.printByteArray(NGTPUtil.getPer4ByteArray(nsd));

		// JsonAsnTrans.asn2JsonAtServiceData(nsd);
	}

	public static NGTPServiceData getUplinkObjects() {
		// 构建对象
		NGTPServiceData nsd = new NGTPServiceData();
		// 初始化对象
		nsd.initComponents();
		// 各种对象关系
		nsd.setMessageType(ServiceMessageType.acknowledge);
		// System.out.println("First" + nsd.getMessageType().longValue());
		nsd.setAppAck(Acknowledge.ack);
		nsd.setTestFlag(new BOOLEAN(true));
		
		NGTPUplinkCore nuc = new NGTPUplinkCore();
		nsd.setServiceDataCoreMessage(new NGTPCore().createNGTPCoreWithUplink(nuc));
		
		Alerts al = new Alerts();
		al.add(new AlertType(new TimeStamp(23),AlertData.createAlertDataWithFuelLevelLtrs(new INTEGER(25)),true));
		al.add(new AlertType(new TimeStamp(24),AlertData.createAlertDataWithLowBatteryVoltx10(26),true));
		nuc.setAlerts(al);
		nuc.setClimateStatus(new ClimateStatus(BOOLEXT.isTrue, new ClimateTimer(new INTEGER(1),new INTEGER(26),new TimeHM(14, 12)), new ClimateTimer(new INTEGER(1),new INTEGER(23),new TimeHM(14, 10)), ClimateOperatingStatus.failure_low_voltage, new INTEGER(5), new INTEGER(7)));
		//碰撞数据
		nuc.setCrashData(new CrashInformation(new OctetString(new byte[]{3,4,5}), new INTEGER(6), new INTEGER(7), new net.sirun.ngtp.ngtp_service_data.CrashInformation.Type(BOOLEXT.isFalse,BOOLEXT.isTrue	,BOOLEXT.isTrue,BOOLEXT.isUnused)));
		nuc.setDashboardStatus(new DashboardStatus(BOOLEAN.TRUE));
		nuc.setDebugInfo(new net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.DebugInfo(new net.sirun.ngtp.ngtp_service_data.DebugInfo[]{new net.sirun.ngtp.ngtp_service_data.DebugInfo(new UTF8String16("A"),new INTEGER(1)),new net.sirun.ngtp.ngtp_service_data.DebugInfo(new UTF8String16("B"),new INTEGER(2))}));
		nuc.setElectricVehicleStatus(new ElectricVehicleStatus(new UTF8String16("Evs"), BOOLEXT.isUnknown, BOOLEXT.isTrue, BOOLEXT.isTrue, new INTEGER(3), new INTEGER(3), new INTEGER(4), ChargeType.charge_level3));
		nuc.setErrorCodes(new  net.sirun.ngtp.ngtp_service_data.NGTPUplinkCore.ErrorCodes(new ErrorCode[ ]{ ErrorCode.createErrorCodeWithGenericError(new PrintableString("er1")),ErrorCode.createErrorCodeWithBrakePedalPressed(new Null())}));
		nuc.setExtendedVehicleStatus(new ExtendedVehicleStatus(	BOOLEXT.isTrue,BOOLEXT.isTrue,
				new INTEGER(3),
				new WindowStatuses( WindowStatus.closed, WindowStatus.open, WindowStatus.unknown, WindowStatus.closed), 
				new DoorStatuses(BOOLEXT.isTrue, BOOLEXT.isUnknown), 
				BOOLEXT.isUnknown, 
				BOOLEXT.isUnknown, 
				BOOLEXT.isUnknown, 
				new INTEGER(4), 
				new INTEGER(6),
				new OdometerData(false,(long)3) ,
				new  TyreStatuses(new TyreStatus(TyrePressureWarning.low_soft_warn, new INTEGER(7)),new TyreStatus(TyrePressureWarning.low_soft_warn, new INTEGER(7)),new TyreStatus(TyrePressureWarning.low_soft_warn, new INTEGER(7)),new TyreStatus(TyrePressureWarning.low_soft_warn, new INTEGER(7))),
				new INTEGER(7),
				BOOLEXT.isUnknown, 
				new TimeHM(new INTEGER(3), new INTEGER(4)),
				new EcoGrade(new INTEGER(7), new INTEGER(8)),
				new INTEGER(2), 
				new INTEGER(2),
				new INTEGER(2), 
				ServiceWarningStatus.time_for_srvc, 
				ServiceWarningTrigger.engine_hours, 
				new BulbFailures(new Bulb[]{ net.sirun.ngtp.ngtp_service_data.Bulb.fog_rear_any}),
				LiquidLevelWarning.normal, 
				LiquidLevelWarning.high, 
				LiquidLevelWarning.normal,
				PressureWarning.normal,
				LiquidLevelWarning.normal,
				new OdometerData(false,(long)3) ,
				new OdometerData(false,(long)3) ,
				new AvgFuelConsumptionCl(3),
				new INTEGER(8)));
		nuc.setGenericParameters(new GenericParameters(new GenericParameter[]{new GenericParameter(new GenericParameterKey().createGenericParameterKeyWithId(3),new GenericParameterValue().createGenericParameterValueWithBoolVal(true))}));
		nuc.setGenericText(new GenericText(new UTF8String16("Tess21")));
		nuc.setJourneys(new Journeys(new JourneySummary[]{
				JourneySummary.createJourneySummaryWithType1(
						new JourneySummary1(new CollectionId(1),
						TriggerType.crashModuleCanInput,
						new TimeStamp(6655),
						new OdometerData(true, 23),
						new BasicPosition(new INTEGER(7),new INTEGER(23)),
						(long)3,
						TriggerType.crashModuleCanInput, 
						new TimeStamp(6655), 
						new OdometerData(true, 1),
						new BasicPosition(new INTEGER(7),new INTEGER(23)),new AvgFuelConsumptionCl(3),
						new OctetString("AABBCC".getBytes()),TripType.business
		))}));
		FullPosition fp= new FullPosition(new BasicPosition(new INTEGER(4), new INTEGER(77)),new ExtendedPosition(new INTEGER(2), new INTEGER(33), new PositionReliability(GnssFixType.fix3D, BOOLEXT.isUnknown, BOOLEXT.isUnknown,  BOOLEXT.isTrue, BOOLEXT.isTrue, BOOLEXT.isTrue, new INTEGER(7), new INTEGER(2), new INTEGER(32), BOOLEXT.isTrue),new TimeStamp(62), new INTEGER(3)));

		nuc.setLastGPSTimeStamp(new TimeStamp(3222));
		nuc.setMemoryStatus(new POIMemoryStatus(new INTEGER(6), new INTEGER(2)));
		nuc.setMsdInfo(new MSDInformation(7));
		nuc.setNavigationInformation(new NavigationInformation(	new BasicPosition(new INTEGER(7), new INTEGER(78)), new TimeHM(new INTEGER(7), new INTEGER(41)), new INTEGER(7),new INTEGER(8)));
		nuc.setPearlChain(new BasicPearlChain(new FullPosition[]{new FullPosition(new BasicPosition(new INTEGER(4), new INTEGER(77)),new ExtendedPosition(new INTEGER(2), new INTEGER(33), new PositionReliability(GnssFixType.fix3D, BOOLEXT.isUnknown, BOOLEXT.isUnknown,  BOOLEXT.isTrue, BOOLEXT.isTrue, BOOLEXT.isTrue, new INTEGER(7), new INTEGER(2), new INTEGER(32), BOOLEXT.isTrue),new TimeStamp(62), new INTEGER(3)))}));
		nuc.setPositionExtension(new ExtendedPosition(new INTEGER(3), new INTEGER(32), new PositionReliability(GnssFixType.fix3D, BOOLEXT.isUnknown, BOOLEXT.isUnknown,  BOOLEXT.isTrue, BOOLEXT.isTrue, BOOLEXT.isTrue, new INTEGER(7), new INTEGER(2), new INTEGER(32), BOOLEXT.isTrue), new TimeStamp(445),new INTEGER(3)));
		nuc.setRemoteOperationResponse(new RemoteOperationResponseList(new MajMinVersion16(new ProtocolVersionSingle8(67), new ProtocolVersionSingle8(7)),new Integer(3),new TimeStamp(32),new Responses(new RemoteOperationResponse[]{
				new RemoteOperationResponse(new SimpleRemoteOperation(new PrintableString("A"), RemoteOperationType.diagnostics_read),32,new TimeStamp(74)	),
				new RemoteOperationResponse(new SimpleRemoteOperation(new PrintableString("B"), RemoteOperationType.diagnostics_read),32,new TimeStamp(74)	)})));
		nuc.setTrackpoints(new Trackpoints(new TrackPoint[]{
				new TrackPoint(
				TriggerType.crashModuleWireInput,
				new TimeStamp(2),
				new CollectionId(3),
				new VehicleTrackPointData(
						new OdometerData(BOOLEAN.TRUE, new INTEGER(4)),
						new INTEGER(7),
						VehicleStateType.engine_on_moving),
				new FuelTrackPointData(new INTEGER(3), new INTEGER(4), new INTEGER(6)),fp,new NetworkInformation( NetworkRegistrationStatus.registered, NetworkLocation.createNetworkLocationWithGsmNwLocation(new GsmNetworkLocation(3, 7, 8, 9,3)),3),new SecurityTrackPointData( TUPowerSource.reserveBatterySecondary,new TUBackupBatteryStatus(new INTEGER(3), new INTEGER(3), new INTEGER(3), new INTEGER(5)), MainBatteryStatus.battery_1_2,EngineBlockedStatus.blockedByTU,BOOLEXT.isTrue,new INTEGER(3)),TrackPointExtension.createTrackPointExtensionWithEcoRating(3))}));
		nuc.setTrigger(new NGTPUplinkCore.Trigger(new TriggerType[]{TriggerType.diagRoutine,TriggerType.firstFix}));
			TUDiagnosticData tdd = new TUDiagnosticData(TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,TUDiagnostic.functioning,new TroubleCodes(new DiagnosticTroubleCode[]{
														new DiagnosticTroubleCode(
																Node.createNodeWithId(new INTEGER(3)),
																new INTEGER(3),
																new DtcStatusBitsIso14229("TTT".getBytes(),3),
																new INTEGER(3),
																new TimeStamp(3))
														}),new INTEGER(3));
			TUBackupBatteryStatus tbs=	new  TUBackupBatteryStatus(new INTEGER(2),new INTEGER(3),new INTEGER(1),new INTEGER(4));
			DtcStatusBitsIso14229 tbi = new DtcStatusBitsIso14229("TTT".getBytes(),3);
			tbi.setValue("EEE".getBytes());
			tbi.setSignificantBits(6777);
	//		tbi.byteArrayValue()
			System.out.println(tbi.getSize());
//		nuc.getTrackpoints().get(0).getTrigger()
		nuc.setVehicleStatus(new BasicVehicleStatus(VehicleStateType.engine_on_park, EngineBlockedStatus.blockedByTU, BOOLEXT.isTrue));
		nuc.setTuStatus(new TelematicUnitStatus( TUPowerSource.reserveBatterySecondary, tdd,tbs, BOOLEXT.isTrue, new TimeStamp(88654),  new TuConfigVersion(3), TuActivationStatus.activated_eCall, BOOLEXT.isTrue	, new PrintableString("ABCDE12345ABCDE12345"),new PrintableString("98765ZYXWV98765ZYXWV"),new PrintableString("ABCDE12345ABCDE12345"), new PrintableString("98765ZYXWV98765ZYXWV"), new PrintableString("98765ZYXWV98765ZYXWV")));	
		nuc.setVehiclePropulsionType(new VehiclePropulsionType( BOOLEXT.isUnknown, BOOLEXT.isUnknown, BOOLEXT.isUnknown, BOOLEXT.isUnknown, BOOLEXT.isUnknown, BOOLEXT.isUnknown));
		nuc.setVin(new VIN(new PrintableString("abc"), new PrintableString("123456"), new PrintableString("1"), new PrintableString("abcdefg")));
		
		//TyreStatuses
	return nsd;
	}

	public static NGTPServiceData getObjects() {
//		JourneySummary.createJourneySummaryWithType1(type1)
//		NGTPUplinkCore.Journeys
		// 构建对象
		NGTPServiceData nsd = new NGTPServiceData();
		// 初始化对象
		nsd.initComponents();
		// 各种对象关系
		nsd.setMessageType(ServiceMessageType.acknowledge);
		// System.out.println("First" + nsd.getMessageType().longValue());
		nsd.setAppAck(Acknowledge.ack);
		nsd.setTestFlag(new BOOLEAN(true));
		NGTPDownlinkCore ndlc = new NGTPDownlinkCore();
		GenericParams gps = new GenericParams();
		GenericParameter gp = new GenericParameter();
		gp.setKey(GenericParameterKey.createGenericParameterKeyWithId(2004));
		gp.setValue(GenericParameterValue.createGenericParameterValueWithBoolVal(true));

		GenericParameter gp2 = new GenericParameter();
		gp2.setKey(GenericParameterKey.createGenericParameterKeyWithId(0002));
		FullPosition fp = new FullPosition();
		fp.setBasicPos(new BasicPosition(new INTEGER(25), new INTEGER(36666)));
		PositionReliability prl = new PositionReliability();
		prl.setFixType(GnssFixType.fix3DHqFix);
		prl.setInsideDigitizedArea(BOOLEXT.isFalse);
		prl.setFullyDigitizedArea(BOOLEXT.isTrue);
		prl.setMatchedToDigitalMap(BOOLEXT.isUnused);
		prl.setDeadReckoning(BOOLEXT.isFalse);
		prl.setDrCalibrated(BOOLEXT.isTrue);

		prl.setDrDistanceMtr(26);
		prl.setHdopx10(64);
		prl.setNoOfSatellites(47);
		prl.setDifferentialGPSAvailable(BOOLEXT.isTrue);

		fp.setExtendedPos(new ExtendedPosition(new INTEGER(366), new INTEGER(114), prl, new TimeStamp(264), new INTEGER(497)));
		gp2.setValue(GenericParameterValue.createGenericParameterValueWithPositions(new Positions(new FullPosition[] { fp })));
		Positions pps = new Positions(new FullPosition[] { fp });
		// pps.get
		gps.add(gp);
		PointOfInterest pi = new PointOfInterest();
		pi.setSubject(new UTF8String16("3rd"));
		pi.setUseAsDestination(true);
		pi.setAttributes(new Attributes(new PointOfInterestAttribute[] { new PointOfInterestAttribute(new PrintableString("jnad"), new UTF8String16("hello")) }));
		pi.setPhone1(new Phone(new PrintableString("18643278xx"), PhoneType.home));
		pi.setPhone2(new Phone(new PrintableString("18643278xx"), PhoneType.home));
		pi.setPhone3(new Phone(new PrintableString("18643278xx"), PhoneType.home));
		pi.setPhone4(new Phone(new PrintableString("18643278xx"), PhoneType.home));
		pi.setGeoCoordinates(new BasicPosition(new INTEGER(22336664), new INTEGER(1359644155)));
		// pi.getPhone1().getType().longValue()
		ndlc.setPoiDataSet(new PoiDataSet(new PointOfInterest[] { pi }));
		ndlc.setGenericText(new GenericText(new UTF8String16("Good Week!")));

		RemoteOperationRequestList ro = new RemoteOperationRequestList();
		RemoteOperations ros = new RemoteOperations();

		RemoteOperationRequest ror = new RemoteOperationRequest();
		ror.setPeriodSecx10(123);
		ror.setStopIfFail(false);
		ror.setWaitForPreviousCommand(true);
		ror.setRequiredVehicleStates(VehicleStateType.engine_on_park);
		ror.setOperationDesc(new SimpleRemoteOperation(new PrintableString("PrintableString"), RemoteOperationType.diagnostics_read));
		ror.setOperationTimeoutSec(25);
		ror.setOccurs(36);
		ror.setInitialWaitTimeSecx10(12);
		// System.out.println(ror.getPeriodSecx10());
		ros.add(ror);

		// System.out.println("size:" + ros.getSize());
		ro.setOccurs(15);
		ro.setPeriodSecx10(98);
		ro.setRemoteOperations(ros);
		ro.setExecutionTrigger(RemoteOperationTrigger.createRemoteOperationTriggerWithIgnitionOn(new Null()));

		// ro.getOccurs()
		// net.sirun.ngtp.ngtp_service_data.RemoteOperationRequestList.RemoteOperations.

		// ro.getRemoteOperations().get(atIndex)

		ro.setOperationScriptVersion(new MajMinVersion16(new ProtocolVersionSingle8(123), new ProtocolVersionSingle8(21)));
		ndlc.setRemoteOperations(ro);
		RemoteOperationTrigger rot = new RemoteOperationTrigger();
		TimeStamp ts = new TimeStamp(123);
		ts.setSeconds(23123123);
		rot.setExternalTemperatureAboveDeg(new INTEGER(24));
		ro.setExecutionTrigger(rot);
		ro.setName(RemoteOperationName.rotNameActivate);
		// ro.setPeriodSecx10(898);
		GenericParameter gp23 = new GenericParameter();
		gp23.setKey(GenericParameterKey.createGenericParameterKeyWithId(333));
		gp23.setValue(GenericParameterValue.createGenericParameterValueWithStringVal(new UTF8String16("JNAD @ 3.1415")));
		gps.add(gp2);

		ndlc.setGenericParams(gps);

		Countries ct = new Countries();
		CountryConfigurationBlock ccb = new CountryConfigurationBlock();
		ccb.setValidCountryCode(25);
		INTEGER it[] = new INTEGER[] { new INTEGER(25), new INTEGER(55) };
		ccb.setApplications(new Applications(it));
		ccb.setValidCountryCode(13);
		ccb.setApplicationConfig(new ApplicationConfiguration(false, ECall_psapType.eUeCall));
		AddressType at = new AddressType();
		Address ar = new Address();
		ar.setAddress_ascii(new OctetString(new byte[] { 02, 06, 48, 36 }));
		CommunicationAddress ca = new CommunicationAddress(NetworkType.gsm_bs24, ValidityRange.national, ar);
		// ca.getNetworkID().getNamedNumbers()[10].
		at.setAbsolute(ca);
		System.out.println(ar.getChosenValue());
		ccb.setAddresses(new Addresses(new AddressBlock[] { new AddressBlock(1, at, AddressUsage.bcall) }));
		ccb.setActivated(false);
		ct.add(ccb);

		ndlc.setConfiguration(new TuConfiguration(new TuConfigVersion(25), ct));
		ErrorCode ec = new ErrorCode();
		ec.setAlarmActive(new Null());
		ErrorCode ec2 = new ErrorCode();
		ec2.setGenericError(new PrintableString("123"));
		// ec.getChosenValue()
		ndlc.setErrorCodes(new ErrorCodes(new ErrorCode[] { ec, ec2 }));
		// ndlc.getErrorCodes().get(0).getChosenValue()

		NGTPUplinkCore nup = new NGTPUplinkCore();
		NGTPCore nc = NGTPCore.createNGTPCoreWithDownlink(ndlc);
		nsd.setServiceDataCoreMessage(nc);
		return nsd;
	}

}
