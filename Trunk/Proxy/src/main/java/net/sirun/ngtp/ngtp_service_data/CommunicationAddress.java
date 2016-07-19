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
 * Define the ASN1 Type CommunicationAddress from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class CommunicationAddress extends Sequence {
    
    /**
     * The default constructor.
     */
    public CommunicationAddress()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CommunicationAddress(NetworkType networkID, 
		    ValidityRange validityRange, Address address)
    {
	setNetworkID(networkID);
	setValidityRange(validityRange);
	setAddress(address);
    }
    
    public void initComponents()
    {
	mComponents[0] = NetworkType.unknown;
	mComponents[1] = ValidityRange.unknown;
	mComponents[2] = new Address();
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
		return NetworkType.unknown;
	    case 1:
		return ValidityRange.unknown;
	    case 2:
		return new Address();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "networkID"
    public NetworkType getNetworkID()
    {
	return (NetworkType)mComponents[0];
    }
    
    public void setNetworkID(NetworkType networkID)
    {
	mComponents[0] = networkID;
    }
    
    
    // Methods for field "validityRange"
    public ValidityRange getValidityRange()
    {
	return (ValidityRange)mComponents[1];
    }
    
    public void setValidityRange(ValidityRange validityRange)
    {
	mComponents[1] = validityRange;
    }
    
    
    
    /**
     * Define the ASN1 Type ValidityRange from ASN1 Module NGTP_Service_Data.
     * @see Enumerated
     */
    public static final class ValidityRange extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private ValidityRange()
	{
	    super(cFirstNumber);
	}
	
	protected ValidityRange(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long unknown = 0;
	    public static final long international = 1;
	    public static final long national = 2;
	    public static final long reserved = 3;
	}
	// Named list definitions.
	public static final ValidityRange unknown =
	    new ValidityRange();
	public static final ValidityRange international =
	    new ValidityRange(1);
	public static final ValidityRange national =
	    new ValidityRange(2);
	public static final ValidityRange reserved =
	    new ValidityRange(3);
	private final static ValidityRange cNamedNumbers[] = {
	     unknown, 
	     international, 
	     national, 
	     reserved
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
	
	public static ValidityRange valueOf(long value)
	{
	    return (ValidityRange)unknown.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"CommunicationAddress$ValidityRange"
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
			"unknown",
			0
		    ),
		    new MemberListElement (
			"international",
			1
		    ),
		    new MemberListElement (
			"national",
			2
		    ),
		    new MemberListElement (
			"reserved",
			3
		    )
		}
	    ),
	    0,
	    unknown
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ValidityRange object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ValidityRange object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ValidityRange

    // Methods for field "address"
    public Address getAddress()
    {
	return (Address)mComponents[2];
    }
    
    public void setAddress(Address address)
    {
	mComponents[2] = address;
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
	    "CommunicationAddress"
	),
	new QName (
	    "NGTP-Service-Data",
	    "CommunicationAddress"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"NetworkType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NetworkType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unknown",
					0
				    ),
				    new MemberListElement (
					"isdn-speech",
					1
				    ),
				    new MemberListElement (
					"isdn-data",
					2
				    ),
				    new MemberListElement (
					"gsm-speech",
					3
				    ),
				    new MemberListElement (
					"gsm-sms",
					4
				    ),
				    new MemberListElement (
					"gsm-bs24",
					5
				    ),
				    new MemberListElement (
					"gsm-gprs",
					6
				    ),
				    new MemberListElement (
					"x-25",
					7
				    ),
				    new MemberListElement (
					"x-400-e-mail",
					8
				    ),
				    new MemberListElement (
					"internet-e-mail",
					9
				    ),
				    new MemberListElement (
					"reserved1",
					10
				    ),
				    new MemberListElement (
					"tcp-ip",
					11
				    ),
				    new MemberListElement (
					"udp-ip",
					12
				    ),
				    new MemberListElement (
					"fax-group-2-3",
					13
				    ),
				    new MemberListElement (
					"fax-group-4",
					14
				    ),
				    new MemberListElement (
					"gsm-bs-26",
					15
				    ),
				    new MemberListElement (
					"gsm-bs-26-udi",
					16
				    ),
				    new MemberListElement (
					"gsm-speech-uus",
					17
				    ),
				    new MemberListElement (
					"reserved",
					31
				    )
				}
			    ),
			    0,
			    NetworkType.unknown
			)
		    ),
		    "networkID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "CommunicationAddress$ValidityRange"
			)
		    ),
		    "validityRange",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
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
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "Address"
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
     * Get the type descriptor (TypeInfo) of 'this' CommunicationAddress object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CommunicationAddress object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CommunicationAddress
