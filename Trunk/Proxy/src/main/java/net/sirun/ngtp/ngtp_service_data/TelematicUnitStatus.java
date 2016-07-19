/*************************************************************/
/* Copyright (C) 2014 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED. */

/* Generated for: sky (Trial) */
/* Abstract syntax: ngtp-service_3 */
/* ASN.1 Java project: net.sirun.ngtp.Ngtp */
/* Created: Fri Jun 27 14:42:53 2014 */
/* ASN.1 Compiler for Java version: 6.0 */
/* ASN.1 compiler options and file names specified:
 * -output net.sirun.ngtp -uper -root -messageFormat msvc
 * C:/Documents and Settings/Administrator/desktop/Service Data/ngtp-dspt_3.1.asn
 * C:/Documents and Settings/Administrator/desktop/Service Data/ngtp_servicetypes.asn
 * C:/Documents and Settings/Administrator/desktop/Service Data/ngtp-service_3.2.asn None */


package net.sirun.ngtp.ngtp_service_data;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type TelematicUnitStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TelematicUnitStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public TelematicUnitStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TelematicUnitStatus(TUPowerSource power, 
		    TUDiagnosticData diagnostics, 
		    TUBackupBatteryStatus battery, 
		    BOOLEXT mobilePhoneConnected, 
		    TimeStamp sleepCyclesStartTime, 
		    TuConfigVersion configVersion, 
		    TuActivationStatus activation, BOOLEXT usesExternalGnss, 
		    PrintableString hwVersion, PrintableString swVersionMain, 
		    PrintableString swVersionSecondary, 
		    PrintableString swVersionConfiguration, 
		    PrintableString serialNumber)
    {
	setPower(power);
	setDiagnostics(diagnostics);
	setBattery(battery);
	setMobilePhoneConnected(mobilePhoneConnected);
	setSleepCyclesStartTime(sleepCyclesStartTime);
	setConfigVersion(configVersion);
	setActivation(activation);
	setUsesExternalGnss(usesExternalGnss);
	setHwVersion(hwVersion);
	setSwVersionMain(swVersionMain);
	setSwVersionSecondary(swVersionSecondary);
	setSwVersionConfiguration(swVersionConfiguration);
	setSerialNumber(serialNumber);
    }
    
    /**
     * Construct with required components.
     */
    public TelematicUnitStatus(BOOLEXT mobilePhoneConnected, 
		    TuConfigVersion configVersion, 
		    TuActivationStatus activation, BOOLEXT usesExternalGnss)
    {
	setMobilePhoneConnected(mobilePhoneConnected);
	setConfigVersion(configVersion);
	setActivation(activation);
	setUsesExternalGnss(usesExternalGnss);
    }
    
    public void initComponents()
    {
	mComponents[0] = TUPowerSource.mainBattery;
	mComponents[1] = new TUDiagnosticData();
	mComponents[2] = new TUBackupBatteryStatus();
	mComponents[3] = BOOLEXT.isFalse;
	mComponents[4] = new TimeStamp();
	mComponents[5] = new TuConfigVersion();
	mComponents[6] = TuActivationStatus.factory;
	mComponents[7] = BOOLEXT.isFalse;
	mComponents[8] = new PrintableString();
	mComponents[9] = new PrintableString();
	mComponents[10] = new PrintableString();
	mComponents[11] = new PrintableString();
	mComponents[12] = new PrintableString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TUPowerSource.mainBattery;
	    case 1:
		return new TUDiagnosticData();
	    case 2:
		return new TUBackupBatteryStatus();
	    case 3:
		return BOOLEXT.isFalse;
	    case 4:
		return new TimeStamp();
	    case 5:
		return new TuConfigVersion();
	    case 6:
		return TuActivationStatus.factory;
	    case 7:
		return BOOLEXT.isFalse;
	    case 8:
		return new PrintableString();
	    case 9:
		return new PrintableString();
	    case 10:
		return new PrintableString();
	    case 11:
		return new PrintableString();
	    case 12:
		return new PrintableString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "power"
    public TUPowerSource getPower()
    {
	return (TUPowerSource)mComponents[0];
    }
    
    public void setPower(TUPowerSource power)
    {
	mComponents[0] = power;
    }
    
    public boolean hasPower()
    {
	return componentIsPresent(0);
    }
    
    public void deletePower()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "diagnostics"
    public TUDiagnosticData getDiagnostics()
    {
	return (TUDiagnosticData)mComponents[1];
    }
    
    public void setDiagnostics(TUDiagnosticData diagnostics)
    {
	mComponents[1] = diagnostics;
    }
    
    public boolean hasDiagnostics()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDiagnostics()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "battery"
    public TUBackupBatteryStatus getBattery()
    {
	return (TUBackupBatteryStatus)mComponents[2];
    }
    
    public void setBattery(TUBackupBatteryStatus battery)
    {
	mComponents[2] = battery;
    }
    
    public boolean hasBattery()
    {
	return componentIsPresent(2);
    }
    
    public void deleteBattery()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "mobilePhoneConnected"
    public BOOLEXT getMobilePhoneConnected()
    {
	return (BOOLEXT)mComponents[3];
    }
    
    public void setMobilePhoneConnected(BOOLEXT mobilePhoneConnected)
    {
	mComponents[3] = mobilePhoneConnected;
    }
    
    
    // Methods for field "sleepCyclesStartTime"
    public TimeStamp getSleepCyclesStartTime()
    {
	return (TimeStamp)mComponents[4];
    }
    
    public void setSleepCyclesStartTime(TimeStamp sleepCyclesStartTime)
    {
	mComponents[4] = sleepCyclesStartTime;
    }
    
    public boolean hasSleepCyclesStartTime()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSleepCyclesStartTime()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "configVersion"
    public TuConfigVersion getConfigVersion()
    {
	return (TuConfigVersion)mComponents[5];
    }
    
    public void setConfigVersion(TuConfigVersion configVersion)
    {
	mComponents[5] = configVersion;
    }
    
    
    // Methods for field "activation"
    public TuActivationStatus getActivation()
    {
	return (TuActivationStatus)mComponents[6];
    }
    
    public void setActivation(TuActivationStatus activation)
    {
	mComponents[6] = activation;
    }
    
    
    // Methods for field "usesExternalGnss"
    public BOOLEXT getUsesExternalGnss()
    {
	return (BOOLEXT)mComponents[7];
    }
    
    public void setUsesExternalGnss(BOOLEXT usesExternalGnss)
    {
	mComponents[7] = usesExternalGnss;
    }
    
    
    // Methods for field "hwVersion"
    public PrintableString getHwVersion()
    {
	return (PrintableString)mComponents[8];
    }
    
    public void setHwVersion(PrintableString hwVersion)
    {
	mComponents[8] = hwVersion;
    }
    
    public boolean hasHwVersion()
    {
	return componentIsPresent(8);
    }
    
    public void deleteHwVersion()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "swVersionMain"
    public PrintableString getSwVersionMain()
    {
	return (PrintableString)mComponents[9];
    }
    
    public void setSwVersionMain(PrintableString swVersionMain)
    {
	mComponents[9] = swVersionMain;
    }
    
    public boolean hasSwVersionMain()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSwVersionMain()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "swVersionSecondary"
    public PrintableString getSwVersionSecondary()
    {
	return (PrintableString)mComponents[10];
    }
    
    public void setSwVersionSecondary(PrintableString swVersionSecondary)
    {
	mComponents[10] = swVersionSecondary;
    }
    
    public boolean hasSwVersionSecondary()
    {
	return componentIsPresent(10);
    }
    
    public void deleteSwVersionSecondary()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "swVersionConfiguration"
    public PrintableString getSwVersionConfiguration()
    {
	return (PrintableString)mComponents[11];
    }
    
    public void setSwVersionConfiguration(PrintableString swVersionConfiguration)
    {
	mComponents[11] = swVersionConfiguration;
    }
    
    public boolean hasSwVersionConfiguration()
    {
	return componentIsPresent(11);
    }
    
    public void deleteSwVersionConfiguration()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "serialNumber"
    public PrintableString getSerialNumber()
    {
	return (PrintableString)mComponents[12];
    }
    
    public void setSerialNumber(PrintableString serialNumber)
    {
	mComponents[12] = serialNumber;
    }
    
    public boolean hasSerialNumber()
    {
	return componentIsPresent(12);
    }
    
    public void deleteSerialNumber()
    {
	setComponentAbsent(12);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "net.sirun.ngtp.ngtp_service_data",
	    "TelematicUnitStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TelematicUnitStatus"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUPowerSource"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUPowerSource"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"mainBattery",
					0
				    ),
				    new MemberListElement (
					"reserveBatteryPrimary",
					1
				    ),
				    new MemberListElement (
					"reserveBatterySecondary",
					2
				    )
				}
			    ),
			    0,
			    TUPowerSource.mainBattery
			)
		    ),
		    "power",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnosticData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnosticData"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TUDiagnosticData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TUDiagnosticData"
				)
			    ),
			    0
			)
		    ),
		    "diagnostics",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUBackupBatteryStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUBackupBatteryStatus"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TUBackupBatteryStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TUBackupBatteryStatus"
				)
			    ),
			    0
			)
		    ),
		    "battery",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "mobilePhoneConnected",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TimeStamp"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TimeStamp"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0
			)
		    ),
		    "sleepCyclesStartTime",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TuConfigVersion"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TuConfigVersion"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TuConfigVersion(0), 
				    new TuConfigVersion(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "configVersion",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TuActivationStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TuActivationStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"factory",
					0
				    ),
				    new MemberListElement (
					"preactivated",
					1
				    ),
				    new MemberListElement (
					"preactivated-logistics",
					2
				    ),
				    new MemberListElement (
					"activated",
					7
				    ),
				    new MemberListElement (
					"activated-eCall",
					8
				    ),
				    new MemberListElement (
					"activated-Brazil",
					9
				    ),
				    new MemberListElement (
					"provisioned",
					12
				    ),
				    new MemberListElement (
					"deactivated",
					15
				    )
				}
			    ),
			    0,
			    TuActivationStatus.factory
			)
		    ),
		    "activation",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "usesExternalGnss",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "hwVersion",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "swVersionMain",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "swVersionSecondary",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "swVersionConfiguration",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "serialNumber",
		    12,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TelematicUnitStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TelematicUnitStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TelematicUnitStatus
