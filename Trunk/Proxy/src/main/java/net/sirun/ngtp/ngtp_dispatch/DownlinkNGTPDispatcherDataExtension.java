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
 * Define the ASN1 Type DownlinkNGTPDispatcherDataExtension from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class DownlinkNGTPDispatcherDataExtension extends Sequence {
    
    /**
     * The default constructor.
     */
    public DownlinkNGTPDispatcherDataExtension()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DownlinkNGTPDispatcherDataExtension(MessageLength serviceDataMessageLength, 
		    DataEncoding serviceDataEncoding, 
		    MajMinVersion16 serviceDataProtocolVersion)
    {
	setServiceDataMessageLength(serviceDataMessageLength);
	setServiceDataEncoding(serviceDataEncoding);
	setServiceDataProtocolVersion(serviceDataProtocolVersion);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MessageLength();
	mComponents[1] = new DataEncoding();
	mComponents[2] = new MajMinVersion16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MessageLength();
	    case 1:
		return new DataEncoding();
	    case 2:
		return new MajMinVersion16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "serviceDataMessageLength"
    public MessageLength getServiceDataMessageLength()
    {
	return (MessageLength)mComponents[0];
    }
    
    public void setServiceDataMessageLength(MessageLength serviceDataMessageLength)
    {
	mComponents[0] = serviceDataMessageLength;
    }
    
    
    // Methods for field "serviceDataEncoding"
    public DataEncoding getServiceDataEncoding()
    {
	return (DataEncoding)mComponents[1];
    }
    
    public void setServiceDataEncoding(DataEncoding serviceDataEncoding)
    {
	mComponents[1] = serviceDataEncoding;
    }
    
    
    // Methods for field "serviceDataProtocolVersion"
    public MajMinVersion16 getServiceDataProtocolVersion()
    {
	return (MajMinVersion16)mComponents[2];
    }
    
    public void setServiceDataProtocolVersion(MajMinVersion16 serviceDataProtocolVersion)
    {
	mComponents[2] = serviceDataProtocolVersion;
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
	    "DownlinkNGTPDispatcherDataExtension"
	),
	new QName (
	    "NGTP-Dispatch",
	    "DownlinkNGTPDispatcherDataExtension"
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
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DownlinkNGTPDispatcherDataExtension object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DownlinkNGTPDispatcherDataExtension object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DownlinkNGTPDispatcherDataExtension
