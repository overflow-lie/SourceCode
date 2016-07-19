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
 * Define the ASN1 Type PointOfInterest from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class PointOfInterest extends Sequence {
    
    /**
     * The default constructor.
     */
    public PointOfInterest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PointOfInterest(UTF8String16 subject, UTF8String16 category, 
		    UTF8String16 freetext, PersonName name, 
		    UTF8String16 organization, PostalAddress address, 
		    Phone phone1, Phone phone2, Phone phone3, Phone phone4, 
		    UTF8String16 url, UTF8String16 email, 
		    BasicPosition geoCoordinates, BOOLEAN useAsDestination, 
		    UTF8String16 enhPOIurl, Attributes attributes)
    {
	setSubject(subject);
	setCategory(category);
	setFreetext(freetext);
	setName(name);
	setOrganization(organization);
	setAddress(address);
	setPhone1(phone1);
	setPhone2(phone2);
	setPhone3(phone3);
	setPhone4(phone4);
	setUrl(url);
	setEmail(email);
	setGeoCoordinates(geoCoordinates);
	setUseAsDestination(useAsDestination);
	setEnhPOIurl(enhPOIurl);
	setAttributes(attributes);
    }
    
    /**
     * Construct with components.
     */
    public PointOfInterest(UTF8String16 subject, UTF8String16 category, 
		    UTF8String16 freetext, PersonName name, 
		    UTF8String16 organization, PostalAddress address, 
		    Phone phone1, Phone phone2, Phone phone3, Phone phone4, 
		    UTF8String16 url, UTF8String16 email, 
		    BasicPosition geoCoordinates, boolean useAsDestination, 
		    UTF8String16 enhPOIurl, Attributes attributes)
    {
	this(subject, category, freetext, name, organization, address, 
	     phone1, phone2, phone3, phone4, url, email, 
	     geoCoordinates, new BOOLEAN(useAsDestination), enhPOIurl, 
	     attributes);
    }
    
    /**
     * Construct with required components.
     */
    public PointOfInterest(UTF8String16 subject, boolean useAsDestination)
    {
	setSubject(subject);
	setUseAsDestination(useAsDestination);
    }
    
    public void initComponents()
    {
	mComponents[0] = new UTF8String16();
	mComponents[1] = new UTF8String16();
	mComponents[2] = new UTF8String16();
	mComponents[3] = new PersonName();
	mComponents[4] = new UTF8String16();
	mComponents[5] = new PostalAddress();
	mComponents[6] = new Phone();
	mComponents[7] = new Phone();
	mComponents[8] = new Phone();
	mComponents[9] = new Phone();
	mComponents[10] = new UTF8String16();
	mComponents[11] = new UTF8String16();
	mComponents[12] = new BasicPosition();
	mComponents[13] = new BOOLEAN();
	mComponents[14] = new UTF8String16();
	mComponents[15] = new Attributes();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[16];
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
		return new PersonName();
	    case 4:
		return new UTF8String16();
	    case 5:
		return new PostalAddress();
	    case 6:
		return new Phone();
	    case 7:
		return new Phone();
	    case 8:
		return new Phone();
	    case 9:
		return new Phone();
	    case 10:
		return new UTF8String16();
	    case 11:
		return new UTF8String16();
	    case 12:
		return new BasicPosition();
	    case 13:
		return new BOOLEAN();
	    case 14:
		return new UTF8String16();
	    case 15:
		return new Attributes();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "subject"
    public UTF8String16 getSubject()
    {
	return (UTF8String16)mComponents[0];
    }
    
    public void setSubject(UTF8String16 subject)
    {
	mComponents[0] = subject;
    }
    
    
    // Methods for field "category"
    public UTF8String16 getCategory()
    {
	return (UTF8String16)mComponents[1];
    }
    
    public void setCategory(UTF8String16 category)
    {
	mComponents[1] = category;
    }
    
    public boolean hasCategory()
    {
	return componentIsPresent(1);
    }
    
    public void deleteCategory()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "freetext"
    public UTF8String16 getFreetext()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setFreetext(UTF8String16 freetext)
    {
	mComponents[2] = freetext;
    }
    
    public boolean hasFreetext()
    {
	return componentIsPresent(2);
    }
    
    public void deleteFreetext()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "name"
    public PersonName getName()
    {
	return (PersonName)mComponents[3];
    }
    
    public void setName(PersonName name)
    {
	mComponents[3] = name;
    }
    
    public boolean hasName()
    {
	return componentIsPresent(3);
    }
    
    public void deleteName()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "organization"
    public UTF8String16 getOrganization()
    {
	return (UTF8String16)mComponents[4];
    }
    
    public void setOrganization(UTF8String16 organization)
    {
	mComponents[4] = organization;
    }
    
    public boolean hasOrganization()
    {
	return componentIsPresent(4);
    }
    
    public void deleteOrganization()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "address"
    public PostalAddress getAddress()
    {
	return (PostalAddress)mComponents[5];
    }
    
    public void setAddress(PostalAddress address)
    {
	mComponents[5] = address;
    }
    
    public boolean hasAddress()
    {
	return componentIsPresent(5);
    }
    
    public void deleteAddress()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "phone1"
    public Phone getPhone1()
    {
	return (Phone)mComponents[6];
    }
    
    public void setPhone1(Phone phone1)
    {
	mComponents[6] = phone1;
    }
    
    public boolean hasPhone1()
    {
	return componentIsPresent(6);
    }
    
    public void deletePhone1()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "phone2"
    public Phone getPhone2()
    {
	return (Phone)mComponents[7];
    }
    
    public void setPhone2(Phone phone2)
    {
	mComponents[7] = phone2;
    }
    
    public boolean hasPhone2()
    {
	return componentIsPresent(7);
    }
    
    public void deletePhone2()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "phone3"
    public Phone getPhone3()
    {
	return (Phone)mComponents[8];
    }
    
    public void setPhone3(Phone phone3)
    {
	mComponents[8] = phone3;
    }
    
    public boolean hasPhone3()
    {
	return componentIsPresent(8);
    }
    
    public void deletePhone3()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "phone4"
    public Phone getPhone4()
    {
	return (Phone)mComponents[9];
    }
    
    public void setPhone4(Phone phone4)
    {
	mComponents[9] = phone4;
    }
    
    public boolean hasPhone4()
    {
	return componentIsPresent(9);
    }
    
    public void deletePhone4()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "url"
    public UTF8String16 getUrl()
    {
	return (UTF8String16)mComponents[10];
    }
    
    public void setUrl(UTF8String16 url)
    {
	mComponents[10] = url;
    }
    
    public boolean hasUrl()
    {
	return componentIsPresent(10);
    }
    
    public void deleteUrl()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "email"
    public UTF8String16 getEmail()
    {
	return (UTF8String16)mComponents[11];
    }
    
    public void setEmail(UTF8String16 email)
    {
	mComponents[11] = email;
    }
    
    public boolean hasEmail()
    {
	return componentIsPresent(11);
    }
    
    public void deleteEmail()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "geoCoordinates"
    public BasicPosition getGeoCoordinates()
    {
	return (BasicPosition)mComponents[12];
    }
    
    public void setGeoCoordinates(BasicPosition geoCoordinates)
    {
	mComponents[12] = geoCoordinates;
    }
    
    public boolean hasGeoCoordinates()
    {
	return componentIsPresent(12);
    }
    
    public void deleteGeoCoordinates()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "useAsDestination"
    public boolean getUseAsDestination()
    {
	return ((BOOLEAN)mComponents[13]).booleanValue();
    }
    
    public void setUseAsDestination(boolean useAsDestination)
    {
	setUseAsDestination(new BOOLEAN(useAsDestination));
    }
    
    public void setUseAsDestination(BOOLEAN useAsDestination)
    {
	mComponents[13] = useAsDestination;
    }
    
    
    // Methods for field "enhPOIurl"
    public UTF8String16 getEnhPOIurl()
    {
	return (UTF8String16)mComponents[14];
    }
    
    public void setEnhPOIurl(UTF8String16 enhPOIurl)
    {
	mComponents[14] = enhPOIurl;
    }
    
    public boolean hasEnhPOIurl()
    {
	return componentIsPresent(14);
    }
    
    public void deleteEnhPOIurl()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "attributes"
    public Attributes getAttributes()
    {
	return (Attributes)mComponents[15];
    }
    
    public void setAttributes(Attributes attributes)
    {
	mComponents[15] = attributes;
    }
    
    public boolean hasAttributes()
    {
	return componentIsPresent(15);
    }
    
    public void deleteAttributes()
    {
	setComponentAbsent(15);
    }
    
    
    
    /**
     * Define the ASN1 Type Attributes from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Attributes extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Attributes()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Attributes(PointOfInterestAttribute[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(PointOfInterestAttribute element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(PointOfInterestAttribute element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized PointOfInterestAttribute get(int atIndex)
	{
	    return (PointOfInterestAttribute)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(PointOfInterestAttribute element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(PointOfInterestAttribute element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PointOfInterestAttribute();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x800f
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"PointOfInterest$Attributes"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(0), 
			new com.oss.asn1.INTEGER(15),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(15)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "PointOfInterestAttribute"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Attributes object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Attributes object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Attributes

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
	    "PointOfInterest"
	),
	new QName (
	    "NGTP-Service-Data",
	    "PointOfInterest"
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
		    "subject",
		    0,
		    2,
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
		    "category",
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
					new com.oss.asn1.INTEGER(1023),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "freetext",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PersonName"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PersonName"
				)
			    ),
			    0
			)
		    ),
		    "name",
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
		    "organization",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PostalAddress"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PostalAddress"
				)
			    ),
			    0
			)
		    ),
		    "address",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"Phone"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"Phone"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0
			)
		    ),
		    "phone1",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"Phone"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"Phone"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0
			)
		    ),
		    "phone2",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"Phone"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"Phone"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0
			)
		    ),
		    "phone3",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"Phone"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"Phone"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Phone"
				)
			    ),
			    0
			)
		    ),
		    "phone4",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "url",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "email",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BasicPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0
			)
		    ),
		    "geoCoordinates",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    12314,
			    null
			)
		    ),
		    "useAsDestination",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
					new com.oss.asn1.INTEGER(1023),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "enhPOIurl",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "PointOfInterest$Attributes"
			)
		    ),
		    "attributes",
		    15,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PointOfInterest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PointOfInterest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PointOfInterest
