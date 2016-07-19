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
 * Define the ASN1 Type NGTPCore from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class NGTPCore extends Choice {
    
    /**
     * The default constructor.
     */
    public NGTPCore()
    {
    }
    
    public static final  int  uplink_chosen = 1;
    public static final  int  downlink_chosen = 2;
    
    // Methods for field "uplink"
    public static NGTPCore createNGTPCoreWithUplink(NGTPUplinkCore uplink)
    {
	NGTPCore __object = new NGTPCore();

	__object.setUplink(uplink);
	return __object;
    }
    
    public boolean hasUplink()
    {
	return getChosenFlag() == uplink_chosen;
    }
    
    public void setUplink(NGTPUplinkCore uplink)
    {
	setChosenValue(uplink);
	setChosenFlag(uplink_chosen);
    }
    
    
    // Methods for field "downlink"
    public static NGTPCore createNGTPCoreWithDownlink(NGTPDownlinkCore downlink)
    {
	NGTPCore __object = new NGTPCore();

	__object.setDownlink(downlink);
	return __object;
    }
    
    public boolean hasDownlink()
    {
	return getChosenFlag() == downlink_chosen;
    }
    
    public void setDownlink(NGTPDownlinkCore downlink)
    {
	setChosenValue(downlink);
	setChosenFlag(downlink_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case uplink_chosen:
		return new NGTPUplinkCore();
	    case downlink_chosen:
		return new NGTPDownlinkCore();
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
	    "NGTPCore"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NGTPCore"
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
				"NGTPUplinkCore"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NGTPUplinkCore"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NGTPUplinkCore"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NGTPUplinkCore"
				)
			    ),
			    0
			)
		    ),
		    "uplink",
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
				"NGTPDownlinkCore"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NGTPDownlinkCore"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NGTPDownlinkCore"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NGTPDownlinkCore"
				)
			    ),
			    0
			)
		    ),
		    "downlink",
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
     * Get the type descriptor (TypeInfo) of 'this' NGTPCore object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPCore object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NGTPCore
