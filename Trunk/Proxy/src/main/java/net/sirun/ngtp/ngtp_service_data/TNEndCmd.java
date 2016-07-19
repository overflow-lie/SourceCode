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
 * Define the ASN1 Type TNEndCmd from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TNEndCmd extends Sequence {
    
    /**
     * The default constructor.
     */
    public TNEndCmd()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TNEndCmd(Null tnEnd, BOOLEAN svtEnd, BOOLEAN rviMobilize)
    {
	setTnEnd(tnEnd);
	setSvtEnd(svtEnd);
	setRviMobilize(rviMobilize);
    }
    
    /**
     * Construct with components.
     */
    public TNEndCmd(Null tnEnd, boolean svtEnd, boolean rviMobilize)
    {
	this(tnEnd, new BOOLEAN(svtEnd), new BOOLEAN(rviMobilize));
    }
    
    /**
     * Construct with required components.
     */
    public TNEndCmd(Null tnEnd)
    {
	setTnEnd(tnEnd);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Null();
	mComponents[1] = new BOOLEAN();
	mComponents[2] = new BOOLEAN();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new Null();
	    case 1:
		return new BOOLEAN();
	    case 2:
		return new BOOLEAN();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    // Default Values
    public static final com.oss.asn1.BOOLEAN svtEnd__default = 
	new com.oss.asn1.BOOLEAN(true);
    public static final com.oss.asn1.BOOLEAN rviMobilize__default = 
	new com.oss.asn1.BOOLEAN(true);
    
    // Methods for field "tnEnd"
    public Null getTnEnd()
    {
	return (Null)mComponents[0];
    }
    
    public void setTnEnd(Null tnEnd)
    {
	mComponents[0] = tnEnd;
    }
    
    
    // Methods for field "svtEnd"
    public boolean getSvtEnd()
    {
	if (hasSvtEnd())
	    return ((BOOLEAN)mComponents[1]).booleanValue();
	else
	    return svtEnd__default.booleanValue();
    }
    
    public void setSvtEnd(boolean svtEnd)
    {
	setSvtEnd(new BOOLEAN(svtEnd));
    }
    
    public void setSvtEnd(BOOLEAN svtEnd)
    {
	mComponents[1] = svtEnd;
    }
    
    public void setSvtEndToDefault()
    {
	setSvtEnd(svtEnd__default);
    }
    
    public boolean hasDefaultSvtEnd()
    {
	return true;
    }
    
    public boolean hasSvtEnd()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSvtEnd()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rviMobilize"
    public boolean getRviMobilize()
    {
	if (hasRviMobilize())
	    return ((BOOLEAN)mComponents[2]).booleanValue();
	else
	    return rviMobilize__default.booleanValue();
    }
    
    public void setRviMobilize(boolean rviMobilize)
    {
	setRviMobilize(new BOOLEAN(rviMobilize));
    }
    
    public void setRviMobilize(BOOLEAN rviMobilize)
    {
	mComponents[2] = rviMobilize;
    }
    
    public void setRviMobilizeToDefault()
    {
	setRviMobilize(rviMobilize__default);
    }
    
    public boolean hasDefaultRviMobilize()
    {
	return true;
    }
    
    public boolean hasRviMobilize()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRviMobilize()
    {
	setComponentAbsent(2);
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
	    "TNEndCmd"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TNEndCmd"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
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
		    "tnEnd",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "svtEnd",
		    1,
		    3,
		    svtEnd__default
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "rviMobilize",
		    2,
		    3,
		    rviMobilize__default
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TNEndCmd object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TNEndCmd object.
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
    
} // End class definition for TNEndCmd
