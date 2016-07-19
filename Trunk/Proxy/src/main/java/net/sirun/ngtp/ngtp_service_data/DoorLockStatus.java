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
 * Define the ASN1 Type DoorLockStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class DoorLockStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DoorLockStatus()
    {
	super(cFirstNumber);
    }
    
    protected DoorLockStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long unlocked = 1;
	public static final long locked = 3;
	public static final long secured = 4;
    }
    // Named list definitions.
    public static final DoorLockStatus unknown =
	new DoorLockStatus();
    public static final DoorLockStatus unlocked =
	new DoorLockStatus(1);
    public static final DoorLockStatus locked =
	new DoorLockStatus(3);
    public static final DoorLockStatus secured =
	new DoorLockStatus(4);
    private final static DoorLockStatus cNamedNumbers[] = {
	 unknown, 
	 unlocked, 
	 locked, 
	 secured
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
    
    public static DoorLockStatus valueOf(long value)
    {
	return (DoorLockStatus)unknown.lookupValue(value);
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
	    "DoorLockStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DoorLockStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unknown",
		    0
		),
		new MemberListElement (
		    "unlocked",
		    1
		),
		new MemberListElement (
		    "locked",
		    3
		),
		new MemberListElement (
		    "secured",
		    4
		)
	    }
	),
	0,
	unknown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DoorLockStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DoorLockStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DoorLockStatus
