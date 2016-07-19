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
 * Define the ASN1 Type TyreStatuses from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TyreStatuses extends Sequence {
    
    /**
     * The default constructor.
     */
    public TyreStatuses()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TyreStatuses(TyreStatus front_left, TyreStatus front_right, 
		    TyreStatus rear_left, TyreStatus rear_right)
    {
	setFront_left(front_left);
	setFront_right(front_right);
	setRear_left(rear_left);
	setRear_right(rear_right);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TyreStatus();
	mComponents[1] = new TyreStatus();
	mComponents[2] = new TyreStatus();
	mComponents[3] = new TyreStatus();
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
		return new TyreStatus();
	    case 1:
		return new TyreStatus();
	    case 2:
		return new TyreStatus();
	    case 3:
		return new TyreStatus();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "front_left"
    public TyreStatus getFront_left()
    {
	return (TyreStatus)mComponents[0];
    }
    
    public void setFront_left(TyreStatus front_left)
    {
	mComponents[0] = front_left;
    }
    
    
    // Methods for field "front_right"
    public TyreStatus getFront_right()
    {
	return (TyreStatus)mComponents[1];
    }
    
    public void setFront_right(TyreStatus front_right)
    {
	mComponents[1] = front_right;
    }
    
    
    // Methods for field "rear_left"
    public TyreStatus getRear_left()
    {
	return (TyreStatus)mComponents[2];
    }
    
    public void setRear_left(TyreStatus rear_left)
    {
	mComponents[2] = rear_left;
    }
    
    
    // Methods for field "rear_right"
    public TyreStatus getRear_right()
    {
	return (TyreStatus)mComponents[3];
    }
    
    public void setRear_right(TyreStatus rear_right)
    {
	mComponents[3] = rear_right;
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
	    "TyreStatuses"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TyreStatuses"
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
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "front-left",
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
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "front-right",
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
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "rear-left",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "rear-right",
		    3,
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
     * Get the type descriptor (TypeInfo) of 'this' TyreStatuses object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TyreStatuses object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TyreStatuses
