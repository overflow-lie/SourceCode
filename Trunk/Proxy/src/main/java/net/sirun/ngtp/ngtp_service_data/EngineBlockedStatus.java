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
 * Define the ASN1 Type EngineBlockedStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class EngineBlockedStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EngineBlockedStatus()
    {
	super(cFirstNumber);
    }
    
    protected EngineBlockedStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long normalUnblocked = 0;
	public static final long pendingBlocking = 1;
	public static final long blockedByTsp = 2;
	public static final long blockedByTU = 3;
	public static final long unknown = 7;
    }
    // Named list definitions.
    public static final EngineBlockedStatus normalUnblocked =
	new EngineBlockedStatus();
    public static final EngineBlockedStatus pendingBlocking =
	new EngineBlockedStatus(1);
    public static final EngineBlockedStatus blockedByTsp =
	new EngineBlockedStatus(2);
    public static final EngineBlockedStatus blockedByTU =
	new EngineBlockedStatus(3);
    public static final EngineBlockedStatus unknown =
	new EngineBlockedStatus(7);
    private final static EngineBlockedStatus cNamedNumbers[] = {
	 normalUnblocked, 
	 pendingBlocking, 
	 blockedByTsp, 
	 blockedByTU, 
	 unknown
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
    
    public static EngineBlockedStatus valueOf(long value)
    {
	return (EngineBlockedStatus)normalUnblocked.lookupValue(value);
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
	    "EngineBlockedStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "EngineBlockedStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "normalUnblocked",
		    0
		),
		new MemberListElement (
		    "pendingBlocking",
		    1
		),
		new MemberListElement (
		    "blockedByTsp",
		    2
		),
		new MemberListElement (
		    "blockedByTU",
		    3
		),
		new MemberListElement (
		    "unknown",
		    7
		)
	    }
	),
	0,
	normalUnblocked
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EngineBlockedStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EngineBlockedStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EngineBlockedStatus
