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
 * Define the ASN1 Type VehicleIdentification from ASN1 Module NGTP_Dispatch.
 * @see Choice
 */

public class VehicleIdentification extends Choice {
    
    /**
     * The default constructor.
     */
    public VehicleIdentification()
    {
    }
    
    public static final  int  vin_chosen = 1;
    public static final  int  driveID_chosen = 2;
    public static final  int  equipmentId_chosen = 3;
    public static final  int  equipmentSerial_chosen = 4;
    
    // Methods for field "vin"
    public static VehicleIdentification createVehicleIdentificationWithVin(VIN vin)
    {
	VehicleIdentification __object = new VehicleIdentification();

	__object.setVin(vin);
	return __object;
    }
    
    public boolean hasVin()
    {
	return getChosenFlag() == vin_chosen;
    }
    
    public void setVin(VIN vin)
    {
	setChosenValue(vin);
	setChosenFlag(vin_chosen);
    }
    
    
    // Methods for field "driveID"
    public static VehicleIdentification createVehicleIdentificationWithDriveID(PrintableString driveID)
    {
	VehicleIdentification __object = new VehicleIdentification();

	__object.setDriveID(driveID);
	return __object;
    }
    
    public boolean hasDriveID()
    {
	return getChosenFlag() == driveID_chosen;
    }
    
    public void setDriveID(PrintableString driveID)
    {
	setChosenValue(driveID);
	setChosenFlag(driveID_chosen);
    }
    
    
    // Methods for field "equipmentId"
    public static VehicleIdentification createVehicleIdentificationWithEquipmentId(long equipmentId)
    {
	return createVehicleIdentificationWithEquipmentId(new INTEGER(equipmentId));
    }
    
    public static VehicleIdentification createVehicleIdentificationWithEquipmentId(INTEGER equipmentId)
    {
	VehicleIdentification __object = new VehicleIdentification();

	__object.setEquipmentId(equipmentId);
	return __object;
    }
    
    public boolean hasEquipmentId()
    {
	return getChosenFlag() == equipmentId_chosen;
    }
    
    public void setEquipmentId(long equipmentId)
    {
	setEquipmentId(new INTEGER(equipmentId));
    }
    
    public void setEquipmentId(INTEGER equipmentId)
    {
	setChosenValue(equipmentId);
	setChosenFlag(equipmentId_chosen);
    }
    
    
    // Methods for field "equipmentSerial"
    public static VehicleIdentification createVehicleIdentificationWithEquipmentSerial(PrintableString equipmentSerial)
    {
	VehicleIdentification __object = new VehicleIdentification();

	__object.setEquipmentSerial(equipmentSerial);
	return __object;
    }
    
    public boolean hasEquipmentSerial()
    {
	return getChosenFlag() == equipmentSerial_chosen;
    }
    
    public void setEquipmentSerial(PrintableString equipmentSerial)
    {
	setChosenValue(equipmentSerial);
	setChosenFlag(equipmentSerial_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case vin_chosen:
		return new VIN();
	    case driveID_chosen:
		return new PrintableString();
	    case equipmentId_chosen:
		return new INTEGER();
	    case equipmentSerial_chosen:
		return new PrintableString();
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
	    "VehicleIdentification"
	),
	new QName (
	    "NGTP-Dispatch",
	    "VehicleIdentification"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_dispatch",
				"VIN"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"VIN"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "VIN"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "VIN"
				)
			    ),
			    0
			)
		    ),
		    "vin",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(17)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(17),
				new java.lang.Long(17)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "driveID",
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
				    new com.oss.asn1.INTEGER(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4294967295L)
			    ),
			    null
			)
		    ),
		    "equipmentId",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new SingleValueConstraint (
					new com.oss.asn1.INTEGER(20)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(20),
				new java.lang.Long(20)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "equipmentSerial",
		    3,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleIdentification object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleIdentification object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleIdentification
