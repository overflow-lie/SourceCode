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
 * Define the ASN1 Type GenericParameter from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class GenericParameter extends Sequence {
    
    /**
     * The default constructor.
     */
    public GenericParameter()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GenericParameter(GenericParameterKey key, 
		    GenericParameterValue value)
    {
	setKey(key);
	setValue(value);
    }
    
    public void initComponents()
    {
	mComponents[0] = new GenericParameterKey();
	mComponents[1] = new GenericParameterValue();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new GenericParameterKey();
	    case 1:
		return new GenericParameterValue();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "key"
    public GenericParameterKey getKey()
    {
	return (GenericParameterKey)mComponents[0];
    }
    
    public void setKey(GenericParameterKey key)
    {
	mComponents[0] = key;
    }
    
    
    // Methods for field "value"
    public GenericParameterValue getValue()
    {
	return (GenericParameterValue)mComponents[1];
    }
    
    public void setValue(GenericParameterValue value)
    {
	mComponents[1] = value;
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
	    "GenericParameter"
	),
	new QName (
	    "NGTP-Service-Data",
	    "GenericParameter"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"GenericParameterKey"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"GenericParameterKey"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GenericParameterKey"
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
		    "key",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"GenericParameterValue"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"GenericParameterValue"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GenericParameterValue"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x800a, 3),
				    new TagDecoderElement((short)0x800b, 4),
				    new TagDecoderElement((short)0x800c, 5),
				    new TagDecoderElement((short)0x800d, 6),
				    new TagDecoderElement((short)0x801e, 7),
				    new TagDecoderElement((short)0x801f, 8),
				    new TagDecoderElement((short)0x8020, 9),
				    new TagDecoderElement((short)0x8021, 10),
				    new TagDecoderElement((short)0x8028, 11),
				    new TagDecoderElement((short)0x8029, 12),
				    new TagDecoderElement((short)0x802a, 13),
				    new TagDecoderElement((short)0x802b, 14),
				    new TagDecoderElement((short)0x802c, 15),
				    new TagDecoderElement((short)0x802d, 16),
				    new TagDecoderElement((short)0x8032, 17),
				    new TagDecoderElement((short)0x8033, 18),
				    new TagDecoderElement((short)0x8034, 19),
				    new TagDecoderElement((short)0x8035, 20),
				    new TagDecoderElement((short)0x8036, 21)
				}
			    )
			)
		    ),
		    "value",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GenericParameter object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GenericParameter object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GenericParameter
