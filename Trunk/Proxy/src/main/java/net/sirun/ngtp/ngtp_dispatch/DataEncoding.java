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
 * Define the ASN1 Type DataEncoding from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class DataEncoding extends Sequence {
    
    /**
     * The default constructor.
     */
    public DataEncoding()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DataEncoding(EncodingType encodingType, 
		    MajMinVersion6 encodingVersion)
    {
	setEncodingType(encodingType);
	setEncodingVersion(encodingVersion);
    }
    
    public void initComponents()
    {
	mComponents[0] = EncodingType.asn1_per_aligned;
	mComponents[1] = new MajMinVersion6();
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
		return EncodingType.asn1_per_aligned;
	    case 1:
		return new MajMinVersion6();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "encodingType"
    public EncodingType getEncodingType()
    {
	return (EncodingType)mComponents[0];
    }
    
    public void setEncodingType(EncodingType encodingType)
    {
	mComponents[0] = encodingType;
    }
    
    
    // Methods for field "encodingVersion"
    public MajMinVersion6 getEncodingVersion()
    {
	return (MajMinVersion6)mComponents[1];
    }
    
    public void setEncodingVersion(MajMinVersion6 encodingVersion)
    {
	mComponents[1] = encodingVersion;
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
	    "DataEncoding"
	),
	new QName (
	    "NGTP-Dispatch",
	    "DataEncoding"
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
				"net.sirun.ngtp.ngtp_dispatch",
				"EncodingType"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"EncodingType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"asn1-per-aligned",
					0
				    ),
				    new MemberListElement (
					"asn1-per-unaligned",
					1
				    ),
				    new MemberListElement (
					"xml",
					2
				    )
				}
			    ),
			    0,
			    EncodingType.asn1_per_aligned
			)
		    ),
		    "encodingType",
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
				"net.sirun.ngtp.ngtp_dispatch",
				"MajMinVersion6"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"MajMinVersion6"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MajMinVersion6"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MajMinVersion6"
				)
			    ),
			    0
			)
		    ),
		    "encodingVersion",
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
     * Get the type descriptor (TypeInfo) of 'this' DataEncoding object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DataEncoding object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DataEncoding
