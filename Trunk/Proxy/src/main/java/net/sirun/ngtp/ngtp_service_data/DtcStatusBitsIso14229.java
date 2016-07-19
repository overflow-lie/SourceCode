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
 * Define the ASN1 Type DtcStatusBitsIso14229 from ASN1 Module NGTP_Service_Data.
 * @see BitString
 */

public class DtcStatusBitsIso14229 extends BitString {
    
    /**
     * The default constructor.
     */
    public DtcStatusBitsIso14229()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public DtcStatusBitsIso14229(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public DtcStatusBitsIso14229(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    public static final int testFailed = 0;
    public static final int testFailedThisOperationCycle = 1;
    public static final int pendingDTC = 2;
    public static final int confirmedDTC = 3;
    public static final int testNotCompletedSinceLastClear = 4;
    public static final int testFailedSinceLastClear = 5;
    public static final int testNotCompletedThisOperationCycle = 6;
    public static final int warningIndicatorRequested = 7;
    
    /**
     * Initialize the type descriptor.
     */
    private static final BitStringInfo c_typeinfo = new BitStringInfo (
	new Tags (
	    new short[] {
		0x0003
	    }
	),
	new QName (
	    "net.sirun.ngtp.ngtp_service_data",
	    "DtcStatusBitsIso14229"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DtcStatusBitsIso14229"
	),
	12314,
	null,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "testFailed",
		    0
		),
		new MemberListElement (
		    "testFailedThisOperationCycle",
		    1
		),
		new MemberListElement (
		    "pendingDTC",
		    2
		),
		new MemberListElement (
		    "confirmedDTC",
		    3
		),
		new MemberListElement (
		    "testNotCompletedSinceLastClear",
		    4
		),
		new MemberListElement (
		    "testFailedSinceLastClear",
		    5
		),
		new MemberListElement (
		    "testNotCompletedThisOperationCycle",
		    6
		),
		new MemberListElement (
		    "warningIndicatorRequested",
		    7
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DtcStatusBitsIso14229 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DtcStatusBitsIso14229 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DtcStatusBitsIso14229
