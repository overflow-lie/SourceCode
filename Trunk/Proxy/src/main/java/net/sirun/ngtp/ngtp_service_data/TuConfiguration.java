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
 * Define the ASN1 Type TuConfiguration from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TuConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public TuConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TuConfiguration(TuConfigVersion configVersion, Countries countries)
    {
	setConfigVersion(configVersion);
	setCountries(countries);
    }
    
    public void initComponents()
    {
	mComponents[0] = new TuConfigVersion();
	mComponents[1] = new Countries();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new TuConfigVersion();
	    case 1:
		return new Countries();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "configVersion"
    public TuConfigVersion getConfigVersion()
    {
	return (TuConfigVersion)mComponents[0];
    }
    
    public void setConfigVersion(TuConfigVersion configVersion)
    {
	mComponents[0] = configVersion;
    }
    
    
    // Methods for field "countries"
    public Countries getCountries()
    {
	return (Countries)mComponents[1];
    }
    
    public void setCountries(Countries countries)
    {
	mComponents[1] = countries;
    }
    
    
    
    /**
     * Define the ASN1 Type Countries from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Countries extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Countries()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Countries(CountryConfigurationBlock[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(CountryConfigurationBlock element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(CountryConfigurationBlock element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized CountryConfigurationBlock get(int atIndex)
	{
	    return (CountryConfigurationBlock)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(CountryConfigurationBlock element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(CountryConfigurationBlock element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new CountryConfigurationBlock();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"TuConfiguration$Countries"
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
			new com.oss.asn1.INTEGER(255),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(255)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "CountryConfigurationBlock"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Countries object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Countries object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Countries

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
	    "TuConfiguration"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TuConfiguration"
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
				"net.sirun.ngtp.ngtp_service_data",
				"TuConfigVersion"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TuConfigVersion"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new TuConfigVersion(0), 
				    new TuConfigVersion(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "configVersion",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "TuConfiguration$Countries"
			)
		    ),
		    "countries",
		    1,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TuConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TuConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TuConfiguration
