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
 * Define the ASN1 Type SecurityTrackPointData from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class SecurityTrackPointData extends Sequence {
    
    /**
     * The default constructor.
     */
    public SecurityTrackPointData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SecurityTrackPointData(TUPowerSource tuPowerSrc, 
		    TUBackupBatteryStatus backupBattery, 
		    MainBatteryStatus mainBattery, 
		    EngineBlockedStatus engineBlock, BOOLEXT brazilEventMode, 
		    INTEGER timeToNextTpSec)
    {
	setTuPowerSrc(tuPowerSrc);
	setBackupBattery(backupBattery);
	setMainBattery(mainBattery);
	setEngineBlock(engineBlock);
	setBrazilEventMode(brazilEventMode);
	setTimeToNextTpSec(timeToNextTpSec);
    }
    
    /**
     * Construct with components.
     */
    public SecurityTrackPointData(TUPowerSource tuPowerSrc, 
		    TUBackupBatteryStatus backupBattery, 
		    MainBatteryStatus mainBattery, 
		    EngineBlockedStatus engineBlock, BOOLEXT brazilEventMode, 
		    long timeToNextTpSec)
    {
	this(tuPowerSrc, backupBattery, mainBattery, engineBlock, 
	     brazilEventMode, new INTEGER(timeToNextTpSec));
    }
    
    public void initComponents()
    {
	mComponents[0] = TUPowerSource.mainBattery;
	mComponents[1] = new TUBackupBatteryStatus();
	mComponents[2] = MainBatteryStatus.no_battery_info;
	mComponents[3] = EngineBlockedStatus.normalUnblocked;
	mComponents[4] = BOOLEXT.isFalse;
	mComponents[5] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TUPowerSource.mainBattery;
	    case 1:
		return new TUBackupBatteryStatus();
	    case 2:
		return MainBatteryStatus.no_battery_info;
	    case 3:
		return EngineBlockedStatus.normalUnblocked;
	    case 4:
		return BOOLEXT.isFalse;
	    case 5:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "tuPowerSrc"
    public TUPowerSource getTuPowerSrc()
    {
	return (TUPowerSource)mComponents[0];
    }
    
    public void setTuPowerSrc(TUPowerSource tuPowerSrc)
    {
	mComponents[0] = tuPowerSrc;
    }
    
    
    // Methods for field "backupBattery"
    public TUBackupBatteryStatus getBackupBattery()
    {
	return (TUBackupBatteryStatus)mComponents[1];
    }
    
    public void setBackupBattery(TUBackupBatteryStatus backupBattery)
    {
	mComponents[1] = backupBattery;
    }
    
    
    // Methods for field "mainBattery"
    public MainBatteryStatus getMainBattery()
    {
	return (MainBatteryStatus)mComponents[2];
    }
    
    public void setMainBattery(MainBatteryStatus mainBattery)
    {
	mComponents[2] = mainBattery;
    }
    
    
    // Methods for field "engineBlock"
    public EngineBlockedStatus getEngineBlock()
    {
	return (EngineBlockedStatus)mComponents[3];
    }
    
    public void setEngineBlock(EngineBlockedStatus engineBlock)
    {
	mComponents[3] = engineBlock;
    }
    
    
    // Methods for field "brazilEventMode"
    public BOOLEXT getBrazilEventMode()
    {
	return (BOOLEXT)mComponents[4];
    }
    
    public void setBrazilEventMode(BOOLEXT brazilEventMode)
    {
	mComponents[4] = brazilEventMode;
    }
    
    
    // Methods for field "timeToNextTpSec"
    public long getTimeToNextTpSec()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setTimeToNextTpSec(long timeToNextTpSec)
    {
	setTimeToNextTpSec(new INTEGER(timeToNextTpSec));
    }
    
    public void setTimeToNextTpSec(INTEGER timeToNextTpSec)
    {
	mComponents[5] = timeToNextTpSec;
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
	    "SecurityTrackPointData"
	),
	new QName (
	    "NGTP-Service-Data",
	    "SecurityTrackPointData"
	),
	12314,
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
		    "tuPowerSrc",
		    0,
		    2,
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
		    "backupBattery",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"MainBatteryStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"MainBatteryStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"no-battery-info",
					0
				    ),
				    new MemberListElement (
					"battery-empty",
					1
				    ),
				    new MemberListElement (
					"battery-low",
					2
				    ),
				    new MemberListElement (
					"battery-1-4",
					3
				    ),
				    new MemberListElement (
					"battery-1-2",
					4
				    ),
				    new MemberListElement (
					"battery-3-4",
					5
				    ),
				    new MemberListElement (
					"battery-1-1",
					6
				    )
				}
			    ),
			    0,
			    MainBatteryStatus.no_battery_info
			)
		    ),
		    "mainBattery",
		    2,
		    2,
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
				"EngineBlockedStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"EngineBlockedStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"normalUnblocked",
					0
				    ),
				    new MemberListElement (
					"pendingBlocking",
					1
				    ),
				    new MemberListElement (
					"blockedByTsp",
					2
				    ),
				    new MemberListElement (
					"blockedByTU",
					3
				    ),
				    new MemberListElement (
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    EngineBlockedStatus.normalUnblocked
			)
		    ),
		    "engineBlock",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "brazilEventMode",
		    4,
		    2,
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(65535),
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
		    "timeToNextTpSec",
		    5,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SecurityTrackPointData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SecurityTrackPointData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SecurityTrackPointData
