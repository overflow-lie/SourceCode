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
 * Define the ASN1 Type ExtendedPosition from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class ExtendedPosition extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExtendedPosition()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExtendedPosition(INTEGER altitudeMtr, INTEGER headingDeg, 
		    PositionReliability reliability, TimeStamp fixtime, 
		    INTEGER gnssSpeedKmph)
    {
	setAltitudeMtr(altitudeMtr);
	setHeadingDeg(headingDeg);
	setReliability(reliability);
	setFixtime(fixtime);
	setGnssSpeedKmph(gnssSpeedKmph);
    }
    
    /**
     * Construct with components.
     */
    public ExtendedPosition(long altitudeMtr, long headingDeg, 
		    PositionReliability reliability, TimeStamp fixtime, 
		    long gnssSpeedKmph)
    {
	this(new INTEGER(altitudeMtr), new INTEGER(headingDeg), 
	     reliability, fixtime, new INTEGER(gnssSpeedKmph));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new PositionReliability();
	mComponents[3] = new TimeStamp();
	mComponents[4] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new PositionReliability();
	    case 3:
		return new TimeStamp();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "altitudeMtr"
    public long getAltitudeMtr()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setAltitudeMtr(long altitudeMtr)
    {
	setAltitudeMtr(new INTEGER(altitudeMtr));
    }
    
    public void setAltitudeMtr(INTEGER altitudeMtr)
    {
	mComponents[0] = altitudeMtr;
    }
    
    public boolean hasAltitudeMtr()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAltitudeMtr()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "headingDeg"
    public long getHeadingDeg()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setHeadingDeg(long headingDeg)
    {
	setHeadingDeg(new INTEGER(headingDeg));
    }
    
    public void setHeadingDeg(INTEGER headingDeg)
    {
	mComponents[1] = headingDeg;
    }
    
    public boolean hasHeadingDeg()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHeadingDeg()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "reliability"
    public PositionReliability getReliability()
    {
	return (PositionReliability)mComponents[2];
    }
    
    public void setReliability(PositionReliability reliability)
    {
	mComponents[2] = reliability;
    }
    
    public boolean hasReliability()
    {
	return componentIsPresent(2);
    }
    
    public void deleteReliability()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "fixtime"
    public TimeStamp getFixtime()
    {
	return (TimeStamp)mComponents[3];
    }
    
    public void setFixtime(TimeStamp fixtime)
    {
	mComponents[3] = fixtime;
    }
    
    public boolean hasFixtime()
    {
	return componentIsPresent(3);
    }
    
    public void deleteFixtime()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "gnssSpeedKmph"
    public long getGnssSpeedKmph()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setGnssSpeedKmph(long gnssSpeedKmph)
    {
	setGnssSpeedKmph(new INTEGER(gnssSpeedKmph));
    }
    
    public void setGnssSpeedKmph(INTEGER gnssSpeedKmph)
    {
	mComponents[4] = gnssSpeedKmph;
    }
    
    public boolean hasGnssSpeedKmph()
    {
	return componentIsPresent(4);
    }
    
    public void deleteGnssSpeedKmph()
    {
	setComponentAbsent(4);
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
	    "ExtendedPosition"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ExtendedPosition"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
				    new com.oss.asn1.INTEGER(-100), 
				    new com.oss.asn1.INTEGER(8091),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-100),
				new java.lang.Long(8091)
			    ),
			    null
			)
		    ),
		    "altitudeMtr",
		    0,
		    3,
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
				    new com.oss.asn1.INTEGER(359),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(359)
			    ),
			    null
			)
		    ),
		    "headingDeg",
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
				"PositionReliability"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"PositionReliability"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PositionReliability"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PositionReliability"
				)
			    ),
			    0
			)
		    ),
		    "reliability",
		    2,
		    3,
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
		    "fixtime",
		    3,
		    3,
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
				    new com.oss.asn1.INTEGER(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "gnssSpeedKmph",
		    4,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ExtendedPosition object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExtendedPosition object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExtendedPosition
