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
 * Define the ASN1 Type JourneySummary2 from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class JourneySummary2 extends Sequence {
    
    /**
     * The default constructor.
     */
    public JourneySummary2()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public JourneySummary2(CollectionId journeyId, 
		    DashboardUnits dashboardUnits, INTEGER avgFuelConsx10, 
		    INTEGER distancex10, INTEGER avgSpd, INTEGER ecoStopTimer, 
		    INTEGER engineOffPerc, INTEGER electricAssistPerc, 
		    INTEGER energyRecoveredx10, INTEGER throttleEcoScorex10, 
		    INTEGER speedEcoScorex10, INTEGER brakeEcoScorex10, 
		    INTEGER totalEcoScorex10, TimeStamp startTime)
    {
	setJourneyId(journeyId);
	setDashboardUnits(dashboardUnits);
	setAvgFuelConsx10(avgFuelConsx10);
	setDistancex10(distancex10);
	setAvgSpd(avgSpd);
	setEcoStopTimer(ecoStopTimer);
	setEngineOffPerc(engineOffPerc);
	setElectricAssistPerc(electricAssistPerc);
	setEnergyRecoveredx10(energyRecoveredx10);
	setThrottleEcoScorex10(throttleEcoScorex10);
	setSpeedEcoScorex10(speedEcoScorex10);
	setBrakeEcoScorex10(brakeEcoScorex10);
	setTotalEcoScorex10(totalEcoScorex10);
	setStartTime(startTime);
    }
    
    /**
     * Construct with components.
     */
    public JourneySummary2(CollectionId journeyId, 
		    DashboardUnits dashboardUnits, long avgFuelConsx10, 
		    long distancex10, long avgSpd, long ecoStopTimer, 
		    long engineOffPerc, long electricAssistPerc, 
		    long energyRecoveredx10, long throttleEcoScorex10, 
		    long speedEcoScorex10, long brakeEcoScorex10, 
		    long totalEcoScorex10, TimeStamp startTime)
    {
	this(journeyId, dashboardUnits, new INTEGER(avgFuelConsx10), 
	     new INTEGER(distancex10), new INTEGER(avgSpd), 
	     new INTEGER(ecoStopTimer), new INTEGER(engineOffPerc), 
	     new INTEGER(electricAssistPerc), 
	     new INTEGER(energyRecoveredx10), 
	     new INTEGER(throttleEcoScorex10), 
	     new INTEGER(speedEcoScorex10), new INTEGER(brakeEcoScorex10), 
	     new INTEGER(totalEcoScorex10), startTime);
    }
    
    /**
     * Construct with required components.
     */
    public JourneySummary2(DashboardUnits dashboardUnits, long avgFuelConsx10, 
		    long distancex10, long avgSpd, long ecoStopTimer, 
		    long throttleEcoScorex10, long speedEcoScorex10, 
		    long brakeEcoScorex10, long totalEcoScorex10)
    {
	setDashboardUnits(dashboardUnits);
	setAvgFuelConsx10(avgFuelConsx10);
	setDistancex10(distancex10);
	setAvgSpd(avgSpd);
	setEcoStopTimer(ecoStopTimer);
	setThrottleEcoScorex10(throttleEcoScorex10);
	setSpeedEcoScorex10(speedEcoScorex10);
	setBrakeEcoScorex10(brakeEcoScorex10);
	setTotalEcoScorex10(totalEcoScorex10);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CollectionId();
	mComponents[1] = DashboardUnits.miles_per_gallon;
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
	mComponents[9] = new INTEGER();
	mComponents[10] = new INTEGER();
	mComponents[11] = new INTEGER();
	mComponents[12] = new INTEGER();
	mComponents[13] = new TimeStamp();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[14];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CollectionId();
	    case 1:
		return DashboardUnits.miles_per_gallon;
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    case 9:
		return new INTEGER();
	    case 10:
		return new INTEGER();
	    case 11:
		return new INTEGER();
	    case 12:
		return new INTEGER();
	    case 13:
		return new TimeStamp();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "journeyId"
    public CollectionId getJourneyId()
    {
	return (CollectionId)mComponents[0];
    }
    
    public void setJourneyId(CollectionId journeyId)
    {
	mComponents[0] = journeyId;
    }
    
    public boolean hasJourneyId()
    {
	return componentIsPresent(0);
    }
    
    public void deleteJourneyId()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "dashboardUnits"
    public DashboardUnits getDashboardUnits()
    {
	return (DashboardUnits)mComponents[1];
    }
    
    public void setDashboardUnits(DashboardUnits dashboardUnits)
    {
	mComponents[1] = dashboardUnits;
    }
    
    
    // Methods for field "avgFuelConsx10"
    public long getAvgFuelConsx10()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setAvgFuelConsx10(long avgFuelConsx10)
    {
	setAvgFuelConsx10(new INTEGER(avgFuelConsx10));
    }
    
    public void setAvgFuelConsx10(INTEGER avgFuelConsx10)
    {
	mComponents[2] = avgFuelConsx10;
    }
    
    
    // Methods for field "distancex10"
    public long getDistancex10()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setDistancex10(long distancex10)
    {
	setDistancex10(new INTEGER(distancex10));
    }
    
    public void setDistancex10(INTEGER distancex10)
    {
	mComponents[3] = distancex10;
    }
    
    
    // Methods for field "avgSpd"
    public long getAvgSpd()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setAvgSpd(long avgSpd)
    {
	setAvgSpd(new INTEGER(avgSpd));
    }
    
    public void setAvgSpd(INTEGER avgSpd)
    {
	mComponents[4] = avgSpd;
    }
    
    
    // Methods for field "ecoStopTimer"
    public long getEcoStopTimer()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setEcoStopTimer(long ecoStopTimer)
    {
	setEcoStopTimer(new INTEGER(ecoStopTimer));
    }
    
    public void setEcoStopTimer(INTEGER ecoStopTimer)
    {
	mComponents[5] = ecoStopTimer;
    }
    
    
    // Methods for field "engineOffPerc"
    public long getEngineOffPerc()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setEngineOffPerc(long engineOffPerc)
    {
	setEngineOffPerc(new INTEGER(engineOffPerc));
    }
    
    public void setEngineOffPerc(INTEGER engineOffPerc)
    {
	mComponents[6] = engineOffPerc;
    }
    
    public boolean hasEngineOffPerc()
    {
	return componentIsPresent(6);
    }
    
    public void deleteEngineOffPerc()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "electricAssistPerc"
    public long getElectricAssistPerc()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setElectricAssistPerc(long electricAssistPerc)
    {
	setElectricAssistPerc(new INTEGER(electricAssistPerc));
    }
    
    public void setElectricAssistPerc(INTEGER electricAssistPerc)
    {
	mComponents[7] = electricAssistPerc;
    }
    
    public boolean hasElectricAssistPerc()
    {
	return componentIsPresent(7);
    }
    
    public void deleteElectricAssistPerc()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "energyRecoveredx10"
    public long getEnergyRecoveredx10()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setEnergyRecoveredx10(long energyRecoveredx10)
    {
	setEnergyRecoveredx10(new INTEGER(energyRecoveredx10));
    }
    
    public void setEnergyRecoveredx10(INTEGER energyRecoveredx10)
    {
	mComponents[8] = energyRecoveredx10;
    }
    
    public boolean hasEnergyRecoveredx10()
    {
	return componentIsPresent(8);
    }
    
    public void deleteEnergyRecoveredx10()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "throttleEcoScorex10"
    public long getThrottleEcoScorex10()
    {
	return ((INTEGER)mComponents[9]).longValue();
    }
    
    public void setThrottleEcoScorex10(long throttleEcoScorex10)
    {
	setThrottleEcoScorex10(new INTEGER(throttleEcoScorex10));
    }
    
    public void setThrottleEcoScorex10(INTEGER throttleEcoScorex10)
    {
	mComponents[9] = throttleEcoScorex10;
    }
    
    
    // Methods for field "speedEcoScorex10"
    public long getSpeedEcoScorex10()
    {
	return ((INTEGER)mComponents[10]).longValue();
    }
    
    public void setSpeedEcoScorex10(long speedEcoScorex10)
    {
	setSpeedEcoScorex10(new INTEGER(speedEcoScorex10));
    }
    
    public void setSpeedEcoScorex10(INTEGER speedEcoScorex10)
    {
	mComponents[10] = speedEcoScorex10;
    }
    
    
    // Methods for field "brakeEcoScorex10"
    public long getBrakeEcoScorex10()
    {
	return ((INTEGER)mComponents[11]).longValue();
    }
    
    public void setBrakeEcoScorex10(long brakeEcoScorex10)
    {
	setBrakeEcoScorex10(new INTEGER(brakeEcoScorex10));
    }
    
    public void setBrakeEcoScorex10(INTEGER brakeEcoScorex10)
    {
	mComponents[11] = brakeEcoScorex10;
    }
    
    
    // Methods for field "totalEcoScorex10"
    public long getTotalEcoScorex10()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setTotalEcoScorex10(long totalEcoScorex10)
    {
	setTotalEcoScorex10(new INTEGER(totalEcoScorex10));
    }
    
    public void setTotalEcoScorex10(INTEGER totalEcoScorex10)
    {
	mComponents[12] = totalEcoScorex10;
    }
    
    
    // Methods for field "startTime"
    public TimeStamp getStartTime()
    {
	return (TimeStamp)mComponents[13];
    }
    
    public void setStartTime(TimeStamp startTime)
    {
	mComponents[13] = startTime;
    }
    
    public boolean hasStartTime()
    {
	return componentIsPresent(13);
    }
    
    public void deleteStartTime()
    {
	setComponentAbsent(13);
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "net.sirun.ngtp.ngtp_service_data",
	    "JourneySummary2"
	),
	new QName (
	    "NGTP-Service-Data",
	    "JourneySummary2"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"CollectionId"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"CollectionId"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new CollectionId(0), 
				    new CollectionId(255),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(255)
			    ),
			    null
			)
		    ),
		    "journeyId",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"DashboardUnits"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DashboardUnits"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"miles_per_gallon",
					0
				    ),
				    new MemberListElement (
					"miles_per_hour",
					1
				    ),
				    new MemberListElement (
					"miles_per_liter",
					2
				    ),
				    new MemberListElement (
					"km_per_liter",
					3
				    ),
				    new MemberListElement (
					"liter_per_100km",
					4
				    ),
				    new MemberListElement (
					"unknown",
					5
				    )
				}
			    ),
			    0,
			    DashboardUnits.miles_per_gallon
			)
		    ),
		    "dashboardUnits",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "avgFuelConsx10",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "distancex10",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(511),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    ),
			    null
			)
		    ),
		    "avgSpd",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "ecoStopTimer",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "engineOffPerc",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "electricAssistPerc",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "energyRecoveredx10",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "throttleEcoScorex10",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "speedEcoScorex10",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "brakeEcoScorex10",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "totalEcoScorex10",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TimeStamp"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TimeStamp"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0
			)
		    ),
		    "startTime",
		    13,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' JourneySummary2 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' JourneySummary2 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for JourneySummary2
