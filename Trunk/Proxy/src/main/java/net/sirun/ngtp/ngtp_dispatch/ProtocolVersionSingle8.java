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
 * Define the ASN1 Type ProtocolVersionSingle8 from ASN1 Module NGTP_Dispatch.
 * @see INTEGER
 */

public class ProtocolVersionSingle8 extends INTEGER {
    
    /**
     * The default constructor.
     */
    public ProtocolVersionSingle8()
    {
    }
    
    public ProtocolVersionSingle8(short value)
    {
	super(value);
    }
    
    public ProtocolVersionSingle8(int value)
    {
	super(value);
    }
    
    public ProtocolVersionSingle8(long value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final IntegerInfo c_typeinfo = new IntegerInfo (
	new Tags (
	    new short[] {
		0x0002
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
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ProtocolVersionSingle8 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ProtocolVersionSingle8 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ProtocolVersionSingle8
