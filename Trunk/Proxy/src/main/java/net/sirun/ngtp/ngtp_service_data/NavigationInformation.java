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
 * Define the ASN1 Type NavigationInformation from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class NavigationInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public NavigationInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NavigationInformation(BasicPosition destination, 
		    TimeHM arrivalTime, INTEGER distanceToDestMtr, 
		    INTEGER remainingRange)
    {
	setDestination(destination);
	setArrivalTime(arrivalTime);
	setDistanceToDestMtr(distanceToDestMtr);
	setRemainingRange(remainingRange);
    }
    
    /**
     * Construct with components.
     */
    public NavigationInformation(BasicPosition destination, 
		    TimeHM arrivalTime, long distanceToDestMtr, 
		    long remainingRange)
    {
	this(destination, arrivalTime, new INTEGER(distanceToDestMtr), 
	     new INTEGER(remainingRange));
    }
    
    public void initComponents()
    {
	mComponents[0] = new BasicPosition();
	mComponents[1] = new TimeHM();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BasicPosition();
	    case 1:
		return new TimeHM();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "destination"
    public BasicPosition getDestination()
    {
	return (BasicPosition)mComponents[0];
    }
    
    public void setDestination(BasicPosition destination)
    {
	mComponents[0] = destination;
    }
    
    public boolean hasDestination()
    {
	return componentIsPresent(0);
    }
    
    public void deleteDestination()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "arrivalTime"
    public TimeHM getArrivalTime()
    {
	return (TimeHM)mComponents[1];
    }
    
    public void setArrivalTime(TimeHM arrivalTime)
    {
	mComponents[1] = arrivalTime;
    }
    
    public boolean hasArrivalTime()
    {
	return componentIsPresent(1);
    }
    
    public void deleteArrivalTime()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "distanceToDestMtr"
    public long getDistanceToDestMtr()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setDistanceToDestMtr(long distanceToDestMtr)
    {
	setDistanceToDestMtr(new INTEGER(distanceToDestMtr));
    }
    
    public void setDistanceToDestMtr(INTEGER distanceToDestMtr)
    {
	mComponents[2] = distanceToDestMtr;
    }
    
    public boolean hasDistanceToDestMtr()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDistanceToDestMtr()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "remainingRange"
    public long getRemainingRange()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setRemainingRange(long remainingRange)
    {
	setRemainingRange(new INTEGER(remainingRange));
    }
    
    public void setRemainingRange(INTEGER remainingRange)
    {
	mComponents[3] = remainingRange;
    }
    
    public boolean hasRemainingRange()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRemainingRange()
    {
	setComponentAbsent(3);
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
	    "NavigationInformation"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NavigationInformation"
	),
	12314,
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
				"BasicPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0
			)
		    ),
		    "destination",
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
				"TimeHM"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TimeHM"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeHM"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeHM"
				)
			    ),
			    0
			)
		    ),
		    "arrivalTime",
		    1,
		    3,
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
		    "distanceToDestMtr",
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
		    "remainingRange",
		    3,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NavigationInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NavigationInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NavigationInformation
