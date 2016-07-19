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
 * Define the ASN1 Type DiagnosticTroubleCode from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class DiagnosticTroubleCode extends Sequence {
    
    /**
     * The default constructor.
     */
    public DiagnosticTroubleCode()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public DiagnosticTroubleCode(Node node, INTEGER dtcId, 
		    DtcStatusBitsIso14229 status, INTEGER failureCount, 
		    TimeStamp lastFail)
    {
	setNode(node);
	setDtcId(dtcId);
	setStatus(status);
	setFailureCount(failureCount);
	setLastFail(lastFail);
    }
    
    /**
     * Construct with components.
     */
    public DiagnosticTroubleCode(Node node, long dtcId, 
		    DtcStatusBitsIso14229 status, long failureCount, 
		    TimeStamp lastFail)
    {
	this(node, new INTEGER(dtcId), status, new INTEGER(failureCount), 
	     lastFail);
    }
    
    /**
     * Construct with required components.
     */
    public DiagnosticTroubleCode(Node node, long dtcId, 
		    DtcStatusBitsIso14229 status)
    {
	setNode(node);
	setDtcId(dtcId);
	setStatus(status);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Node();
	mComponents[1] = new INTEGER();
	mComponents[2] = new DtcStatusBitsIso14229();
	mComponents[3] = new INTEGER();
	mComponents[4] = new TimeStamp();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Node();
	    case 1:
		return new INTEGER();
	    case 2:
		return new DtcStatusBitsIso14229();
	    case 3:
		return new INTEGER();
	    case 4:
		return new TimeStamp();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "node"
    public Node getNode()
    {
	return (Node)mComponents[0];
    }
    
    public void setNode(Node node)
    {
	mComponents[0] = node;
    }
    
    
    
    /**
     * Define the ASN1 Type Node from ASN1 Module NGTP_Service_Data.
     * @see Choice
     */
    public static class Node extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Node()
	{
	}
	
	public static final  int  telematicUnit_chosen = 1;
	public static final  int  id_chosen = 2;
	
	// Methods for field "telematicUnit"
	public static Node createNodeWithTelematicUnit(Null telematicUnit)
	{
	    Node __object = new Node();

	    __object.setTelematicUnit(telematicUnit);
	    return __object;
	}
	
	public boolean hasTelematicUnit()
	{
	    return getChosenFlag() == telematicUnit_chosen;
	}
	
	public void setTelematicUnit(Null telematicUnit)
	{
	    setChosenValue(telematicUnit);
	    setChosenFlag(telematicUnit_chosen);
	}
	
	
	// Methods for field "id"
	public static Node createNodeWithId(long id)
	{
	    return createNodeWithId(new INTEGER(id));
	}
	
	public static Node createNodeWithId(INTEGER id)
	{
	    Node __object = new Node();

	    __object.setId(id);
	    return __object;
	}
	
	public boolean hasId()
	{
	    return getChosenFlag() == id_chosen;
	}
	
	public void setId(long id)
	{
	    setId(new INTEGER(id));
	}
	
	public void setId(INTEGER id)
	{
	    setChosenValue(id);
	    setChosenFlag(id_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case telematicUnit_chosen:
		    return new Null();
		case id_chosen:
		    return new INTEGER();
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"DiagnosticTroubleCode$Node"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    12314,
	    null,
	    new Fields (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new TypeInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "com.oss.asn1",
				    "Null"
				),
				new QName (
				    "builtin",
				    "NULL"
				),
				12314,
				null
			    )
			),
			"telematicUnit",
			0,
			2
		    ),
		    new FieldInfo (
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
			"id",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Node object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Node object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Node

    // Methods for field "dtcId"
    public long getDtcId()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setDtcId(long dtcId)
    {
	setDtcId(new INTEGER(dtcId));
    }
    
    public void setDtcId(INTEGER dtcId)
    {
	mComponents[1] = dtcId;
    }
    
    
    // Methods for field "status"
    public DtcStatusBitsIso14229 getStatus()
    {
	return (DtcStatusBitsIso14229)mComponents[2];
    }
    
    public void setStatus(DtcStatusBitsIso14229 status)
    {
	mComponents[2] = status;
    }
    
    
    // Methods for field "failureCount"
    public long getFailureCount()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setFailureCount(long failureCount)
    {
	setFailureCount(new INTEGER(failureCount));
    }
    
    public void setFailureCount(INTEGER failureCount)
    {
	mComponents[3] = failureCount;
    }
    
    public boolean hasFailureCount()
    {
	return componentIsPresent(3);
    }
    
    public void deleteFailureCount()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "lastFail"
    public TimeStamp getLastFail()
    {
	return (TimeStamp)mComponents[4];
    }
    
    public void setLastFail(TimeStamp lastFail)
    {
	mComponents[4] = lastFail;
    }
    
    public boolean hasLastFail()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLastFail()
    {
	setComponentAbsent(4);
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
	    "DiagnosticTroubleCode"
	),
	new QName (
	    "NGTP-Service-Data",
	    "DiagnosticTroubleCode"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "DiagnosticTroubleCode$Node"
			)
		    ),
		    "node",
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
				    new com.oss.asn1.INTEGER(4294967295L),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4294967295L)
			    ),
			    null
			)
		    ),
		    "dtcId",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"DtcStatusBitsIso14229"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DtcStatusBitsIso14229"
			    ),
			    12314,
			    null,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"testFailed",
					0
				    ),
				    new MemberListElement (
					"testFailedThisOperationCycle",
					1
				    ),
				    new MemberListElement (
					"pendingDTC",
					2
				    ),
				    new MemberListElement (
					"confirmedDTC",
					3
				    ),
				    new MemberListElement (
					"testNotCompletedSinceLastClear",
					4
				    ),
				    new MemberListElement (
					"testFailedSinceLastClear",
					5
				    ),
				    new MemberListElement (
					"testNotCompletedThisOperationCycle",
					6
				    ),
				    new MemberListElement (
					"warningIndicatorRequested",
					7
				    )
				}
			    )
			)
		    ),
		    "status",
		    2,
		    2,
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
		    "failureCount",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "lastFail",
		    4,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DiagnosticTroubleCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DiagnosticTroubleCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DiagnosticTroubleCode
