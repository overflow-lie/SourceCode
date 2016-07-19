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
 * Define the ASN1 Type RemoteOperationType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class RemoteOperationType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RemoteOperationType()
    {
	super(cFirstNumber);
    }
    
    protected RemoteOperationType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long read = 0;
	public static final long write = 1;
	public static final long diagnostics_cancel = 2;
	public static final long read_async = 3;
	public static final long write_async = 4;
	public static final long diagnostics_read = 5;
	public static final long diagnostics_write = 6;
	public static final long diagnostics_track = 7;
	public static final long diagnostics_read_interval = 8;
    }
    // Named list definitions.
    public static final RemoteOperationType read =
	new RemoteOperationType();
    public static final RemoteOperationType write =
	new RemoteOperationType(1);
    public static final RemoteOperationType diagnostics_cancel =
	new RemoteOperationType(2);
    public static final RemoteOperationType read_async =
	new RemoteOperationType(3);
    public static final RemoteOperationType write_async =
	new RemoteOperationType(4);
    public static final RemoteOperationType diagnostics_read =
	new RemoteOperationType(5);
    public static final RemoteOperationType diagnostics_write =
	new RemoteOperationType(6);
    public static final RemoteOperationType diagnostics_track =
	new RemoteOperationType(7);
    public static final RemoteOperationType diagnostics_read_interval =
	new RemoteOperationType(8);
    private final static RemoteOperationType cNamedNumbers[] = {
	 read, 
	 write, 
	 diagnostics_cancel, 
	 read_async, 
	 write_async, 
	 diagnostics_read, 
	 diagnostics_write, 
	 diagnostics_track, 
	 diagnostics_read_interval
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
    
    public static RemoteOperationType valueOf(long value)
    {
	return (RemoteOperationType)read.lookupValue(value);
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
	    "RemoteOperationType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "read",
		    0
		),
		new MemberListElement (
		    "write",
		    1
		),
		new MemberListElement (
		    "diagnostics-cancel",
		    2
		),
		new MemberListElement (
		    "read-async",
		    3
		),
		new MemberListElement (
		    "write-async",
		    4
		),
		new MemberListElement (
		    "diagnostics-read",
		    5
		),
		new MemberListElement (
		    "diagnostics-write",
		    6
		),
		new MemberListElement (
		    "diagnostics-track",
		    7
		),
		new MemberListElement (
		    "diagnostics-read-interval",
		    8
		)
	    }
	),
	0,
	read
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationType
