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
 * Define the ASN1 Type UplinkNGTPDispatcherDataExtension from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class UplinkNGTPDispatcherDataExtension extends Sequence {
    
    /**
     * The default constructor.
     */
    public UplinkNGTPDispatcherDataExtension()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public UplinkNGTPDispatcherDataExtension(BOOLEAN crqmRequest, 
		    BOOLEAN messagePendingCheck, BasicPosition basicPosition, 
		    PrintableString currentNetwork, 
		    PrintableString homeNetwork, PrintableString hmiLanguage, 
		    MessageLength serviceDataMessageLength, 
		    DataEncoding serviceDataEncoding, 
		    MajMinVersion16 serviceDataProtocolVersion)
    {
	setCrqmRequest(crqmRequest);
	setMessagePendingCheck(messagePendingCheck);
	setBasicPosition(basicPosition);
	setCurrentNetwork(currentNetwork);
	setHomeNetwork(homeNetwork);
	setHmiLanguage(hmiLanguage);
	setServiceDataMessageLength(serviceDataMessageLength);
	setServiceDataEncoding(serviceDataEncoding);
	setServiceDataProtocolVersion(serviceDataProtocolVersion);
    }
    
    /**
     * Construct with components.
     */
    public UplinkNGTPDispatcherDataExtension(boolean crqmRequest, 
		    boolean messagePendingCheck, BasicPosition basicPosition, 
		    PrintableString currentNetwork, 
		    PrintableString homeNetwork, PrintableString hmiLanguage, 
		    MessageLength serviceDataMessageLength, 
		    DataEncoding serviceDataEncoding, 
		    MajMinVersion16 serviceDataProtocolVersion)
    {
	this(new BOOLEAN(crqmRequest), new BOOLEAN(messagePendingCheck), 
	     basicPosition, currentNetwork, homeNetwork, hmiLanguage, 
	     serviceDataMessageLength, serviceDataEncoding, 
	     serviceDataProtocolVersion);
    }
    
    /**
     * Construct with required components.
     */
    public UplinkNGTPDispatcherDataExtension(boolean crqmRequest, 
		    boolean messagePendingCheck, 
		    MessageLength serviceDataMessageLength, 
		    DataEncoding serviceDataEncoding, 
		    MajMinVersion16 serviceDataProtocolVersion)
    {
	setCrqmRequest(crqmRequest);
	setMessagePendingCheck(messagePendingCheck);
	setServiceDataMessageLength(serviceDataMessageLength);
	setServiceDataEncoding(serviceDataEncoding);
	setServiceDataProtocolVersion(serviceDataProtocolVersion);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BasicPosition();
	mComponents[3] = new PrintableString();
	mComponents[4] = new PrintableString();
	mComponents[5] = new PrintableString();
	mComponents[6] = new MessageLength();
	mComponents[7] = new DataEncoding();
	mComponents[8] = new MajMinVersion16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new BOOLEAN();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BasicPosition();
	    case 3:
		return new PrintableString();
	    case 4:
		return new PrintableString();
	    case 5:
		return new PrintableString();
	    case 6:
		return new MessageLength();
	    case 7:
		return new DataEncoding();
	    case 8:
		return new MajMinVersion16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "crqmRequest"
    public boolean getCrqmRequest()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setCrqmRequest(boolean crqmRequest)
    {
	setCrqmRequest(new BOOLEAN(crqmRequest));
    }
    
    public void setCrqmRequest(BOOLEAN crqmRequest)
    {
	mComponents[0] = crqmRequest;
    }
    
    
    // Methods for field "messagePendingCheck"
    public boolean getMessagePendingCheck()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setMessagePendingCheck(boolean messagePendingCheck)
    {
	setMessagePendingCheck(new BOOLEAN(messagePendingCheck));
    }
    
    public void setMessagePendingCheck(BOOLEAN messagePendingCheck)
    {
	mComponents[1] = messagePendingCheck;
    }
    
    
    // Methods for field "basicPosition"
    public BasicPosition getBasicPosition()
    {
	return (BasicPosition)mComponents[2];
    }
    
    public void setBasicPosition(BasicPosition basicPosition)
    {
	mComponents[2] = basicPosition;
    }
    
    public boolean hasBasicPosition()
    {
	return componentIsPresent(2);
    }
    
    public void deleteBasicPosition()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "currentNetwork"
    public PrintableString getCurrentNetwork()
    {
	return (PrintableString)mComponents[3];
    }
    
    public void setCurrentNetwork(PrintableString currentNetwork)
    {
	mComponents[3] = currentNetwork;
    }
    
    public boolean hasCurrentNetwork()
    {
	return componentIsPresent(3);
    }
    
    public void deleteCurrentNetwork()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "homeNetwork"
    public PrintableString getHomeNetwork()
    {
	return (PrintableString)mComponents[4];
    }
    
    public void setHomeNetwork(PrintableString homeNetwork)
    {
	mComponents[4] = homeNetwork;
    }
    
    public boolean hasHomeNetwork()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHomeNetwork()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "hmiLanguage"
    public PrintableString getHmiLanguage()
    {
	return (PrintableString)mComponents[5];
    }
    
    public void setHmiLanguage(PrintableString hmiLanguage)
    {
	mComponents[5] = hmiLanguage;
    }
    
    public boolean hasHmiLanguage()
    {
	return componentIsPresent(5);
    }
    
    public void deleteHmiLanguage()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "serviceDataMessageLength"
    public MessageLength getServiceDataMessageLength()
    {
	return (MessageLength)mComponents[6];
    }
    
    public void setServiceDataMessageLength(MessageLength serviceDataMessageLength)
    {
	mComponents[6] = serviceDataMessageLength;
    }
    
    
    // Methods for field "serviceDataEncoding"
    public DataEncoding getServiceDataEncoding()
    {
	return (DataEncoding)mComponents[7];
    }
    
    public void setServiceDataEncoding(DataEncoding serviceDataEncoding)
    {
	mComponents[7] = serviceDataEncoding;
    }
    
    
    // Methods for field "serviceDataProtocolVersion"
    public MajMinVersion16 getServiceDataProtocolVersion()
    {
	return (MajMinVersion16)mComponents[8];
    }
    
    public void setServiceDataProtocolVersion(MajMinVersion16 serviceDataProtocolVersion)
    {
	mComponents[8] = serviceDataProtocolVersion;
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
	    "UplinkNGTPDispatcherDataExtension"
	),
	new QName (
	    "NGTP-Dispatch",
	    "UplinkNGTPDispatcherDataExtension"
	),
	12314,
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
		    "crqmRequest",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "messagePendingCheck",
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
				"BasicPosition"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"BasicPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "BasicPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "BasicPosition"
				)
			    ),
			    0
			)
		    ),
		    "basicPosition",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(127),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "currentNetwork",
		    3,
		    3,
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(127),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "homeNetwork",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
					new com.oss.asn1.INTEGER(3)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "hmiLanguage",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_dispatch",
				"MessageLength"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"MessageLength"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MessageLength"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "serviceDataMessageLength",
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
				"net.sirun.ngtp.ngtp_dispatch",
				"DataEncoding"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"DataEncoding"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "DataEncoding"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "DataEncoding"
				)
			    ),
			    0
			)
		    ),
		    "serviceDataEncoding",
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
				"net.sirun.ngtp.ngtp_dispatch",
				"MajMinVersion16"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"MajMinVersion16"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MajMinVersion16"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "MajMinVersion16"
				)
			    ),
			    0
			)
		    ),
		    "serviceDataProtocolVersion",
		    8,
		    2,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' UplinkNGTPDispatcherDataExtension object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' UplinkNGTPDispatcherDataExtension object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for UplinkNGTPDispatcherDataExtension
