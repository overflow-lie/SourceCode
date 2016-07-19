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
 * Define the ASN1 Type Address from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class Address extends Choice {
    
    /**
     * The default constructor.
     */
    public Address()
    {
    }
    
    public static final  int  address_bcd_chosen = 1;
    public static final  int  address_ascii_chosen = 2;
    
    // Methods for field "address_bcd"
    public static Address createAddressWithAddress_bcd(Address_bcd address_bcd)
    {
	Address __object = new Address();

	__object.setAddress_bcd(address_bcd);
	return __object;
    }
    
    public boolean hasAddress_bcd()
    {
	return getChosenFlag() == address_bcd_chosen;
    }
    
    public void setAddress_bcd(Address_bcd address_bcd)
    {
	setChosenValue(address_bcd);
	setChosenFlag(address_bcd_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Address_bcd from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Address_bcd extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Address_bcd()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Address_bcd(INTEGER[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(INTEGER element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(INTEGER element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized INTEGER get(int atIndex)
	{
	    return (INTEGER)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(INTEGER element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(INTEGER element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new INTEGER();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"Address$Address_bcd"
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
			new com.oss.asn1.INTEGER(20),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(20)
	    ),
	    new TypeInfoRef (
		new IntegerInfo (
		    new Tags (
			new short[] {
			    0x0002
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
			    new com.oss.asn1.INTEGER(15),
			    0
			)
		    ),
		    new Bounds (
			new java.lang.Long(0),
			new java.lang.Long(15)
		    ),
		    null
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Address_bcd object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Address_bcd object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Address_bcd

    // Methods for field "address_ascii"
    public static Address createAddressWithAddress_ascii(OctetString address_ascii)
    {
	Address __object = new Address();

	__object.setAddress_ascii(address_ascii);
	return __object;
    }
    
    public boolean hasAddress_ascii()
    {
	return getChosenFlag() == address_ascii_chosen;
    }
    
    public void setAddress_ascii(OctetString address_ascii)
    {
	setChosenValue(address_ascii);
	setChosenFlag(address_ascii_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case address_bcd_chosen:
		return new Address_bcd();
	    case address_ascii_chosen:
		return new OctetString();
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
	    "net.sirun.ngtp.ngtp_service_data",
	    "Address"
	),
	new QName (
	    "NGTP-Service-Data",
	    "Address"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "Address$Address_bcd"
			)
		    ),
		    "address-bcd",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(20),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(20)
			    )
			)
		    ),
		    "address-ascii",
		    1,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' Address object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Address object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Address
