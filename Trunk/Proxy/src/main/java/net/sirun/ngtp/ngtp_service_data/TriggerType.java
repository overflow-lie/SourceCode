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
 * Define the ASN1 Type TriggerType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class TriggerType extends Enumerated {
    
    /**
     * The default constructor.
     */
    public TriggerType()
    {
	super(cFirstNumber);
    }
    
    protected TriggerType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long eCallButton = 0;
	public static final long crashModuleWireInput = 1;
	public static final long crashModuleCanInput = 2;
	public static final long bCallButton = 3;
	public static final long engineOn = 4;
	public static final long engineOff = 5;
	public static final long firstFix = 6;
	public static final long drivenDistanceSinceLastTp = 7;
	public static final long timeSinceLastTp = 8;
	public static final long turnAngleSinceLastTp = 9;
	public static final long firstNwReg = 10;
	public static final long drivenDistanceSinceLastWp = 11;
	public static final long timeSinceLastWp = 12;
	public static final long turnAngleSinceLastWp = 13;
	public static final long lowFuelLevel = 14;
	public static final long transitionRemoteEngineStartToNormal = 15;
	public static final long remoteEngineStartRunTimeExpiry = 16;
	public static final long remoteEngineStartFailure = 17;
	public static final long remoteEngineStopFailure = 18;
	public static final long vehicleCommunicationFailed = 19;
	public static final long userInterruption = 20;
	public static final long tspReq = 21;
	public static final long diagRoutine = 22;
    }
    // Named list definitions.
    public static final TriggerType eCallButton =
	new TriggerType();
    public static final TriggerType crashModuleWireInput =
	new TriggerType(1);
    public static final TriggerType crashModuleCanInput =
	new TriggerType(2);
    public static final TriggerType bCallButton =
	new TriggerType(3);
    public static final TriggerType engineOn =
	new TriggerType(4);
    public static final TriggerType engineOff =
	new TriggerType(5);
    public static final TriggerType firstFix =
	new TriggerType(6);
    public static final TriggerType drivenDistanceSinceLastTp =
	new TriggerType(7);
    public static final TriggerType timeSinceLastTp =
	new TriggerType(8);
    public static final TriggerType turnAngleSinceLastTp =
	new TriggerType(9);
    public static final TriggerType firstNwReg =
	new TriggerType(10);
    public static final TriggerType drivenDistanceSinceLastWp =
	new TriggerType(11);
    public static final TriggerType timeSinceLastWp =
	new TriggerType(12);
    public static final TriggerType turnAngleSinceLastWp =
	new TriggerType(13);
    public static final TriggerType lowFuelLevel =
	new TriggerType(14);
    public static final TriggerType transitionRemoteEngineStartToNormal =
	new TriggerType(15);
    public static final TriggerType remoteEngineStartRunTimeExpiry =
	new TriggerType(16);
    public static final TriggerType remoteEngineStartFailure =
	new TriggerType(17);
    public static final TriggerType remoteEngineStopFailure =
	new TriggerType(18);
    public static final TriggerType vehicleCommunicationFailed =
	new TriggerType(19);
    public static final TriggerType userInterruption =
	new TriggerType(20);
    public static final TriggerType tspReq =
	new TriggerType(21);
    public static final TriggerType diagRoutine =
	new TriggerType(22);
    private final static TriggerType cNamedNumbers[] = {
	 eCallButton, 
	 crashModuleWireInput, 
	 crashModuleCanInput, 
	 bCallButton, 
	 engineOn, 
	 engineOff, 
	 firstFix, 
	 drivenDistanceSinceLastTp, 
	 timeSinceLastTp, 
	 turnAngleSinceLastTp, 
	 firstNwReg, 
	 drivenDistanceSinceLastWp, 
	 timeSinceLastWp, 
	 turnAngleSinceLastWp, 
	 lowFuelLevel, 
	 transitionRemoteEngineStartToNormal, 
	 remoteEngineStartRunTimeExpiry, 
	 remoteEngineStartFailure, 
	 remoteEngineStopFailure, 
	 vehicleCommunicationFailed, 
	 userInterruption, 
	 tspReq, 
	 diagRoutine
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
    
    public static TriggerType valueOf(long value)
    {
	return (TriggerType)eCallButton.lookupValue(value);
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
	    "TriggerType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TriggerType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "eCallButton",
		    0
		),
		new MemberListElement (
		    "crashModuleWireInput",
		    1
		),
		new MemberListElement (
		    "crashModuleCanInput",
		    2
		),
		new MemberListElement (
		    "bCallButton",
		    3
		),
		new MemberListElement (
		    "engineOn",
		    4
		),
		new MemberListElement (
		    "engineOff",
		    5
		),
		new MemberListElement (
		    "firstFix",
		    6
		),
		new MemberListElement (
		    "drivenDistanceSinceLastTp",
		    7
		),
		new MemberListElement (
		    "timeSinceLastTp",
		    8
		),
		new MemberListElement (
		    "turnAngleSinceLastTp",
		    9
		),
		new MemberListElement (
		    "firstNwReg",
		    10
		),
		new MemberListElement (
		    "drivenDistanceSinceLastWp",
		    11
		),
		new MemberListElement (
		    "timeSinceLastWp",
		    12
		),
		new MemberListElement (
		    "turnAngleSinceLastWp",
		    13
		),
		new MemberListElement (
		    "lowFuelLevel",
		    14
		),
		new MemberListElement (
		    "transitionRemoteEngineStartToNormal",
		    15
		),
		new MemberListElement (
		    "remoteEngineStartRunTimeExpiry",
		    16
		),
		new MemberListElement (
		    "remoteEngineStartFailure",
		    17
		),
		new MemberListElement (
		    "remoteEngineStopFailure",
		    18
		),
		new MemberListElement (
		    "vehicleCommunicationFailed",
		    19
		),
		new MemberListElement (
		    "userInterruption",
		    20
		),
		new MemberListElement (
		    "tspReq",
		    21
		),
		new MemberListElement (
		    "diagRoutine",
		    22
		)
	    }
	),
	0,
	eCallButton
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TriggerType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TriggerType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TriggerType
