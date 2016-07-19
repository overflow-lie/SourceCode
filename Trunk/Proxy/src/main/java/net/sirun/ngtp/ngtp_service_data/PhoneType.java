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
 * Define the ASN1 Type PhoneType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class PhoneType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PhoneType()
    {
	super(cFirstNumber);
    }
    
    protected PhoneType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long home = 1;
	public static final long work = 2;
	public static final long cell = 3;
    }
    // Named list definitions.
    public static final PhoneType unknown =
	new PhoneType();
    public static final PhoneType home =
	new PhoneType(1);
    public static final PhoneType work =
	new PhoneType(2);
    public static final PhoneType cell =
	new PhoneType(3);
    private final static PhoneType cNamedNumbers[] = {
	 unknown, 
	 home, 
	 work, 
	 cell
    };
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    public static PhoneType valueOf(long value)
    {
	return (PhoneType)unknown.lookupValue(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "net.sirun.ngtp.ngtp_service_data",
	    "PhoneType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "PhoneType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unknown",
		    0
		),
		new MemberListElement (
		    "home",
		    1
		),
		new MemberListElement (
		    "work",
		    2
		),
		new MemberListElement (
		    "cell",
		    3
		)
	    }
	),
	0,
	unknown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PhoneType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PhoneType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PhoneType
