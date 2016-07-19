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
 * Define the ASN1 Type VehicleTrackPointData from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class VehicleTrackPointData extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleTrackPointData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleTrackPointData(OdometerData odometer, INTEGER speedKmphx10, 
		    VehicleStateType vehicleState)
    {
	setOdometer(odometer);
	setSpeedKmphx10(speedKmphx10);
	setVehicleState(vehicleState);
    }
    
    /**
     * Construct with components.
     */
    public VehicleTrackPointData(OdometerData odometer, long speedKmphx10, 
		    VehicleStateType vehicleState)
    {
	this(odometer, new INTEGER(speedKmphx10), vehicleState);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OdometerData();
	mComponents[1] = new INTEGER();
	mComponents[2] = VehicleStateType.engine_on_moving;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new OdometerData();
	    case 1:
		return new INTEGER();
	    case 2:
		return VehicleStateType.engine_on_moving;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "odometer"
    public OdometerData getOdometer()
    {
	return (OdometerData)mComponents[0];
    }
    
    public void setOdometer(OdometerData odometer)
    {
	mComponents[0] = odometer;
    }
    
    
    // Methods for field "speedKmphx10"
    public long getSpeedKmphx10()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setSpeedKmphx10(long speedKmphx10)
    {
	setSpeedKmphx10(new INTEGER(speedKmphx10));
    }
    
    public void setSpeedKmphx10(INTEGER speedKmphx10)
    {
	mComponents[1] = speedKmphx10;
    }
    
    
    // Methods for field "vehicleState"
    public VehicleStateType getVehicleState()
    {
	return (VehicleStateType)mComponents[2];
    }
    
    public void setVehicleState(VehicleStateType vehicleState)
    {
	mComponents[2] = vehicleState;
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
	    "VehicleTrackPointData"
	),
	new QName (
	    "NGTP-Service-Data",
	    "VehicleTrackPointData"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"OdometerData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"OdometerData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0
			)
		    ),
		    "odometer",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "speedKmphx10",
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
		    "vehicleState",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleTrackPointData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleTrackPointData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleTrackPointData
