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
 * Define the ASN1 Type RemoteOperationName from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class RemoteOperationName extends Enumerated {
    
    /**
     * The default constructor.
     */
    private RemoteOperationName()
    {
	super(cFirstNumber);
    }
    
    protected RemoteOperationName(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long rotNameEnd = 0;
	public static final long rotNameStart = 1;
	public static final long rotNamePause = 2;
	public static final long rotNameRestart = 3;
	public static final long rotNameConfigure = 4;
	public static final long rotNameGet = 5;
	public static final long rotNameGetPos = 6;
	public static final long rotNameCleardown = 7;
	public static final long rotNameCallback = 8;
	public static final long rotNameBlock = 9;
	public static final long rotNameUnblock = 10;
	public static final long rotNameEndTnOnly = 11;
	public static final long rotNameEndTnEndSvt = 12;
	public static final long rotNameEndTnUnblock = 13;
	public static final long rotNameDeactivate = 14;
	public static final long rotNamePreactivate = 15;
	public static final long rotNameActivate = 16;
	public static final long rotNameProvision = 17;
	public static final long rotNameHeat = 18;
	public static final long rotNameVent = 19;
	public static final long rotNameAuto = 20;
    }
    // Named list definitions.
    public static final RemoteOperationName rotNameEnd =
	new RemoteOperationName();
    public static final RemoteOperationName rotNameStart =
	new RemoteOperationName(1);
    public static final RemoteOperationName rotNamePause =
	new RemoteOperationName(2);
    public static final RemoteOperationName rotNameRestart =
	new RemoteOperationName(3);
    public static final RemoteOperationName rotNameConfigure =
	new RemoteOperationName(4);
    public static final RemoteOperationName rotNameGet =
	new RemoteOperationName(5);
    public static final RemoteOperationName rotNameGetPos =
	new RemoteOperationName(6);
    public static final RemoteOperationName rotNameCleardown =
	new RemoteOperationName(7);
    public static final RemoteOperationName rotNameCallback =
	new RemoteOperationName(8);
    public static final RemoteOperationName rotNameBlock =
	new RemoteOperationName(9);
    public static final RemoteOperationName rotNameUnblock =
	new RemoteOperationName(10);
    public static final RemoteOperationName rotNameEndTnOnly =
	new RemoteOperationName(11);
    public static final RemoteOperationName rotNameEndTnEndSvt =
	new RemoteOperationName(12);
    public static final RemoteOperationName rotNameEndTnUnblock =
	new RemoteOperationName(13);
    public static final RemoteOperationName rotNameDeactivate =
	new RemoteOperationName(14);
    public static final RemoteOperationName rotNamePreactivate =
	new RemoteOperationName(15);
    public static final RemoteOperationName rotNameActivate =
	new RemoteOperationName(16);
    public static final RemoteOperationName rotNameProvision =
	new RemoteOperationName(17);
    public static final RemoteOperationName rotNameHeat =
	new RemoteOperationName(18);
    public static final RemoteOperationName rotNameVent =
	new RemoteOperationName(19);
    public static final RemoteOperationName rotNameAuto =
	new RemoteOperationName(20);
    private final static RemoteOperationName cNamedNumbers[] = {
	 rotNameEnd, 
	 rotNameStart, 
	 rotNamePause, 
	 rotNameRestart, 
	 rotNameConfigure, 
	 rotNameGet, 
	 rotNameGetPos, 
	 rotNameCleardown, 
	 rotNameCallback, 
	 rotNameBlock, 
	 rotNameUnblock, 
	 rotNameEndTnOnly, 
	 rotNameEndTnEndSvt, 
	 rotNameEndTnUnblock, 
	 rotNameDeactivate, 
	 rotNamePreactivate, 
	 rotNameActivate, 
	 rotNameProvision, 
	 rotNameHeat, 
	 rotNameVent, 
	 rotNameAuto
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
    
    public static RemoteOperationName valueOf(long value)
    {
	return (RemoteOperationName)rotNameEnd.lookupValue(value);
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
	    "RemoteOperationName"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationName"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "rotNameEnd",
		    0
		),
		new MemberListElement (
		    "rotNameStart",
		    1
		),
		new MemberListElement (
		    "rotNamePause",
		    2
		),
		new MemberListElement (
		    "rotNameRestart",
		    3
		),
		new MemberListElement (
		    "rotNameConfigure",
		    4
		),
		new MemberListElement (
		    "rotNameGet",
		    5
		),
		new MemberListElement (
		    "rotNameGetPos",
		    6
		),
		new MemberListElement (
		    "rotNameCleardown",
		    7
		),
		new MemberListElement (
		    "rotNameCallback",
		    8
		),
		new MemberListElement (
		    "rotNameBlock",
		    9
		),
		new MemberListElement (
		    "rotNameUnblock",
		    10
		),
		new MemberListElement (
		    "rotNameEndTnOnly",
		    11
		),
		new MemberListElement (
		    "rotNameEndTnEndSvt",
		    12
		),
		new MemberListElement (
		    "rotNameEndTnUnblock",
		    13
		),
		new MemberListElement (
		    "rotNameDeactivate",
		    14
		),
		new MemberListElement (
		    "rotNamePreactivate",
		    15
		),
		new MemberListElement (
		    "rotNameActivate",
		    16
		),
		new MemberListElement (
		    "rotNameProvision",
		    17
		),
		new MemberListElement (
		    "rotNameHeat",
		    18
		),
		new MemberListElement (
		    "rotNameVent",
		    19
		),
		new MemberListElement (
		    "rotNameAuto",
		    20
		)
	    }
	),
	0,
	rotNameEnd
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationName object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationName object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationName
