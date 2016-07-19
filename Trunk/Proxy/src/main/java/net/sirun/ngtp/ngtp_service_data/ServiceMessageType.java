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
 * Define the ASN1 Type ServiceMessageType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class ServiceMessageType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ServiceMessageType()
    {
	super(cFirstNumber);
    }
    
    protected ServiceMessageType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long dataRequest = 0;
	public static final long update = 1;
	public static final long startRequest = 2;
	public static final long terminateReq = 3;
	public static final long dataResponse = 8;
	public static final long actionResponse = 9;
	public static final long acknowledge = 10;
    }
    // Named list definitions.
    public static final ServiceMessageType dataRequest =
	new ServiceMessageType();
    public static final ServiceMessageType update =
	new ServiceMessageType(1);
    public static final ServiceMessageType startRequest =
	new ServiceMessageType(2);
    public static final ServiceMessageType terminateReq =
	new ServiceMessageType(3);
    public static final ServiceMessageType dataResponse =
	new ServiceMessageType(8);
    public static final ServiceMessageType actionResponse =
	new ServiceMessageType(9);
    public static final ServiceMessageType acknowledge =
	new ServiceMessageType(10);
    private final static ServiceMessageType cNamedNumbers[] = {
	 dataRequest, 
	 update, 
	 startRequest, 
	 terminateReq, 
	 dataResponse, 
	 actionResponse, 
	 acknowledge
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
    
    public static ServiceMessageType valueOf(long value)
    {
	return (ServiceMessageType)dataRequest.lookupValue(value);
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
	    "ServiceMessageType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ServiceMessageType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "dataRequest",
		    0
		),
		new MemberListElement (
		    "update",
		    1
		),
		new MemberListElement (
		    "startRequest",
		    2
		),
		new MemberListElement (
		    "terminateReq",
		    3
		),
		new MemberListElement (
		    "dataResponse",
		    8
		),
		new MemberListElement (
		    "actionResponse",
		    9
		),
		new MemberListElement (
		    "acknowledge",
		    10
		)
	    }
	),
	0,
	dataRequest
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ServiceMessageType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ServiceMessageType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ServiceMessageType
