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
 * Define the ASN1 Type FuelStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class FuelStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private FuelStatus()
    {
	super(cFirstNumber);
    }
    
    protected FuelStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long no_fuel_info = 0;
	public static final long fuel_empty = 1;
	public static final long fuel_reserve = 2;
	public static final long fuel_1_4 = 3;
	public static final long fuel_1_2 = 4;
	public static final long fuel_3_4 = 5;
	public static final long fuel_1_1 = 6;
    }
    // Named list definitions.
    public static final FuelStatus no_fuel_info =
	new FuelStatus();
    public static final FuelStatus fuel_empty =
	new FuelStatus(1);
    public static final FuelStatus fuel_reserve =
	new FuelStatus(2);
    public static final FuelStatus fuel_1_4 =
	new FuelStatus(3);
    public static final FuelStatus fuel_1_2 =
	new FuelStatus(4);
    public static final FuelStatus fuel_3_4 =
	new FuelStatus(5);
    public static final FuelStatus fuel_1_1 =
	new FuelStatus(6);
    private final static FuelStatus cNamedNumbers[] = {
	 no_fuel_info, 
	 fuel_empty, 
	 fuel_reserve, 
	 fuel_1_4, 
	 fuel_1_2, 
	 fuel_3_4, 
	 fuel_1_1
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
    
    public static FuelStatus valueOf(long value)
    {
	return (FuelStatus)no_fuel_info.lookupValue(value);
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
	    "FuelStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "FuelStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "no-fuel-info",
		    0
		),
		new MemberListElement (
		    "fuel-empty",
		    1
		),
		new MemberListElement (
		    "fuel-reserve",
		    2
		),
		new MemberListElement (
		    "fuel-1-4",
		    3
		),
		new MemberListElement (
		    "fuel-1-2",
		    4
		),
		new MemberListElement (
		    "fuel-3-4",
		    5
		),
		new MemberListElement (
		    "fuel-1-1",
		    6
		)
	    }
	),
	0,
	no_fuel_info
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FuelStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FuelStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for FuelStatus
