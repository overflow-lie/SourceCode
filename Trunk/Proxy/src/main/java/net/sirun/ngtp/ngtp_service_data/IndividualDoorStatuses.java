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
 * Define the ASN1 Type IndividualDoorStatuses from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class IndividualDoorStatuses extends Sequence {
    
    /**
     * The default constructor.
     */
    public IndividualDoorStatuses()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IndividualDoorStatuses(DoorStatus front_left, 
		    DoorStatus front_right, DoorStatus rear_left, 
		    DoorStatus rear_right, DoorStatus tailgate, 
		    DoorStatus engineHood)
    {
	setFront_left(front_left);
	setFront_right(front_right);
	setRear_left(rear_left);
	setRear_right(rear_right);
	setTailgate(tailgate);
	setEngineHood(engineHood);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DoorStatus();
	mComponents[1] = new DoorStatus();
	mComponents[2] = new DoorStatus();
	mComponents[3] = new DoorStatus();
	mComponents[4] = new DoorStatus();
	mComponents[5] = new DoorStatus();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DoorStatus();
	    case 1:
		return new DoorStatus();
	    case 2:
		return new DoorStatus();
	    case 3:
		return new DoorStatus();
	    case 4:
		return new DoorStatus();
	    case 5:
		return new DoorStatus();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "front_left"
    public DoorStatus getFront_left()
    {
	return (DoorStatus)mComponents[0];
    }
    
    public void setFront_left(DoorStatus front_left)
    {
	mComponents[0] = front_left;
    }
    
    
    // Methods for field "front_right"
    public DoorStatus getFront_right()
    {
	return (DoorStatus)mComponents[1];
    }
    
    public void setFront_right(DoorStatus front_right)
    {
	mComponents[1] = front_right;
    }
    
    
    // Methods for field "rear_left"
    public DoorStatus getRear_left()
    {
	return (DoorStatus)mComponents[2];
    }
    
    public void setRear_left(DoorStatus rear_left)
    {
	mComponents[2] = rear_left;
    }
    
    
    // Methods for field "rear_right"
    public DoorStatus getRear_right()
    {
	return (DoorStatus)mComponents[3];
    }
    
    public void setRear_right(DoorStatus rear_right)
    {
	mComponents[3] = rear_right;
    }
    
    
    // Methods for field "tailgate"
    public DoorStatus getTailgate()
    {
	return (DoorStatus)mComponents[4];
    }
    
    public void setTailgate(DoorStatus tailgate)
    {
	mComponents[4] = tailgate;
    }
    
    
    // Methods for field "engineHood"
    public DoorStatus getEngineHood()
    {
	return (DoorStatus)mComponents[5];
    }
    
    public void setEngineHood(DoorStatus engineHood)
    {
	mComponents[5] = engineHood;
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
	    "IndividualDoorStatuses"
	),
	new QName (
	    "NGTP-Service-Data",
	    "IndividualDoorStatuses"
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
				"DoorStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
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
				"DoorStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
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
				"DoorStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
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
				"DoorStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0
			)
		    ),
		    "rear-right",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"DoorStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0
			)
		    ),
		    "tailgate",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"DoorStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatus"
				)
			    ),
			    0
			)
		    ),
		    "engineHood",
		    5,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IndividualDoorStatuses object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IndividualDoorStatuses object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IndividualDoorStatuses
