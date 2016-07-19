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
 * Define the ASN1 Type MessageLength from ASN1 Module NGTP_Dispatch.
 * @see Choice
 */

public class MessageLength extends Choice {
    
    /**
     * The default constructor.
     */
    public MessageLength()
    {
    }
    
    public static final  int  messageLength8_chosen = 1;
    public static final  int  messageLength16_chosen = 2;
    public static final  int  messageLength24_chosen = 3;
    
    // Methods for field "messageLength8"
    public static MessageLength createMessageLengthWithMessageLength8(long messageLength8)
    {
	return createMessageLengthWithMessageLength8(new INTEGER(messageLength8));
    }
    
    public static MessageLength createMessageLengthWithMessageLength8(INTEGER messageLength8)
    {
	MessageLength __object = new MessageLength();

	__object.setMessageLength8(messageLength8);
	return __object;
    }
    
    public boolean hasMessageLength8()
    {
	return getChosenFlag() == messageLength8_chosen;
    }
    
    public void setMessageLength8(long messageLength8)
    {
	setMessageLength8(new INTEGER(messageLength8));
    }
    
    public void setMessageLength8(INTEGER messageLength8)
    {
	setChosenValue(messageLength8);
	setChosenFlag(messageLength8_chosen);
    }
    
    
    // Methods for field "messageLength16"
    public static MessageLength createMessageLengthWithMessageLength16(long messageLength16)
    {
	return createMessageLengthWithMessageLength16(new INTEGER(messageLength16));
    }
    
    public static MessageLength createMessageLengthWithMessageLength16(INTEGER messageLength16)
    {
	MessageLength __object = new MessageLength();

	__object.setMessageLength16(messageLength16);
	return __object;
    }
    
    public boolean hasMessageLength16()
    {
	return getChosenFlag() == messageLength16_chosen;
    }
    
    public void setMessageLength16(long messageLength16)
    {
	setMessageLength16(new INTEGER(messageLength16));
    }
    
    public void setMessageLength16(INTEGER messageLength16)
    {
	setChosenValue(messageLength16);
	setChosenFlag(messageLength16_chosen);
    }
    
    
    // Methods for field "messageLength24"
    public static MessageLength createMessageLengthWithMessageLength24(long messageLength24)
    {
	return createMessageLengthWithMessageLength24(new INTEGER(messageLength24));
    }
    
    public static MessageLength createMessageLengthWithMessageLength24(INTEGER messageLength24)
    {
	MessageLength __object = new MessageLength();

	__object.setMessageLength24(messageLength24);
	return __object;
    }
    
    public boolean hasMessageLength24()
    {
	return getChosenFlag() == messageLength24_chosen;
    }
    
    public void setMessageLength24(long messageLength24)
    {
	setMessageLength24(new INTEGER(messageLength24));
    }
    
    public void setMessageLength24(INTEGER messageLength24)
    {
	setChosenValue(messageLength24);
	setChosenFlag(messageLength24_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case messageLength8_chosen:
		return new INTEGER();
	    case messageLength16_chosen:
		return new INTEGER();
	    case messageLength24_chosen:
		return new INTEGER();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
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
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "messageLength8",
		    0,
		    2
		),
		new FieldInfo (
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "messageLength16",
		    1,
		    2
		),
		new FieldInfo (
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
		    "messageLength24",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MessageLength object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MessageLength object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MessageLength
