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
 * Define the ASN1 Type RemoteOperationResponseList from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class RemoteOperationResponseList extends Sequence {
    
    /**
     * The default constructor.
     */
    public RemoteOperationResponseList()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RemoteOperationResponseList(MajMinVersion16 operationScriptVersion, 
		    INTEGER timesExecuted, TimeStamp lastExecuted, 
		    Responses responses)
    {
	setOperationScriptVersion(operationScriptVersion);
	setTimesExecuted(timesExecuted);
	setLastExecuted(lastExecuted);
	setResponses(responses);
    }
    
    /**
     * Construct with components.
     */
    public RemoteOperationResponseList(MajMinVersion16 operationScriptVersion, 
		    long timesExecuted, TimeStamp lastExecuted, 
		    Responses responses)
    {
	this(operationScriptVersion, new INTEGER(timesExecuted), 
	     lastExecuted, responses);
    }
    
    /**
     * Construct with required components.
     */
    public RemoteOperationResponseList(MajMinVersion16 operationScriptVersion, 
		    Responses responses)
    {
	setOperationScriptVersion(operationScriptVersion);
	setResponses(responses);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MajMinVersion16();
	mComponents[1] = new INTEGER();
	mComponents[2] = new TimeStamp();
	mComponents[3] = new Responses();
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
		return new MajMinVersion16();
	    case 1:
		return new INTEGER();
	    case 2:
		return new TimeStamp();
	    case 3:
		return new Responses();
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
    
    
    // Methods for field "timesExecuted"
    public long getTimesExecuted()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setTimesExecuted(long timesExecuted)
    {
	setTimesExecuted(new INTEGER(timesExecuted));
    }
    
    public void setTimesExecuted(INTEGER timesExecuted)
    {
	mComponents[1] = timesExecuted;
    }
    
    public boolean hasTimesExecuted()
    {
	return componentIsPresent(1);
    }
    
    public void deleteTimesExecuted()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "lastExecuted"
    public TimeStamp getLastExecuted()
    {
	return (TimeStamp)mComponents[2];
    }
    
    public void setLastExecuted(TimeStamp lastExecuted)
    {
	mComponents[2] = lastExecuted;
    }
    
    public boolean hasLastExecuted()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLastExecuted()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "responses"
    public Responses getResponses()
    {
	return (Responses)mComponents[3];
    }
    
    public void setResponses(Responses responses)
    {
	mComponents[3] = responses;
    }
    
    
    
    /**
     * Define the ASN1 Type Responses from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Responses extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Responses()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Responses(RemoteOperationResponse[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(RemoteOperationResponse element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(RemoteOperationResponse element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized RemoteOperationResponse get(int atIndex)
	{
	    return (RemoteOperationResponse)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(RemoteOperationResponse element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(RemoteOperationResponse element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new RemoteOperationResponse();
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
		"RemoteOperationResponseList$Responses"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    12314,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new com.oss.asn1.INTEGER(1), 
			new com.oss.asn1.INTEGER(31),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(31)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "RemoteOperationResponse"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Responses object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Responses object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Responses

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
	    "RemoteOperationResponseList"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationResponseList"
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
				    new com.oss.asn1.INTEGER(65535),
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
		    "timesExecuted",
		    1,
		    3,
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
				"TimeStamp"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TimeStamp"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0
			)
		    ),
		    "lastExecuted",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "RemoteOperationResponseList$Responses"
			)
		    ),
		    "responses",
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
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationResponseList object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationResponseList object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationResponseList
