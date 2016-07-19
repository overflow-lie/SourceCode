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
 * Define the ASN1 Type TrackPointExtension from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class TrackPointExtension extends Choice {
    
    /**
     * The default constructor.
     */
    public TrackPointExtension()
    {
    }
    
    public static final  int  none_chosen = 1;
    public static final  int  ecoRating_chosen = 2;
    
    // Methods for field "none"
    public static TrackPointExtension createTrackPointExtensionWithNone(Null none)
    {
	TrackPointExtension __object = new TrackPointExtension();

	__object.setNone(none);
	return __object;
    }
    
    public boolean hasNone()
    {
	return getChosenFlag() == none_chosen;
    }
    
    public void setNone(Null none)
    {
	setChosenValue(none);
	setChosenFlag(none_chosen);
    }
    
    
    // Methods for field "ecoRating"
    public static TrackPointExtension createTrackPointExtensionWithEcoRating(long ecoRating)
    {
	return createTrackPointExtensionWithEcoRating(new INTEGER(ecoRating));
    }
    
    public static TrackPointExtension createTrackPointExtensionWithEcoRating(INTEGER ecoRating)
    {
	TrackPointExtension __object = new TrackPointExtension();

	__object.setEcoRating(ecoRating);
	return __object;
    }
    
    public boolean hasEcoRating()
    {
	return getChosenFlag() == ecoRating_chosen;
    }
    
    public void setEcoRating(long ecoRating)
    {
	setEcoRating(new INTEGER(ecoRating));
    }
    
    public void setEcoRating(INTEGER ecoRating)
    {
	setChosenValue(ecoRating);
	setChosenFlag(ecoRating_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case none_chosen:
		return new Null();
	    case ecoRating_chosen:
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
	    "TrackPointExtension"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TrackPointExtension"
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
		    "none",
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
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "ecoRating",
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
     * Get the type descriptor (TypeInfo) of 'this' TrackPointExtension object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TrackPointExtension object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TrackPointExtension
