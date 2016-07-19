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


package net.sirun.ngtp.ngtp_dispatch;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type BasicPosition from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class BasicPosition extends Sequence {
    
    /**
     * The default constructor.
     */
    public BasicPosition()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BasicPosition(INTEGER latitude, INTEGER longitude)
    {
	setLatitude(latitude);
	setLongitude(longitude);
    }
    
    /**
     * Construct with components.
     */
    public BasicPosition(long latitude, long longitude)
    {
	this(new INTEGER(latitude), new INTEGER(longitude));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "latitude"
    public long getLatitude()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setLatitude(long latitude)
    {
	setLatitude(new INTEGER(latitude));
    }
    
    public void setLatitude(INTEGER latitude)
    {
	mComponents[0] = latitude;
    }
    
    
    // Methods for field "longitude"
    public long getLongitude()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setLongitude(long longitude)
    {
	setLongitude(new INTEGER(longitude));
    }
    
    public void setLongitude(INTEGER longitude)
    {
	mComponents[1] = longitude;
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "BasicPosition"
	),
	new QName (
	    "NGTP-Dispatch",
	    "BasicPosition"
	),
	12314,
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
				    new com.oss.asn1.INTEGER(-2147483648), 
				    new com.oss.asn1.INTEGER(2147483647),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2147483648),
				new java.lang.Long(2147483647)
			    ),
			    null
			)
		    ),
		    "latitude",
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
				    new com.oss.asn1.INTEGER(-2147483648), 
				    new com.oss.asn1.INTEGER(2147483647),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-2147483648),
				new java.lang.Long(2147483647)
			    ),
			    null
			)
		    ),
		    "longitude",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BasicPosition object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BasicPosition object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BasicPosition
