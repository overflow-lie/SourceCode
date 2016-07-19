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
 * Define the ASN1 Type TrackPoint from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TrackPoint extends Sequence {
    
    /**
     * The default constructor.
     */
    public TrackPoint()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TrackPoint(TriggerType trigger, TimeStamp systemTime, 
		    CollectionId collectionId, VehicleTrackPointData vehicle, 
		    FuelTrackPointData fuel, FullPosition gnss, 
		    NetworkInformation gsm, SecurityTrackPointData security, 
		    TrackPointExtension ext)
    {
	setTrigger(trigger);
	setSystemTime(systemTime);
	setCollectionId(collectionId);
	setVehicle(vehicle);
	setFuel(fuel);
	setGnss(gnss);
	setGsm(gsm);
	setSecurity(security);
	setExt(ext);
    }
    
    /**
     * Construct with required components.
     */
    public TrackPoint(TriggerType trigger, TimeStamp systemTime, 
		    CollectionId collectionId, TrackPointExtension ext)
    {
	setTrigger(trigger);
	setSystemTime(systemTime);
	setCollectionId(collectionId);
	setExt(ext);
    }
    
    public void initComponents()
    {
	mComponents[0] = TriggerType.eCallButton;
	mComponents[1] = new TimeStamp();
	mComponents[2] = new CollectionId();
	mComponents[3] = new VehicleTrackPointData();
	mComponents[4] = new FuelTrackPointData();
	mComponents[5] = new FullPosition();
	mComponents[6] = new NetworkInformation();
	mComponents[7] = new SecurityTrackPointData();
	mComponents[8] = new TrackPointExtension();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TriggerType.eCallButton;
	    case 1:
		return new TimeStamp();
	    case 2:
		return new CollectionId();
	    case 3:
		return new VehicleTrackPointData();
	    case 4:
		return new FuelTrackPointData();
	    case 5:
		return new FullPosition();
	    case 6:
		return new NetworkInformation();
	    case 7:
		return new SecurityTrackPointData();
	    case 8:
		return new TrackPointExtension();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "trigger"
    public TriggerType getTrigger()
    {
	return (TriggerType)mComponents[0];
    }
    
    public void setTrigger(TriggerType trigger)
    {
	mComponents[0] = trigger;
    }
    
    
    // Methods for field "systemTime"
    public TimeStamp getSystemTime()
    {
	return (TimeStamp)mComponents[1];
    }
    
    public void setSystemTime(TimeStamp systemTime)
    {
	mComponents[1] = systemTime;
    }
    
    
    // Methods for field "collectionId"
    public CollectionId getCollectionId()
    {
	return (CollectionId)mComponents[2];
    }
    
    public void setCollectionId(CollectionId collectionId)
    {
	mComponents[2] = collectionId;
    }
    
    
    // Methods for field "vehicle"
    public VehicleTrackPointData getVehicle()
    {
	return (VehicleTrackPointData)mComponents[3];
    }
    
    public void setVehicle(VehicleTrackPointData vehicle)
    {
	mComponents[3] = vehicle;
    }
    
    public boolean hasVehicle()
    {
	return componentIsPresent(3);
    }
    
    public void deleteVehicle()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "fuel"
    public FuelTrackPointData getFuel()
    {
	return (FuelTrackPointData)mComponents[4];
    }
    
    public void setFuel(FuelTrackPointData fuel)
    {
	mComponents[4] = fuel;
    }
    
    public boolean hasFuel()
    {
	return componentIsPresent(4);
    }
    
    public void deleteFuel()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "gnss"
    public FullPosition getGnss()
    {
	return (FullPosition)mComponents[5];
    }
    
    public void setGnss(FullPosition gnss)
    {
	mComponents[5] = gnss;
    }
    
    public boolean hasGnss()
    {
	return componentIsPresent(5);
    }
    
    public void deleteGnss()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "gsm"
    public NetworkInformation getGsm()
    {
	return (NetworkInformation)mComponents[6];
    }
    
    public void setGsm(NetworkInformation gsm)
    {
	mComponents[6] = gsm;
    }
    
    public boolean hasGsm()
    {
	return componentIsPresent(6);
    }
    
    public void deleteGsm()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "security"
    public SecurityTrackPointData getSecurity()
    {
	return (SecurityTrackPointData)mComponents[7];
    }
    
    public void setSecurity(SecurityTrackPointData security)
    {
	mComponents[7] = security;
    }
    
    public boolean hasSecurity()
    {
	return componentIsPresent(7);
    }
    
    public void deleteSecurity()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "ext"
    public TrackPointExtension getExt()
    {
	return (TrackPointExtension)mComponents[8];
    }
    
    public void setExt(TrackPointExtension ext)
    {
	mComponents[8] = ext;
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
	    "TrackPoint"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TrackPoint"
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
				"TriggerType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TriggerType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"eCallButton",
					0
				    ),
				    new MemberListElement (
					"crashModuleWireInput",
					1
				    ),
				    new MemberListElement (
					"crashModuleCanInput",
					2
				    ),
				    new MemberListElement (
					"bCallButton",
					3
				    ),
				    new MemberListElement (
					"engineOn",
					4
				    ),
				    new MemberListElement (
					"engineOff",
					5
				    ),
				    new MemberListElement (
					"firstFix",
					6
				    ),
				    new MemberListElement (
					"drivenDistanceSinceLastTp",
					7
				    ),
				    new MemberListElement (
					"timeSinceLastTp",
					8
				    ),
				    new MemberListElement (
					"turnAngleSinceLastTp",
					9
				    ),
				    new MemberListElement (
					"firstNwReg",
					10
				    ),
				    new MemberListElement (
					"drivenDistanceSinceLastWp",
					11
				    ),
				    new MemberListElement (
					"timeSinceLastWp",
					12
				    ),
				    new MemberListElement (
					"turnAngleSinceLastWp",
					13
				    ),
				    new MemberListElement (
					"lowFuelLevel",
					14
				    ),
				    new MemberListElement (
					"transitionRemoteEngineStartToNormal",
					15
				    ),
				    new MemberListElement (
					"remoteEngineStartRunTimeExpiry",
					16
				    ),
				    new MemberListElement (
					"remoteEngineStartFailure",
					17
				    ),
				    new MemberListElement (
					"remoteEngineStopFailure",
					18
				    ),
				    new MemberListElement (
					"vehicleCommunicationFailed",
					19
				    ),
				    new MemberListElement (
					"userInterruption",
					20
				    ),
				    new MemberListElement (
					"tspReq",
					21
				    ),
				    new MemberListElement (
					"diagRoutine",
					22
				    )
				}
			    ),
			    0,
			    TriggerType.eCallButton
			)
		    ),
		    "trigger",
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
		    "systemTime",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"CollectionId"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"CollectionId"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CollectionId(0), 
				    new CollectionId(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "collectionId",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"VehicleTrackPointData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"VehicleTrackPointData"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "VehicleTrackPointData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "VehicleTrackPointData"
				)
			    ),
			    0
			)
		    ),
		    "vehicle",
		    3,
		    3,
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
				"FuelTrackPointData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"FuelTrackPointData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FuelTrackPointData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FuelTrackPointData"
				)
			    ),
			    0
			)
		    ),
		    "fuel",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"FullPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"FullPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FullPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FullPosition"
				)
			    ),
			    0
			)
		    ),
		    "gnss",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"NetworkInformation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NetworkInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NetworkInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NetworkInformation"
				)
			    ),
			    0
			)
		    ),
		    "gsm",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "SecurityTrackPointData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "SecurityTrackPointData"
				)
			    ),
			    0
			)
		    ),
		    "security",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TrackPointExtension"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TrackPointExtension"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TrackPointExtension"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "ext",
		    8,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TrackPoint object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrackPoint object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrackPoint
