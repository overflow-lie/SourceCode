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
 * Define the ASN1 Type ClimateStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class ClimateStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public ClimateStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ClimateStatus(BOOLEXT timerActivationStatus, ClimateTimer timer1, 
		    ClimateTimer timer2, 
		    ClimateOperatingStatus climateOperatingStatus, 
		    INTEGER remainingRunTime, INTEGER ventingTime)
    {
	setTimerActivationStatus(timerActivationStatus);
	setTimer1(timer1);
	setTimer2(timer2);
	setClimateOperatingStatus(climateOperatingStatus);
	setRemainingRunTime(remainingRunTime);
	setVentingTime(ventingTime);
    }
    
    /**
     * Construct with components.
     */
    public ClimateStatus(BOOLEXT timerActivationStatus, ClimateTimer timer1, 
		    ClimateTimer timer2, 
		    ClimateOperatingStatus climateOperatingStatus, 
		    long remainingRunTime, long ventingTime)
    {
	this(timerActivationStatus, timer1, timer2, 
	     climateOperatingStatus, new INTEGER(remainingRunTime), 
	     new INTEGER(ventingTime));
    }
    
    public void initComponents()
    {
	mComponents[0] = BOOLEXT.isFalse;
	mComponents[1] = new ClimateTimer();
	mComponents[2] = new ClimateTimer();
	mComponents[3] = ClimateOperatingStatus.off;
	mComponents[4] = new INTEGER();
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
		return BOOLEXT.isFalse;
	    case 1:
		return new ClimateTimer();
	    case 2:
		return new ClimateTimer();
	    case 3:
		return ClimateOperatingStatus.off;
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timerActivationStatus"
    public BOOLEXT getTimerActivationStatus()
    {
	return (BOOLEXT)mComponents[0];
    }
    
    public void setTimerActivationStatus(BOOLEXT timerActivationStatus)
    {
	mComponents[0] = timerActivationStatus;
    }
    
    
    // Methods for field "timer1"
    public ClimateTimer getTimer1()
    {
	return (ClimateTimer)mComponents[1];
    }
    
    public void setTimer1(ClimateTimer timer1)
    {
	mComponents[1] = timer1;
    }
    
    
    // Methods for field "timer2"
    public ClimateTimer getTimer2()
    {
	return (ClimateTimer)mComponents[2];
    }
    
    public void setTimer2(ClimateTimer timer2)
    {
	mComponents[2] = timer2;
    }
    
    
    // Methods for field "climateOperatingStatus"
    public ClimateOperatingStatus getClimateOperatingStatus()
    {
	return (ClimateOperatingStatus)mComponents[3];
    }
    
    public void setClimateOperatingStatus(ClimateOperatingStatus climateOperatingStatus)
    {
	mComponents[3] = climateOperatingStatus;
    }
    
    
    // Methods for field "remainingRunTime"
    public long getRemainingRunTime()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setRemainingRunTime(long remainingRunTime)
    {
	setRemainingRunTime(new INTEGER(remainingRunTime));
    }
    
    public void setRemainingRunTime(INTEGER remainingRunTime)
    {
	mComponents[4] = remainingRunTime;
    }
    
    
    // Methods for field "ventingTime"
    public long getVentingTime()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setVentingTime(long ventingTime)
    {
	setVentingTime(new INTEGER(ventingTime));
    }
    
    public void setVentingTime(INTEGER ventingTime)
    {
	mComponents[5] = ventingTime;
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
	    "ClimateStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ClimateStatus"
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
		    "timerActivationStatus",
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
				"ClimateTimer"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ClimateTimer"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ClimateTimer"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ClimateTimer"
				)
			    ),
			    0
			)
		    ),
		    "timer1",
		    1,
		    2,
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
				"ClimateTimer"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ClimateTimer"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ClimateTimer"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ClimateTimer"
				)
			    ),
			    0
			)
		    ),
		    "timer2",
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
				"ClimateOperatingStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ClimateOperatingStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"off",
					0
				    ),
				    new MemberListElement (
					"starting-up",
					1
				    ),
				    new MemberListElement (
					"heating",
					2
				    ),
				    new MemberListElement (
					"venting",
					3
				    ),
				    new MemberListElement (
					"engine-heating",
					4
				    ),
				    new MemberListElement (
					"shutting-down",
					5
				    ),
				    new MemberListElement (
					"failure-low-voltage",
					6
				    ),
				    new MemberListElement (
					"failure-low-fuel",
					7
				    ),
				    new MemberListElement (
					"failure-service-required",
					8
				    ),
				    new MemberListElement (
					"failure-system-failure",
					9
				    ),
				    new MemberListElement (
					"failure-max-operational-time-reached",
					10
				    ),
				    new MemberListElement (
					"stopped-by-user",
					11
				    ),
				    new MemberListElement (
					"unknown",
					12
				    )
				}
			    ),
			    0,
			    ClimateOperatingStatus.off
			)
		    ),
		    "climateOperatingStatus",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(255),
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
		    "remainingRunTime",
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
				    new com.oss.asn1.INTEGER(31),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    ),
			    null
			)
		    ),
		    "ventingTime",
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
     * Get the type descriptor (TypeInfo) of 'this' ClimateStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ClimateStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ClimateStatus
