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
 * Define the ASN1 Type ClimateOperatingStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class ClimateOperatingStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ClimateOperatingStatus()
    {
	super(cFirstNumber);
    }
    
    protected ClimateOperatingStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long off = 0;
	public static final long starting_up = 1;
	public static final long heating = 2;
	public static final long venting = 3;
	public static final long engine_heating = 4;
	public static final long shutting_down = 5;
	public static final long failure_low_voltage = 6;
	public static final long failure_low_fuel = 7;
	public static final long failure_service_required = 8;
	public static final long failure_system_failure = 9;
	public static final long failure_max_operational_time_reached = 10;
	public static final long stopped_by_user = 11;
	public static final long unknown = 12;
    }
    // Named list definitions.
    public static final ClimateOperatingStatus off =
	new ClimateOperatingStatus();
    public static final ClimateOperatingStatus starting_up =
	new ClimateOperatingStatus(1);
    public static final ClimateOperatingStatus heating =
	new ClimateOperatingStatus(2);
    public static final ClimateOperatingStatus venting =
	new ClimateOperatingStatus(3);
    public static final ClimateOperatingStatus engine_heating =
	new ClimateOperatingStatus(4);
    public static final ClimateOperatingStatus shutting_down =
	new ClimateOperatingStatus(5);
    public static final ClimateOperatingStatus failure_low_voltage =
	new ClimateOperatingStatus(6);
    public static final ClimateOperatingStatus failure_low_fuel =
	new ClimateOperatingStatus(7);
    public static final ClimateOperatingStatus failure_service_required =
	new ClimateOperatingStatus(8);
    public static final ClimateOperatingStatus failure_system_failure =
	new ClimateOperatingStatus(9);
    public static final ClimateOperatingStatus failure_max_operational_time_reached =
	new ClimateOperatingStatus(10);
    public static final ClimateOperatingStatus stopped_by_user =
	new ClimateOperatingStatus(11);
    public static final ClimateOperatingStatus unknown =
	new ClimateOperatingStatus(12);
    private final static ClimateOperatingStatus cNamedNumbers[] = {
	 off, 
	 starting_up, 
	 heating, 
	 venting, 
	 engine_heating, 
	 shutting_down, 
	 failure_low_voltage, 
	 failure_low_fuel, 
	 failure_service_required, 
	 failure_system_failure, 
	 failure_max_operational_time_reached, 
	 stopped_by_user, 
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
    
    public static ClimateOperatingStatus valueOf(long value)
    {
	return (ClimateOperatingStatus)off.lookupValue(value);
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
	    "ClimateOperatingStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ClimateOperatingStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "off",
		    0
		),
		new MemberListElement (
		    "starting-up",
		    1
		),
		new MemberListElement (
		    "heating",
		    2
		),
		new MemberListElement (
		    "venting",
		    3
		),
		new MemberListElement (
		    "engine-heating",
		    4
		),
		new MemberListElement (
		    "shutting-down",
		    5
		),
		new MemberListElement (
		    "failure-low-voltage",
		    6
		),
		new MemberListElement (
		    "failure-low-fuel",
		    7
		),
		new MemberListElement (
		    "failure-service-required",
		    8
		),
		new MemberListElement (
		    "failure-system-failure",
		    9
		),
		new MemberListElement (
		    "failure-max-operational-time-reached",
		    10
		),
		new MemberListElement (
		    "stopped-by-user",
		    11
		),
		new MemberListElement (
		    "unknown",
		    12
		)
	    }
	),
	0,
	off
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ClimateOperatingStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ClimateOperatingStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ClimateOperatingStatus
