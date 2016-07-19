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
 * Define the ASN1 Type SRSStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class SRSStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SRSStatus()
    {
	super(cFirstNumber);
    }
    
    protected SRSStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long no_srs_info = 0;
	public static final long srs_not_deployed = 1;
	public static final long srs_deployed = 2;
    }
    // Named list definitions.
    public static final SRSStatus no_srs_info =
	new SRSStatus();
    public static final SRSStatus srs_not_deployed =
	new SRSStatus(1);
    public static final SRSStatus srs_deployed =
	new SRSStatus(2);
    private final static SRSStatus cNamedNumbers[] = {
	 no_srs_info, 
	 srs_not_deployed, 
	 srs_deployed
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
    
    public static SRSStatus valueOf(long value)
    {
	return (SRSStatus)no_srs_info.lookupValue(value);
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
	    "SRSStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "SRSStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "no-srs-info",
		    0
		),
		new MemberListElement (
		    "srs-not-deployed",
		    1
		),
		new MemberListElement (
		    "srs-deployed",
		    2
		)
	    }
	),
	0,
	no_srs_info
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SRSStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SRSStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SRSStatus
