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
 * Define the ASN1 Type NGTPDispatcherDataCommon from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class NGTPDispatcherDataCommon extends Sequence {
    
    /**
     * The default constructor.
     */
    public NGTPDispatcherDataCommon()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NGTPDispatcherDataCommon(EventInitiator eventInitiator, 
		    TimeStamp eventCreationTime, INTEGER serviceType, 
		    DSPTMessageType messageType, BOOLEAN dsptAckRequired, 
		    BOOLEAN statelessNGTPmessage, 
		    MobileDeviceIdentifier mobileId, OctetString challenge)
    {
	setEventInitiator(eventInitiator);
	setEventCreationTime(eventCreationTime);
	setServiceType(serviceType);
	setMessageType(messageType);
	setDsptAckRequired(dsptAckRequired);
	setStatelessNGTPmessage(statelessNGTPmessage);
	setMobileId(mobileId);
	setChallenge(challenge);
    }
    
    /**
     * Construct with components.
     */
    public NGTPDispatcherDataCommon(EventInitiator eventInitiator, 
		    TimeStamp eventCreationTime, long serviceType, 
		    DSPTMessageType messageType, boolean dsptAckRequired, 
		    boolean statelessNGTPmessage, 
		    MobileDeviceIdentifier mobileId, OctetString challenge)
    {
	this(eventInitiator, eventCreationTime, new INTEGER(serviceType), 
	     messageType, new BOOLEAN(dsptAckRequired), 
	     new BOOLEAN(statelessNGTPmessage), mobileId, challenge);
    }
    
    /**
     * Construct with required components.
     */
    public NGTPDispatcherDataCommon(EventInitiator eventInitiator, 
		    TimeStamp eventCreationTime, long serviceType, 
		    DSPTMessageType messageType, boolean dsptAckRequired, 
		    boolean statelessNGTPmessage)
    {
	setEventInitiator(eventInitiator);
	setEventCreationTime(eventCreationTime);
	setServiceType(serviceType);
	setMessageType(messageType);
	setDsptAckRequired(dsptAckRequired);
	setStatelessNGTPmessage(statelessNGTPmessage);
    }
    
    public void initComponents()
    {
	mComponents[0] = EventInitiator.tu;
	mComponents[1] = new TimeStamp();
	mComponents[2] = new INTEGER();
	mComponents[3] = DSPTMessageType.error;
	mComponents[4] = new BOOLEAN();
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new MobileDeviceIdentifier();
	mComponents[7] = new OctetString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return EventInitiator.tu;
	    case 1:
		return new TimeStamp();
	    case 2:
		return new INTEGER();
	    case 3:
		return DSPTMessageType.error;
	    case 4:
		return new BOOLEAN();
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new MobileDeviceIdentifier();
	    case 7:
		return new OctetString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "eventInitiator"
    public EventInitiator getEventInitiator()
    {
	return (EventInitiator)mComponents[0];
    }
    
    public void setEventInitiator(EventInitiator eventInitiator)
    {
	mComponents[0] = eventInitiator;
    }
    
    
    // Methods for field "eventCreationTime"
    public TimeStamp getEventCreationTime()
    {
	return (TimeStamp)mComponents[1];
    }
    
    public void setEventCreationTime(TimeStamp eventCreationTime)
    {
	mComponents[1] = eventCreationTime;
    }
    
    
    // Methods for field "serviceType"
    public long getServiceType()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setServiceType(long serviceType)
    {
	setServiceType(new INTEGER(serviceType));
    }
    
    public void setServiceType(INTEGER serviceType)
    {
	mComponents[2] = serviceType;
    }
    
    
    // Methods for field "messageType"
    public DSPTMessageType getMessageType()
    {
	return (DSPTMessageType)mComponents[3];
    }
    
    public void setMessageType(DSPTMessageType messageType)
    {
	mComponents[3] = messageType;
    }
    
    
    // Methods for field "dsptAckRequired"
    public boolean getDsptAckRequired()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setDsptAckRequired(boolean dsptAckRequired)
    {
	setDsptAckRequired(new BOOLEAN(dsptAckRequired));
    }
    
    public void setDsptAckRequired(BOOLEAN dsptAckRequired)
    {
	mComponents[4] = dsptAckRequired;
    }
    
    
    // Methods for field "statelessNGTPmessage"
    public boolean getStatelessNGTPmessage()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setStatelessNGTPmessage(boolean statelessNGTPmessage)
    {
	setStatelessNGTPmessage(new BOOLEAN(statelessNGTPmessage));
    }
    
    public void setStatelessNGTPmessage(BOOLEAN statelessNGTPmessage)
    {
	mComponents[5] = statelessNGTPmessage;
    }
    
    
    // Methods for field "mobileId"
    public MobileDeviceIdentifier getMobileId()
    {
	return (MobileDeviceIdentifier)mComponents[6];
    }
    
    public void setMobileId(MobileDeviceIdentifier mobileId)
    {
	mComponents[6] = mobileId;
    }
    
    public boolean hasMobileId()
    {
	return componentIsPresent(6);
    }
    
    public void deleteMobileId()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "challenge"
    public OctetString getChallenge()
    {
	return (OctetString)mComponents[7];
    }
    
    public void setChallenge(OctetString challenge)
    {
	mComponents[7] = challenge;
    }
    
    public boolean hasChallenge()
    {
	return componentIsPresent(7);
    }
    
    public void deleteChallenge()
    {
	setComponentAbsent(7);
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "NGTPDispatcherDataCommon"
	),
	new QName (
	    "NGTP-Dispatch",
	    "NGTPDispatcherDataCommon"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
			    EventInitiator.tu
			)
		    ),
		    "eventInitiator",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_dispatch",
				"TimeStamp"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"TimeStamp"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "TimeStamp"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "TimeStamp"
				)
			    ),
			    0
			)
		    ),
		    "eventCreationTime",
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
				    new com.oss.asn1.INTEGER(255),
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
		    "serviceType",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_dispatch",
				"DSPTMessageType"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"DSPTMessageType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"error",
					0
				    ),
				    new MemberListElement (
					"crqm",
					1
				    ),
				    new MemberListElement (
					"upServiceData",
					2
				    ),
				    new MemberListElement (
					"downServiceData",
					3
				    ),
				    new MemberListElement (
					"dsptAck",
					4
				    ),
				    new MemberListElement (
					"notification",
					5
				    ),
				    new MemberListElement (
					"terminateVoice",
					6
				    ),
				    new MemberListElement (
					"terminateEvent",
					7
				    ),
				    new MemberListElement (
					"prepareForTerminate",
					8
				    ),
				    new MemberListElement (
					"challenge",
					9
				    ),
				    new MemberListElement (
					"chRespServiceData",
					10
				    )
				}
			    ),
			    0,
			    DSPTMessageType.error
			)
		    ),
		    "messageType",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "dsptAckRequired",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "statelessNGTPmessage",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_dispatch",
				"MobileDeviceIdentifier"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"MobileDeviceIdentifier"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MobileDeviceIdentifier"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MobileDeviceIdentifier"
				)
			    ),
			    0
			)
		    ),
		    "mobileId",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
				new SingleValueConstraint (
				    new com.oss.asn1.INTEGER(6)
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(6)
			    )
			)
		    ),
		    "challenge",
		    7,
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
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NGTPDispatcherDataCommon object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPDispatcherDataCommon object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NGTPDispatcherDataCommon
