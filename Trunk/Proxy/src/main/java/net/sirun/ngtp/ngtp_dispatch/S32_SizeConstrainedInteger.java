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
 * Define the ASN1 Type S32_SizeConstrainedInteger from ASN1 Module NGTP_Dispatch.
 * @see INTEGER
 */

public class S32_SizeConstrainedInteger extends INTEGER {
    
    /**
     * The default constructor.
     */
    public S32_SizeConstrainedInteger()
    {
    }
    
    public S32_SizeConstrainedInteger(short value)
    {
	super(value);
    }
    
    public S32_SizeConstrainedInteger(int value)
    {
	super(value);
    }
    
    public S32_SizeConstrainedInteger(long value)
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
	    "S32_SizeConstrainedInteger"
	),
	new QName (
	    "NGTP-Dispatch",
	    "S32-SizeConstrainedInteger"
	),
	12314,
	new ValueRangeConstraint (
	    new AbstractBounds(
		new S32_SizeConstrainedInteger(-2147483648), 
		new S32_SizeConstrainedInteger(2147483647),
		0
	    )
	),
	new Bounds (
	    new java.lang.Long(-2147483648),
	    new java.lang.Long(2147483647)
	),
	null
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' S32_SizeConstrainedInteger object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' S32_SizeConstrainedInteger object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for S32_SizeConstrainedInteger
