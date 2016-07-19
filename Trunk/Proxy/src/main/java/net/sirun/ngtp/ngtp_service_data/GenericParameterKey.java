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
 * Define the ASN1 Type GenericParameterKey from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class GenericParameterKey extends Choice {
    
    /**
     * The default constructor.
     */
    public GenericParameterKey()
    {
    }
    
    public static final  int  name_chosen = 1;
    public static final  int  id_chosen = 2;
    
    // Methods for field "name"
    public static GenericParameterKey createGenericParameterKeyWithName(PrintableString name)
    {
	GenericParameterKey __object = new GenericParameterKey();

	__object.setName(name);
	return __object;
    }
    
    public boolean hasName()
    {
	return getChosenFlag() == name_chosen;
    }
    
    public void setName(PrintableString name)
    {
	setChosenValue(name);
	setChosenFlag(name_chosen);
    }
    
    
    // Methods for field "id"
    public static GenericParameterKey createGenericParameterKeyWithId(long id)
    {
	return createGenericParameterKeyWithId(new INTEGER(id));
    }
    
    public static GenericParameterKey createGenericParameterKeyWithId(INTEGER id)
    {
	GenericParameterKey __object = new GenericParameterKey();

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
	    case name_chosen:
		return new PrintableString();
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
	    null
	),
	new QName (
	    "net.sirun.ngtp.ngtp_service_data",
	    "GenericParameterKey"
	),
	new QName (
	    "NGTP-Service-Data",
	    "GenericParameterKey"
	),
	12314,
	null,
	new Fields (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
					    new com.oss.asn1.INTEGER(0), 
					    new com.oss.asn1.INTEGER(63),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    PrintableStringPAInfo.pa
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "name",
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
     * Get the type descriptor (TypeInfo) of 'this' GenericParameterKey object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GenericParameterKey object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GenericParameterKey
