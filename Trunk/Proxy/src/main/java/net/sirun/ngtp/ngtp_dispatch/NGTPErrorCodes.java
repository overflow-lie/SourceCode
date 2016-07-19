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
 * Define the ASN1 Type NGTPErrorCodes from ASN1 Module NGTP_Dispatch.
 * @see Enumerated
 */

public final class NGTPErrorCodes extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NGTPErrorCodes()
    {
	super(cFirstNumber);
    }
    
    protected NGTPErrorCodes(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long dataMismatchError = 10;
	public static final long protocolVersionError = 20;
	public static final long messageLengthError = 30;
	public static final long eventTerminatedByTimeout = 40;
	public static final long serviceTypeError = 50;
	public static final long serviceNotProvisioned = 51;
	public static final long crqNumberError = 60;
	public static final long invalidHeader = 70;
	public static final long reserved = 80;
	public static final long invalidSignature = 90;
	public static final long invalidSecurityContext = 100;
	public static final long statelessExpected = 110;
	public static final long unknownError = 999;
    }
    // Named list definitions.
    public static final NGTPErrorCodes dataMismatchError =
	new NGTPErrorCodes();
    public static final NGTPErrorCodes protocolVersionError =
	new NGTPErrorCodes(20);
    public static final NGTPErrorCodes messageLengthError =
	new NGTPErrorCodes(30);
    public static final NGTPErrorCodes eventTerminatedByTimeout =
	new NGTPErrorCodes(40);
    public static final NGTPErrorCodes serviceTypeError =
	new NGTPErrorCodes(50);
    public static final NGTPErrorCodes serviceNotProvisioned =
	new NGTPErrorCodes(51);
    public static final NGTPErrorCodes crqNumberError =
	new NGTPErrorCodes(60);
    public static final NGTPErrorCodes invalidHeader =
	new NGTPErrorCodes(70);
    public static final NGTPErrorCodes reserved =
	new NGTPErrorCodes(80);
    public static final NGTPErrorCodes invalidSignature =
	new NGTPErrorCodes(90);
    public static final NGTPErrorCodes invalidSecurityContext =
	new NGTPErrorCodes(100);
    public static final NGTPErrorCodes statelessExpected =
	new NGTPErrorCodes(110);
    public static final NGTPErrorCodes unknownError =
	new NGTPErrorCodes(999);
    private final static NGTPErrorCodes cNamedNumbers[] = {
	 dataMismatchError, 
	 protocolVersionError, 
	 messageLengthError, 
	 eventTerminatedByTimeout, 
	 serviceTypeError, 
	 serviceNotProvisioned, 
	 crqNumberError, 
	 invalidHeader, 
	 reserved, 
	 invalidSignature, 
	 invalidSecurityContext, 
	 statelessExpected, 
	 unknownError
    };
    protected final static long cFirstNumber = 10;
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
    
    public static NGTPErrorCodes valueOf(long value)
    {
	return (NGTPErrorCodes)dataMismatchError.lookupValue(value);
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "NGTPErrorCodes"
	),
	new QName (
	    "NGTP-Dispatch",
	    "NGTPErrorCodes"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dataMismatchError",
		    10
		),
		new MemberListElement (
		    "protocolVersionError",
		    20
		),
		new MemberListElement (
		    "messageLengthError",
		    30
		),
		new MemberListElement (
		    "eventTerminatedByTimeout",
		    40
		),
		new MemberListElement (
		    "serviceTypeError",
		    50
		),
		new MemberListElement (
		    "serviceNotProvisioned",
		    51
		),
		new MemberListElement (
		    "crqNumberError",
		    60
		),
		new MemberListElement (
		    "invalidHeader",
		    70
		),
		new MemberListElement (
		    "reserved",
		    80
		),
		new MemberListElement (
		    "invalidSignature",
		    90
		),
		new MemberListElement (
		    "invalidSecurityContext",
		    100
		),
		new MemberListElement (
		    "statelessExpected",
		    110
		),
		new MemberListElement (
		    "unknownError",
		    999
		)
	    }
	),
	0,
	dataMismatchError
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NGTPErrorCodes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPErrorCodes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NGTPErrorCodes
