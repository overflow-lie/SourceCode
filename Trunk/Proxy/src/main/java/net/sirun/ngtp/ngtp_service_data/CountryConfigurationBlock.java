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
 * Define the ASN1 Type CountryConfigurationBlock from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class CountryConfigurationBlock extends Sequence {
    
    /**
     * The default constructor.
     */
    public CountryConfigurationBlock()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CountryConfigurationBlock(Applications applications, 
		    INTEGER validCountryCode, 
		    ApplicationConfiguration applicationConfig, 
		    Addresses addresses, BOOLEAN activated)
    {
	setApplications(applications);
	setValidCountryCode(validCountryCode);
	setApplicationConfig(applicationConfig);
	setAddresses(addresses);
	setActivated(activated);
    }
    
    /**
     * Construct with components.
     */
    public CountryConfigurationBlock(Applications applications, 
		    long validCountryCode, 
		    ApplicationConfiguration applicationConfig, 
		    Addresses addresses, boolean activated)
    {
	this(applications, new INTEGER(validCountryCode), 
	     applicationConfig, addresses, new BOOLEAN(activated));
    }
    
    /**
     * Construct with required components.
     */
    public CountryConfigurationBlock(long validCountryCode, 
		    ApplicationConfiguration applicationConfig, 
		    Addresses addresses, boolean activated)
    {
	setValidCountryCode(validCountryCode);
	setApplicationConfig(applicationConfig);
	setAddresses(addresses);
	setActivated(activated);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Applications();
	mComponents[1] = new INTEGER();
	mComponents[2] = new ApplicationConfiguration();
	mComponents[3] = new Addresses();
	mComponents[4] = new BOOLEAN();
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
		return new Applications();
	    case 1:
		return new INTEGER();
	    case 2:
		return new ApplicationConfiguration();
	    case 3:
		return new Addresses();
	    case 4:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "applications"
    public Applications getApplications()
    {
	return (Applications)mComponents[0];
    }
    
    public void setApplications(Applications applications)
    {
	mComponents[0] = applications;
    }
    
    public boolean hasApplications()
    {
	return componentIsPresent(0);
    }
    
    public void deleteApplications()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type Applications from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Applications extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Applications()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Applications(INTEGER[] elements)
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
		"CountryConfigurationBlock$Applications"
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
			new com.oss.asn1.INTEGER(31),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(31)
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
			    new com.oss.asn1.INTEGER(255),
			    0
			)
		    ),
		    new Bounds (
			new java.lang.Long(0),
			new java.lang.Long(255)
		    ),
		    null
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Applications object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Applications object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Applications

    // Methods for field "validCountryCode"
    public long getValidCountryCode()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setValidCountryCode(long validCountryCode)
    {
	setValidCountryCode(new INTEGER(validCountryCode));
    }
    
    public void setValidCountryCode(INTEGER validCountryCode)
    {
	mComponents[1] = validCountryCode;
    }
    
    
    // Methods for field "applicationConfig"
    public ApplicationConfiguration getApplicationConfig()
    {
	return (ApplicationConfiguration)mComponents[2];
    }
    
    public void setApplicationConfig(ApplicationConfiguration applicationConfig)
    {
	mComponents[2] = applicationConfig;
    }
    
    
    // Methods for field "addresses"
    public Addresses getAddresses()
    {
	return (Addresses)mComponents[3];
    }
    
    public void setAddresses(Addresses addresses)
    {
	mComponents[3] = addresses;
    }
    
    
    
    /**
     * Define the ASN1 Type Addresses from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Addresses extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Addresses()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Addresses(AddressBlock[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(AddressBlock element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(AddressBlock element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized AddressBlock get(int atIndex)
	{
	    return (AddressBlock)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(AddressBlock element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(AddressBlock element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new AddressBlock();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"CountryConfigurationBlock$Addresses"
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
		    "AddressBlock"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Addresses object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Addresses object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Addresses

    // Methods for field "activated"
    public boolean getActivated()
    {
	return ((BOOLEAN)mComponents[4]).booleanValue();
    }
    
    public void setActivated(boolean activated)
    {
	setActivated(new BOOLEAN(activated));
    }
    
    public void setActivated(BOOLEAN activated)
    {
	mComponents[4] = activated;
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
	    "CountryConfigurationBlock"
	),
	new QName (
	    "NGTP-Service-Data",
	    "CountryConfigurationBlock"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "CountryConfigurationBlock$Applications"
			)
		    ),
		    "applications",
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "validCountryCode",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"ApplicationConfiguration"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ApplicationConfiguration"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ApplicationConfiguration"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ApplicationConfiguration"
				)
			    ),
			    0
			)
		    ),
		    "applicationConfig",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "CountryConfigurationBlock$Addresses"
			)
		    ),
		    "addresses",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "activated",
		    4,
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
			new TagDecoderElement((short)0x8001, 1)
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CountryConfigurationBlock object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CountryConfigurationBlock object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CountryConfigurationBlock
