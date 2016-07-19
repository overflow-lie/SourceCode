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
 * Define the ASN1 Type GnssFixType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class GnssFixType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private GnssFixType()
    {
	super(cFirstNumber);
    }
    
    protected GnssFixType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long none = 0;
	public static final long timeFix = 1;
	public static final long fix2D = 2;
	public static final long fix3D = 3;
	public static final long fix3DHqFix = 4;
    }
    // Named list definitions.
    public static final GnssFixType none =
	new GnssFixType();
    public static final GnssFixType timeFix =
	new GnssFixType(1);
    public static final GnssFixType fix2D =
	new GnssFixType(2);
    public static final GnssFixType fix3D =
	new GnssFixType(3);
    public static final GnssFixType fix3DHqFix =
	new GnssFixType(4);
    private final static GnssFixType cNamedNumbers[] = {
	 none, 
	 timeFix, 
	 fix2D, 
	 fix3D, 
	 fix3DHqFix
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
    
    public static GnssFixType valueOf(long value)
    {
	return (GnssFixType)none.lookupValue(value);
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
	    "GnssFixType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "GnssFixType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "none",
		    0
		),
		new MemberListElement (
		    "timeFix",
		    1
		),
		new MemberListElement (
		    "fix2D",
		    2
		),
		new MemberListElement (
		    "fix3D",
		    3
		),
		new MemberListElement (
		    "fix3DHqFix",
		    4
		)
	    }
	),
	0,
	none
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GnssFixType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GnssFixType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GnssFixType
