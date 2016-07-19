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
 * Define the ASN1 Type Bulb from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class Bulb extends Enumerated {
    
    /**
     * The default constructor.
     */
    public Bulb()
    {
	super(cFirstNumber);
    }
    
    protected Bulb(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long left_turn_any = 0;
	public static final long right_turn_any = 1;
	public static final long low_beam_any = 2;
	public static final long low_beam_left = 3;
	public static final long low_beam_right = 4;
	public static final long high_beam_any = 5;
	public static final long high_beam_left = 6;
	public static final long high_beam_right = 7;
	public static final long fog_front_any = 8;
	public static final long fog_rear_any = 9;
	public static final long stop_any = 10;
	public static final long position_any = 11;
	public static final long day_running_any = 12;
	public static final long trailer_turn_any = 13;
	public static final long trailer_turn_left_any = 14;
	public static final long trailer_turn_right_any = 15;
	public static final long trailer_stop_any = 16;
	public static final long trailer_el_failure = 17;
	public static final long multiple = 31;
    }
    // Named list definitions.
    public static final Bulb left_turn_any =
	new Bulb();
    public static final Bulb right_turn_any =
	new Bulb(1);
    public static final Bulb low_beam_any =
	new Bulb(2);
    public static final Bulb low_beam_left =
	new Bulb(3);
    public static final Bulb low_beam_right =
	new Bulb(4);
    public static final Bulb high_beam_any =
	new Bulb(5);
    public static final Bulb high_beam_left =
	new Bulb(6);
    public static final Bulb high_beam_right =
	new Bulb(7);
    public static final Bulb fog_front_any =
	new Bulb(8);
    public static final Bulb fog_rear_any =
	new Bulb(9);
    public static final Bulb stop_any =
	new Bulb(10);
    public static final Bulb position_any =
	new Bulb(11);
    public static final Bulb day_running_any =
	new Bulb(12);
    public static final Bulb trailer_turn_any =
	new Bulb(13);
    public static final Bulb trailer_turn_left_any =
	new Bulb(14);
    public static final Bulb trailer_turn_right_any =
	new Bulb(15);
    public static final Bulb trailer_stop_any =
	new Bulb(16);
    public static final Bulb trailer_el_failure =
	new Bulb(17);
    public static final Bulb multiple =
	new Bulb(31);
    private final static Bulb cNamedNumbers[] = {
	 left_turn_any, 
	 right_turn_any, 
	 low_beam_any, 
	 low_beam_left, 
	 low_beam_right, 
	 high_beam_any, 
	 high_beam_left, 
	 high_beam_right, 
	 fog_front_any, 
	 fog_rear_any, 
	 stop_any, 
	 position_any, 
	 day_running_any, 
	 trailer_turn_any, 
	 trailer_turn_left_any, 
	 trailer_turn_right_any, 
	 trailer_stop_any, 
	 trailer_el_failure, 
	 multiple
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
    
    public static Bulb valueOf(long value)
    {
	return (Bulb)left_turn_any.lookupValue(value);
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
	    "Bulb"
	),
	new QName (
	    "NGTP-Service-Data",
	    "Bulb"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "left-turn-any",
		    0
		),
		new MemberListElement (
		    "right-turn-any",
		    1
		),
		new MemberListElement (
		    "low-beam-any",
		    2
		),
		new MemberListElement (
		    "low-beam-left",
		    3
		),
		new MemberListElement (
		    "low-beam-right",
		    4
		),
		new MemberListElement (
		    "high-beam-any",
		    5
		),
		new MemberListElement (
		    "high-beam-left",
		    6
		),
		new MemberListElement (
		    "high-beam-right",
		    7
		),
		new MemberListElement (
		    "fog-front-any",
		    8
		),
		new MemberListElement (
		    "fog-rear-any",
		    9
		),
		new MemberListElement (
		    "stop-any",
		    10
		),
		new MemberListElement (
		    "position-any",
		    11
		),
		new MemberListElement (
		    "day-running-any",
		    12
		),
		new MemberListElement (
		    "trailer-turn-any",
		    13
		),
		new MemberListElement (
		    "trailer-turn-left-any",
		    14
		),
		new MemberListElement (
		    "trailer-turn-right-any",
		    15
		),
		new MemberListElement (
		    "trailer-stop-any",
		    16
		),
		new MemberListElement (
		    "trailer-el-failure",
		    17
		),
		new MemberListElement (
		    "multiple",
		    31
		)
	    }
	),
	0,
	left_turn_any
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Bulb object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Bulb object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Bulb
