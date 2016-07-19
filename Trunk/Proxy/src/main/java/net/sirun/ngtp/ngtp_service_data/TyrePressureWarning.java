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
 * Define the ASN1 Type TyrePressureWarning from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class TyrePressureWarning extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TyrePressureWarning()
    {
	super(cFirstNumber);
    }
    
    protected TyrePressureWarning(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long system_fault = 0;
	public static final long normal = 1;
	public static final long high = 2;
	public static final long low_soft_warn = 3;
	public static final long low_hard_warn = 4;
	public static final long no_sensors = 5;
	public static final long unknown = 7;
    }
    // Named list definitions.
    public static final TyrePressureWarning system_fault =
	new TyrePressureWarning();
    public static final TyrePressureWarning normal =
	new TyrePressureWarning(1);
    public static final TyrePressureWarning high =
	new TyrePressureWarning(2);
    public static final TyrePressureWarning low_soft_warn =
	new TyrePressureWarning(3);
    public static final TyrePressureWarning low_hard_warn =
	new TyrePressureWarning(4);
    public static final TyrePressureWarning no_sensors =
	new TyrePressureWarning(5);
    public static final TyrePressureWarning unknown =
	new TyrePressureWarning(7);
    private final static TyrePressureWarning cNamedNumbers[] = {
	 system_fault, 
	 normal, 
	 high, 
	 low_soft_warn, 
	 low_hard_warn, 
	 no_sensors, 
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
    
    public static TyrePressureWarning valueOf(long value)
    {
	return (TyrePressureWarning)system_fault.lookupValue(value);
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
	    "TyrePressureWarning"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TyrePressureWarning"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "system-fault",
		    0
		),
		new MemberListElement (
		    "normal",
		    1
		),
		new MemberListElement (
		    "high",
		    2
		),
		new MemberListElement (
		    "low-soft-warn",
		    3
		),
		new MemberListElement (
		    "low-hard-warn",
		    4
		),
		new MemberListElement (
		    "no-sensors",
		    5
		),
		new MemberListElement (
		    "unknown",
		    7
		)
	    }
	),
	0,
	system_fault
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TyrePressureWarning object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TyrePressureWarning object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TyrePressureWarning
