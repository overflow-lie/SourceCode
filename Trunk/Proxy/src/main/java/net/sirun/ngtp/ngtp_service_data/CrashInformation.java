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
 * Define the ASN1 Type CrashInformation from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class CrashInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public CrashInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CrashInformation(OctetString data, INTEGER passengers, 
		    INTEGER severity, Type type)
    {
	setData(data);
	setPassengers(passengers);
	setSeverity(severity);
	setType(type);
    }
    
    /**
     * Construct with components.
     */
    public CrashInformation(OctetString data, long passengers, long severity, 
		    Type type)
    {
	this(data, new INTEGER(passengers), new INTEGER(severity), type);
    }
    
    public void initComponents()
    {
	mComponents[0] = new OctetString();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new Type();
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
		return new OctetString();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new Type();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "data"
    public OctetString getData()
    {
	return (OctetString)mComponents[0];
    }
    
    public void setData(OctetString data)
    {
	mComponents[0] = data;
    }
    
    public boolean hasData()
    {
	return componentIsPresent(0);
    }
    
    public void deleteData()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "passengers"
    public long getPassengers()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPassengers(long passengers)
    {
	setPassengers(new INTEGER(passengers));
    }
    
    public void setPassengers(INTEGER passengers)
    {
	mComponents[1] = passengers;
    }
    
    public boolean hasPassengers()
    {
	return componentIsPresent(1);
    }
    
    public void deletePassengers()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "severity"
    public long getSeverity()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setSeverity(long severity)
    {
	setSeverity(new INTEGER(severity));
    }
    
    public void setSeverity(INTEGER severity)
    {
	mComponents[2] = severity;
    }
    
    public boolean hasSeverity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteSeverity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "type"
    public Type getType()
    {
	return (Type)mComponents[3];
    }
    
    public void setType(Type type)
    {
	mComponents[3] = type;
    }
    
    public boolean hasType()
    {
	return componentIsPresent(3);
    }
    
    public void deleteType()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Type from ASN1 Module NGTP_Service_Data.
     * @see Sequence
     */
    public static class Type extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Type()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Type(BOOLEXT frontCrash, BOOLEXT rearCrash, BOOLEXT sideCrash, 
			BOOLEXT rollover)
	{
	    setFrontCrash(frontCrash);
	    setRearCrash(rearCrash);
	    setSideCrash(sideCrash);
	    setRollover(rollover);
	}
	
	public void initComponents()
	{
	    mComponents[0] = BOOLEXT.isFalse;
	    mComponents[1] = BOOLEXT.isFalse;
	    mComponents[2] = BOOLEXT.isFalse;
	    mComponents[3] = BOOLEXT.isFalse;
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
		    return BOOLEXT.isFalse;
		case 1:
		    return BOOLEXT.isFalse;
		case 2:
		    return BOOLEXT.isFalse;
		case 3:
		    return BOOLEXT.isFalse;
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "frontCrash"
	public BOOLEXT getFrontCrash()
	{
	    return (BOOLEXT)mComponents[0];
	}
	
	public void setFrontCrash(BOOLEXT frontCrash)
	{
	    mComponents[0] = frontCrash;
	}
	
	
	// Methods for field "rearCrash"
	public BOOLEXT getRearCrash()
	{
	    return (BOOLEXT)mComponents[1];
	}
	
	public void setRearCrash(BOOLEXT rearCrash)
	{
	    mComponents[1] = rearCrash;
	}
	
	
	// Methods for field "sideCrash"
	public BOOLEXT getSideCrash()
	{
	    return (BOOLEXT)mComponents[2];
	}
	
	public void setSideCrash(BOOLEXT sideCrash)
	{
	    mComponents[2] = sideCrash;
	}
	
	
	// Methods for field "rollover"
	public BOOLEXT getRollover()
	{
	    return (BOOLEXT)mComponents[3];
	}
	
	public void setRollover(BOOLEXT rollover)
	{
	    mComponents[3] = rollover;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8003
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"CrashInformation$Type"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
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
				    "BOOLEXT"
				),
				new QName (
				    "NGTP-Service-Data",
				    "BOOLEXT"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "isFalse",
					    0
					),
					new MemberListElement (
					    "isTrue",
					    1
					),
					new MemberListElement (
					    "isUnused",
					    2
					),
					new MemberListElement (
					    "isUnknown",
					    3
					)
				    }
				),
				0,
				BOOLEXT.isFalse
			    )
			),
			"frontCrash",
			0,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BOOLEXT"
				),
				new QName (
				    "NGTP-Service-Data",
				    "BOOLEXT"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "isFalse",
					    0
					),
					new MemberListElement (
					    "isTrue",
					    1
					),
					new MemberListElement (
					    "isUnused",
					    2
					),
					new MemberListElement (
					    "isUnknown",
					    3
					)
				    }
				),
				0,
				BOOLEXT.isFalse
			    )
			),
			"rearCrash",
			1,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BOOLEXT"
				),
				new QName (
				    "NGTP-Service-Data",
				    "BOOLEXT"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "isFalse",
					    0
					),
					new MemberListElement (
					    "isTrue",
					    1
					),
					new MemberListElement (
					    "isUnused",
					    2
					),
					new MemberListElement (
					    "isUnknown",
					    3
					)
				    }
				),
				0,
				BOOLEXT.isFalse
			    )
			),
			"sideCrash",
			2,
			2,
			null
		    ),
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8003
				    }
				),
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BOOLEXT"
				),
				new QName (
				    "NGTP-Service-Data",
				    "BOOLEXT"
				),
				12314,
				null,
				new MemberList (
				    new MemberListElement[] {
					new MemberListElement (
					    "isFalse",
					    0
					),
					new MemberListElement (
					    "isTrue",
					    1
					),
					new MemberListElement (
					    "isUnused",
					    2
					),
					new MemberListElement (
					    "isUnknown",
					    3
					)
				    }
				),
				0,
				BOOLEXT.isFalse
			    )
			),
			"rollover",
			3,
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
	 * Get the type descriptor (TypeInfo) of 'this' Type object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Type object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Type

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
	    "CrashInformation"
	),
	new QName (
	    "NGTP-Service-Data",
	    "CrashInformation"
	),
	12318,
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
					new com.oss.asn1.INTEGER(511),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(511)
			    )
			)
		    ),
		    "data",
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
		    ),
		    "passengers",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    ),
		    "severity",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "CrashInformation$Type"
			)
		    ),
		    "type",
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
     * Get the type descriptor (TypeInfo) of 'this' CrashInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CrashInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CrashInformation
