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
 * Define the ASN1 Type ElectricVehicleStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class ElectricVehicleStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public ElectricVehicleStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ElectricVehicleStatus(UTF8String16 chargingProfile, 
		    BOOLEXT isPreconditioning, BOOLEXT isCharging, 
		    BOOLEXT isPluggedIn, INTEGER distanceToEmptyKm, 
		    INTEGER stateOfCharge, INTEGER timeToFullyChargedHrsx4, 
		    ChargeType chargeType)
    {
	setChargingProfile(chargingProfile);
	setIsPreconditioning(isPreconditioning);
	setIsCharging(isCharging);
	setIsPluggedIn(isPluggedIn);
	setDistanceToEmptyKm(distanceToEmptyKm);
	setStateOfCharge(stateOfCharge);
	setTimeToFullyChargedHrsx4(timeToFullyChargedHrsx4);
	setChargeType(chargeType);
    }
    
    /**
     * Construct with components.
     */
    public ElectricVehicleStatus(UTF8String16 chargingProfile, 
		    BOOLEXT isPreconditioning, BOOLEXT isCharging, 
		    BOOLEXT isPluggedIn, long distanceToEmptyKm, 
		    long stateOfCharge, long timeToFullyChargedHrsx4, 
		    ChargeType chargeType)
    {
	this(chargingProfile, isPreconditioning, isCharging, isPluggedIn, 
	     new INTEGER(distanceToEmptyKm), new INTEGER(stateOfCharge), 
	     new INTEGER(timeToFullyChargedHrsx4), chargeType);
    }
    
    /**
     * Construct with required components.
     */
    public ElectricVehicleStatus(BOOLEXT isPreconditioning, 
		    BOOLEXT isCharging, BOOLEXT isPluggedIn)
    {
	setIsPreconditioning(isPreconditioning);
	setIsCharging(isCharging);
	setIsPluggedIn(isPluggedIn);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = BOOLEXT.isFalse;
	mComponents[2] = BOOLEXT.isFalse;
	mComponents[3] = BOOLEXT.isFalse;
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = ChargeType.unknown;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return BOOLEXT.isFalse;
	    case 2:
		return BOOLEXT.isFalse;
	    case 3:
		return BOOLEXT.isFalse;
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return ChargeType.unknown;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "chargingProfile"
    public UTF8String16 getChargingProfile()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setChargingProfile(UTF8String16 chargingProfile)
    {
	mComponents[0] = chargingProfile;
    }
    
    public boolean hasChargingProfile()
    {
	return componentIsPresent(0);
    }
    
    public void deleteChargingProfile()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "isPreconditioning"
    public BOOLEXT getIsPreconditioning()
    {
	return (BOOLEXT)mComponents[1];
    }
    
    public void setIsPreconditioning(BOOLEXT isPreconditioning)
    {
	mComponents[1] = isPreconditioning;
    }
    
    
    // Methods for field "isCharging"
    public BOOLEXT getIsCharging()
    {
	return (BOOLEXT)mComponents[2];
    }
    
    public void setIsCharging(BOOLEXT isCharging)
    {
	mComponents[2] = isCharging;
    }
    
    
    // Methods for field "isPluggedIn"
    public BOOLEXT getIsPluggedIn()
    {
	return (BOOLEXT)mComponents[3];
    }
    
    public void setIsPluggedIn(BOOLEXT isPluggedIn)
    {
	mComponents[3] = isPluggedIn;
    }
    
    
    // Methods for field "distanceToEmptyKm"
    public long getDistanceToEmptyKm()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setDistanceToEmptyKm(long distanceToEmptyKm)
    {
	setDistanceToEmptyKm(new INTEGER(distanceToEmptyKm));
    }
    
    public void setDistanceToEmptyKm(INTEGER distanceToEmptyKm)
    {
	mComponents[4] = distanceToEmptyKm;
    }
    
    public boolean hasDistanceToEmptyKm()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDistanceToEmptyKm()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "stateOfCharge"
    public long getStateOfCharge()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setStateOfCharge(long stateOfCharge)
    {
	setStateOfCharge(new INTEGER(stateOfCharge));
    }
    
    public void setStateOfCharge(INTEGER stateOfCharge)
    {
	mComponents[5] = stateOfCharge;
    }
    
    public boolean hasStateOfCharge()
    {
	return componentIsPresent(5);
    }
    
    public void deleteStateOfCharge()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "timeToFullyChargedHrsx4"
    public long getTimeToFullyChargedHrsx4()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setTimeToFullyChargedHrsx4(long timeToFullyChargedHrsx4)
    {
	setTimeToFullyChargedHrsx4(new INTEGER(timeToFullyChargedHrsx4));
    }
    
    public void setTimeToFullyChargedHrsx4(INTEGER timeToFullyChargedHrsx4)
    {
	mComponents[6] = timeToFullyChargedHrsx4;
    }
    
    public boolean hasTimeToFullyChargedHrsx4()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTimeToFullyChargedHrsx4()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "chargeType"
    public ChargeType getChargeType()
    {
	return (ChargeType)mComponents[7];
    }
    
    public void setChargeType(ChargeType chargeType)
    {
	mComponents[7] = chargeType;
    }
    
    public boolean hasChargeType()
    {
	return componentIsPresent(7);
    }
    
    public void deleteChargeType()
    {
	setComponentAbsent(7);
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
	    "ElectricVehicleStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ElectricVehicleStatus"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"UTF8String16"
			    ),
			    new QName (
				"builtin",
				"UTF8String16"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(127),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "chargingProfile",
		    0,
		    3,
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
		    "isPreconditioning",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "isCharging",
		    2,
		    2,
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
		    "isPluggedIn",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "distanceToEmptyKm",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "stateOfCharge",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "timeToFullyChargedHrsx4",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"ChargeType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ChargeType"
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
					"charge-110v",
					1
				    ),
				    new MemberListElement (
					"charge-240v",
					2
				    ),
				    new MemberListElement (
					"charge-level3",
					3
				    )
				}
			    ),
			    0,
			    ChargeType.unknown
			)
		    ),
		    "chargeType",
		    7,
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
			new TagDecoderElement((short)0x8001, 1)
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ElectricVehicleStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ElectricVehicleStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ElectricVehicleStatus
