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
 * Define the ASN1 Type ServiceWarningTrigger from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class ServiceWarningTrigger extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ServiceWarningTrigger()
    {
	super(cFirstNumber);
    }
    
    protected ServiceWarningTrigger(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long calendar_time = 0;
	public static final long distance = 1;
	public static final long engine_hours = 2;
	public static final long engine_req = 3;
	public static final long unknown = 7;
    }
    // Named list definitions.
    public static final ServiceWarningTrigger calendar_time =
	new ServiceWarningTrigger();
    public static final ServiceWarningTrigger distance =
	new ServiceWarningTrigger(1);
    public static final ServiceWarningTrigger engine_hours =
	new ServiceWarningTrigger(2);
    public static final ServiceWarningTrigger engine_req =
	new ServiceWarningTrigger(3);
    public static final ServiceWarningTrigger unknown =
	new ServiceWarningTrigger(7);
    private final static ServiceWarningTrigger cNamedNumbers[] = {
	 calendar_time, 
	 distance, 
	 engine_hours, 
	 engine_req, 
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
    
    public static ServiceWarningTrigger valueOf(long value)
    {
	return (ServiceWarningTrigger)calendar_time.lookupValue(value);
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
	    "ServiceWarningTrigger"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ServiceWarningTrigger"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "calendar-time",
		    0
		),
		new MemberListElement (
		    "distance",
		    1
		),
		new MemberListElement (
		    "engine-hours",
		    2
		),
		new MemberListElement (
		    "engine-req",
		    3
		),
		new MemberListElement (
		    "unknown",
		    7
		)
	    }
	),
	0,
	calendar_time
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ServiceWarningTrigger object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ServiceWarningTrigger object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ServiceWarningTrigger
