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
 * Define the ASN1 Type ApplicationConfiguration from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class ApplicationConfiguration extends Sequence {
    
    /**
     * The default constructor.
     */
    public ApplicationConfiguration()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ApplicationConfiguration(BOOLEAN eCall_requestCscNumber, 
		    ECall_psapType eCall_psapType)
    {
	setECall_requestCscNumber(eCall_requestCscNumber);
	setECall_psapType(eCall_psapType);
    }
    
    /**
     * Construct with components.
     */
    public ApplicationConfiguration(boolean eCall_requestCscNumber, 
		    ECall_psapType eCall_psapType)
    {
	this(new BOOLEAN(eCall_requestCscNumber), eCall_psapType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new BOOLEAN();
	mComponents[1] = ECall_psapType.notAllowed;
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
		return new BOOLEAN();
	    case 1:
		return ECall_psapType.notAllowed;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "eCall_requestCscNumber"
    public boolean getECall_requestCscNumber()
    {
	return ((BOOLEAN)mComponents[0]).booleanValue();
    }
    
    public void setECall_requestCscNumber(boolean eCall_requestCscNumber)
    {
	setECall_requestCscNumber(new BOOLEAN(eCall_requestCscNumber));
    }
    
    public void setECall_requestCscNumber(BOOLEAN eCall_requestCscNumber)
    {
	mComponents[0] = eCall_requestCscNumber;
    }
    
    
    // Methods for field "eCall_psapType"
    public ECall_psapType getECall_psapType()
    {
	return (ECall_psapType)mComponents[1];
    }
    
    public void setECall_psapType(ECall_psapType eCall_psapType)
    {
	mComponents[1] = eCall_psapType;
    }
    
    
    
    /**
     * Define the ASN1 Type ECall_psapType from ASN1 Module NGTP_Service_Data.
     * @see Enumerated
     */
    public static final class ECall_psapType extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private ECall_psapType()
	{
	    super(cFirstNumber);
	}
	
	protected ECall_psapType(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long notAllowed = 0;
	    public static final long manualOnly = 1;
	    public static final long autoAllowed = 2;
	    public static final long eUeCall = 3;
	}
	// Named list definitions.
	public static final ECall_psapType notAllowed =
	    new ECall_psapType();
	public static final ECall_psapType manualOnly =
	    new ECall_psapType(1);
	public static final ECall_psapType autoAllowed =
	    new ECall_psapType(2);
	public static final ECall_psapType eUeCall =
	    new ECall_psapType(3);
	private final static ECall_psapType cNamedNumbers[] = {
	     notAllowed, 
	     manualOnly, 
	     autoAllowed, 
	     eUeCall
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
	
	public static ECall_psapType valueOf(long value)
	{
	    return (ECall_psapType)notAllowed.lookupValue(value);
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
		"ApplicationConfiguration$ECall_psapType"
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
			"notAllowed",
			0
		    ),
		    new MemberListElement (
			"manualOnly",
			1
		    ),
		    new MemberListElement (
			"autoAllowed",
			2
		    ),
		    new MemberListElement (
			"eUeCall",
			3
		    )
		}
	    ),
	    0,
	    notAllowed
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ECall_psapType object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ECall_psapType object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ECall_psapType

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
	    "ApplicationConfiguration"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ApplicationConfiguration"
	),
	12314,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "eCall-requestCscNumber",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "ApplicationConfiguration$ECall_psapType"
			)
		    ),
		    "eCall-psapType",
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
     * Get the type descriptor (TypeInfo) of 'this' ApplicationConfiguration object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ApplicationConfiguration object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ApplicationConfiguration
