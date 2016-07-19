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
 * Define the ASN1 Type TUDiagnosticData from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class TUDiagnosticData extends Sequence {
    
    /**
     * The default constructor.
     */
    public TUDiagnosticData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public TUDiagnosticData(TUDiagnostic speaker, TUDiagnostic mic, 
		    TUDiagnostic extHandsfree, TUDiagnostic handset, 
		    TUDiagnostic gsmModem, TUDiagnostic gsmExtAntenna, 
		    TUDiagnostic extPower, TUDiagnostic intPower, 
		    TUDiagnostic gnss, TUDiagnostic gnssAntenna, 
		    TUDiagnostic can, TUDiagnostic buttons, 
		    TUDiagnostic crashInput, TUDiagnostic intRtc, 
		    TroubleCodes troubleCodes, INTEGER daysSinceGnssFix)
    {
	setSpeaker(speaker);
	setMic(mic);
	setExtHandsfree(extHandsfree);
	setHandset(handset);
	setGsmModem(gsmModem);
	setGsmExtAntenna(gsmExtAntenna);
	setExtPower(extPower);
	setIntPower(intPower);
	setGnss(gnss);
	setGnssAntenna(gnssAntenna);
	setCan(can);
	setButtons(buttons);
	setCrashInput(crashInput);
	setIntRtc(intRtc);
	setTroubleCodes(troubleCodes);
	setDaysSinceGnssFix(daysSinceGnssFix);
    }
    
    /**
     * Construct with components.
     */
    public TUDiagnosticData(TUDiagnostic speaker, TUDiagnostic mic, 
		    TUDiagnostic extHandsfree, TUDiagnostic handset, 
		    TUDiagnostic gsmModem, TUDiagnostic gsmExtAntenna, 
		    TUDiagnostic extPower, TUDiagnostic intPower, 
		    TUDiagnostic gnss, TUDiagnostic gnssAntenna, 
		    TUDiagnostic can, TUDiagnostic buttons, 
		    TUDiagnostic crashInput, TUDiagnostic intRtc, 
		    TroubleCodes troubleCodes, long daysSinceGnssFix)
    {
	this(speaker, mic, extHandsfree, handset, gsmModem, 
	     gsmExtAntenna, extPower, intPower, gnss, gnssAntenna, can, 
	     buttons, crashInput, intRtc, troubleCodes, 
	     new INTEGER(daysSinceGnssFix));
    }
    
    /**
     * Construct with required components.
     */
    public TUDiagnosticData(TUDiagnostic speaker, TUDiagnostic mic, 
		    TUDiagnostic extHandsfree, TUDiagnostic handset, 
		    TUDiagnostic gsmModem, TUDiagnostic gsmExtAntenna, 
		    TUDiagnostic extPower, TUDiagnostic intPower, 
		    TUDiagnostic gnss, TUDiagnostic gnssAntenna, 
		    TUDiagnostic can, TUDiagnostic buttons, 
		    TUDiagnostic crashInput, TUDiagnostic intRtc, 
		    long daysSinceGnssFix)
    {
	setSpeaker(speaker);
	setMic(mic);
	setExtHandsfree(extHandsfree);
	setHandset(handset);
	setGsmModem(gsmModem);
	setGsmExtAntenna(gsmExtAntenna);
	setExtPower(extPower);
	setIntPower(intPower);
	setGnss(gnss);
	setGnssAntenna(gnssAntenna);
	setCan(can);
	setButtons(buttons);
	setCrashInput(crashInput);
	setIntRtc(intRtc);
	setDaysSinceGnssFix(daysSinceGnssFix);
    }
    
    public void initComponents()
    {
	mComponents[0] = TUDiagnostic.broken;
	mComponents[1] = TUDiagnostic.broken;
	mComponents[2] = TUDiagnostic.broken;
	mComponents[3] = TUDiagnostic.broken;
	mComponents[4] = TUDiagnostic.broken;
	mComponents[5] = TUDiagnostic.broken;
	mComponents[6] = TUDiagnostic.broken;
	mComponents[7] = TUDiagnostic.broken;
	mComponents[8] = TUDiagnostic.broken;
	mComponents[9] = TUDiagnostic.broken;
	mComponents[10] = TUDiagnostic.broken;
	mComponents[11] = TUDiagnostic.broken;
	mComponents[12] = TUDiagnostic.broken;
	mComponents[13] = TUDiagnostic.broken;
	mComponents[14] = new TroubleCodes();
	mComponents[15] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[16];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return TUDiagnostic.broken;
	    case 1:
		return TUDiagnostic.broken;
	    case 2:
		return TUDiagnostic.broken;
	    case 3:
		return TUDiagnostic.broken;
	    case 4:
		return TUDiagnostic.broken;
	    case 5:
		return TUDiagnostic.broken;
	    case 6:
		return TUDiagnostic.broken;
	    case 7:
		return TUDiagnostic.broken;
	    case 8:
		return TUDiagnostic.broken;
	    case 9:
		return TUDiagnostic.broken;
	    case 10:
		return TUDiagnostic.broken;
	    case 11:
		return TUDiagnostic.broken;
	    case 12:
		return TUDiagnostic.broken;
	    case 13:
		return TUDiagnostic.broken;
	    case 14:
		return new TroubleCodes();
	    case 15:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "speaker"
    public TUDiagnostic getSpeaker()
    {
	return (TUDiagnostic)mComponents[0];
    }
    
    public void setSpeaker(TUDiagnostic speaker)
    {
	mComponents[0] = speaker;
    }
    
    
    // Methods for field "mic"
    public TUDiagnostic getMic()
    {
	return (TUDiagnostic)mComponents[1];
    }
    
    public void setMic(TUDiagnostic mic)
    {
	mComponents[1] = mic;
    }
    
    
    // Methods for field "extHandsfree"
    public TUDiagnostic getExtHandsfree()
    {
	return (TUDiagnostic)mComponents[2];
    }
    
    public void setExtHandsfree(TUDiagnostic extHandsfree)
    {
	mComponents[2] = extHandsfree;
    }
    
    
    // Methods for field "handset"
    public TUDiagnostic getHandset()
    {
	return (TUDiagnostic)mComponents[3];
    }
    
    public void setHandset(TUDiagnostic handset)
    {
	mComponents[3] = handset;
    }
    
    
    // Methods for field "gsmModem"
    public TUDiagnostic getGsmModem()
    {
	return (TUDiagnostic)mComponents[4];
    }
    
    public void setGsmModem(TUDiagnostic gsmModem)
    {
	mComponents[4] = gsmModem;
    }
    
    
    // Methods for field "gsmExtAntenna"
    public TUDiagnostic getGsmExtAntenna()
    {
	return (TUDiagnostic)mComponents[5];
    }
    
    public void setGsmExtAntenna(TUDiagnostic gsmExtAntenna)
    {
	mComponents[5] = gsmExtAntenna;
    }
    
    
    // Methods for field "extPower"
    public TUDiagnostic getExtPower()
    {
	return (TUDiagnostic)mComponents[6];
    }
    
    public void setExtPower(TUDiagnostic extPower)
    {
	mComponents[6] = extPower;
    }
    
    
    // Methods for field "intPower"
    public TUDiagnostic getIntPower()
    {
	return (TUDiagnostic)mComponents[7];
    }
    
    public void setIntPower(TUDiagnostic intPower)
    {
	mComponents[7] = intPower;
    }
    
    
    // Methods for field "gnss"
    public TUDiagnostic getGnss()
    {
	return (TUDiagnostic)mComponents[8];
    }
    
    public void setGnss(TUDiagnostic gnss)
    {
	mComponents[8] = gnss;
    }
    
    
    // Methods for field "gnssAntenna"
    public TUDiagnostic getGnssAntenna()
    {
	return (TUDiagnostic)mComponents[9];
    }
    
    public void setGnssAntenna(TUDiagnostic gnssAntenna)
    {
	mComponents[9] = gnssAntenna;
    }
    
    
    // Methods for field "can"
    public TUDiagnostic getCan()
    {
	return (TUDiagnostic)mComponents[10];
    }
    
    public void setCan(TUDiagnostic can)
    {
	mComponents[10] = can;
    }
    
    
    // Methods for field "buttons"
    public TUDiagnostic getButtons()
    {
	return (TUDiagnostic)mComponents[11];
    }
    
    public void setButtons(TUDiagnostic buttons)
    {
	mComponents[11] = buttons;
    }
    
    
    // Methods for field "crashInput"
    public TUDiagnostic getCrashInput()
    {
	return (TUDiagnostic)mComponents[12];
    }
    
    public void setCrashInput(TUDiagnostic crashInput)
    {
	mComponents[12] = crashInput;
    }
    
    
    // Methods for field "intRtc"
    public TUDiagnostic getIntRtc()
    {
	return (TUDiagnostic)mComponents[13];
    }
    
    public void setIntRtc(TUDiagnostic intRtc)
    {
	mComponents[13] = intRtc;
    }
    
    
    // Methods for field "troubleCodes"
    public TroubleCodes getTroubleCodes()
    {
	return (TroubleCodes)mComponents[14];
    }
    
    public void setTroubleCodes(TroubleCodes troubleCodes)
    {
	mComponents[14] = troubleCodes;
    }
    
    public boolean hasTroubleCodes()
    {
	return componentIsPresent(14);
    }
    
    public void deleteTroubleCodes()
    {
	setComponentAbsent(14);
    }
    
    
    
    /**
     * Define the ASN1 Type TroubleCodes from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class TroubleCodes extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public TroubleCodes()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public TroubleCodes(DiagnosticTroubleCode[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(DiagnosticTroubleCode element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(DiagnosticTroubleCode element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized DiagnosticTroubleCode get(int atIndex)
	{
	    return (DiagnosticTroubleCode)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(DiagnosticTroubleCode element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(DiagnosticTroubleCode element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new DiagnosticTroubleCode();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x800e
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"TUDiagnosticData$TroubleCodes"
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
			new com.oss.asn1.INTEGER(63),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(63)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "DiagnosticTroubleCode"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' TroubleCodes object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' TroubleCodes object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for TroubleCodes

    // Methods for field "daysSinceGnssFix"
    public long getDaysSinceGnssFix()
    {
	return ((INTEGER)mComponents[15]).longValue();
    }
    
    public void setDaysSinceGnssFix(long daysSinceGnssFix)
    {
	setDaysSinceGnssFix(new INTEGER(daysSinceGnssFix));
    }
    
    public void setDaysSinceGnssFix(INTEGER daysSinceGnssFix)
    {
	mComponents[15] = daysSinceGnssFix;
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
	    "TUDiagnosticData"
	),
	new QName (
	    "NGTP-Service-Data",
	    "TUDiagnosticData"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "speaker",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "mic",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "extHandsfree",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "handset",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "gsmModem",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "gsmExtAntenna",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "extPower",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "intPower",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "gnss",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "gnssAntenna",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "can",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "buttons",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "crashInput",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TUDiagnostic"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TUDiagnostic"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"broken",
					0
				    ),
				    new MemberListElement (
					"uncertain",
					1
				    ),
				    new MemberListElement (
					"functioning",
					3
				    )
				}
			    ),
			    0,
			    TUDiagnostic.broken
			)
		    ),
		    "intRtc",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "TUDiagnosticData$TroubleCodes"
			)
		    ),
		    "troubleCodes",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    "daysSinceGnssFix",
		    15,
		    2,
		    null
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
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800e, 14),
			new TagDecoderElement((short)0x800f, 15)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TUDiagnosticData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TUDiagnosticData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TUDiagnosticData
