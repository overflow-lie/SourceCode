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
 * Define the ASN1 Type AddressBlock from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class AddressBlock extends Sequence {
    
    /**
     * The default constructor.
     */
    public AddressBlock()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AddressBlock(INTEGER addressId, AddressType address, 
		    AddressUsage addressUsage)
    {
	setAddressId(addressId);
	setAddress(address);
	setAddressUsage(addressUsage);
    }
    
    /**
     * Construct with components.
     */
    public AddressBlock(long addressId, AddressType address, 
		    AddressUsage addressUsage)
    {
	this(new INTEGER(addressId), address, addressUsage);
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new AddressType();
	mComponents[2] = AddressUsage.smsc;
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
		return new AddressType();
	    case 2:
		return AddressUsage.smsc;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "addressId"
    public long getAddressId()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setAddressId(long addressId)
    {
	setAddressId(new INTEGER(addressId));
    }
    
    public void setAddressId(INTEGER addressId)
    {
	mComponents[0] = addressId;
    }
    
    
    // Methods for field "address"
    public AddressType getAddress()
    {
	return (AddressType)mComponents[1];
    }
    
    public void setAddress(AddressType address)
    {
	mComponents[1] = address;
    }
    
    
    // Methods for field "addressUsage"
    public AddressUsage getAddressUsage()
    {
	return (AddressUsage)mComponents[2];
    }
    
    public void setAddressUsage(AddressUsage addressUsage)
    {
	mComponents[2] = addressUsage;
    }
    
    
    
    /**
     * Define the ASN1 Type AddressUsage from ASN1 Module NGTP_Service_Data.
     * @see Enumerated
     */
    public static final class AddressUsage extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private AddressUsage()
	{
	    super(cFirstNumber);
	}
	
	protected AddressUsage(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long smsc = 0;
	    public static final long destination = 1;
	    public static final long ecall = 2;
	    public static final long ecall_backup = 3;
	    public static final long bcall = 4;
	    public static final long psap = 5;
	    public static final long psap_auto = 6;
	}
	// Named list definitions.
	public static final AddressUsage smsc =
	    new AddressUsage();
	public static final AddressUsage destination =
	    new AddressUsage(1);
	public static final AddressUsage ecall =
	    new AddressUsage(2);
	public static final AddressUsage ecall_backup =
	    new AddressUsage(3);
	public static final AddressUsage bcall =
	    new AddressUsage(4);
	public static final AddressUsage psap =
	    new AddressUsage(5);
	public static final AddressUsage psap_auto =
	    new AddressUsage(6);
	private final static AddressUsage cNamedNumbers[] = {
	     smsc, 
	     destination, 
	     ecall, 
	     ecall_backup, 
	     bcall, 
	     psap, 
	     psap_auto
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static AddressUsage valueOf(long value)
	{
	    return (AddressUsage)smsc.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"AddressBlock$AddressUsage"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"smsc",
			0
		    ),
		    new MemberListElement (
			"destination",
			1
		    ),
		    new MemberListElement (
			"ecall",
			2
		    ),
		    new MemberListElement (
			"ecall-backup",
			3
		    ),
		    new MemberListElement (
			"bcall",
			4
		    ),
		    new MemberListElement (
			"psap",
			5
		    ),
		    new MemberListElement (
			"psap-auto",
			6
		    )
		}
	    ),
	    0,
	    smsc
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' AddressUsage object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' AddressUsage object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for AddressUsage

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
	    "AddressBlock"
	),
	new QName (
	    "NGTP-Service-Data",
	    "AddressBlock"
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
		    ),
		    "addressId",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"AddressType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"AddressType"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "AddressType"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "address",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "AddressBlock$AddressUsage"
			)
		    ),
		    "addressUsage",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' AddressBlock object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AddressBlock object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AddressBlock
