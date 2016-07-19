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
 * Define the ASN1 Type BasicVehicleStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class BasicVehicleStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public BasicVehicleStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BasicVehicleStatus(VehicleStateType state, 
		    MainBatteryStatus mainBattery, 
		    TheftAlarmStatus theftAlarm, INTEGER fuelLevelPerc, 
		    SRSStatus srs, EngineBlockedStatus engineBlock, 
		    BOOLEXT brazilEventMode)
    {
	setState(state);
	setMainBattery(mainBattery);
	setTheftAlarm(theftAlarm);
	setFuelLevelPerc(fuelLevelPerc);
	setSrs(srs);
	setEngineBlock(engineBlock);
	setBrazilEventMode(brazilEventMode);
    }
    
    /**
     * Construct with components.
     */
    public BasicVehicleStatus(VehicleStateType state, 
		    MainBatteryStatus mainBattery, 
		    TheftAlarmStatus theftAlarm, long fuelLevelPerc, 
		    SRSStatus srs, EngineBlockedStatus engineBlock, 
		    BOOLEXT brazilEventMode)
    {
	this(state, mainBattery, theftAlarm, new INTEGER(fuelLevelPerc), 
	     srs, engineBlock, brazilEventMode);
    }
    
    /**
     * Construct with required components.
     */
    public BasicVehicleStatus(VehicleStateType state, 
		    EngineBlockedStatus engineBlock, BOOLEXT brazilEventMode)
    {
	setState(state);
	setEngineBlock(engineBlock);
	setBrazilEventMode(brazilEventMode);
    }
    
    public void initComponents()
    {
	mComponents[0] = VehicleStateType.engine_on_moving;
	mComponents[1] = MainBatteryStatus.no_battery_info;
	mComponents[2] = TheftAlarmStatus.no_alarm_info;
	mComponents[3] = new INTEGER();
	mComponents[4] = SRSStatus.no_srs_info;
	mComponents[5] = EngineBlockedStatus.normalUnblocked;
	mComponents[6] = BOOLEXT.isFalse;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return VehicleStateType.engine_on_moving;
	    case 1:
		return MainBatteryStatus.no_battery_info;
	    case 2:
		return TheftAlarmStatus.no_alarm_info;
	    case 3:
		return new INTEGER();
	    case 4:
		return SRSStatus.no_srs_info;
	    case 5:
		return EngineBlockedStatus.normalUnblocked;
	    case 6:
		return BOOLEXT.isFalse;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "state"
    public VehicleStateType getState()
    {
	return (VehicleStateType)mComponents[0];
    }
    
    public void setState(VehicleStateType state)
    {
	mComponents[0] = state;
    }
    
    
    // Methods for field "mainBattery"
    public MainBatteryStatus getMainBattery()
    {
	return (MainBatteryStatus)mComponents[1];
    }
    
    public void setMainBattery(MainBatteryStatus mainBattery)
    {
	mComponents[1] = mainBattery;
    }
    
    public boolean hasMainBattery()
    {
	return componentIsPresent(1);
    }
    
    public void deleteMainBattery()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "theftAlarm"
    public TheftAlarmStatus getTheftAlarm()
    {
	return (TheftAlarmStatus)mComponents[2];
    }
    
    public void setTheftAlarm(TheftAlarmStatus theftAlarm)
    {
	mComponents[2] = theftAlarm;
    }
    
    public boolean hasTheftAlarm()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTheftAlarm()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "fuelLevelPerc"
    public long getFuelLevelPerc()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setFuelLevelPerc(long fuelLevelPerc)
    {
	setFuelLevelPerc(new INTEGER(fuelLevelPerc));
    }
    
    public void setFuelLevelPerc(INTEGER fuelLevelPerc)
    {
	mComponents[3] = fuelLevelPerc;
    }
    
    public boolean hasFuelLevelPerc()
    {
	return componentIsPresent(3);
    }
    
    public void deleteFuelLevelPerc()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "srs"
    public SRSStatus getSrs()
    {
	return (SRSStatus)mComponents[4];
    }
    
    public void setSrs(SRSStatus srs)
    {
	mComponents[4] = srs;
    }
    
    public boolean hasSrs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSrs()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "engineBlock"
    public EngineBlockedStatus getEngineBlock()
    {
	return (EngineBlockedStatus)mComponents[5];
    }
    
    public void setEngineBlock(EngineBlockedStatus engineBlock)
    {
	mComponents[5] = engineBlock;
    }
    
    
    // Methods for field "brazilEventMode"
    public BOOLEXT getBrazilEventMode()
    {
	return (BOOLEXT)mComponents[6];
    }
    
    public void setBrazilEventMode(BOOLEXT brazilEventMode)
    {
	mComponents[6] = brazilEventMode;
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
	    "BasicVehicleStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "BasicVehicleStatus"
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
				"VehicleStateType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"VehicleStateType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"engine-on-moving",
					0
				    ),
				    new MemberListElement (
					"engine-on-park",
					1
				    ),
				    new MemberListElement (
					"key-on-engine-off",
					2
				    ),
				    new MemberListElement (
					"delayed-accessory",
					3
				    ),
				    new MemberListElement (
					"key-off",
					4
				    ),
				    new MemberListElement (
					"key-removed",
					5
				    ),
				    new MemberListElement (
					"engine-on-remote-start",
					6
				    ),
				    new MemberListElement (
					"unknown",
					15
				    )
				}
			    ),
			    0,
			    VehicleStateType.engine_on_moving
			)
		    ),
		    "state",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    3,
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
				"TheftAlarmStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TheftAlarmStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"no-alarm-info",
					0
				    ),
				    new MemberListElement (
					"alarm-off",
					1
				    ),
				    new MemberListElement (
					"alarm-armed",
					2
				    ),
				    new MemberListElement (
					"alarm-trig",
					3
				    ),
				    new MemberListElement (
					"alarm-trig-mms",
					4
				    ),
				    new MemberListElement (
					"alarm-trig-is",
					5
				    ),
				    new MemberListElement (
					"sensor-fault",
					7
				    )
				}
			    ),
			    0,
			    TheftAlarmStatus.no_alarm_info
			)
		    ),
		    "theftAlarm",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "fuelLevelPerc",
		    3,
		    3,
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
				"SRSStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"SRSStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"no-srs-info",
					0
				    ),
				    new MemberListElement (
					"srs-not-deployed",
					1
				    ),
				    new MemberListElement (
					"srs-deployed",
					2
				    )
				}
			    ),
			    0,
			    SRSStatus.no_srs_info
			)
		    ),
		    "srs",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    6,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BasicVehicleStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BasicVehicleStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BasicVehicleStatus
