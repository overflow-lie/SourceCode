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
 * Define the ASN1 Type VIN from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class VIN extends Sequence {
    
    /**
     * The default constructor.
     */
    public VIN()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VIN(PrintableString isowmi, PrintableString isovds, 
		    PrintableString isovisModelyear, 
		    PrintableString isovisSeqPlant)
    {
	setIsowmi(isowmi);
	setIsovds(isovds);
	setIsovisModelyear(isovisModelyear);
	setIsovisSeqPlant(isovisSeqPlant);
    }
    
    /**
     * Construct with required components.
     */
    public VIN(PrintableString isovisSeqPlant)
    {
	setIsovisSeqPlant(isovisSeqPlant);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = new PrintableString();
	mComponents[2] = new PrintableString();
	mComponents[3] = new PrintableString();
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
		return new PrintableString();
	    case 1:
		return new PrintableString();
	    case 2:
		return new PrintableString();
	    case 3:
		return new PrintableString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "isowmi"
    public PrintableString getIsowmi()
    {
	return (PrintableString)mComponents[0];
    }
    
    public void setIsowmi(PrintableString isowmi)
    {
	mComponents[0] = isowmi;
    }
    
    public boolean hasIsowmi()
    {
	return componentIsPresent(0);
    }
    
    public void deleteIsowmi()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "isovds"
    public PrintableString getIsovds()
    {
	return (PrintableString)mComponents[1];
    }
    
    public void setIsovds(PrintableString isovds)
    {
	mComponents[1] = isovds;
    }
    
    public boolean hasIsovds()
    {
	return componentIsPresent(1);
    }
    
    public void deleteIsovds()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "isovisModelyear"
    public PrintableString getIsovisModelyear()
    {
	return (PrintableString)mComponents[2];
    }
    
    public void setIsovisModelyear(PrintableString isovisModelyear)
    {
	mComponents[2] = isovisModelyear;
    }
    
    public boolean hasIsovisModelyear()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIsovisModelyear()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "isovisSeqPlant"
    public PrintableString getIsovisSeqPlant()
    {
	return (PrintableString)mComponents[3];
    }
    
    public void setIsovisSeqPlant(PrintableString isovisSeqPlant)
    {
	mComponents[3] = isovisSeqPlant;
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "VIN"
	),
	new QName (
	    "NGTP-Dispatch",
	    "VIN"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
					new com.oss.asn1.INTEGER(3)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(3),
				new java.lang.Long(3)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "isowmi",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
					new com.oss.asn1.INTEGER(6)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(6),
				new java.lang.Long(6)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "isovds",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
					new com.oss.asn1.INTEGER(1)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "isovisModelyear",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
					new com.oss.asn1.INTEGER(7)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(7),
				new java.lang.Long(7)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "isovisSeqPlant",
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
     * Get the type descriptor (TypeInfo) of 'this' VIN object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VIN object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VIN
