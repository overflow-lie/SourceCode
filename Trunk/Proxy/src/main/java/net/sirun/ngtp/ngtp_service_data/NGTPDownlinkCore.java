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
 * Define the ASN1 Type NGTPDownlinkCore from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class NGTPDownlinkCore extends Sequence {
    
    /**
     * The default constructor.
     */
    public NGTPDownlinkCore()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NGTPDownlinkCore(PoiDataSet poiDataSet, 
		    RemoteOperationRequestList remoteOperations, 
		    GenericText genericText, TuConfiguration configuration, 
		    GenericParams genericParams, ErrorCodes errorCodes)
    {
	setPoiDataSet(poiDataSet);
	setRemoteOperations(remoteOperations);
	setGenericText(genericText);
	setConfiguration(configuration);
	setGenericParams(genericParams);
	setErrorCodes(errorCodes);
    }
    
    public void initComponents()
    {
	mComponents[0] = new PoiDataSet();
	mComponents[1] = new RemoteOperationRequestList();
	mComponents[2] = new GenericText();
	mComponents[3] = new TuConfiguration();
	mComponents[4] = new GenericParams();
	mComponents[5] = new ErrorCodes();
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
		return new PoiDataSet();
	    case 1:
		return new RemoteOperationRequestList();
	    case 2:
		return new GenericText();
	    case 3:
		return new TuConfiguration();
	    case 4:
		return new GenericParams();
	    case 5:
		return new ErrorCodes();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "poiDataSet"
    public PoiDataSet getPoiDataSet()
    {
	return (PoiDataSet)mComponents[0];
    }
    
    public void setPoiDataSet(PoiDataSet poiDataSet)
    {
	mComponents[0] = poiDataSet;
    }
    
    public boolean hasPoiDataSet()
    {
	return componentIsPresent(0);
    }
    
    public void deletePoiDataSet()
    {
	setComponentAbsent(0);
    }
    
    
    
    /**
     * Define the ASN1 Type PoiDataSet from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class PoiDataSet extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public PoiDataSet()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public PoiDataSet(PointOfInterest[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(PointOfInterest element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(PointOfInterest element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized PointOfInterest get(int atIndex)
	{
	    return (PointOfInterest)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(PointOfInterest element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(PointOfInterest element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new PointOfInterest();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8000
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPDownlinkCore$PoiDataSet"
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
			new com.oss.asn1.INTEGER(15),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(15)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "PointOfInterest"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' PoiDataSet object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' PoiDataSet object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for PoiDataSet

    // Methods for field "remoteOperations"
    public RemoteOperationRequestList getRemoteOperations()
    {
	return (RemoteOperationRequestList)mComponents[1];
    }
    
    public void setRemoteOperations(RemoteOperationRequestList remoteOperations)
    {
	mComponents[1] = remoteOperations;
    }
    
    public boolean hasRemoteOperations()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRemoteOperations()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "genericText"
    public GenericText getGenericText()
    {
	return (GenericText)mComponents[2];
    }
    
    public void setGenericText(GenericText genericText)
    {
	mComponents[2] = genericText;
    }
    
    public boolean hasGenericText()
    {
	return componentIsPresent(2);
    }
    
    public void deleteGenericText()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "configuration"
    public TuConfiguration getConfiguration()
    {
	return (TuConfiguration)mComponents[3];
    }
    
    public void setConfiguration(TuConfiguration configuration)
    {
	mComponents[3] = configuration;
    }
    
    public boolean hasConfiguration()
    {
	return componentIsPresent(3);
    }
    
    public void deleteConfiguration()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "genericParams"
    public GenericParams getGenericParams()
    {
	return (GenericParams)mComponents[4];
    }
    
    public void setGenericParams(GenericParams genericParams)
    {
	mComponents[4] = genericParams;
    }
    
    public boolean hasGenericParams()
    {
	return componentIsPresent(4);
    }
    
    public void deleteGenericParams()
    {
	setComponentAbsent(4);
    }
    
    
    
    /**
     * Define the ASN1 Type GenericParams from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class GenericParams extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public GenericParams()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public GenericParams(GenericParameter[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(GenericParameter element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(GenericParameter element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized GenericParameter get(int atIndex)
	{
	    return (GenericParameter)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(GenericParameter element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(GenericParameter element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new GenericParameter();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8004
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPDownlinkCore$GenericParams"
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
			new com.oss.asn1.INTEGER(255),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(255)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "GenericParameter"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' GenericParams object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GenericParams object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GenericParams

    // Methods for field "errorCodes"
    public ErrorCodes getErrorCodes()
    {
	return (ErrorCodes)mComponents[5];
    }
    
    public void setErrorCodes(ErrorCodes errorCodes)
    {
	mComponents[5] = errorCodes;
    }
    
    public boolean hasErrorCodes()
    {
	return componentIsPresent(5);
    }
    
    public void deleteErrorCodes()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type ErrorCodes from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class ErrorCodes extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public ErrorCodes()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public ErrorCodes(ErrorCode[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(ErrorCode element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(ErrorCode element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized ErrorCode get(int atIndex)
	{
	    return (ErrorCode)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(ErrorCode element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(ErrorCode element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new ErrorCode();
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
		"NGTPDownlinkCore$ErrorCodes"
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
			new com.oss.asn1.INTEGER(255),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(255)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "ErrorCode"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ErrorCodes object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ErrorCodes object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ErrorCodes

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
	    "NGTPDownlinkCore"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NGTPDownlinkCore"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPDownlinkCore$PoiDataSet"
			)
		    ),
		    "poiDataSet",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "RemoteOperationRequestList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "RemoteOperationRequestList"
				)
			    ),
			    0
			)
		    ),
		    "remoteOperations",
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
				"GenericText"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"GenericText"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GenericText"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GenericText"
				)
			    ),
			    0
			)
		    ),
		    "genericText",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TuConfiguration"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TuConfiguration"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TuConfiguration"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TuConfiguration"
				)
			    ),
			    0
			)
		    ),
		    "configuration",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPDownlinkCore$GenericParams"
			)
		    ),
		    "genericParams",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPDownlinkCore$ErrorCodes"
			)
		    ),
		    "errorCodes",
		    5,
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' NGTPDownlinkCore object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPDownlinkCore object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NGTPDownlinkCore
