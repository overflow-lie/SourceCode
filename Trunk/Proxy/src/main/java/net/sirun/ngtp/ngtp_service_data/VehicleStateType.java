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
 * Define the ASN1 Type VehicleStateType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class VehicleStateType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleStateType()
    {
	super(cFirstNumber);
    }
    
    protected VehicleStateType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long engine_on_moving = 0;
	public static final long engine_on_park = 1;
	public static final long key_on_engine_off = 2;
	public static final long delayed_accessory = 3;
	public static final long key_off = 4;
	public static final long key_removed = 5;
	public static final long engine_on_remote_start = 6;
	public static final long unknown = 15;
    }
    // Named list definitions.
    public static final VehicleStateType engine_on_moving =
	new VehicleStateType();
    public static final VehicleStateType engine_on_park =
	new VehicleStateType(1);
    public static final VehicleStateType key_on_engine_off =
	new VehicleStateType(2);
    public static final VehicleStateType delayed_accessory =
	new VehicleStateType(3);
    public static final VehicleStateType key_off =
	new VehicleStateType(4);
    public static final VehicleStateType key_removed =
	new VehicleStateType(5);
    public static final VehicleStateType engine_on_remote_start =
	new VehicleStateType(6);
    public static final VehicleStateType unknown =
	new VehicleStateType(15);
    private final static VehicleStateType cNamedNumbers[] = {
	 engine_on_moving, 
	 engine_on_park, 
	 key_on_engine_off, 
	 delayed_accessory, 
	 key_off, 
	 key_removed, 
	 engine_on_remote_start, 
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
    
    public static VehicleStateType valueOf(long value)
    {
	return (VehicleStateType)engine_on_moving.lookupValue(value);
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
	    "VehicleStateType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "VehicleStateType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "engine-on-moving",
		    0
		),
		new MemberListElement (
		    "engine-on-park",
		    1
		),
		new MemberListElement (
		    "key-on-engine-off",
		    2
		),
		new MemberListElement (
		    "delayed-accessory",
		    3
		),
		new MemberListElement (
		    "key-off",
		    4
		),
		new MemberListElement (
		    "key-removed",
		    5
		),
		new MemberListElement (
		    "engine-on-remote-start",
		    6
		),
		new MemberListElement (
		    "unknown",
		    15
		)
	    }
	),
	0,
	engine_on_moving
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleStateType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleStateType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleStateType
