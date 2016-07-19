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
 * Define the ASN1 Type TUPowerSource from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class TUPowerSource extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TUPowerSource()
    {
	super(cFirstNumber);
    }
    
    protected TUPowerSource(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long mainBattery = 0;
	public static final long reserveBatteryPrimary = 1;
	public static final long reserveBatterySecondary = 2;
    }
    // Named list definitions.
    public static final TUPowerSource mainBattery =
	new TUPowerSource();
    public static final TUPowerSource reserveBatteryPrimary =
	new TUPowerSource(1);
    public static final TUPowerSource reserveBatterySecondary =
	new TUPowerSource(2);
    private final static TUPowerSource cNamedNumbers[] = {
	 mainBattery, 
	 reserveBatteryPrimary, 
	 reserveBatterySecondary
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
    
    public static TUPowerSource valueOf(long value)
    {
	return (TUPowerSource)mainBattery.lookupValue(value);
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
	    "TUPowerSource"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TUPowerSource"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "mainBattery",
		    0
		),
		new MemberListElement (
		    "reserveBatteryPrimary",
		    1
		),
		new MemberListElement (
		    "reserveBatterySecondary",
		    2
		)
	    }
	),
	0,
	mainBattery
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TUPowerSource object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TUPowerSource object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TUPowerSource
