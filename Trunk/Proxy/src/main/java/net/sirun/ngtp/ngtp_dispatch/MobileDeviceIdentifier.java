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
 * Define the ASN1 Type MobileDeviceIdentifier from ASN1 Module NGTP_Dispatch.
 * @see Sequence
 */

public class MobileDeviceIdentifier extends Sequence {
    
    /**
     * The default constructor.
     */
    public MobileDeviceIdentifier()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MobileDeviceIdentifier(PrintableString publicAddress, 
		    PrintableString equipmentIdentifier, 
		    PrintableString subscriberIdentity, PrintableString iccId)
    {
	setPublicAddress(publicAddress);
	setEquipmentIdentifier(equipmentIdentifier);
	setSubscriberIdentity(subscriberIdentity);
	setIccId(iccId);
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
    
    
    // Methods for field "publicAddress"
    public PrintableString getPublicAddress()
    {
	return (PrintableString)mComponents[0];
    }
    
    public void setPublicAddress(PrintableString publicAddress)
    {
	mComponents[0] = publicAddress;
    }
    
    public boolean hasPublicAddress()
    {
	return componentIsPresent(0);
    }
    
    public void deletePublicAddress()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "equipmentIdentifier"
    public PrintableString getEquipmentIdentifier()
    {
	return (PrintableString)mComponents[1];
    }
    
    public void setEquipmentIdentifier(PrintableString equipmentIdentifier)
    {
	mComponents[1] = equipmentIdentifier;
    }
    
    public boolean hasEquipmentIdentifier()
    {
	return componentIsPresent(1);
    }
    
    public void deleteEquipmentIdentifier()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "subscriberIdentity"
    public PrintableString getSubscriberIdentity()
    {
	return (PrintableString)mComponents[2];
    }
    
    public void setSubscriberIdentity(PrintableString subscriberIdentity)
    {
	mComponents[2] = subscriberIdentity;
    }
    
    public boolean hasSubscriberIdentity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSubscriberIdentity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "iccId"
    public PrintableString getIccId()
    {
	return (PrintableString)mComponents[3];
    }
    
    public void setIccId(PrintableString iccId)
    {
	mComponents[3] = iccId;
    }
    
    public boolean hasIccId()
    {
	return componentIsPresent(3);
    }
    
    public void deleteIccId()
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "MobileDeviceIdentifier"
	),
	new QName (
	    "NGTP-Dispatch",
	    "MobileDeviceIdentifier"
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "publicAddress",
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "equipmentIdentifier",
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "subscriberIdentity",
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
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(32),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(32)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "iccId",
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
     * Get the type descriptor (TypeInfo) of 'this' MobileDeviceIdentifier object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MobileDeviceIdentifier object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MobileDeviceIdentifier
