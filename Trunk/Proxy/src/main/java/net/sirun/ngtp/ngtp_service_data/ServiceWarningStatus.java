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
 * Define the ASN1 Type ServiceWarningStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class ServiceWarningStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ServiceWarningStatus()
    {
	super(cFirstNumber);
    }
    
    protected ServiceWarningStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long normal = 0;
	public static final long almost_time_for_srvc = 1;
	public static final long time_for_srvc = 2;
	public static final long time_exceeded = 3;
	public static final long unknown = 7;
    }
    // Named list definitions.
    public static final ServiceWarningStatus normal =
	new ServiceWarningStatus();
    public static final ServiceWarningStatus almost_time_for_srvc =
	new ServiceWarningStatus(1);
    public static final ServiceWarningStatus time_for_srvc =
	new ServiceWarningStatus(2);
    public static final ServiceWarningStatus time_exceeded =
	new ServiceWarningStatus(3);
    public static final ServiceWarningStatus unknown =
	new ServiceWarningStatus(7);
    private final static ServiceWarningStatus cNamedNumbers[] = {
	 normal, 
	 almost_time_for_srvc, 
	 time_for_srvc, 
	 time_exceeded, 
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
    
    public static ServiceWarningStatus valueOf(long value)
    {
	return (ServiceWarningStatus)normal.lookupValue(value);
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
	    "ServiceWarningStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ServiceWarningStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "normal",
		    0
		),
		new MemberListElement (
		    "almost-time-for-srvc",
		    1
		),
		new MemberListElement (
		    "time-for-srvc",
		    2
		),
		new MemberListElement (
		    "time-exceeded",
		    3
		),
		new MemberListElement (
		    "unknown",
		    7
		)
	    }
	),
	0,
	normal
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ServiceWarningStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ServiceWarningStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ServiceWarningStatus
