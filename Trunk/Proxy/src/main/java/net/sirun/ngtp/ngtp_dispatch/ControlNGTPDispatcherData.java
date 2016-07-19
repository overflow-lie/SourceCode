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
 * Define the ASN1 Type ControlNGTPDispatcherData from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class ControlNGTPDispatcherData extends Sequence {
    
    /**
     * The default constructor.
     */
    public ControlNGTPDispatcherData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ControlNGTPDispatcherData(NGTPDispatcherDataCommon common, 
		    ControlNGTPDispatcherDataExtension extension)
    {
	setCommon(common);
	setExtension(extension);
    }
    
    public void initComponents()
    {
	mComponents[0] = new NGTPDispatcherDataCommon();
	mComponents[1] = new ControlNGTPDispatcherDataExtension();
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
		return new NGTPDispatcherDataCommon();
	    case 1:
		return new ControlNGTPDispatcherDataExtension();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "common"
    public NGTPDispatcherDataCommon getCommon()
    {
	return (NGTPDispatcherDataCommon)mComponents[0];
    }
    
    public void setCommon(NGTPDispatcherDataCommon common)
    {
	mComponents[0] = common;
    }
    
    
    // Methods for field "extension"
    public ControlNGTPDispatcherDataExtension getExtension()
    {
	return (ControlNGTPDispatcherDataExtension)mComponents[1];
    }
    
    public void setExtension(ControlNGTPDispatcherDataExtension extension)
    {
	mComponents[1] = extension;
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
	    "ControlNGTPDispatcherData"
	),
	new QName (
	    "NGTP-Dispatch",
	    "ControlNGTPDispatcherData"
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
				"NGTPDispatcherDataCommon"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"NGTPDispatcherDataCommon"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "NGTPDispatcherDataCommon"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "NGTPDispatcherDataCommon"
				)
			    ),
			    0
			)
		    ),
		    "common",
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
				"ControlNGTPDispatcherDataExtension"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"ControlNGTPDispatcherDataExtension"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "ControlNGTPDispatcherDataExtension"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "ControlNGTPDispatcherDataExtension"
				)
			    ),
			    0
			)
		    ),
		    "extension",
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
     * Get the type descriptor (TypeInfo) of 'this' ControlNGTPDispatcherData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ControlNGTPDispatcherData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ControlNGTPDispatcherData
