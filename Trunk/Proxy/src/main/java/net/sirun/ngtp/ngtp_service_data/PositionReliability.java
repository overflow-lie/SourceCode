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
 * Define the ASN1 Type PositionReliability from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class PositionReliability extends Sequence {
    
    /**
     * The default constructor.
     */
    public PositionReliability()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PositionReliability(GnssFixType fixType, 
		    BOOLEXT insideDigitizedArea, BOOLEXT fullyDigitizedArea, 
		    BOOLEXT matchedToDigitalMap, BOOLEXT deadReckoning, 
		    BOOLEXT drCalibrated, INTEGER drDistanceMtr, 
		    INTEGER hdopx10, INTEGER noOfSatellites, 
		    BOOLEXT differentialGPSAvailable)
    {
	setFixType(fixType);
	setInsideDigitizedArea(insideDigitizedArea);
	setFullyDigitizedArea(fullyDigitizedArea);
	setMatchedToDigitalMap(matchedToDigitalMap);
	setDeadReckoning(deadReckoning);
	setDrCalibrated(drCalibrated);
	setDrDistanceMtr(drDistanceMtr);
	setHdopx10(hdopx10);
	setNoOfSatellites(noOfSatellites);
	setDifferentialGPSAvailable(differentialGPSAvailable);
    }
    
    /**
     * Construct with components.
     */
    public PositionReliability(GnssFixType fixType, 
		    BOOLEXT insideDigitizedArea, BOOLEXT fullyDigitizedArea, 
		    BOOLEXT matchedToDigitalMap, BOOLEXT deadReckoning, 
		    BOOLEXT drCalibrated, long drDistanceMtr, long hdopx10, 
		    long noOfSatellites, BOOLEXT differentialGPSAvailable)
    {
	this(fixType, insideDigitizedArea, fullyDigitizedArea, 
	     matchedToDigitalMap, deadReckoning, drCalibrated, 
	     new INTEGER(drDistanceMtr), new INTEGER(hdopx10), 
	     new INTEGER(noOfSatellites), differentialGPSAvailable);
    }
    
    public void initComponents()
    {
	mComponents[0] = GnssFixType.none;
	mComponents[1] = BOOLEXT.isFalse;
	mComponents[2] = BOOLEXT.isFalse;
	mComponents[3] = BOOLEXT.isFalse;
	mComponents[4] = BOOLEXT.isFalse;
	mComponents[5] = BOOLEXT.isFalse;
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
	mComponents[9] = BOOLEXT.isFalse;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return GnssFixType.none;
	    case 1:
		return BOOLEXT.isFalse;
	    case 2:
		return BOOLEXT.isFalse;
	    case 3:
		return BOOLEXT.isFalse;
	    case 4:
		return BOOLEXT.isFalse;
	    case 5:
		return BOOLEXT.isFalse;
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    case 9:
		return BOOLEXT.isFalse;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "fixType"
    public GnssFixType getFixType()
    {
	return (GnssFixType)mComponents[0];
    }
    
    public void setFixType(GnssFixType fixType)
    {
	mComponents[0] = fixType;
    }
    
    
    // Methods for field "insideDigitizedArea"
    public BOOLEXT getInsideDigitizedArea()
    {
	return (BOOLEXT)mComponents[1];
    }
    
    public void setInsideDigitizedArea(BOOLEXT insideDigitizedArea)
    {
	mComponents[1] = insideDigitizedArea;
    }
    
    
    // Methods for field "fullyDigitizedArea"
    public BOOLEXT getFullyDigitizedArea()
    {
	return (BOOLEXT)mComponents[2];
    }
    
    public void setFullyDigitizedArea(BOOLEXT fullyDigitizedArea)
    {
	mComponents[2] = fullyDigitizedArea;
    }
    
    
    // Methods for field "matchedToDigitalMap"
    public BOOLEXT getMatchedToDigitalMap()
    {
	return (BOOLEXT)mComponents[3];
    }
    
    public void setMatchedToDigitalMap(BOOLEXT matchedToDigitalMap)
    {
	mComponents[3] = matchedToDigitalMap;
    }
    
    
    // Methods for field "deadReckoning"
    public BOOLEXT getDeadReckoning()
    {
	return (BOOLEXT)mComponents[4];
    }
    
    public void setDeadReckoning(BOOLEXT deadReckoning)
    {
	mComponents[4] = deadReckoning;
    }
    
    
    // Methods for field "drCalibrated"
    public BOOLEXT getDrCalibrated()
    {
	return (BOOLEXT)mComponents[5];
    }
    
    public void setDrCalibrated(BOOLEXT drCalibrated)
    {
	mComponents[5] = drCalibrated;
    }
    
    
    // Methods for field "drDistanceMtr"
    public long getDrDistanceMtr()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setDrDistanceMtr(long drDistanceMtr)
    {
	setDrDistanceMtr(new INTEGER(drDistanceMtr));
    }
    
    public void setDrDistanceMtr(INTEGER drDistanceMtr)
    {
	mComponents[6] = drDistanceMtr;
    }
    
    
    // Methods for field "hdopx10"
    public long getHdopx10()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setHdopx10(long hdopx10)
    {
	setHdopx10(new INTEGER(hdopx10));
    }
    
    public void setHdopx10(INTEGER hdopx10)
    {
	mComponents[7] = hdopx10;
    }
    
    
    // Methods for field "noOfSatellites"
    public long getNoOfSatellites()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setNoOfSatellites(long noOfSatellites)
    {
	setNoOfSatellites(new INTEGER(noOfSatellites));
    }
    
    public void setNoOfSatellites(INTEGER noOfSatellites)
    {
	mComponents[8] = noOfSatellites;
    }
    
    
    // Methods for field "differentialGPSAvailable"
    public BOOLEXT getDifferentialGPSAvailable()
    {
	return (BOOLEXT)mComponents[9];
    }
    
    public void setDifferentialGPSAvailable(BOOLEXT differentialGPSAvailable)
    {
	mComponents[9] = differentialGPSAvailable;
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
	    "PositionReliability"
	),
	new QName (
	    "NGTP-Service-Data",
	    "PositionReliability"
	),
	12318,
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
				"GnssFixType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"GnssFixType"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"timeFix",
					1
				    ),
				    new MemberListElement (
					"fix2D",
					2
				    ),
				    new MemberListElement (
					"fix3D",
					3
				    ),
				    new MemberListElement (
					"fix3DHqFix",
					4
				    )
				}
			    ),
			    0,
			    GnssFixType.none
			)
		    ),
		    "fixType",
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
		    "insideDigitizedArea",
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
		    "fullyDigitizedArea",
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
		    "matchedToDigitalMap",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "deadReckoning",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "drCalibrated",
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "drDistanceMtr",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "hdopx10",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "noOfSatellites",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "differentialGPSAvailable",
		    9,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PositionReliability object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PositionReliability object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PositionReliability
