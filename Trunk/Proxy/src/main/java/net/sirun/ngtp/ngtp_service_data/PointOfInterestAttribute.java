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
 * Define the ASN1 Type PointOfInterestAttribute from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class PointOfInterestAttribute extends Sequence {
    
    /**
     * The default constructor.
     */
    public PointOfInterestAttribute()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PointOfInterestAttribute(PrintableString key, UTF8String16 value)
    {
	setKey(key);
	setValue(value);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new UTF8String16();
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
		return new PrintableString();
	    case 1:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "key"
    public PrintableString getKey()
    {
	return (PrintableString)mComponents[0];
    }
    
    public void setKey(PrintableString key)
    {
	mComponents[0] = key;
    }
    
    
    // Methods for field "value"
    public UTF8String16 getValue()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setValue(UTF8String16 value)
    {
	mComponents[1] = value;
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
	    "PointOfInterestAttribute"
	),
	new QName (
	    "NGTP-Service-Data",
	    "PointOfInterestAttribute"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "key",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(1024),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "value",
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
     * Get the type descriptor (TypeInfo) of 'this' PointOfInterestAttribute object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PointOfInterestAttribute object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PointOfInterestAttribute
