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
 * Define the ASN1 Type SimpleRemoteOperation from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class SimpleRemoteOperation extends Sequence {
    
    /**
     * The default constructor.
     */
    public SimpleRemoteOperation()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SimpleRemoteOperation(PrintableString component, 
		    RemoteOperationType operationType, UTF8String16 state)
    {
	setComponent(component);
	setOperationType(operationType);
	setState(state);
    }
    
    /**
     * Construct with required components.
     */
    public SimpleRemoteOperation(PrintableString component, 
		    RemoteOperationType operationType)
    {
	setComponent(component);
	setOperationType(operationType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PrintableString();
	mComponents[1] = RemoteOperationType.read;
	mComponents[2] = new UTF8String16();
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
		return new PrintableString();
	    case 1:
		return RemoteOperationType.read;
	    case 2:
		return new UTF8String16();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "component"
    public PrintableString getComponent()
    {
	return (PrintableString)mComponents[0];
    }
    
    public void setComponent(PrintableString component)
    {
	mComponents[0] = component;
    }
    
    
    // Methods for field "operationType"
    public RemoteOperationType getOperationType()
    {
	return (RemoteOperationType)mComponents[1];
    }
    
    public void setOperationType(RemoteOperationType operationType)
    {
	mComponents[1] = operationType;
    }
    
    
    // Methods for field "state"
    public UTF8String16 getState()
    {
	return (UTF8String16)mComponents[2];
    }
    
    public void setState(UTF8String16 state)
    {
	mComponents[2] = state;
    }
    
    public boolean hasState()
    {
	return componentIsPresent(2);
    }
    
    public void deleteState()
    {
	setComponentAbsent(2);
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
	    "SimpleRemoteOperation"
	),
	new QName (
	    "NGTP-Service-Data",
	    "SimpleRemoteOperation"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"PrintableString"
			    ),
			    new QName (
				"builtin",
				"PrintableString"
			    ),
			    12314,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new com.oss.asn1.INTEGER(1), 
					    new com.oss.asn1.INTEGER(256),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(256)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "component",
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
				"RemoteOperationType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"RemoteOperationType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"read",
					0
				    ),
				    new MemberListElement (
					"write",
					1
				    ),
				    new MemberListElement (
					"diagnostics-cancel",
					2
				    ),
				    new MemberListElement (
					"read-async",
					3
				    ),
				    new MemberListElement (
					"write-async",
					4
				    ),
				    new MemberListElement (
					"diagnostics-read",
					5
				    ),
				    new MemberListElement (
					"diagnostics-write",
					6
				    ),
				    new MemberListElement (
					"diagnostics-track",
					7
				    ),
				    new MemberListElement (
					"diagnostics-read-interval",
					8
				    )
				}
			    ),
			    0,
			    RemoteOperationType.read
			)
		    ),
		    "operationType",
		    1,
		    2,
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
					new com.oss.asn1.INTEGER(65535),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "state",
		    2,
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
     * Get the type descriptor (TypeInfo) of 'this' SimpleRemoteOperation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SimpleRemoteOperation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SimpleRemoteOperation
