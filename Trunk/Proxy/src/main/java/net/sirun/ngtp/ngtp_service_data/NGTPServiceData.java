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
 * Define the ASN1 Type NGTPServiceData from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class NGTPServiceData extends Sequence {
    
    /**
     * The default constructor.
     */
    public NGTPServiceData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NGTPServiceData(BOOLEAN testFlag, ServiceMessageType messageType, 
		    Acknowledge appAck, BOOLEAN appAckRequired, 
		    NGTPCore serviceDataCoreMessage)
    {
	setTestFlag(testFlag);
	setMessageType(messageType);
	setAppAck(appAck);
	setAppAckRequired(appAckRequired);
	setServiceDataCoreMessage(serviceDataCoreMessage);
    }
    
    /**
     * Construct with components.
     */
    public NGTPServiceData(boolean testFlag, ServiceMessageType messageType, 
		    Acknowledge appAck, boolean appAckRequired, 
		    NGTPCore serviceDataCoreMessage)
    {
	this(new BOOLEAN(testFlag), messageType, appAck, 
	     new BOOLEAN(appAckRequired), serviceDataCoreMessage);
    }
    
    /**
     * Construct with required components.
     */
    public NGTPServiceData(boolean testFlag, ServiceMessageType messageType, 
		    boolean appAckRequired)
    {
	setTestFlag(testFlag);
	setMessageType(messageType);
	setAppAckRequired(appAckRequired);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = ServiceMessageType.dataRequest;
	mComponents[2] = Acknowledge.nack;
	mComponents[3] = new BOOLEAN();
	mComponents[4] = new NGTPCore();
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
		return new BOOLEAN();
	    case 1:
		return ServiceMessageType.dataRequest;
	    case 2:
		return Acknowledge.nack;
	    case 3:
		return new BOOLEAN();
	    case 4:
		return new NGTPCore();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "testFlag"
    public boolean getTestFlag()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setTestFlag(boolean testFlag)
    {
	setTestFlag(new BOOLEAN(testFlag));
    }
    
    public void setTestFlag(BOOLEAN testFlag)
    {
	mComponents[0] = testFlag;
    }
    
    
    // Methods for field "messageType"
    public ServiceMessageType getMessageType()
    {
	return (ServiceMessageType)mComponents[1];
    }
    
    public void setMessageType(ServiceMessageType messageType)
    {
	mComponents[1] = messageType;
    }
    
    
    // Methods for field "appAck"
    public Acknowledge getAppAck()
    {
	return (Acknowledge)mComponents[2];
    }
    
    public void setAppAck(Acknowledge appAck)
    {
	mComponents[2] = appAck;
    }
    
    public boolean hasAppAck()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAppAck()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "appAckRequired"
    public boolean getAppAckRequired()
    {
	return ((BOOLEAN)mComponents[3]).booleanValue();
    }
    
    public void setAppAckRequired(boolean appAckRequired)
    {
	setAppAckRequired(new BOOLEAN(appAckRequired));
    }
    
    public void setAppAckRequired(BOOLEAN appAckRequired)
    {
	mComponents[3] = appAckRequired;
    }
    
    
    // Methods for field "serviceDataCoreMessage"
    public NGTPCore getServiceDataCoreMessage()
    {
	return (NGTPCore)mComponents[4];
    }
    
    public void setServiceDataCoreMessage(NGTPCore serviceDataCoreMessage)
    {
	mComponents[4] = serviceDataCoreMessage;
    }
    
    public boolean hasServiceDataCoreMessage()
    {
	return componentIsPresent(4);
    }
    
    public void deleteServiceDataCoreMessage()
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
	    "net.sirun.ngtp.ngtp_service_data",
	    "NGTPServiceData"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NGTPServiceData"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "testFlag",
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
				"ServiceMessageType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ServiceMessageType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dataRequest",
					0
				    ),
				    new MemberListElement (
					"update",
					1
				    ),
				    new MemberListElement (
					"startRequest",
					2
				    ),
				    new MemberListElement (
					"terminateReq",
					3
				    ),
				    new MemberListElement (
					"dataResponse",
					8
				    ),
				    new MemberListElement (
					"actionResponse",
					9
				    ),
				    new MemberListElement (
					"acknowledge",
					10
				    )
				}
			    ),
			    0,
			    ServiceMessageType.dataRequest
			)
		    ),
		    "messageType",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"Acknowledge"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"Acknowledge"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"nack",
					0
				    ),
				    new MemberListElement (
					"ack",
					1
				    )
				}
			    ),
			    0,
			    Acknowledge.nack
			)
		    ),
		    "appAck",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "appAckRequired",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"NGTPCore"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NGTPCore"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NGTPCore"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "serviceDataCoreMessage",
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' NGTPServiceData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPServiceData object.
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
    
} // End class definition for NGTPServiceData
