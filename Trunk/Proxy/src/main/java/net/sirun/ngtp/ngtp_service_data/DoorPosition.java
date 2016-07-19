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
 * Define the ASN1 Type DoorPosition from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class DoorPosition extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DoorPosition()
    {
	super(cFirstNumber);
    }
    
    protected DoorPosition(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long open = 0;
	public static final long closed = 1;
	public static final long unknown = 7;
    }
    // Named list definitions.
    public static final DoorPosition open =
	new DoorPosition();
    public static final DoorPosition closed =
	new DoorPosition(1);
    public static final DoorPosition unknown =
	new DoorPosition(7);
    private final static DoorPosition cNamedNumbers[] = {
	 open, 
	 closed, 
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
    
    public static DoorPosition valueOf(long value)
    {
	return (DoorPosition)open.lookupValue(value);
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
	    "DoorPosition"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DoorPosition"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "open",
		    0
		),
		new MemberListElement (
		    "closed",
		    1
		),
		new MemberListElement (
		    "unknown",
		    7
		)
	    }
	),
	0,
	open
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DoorPosition object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DoorPosition object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DoorPosition
