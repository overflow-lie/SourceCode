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


package net.sirun.ngtp.ngtp_dispatch;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type NGTPDispatcherData from ASN1 Module NGTP_Dispatch.
 * @see Choice
 */

public class NGTPDispatcherData extends Choice {
    
    /**
     * The default constructor.
     */
    public NGTPDispatcherData()
    {
    }
    
    public static final  int  uplink_chosen = 1;
    public static final  int  downlink_chosen = 2;
    public static final  int  control_chosen = 3;
    
    // Methods for field "uplink"
    public static NGTPDispatcherData createNGTPDispatcherDataWithUplink(UplinkNGTPDispatcherData uplink)
    {
	NGTPDispatcherData __object = new NGTPDispatcherData();

	__object.setUplink(uplink);
	return __object;
    }
    
    public boolean hasUplink()
    {
	return getChosenFlag() == uplink_chosen;
    }
    
    public void setUplink(UplinkNGTPDispatcherData uplink)
    {
	setChosenValue(uplink);
	setChosenFlag(uplink_chosen);
    }
    
    
    // Methods for field "downlink"
    public static NGTPDispatcherData createNGTPDispatcherDataWithDownlink(DownlinkNGTPDispatcherData downlink)
    {
	NGTPDispatcherData __object = new NGTPDispatcherData();

	__object.setDownlink(downlink);
	return __object;
    }
    
    public boolean hasDownlink()
    {
	return getChosenFlag() == downlink_chosen;
    }
    
    public void setDownlink(DownlinkNGTPDispatcherData downlink)
    {
	setChosenValue(downlink);
	setChosenFlag(downlink_chosen);
    }
    
    
    // Methods for field "control"
    public static NGTPDispatcherData createNGTPDispatcherDataWithControl(ControlNGTPDispatcherData control)
    {
	NGTPDispatcherData __object = new NGTPDispatcherData();

	__object.setControl(control);
	return __object;
    }
    
    public boolean hasControl()
    {
	return getChosenFlag() == control_chosen;
    }
    
    public void setControl(ControlNGTPDispatcherData control)
    {
	setChosenValue(control);
	setChosenFlag(control_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case uplink_chosen:
		return new UplinkNGTPDispatcherData();
	    case downlink_chosen:
		return new DownlinkNGTPDispatcherData();
	    case control_chosen:
		return new ControlNGTPDispatcherData();
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
	    "net.sirun.ngtp.ngtp_dispatch",
	    "NGTPDispatcherData"
	),
	new QName (
	    "NGTP-Dispatch",
	    "NGTPDispatcherData"
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
				"net.sirun.ngtp.ngtp_dispatch",
				"UplinkNGTPDispatcherData"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"UplinkNGTPDispatcherData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "UplinkNGTPDispatcherData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "UplinkNGTPDispatcherData"
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
				"net.sirun.ngtp.ngtp_dispatch",
				"DownlinkNGTPDispatcherData"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"DownlinkNGTPDispatcherData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "DownlinkNGTPDispatcherData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "DownlinkNGTPDispatcherData"
				)
			    ),
			    0
			)
		    ),
		    "downlink",
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
				"net.sirun.ngtp.ngtp_dispatch",
				"ControlNGTPDispatcherData"
			    ),
			    new QName (
				"NGTP-Dispatch",
				"ControlNGTPDispatcherData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "ControlNGTPDispatcherData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_dispatch",
				    "ControlNGTPDispatcherData"
				)
			    ),
			    0
			)
		    ),
		    "control",
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
     * Get the type descriptor (TypeInfo) of 'this' NGTPDispatcherData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPDispatcherData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for NGTPDispatcherData
