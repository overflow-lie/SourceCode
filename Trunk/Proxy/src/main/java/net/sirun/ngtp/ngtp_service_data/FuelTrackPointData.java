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
 * Define the ASN1 Type FuelTrackPointData from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class FuelTrackPointData extends Sequence {
    
    /**
     * The default constructor.
     */
    public FuelTrackPointData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FuelTrackPointData(INTEGER consFuelLtrx5000, INTEGER consElWhx5, 
		    INTEGER regElWhx5)
    {
	setConsFuelLtrx5000(consFuelLtrx5000);
	setConsElWhx5(consElWhx5);
	setRegElWhx5(regElWhx5);
    }
    
    /**
     * Construct with components.
     */
    public FuelTrackPointData(long consFuelLtrx5000, long consElWhx5, 
		    long regElWhx5)
    {
	this(new INTEGER(consFuelLtrx5000), new INTEGER(consElWhx5), 
	     new INTEGER(regElWhx5));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "consFuelLtrx5000"
    public long getConsFuelLtrx5000()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setConsFuelLtrx5000(long consFuelLtrx5000)
    {
	setConsFuelLtrx5000(new INTEGER(consFuelLtrx5000));
    }
    
    public void setConsFuelLtrx5000(INTEGER consFuelLtrx5000)
    {
	mComponents[0] = consFuelLtrx5000;
    }
    
    public boolean hasConsFuelLtrx5000()
    {
	return componentIsPresent(0);
    }
    
    public void deleteConsFuelLtrx5000()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "consElWhx5"
    public long getConsElWhx5()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setConsElWhx5(long consElWhx5)
    {
	setConsElWhx5(new INTEGER(consElWhx5));
    }
    
    public void setConsElWhx5(INTEGER consElWhx5)
    {
	mComponents[1] = consElWhx5;
    }
    
    public boolean hasConsElWhx5()
    {
	return componentIsPresent(1);
    }
    
    public void deleteConsElWhx5()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "regElWhx5"
    public long getRegElWhx5()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setRegElWhx5(long regElWhx5)
    {
	setRegElWhx5(new INTEGER(regElWhx5));
    }
    
    public void setRegElWhx5(INTEGER regElWhx5)
    {
	mComponents[2] = regElWhx5;
    }
    
    public boolean hasRegElWhx5()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRegElWhx5()
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
	    "FuelTrackPointData"
	),
	new QName (
	    "NGTP-Service-Data",
	    "FuelTrackPointData"
	),
	12314,
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
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "consFuelLtrx5000",
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
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "consElWhx5",
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
				    new com.oss.asn1.INTEGER(16777215),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16777215)
			    ),
			    null
			)
		    ),
		    "regElWhx5",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' FuelTrackPointData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FuelTrackPointData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FuelTrackPointData
