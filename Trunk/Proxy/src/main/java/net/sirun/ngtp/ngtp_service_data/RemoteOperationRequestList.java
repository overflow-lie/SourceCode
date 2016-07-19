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
 * Define the ASN1 Type RemoteOperationRequestList from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class RemoteOperationRequestList extends Sequence {
    
    /**
     * The default constructor.
     */
    public RemoteOperationRequestList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RemoteOperationRequestList(MajMinVersion16 operationScriptVersion, 
		    RemoteOperationTrigger executionTrigger, 
		    RemoteOperationName name, INTEGER periodSecx10, 
		    INTEGER occurs, RemoteOperations remoteOperations)
    {
	setOperationScriptVersion(operationScriptVersion);
	setExecutionTrigger(executionTrigger);
	setName(name);
	setPeriodSecx10(periodSecx10);
	setOccurs(occurs);
	setRemoteOperations(remoteOperations);
    }
    
    /**
     * Construct with components.
     */
    public RemoteOperationRequestList(MajMinVersion16 operationScriptVersion, 
		    RemoteOperationTrigger executionTrigger, 
		    RemoteOperationName name, long periodSecx10, long occurs, 
		    RemoteOperations remoteOperations)
    {
	this(operationScriptVersion, executionTrigger, name, 
	     new INTEGER(periodSecx10), new INTEGER(occurs), 
	     remoteOperations);
    }
    
    /**
     * Construct with required components.
     */
    public RemoteOperationRequestList(MajMinVersion16 operationScriptVersion, 
		    RemoteOperationTrigger executionTrigger, 
		    RemoteOperations remoteOperations)
    {
	setOperationScriptVersion(operationScriptVersion);
	setExecutionTrigger(executionTrigger);
	setRemoteOperations(remoteOperations);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MajMinVersion16();
	mComponents[1] = new RemoteOperationTrigger();
	mComponents[2] = RemoteOperationName.rotNameEnd;
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new RemoteOperations();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MajMinVersion16();
	    case 1:
		return new RemoteOperationTrigger();
	    case 2:
		return RemoteOperationName.rotNameEnd;
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new RemoteOperations();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "operationScriptVersion"
    public MajMinVersion16 getOperationScriptVersion()
    {
	return (MajMinVersion16)mComponents[0];
    }
    
    public void setOperationScriptVersion(MajMinVersion16 operationScriptVersion)
    {
	mComponents[0] = operationScriptVersion;
    }
    
    
    // Methods for field "executionTrigger"
    public RemoteOperationTrigger getExecutionTrigger()
    {
	return (RemoteOperationTrigger)mComponents[1];
    }
    
    public void setExecutionTrigger(RemoteOperationTrigger executionTrigger)
    {
	mComponents[1] = executionTrigger;
    }
    
    
    // Methods for field "name"
    public RemoteOperationName getName()
    {
	return (RemoteOperationName)mComponents[2];
    }
    
    public void setName(RemoteOperationName name)
    {
	mComponents[2] = name;
    }
    
    public boolean hasName()
    {
	return componentIsPresent(2);
    }
    
    public void deleteName()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "periodSecx10"
    public long getPeriodSecx10()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setPeriodSecx10(long periodSecx10)
    {
	setPeriodSecx10(new INTEGER(periodSecx10));
    }
    
    public void setPeriodSecx10(INTEGER periodSecx10)
    {
	mComponents[3] = periodSecx10;
    }
    
    public boolean hasPeriodSecx10()
    {
	return componentIsPresent(3);
    }
    
    public void deletePeriodSecx10()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "occurs"
    public long getOccurs()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setOccurs(long occurs)
    {
	setOccurs(new INTEGER(occurs));
    }
    
    public void setOccurs(INTEGER occurs)
    {
	mComponents[4] = occurs;
    }
    
    public boolean hasOccurs()
    {
	return componentIsPresent(4);
    }
    
    public void deleteOccurs()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "remoteOperations"
    public RemoteOperations getRemoteOperations()
    {
	return (RemoteOperations)mComponents[5];
    }
    
    public void setRemoteOperations(RemoteOperations remoteOperations)
    {
	mComponents[5] = remoteOperations;
    }
    
    
    
    /**
     * Define the ASN1 Type RemoteOperations from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class RemoteOperations extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public RemoteOperations()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public RemoteOperations(RemoteOperationRequest[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(RemoteOperationRequest element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(RemoteOperationRequest element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized RemoteOperationRequest get(int atIndex)
	{
	    return (RemoteOperationRequest)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(RemoteOperationRequest element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(RemoteOperationRequest element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new RemoteOperationRequest();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"RemoteOperationRequestList$RemoteOperations"
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
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "RemoteOperationRequest"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' RemoteOperations object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' RemoteOperations object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for RemoteOperations

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
	    "RemoteOperationRequestList"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationRequestList"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"MajMinVersion16"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"MajMinVersion16"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "MajMinVersion16"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "MajMinVersion16"
				)
			    ),
			    0
			)
		    ),
		    "operationScriptVersion",
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
				"RemoteOperationTrigger"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"RemoteOperationTrigger"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "RemoteOperationTrigger"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
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
				    new TagDecoderElement((short)0x800d, 13),
				    new TagDecoderElement((short)0x800e, 14),
				    new TagDecoderElement((short)0x800f, 15),
				    new TagDecoderElement((short)0x8010, 16),
				    new TagDecoderElement((short)0x8011, 17),
				    new TagDecoderElement((short)0x8012, 18),
				    new TagDecoderElement((short)0x8013, 19),
				    new TagDecoderElement((short)0x8014, 20)
				}
			    )
			)
		    ),
		    "executionTrigger",
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
				"RemoteOperationName"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"RemoteOperationName"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"rotNameEnd",
					0
				    ),
				    new MemberListElement (
					"rotNameStart",
					1
				    ),
				    new MemberListElement (
					"rotNamePause",
					2
				    ),
				    new MemberListElement (
					"rotNameRestart",
					3
				    ),
				    new MemberListElement (
					"rotNameConfigure",
					4
				    ),
				    new MemberListElement (
					"rotNameGet",
					5
				    ),
				    new MemberListElement (
					"rotNameGetPos",
					6
				    ),
				    new MemberListElement (
					"rotNameCleardown",
					7
				    ),
				    new MemberListElement (
					"rotNameCallback",
					8
				    ),
				    new MemberListElement (
					"rotNameBlock",
					9
				    ),
				    new MemberListElement (
					"rotNameUnblock",
					10
				    ),
				    new MemberListElement (
					"rotNameEndTnOnly",
					11
				    ),
				    new MemberListElement (
					"rotNameEndTnEndSvt",
					12
				    ),
				    new MemberListElement (
					"rotNameEndTnUnblock",
					13
				    ),
				    new MemberListElement (
					"rotNameDeactivate",
					14
				    ),
				    new MemberListElement (
					"rotNamePreactivate",
					15
				    ),
				    new MemberListElement (
					"rotNameActivate",
					16
				    ),
				    new MemberListElement (
					"rotNameProvision",
					17
				    ),
				    new MemberListElement (
					"rotNameHeat",
					18
				    ),
				    new MemberListElement (
					"rotNameVent",
					19
				    ),
				    new MemberListElement (
					"rotNameAuto",
					20
				    )
				}
			    ),
			    0,
			    RemoteOperationName.rotNameEnd
			)
		    ),
		    "name",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
				    new com.oss.asn1.INTEGER(1023),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1023)
			    ),
			    null
			)
		    ),
		    "periodSecx10",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
				    new com.oss.asn1.INTEGER(-1), 
				    new com.oss.asn1.INTEGER(65534),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-1),
				new java.lang.Long(65534)
			    ),
			    null
			)
		    ),
		    "occurs",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "RemoteOperationRequestList$RemoteOperations"
			)
		    ),
		    "remoteOperations",
		    5,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationRequestList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationRequestList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationRequestList
