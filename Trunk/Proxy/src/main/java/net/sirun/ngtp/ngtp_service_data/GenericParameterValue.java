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
 * Define the ASN1 Type GenericParameterValue from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class GenericParameterValue extends Choice {
    
    /**
     * The default constructor.
     */
    public GenericParameterValue()
    {
    }
    
    public static final  int  noval_chosen = 1;
    public static final  int  read_chosen = 2;
    public static final  int  resetToDefault_chosen = 3;
    public static final  int  uint8Val_chosen = 4;
    public static final  int  uint16Val_chosen = 5;
    public static final  int  uint32Val_chosen = 6;
    public static final  int  boolVal_chosen = 7;
    public static final  int  dataVal_chosen = 8;
    public static final  int  dataValShort_chosen = 9;
    public static final  int  stringVal_chosen = 10;
    public static final  int  stringValShort_chosen = 11;
    public static final  int  timestamp_chosen = 12;
    public static final  int  poi_chosen = 13;
    public static final  int  point_chosen = 14;
    public static final  int  position_chosen = 15;
    public static final  int  positions_chosen = 16;
    public static final  int  trackPoint_chosen = 17;
    public static final  int  setOk_chosen = 18;
    public static final  int  failedNotAllowed_chosen = 19;
    public static final  int  setFailedWrongType_chosen = 20;
    public static final  int  setFailedValueOutOfRange_chosen = 21;
    public static final  int  failedKeyNotSupported_chosen = 22;
    
    // Methods for field "noval"
    public static GenericParameterValue createGenericParameterValueWithNoval(Null noval)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setNoval(noval);
	return __object;
    }
    
    public boolean hasNoval()
    {
	return getChosenFlag() == noval_chosen;
    }
    
    public void setNoval(Null noval)
    {
	setChosenValue(noval);
	setChosenFlag(noval_chosen);
    }
    
    
    // Methods for field "read"
    public static GenericParameterValue createGenericParameterValueWithRead(Null read)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setRead(read);
	return __object;
    }
    
    public boolean hasRead()
    {
	return getChosenFlag() == read_chosen;
    }
    
    public void setRead(Null read)
    {
	setChosenValue(read);
	setChosenFlag(read_chosen);
    }
    
    
    // Methods for field "resetToDefault"
    public static GenericParameterValue createGenericParameterValueWithResetToDefault(Null resetToDefault)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setResetToDefault(resetToDefault);
	return __object;
    }
    
    public boolean hasResetToDefault()
    {
	return getChosenFlag() == resetToDefault_chosen;
    }
    
    public void setResetToDefault(Null resetToDefault)
    {
	setChosenValue(resetToDefault);
	setChosenFlag(resetToDefault_chosen);
    }
    
    
    // Methods for field "uint8Val"
    public static GenericParameterValue createGenericParameterValueWithUint8Val(long uint8Val)
    {
	return createGenericParameterValueWithUint8Val(new INTEGER(uint8Val));
    }
    
    public static GenericParameterValue createGenericParameterValueWithUint8Val(INTEGER uint8Val)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setUint8Val(uint8Val);
	return __object;
    }
    
    public boolean hasUint8Val()
    {
	return getChosenFlag() == uint8Val_chosen;
    }
    
    public void setUint8Val(long uint8Val)
    {
	setUint8Val(new INTEGER(uint8Val));
    }
    
    public void setUint8Val(INTEGER uint8Val)
    {
	setChosenValue(uint8Val);
	setChosenFlag(uint8Val_chosen);
    }
    
    
    // Methods for field "uint16Val"
    public static GenericParameterValue createGenericParameterValueWithUint16Val(long uint16Val)
    {
	return createGenericParameterValueWithUint16Val(new INTEGER(uint16Val));
    }
    
    public static GenericParameterValue createGenericParameterValueWithUint16Val(INTEGER uint16Val)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setUint16Val(uint16Val);
	return __object;
    }
    
    public boolean hasUint16Val()
    {
	return getChosenFlag() == uint16Val_chosen;
    }
    
    public void setUint16Val(long uint16Val)
    {
	setUint16Val(new INTEGER(uint16Val));
    }
    
    public void setUint16Val(INTEGER uint16Val)
    {
	setChosenValue(uint16Val);
	setChosenFlag(uint16Val_chosen);
    }
    
    
    // Methods for field "uint32Val"
    public static GenericParameterValue createGenericParameterValueWithUint32Val(long uint32Val)
    {
	return createGenericParameterValueWithUint32Val(new INTEGER(uint32Val));
    }
    
    public static GenericParameterValue createGenericParameterValueWithUint32Val(INTEGER uint32Val)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setUint32Val(uint32Val);
	return __object;
    }
    
    public boolean hasUint32Val()
    {
	return getChosenFlag() == uint32Val_chosen;
    }
    
    public void setUint32Val(long uint32Val)
    {
	setUint32Val(new INTEGER(uint32Val));
    }
    
    public void setUint32Val(INTEGER uint32Val)
    {
	setChosenValue(uint32Val);
	setChosenFlag(uint32Val_chosen);
    }
    
    
    // Methods for field "boolVal"
    public static GenericParameterValue createGenericParameterValueWithBoolVal(boolean boolVal)
    {
	return createGenericParameterValueWithBoolVal(new BOOLEAN(boolVal));
    }
    
    public static GenericParameterValue createGenericParameterValueWithBoolVal(BOOLEAN boolVal)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setBoolVal(boolVal);
	return __object;
    }
    
    public boolean hasBoolVal()
    {
	return getChosenFlag() == boolVal_chosen;
    }
    
    public void setBoolVal(boolean boolVal)
    {
	setBoolVal(new BOOLEAN(boolVal));
    }
    
    public void setBoolVal(BOOLEAN boolVal)
    {
	setChosenValue(boolVal);
	setChosenFlag(boolVal_chosen);
    }
    
    
    // Methods for field "dataVal"
    public static GenericParameterValue createGenericParameterValueWithDataVal(OctetString dataVal)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setDataVal(dataVal);
	return __object;
    }
    
    public boolean hasDataVal()
    {
	return getChosenFlag() == dataVal_chosen;
    }
    
    public void setDataVal(OctetString dataVal)
    {
	setChosenValue(dataVal);
	setChosenFlag(dataVal_chosen);
    }
    
    
    // Methods for field "dataValShort"
    public static GenericParameterValue createGenericParameterValueWithDataValShort(OctetString dataValShort)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setDataValShort(dataValShort);
	return __object;
    }
    
    public boolean hasDataValShort()
    {
	return getChosenFlag() == dataValShort_chosen;
    }
    
    public void setDataValShort(OctetString dataValShort)
    {
	setChosenValue(dataValShort);
	setChosenFlag(dataValShort_chosen);
    }
    
    
    // Methods for field "stringVal"
    public static GenericParameterValue createGenericParameterValueWithStringVal(UTF8String16 stringVal)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setStringVal(stringVal);
	return __object;
    }
    
    public boolean hasStringVal()
    {
	return getChosenFlag() == stringVal_chosen;
    }
    
    public void setStringVal(UTF8String16 stringVal)
    {
	setChosenValue(stringVal);
	setChosenFlag(stringVal_chosen);
    }
    
    
    // Methods for field "stringValShort"
    public static GenericParameterValue createGenericParameterValueWithStringValShort(UTF8String16 stringValShort)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setStringValShort(stringValShort);
	return __object;
    }
    
    public boolean hasStringValShort()
    {
	return getChosenFlag() == stringValShort_chosen;
    }
    
    public void setStringValShort(UTF8String16 stringValShort)
    {
	setChosenValue(stringValShort);
	setChosenFlag(stringValShort_chosen);
    }
    
    
    // Methods for field "timestamp"
    public static GenericParameterValue createGenericParameterValueWithTimestamp(TimeStamp timestamp)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setTimestamp(timestamp);
	return __object;
    }
    
    public boolean hasTimestamp()
    {
	return getChosenFlag() == timestamp_chosen;
    }
    
    public void setTimestamp(TimeStamp timestamp)
    {
	setChosenValue(timestamp);
	setChosenFlag(timestamp_chosen);
    }
    
    
    // Methods for field "poi"
    public static GenericParameterValue createGenericParameterValueWithPoi(PointOfInterest poi)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setPoi(poi);
	return __object;
    }
    
    public boolean hasPoi()
    {
	return getChosenFlag() == poi_chosen;
    }
    
    public void setPoi(PointOfInterest poi)
    {
	setChosenValue(poi);
	setChosenFlag(poi_chosen);
    }
    
    
    // Methods for field "point"
    public static GenericParameterValue createGenericParameterValueWithPoint(BasicPosition point)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setPoint(point);
	return __object;
    }
    
    public boolean hasPoint()
    {
	return getChosenFlag() == point_chosen;
    }
    
    public void setPoint(BasicPosition point)
    {
	setChosenValue(point);
	setChosenFlag(point_chosen);
    }
    
    
    // Methods for field "position"
    public static GenericParameterValue createGenericParameterValueWithPosition(FullPosition position)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setPosition(position);
	return __object;
    }
    
    public boolean hasPosition()
    {
	return getChosenFlag() == position_chosen;
    }
    
    public void setPosition(FullPosition position)
    {
	setChosenValue(position);
	setChosenFlag(position_chosen);
    }
    
    
    // Methods for field "positions"
    public static GenericParameterValue createGenericParameterValueWithPositions(Positions positions)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setPositions(positions);
	return __object;
    }
    
    public boolean hasPositions()
    {
	return getChosenFlag() == positions_chosen;
    }
    
    public void setPositions(Positions positions)
    {
	setChosenValue(positions);
	setChosenFlag(positions_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Positions from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Positions extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Positions()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Positions(FullPosition[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(FullPosition element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(FullPosition element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized FullPosition get(int atIndex)
	{
	    return (FullPosition)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(FullPosition element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(FullPosition element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new FullPosition();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x802c
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"GenericParameterValue$Positions"
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
			new com.oss.asn1.INTEGER(32),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(1),
		new java.lang.Long(32)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "FullPosition"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Positions object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Positions object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Positions

    // Methods for field "trackPoint"
    public static GenericParameterValue createGenericParameterValueWithTrackPoint(TrackPoint trackPoint)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setTrackPoint(trackPoint);
	return __object;
    }
    
    public boolean hasTrackPoint()
    {
	return getChosenFlag() == trackPoint_chosen;
    }
    
    public void setTrackPoint(TrackPoint trackPoint)
    {
	setChosenValue(trackPoint);
	setChosenFlag(trackPoint_chosen);
    }
    
    
    // Methods for field "setOk"
    public static GenericParameterValue createGenericParameterValueWithSetOk(Null setOk)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setSetOk(setOk);
	return __object;
    }
    
    public boolean hasSetOk()
    {
	return getChosenFlag() == setOk_chosen;
    }
    
    public void setSetOk(Null setOk)
    {
	setChosenValue(setOk);
	setChosenFlag(setOk_chosen);
    }
    
    
    // Methods for field "failedNotAllowed"
    public static GenericParameterValue createGenericParameterValueWithFailedNotAllowed(Null failedNotAllowed)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setFailedNotAllowed(failedNotAllowed);
	return __object;
    }
    
    public boolean hasFailedNotAllowed()
    {
	return getChosenFlag() == failedNotAllowed_chosen;
    }
    
    public void setFailedNotAllowed(Null failedNotAllowed)
    {
	setChosenValue(failedNotAllowed);
	setChosenFlag(failedNotAllowed_chosen);
    }
    
    
    // Methods for field "setFailedWrongType"
    public static GenericParameterValue createGenericParameterValueWithSetFailedWrongType(Null setFailedWrongType)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setSetFailedWrongType(setFailedWrongType);
	return __object;
    }
    
    public boolean hasSetFailedWrongType()
    {
	return getChosenFlag() == setFailedWrongType_chosen;
    }
    
    public void setSetFailedWrongType(Null setFailedWrongType)
    {
	setChosenValue(setFailedWrongType);
	setChosenFlag(setFailedWrongType_chosen);
    }
    
    
    // Methods for field "setFailedValueOutOfRange"
    public static GenericParameterValue createGenericParameterValueWithSetFailedValueOutOfRange(Null setFailedValueOutOfRange)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setSetFailedValueOutOfRange(setFailedValueOutOfRange);
	return __object;
    }
    
    public boolean hasSetFailedValueOutOfRange()
    {
	return getChosenFlag() == setFailedValueOutOfRange_chosen;
    }
    
    public void setSetFailedValueOutOfRange(Null setFailedValueOutOfRange)
    {
	setChosenValue(setFailedValueOutOfRange);
	setChosenFlag(setFailedValueOutOfRange_chosen);
    }
    
    
    // Methods for field "failedKeyNotSupported"
    public static GenericParameterValue createGenericParameterValueWithFailedKeyNotSupported(Null failedKeyNotSupported)
    {
	GenericParameterValue __object = new GenericParameterValue();

	__object.setFailedKeyNotSupported(failedKeyNotSupported);
	return __object;
    }
    
    public boolean hasFailedKeyNotSupported()
    {
	return getChosenFlag() == failedKeyNotSupported_chosen;
    }
    
    public void setFailedKeyNotSupported(Null failedKeyNotSupported)
    {
	setChosenValue(failedKeyNotSupported);
	setChosenFlag(failedKeyNotSupported_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case noval_chosen:
		return new Null();
	    case read_chosen:
		return new Null();
	    case resetToDefault_chosen:
		return new Null();
	    case uint8Val_chosen:
		return new INTEGER();
	    case uint16Val_chosen:
		return new INTEGER();
	    case uint32Val_chosen:
		return new INTEGER();
	    case boolVal_chosen:
		return new BOOLEAN();
	    case dataVal_chosen:
		return new OctetString();
	    case dataValShort_chosen:
		return new OctetString();
	    case stringVal_chosen:
		return new UTF8String16();
	    case stringValShort_chosen:
		return new UTF8String16();
	    case timestamp_chosen:
		return new TimeStamp();
	    case poi_chosen:
		return new PointOfInterest();
	    case point_chosen:
		return new BasicPosition();
	    case position_chosen:
		return new FullPosition();
	    case positions_chosen:
		return new Positions();
	    case trackPoint_chosen:
		return new TrackPoint();
	    case setOk_chosen:
		return new Null();
	    case failedNotAllowed_chosen:
		return new Null();
	    case setFailedWrongType_chosen:
		return new Null();
	    case setFailedValueOutOfRange_chosen:
		return new Null();
	    case failedKeyNotSupported_chosen:
		return new Null();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "net.sirun.ngtp.ngtp_service_data",
	    "GenericParameterValue"
	),
	new QName (
	    "NGTP-Service-Data",
	    "GenericParameterValue"
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
		    "noval",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "read",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "resetToDefault",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "uint8Val",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "uint16Val",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "uint32Val",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "boolVal",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
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
					new com.oss.asn1.INTEGER(65535),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    )
			)
		    ),
		    "dataVal",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
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
					new com.oss.asn1.INTEGER(31),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(31)
			    )
			)
		    ),
		    "dataValShort",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8020
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
		    "stringVal",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8021
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
					new com.oss.asn1.INTEGER(31),
					0
				    )
				)
			    ),
			    null
			)
		    ),
		    "stringValShort",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8028
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
		    "timestamp",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8029
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"PointOfInterest"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"PointOfInterest"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PointOfInterest"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "PointOfInterest"
				)
			    ),
			    0
			)
		    ),
		    "poi",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802a
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BasicPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicPosition"
				)
			    ),
			    0
			)
		    ),
		    "point",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802b
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"FullPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"FullPosition"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FullPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FullPosition"
				)
			    ),
			    0
			)
		    ),
		    "position",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "GenericParameterValue$Positions"
			)
		    ),
		    "positions",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802d
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TrackPoint"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TrackPoint"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TrackPoint"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TrackPoint"
				)
			    ),
			    0
			)
		    ),
		    "trackPoint",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8032
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
		    "setOk",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8033
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
		    "failedNotAllowed",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8034
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
		    "setFailedWrongType",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8035
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
		    "setFailedValueOutOfRange",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8036
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
		    "failedKeyNotSupported",
		    21,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2),
		new TagDecoderElement((short)0x800a, 3),
		new TagDecoderElement((short)0x800b, 4),
		new TagDecoderElement((short)0x800c, 5),
		new TagDecoderElement((short)0x800d, 6),
		new TagDecoderElement((short)0x801e, 7),
		new TagDecoderElement((short)0x801f, 8),
		new TagDecoderElement((short)0x8020, 9),
		new TagDecoderElement((short)0x8021, 10),
		new TagDecoderElement((short)0x8028, 11),
		new TagDecoderElement((short)0x8029, 12),
		new TagDecoderElement((short)0x802a, 13),
		new TagDecoderElement((short)0x802b, 14),
		new TagDecoderElement((short)0x802c, 15),
		new TagDecoderElement((short)0x802d, 16),
		new TagDecoderElement((short)0x8032, 17),
		new TagDecoderElement((short)0x8033, 18),
		new TagDecoderElement((short)0x8034, 19),
		new TagDecoderElement((short)0x8035, 20),
		new TagDecoderElement((short)0x8036, 21)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' GenericParameterValue object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GenericParameterValue object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GenericParameterValue
