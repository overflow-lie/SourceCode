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
 * Define the ASN1 Type PersonName from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class PersonName extends Sequence {
    
    /**
     * The default constructor.
     */
    public PersonName()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PersonName(UTF8String16 familyName, UTF8String16 firstName, 
		    UTF8String16 middleName, UTF8String16 prefix, 
		    UTF8String16 suffix)
    {
	setFamilyName(familyName);
	setFirstName(firstName);
	setMiddleName(middleName);
	setPrefix(prefix);
	setSuffix(suffix);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new UTF8String16();
	    case 1:
		return new UTF8String16();
	    case 2:
		return new UTF8String16();
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "familyName"
    public UTF8String16 getFamilyName()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setFamilyName(UTF8String16 familyName)
    {
	mComponents[0] = familyName;
    }
    
    public boolean hasFamilyName()
    {
	return componentIsPresent(0);
    }
    
    public void deleteFamilyName()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "firstName"
    public UTF8String16 getFirstName()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setFirstName(UTF8String16 firstName)
    {
	mComponents[1] = firstName;
    }
    
    public boolean hasFirstName()
    {
	return componentIsPresent(1);
    }
    
    public void deleteFirstName()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "middleName"
    public UTF8String16 getMiddleName()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setMiddleName(UTF8String16 middleName)
    {
	mComponents[2] = middleName;
    }
    
    public boolean hasMiddleName()
    {
	return componentIsPresent(2);
    }
    
    public void deleteMiddleName()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "prefix"
    public UTF8String16 getPrefix()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setPrefix(UTF8String16 prefix)
    {
	mComponents[3] = prefix;
    }
    
    public boolean hasPrefix()
    {
	return componentIsPresent(3);
    }
    
    public void deletePrefix()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "suffix"
    public UTF8String16 getSuffix()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setSuffix(UTF8String16 suffix)
    {
	mComponents[4] = suffix;
    }
    
    public boolean hasSuffix()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSuffix()
    {
	setComponentAbsent(4);
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
	    "PersonName"
	),
	new QName (
	    "NGTP-Service-Data",
	    "PersonName"
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
					new com.oss.asn1.INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "familyName",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
					new com.oss.asn1.INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "firstName",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
					new com.oss.asn1.INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "middleName",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
					new com.oss.asn1.INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "prefix",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
					new com.oss.asn1.INTEGER(255),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "suffix",
		    4,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PersonName object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PersonName object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PersonName
