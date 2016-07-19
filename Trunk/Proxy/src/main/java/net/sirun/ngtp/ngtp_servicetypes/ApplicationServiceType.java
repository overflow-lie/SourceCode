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


package net.sirun.ngtp.ngtp_servicetypes;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ApplicationServiceType from ASN1 Module NGTP_ServiceTypes.
 * @see Enumerated
 */

public final class ApplicationServiceType extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ApplicationServiceType()
    {
	super(cFirstNumber);
    }
    
    protected ApplicationServiceType(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long control = 0;
	public static final long emergency_call = 1;
	public static final long information_call = 2;
	public static final long info_message = 3;
	public static final long dealer_call = 4;
	public static final long breakdown_call = 5;
	public static final long customer_relations_call = 6;
	public static final long traffic_info = 7;
	public static final long provisioning = 8;
	public static final long customer_relations_call_tsp = 9;
	public static final long automatic_crash_notification = 10;
	public static final long remote_vehicle_status = 11;
	public static final long poi_download = 12;
	public static final long service_notification = 13;
	public static final long theft_notification = 14;
	public static final long vehicle_tracking = 15;
	public static final long remote_vehicle_control = 16;
	public static final long geofence = 17;
	public static final long diagnose = 18;
	public static final long remote_door_unlock = 19;
	public static final long remote_door_lock = 20;
	public static final long remote_hornblow_lightflash = 21;
	public static final long remote_engine_start = 22;
	public static final long remote_engine_stop = 23;
	public static final long vehicle_finder = 24;
	public static final long ror_script_download = 25;
	public static final long dtc_scan = 26;
	public static final long vehicle_report_card = 27;
	public static final long vehicle_health_check = 28;
	public static final long remote_charge_start = 29;
	public static final long remote_charge_stop = 30;
	public static final long charge_profile = 31;
	public static final long ev_notification = 32;
	public static final long ecu_scan = 33;
	public static final long factory_test = 34;
	public static final long remote_vehicle_imobilisation = 35;
	public static final long remote_vehicle_mobilisation = 36;
	public static final long alarm_reset = 37;
	public static final long reduced_guard = 38;
	public static final long heater_start = 39;
	public static final long heater_stop = 40;
	public static final long _generic = 42;
	public static final long drm_sync = 128;
	public static final long registration = 129;
	public static final long performance_report = 130;
	public static final long bootstrapping = 131;
	public static final long tu_upload_logs = 132;
	public static final long journey_log = 133;
    }
    // Named list definitions.
    public static final ApplicationServiceType control =
	new ApplicationServiceType();
    public static final ApplicationServiceType emergency_call =
	new ApplicationServiceType(1);
    public static final ApplicationServiceType information_call =
	new ApplicationServiceType(2);
    public static final ApplicationServiceType info_message =
	new ApplicationServiceType(3);
    public static final ApplicationServiceType dealer_call =
	new ApplicationServiceType(4);
    public static final ApplicationServiceType breakdown_call =
	new ApplicationServiceType(5);
    public static final ApplicationServiceType customer_relations_call =
	new ApplicationServiceType(6);
    public static final ApplicationServiceType traffic_info =
	new ApplicationServiceType(7);
    public static final ApplicationServiceType provisioning =
	new ApplicationServiceType(8);
    public static final ApplicationServiceType customer_relations_call_tsp =
	new ApplicationServiceType(9);
    public static final ApplicationServiceType automatic_crash_notification =
	new ApplicationServiceType(10);
    public static final ApplicationServiceType remote_vehicle_status =
	new ApplicationServiceType(11);
    public static final ApplicationServiceType poi_download =
	new ApplicationServiceType(12);
    public static final ApplicationServiceType service_notification =
	new ApplicationServiceType(13);
    public static final ApplicationServiceType theft_notification =
	new ApplicationServiceType(14);
    public static final ApplicationServiceType vehicle_tracking =
	new ApplicationServiceType(15);
    public static final ApplicationServiceType remote_vehicle_control =
	new ApplicationServiceType(16);
    public static final ApplicationServiceType geofence =
	new ApplicationServiceType(17);
    public static final ApplicationServiceType diagnose =
	new ApplicationServiceType(18);
    public static final ApplicationServiceType remote_door_unlock =
	new ApplicationServiceType(19);
    public static final ApplicationServiceType remote_door_lock =
	new ApplicationServiceType(20);
    public static final ApplicationServiceType remote_hornblow_lightflash =
	new ApplicationServiceType(21);
    public static final ApplicationServiceType remote_engine_start =
	new ApplicationServiceType(22);
    public static final ApplicationServiceType remote_engine_stop =
	new ApplicationServiceType(23);
    public static final ApplicationServiceType vehicle_finder =
	new ApplicationServiceType(24);
    public static final ApplicationServiceType ror_script_download =
	new ApplicationServiceType(25);
    public static final ApplicationServiceType dtc_scan =
	new ApplicationServiceType(26);
    public static final ApplicationServiceType vehicle_report_card =
	new ApplicationServiceType(27);
    public static final ApplicationServiceType vehicle_health_check =
	new ApplicationServiceType(28);
    public static final ApplicationServiceType remote_charge_start =
	new ApplicationServiceType(29);
    public static final ApplicationServiceType remote_charge_stop =
	new ApplicationServiceType(30);
    public static final ApplicationServiceType charge_profile =
	new ApplicationServiceType(31);
    public static final ApplicationServiceType ev_notification =
	new ApplicationServiceType(32);
    public static final ApplicationServiceType ecu_scan =
	new ApplicationServiceType(33);
    public static final ApplicationServiceType factory_test =
	new ApplicationServiceType(34);
    public static final ApplicationServiceType remote_vehicle_imobilisation =
	new ApplicationServiceType(35);
    public static final ApplicationServiceType remote_vehicle_mobilisation =
	new ApplicationServiceType(36);
    public static final ApplicationServiceType alarm_reset =
	new ApplicationServiceType(37);
    public static final ApplicationServiceType reduced_guard =
	new ApplicationServiceType(38);
    public static final ApplicationServiceType heater_start =
	new ApplicationServiceType(39);
    public static final ApplicationServiceType heater_stop =
	new ApplicationServiceType(40);
    public static final ApplicationServiceType _generic =
	new ApplicationServiceType(42);
    public static final ApplicationServiceType drm_sync =
	new ApplicationServiceType(128);
    public static final ApplicationServiceType registration =
	new ApplicationServiceType(129);
    public static final ApplicationServiceType performance_report =
	new ApplicationServiceType(130);
    public static final ApplicationServiceType bootstrapping =
	new ApplicationServiceType(131);
    public static final ApplicationServiceType tu_upload_logs =
	new ApplicationServiceType(132);
    public static final ApplicationServiceType journey_log =
	new ApplicationServiceType(133);
    private final static ApplicationServiceType cNamedNumbers[] = {
	 control, 
	 emergency_call, 
	 information_call, 
	 info_message, 
	 dealer_call, 
	 breakdown_call, 
	 customer_relations_call, 
	 traffic_info, 
	 provisioning, 
	 customer_relations_call_tsp, 
	 automatic_crash_notification, 
	 remote_vehicle_status, 
	 poi_download, 
	 service_notification, 
	 theft_notification, 
	 vehicle_tracking, 
	 remote_vehicle_control, 
	 geofence, 
	 diagnose, 
	 remote_door_unlock, 
	 remote_door_lock, 
	 remote_hornblow_lightflash, 
	 remote_engine_start, 
	 remote_engine_stop, 
	 vehicle_finder, 
	 ror_script_download, 
	 dtc_scan, 
	 vehicle_report_card, 
	 vehicle_health_check, 
	 remote_charge_start, 
	 remote_charge_stop, 
	 charge_profile, 
	 ev_notification, 
	 ecu_scan, 
	 factory_test, 
	 remote_vehicle_imobilisation, 
	 remote_vehicle_mobilisation, 
	 alarm_reset, 
	 reduced_guard, 
	 heater_start, 
	 heater_stop, 
	 _generic, 
	 drm_sync, 
	 registration, 
	 performance_report, 
	 bootstrapping, 
	 tu_upload_logs, 
	 journey_log
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
    
    public static ApplicationServiceType valueOf(long value)
    {
	return (ApplicationServiceType)control.lookupValue(value);
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
	    "net.sirun.ngtp.ngtp_servicetypes",
	    "ApplicationServiceType"
	),
	new QName (
	    "NGTP-ServiceTypes",
	    "ApplicationServiceType"
	),
	12314,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "control",
		    0
		),
		new MemberListElement (
		    "emergency-call",
		    1
		),
		new MemberListElement (
		    "information-call",
		    2
		),
		new MemberListElement (
		    "info-message",
		    3
		),
		new MemberListElement (
		    "dealer-call",
		    4
		),
		new MemberListElement (
		    "breakdown-call",
		    5
		),
		new MemberListElement (
		    "customer-relations-call",
		    6
		),
		new MemberListElement (
		    "traffic-info",
		    7
		),
		new MemberListElement (
		    "provisioning",
		    8
		),
		new MemberListElement (
		    "customer-relations-call-tsp",
		    9
		),
		new MemberListElement (
		    "automatic-crash-notification",
		    10
		),
		new MemberListElement (
		    "remote-vehicle-status",
		    11
		),
		new MemberListElement (
		    "poi-download",
		    12
		),
		new MemberListElement (
		    "service-notification",
		    13
		),
		new MemberListElement (
		    "theft-notification",
		    14
		),
		new MemberListElement (
		    "vehicle-tracking",
		    15
		),
		new MemberListElement (
		    "remote-vehicle-control",
		    16
		),
		new MemberListElement (
		    "geofence",
		    17
		),
		new MemberListElement (
		    "diagnose",
		    18
		),
		new MemberListElement (
		    "remote-door-unlock",
		    19
		),
		new MemberListElement (
		    "remote-door-lock",
		    20
		),
		new MemberListElement (
		    "remote-hornblow-lightflash",
		    21
		),
		new MemberListElement (
		    "remote-engine-start",
		    22
		),
		new MemberListElement (
		    "remote-engine-stop",
		    23
		),
		new MemberListElement (
		    "vehicle-finder",
		    24
		),
		new MemberListElement (
		    "ror-script-download",
		    25
		),
		new MemberListElement (
		    "dtc-scan",
		    26
		),
		new MemberListElement (
		    "vehicle-report-card",
		    27
		),
		new MemberListElement (
		    "vehicle-health-check",
		    28
		),
		new MemberListElement (
		    "remote-charge-start",
		    29
		),
		new MemberListElement (
		    "remote-charge-stop",
		    30
		),
		new MemberListElement (
		    "charge-profile",
		    31
		),
		new MemberListElement (
		    "ev-notification",
		    32
		),
		new MemberListElement (
		    "ecu-scan",
		    33
		),
		new MemberListElement (
		    "factory-test",
		    34
		),
		new MemberListElement (
		    "remote-vehicle-imobilisation",
		    35
		),
		new MemberListElement (
		    "remote-vehicle-mobilisation",
		    36
		),
		new MemberListElement (
		    "alarm-reset",
		    37
		),
		new MemberListElement (
		    "reduced-guard",
		    38
		),
		new MemberListElement (
		    "heater-start",
		    39
		),
		new MemberListElement (
		    "heater-stop",
		    40
		),
		new MemberListElement (
		    "generic",
		    42
		),
		new MemberListElement (
		    "drm-sync",
		    128
		),
		new MemberListElement (
		    "registration",
		    129
		),
		new MemberListElement (
		    "performance-report",
		    130
		),
		new MemberListElement (
		    "bootstrapping",
		    131
		),
		new MemberListElement (
		    "tu-upload-logs",
		    132
		),
		new MemberListElement (
		    "journey-log",
		    133
		)
	    }
	),
	0,
	control
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ApplicationServiceType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ApplicationServiceType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for ApplicationServiceType
