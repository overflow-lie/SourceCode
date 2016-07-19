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
 * Define the ASN1 Type RemoteOperationRequest from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class RemoteOperationRequest extends Sequence {
    
    /**
     * The default constructor.
     */
    public RemoteOperationRequest()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RemoteOperationRequest(SimpleRemoteOperation operationDesc, 
		    BOOLEAN stopIfFail, BOOLEAN waitForPreviousCommand, 
		    INTEGER operationTimeoutSec, INTEGER periodSecx10, 
		    INTEGER occurs, INTEGER initialWaitTimeSecx10, 
		    VehicleStateType requiredVehicleStates)
    {
	setOperationDesc(operationDesc);
	setStopIfFail(stopIfFail);
	setWaitForPreviousCommand(waitForPreviousCommand);
	setOperationTimeoutSec(operationTimeoutSec);
	setPeriodSecx10(periodSecx10);
	setOccurs(occurs);
	setInitialWaitTimeSecx10(initialWaitTimeSecx10);
	setRequiredVehicleStates(requiredVehicleStates);
    }
    
    /**
     * Construct with components.
     */
    public RemoteOperationRequest(SimpleRemoteOperation operationDesc, 
		    boolean stopIfFail, boolean waitForPreviousCommand, 
		    long operationTimeoutSec, long periodSecx10, long occurs, 
		    long initialWaitTimeSecx10, 
		    VehicleStateType requiredVehicleStates)
    {
	this(operationDesc, new BOOLEAN(stopIfFail), 
	     new BOOLEAN(waitForPreviousCommand), 
	     new INTEGER(operationTimeoutSec), new INTEGER(periodSecx10), 
	     new INTEGER(occurs), new INTEGER(initialWaitTimeSecx10), 
	     requiredVehicleStates);
    }
    
    /**
     * Construct with required components.
     */
    public RemoteOperationRequest(SimpleRemoteOperation operationDesc, 
		    boolean stopIfFail, boolean waitForPreviousCommand, 
		    long operationTimeoutSec, long periodSecx10, long occurs, 
		    long initialWaitTimeSecx10)
    {
	setOperationDesc(operationDesc);
	setStopIfFail(stopIfFail);
	setWaitForPreviousCommand(waitForPreviousCommand);
	setOperationTimeoutSec(operationTimeoutSec);
	setPeriodSecx10(periodSecx10);
	setOccurs(occurs);
	setInitialWaitTimeSecx10(initialWaitTimeSecx10);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SimpleRemoteOperation();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = VehicleStateType.engine_on_moving;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SimpleRemoteOperation();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return VehicleStateType.engine_on_moving;
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
    
    
    // Methods for field "stopIfFail"
    public boolean getStopIfFail()
    {
	return ((BOOLEAN)mComponents[1]).booleanValue();
    }
    
    public void setStopIfFail(boolean stopIfFail)
    {
	setStopIfFail(new BOOLEAN(stopIfFail));
    }
    
    public void setStopIfFail(BOOLEAN stopIfFail)
    {
	mComponents[1] = stopIfFail;
    }
    
    
    // Methods for field "waitForPreviousCommand"
    public boolean getWaitForPreviousCommand()
    {
	return ((BOOLEAN)mComponents[2]).booleanValue();
    }
    
    public void setWaitForPreviousCommand(boolean waitForPreviousCommand)
    {
	setWaitForPreviousCommand(new BOOLEAN(waitForPreviousCommand));
    }
    
    public void setWaitForPreviousCommand(BOOLEAN waitForPreviousCommand)
    {
	mComponents[2] = waitForPreviousCommand;
    }
    
    
    // Methods for field "operationTimeoutSec"
    public long getOperationTimeoutSec()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setOperationTimeoutSec(long operationTimeoutSec)
    {
	setOperationTimeoutSec(new INTEGER(operationTimeoutSec));
    }
    
    public void setOperationTimeoutSec(INTEGER operationTimeoutSec)
    {
	mComponents[3] = operationTimeoutSec;
    }
    
    
    // Methods for field "periodSecx10"
    public long getPeriodSecx10()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setPeriodSecx10(long periodSecx10)
    {
	setPeriodSecx10(new INTEGER(periodSecx10));
    }
    
    public void setPeriodSecx10(INTEGER periodSecx10)
    {
	mComponents[4] = periodSecx10;
    }
    
    
    // Methods for field "occurs"
    public long getOccurs()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setOccurs(long occurs)
    {
	setOccurs(new INTEGER(occurs));
    }
    
    public void setOccurs(INTEGER occurs)
    {
	mComponents[5] = occurs;
    }
    
    
    // Methods for field "initialWaitTimeSecx10"
    public long getInitialWaitTimeSecx10()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setInitialWaitTimeSecx10(long initialWaitTimeSecx10)
    {
	setInitialWaitTimeSecx10(new INTEGER(initialWaitTimeSecx10));
    }
    
    public void setInitialWaitTimeSecx10(INTEGER initialWaitTimeSecx10)
    {
	mComponents[6] = initialWaitTimeSecx10;
    }
    
    
    // Methods for field "requiredVehicleStates"
    public VehicleStateType getRequiredVehicleStates()
    {
	return (VehicleStateType)mComponents[7];
    }
    
    public void setRequiredVehicleStates(VehicleStateType requiredVehicleStates)
    {
	mComponents[7] = requiredVehicleStates;
    }
    
    public boolean hasRequiredVehicleStates()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRequiredVehicleStates()
    {
	setComponentAbsent(7);
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
	    "RemoteOperationRequest"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationRequest"
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
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "stopIfFail",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "waitForPreviousCommand",
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
		    "operationTimeoutSec",
		    3,
		    2,
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
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "initialWaitTimeSecx10",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"VehicleStateType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"VehicleStateType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"engine-on-moving",
					0
				    ),
				    new MemberListElement (
					"engine-on-park",
					1
				    ),
				    new MemberListElement (
					"key-on-engine-off",
					2
				    ),
				    new MemberListElement (
					"delayed-accessory",
					3
				    ),
				    new MemberListElement (
					"key-off",
					4
				    ),
				    new MemberListElement (
					"key-removed",
					5
				    ),
				    new MemberListElement (
					"engine-on-remote-start",
					6
				    ),
				    new MemberListElement (
					"unknown",
					15
				    )
				}
			    ),
			    0,
			    VehicleStateType.engine_on_moving
			)
		    ),
		    "requiredVehicleStates",
		    7,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationRequest object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationRequest object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationRequest
