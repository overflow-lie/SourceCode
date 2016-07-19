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
 * Define the ASN1 Type DSPTMessageType from ASN1 Module NGTP_Dispatch.
 * @see Enumerated
 */

public final class DSPTMessageType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DSPTMessageType()
    {
	super(cFirstNumber);
    }
    
    protected DSPTMessageType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long error = 0;
	public static final long crqm = 1;
	public static final long upServiceData = 2;
	public static final long downServiceData = 3;
	public static final long dsptAck = 4;
	public static final long notification = 5;
	public static final long terminateVoice = 6;
	public static final long terminateEvent = 7;
	public static final long prepareForTerminate = 8;
	public static final long challenge = 9;
	public static final long chRespServiceData = 10;
    }
    // Named list definitions.
    public static final DSPTMessageType error =
	new DSPTMessageType();
    public static final DSPTMessageType crqm =
	new DSPTMessageType(1);
    public static final DSPTMessageType upServiceData =
	new DSPTMessageType(2);
    public static final DSPTMessageType downServiceData =
	new DSPTMessageType(3);
    public static final DSPTMessageType dsptAck =
	new DSPTMessageType(4);
    public static final DSPTMessageType notification =
	new DSPTMessageType(5);
    public static final DSPTMessageType terminateVoice =
	new DSPTMessageType(6);
    public static final DSPTMessageType terminateEvent =
	new DSPTMessageType(7);
    public static final DSPTMessageType prepareForTerminate =
	new DSPTMessageType(8);
    public static final DSPTMessageType challenge =
	new DSPTMessageType(9);
    public static final DSPTMessageType chRespServiceData =
	new DSPTMessageType(10);
    private final static DSPTMessageType cNamedNumbers[] = {
	 error, 
	 crqm, 
	 upServiceData, 
	 downServiceData, 
	 dsptAck, 
	 notification, 
	 terminateVoice, 
	 terminateEvent, 
	 prepareForTerminate, 
	 challenge, 
	 chRespServiceData
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
    
    public static DSPTMessageType valueOf(long value)
    {
	return (DSPTMessageType)error.lookupValue(value);
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
	    "DSPTMessageType"
	),
	new QName (
	    "NGTP-Dispatch",
	    "DSPTMessageType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "error",
		    0
		),
		new MemberListElement (
		    "crqm",
		    1
		),
		new MemberListElement (
		    "upServiceData",
		    2
		),
		new MemberListElement (
		    "downServiceData",
		    3
		),
		new MemberListElement (
		    "dsptAck",
		    4
		),
		new MemberListElement (
		    "notification",
		    5
		),
		new MemberListElement (
		    "terminateVoice",
		    6
		),
		new MemberListElement (
		    "terminateEvent",
		    7
		),
		new MemberListElement (
		    "prepareForTerminate",
		    8
		),
		new MemberListElement (
		    "challenge",
		    9
		),
		new MemberListElement (
		    "chRespServiceData",
		    10
		)
	    }
	),
	0,
	error
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DSPTMessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DSPTMessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DSPTMessageType
