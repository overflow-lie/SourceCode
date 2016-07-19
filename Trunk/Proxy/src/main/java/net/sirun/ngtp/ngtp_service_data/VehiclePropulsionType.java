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
 * Define the ASN1 Type VehiclePropulsionType from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class VehiclePropulsionType extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehiclePropulsionType()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehiclePropulsionType(BOOLEXT gasolineTankPresent, 
		    BOOLEXT dieselTankPresent, BOOLEXT liquidgasTankPresent, 
		    BOOLEXT highElectricEnergyPresent, 
		    BOOLEXT hydrogenTankPresent, 
		    BOOLEXT naturalGasTankPresent)
    {
	setGasolineTankPresent(gasolineTankPresent);
	setDieselTankPresent(dieselTankPresent);
	setLiquidgasTankPresent(liquidgasTankPresent);
	setHighElectricEnergyPresent(highElectricEnergyPresent);
	setHydrogenTankPresent(hydrogenTankPresent);
	setNaturalGasTankPresent(naturalGasTankPresent);
    }
    
    public void initComponents()
    {
	mComponents[0] = BOOLEXT.isFalse;
	mComponents[1] = BOOLEXT.isFalse;
	mComponents[2] = BOOLEXT.isFalse;
	mComponents[3] = BOOLEXT.isFalse;
	mComponents[4] = BOOLEXT.isFalse;
	mComponents[5] = BOOLEXT.isFalse;
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
		return BOOLEXT.isFalse;
	    case 1:
		return BOOLEXT.isFalse;
	    case 2:
		return BOOLEXT.isFalse;
	    case 3:
		return BOOLEXT.isFalse;
	    case 4:
		return BOOLEXT.isFalse;
	    case 5:
		return BOOLEXT.isFalse;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "gasolineTankPresent"
    public BOOLEXT getGasolineTankPresent()
    {
	return (BOOLEXT)mComponents[0];
    }
    
    public void setGasolineTankPresent(BOOLEXT gasolineTankPresent)
    {
	mComponents[0] = gasolineTankPresent;
    }
    
    
    // Methods for field "dieselTankPresent"
    public BOOLEXT getDieselTankPresent()
    {
	return (BOOLEXT)mComponents[1];
    }
    
    public void setDieselTankPresent(BOOLEXT dieselTankPresent)
    {
	mComponents[1] = dieselTankPresent;
    }
    
    
    // Methods for field "liquidgasTankPresent"
    public BOOLEXT getLiquidgasTankPresent()
    {
	return (BOOLEXT)mComponents[2];
    }
    
    public void setLiquidgasTankPresent(BOOLEXT liquidgasTankPresent)
    {
	mComponents[2] = liquidgasTankPresent;
    }
    
    
    // Methods for field "highElectricEnergyPresent"
    public BOOLEXT getHighElectricEnergyPresent()
    {
	return (BOOLEXT)mComponents[3];
    }
    
    public void setHighElectricEnergyPresent(BOOLEXT highElectricEnergyPresent)
    {
	mComponents[3] = highElectricEnergyPresent;
    }
    
    
    // Methods for field "hydrogenTankPresent"
    public BOOLEXT getHydrogenTankPresent()
    {
	return (BOOLEXT)mComponents[4];
    }
    
    public void setHydrogenTankPresent(BOOLEXT hydrogenTankPresent)
    {
	mComponents[4] = hydrogenTankPresent;
    }
    
    
    // Methods for field "naturalGasTankPresent"
    public BOOLEXT getNaturalGasTankPresent()
    {
	return (BOOLEXT)mComponents[5];
    }
    
    public void setNaturalGasTankPresent(BOOLEXT naturalGasTankPresent)
    {
	mComponents[5] = naturalGasTankPresent;
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
	    "VehiclePropulsionType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "VehiclePropulsionType"
	),
	12318,
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
		    "gasolineTankPresent",
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
		    "dieselTankPresent",
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
		    "liquidgasTankPresent",
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
		    "highElectricEnergyPresent",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "hydrogenTankPresent",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "naturalGasTankPresent",
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
     * Get the type descriptor (TypeInfo) of 'this' VehiclePropulsionType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehiclePropulsionType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehiclePropulsionType
