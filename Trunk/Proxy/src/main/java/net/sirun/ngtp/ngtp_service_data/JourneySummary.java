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
 * Define the ASN1 Type JourneySummary from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class JourneySummary extends Choice {
    
    /**
     * The default constructor.
     */
    public JourneySummary()
    {
    }
    
    public static final  int  type1_chosen = 1;
    public static final  int  type2_chosen = 2;
    public static final  int  type2A_chosen = 3;
    public static final  int  type2B_chosen = 4;
    
    // Methods for field "type1"
    public static JourneySummary createJourneySummaryWithType1(JourneySummary1 type1)
    {
	JourneySummary __object = new JourneySummary();

	__object.setType1(type1);
	return __object;
    }
    
    public boolean hasType1()
    {
	return getChosenFlag() == type1_chosen;
    }
    
    public void setType1(JourneySummary1 type1)
    {
	setChosenValue(type1);
	setChosenFlag(type1_chosen);
    }
    
    
    // Methods for field "type2"
    public static JourneySummary createJourneySummaryWithType2(JourneySummary2 type2)
    {
	JourneySummary __object = new JourneySummary();

	__object.setType2(type2);
	return __object;
    }
    
    public boolean hasType2()
    {
	return getChosenFlag() == type2_chosen;
    }
    
    public void setType2(JourneySummary2 type2)
    {
	setChosenValue(type2);
	setChosenFlag(type2_chosen);
    }
    
    
    // Methods for field "type2A"
    public static JourneySummary createJourneySummaryWithType2A(JourneySummary2 type2A)
    {
	JourneySummary __object = new JourneySummary();

	__object.setType2A(type2A);
	return __object;
    }
    
    public boolean hasType2A()
    {
	return getChosenFlag() == type2A_chosen;
    }
    
    public void setType2A(JourneySummary2 type2A)
    {
	setChosenValue(type2A);
	setChosenFlag(type2A_chosen);
    }
    
    
    // Methods for field "type2B"
    public static JourneySummary createJourneySummaryWithType2B(JourneySummary2 type2B)
    {
	JourneySummary __object = new JourneySummary();

	__object.setType2B(type2B);
	return __object;
    }
    
    public boolean hasType2B()
    {
	return getChosenFlag() == type2B_chosen;
    }
    
    public void setType2B(JourneySummary2 type2B)
    {
	setChosenValue(type2B);
	setChosenFlag(type2B_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case type1_chosen:
		return new JourneySummary1();
	    case type2_chosen:
		return new JourneySummary2();
	    case type2A_chosen:
		return new JourneySummary2();
	    case type2B_chosen:
		return new JourneySummary2();
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
	    "JourneySummary"
	),
	new QName (
	    "NGTP-Service-Data",
	    "JourneySummary"
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
				"JourneySummary1"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"JourneySummary1"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary1"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary1"
				)
			    ),
			    0
			)
		    ),
		    "type1",
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
				"JourneySummary2"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"JourneySummary2"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary2"
				)
			    ),
			    0
			)
		    ),
		    "type2",
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
				"JourneySummary2"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"JourneySummary2"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary2"
				)
			    ),
			    0
			)
		    ),
		    "type2A",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"JourneySummary2"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"JourneySummary2"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "JourneySummary2"
				)
			    ),
			    0
			)
		    ),
		    "type2B",
		    3,
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
		new TagDecoderElement((short)0x8003, 3)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' JourneySummary object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' JourneySummary object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for JourneySummary
