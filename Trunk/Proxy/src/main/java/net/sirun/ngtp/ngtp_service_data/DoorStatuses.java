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
 * Define the ASN1 Type DoorStatuses from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class DoorStatuses extends Sequence {
    
    /**
     * The default constructor.
     */
    public DoorStatuses()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DoorStatuses(BOOLEXT allDoorsLocked, BOOLEXT trunkLocked, 
		    IndividualDoorStatuses doorStatus)
    {
	setAllDoorsLocked(allDoorsLocked);
	setTrunkLocked(trunkLocked);
	setDoorStatus(doorStatus);
    }
    
    /**
     * Construct with required components.
     */
    public DoorStatuses(BOOLEXT allDoorsLocked, BOOLEXT trunkLocked)
    {
	setAllDoorsLocked(allDoorsLocked);
	setTrunkLocked(trunkLocked);
    }
    
    public void initComponents()
    {
	mComponents[0] = BOOLEXT.isFalse;
	mComponents[1] = BOOLEXT.isFalse;
	mComponents[2] = new IndividualDoorStatuses();
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
		return BOOLEXT.isFalse;
	    case 1:
		return BOOLEXT.isFalse;
	    case 2:
		return new IndividualDoorStatuses();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "allDoorsLocked"
    public BOOLEXT getAllDoorsLocked()
    {
	return (BOOLEXT)mComponents[0];
    }
    
    public void setAllDoorsLocked(BOOLEXT allDoorsLocked)
    {
	mComponents[0] = allDoorsLocked;
    }
    
    
    // Methods for field "trunkLocked"
    public BOOLEXT getTrunkLocked()
    {
	return (BOOLEXT)mComponents[1];
    }
    
    public void setTrunkLocked(BOOLEXT trunkLocked)
    {
	mComponents[1] = trunkLocked;
    }
    
    
    // Methods for field "doorStatus"
    public IndividualDoorStatuses getDoorStatus()
    {
	return (IndividualDoorStatuses)mComponents[2];
    }
    
    public void setDoorStatus(IndividualDoorStatuses doorStatus)
    {
	mComponents[2] = doorStatus;
    }
    
    public boolean hasDoorStatus()
    {
	return componentIsPresent(2);
    }
    
    public void deleteDoorStatus()
    {
	setComponentAbsent(2);
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
	    "DoorStatuses"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DoorStatuses"
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "allDoorsLocked",
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "trunkLocked",
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
				"IndividualDoorStatuses"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"IndividualDoorStatuses"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "IndividualDoorStatuses"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "IndividualDoorStatuses"
				)
			    ),
			    0
			)
		    ),
		    "doorStatus",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' DoorStatuses object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DoorStatuses object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DoorStatuses
