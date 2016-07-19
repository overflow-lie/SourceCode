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
 * Define the ASN1 Type MainBatteryStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class MainBatteryStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private MainBatteryStatus()
    {
	super(cFirstNumber);
    }
    
    protected MainBatteryStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long no_battery_info = 0;
	public static final long battery_empty = 1;
	public static final long battery_low = 2;
	public static final long battery_1_4 = 3;
	public static final long battery_1_2 = 4;
	public static final long battery_3_4 = 5;
	public static final long battery_1_1 = 6;
    }
    // Named list definitions.
    public static final MainBatteryStatus no_battery_info =
	new MainBatteryStatus();
    public static final MainBatteryStatus battery_empty =
	new MainBatteryStatus(1);
    public static final MainBatteryStatus battery_low =
	new MainBatteryStatus(2);
    public static final MainBatteryStatus battery_1_4 =
	new MainBatteryStatus(3);
    public static final MainBatteryStatus battery_1_2 =
	new MainBatteryStatus(4);
    public static final MainBatteryStatus battery_3_4 =
	new MainBatteryStatus(5);
    public static final MainBatteryStatus battery_1_1 =
	new MainBatteryStatus(6);
    private final static MainBatteryStatus cNamedNumbers[] = {
	 no_battery_info, 
	 battery_empty, 
	 battery_low, 
	 battery_1_4, 
	 battery_1_2, 
	 battery_3_4, 
	 battery_1_1
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
    
    public static MainBatteryStatus valueOf(long value)
    {
	return (MainBatteryStatus)no_battery_info.lookupValue(value);
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
	    "MainBatteryStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "MainBatteryStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "no-battery-info",
		    0
		),
		new MemberListElement (
		    "battery-empty",
		    1
		),
		new MemberListElement (
		    "battery-low",
		    2
		),
		new MemberListElement (
		    "battery-1-4",
		    3
		),
		new MemberListElement (
		    "battery-1-2",
		    4
		),
		new MemberListElement (
		    "battery-3-4",
		    5
		),
		new MemberListElement (
		    "battery-1-1",
		    6
		)
	    }
	),
	0,
	no_battery_info
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MainBatteryStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MainBatteryStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MainBatteryStatus
