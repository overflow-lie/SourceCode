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
 * Define the ASN1 Type AlertType from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class AlertType extends Sequence {
    
    /**
     * The default constructor.
     */
    public AlertType()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AlertType(TimeStamp time, AlertData alertData, BOOLEAN alertActive)
    {
	setTime(time);
	setAlertData(alertData);
	setAlertActive(alertActive);
    }
    
    /**
     * Construct with components.
     */
    public AlertType(TimeStamp time, AlertData alertData, boolean alertActive)
    {
	this(time, alertData, new BOOLEAN(alertActive));
    }
    
    public void initComponents()
    {
	mComponents[0] = new TimeStamp();
	mComponents[1] = new AlertData();
	mComponents[2] = new BOOLEAN();
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
		return new TimeStamp();
	    case 1:
		return new AlertData();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "time"
    public TimeStamp getTime()
    {
	return (TimeStamp)mComponents[0];
    }
    
    public void setTime(TimeStamp time)
    {
	mComponents[0] = time;
    }
    
    
    // Methods for field "alertData"
    public AlertData getAlertData()
    {
	return (AlertData)mComponents[1];
    }
    
    public void setAlertData(AlertData alertData)
    {
	mComponents[1] = alertData;
    }
    
    
    // Methods for field "alertActive"
    public boolean getAlertActive()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setAlertActive(boolean alertActive)
    {
	setAlertActive(new BOOLEAN(alertActive));
    }
    
    public void setAlertActive(BOOLEAN alertActive)
    {
	mComponents[2] = alertActive;
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
	    "AlertType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "AlertType"
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
		    "time",
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
				"AlertData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"AlertData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "AlertData"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x800a, 1),
				    new TagDecoderElement((short)0x800b, 2),
				    new TagDecoderElement((short)0x800c, 3),
				    new TagDecoderElement((short)0x800d, 4),
				    new TagDecoderElement((short)0x800e, 5),
				    new TagDecoderElement((short)0x800f, 6),
				    new TagDecoderElement((short)0x801e, 7),
				    new TagDecoderElement((short)0x801f, 8),
				    new TagDecoderElement((short)0x8020, 9),
				    new TagDecoderElement((short)0x8021, 10),
				    new TagDecoderElement((short)0x8022, 11),
				    new TagDecoderElement((short)0x8023, 12),
				    new TagDecoderElement((short)0x8024, 13),
				    new TagDecoderElement((short)0x8025, 14),
				    new TagDecoderElement((short)0x8026, 15),
				    new TagDecoderElement((short)0x8027, 16),
				    new TagDecoderElement((short)0x8028, 17),
				    new TagDecoderElement((short)0x8029, 18),
				    new TagDecoderElement((short)0x802a, 19),
				    new TagDecoderElement((short)0x802b, 20),
				    new TagDecoderElement((short)0x802c, 21),
				    new TagDecoderElement((short)0x802d, 22),
				    new TagDecoderElement((short)0x802e, 23),
				    new TagDecoderElement((short)0x802f, 24),
				    new TagDecoderElement((short)0x8030, 25),
				    new TagDecoderElement((short)0x8032, 26),
				    new TagDecoderElement((short)0x8033, 27),
				    new TagDecoderElement((short)0x8034, 28),
				    new TagDecoderElement((short)0x8035, 29),
				    new TagDecoderElement((short)0x8036, 30),
				    new TagDecoderElement((short)0x8037, 31),
				    new TagDecoderElement((short)0x8038, 32)
				}
			    )
			)
		    ),
		    "alertData",
		    1,
		    2,
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
		    "alertActive",
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
     * Get the type descriptor (TypeInfo) of 'this' AlertType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AlertType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AlertType
