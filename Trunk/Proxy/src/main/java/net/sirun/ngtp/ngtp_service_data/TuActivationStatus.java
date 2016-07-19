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
 * Define the ASN1 Type TuActivationStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class TuActivationStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TuActivationStatus()
    {
	super(cFirstNumber);
    }
    
    protected TuActivationStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long factory = 0;
	public static final long preactivated = 1;
	public static final long preactivated_logistics = 2;
	public static final long activated = 7;
	public static final long activated_eCall = 8;
	public static final long activated_Brazil = 9;
	public static final long provisioned = 12;
	public static final long deactivated = 15;
    }
    // Named list definitions.
    public static final TuActivationStatus factory =
	new TuActivationStatus();
    public static final TuActivationStatus preactivated =
	new TuActivationStatus(1);
    public static final TuActivationStatus preactivated_logistics =
	new TuActivationStatus(2);
    public static final TuActivationStatus activated =
	new TuActivationStatus(7);
    public static final TuActivationStatus activated_eCall =
	new TuActivationStatus(8);
    public static final TuActivationStatus activated_Brazil =
	new TuActivationStatus(9);
    public static final TuActivationStatus provisioned =
	new TuActivationStatus(12);
    public static final TuActivationStatus deactivated =
	new TuActivationStatus(15);
    private final static TuActivationStatus cNamedNumbers[] = {
	 factory, 
	 preactivated, 
	 preactivated_logistics, 
	 activated, 
	 activated_eCall, 
	 activated_Brazil, 
	 provisioned, 
	 deactivated
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
    
    public static TuActivationStatus valueOf(long value)
    {
	return (TuActivationStatus)factory.lookupValue(value);
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
	    "TuActivationStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TuActivationStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "factory",
		    0
		),
		new MemberListElement (
		    "preactivated",
		    1
		),
		new MemberListElement (
		    "preactivated-logistics",
		    2
		),
		new MemberListElement (
		    "activated",
		    7
		),
		new MemberListElement (
		    "activated-eCall",
		    8
		),
		new MemberListElement (
		    "activated-Brazil",
		    9
		),
		new MemberListElement (
		    "provisioned",
		    12
		),
		new MemberListElement (
		    "deactivated",
		    15
		)
	    }
	),
	0,
	factory
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TuActivationStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TuActivationStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TuActivationStatus
