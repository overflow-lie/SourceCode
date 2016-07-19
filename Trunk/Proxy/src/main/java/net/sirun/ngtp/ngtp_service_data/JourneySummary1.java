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
 * Define the ASN1 Type JourneySummary1 from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class JourneySummary1 extends Sequence {
    
    /**
     * The default constructor.
     */
    public JourneySummary1()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public JourneySummary1(CollectionId journeyId, TriggerType startTrigger, 
		    TimeStamp startTime, OdometerData startOdometer, 
		    BasicPosition firstPosition, INTEGER firstPosDist, 
		    TriggerType endTrigger, TimeStamp endTime, 
		    OdometerData endOdometer, BasicPosition endPosition, 
		    AvgFuelConsumptionCl avgFuelConsCl, OctetString userNote, 
		    TripType tripType)
    {
	setJourneyId(journeyId);
	setStartTrigger(startTrigger);
	setStartTime(startTime);
	setStartOdometer(startOdometer);
	setFirstPosition(firstPosition);
	setFirstPosDist(firstPosDist);
	setEndTrigger(endTrigger);
	setEndTime(endTime);
	setEndOdometer(endOdometer);
	setEndPosition(endPosition);
	setAvgFuelConsCl(avgFuelConsCl);
	setUserNote(userNote);
	setTripType(tripType);
    }
    
    /**
     * Construct with components.
     */
    public JourneySummary1(CollectionId journeyId, TriggerType startTrigger, 
		    TimeStamp startTime, OdometerData startOdometer, 
		    BasicPosition firstPosition, long firstPosDist, 
		    TriggerType endTrigger, TimeStamp endTime, 
		    OdometerData endOdometer, BasicPosition endPosition, 
		    AvgFuelConsumptionCl avgFuelConsCl, OctetString userNote, 
		    TripType tripType)
    {
	this(journeyId, startTrigger, startTime, startOdometer, 
	     firstPosition, new INTEGER(firstPosDist), endTrigger, 
	     endTime, endOdometer, endPosition, avgFuelConsCl, userNote, 
	     tripType);
    }
    
    /**
     * Construct with required components.
     */
    public JourneySummary1(CollectionId journeyId, TriggerType startTrigger, 
		    TimeStamp startTime, OdometerData startOdometer, 
		    BasicPosition firstPosition, long firstPosDist, 
		    TriggerType endTrigger, TimeStamp endTime, 
		    OdometerData endOdometer, BasicPosition endPosition)
    {
	setJourneyId(journeyId);
	setStartTrigger(startTrigger);
	setStartTime(startTime);
	setStartOdometer(startOdometer);
	setFirstPosition(firstPosition);
	setFirstPosDist(firstPosDist);
	setEndTrigger(endTrigger);
	setEndTime(endTime);
	setEndOdometer(endOdometer);
	setEndPosition(endPosition);
    }
    
    public void initComponents()
    {
	mComponents[0] = new CollectionId();
	mComponents[1] = TriggerType.eCallButton;
	mComponents[2] = new TimeStamp();
	mComponents[3] = new OdometerData();
	mComponents[4] = new BasicPosition();
	mComponents[5] = new INTEGER();
	mComponents[6] = TriggerType.eCallButton;
	mComponents[7] = new TimeStamp();
	mComponents[8] = new OdometerData();
	mComponents[9] = new BasicPosition();
	mComponents[10] = new AvgFuelConsumptionCl();
	mComponents[11] = new OctetString();
	mComponents[12] = TripType._private;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[13];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new CollectionId();
	    case 1:
		return TriggerType.eCallButton;
	    case 2:
		return new TimeStamp();
	    case 3:
		return new OdometerData();
	    case 4:
		return new BasicPosition();
	    case 5:
		return new INTEGER();
	    case 6:
		return TriggerType.eCallButton;
	    case 7:
		return new TimeStamp();
	    case 8:
		return new OdometerData();
	    case 9:
		return new BasicPosition();
	    case 10:
		return new AvgFuelConsumptionCl();
	    case 11:
		return new OctetString();
	    case 12:
		return TripType._private;
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
    
    
    // Methods for field "startTrigger"
    public TriggerType getStartTrigger()
    {
	return (TriggerType)mComponents[1];
    }
    
    public void setStartTrigger(TriggerType startTrigger)
    {
	mComponents[1] = startTrigger;
    }
    
    
    // Methods for field "startTime"
    public TimeStamp getStartTime()
    {
	return (TimeStamp)mComponents[2];
    }
    
    public void setStartTime(TimeStamp startTime)
    {
	mComponents[2] = startTime;
    }
    
    
    // Methods for field "startOdometer"
    public OdometerData getStartOdometer()
    {
	return (OdometerData)mComponents[3];
    }
    
    public void setStartOdometer(OdometerData startOdometer)
    {
	mComponents[3] = startOdometer;
    }
    
    
    // Methods for field "firstPosition"
    public BasicPosition getFirstPosition()
    {
	return (BasicPosition)mComponents[4];
    }
    
    public void setFirstPosition(BasicPosition firstPosition)
    {
	mComponents[4] = firstPosition;
    }
    
    
    // Methods for field "firstPosDist"
    public long getFirstPosDist()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setFirstPosDist(long firstPosDist)
    {
	setFirstPosDist(new INTEGER(firstPosDist));
    }
    
    public void setFirstPosDist(INTEGER firstPosDist)
    {
	mComponents[5] = firstPosDist;
    }
    
    
    // Methods for field "endTrigger"
    public TriggerType getEndTrigger()
    {
	return (TriggerType)mComponents[6];
    }
    
    public void setEndTrigger(TriggerType endTrigger)
    {
	mComponents[6] = endTrigger;
    }
    
    
    // Methods for field "endTime"
    public TimeStamp getEndTime()
    {
	return (TimeStamp)mComponents[7];
    }
    
    public void setEndTime(TimeStamp endTime)
    {
	mComponents[7] = endTime;
    }
    
    
    // Methods for field "endOdometer"
    public OdometerData getEndOdometer()
    {
	return (OdometerData)mComponents[8];
    }
    
    public void setEndOdometer(OdometerData endOdometer)
    {
	mComponents[8] = endOdometer;
    }
    
    
    // Methods for field "endPosition"
    public BasicPosition getEndPosition()
    {
	return (BasicPosition)mComponents[9];
    }
    
    public void setEndPosition(BasicPosition endPosition)
    {
	mComponents[9] = endPosition;
    }
    
    
    // Methods for field "avgFuelConsCl"
    public AvgFuelConsumptionCl getAvgFuelConsCl()
    {
	return (AvgFuelConsumptionCl)mComponents[10];
    }
    
    public void setAvgFuelConsCl(AvgFuelConsumptionCl avgFuelConsCl)
    {
	mComponents[10] = avgFuelConsCl;
    }
    
    public boolean hasAvgFuelConsCl()
    {
	return componentIsPresent(10);
    }
    
    public void deleteAvgFuelConsCl()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "userNote"
    public OctetString getUserNote()
    {
	return (OctetString)mComponents[11];
    }
    
    public void setUserNote(OctetString userNote)
    {
	mComponents[11] = userNote;
    }
    
    public boolean hasUserNote()
    {
	return componentIsPresent(11);
    }
    
    public void deleteUserNote()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "tripType"
    public TripType getTripType()
    {
	return (TripType)mComponents[12];
    }
    
    public void setTripType(TripType tripType)
    {
	mComponents[12] = tripType;
    }
    
    public boolean hasTripType()
    {
	return componentIsPresent(12);
    }
    
    public void deleteTripType()
    {
	setComponentAbsent(12);
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
	    "JourneySummary1"
	),
	new QName (
	    "NGTP-Service-Data",
	    "JourneySummary1"
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
		    2,
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
			    TriggerType.eCallButton
			)
		    ),
		    "startTrigger",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"OdometerData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"OdometerData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0
			)
		    ),
		    "startOdometer",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BasicPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0
			)
		    ),
		    "firstPosition",
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "firstPosDist",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
			    TriggerType.eCallButton
			)
		    ),
		    "endTrigger",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "endTime",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"OdometerData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"OdometerData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0
			)
		    ),
		    "endOdometer",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BasicPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0
			)
		    ),
		    "endPosition",
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
				"net.sirun.ngtp.ngtp_service_data",
				"AvgFuelConsumptionCl"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"AvgFuelConsumptionCl"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AvgFuelConsumptionCl(0), 
				    new AvgFuelConsumptionCl(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "avgFuelConsCl",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(63),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    )
			)
		    ),
		    "userNote",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TripType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TripType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"private",
					0
				    ),
				    new MemberListElement (
					"business",
					1
				    )
				}
			    ),
			    0,
			    TripType._private
			)
		    ),
		    "tripType",
		    12,
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
			new TagDecoderElement((short)0x8000, 0)
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
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' JourneySummary1 object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' JourneySummary1 object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for JourneySummary1
