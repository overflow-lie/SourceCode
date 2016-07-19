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
 * Define the ASN1 Type TheftAlarmStatus from ASN1 Module NGTP_Service_Data.
 * @see Enumerated
 */

public final class TheftAlarmStatus extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TheftAlarmStatus()
    {
	super(cFirstNumber);
    }
    
    protected TheftAlarmStatus(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long no_alarm_info = 0;
	public static final long alarm_off = 1;
	public static final long alarm_armed = 2;
	public static final long alarm_trig = 3;
	public static final long alarm_trig_mms = 4;
	public static final long alarm_trig_is = 5;
	public static final long sensor_fault = 7;
    }
    // Named list definitions.
    public static final TheftAlarmStatus no_alarm_info =
	new TheftAlarmStatus();
    public static final TheftAlarmStatus alarm_off =
	new TheftAlarmStatus(1);
    public static final TheftAlarmStatus alarm_armed =
	new TheftAlarmStatus(2);
    public static final TheftAlarmStatus alarm_trig =
	new TheftAlarmStatus(3);
    public static final TheftAlarmStatus alarm_trig_mms =
	new TheftAlarmStatus(4);
    public static final TheftAlarmStatus alarm_trig_is =
	new TheftAlarmStatus(5);
    public static final TheftAlarmStatus sensor_fault =
	new TheftAlarmStatus(7);
    private final static TheftAlarmStatus cNamedNumbers[] = {
	 no_alarm_info, 
	 alarm_off, 
	 alarm_armed, 
	 alarm_trig, 
	 alarm_trig_mms, 
	 alarm_trig_is, 
	 sensor_fault
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
    
    public static TheftAlarmStatus valueOf(long value)
    {
	return (TheftAlarmStatus)no_alarm_info.lookupValue(value);
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
	    "TheftAlarmStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TheftAlarmStatus"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "no-alarm-info",
		    0
		),
		new MemberListElement (
		    "alarm-off",
		    1
		),
		new MemberListElement (
		    "alarm-armed",
		    2
		),
		new MemberListElement (
		    "alarm-trig",
		    3
		),
		new MemberListElement (
		    "alarm-trig-mms",
		    4
		),
		new MemberListElement (
		    "alarm-trig-is",
		    5
		),
		new MemberListElement (
		    "sensor-fault",
		    7
		)
	    }
	),
	0,
	no_alarm_info
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TheftAlarmStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TheftAlarmStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TheftAlarmStatus
