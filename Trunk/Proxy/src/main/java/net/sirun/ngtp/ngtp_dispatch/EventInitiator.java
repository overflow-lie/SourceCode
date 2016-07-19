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


package net.sirun.ngtp.ngtp_dispatch;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type EventInitiator from ASN1 Module NGTP_Dispatch.
 * @see Enumerated
 */

public final class EventInitiator extends Enumerated {
    
    /**
     * The default constructor.
     */
    private EventInitiator()
    {
	super(cFirstNumber);
    }
    
    protected EventInitiator(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long tu = 0;
	public static final long backend = 1;
    }
    // Named list definitions.
    public static final EventInitiator tu =
	new EventInitiator();
    public static final EventInitiator backend =
	new EventInitiator(1);
    private final static EventInitiator cNamedNumbers[] = {
	 tu, 
	 backend
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
    
    public static EventInitiator valueOf(long value)
    {
	return (EventInitiator)tu.lookupValue(value);
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "EventInitiator"
	),
	new QName (
	    "NGTP-Dispatch",
	    "EventInitiator"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "tu",
		    0
		),
		new MemberListElement (
		    "backend",
		    1
		)
	    }
	),
	0,
	tu
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventInitiator object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventInitiator object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventInitiator
