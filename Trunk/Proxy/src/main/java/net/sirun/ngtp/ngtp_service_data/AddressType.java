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
 * Define the ASN1 Type AddressType from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class AddressType extends Choice {
    
    /**
     * The default constructor.
     */
    public AddressType()
    {
    }
    
    public static final  int  absolute_chosen = 1;
    public static final  int  reference_id_chosen = 2;
    
    // Methods for field "absolute"
    public static AddressType createAddressTypeWithAbsolute(CommunicationAddress absolute)
    {
	AddressType __object = new AddressType();

	__object.setAbsolute(absolute);
	return __object;
    }
    
    public boolean hasAbsolute()
    {
	return getChosenFlag() == absolute_chosen;
    }
    
    public void setAbsolute(CommunicationAddress absolute)
    {
	setChosenValue(absolute);
	setChosenFlag(absolute_chosen);
    }
    
    
    // Methods for field "reference_id"
    public static AddressType createAddressTypeWithReference_id(Null reference_id)
    {
	AddressType __object = new AddressType();

	__object.setReference_id(reference_id);
	return __object;
    }
    
    public boolean hasReference_id()
    {
	return getChosenFlag() == reference_id_chosen;
    }
    
    public void setReference_id(Null reference_id)
    {
	setChosenValue(reference_id);
	setChosenFlag(reference_id_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case absolute_chosen:
		return new CommunicationAddress();
	    case reference_id_chosen:
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
	    "AddressType"
	),
	new QName (
	    "NGTP-Service-Data",
	    "AddressType"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"CommunicationAddress"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"CommunicationAddress"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "CommunicationAddress"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "CommunicationAddress"
				)
			    ),
			    0
			)
		    ),
		    "absolute",
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
		    "reference-id",
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
     * Get the type descriptor (TypeInfo) of 'this' AddressType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AddressType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AddressType
