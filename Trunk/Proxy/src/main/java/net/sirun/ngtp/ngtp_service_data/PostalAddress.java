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
 * Define the ASN1 Type PostalAddress from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class PostalAddress extends Sequence {
    
    /**
     * The default constructor.
     */
    public PostalAddress()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PostalAddress(UTF8String16 street, UTF8String16 houseNumber, 
		    UTF8String16 city, UTF8String16 region, 
		    UTF8String16 postalCode, UTF8String16 country)
    {
	setStreet(street);
	setHouseNumber(houseNumber);
	setCity(city);
	setRegion(region);
	setPostalCode(postalCode);
	setCountry(country);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new UTF8String16();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new UTF8String16();
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
		return new UTF8String16();
	    case 1:
		return new UTF8String16();
	    case 2:
		return new UTF8String16();
	    case 3:
		return new UTF8String16();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "street"
    public UTF8String16 getStreet()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setStreet(UTF8String16 street)
    {
	mComponents[0] = street;
    }
    
    public boolean hasStreet()
    {
	return componentIsPresent(0);
    }
    
    public void deleteStreet()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "houseNumber"
    public UTF8String16 getHouseNumber()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setHouseNumber(UTF8String16 houseNumber)
    {
	mComponents[1] = houseNumber;
    }
    
    public boolean hasHouseNumber()
    {
	return componentIsPresent(1);
    }
    
    public void deleteHouseNumber()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "city"
    public UTF8String16 getCity()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setCity(UTF8String16 city)
    {
	mComponents[2] = city;
    }
    
    public boolean hasCity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteCity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "region"
    public UTF8String16 getRegion()
    {
	return (UTF8String16)mComponents[3];
    }
    
    public void setRegion(UTF8String16 region)
    {
	mComponents[3] = region;
    }
    
    public boolean hasRegion()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRegion()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "postalCode"
    public UTF8String16 getPostalCode()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setPostalCode(UTF8String16 postalCode)
    {
	mComponents[4] = postalCode;
    }
    
    public boolean hasPostalCode()
    {
	return componentIsPresent(4);
    }
    
    public void deletePostalCode()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "country"
    public UTF8String16 getCountry()
    {
	return (UTF8String16)mComponents[5];
    }
    
    public void setCountry(UTF8String16 country)
    {
	mComponents[5] = country;
    }
    
    public boolean hasCountry()
    {
	return componentIsPresent(5);
    }
    
    public void deleteCountry()
    {
	setComponentAbsent(5);
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
	    "PostalAddress"
	),
	new QName (
	    "NGTP-Service-Data",
	    "PostalAddress"
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
		    "street",
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
		    "houseNumber",
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
		    "city",
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
		    "region",
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
		    "postalCode",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "country",
		    5,
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
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' PostalAddress object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PostalAddress object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PostalAddress
