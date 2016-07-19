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
 * Define the ASN1 Type DashboardUnits from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class DashboardUnits extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DashboardUnits()
    {
	super(cFirstNumber);
    }
    
    protected DashboardUnits(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long miles_per_gallon = 0;
	public static final long miles_per_hour = 1;
	public static final long miles_per_liter = 2;
	public static final long km_per_liter = 3;
	public static final long liter_per_100km = 4;
	public static final long unknown = 5;
    }
    // Named list definitions.
    public static final DashboardUnits miles_per_gallon =
	new DashboardUnits();
    public static final DashboardUnits miles_per_hour =
	new DashboardUnits(1);
    public static final DashboardUnits miles_per_liter =
	new DashboardUnits(2);
    public static final DashboardUnits km_per_liter =
	new DashboardUnits(3);
    public static final DashboardUnits liter_per_100km =
	new DashboardUnits(4);
    public static final DashboardUnits unknown =
	new DashboardUnits(5);
    private final static DashboardUnits cNamedNumbers[] = {
	 miles_per_gallon, 
	 miles_per_hour, 
	 miles_per_liter, 
	 km_per_liter, 
	 liter_per_100km, 
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
    
    public static DashboardUnits valueOf(long value)
    {
	return (DashboardUnits)miles_per_gallon.lookupValue(value);
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
	    "DashboardUnits"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DashboardUnits"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "miles_per_gallon",
		    0
		),
		new MemberListElement (
		    "miles_per_hour",
		    1
		),
		new MemberListElement (
		    "miles_per_liter",
		    2
		),
		new MemberListElement (
		    "km_per_liter",
		    3
		),
		new MemberListElement (
		    "liter_per_100km",
		    4
		),
		new MemberListElement (
		    "unknown",
		    5
		)
	    }
	),
	0,
	miles_per_gallon
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DashboardUnits object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DashboardUnits object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DashboardUnits
