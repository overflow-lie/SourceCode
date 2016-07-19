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
 * Define the ASN1 Type ControlNGTPDispatcherDataExtension from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class ControlNGTPDispatcherDataExtension extends Sequence {
    
    /**
     * The default constructor.
     */
    public ControlNGTPDispatcherDataExtension()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ControlNGTPDispatcherDataExtension(PrintableString crqNumber, 
		    OctetString notificationData, BOOLEAN messagesPending, 
		    NGTPErrorCodes errorInfo)
    {
	setCrqNumber(crqNumber);
	setNotificationData(notificationData);
	setMessagesPending(messagesPending);
	setErrorInfo(errorInfo);
    }
    
    /**
     * Construct with components.
     */
    public ControlNGTPDispatcherDataExtension(PrintableString crqNumber, 
		    OctetString notificationData, boolean messagesPending, 
		    NGTPErrorCodes errorInfo)
    {
	this(crqNumber, notificationData, new BOOLEAN(messagesPending), 
	     errorInfo);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new OctetString();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = NGTPErrorCodes.dataMismatchError;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new PrintableString();
	    case 1:
		return new OctetString();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return NGTPErrorCodes.dataMismatchError;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "crqNumber"
    public PrintableString getCrqNumber()
    {
	return (PrintableString)mComponents[0];
    }
    
    public void setCrqNumber(PrintableString crqNumber)
    {
	mComponents[0] = crqNumber;
    }
    
    public boolean hasCrqNumber()
    {
	return componentIsPresent(0);
    }
    
    public void deleteCrqNumber()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "notificationData"
    public OctetString getNotificationData()
    {
	return (OctetString)mComponents[1];
    }
    
    public void setNotificationData(OctetString notificationData)
    {
	mComponents[1] = notificationData;
    }
    
    public boolean hasNotificationData()
    {
	return componentIsPresent(1);
    }
    
    public void deleteNotificationData()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "messagesPending"
    public boolean getMessagesPending()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setMessagesPending(boolean messagesPending)
    {
	setMessagesPending(new BOOLEAN(messagesPending));
    }
    
    public void setMessagesPending(BOOLEAN messagesPending)
    {
	mComponents[2] = messagesPending;
    }
    
    public boolean hasMessagesPending()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMessagesPending()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "errorInfo"
    public NGTPErrorCodes getErrorInfo()
    {
	return (NGTPErrorCodes)mComponents[3];
    }
    
    public void setErrorInfo(NGTPErrorCodes errorInfo)
    {
	mComponents[3] = errorInfo;
    }
    
    public boolean hasErrorInfo()
    {
	return componentIsPresent(3);
    }
    
    public void deleteErrorInfo()
    {
	setComponentAbsent(3);
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
	    "ControlNGTPDispatcherDataExtension"
	),
	new QName (
	    "NGTP-Dispatch",
	    "ControlNGTPDispatcherDataExtension"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
					    new com.oss.asn1.INTEGER(27),
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
				new java.lang.Long(27)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "crqNumber",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(64),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(64)
			    )
			)
		    ),
		    "notificationData",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "messagesPending",
		    2,
		    3,
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
				"NGTPErrorCodes"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"NGTPErrorCodes"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"dataMismatchError",
					10
				    ),
				    new MemberListElement (
					"protocolVersionError",
					20
				    ),
				    new MemberListElement (
					"messageLengthError",
					30
				    ),
				    new MemberListElement (
					"eventTerminatedByTimeout",
					40
				    ),
				    new MemberListElement (
					"serviceTypeError",
					50
				    ),
				    new MemberListElement (
					"serviceNotProvisioned",
					51
				    ),
				    new MemberListElement (
					"crqNumberError",
					60
				    ),
				    new MemberListElement (
					"invalidHeader",
					70
				    ),
				    new MemberListElement (
					"reserved",
					80
				    ),
				    new MemberListElement (
					"invalidSignature",
					90
				    ),
				    new MemberListElement (
					"invalidSecurityContext",
					100
				    ),
				    new MemberListElement (
					"statelessExpected",
					110
				    ),
				    new MemberListElement (
					"unknownError",
					999
				    )
				}
			    ),
			    0,
			    NGTPErrorCodes.dataMismatchError
			)
		    ),
		    "errorInfo",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ControlNGTPDispatcherDataExtension object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ControlNGTPDispatcherDataExtension object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ControlNGTPDispatcherDataExtension
