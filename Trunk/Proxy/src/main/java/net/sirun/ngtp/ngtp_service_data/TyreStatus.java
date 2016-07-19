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
 * Define the ASN1 Type TyreStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TyreStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public TyreStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TyreStatus(TyrePressureWarning warning, INTEGER pressureHpa)
    {
	setWarning(warning);
	setPressureHpa(pressureHpa);
    }
    
    /**
     * Construct with components.
     */
    public TyreStatus(TyrePressureWarning warning, long pressureHpa)
    {
	this(warning, new INTEGER(pressureHpa));
    }
    
    public void initComponents()
    {
	mComponents[0] = TyrePressureWarning.system_fault;
	mComponents[1] = new INTEGER();
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
		return TyrePressureWarning.system_fault;
	    case 1:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "warning"
    public TyrePressureWarning getWarning()
    {
	return (TyrePressureWarning)mComponents[0];
    }
    
    public void setWarning(TyrePressureWarning warning)
    {
	mComponents[0] = warning;
    }
    
    
    // Methods for field "pressureHpa"
    public long getPressureHpa()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setPressureHpa(long pressureHpa)
    {
	setPressureHpa(new INTEGER(pressureHpa));
    }
    
    public void setPressureHpa(INTEGER pressureHpa)
    {
	mComponents[1] = pressureHpa;
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
	    "TyreStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TyreStatus"
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
				"TyrePressureWarning"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyrePressureWarning"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"system-fault",
					0
				    ),
				    new MemberListElement (
					"normal",
					1
				    ),
				    new MemberListElement (
					"high",
					2
				    ),
				    new MemberListElement (
					"low-soft-warn",
					3
				    ),
				    new MemberListElement (
					"low-hard-warn",
					4
				    ),
				    new MemberListElement (
					"no-sensors",
					5
				    ),
				    new MemberListElement (
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    TyrePressureWarning.system_fault
			)
		    ),
		    "warning",
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
				    new com.oss.asn1.INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(32767)
			    ),
			    null
			)
		    ),
		    "pressureHpa",
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
     * Get the type descriptor (TypeInfo) of 'this' TyreStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TyreStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TyreStatus
