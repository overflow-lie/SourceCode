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
 * Define the ASN1 Type RemoteOperationResponse from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class RemoteOperationResponse extends Sequence {
    
    /**
     * The default constructor.
     */
    public RemoteOperationResponse()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RemoteOperationResponse(SimpleRemoteOperation operationDesc, 
		    INTEGER timesExecuted, TimeStamp lastExecuted, 
		    PrintableString errorDesc)
    {
	setOperationDesc(operationDesc);
	setTimesExecuted(timesExecuted);
	setLastExecuted(lastExecuted);
	setErrorDesc(errorDesc);
    }
    
    /**
     * Construct with components.
     */
    public RemoteOperationResponse(SimpleRemoteOperation operationDesc, 
		    long timesExecuted, TimeStamp lastExecuted, 
		    PrintableString errorDesc)
    {
	this(operationDesc, new INTEGER(timesExecuted), lastExecuted, 
	     errorDesc);
    }
    
    /**
     * Construct with required components.
     */
    public RemoteOperationResponse(SimpleRemoteOperation operationDesc, 
		    long timesExecuted, TimeStamp lastExecuted)
    {
	setOperationDesc(operationDesc);
	setTimesExecuted(timesExecuted);
	setLastExecuted(lastExecuted);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SimpleRemoteOperation();
	mComponents[1] = new INTEGER();
	mComponents[2] = new TimeStamp();
	mComponents[3] = new PrintableString();
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
		return new SimpleRemoteOperation();
	    case 1:
		return new INTEGER();
	    case 2:
		return new TimeStamp();
	    case 3:
		return new PrintableString();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "operationDesc"
    public SimpleRemoteOperation getOperationDesc()
    {
	return (SimpleRemoteOperation)mComponents[0];
    }
    
    public void setOperationDesc(SimpleRemoteOperation operationDesc)
    {
	mComponents[0] = operationDesc;
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
    
    
    // Methods for field "lastExecuted"
    public TimeStamp getLastExecuted()
    {
	return (TimeStamp)mComponents[2];
    }
    
    public void setLastExecuted(TimeStamp lastExecuted)
    {
	mComponents[2] = lastExecuted;
    }
    
    
    // Methods for field "errorDesc"
    public PrintableString getErrorDesc()
    {
	return (PrintableString)mComponents[3];
    }
    
    public void setErrorDesc(PrintableString errorDesc)
    {
	mComponents[3] = errorDesc;
    }
    
    public boolean hasErrorDesc()
    {
	return componentIsPresent(3);
    }
    
    public void deleteErrorDesc()
    {
	setComponentAbsent(3);
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
	    "RemoteOperationResponse"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationResponse"
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
				"SimpleRemoteOperation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"SimpleRemoteOperation"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "SimpleRemoteOperation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "SimpleRemoteOperation"
				)
			    ),
			    0
			)
		    ),
		    "operationDesc",
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
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "errorDesc",
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
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationResponse object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationResponse object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationResponse
