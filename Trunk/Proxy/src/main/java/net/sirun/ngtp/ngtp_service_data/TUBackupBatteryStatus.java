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
 * Define the ASN1 Type TUBackupBatteryStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TUBackupBatteryStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public TUBackupBatteryStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TUBackupBatteryStatus(INTEGER primaryVoltx10, 
		    INTEGER primaryChargePerc, INTEGER secondaryVoltx10, 
		    INTEGER secondaryChargePerc)
    {
	setPrimaryVoltx10(primaryVoltx10);
	setPrimaryChargePerc(primaryChargePerc);
	setSecondaryVoltx10(secondaryVoltx10);
	setSecondaryChargePerc(secondaryChargePerc);
    }
    
    /**
     * Construct with components.
     */
    public TUBackupBatteryStatus(long primaryVoltx10, long primaryChargePerc, 
		    long secondaryVoltx10, long secondaryChargePerc)
    {
	this(new INTEGER(primaryVoltx10), new INTEGER(primaryChargePerc), 
	     new INTEGER(secondaryVoltx10), 
	     new INTEGER(secondaryChargePerc));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "primaryVoltx10"
    public long getPrimaryVoltx10()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setPrimaryVoltx10(long primaryVoltx10)
    {
	setPrimaryVoltx10(new INTEGER(primaryVoltx10));
    }
    
    public void setPrimaryVoltx10(INTEGER primaryVoltx10)
    {
	mComponents[0] = primaryVoltx10;
    }
    
    public boolean hasPrimaryVoltx10()
    {
	return componentIsPresent(0);
    }
    
    public void deletePrimaryVoltx10()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "primaryChargePerc"
    public long getPrimaryChargePerc()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPrimaryChargePerc(long primaryChargePerc)
    {
	setPrimaryChargePerc(new INTEGER(primaryChargePerc));
    }
    
    public void setPrimaryChargePerc(INTEGER primaryChargePerc)
    {
	mComponents[1] = primaryChargePerc;
    }
    
    public boolean hasPrimaryChargePerc()
    {
	return componentIsPresent(1);
    }
    
    public void deletePrimaryChargePerc()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "secondaryVoltx10"
    public long getSecondaryVoltx10()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setSecondaryVoltx10(long secondaryVoltx10)
    {
	setSecondaryVoltx10(new INTEGER(secondaryVoltx10));
    }
    
    public void setSecondaryVoltx10(INTEGER secondaryVoltx10)
    {
	mComponents[2] = secondaryVoltx10;
    }
    
    public boolean hasSecondaryVoltx10()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSecondaryVoltx10()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "secondaryChargePerc"
    public long getSecondaryChargePerc()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setSecondaryChargePerc(long secondaryChargePerc)
    {
	setSecondaryChargePerc(new INTEGER(secondaryChargePerc));
    }
    
    public void setSecondaryChargePerc(INTEGER secondaryChargePerc)
    {
	mComponents[3] = secondaryChargePerc;
    }
    
    public boolean hasSecondaryChargePerc()
    {
	return componentIsPresent(3);
    }
    
    public void deleteSecondaryChargePerc()
    {
	setComponentAbsent(3);
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
	    "TUBackupBatteryStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TUBackupBatteryStatus"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "primaryVoltx10",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "primaryChargePerc",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "secondaryVoltx10",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "secondaryChargePerc",
		    3,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3)
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
     * Get the type descriptor (TypeInfo) of 'this' TUBackupBatteryStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TUBackupBatteryStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TUBackupBatteryStatus
