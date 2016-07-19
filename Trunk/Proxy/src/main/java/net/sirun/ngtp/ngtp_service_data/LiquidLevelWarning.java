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
 * Define the ASN1 Type LiquidLevelWarning from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class LiquidLevelWarning extends Enumerated {
    
    /**
     * The default constructor.
     */
    private LiquidLevelWarning()
    {
	super(cFirstNumber);
    }
    
    protected LiquidLevelWarning(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long normal = 0;
	public static final long low = 1;
	public static final long very_low = 2;
	public static final long high = 3;
	public static final long very_high = 4;
	public static final long unknown = 7;
    }
    // Named list definitions.
    public static final LiquidLevelWarning normal =
	new LiquidLevelWarning();
    public static final LiquidLevelWarning low =
	new LiquidLevelWarning(1);
    public static final LiquidLevelWarning very_low =
	new LiquidLevelWarning(2);
    public static final LiquidLevelWarning high =
	new LiquidLevelWarning(3);
    public static final LiquidLevelWarning very_high =
	new LiquidLevelWarning(4);
    public static final LiquidLevelWarning unknown =
	new LiquidLevelWarning(7);
    private final static LiquidLevelWarning cNamedNumbers[] = {
	 normal, 
	 low, 
	 very_low, 
	 high, 
	 very_high, 
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
    
    public static LiquidLevelWarning valueOf(long value)
    {
	return (LiquidLevelWarning)normal.lookupValue(value);
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
	    "LiquidLevelWarning"
	),
	new QName (
	    "NGTP-Service-Data",
	    "LiquidLevelWarning"
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
		    "low",
		    1
		),
		new MemberListElement (
		    "very-low",
		    2
		),
		new MemberListElement (
		    "high",
		    3
		),
		new MemberListElement (
		    "very-high",
		    4
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
     * Get the type descriptor (TypeInfo) of 'this' LiquidLevelWarning object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LiquidLevelWarning object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LiquidLevelWarning
