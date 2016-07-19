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
 * Define the ASN1 Type NetworkLocation from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class NetworkLocation extends Choice {
    
    /**
     * The default constructor.
     */
    public NetworkLocation()
    {
    }
    
    public static final  int  gsmNwLocation_chosen = 1;
    public static final  int  umtsNwLocation_chosen = 2;
    public static final  int  lteNwLocation_chosen = 3;
    
    // Methods for field "gsmNwLocation"
    public static NetworkLocation createNetworkLocationWithGsmNwLocation(GsmNetworkLocation gsmNwLocation)
    {
	NetworkLocation __object = new NetworkLocation();

	__object.setGsmNwLocation(gsmNwLocation);
	return __object;
    }
    
    public boolean hasGsmNwLocation()
    {
	return getChosenFlag() == gsmNwLocation_chosen;
    }
    
    public void setGsmNwLocation(GsmNetworkLocation gsmNwLocation)
    {
	setChosenValue(gsmNwLocation);
	setChosenFlag(gsmNwLocation_chosen);
    }
    
    
    // Methods for field "umtsNwLocation"
    public static NetworkLocation createNetworkLocationWithUmtsNwLocation(UmtsNetworkLocation umtsNwLocation)
    {
	NetworkLocation __object = new NetworkLocation();

	__object.setUmtsNwLocation(umtsNwLocation);
	return __object;
    }
    
    public boolean hasUmtsNwLocation()
    {
	return getChosenFlag() == umtsNwLocation_chosen;
    }
    
    public void setUmtsNwLocation(UmtsNetworkLocation umtsNwLocation)
    {
	setChosenValue(umtsNwLocation);
	setChosenFlag(umtsNwLocation_chosen);
    }
    
    
    // Methods for field "lteNwLocation"
    public static NetworkLocation createNetworkLocationWithLteNwLocation(LteNetworkLocation lteNwLocation)
    {
	NetworkLocation __object = new NetworkLocation();

	__object.setLteNwLocation(lteNwLocation);
	return __object;
    }
    
    public boolean hasLteNwLocation()
    {
	return getChosenFlag() == lteNwLocation_chosen;
    }
    
    public void setLteNwLocation(LteNetworkLocation lteNwLocation)
    {
	setChosenValue(lteNwLocation);
	setChosenFlag(lteNwLocation_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case gsmNwLocation_chosen:
		return new GsmNetworkLocation();
	    case umtsNwLocation_chosen:
		return new UmtsNetworkLocation();
	    case lteNwLocation_chosen:
		return new LteNetworkLocation();
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
	    "NetworkLocation"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NetworkLocation"
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
				"GsmNetworkLocation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"GsmNetworkLocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GsmNetworkLocation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GsmNetworkLocation"
				)
			    ),
			    0
			)
		    ),
		    "gsmNwLocation",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"UmtsNetworkLocation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"UmtsNetworkLocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "UmtsNetworkLocation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "UmtsNetworkLocation"
				)
			    ),
			    0
			)
		    ),
		    "umtsNwLocation",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"LteNetworkLocation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"LteNetworkLocation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "LteNetworkLocation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "LteNetworkLocation"
				)
			    ),
			    0
			)
		    ),
		    "lteNwLocation",
		    2,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x8001, 1),
		new TagDecoderElement((short)0x8002, 2)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NetworkLocation object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NetworkLocation object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NetworkLocation
