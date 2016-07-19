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
 * Define the ASN1 Type NetworkInformation from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class NetworkInformation extends Sequence {
    
    /**
     * The default constructor.
     */
    public NetworkInformation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NetworkInformation(NetworkRegistrationStatus status, 
		    NetworkLocation location, INTEGER rxLevelPerc)
    {
	setStatus(status);
	setLocation(location);
	setRxLevelPerc(rxLevelPerc);
    }
    
    /**
     * Construct with components.
     */
    public NetworkInformation(NetworkRegistrationStatus status, 
		    NetworkLocation location, long rxLevelPerc)
    {
	this(status, location, new INTEGER(rxLevelPerc));
    }
    
    /**
     * Construct with required components.
     */
    public NetworkInformation(NetworkRegistrationStatus status, 
		    long rxLevelPerc)
    {
	setStatus(status);
	setRxLevelPerc(rxLevelPerc);
    }
    
    public void initComponents()
    {
	mComponents[0] = NetworkRegistrationStatus.notRegistered;
	mComponents[1] = new NetworkLocation();
	mComponents[2] = new INTEGER();
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
		return NetworkRegistrationStatus.notRegistered;
	    case 1:
		return new NetworkLocation();
	    case 2:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "status"
    public NetworkRegistrationStatus getStatus()
    {
	return (NetworkRegistrationStatus)mComponents[0];
    }
    
    public void setStatus(NetworkRegistrationStatus status)
    {
	mComponents[0] = status;
    }
    
    
    // Methods for field "location"
    public NetworkLocation getLocation()
    {
	return (NetworkLocation)mComponents[1];
    }
    
    public void setLocation(NetworkLocation location)
    {
	mComponents[1] = location;
    }
    
    public boolean hasLocation()
    {
	return componentIsPresent(1);
    }
    
    public void deleteLocation()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rxLevelPerc"
    public long getRxLevelPerc()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setRxLevelPerc(long rxLevelPerc)
    {
	setRxLevelPerc(new INTEGER(rxLevelPerc));
    }
    
    public void setRxLevelPerc(INTEGER rxLevelPerc)
    {
	mComponents[2] = rxLevelPerc;
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
	    "NetworkInformation"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NetworkInformation"
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
				"NetworkRegistrationStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NetworkRegistrationStatus"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notRegistered",
					0
				    ),
				    new MemberListElement (
					"registered",
					1
				    )
				}
			    ),
			    0,
			    NetworkRegistrationStatus.notRegistered
			)
		    ),
		    "status",
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
				"NetworkLocation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NetworkLocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NetworkLocation"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "location",
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
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "rxLevelPerc",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' NetworkInformation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NetworkInformation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NetworkInformation
