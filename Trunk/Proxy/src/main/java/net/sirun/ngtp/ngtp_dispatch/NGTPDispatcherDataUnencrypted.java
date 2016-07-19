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
 * Define the ASN1 Type NGTPDispatcherDataUnencrypted from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class NGTPDispatcherDataUnencrypted extends Sequence {
    
    /**
     * The default constructor.
     */
    public NGTPDispatcherDataUnencrypted()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NGTPDispatcherDataUnencrypted(TimeStamp messageCreationTime, 
		    INTEGER messageTimeToLive, MessageCounter msgCounter, 
		    VehicleIdentification vehicleIdentification, 
		    PrintableString deviceIdentification)
    {
	setMessageCreationTime(messageCreationTime);
	setMessageTimeToLive(messageTimeToLive);
	setMsgCounter(msgCounter);
	setVehicleIdentification(vehicleIdentification);
	setDeviceIdentification(deviceIdentification);
	
    }
    
    /**
     * Construct with components.
     */
    public NGTPDispatcherDataUnencrypted(TimeStamp messageCreationTime, 
		    long messageTimeToLive, MessageCounter msgCounter, 
		    VehicleIdentification vehicleIdentification, 
		    PrintableString deviceIdentification)
    {
	this(messageCreationTime, new INTEGER(messageTimeToLive), 
	     msgCounter, vehicleIdentification, deviceIdentification);
    }
    
    /**
     * Construct with required components.
     */
    public NGTPDispatcherDataUnencrypted(TimeStamp messageCreationTime, 
		    long messageTimeToLive, MessageCounter msgCounter, 
		    VehicleIdentification vehicleIdentification)
    {
	setMessageCreationTime(messageCreationTime);
	setMessageTimeToLive(messageTimeToLive);
	setMsgCounter(msgCounter);
	setVehicleIdentification(vehicleIdentification);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeStamp();
	mComponents[1] = new INTEGER();
	mComponents[2] = new MessageCounter();
	mComponents[3] = new VehicleIdentification();
	mComponents[4] = new PrintableString();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TimeStamp();
	    case 1:
		return new INTEGER();
	    case 2:
		return new MessageCounter();
	    case 3:
		return new VehicleIdentification();
	    case 4:
		return new PrintableString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "messageCreationTime"
    public TimeStamp getMessageCreationTime()
    {
	return (TimeStamp)mComponents[0];
    }
    
    public void setMessageCreationTime(TimeStamp messageCreationTime)
    {
	mComponents[0] = messageCreationTime;
    }
    
    
    // Methods for field "messageTimeToLive"
    public long getMessageTimeToLive()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setMessageTimeToLive(long messageTimeToLive)
    {
	setMessageTimeToLive(new INTEGER(messageTimeToLive));
    }
    
    public void setMessageTimeToLive(INTEGER messageTimeToLive)
    {
	mComponents[1] = messageTimeToLive;
    }
    
    
    // Methods for field "msgCounter"
    public MessageCounter getMsgCounter()
    {
	return (MessageCounter)mComponents[2];
    }
    
    public void setMsgCounter(MessageCounter msgCounter)
    {
	mComponents[2] = msgCounter;
    }
    
    
    // Methods for field "vehicleIdentification"
    public VehicleIdentification getVehicleIdentification()
    {
	return (VehicleIdentification)mComponents[3];
    }
    
    public void setVehicleIdentification(VehicleIdentification vehicleIdentification)
    {
	mComponents[3] = vehicleIdentification;
    }
    
    
    // Methods for field "deviceIdentification"
    public PrintableString getDeviceIdentification()
    {
	return (PrintableString)mComponents[4];
    }
    
    public void setDeviceIdentification(PrintableString deviceIdentification)
    {
	mComponents[4] = deviceIdentification;
    }
    
    public boolean hasDeviceIdentification()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDeviceIdentification()
    {
	setComponentAbsent(4);
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
	    "NGTPDispatcherDataUnencrypted"
	),
	new QName (
	    "NGTP-Dispatch",
	    "NGTPDispatcherDataUnencrypted"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "messageCreationTime",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
				    new com.oss.asn1.INTEGER(2047),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(2047)
			    ),
			    null
			)
		    ),
		    "messageTimeToLive",
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
				"net.sirun.ngtp.ngtp_dispatch",
				"MessageCounter"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"MessageCounter"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MessageCounter"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MessageCounter"
				)
			    ),
			    0
			)
		    ),
		    "msgCounter",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_dispatch",
				"VehicleIdentification"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"VehicleIdentification"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "VehicleIdentification"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3)
				}
			    )
			)
		    ),
		    "vehicleIdentification",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "deviceIdentification",
		    4,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NGTPDispatcherDataUnencrypted object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPDispatcherDataUnencrypted object.
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
    
} // End class definition for NGTPDispatcherDataUnencrypted
