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
 * Define the ASN1 Type MajMinVersion16 from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class MajMinVersion16 extends Sequence {
    
    /**
     * The default constructor.
     */
    public MajMinVersion16()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MajMinVersion16(ProtocolVersionSingle8 majorVersion, 
		    ProtocolVersionSingle8 minorVersion)
    {
	setMajorVersion(majorVersion);
	setMinorVersion(minorVersion);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ProtocolVersionSingle8();
	mComponents[1] = new ProtocolVersionSingle8();
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
		return new ProtocolVersionSingle8();
	    case 1:
		return new ProtocolVersionSingle8();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "majorVersion"
    public ProtocolVersionSingle8 getMajorVersion()
    {
	return (ProtocolVersionSingle8)mComponents[0];
    }
    
    public void setMajorVersion(ProtocolVersionSingle8 majorVersion)
    {
	mComponents[0] = majorVersion;
    }
    
    
    // Methods for field "minorVersion"
    public ProtocolVersionSingle8 getMinorVersion()
    {
	return (ProtocolVersionSingle8)mComponents[1];
    }
    
    public void setMinorVersion(ProtocolVersionSingle8 minorVersion)
    {
	mComponents[1] = minorVersion;
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
	    "MajMinVersion16"
	),
	new QName (
	    "NGTP-Dispatch",
	    "MajMinVersion16"
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
				"net.sirun.ngtp.ngtp_dispatch",
				"ProtocolVersionSingle8"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"ProtocolVersionSingle8"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ProtocolVersionSingle8(0), 
				    new ProtocolVersionSingle8(255),
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
		    "majorVersion",
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
				"net.sirun.ngtp.ngtp_dispatch",
				"ProtocolVersionSingle8"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"ProtocolVersionSingle8"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ProtocolVersionSingle8(0), 
				    new ProtocolVersionSingle8(255),
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
		    "minorVersion",
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
     * Get the type descriptor (TypeInfo) of 'this' MajMinVersion16 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MajMinVersion16 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MajMinVersion16
