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
 * Define the ASN1 Type DoorStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class DoorStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public DoorStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DoorStatus(DoorPosition doorStatus, DoorLockStatus lockStatus)
    {
	setDoorStatus(doorStatus);
	setLockStatus(lockStatus);
    }
    
    public void initComponents()
    {
	mComponents[0] = DoorPosition.open;
	mComponents[1] = DoorLockStatus.unknown;
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
		return DoorPosition.open;
	    case 1:
		return DoorLockStatus.unknown;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "doorStatus"
    public DoorPosition getDoorStatus()
    {
	return (DoorPosition)mComponents[0];
    }
    
    public void setDoorStatus(DoorPosition doorStatus)
    {
	mComponents[0] = doorStatus;
    }
    
    
    // Methods for field "lockStatus"
    public DoorLockStatus getLockStatus()
    {
	return (DoorLockStatus)mComponents[1];
    }
    
    public void setLockStatus(DoorLockStatus lockStatus)
    {
	mComponents[1] = lockStatus;
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
	    "DoorStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DoorStatus"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"DoorPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorPosition"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"open",
					0
				    ),
				    new MemberListElement (
					"closed",
					1
				    ),
				    new MemberListElement (
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    DoorPosition.open
			)
		    ),
		    "doorStatus",
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
				"DoorLockStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorLockStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unknown",
					0
				    ),
				    new MemberListElement (
					"unlocked",
					1
				    ),
				    new MemberListElement (
					"locked",
					3
				    ),
				    new MemberListElement (
					"secured",
					4
				    )
				}
			    ),
			    0,
			    DoorLockStatus.unknown
			)
		    ),
		    "lockStatus",
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
     * Get the type descriptor (TypeInfo) of 'this' DoorStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DoorStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DoorStatus
