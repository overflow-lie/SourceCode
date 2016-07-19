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
 * Define the ASN1 Type NetworkType from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class NetworkType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private NetworkType()
    {
	super(cFirstNumber);
    }
    
    protected NetworkType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long isdn_speech = 1;
	public static final long isdn_data = 2;
	public static final long gsm_speech = 3;
	public static final long gsm_sms = 4;
	public static final long gsm_bs24 = 5;
	public static final long gsm_gprs = 6;
	public static final long x_25 = 7;
	public static final long x_400_e_mail = 8;
	public static final long internet_e_mail = 9;
	public static final long reserved1 = 10;
	public static final long tcp_ip = 11;
	public static final long udp_ip = 12;
	public static final long fax_group_2_3 = 13;
	public static final long fax_group_4 = 14;
	public static final long gsm_bs_26 = 15;
	public static final long gsm_bs_26_udi = 16;
	public static final long gsm_speech_uus = 17;
	public static final long reserved = 31;
    }
    // Named list definitions.
    public static final NetworkType unknown =
	new NetworkType();
    public static final NetworkType isdn_speech =
	new NetworkType(1);
    public static final NetworkType isdn_data =
	new NetworkType(2);
    public static final NetworkType gsm_speech =
	new NetworkType(3);
    public static final NetworkType gsm_sms =
	new NetworkType(4);
    public static final NetworkType gsm_bs24 =
	new NetworkType(5);
    public static final NetworkType gsm_gprs =
	new NetworkType(6);
    public static final NetworkType x_25 =
	new NetworkType(7);
    public static final NetworkType x_400_e_mail =
	new NetworkType(8);
    public static final NetworkType internet_e_mail =
	new NetworkType(9);
    public static final NetworkType reserved1 =
	new NetworkType(10);
    public static final NetworkType tcp_ip =
	new NetworkType(11);
    public static final NetworkType udp_ip =
	new NetworkType(12);
    public static final NetworkType fax_group_2_3 =
	new NetworkType(13);
    public static final NetworkType fax_group_4 =
	new NetworkType(14);
    public static final NetworkType gsm_bs_26 =
	new NetworkType(15);
    public static final NetworkType gsm_bs_26_udi =
	new NetworkType(16);
    public static final NetworkType gsm_speech_uus =
	new NetworkType(17);
    public static final NetworkType reserved =
	new NetworkType(31);
    private final static NetworkType cNamedNumbers[] = {
	 unknown, 
	 isdn_speech, 
	 isdn_data, 
	 gsm_speech, 
	 gsm_sms, 
	 gsm_bs24, 
	 gsm_gprs, 
	 x_25, 
	 x_400_e_mail, 
	 internet_e_mail, 
	 reserved1, 
	 tcp_ip, 
	 udp_ip, 
	 fax_group_2_3, 
	 fax_group_4, 
	 gsm_bs_26, 
	 gsm_bs_26_udi, 
	 gsm_speech_uus, 
	 reserved
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
    
    public static NetworkType valueOf(long value)
    {
	return (NetworkType)unknown.lookupValue(value);
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
	    "NetworkType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NetworkType"
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
		    "isdn-speech",
		    1
		),
		new MemberListElement (
		    "isdn-data",
		    2
		),
		new MemberListElement (
		    "gsm-speech",
		    3
		),
		new MemberListElement (
		    "gsm-sms",
		    4
		),
		new MemberListElement (
		    "gsm-bs24",
		    5
		),
		new MemberListElement (
		    "gsm-gprs",
		    6
		),
		new MemberListElement (
		    "x-25",
		    7
		),
		new MemberListElement (
		    "x-400-e-mail",
		    8
		),
		new MemberListElement (
		    "internet-e-mail",
		    9
		),
		new MemberListElement (
		    "reserved1",
		    10
		),
		new MemberListElement (
		    "tcp-ip",
		    11
		),
		new MemberListElement (
		    "udp-ip",
		    12
		),
		new MemberListElement (
		    "fax-group-2-3",
		    13
		),
		new MemberListElement (
		    "fax-group-4",
		    14
		),
		new MemberListElement (
		    "gsm-bs-26",
		    15
		),
		new MemberListElement (
		    "gsm-bs-26-udi",
		    16
		),
		new MemberListElement (
		    "gsm-speech-uus",
		    17
		),
		new MemberListElement (
		    "reserved",
		    31
		)
	    }
	),
	0,
	unknown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NetworkType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NetworkType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NetworkType
