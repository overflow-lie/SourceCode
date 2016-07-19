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
 * Define the ASN1 Type RemoteOperationTrigger from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class RemoteOperationTrigger extends Choice {
    
    /**
     * The default constructor.
     */
    public RemoteOperationTrigger()
    {
    }
    
    public static final  int  now_chosen = 1;
    public static final  int  at_convenience_chosen = 2;
    public static final  int  periodic_chosen = 3;
    public static final  int  no_later_than_chosen = 4;
    public static final  int  _generic_chosen = 5;
    public static final  int  distanceMtrx100_chosen = 6;
    public static final  int  movementKmph_chosen = 7;
    public static final  int  noMovementSec_chosen = 8;
    public static final  int  engineOn_chosen = 9;
    public static final  int  engineOff_chosen = 10;
    public static final  int  ignitionOn_chosen = 11;
    public static final  int  ignitionOff_chosen = 12;
    public static final  int  doorStatusChange_chosen = 13;
    public static final  int  vehicleTechnicalWarning_chosen = 14;
    public static final  int  vehicleError_chosen = 15;
    public static final  int  fuelLevelChangedAbovePerc_chosen = 16;
    public static final  int  fuelLevelChangedBelowPerc_chosen = 17;
    public static final  int  internalTemperatureAboveDeg_chosen = 18;
    public static final  int  internalTemperatureBelowDeg_chosen = 19;
    public static final  int  externalTemperatureAboveDeg_chosen = 20;
    public static final  int  externalTemperatureBelowDeg_chosen = 21;
    
    // Methods for field "now"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithNow(Null now)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setNow(now);
	return __object;
    }
    
    public boolean hasNow()
    {
	return getChosenFlag() == now_chosen;
    }
    
    public void setNow(Null now)
    {
	setChosenValue(now);
	setChosenFlag(now_chosen);
    }
    
    
    // Methods for field "at_convenience"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithAt_convenience(Null at_convenience)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setAt_convenience(at_convenience);
	return __object;
    }
    
    public boolean hasAt_convenience()
    {
	return getChosenFlag() == at_convenience_chosen;
    }
    
    public void setAt_convenience(Null at_convenience)
    {
	setChosenValue(at_convenience);
	setChosenFlag(at_convenience_chosen);
    }
    
    
    // Methods for field "periodic"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithPeriodic(Periodic periodic)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setPeriodic(periodic);
	return __object;
    }
    
    public boolean hasPeriodic()
    {
	return getChosenFlag() == periodic_chosen;
    }
    
    public void setPeriodic(Periodic periodic)
    {
	setChosenValue(periodic);
	setChosenFlag(periodic_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type Periodic from ASN1 Module NGTP_Service_Data.
     * @see Sequence
     */
    public static class Periodic extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Periodic()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Periodic(INTEGER periodSec, TimeStamp startAt)
	{
	    setPeriodSec(periodSec);
	    setStartAt(startAt);
	}
	
	/**
	 * Construct with components.
	 */
	public Periodic(long periodSec, TimeStamp startAt)
	{
	    this(new INTEGER(periodSec), startAt);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new INTEGER();
	    mComponents[1] = new TimeStamp();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[2];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new INTEGER();
		case 1:
		    return new TimeStamp();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "periodSec"
	public long getPeriodSec()
	{
	    return ((INTEGER)mComponents[0]).longValue();
	}
	
	public void setPeriodSec(long periodSec)
	{
	    setPeriodSec(new INTEGER(periodSec));
	}
	
	public void setPeriodSec(INTEGER periodSec)
	{
	    mComponents[0] = periodSec;
	}
	
	
	// Methods for field "startAt"
	public TimeStamp getStartAt()
	{
	    return (TimeStamp)mComponents[1];
	}
	
	public void setStartAt(TimeStamp startAt)
	{
	    mComponents[1] = startAt;
	}
	
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final SequenceInfo c_typeinfo = new SequenceInfo (
	    new Tags (
		new short[] {
		    (short)0x8002
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"RemoteOperationTrigger$Periodic"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    12314,
	    null,
	    new Fields (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new IntegerInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
					new com.oss.asn1.INTEGER(31536000),
					0
				    )
				),
				new Bounds (
				    new java.lang.Long(0),
				    new java.lang.Long(31536000)
				),
				null
			    )
			),
			"periodSec",
			0,
			2,
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
				    "TimeStamp"
				),
				new QName (
				    "NGTP-Service-Data",
				    "TimeStamp"
				),
				12314,
				null,
				new FieldsRef (
				    new QName (
					"net.sirun.ngtp.ngtp_service_data",
					"TimeStamp"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"net.sirun.ngtp.ngtp_service_data",
					"TimeStamp"
				    )
				),
				0
			    )
			),
			"startAt",
			1,
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
		    )
		}
	    ),
	    0
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Periodic object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Periodic object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Periodic

    // Methods for field "no_later_than"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithNo_later_than(TimeStamp no_later_than)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setNo_later_than(no_later_than);
	return __object;
    }
    
    public boolean hasNo_later_than()
    {
	return getChosenFlag() == no_later_than_chosen;
    }
    
    public void setNo_later_than(TimeStamp no_later_than)
    {
	setChosenValue(no_later_than);
	setChosenFlag(no_later_than_chosen);
    }
    
    
    // Methods for field "_generic"
    public static RemoteOperationTrigger createRemoteOperationTriggerWith_generic(OctetString _generic)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.set_generic(_generic);
	return __object;
    }
    
    public boolean has_generic()
    {
	return getChosenFlag() == _generic_chosen;
    }
    
    public void set_generic(OctetString _generic)
    {
	setChosenValue(_generic);
	setChosenFlag(_generic_chosen);
    }
    
    
    // Methods for field "distanceMtrx100"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithDistanceMtrx100(long distanceMtrx100)
    {
	return createRemoteOperationTriggerWithDistanceMtrx100(new INTEGER(distanceMtrx100));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithDistanceMtrx100(INTEGER distanceMtrx100)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setDistanceMtrx100(distanceMtrx100);
	return __object;
    }
    
    public boolean hasDistanceMtrx100()
    {
	return getChosenFlag() == distanceMtrx100_chosen;
    }
    
    public void setDistanceMtrx100(long distanceMtrx100)
    {
	setDistanceMtrx100(new INTEGER(distanceMtrx100));
    }
    
    public void setDistanceMtrx100(INTEGER distanceMtrx100)
    {
	setChosenValue(distanceMtrx100);
	setChosenFlag(distanceMtrx100_chosen);
    }
    
    
    // Methods for field "movementKmph"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithMovementKmph(long movementKmph)
    {
	return createRemoteOperationTriggerWithMovementKmph(new INTEGER(movementKmph));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithMovementKmph(INTEGER movementKmph)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setMovementKmph(movementKmph);
	return __object;
    }
    
    public boolean hasMovementKmph()
    {
	return getChosenFlag() == movementKmph_chosen;
    }
    
    public void setMovementKmph(long movementKmph)
    {
	setMovementKmph(new INTEGER(movementKmph));
    }
    
    public void setMovementKmph(INTEGER movementKmph)
    {
	setChosenValue(movementKmph);
	setChosenFlag(movementKmph_chosen);
    }
    
    
    // Methods for field "noMovementSec"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithNoMovementSec(long noMovementSec)
    {
	return createRemoteOperationTriggerWithNoMovementSec(new INTEGER(noMovementSec));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithNoMovementSec(INTEGER noMovementSec)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setNoMovementSec(noMovementSec);
	return __object;
    }
    
    public boolean hasNoMovementSec()
    {
	return getChosenFlag() == noMovementSec_chosen;
    }
    
    public void setNoMovementSec(long noMovementSec)
    {
	setNoMovementSec(new INTEGER(noMovementSec));
    }
    
    public void setNoMovementSec(INTEGER noMovementSec)
    {
	setChosenValue(noMovementSec);
	setChosenFlag(noMovementSec_chosen);
    }
    
    
    // Methods for field "engineOn"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithEngineOn(Null engineOn)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setEngineOn(engineOn);
	return __object;
    }
    
    public boolean hasEngineOn()
    {
	return getChosenFlag() == engineOn_chosen;
    }
    
    public void setEngineOn(Null engineOn)
    {
	setChosenValue(engineOn);
	setChosenFlag(engineOn_chosen);
    }
    
    
    // Methods for field "engineOff"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithEngineOff(Null engineOff)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setEngineOff(engineOff);
	return __object;
    }
    
    public boolean hasEngineOff()
    {
	return getChosenFlag() == engineOff_chosen;
    }
    
    public void setEngineOff(Null engineOff)
    {
	setChosenValue(engineOff);
	setChosenFlag(engineOff_chosen);
    }
    
    
    // Methods for field "ignitionOn"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithIgnitionOn(Null ignitionOn)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setIgnitionOn(ignitionOn);
	return __object;
    }
    
    public boolean hasIgnitionOn()
    {
	return getChosenFlag() == ignitionOn_chosen;
    }
    
    public void setIgnitionOn(Null ignitionOn)
    {
	setChosenValue(ignitionOn);
	setChosenFlag(ignitionOn_chosen);
    }
    
    
    // Methods for field "ignitionOff"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithIgnitionOff(Null ignitionOff)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setIgnitionOff(ignitionOff);
	return __object;
    }
    
    public boolean hasIgnitionOff()
    {
	return getChosenFlag() == ignitionOff_chosen;
    }
    
    public void setIgnitionOff(Null ignitionOff)
    {
	setChosenValue(ignitionOff);
	setChosenFlag(ignitionOff_chosen);
    }
    
    
    // Methods for field "doorStatusChange"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithDoorStatusChange(DoorStatusChange doorStatusChange)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setDoorStatusChange(doorStatusChange);
	return __object;
    }
    
    public boolean hasDoorStatusChange()
    {
	return getChosenFlag() == doorStatusChange_chosen;
    }
    
    public void setDoorStatusChange(DoorStatusChange doorStatusChange)
    {
	setChosenValue(doorStatusChange);
	setChosenFlag(doorStatusChange_chosen);
    }
    
    
    
    /**
     * Define the ASN1 Type DoorStatusChange from ASN1 Module NGTP_Service_Data.
     * @see Enumerated
     */
    public static final class DoorStatusChange extends Enumerated {
	
	/**
	 * The default constructor.
	 */
	private DoorStatusChange()
	{
	    super(cFirstNumber);
	}
	
	protected DoorStatusChange(long value)
	{
	    super(value);
	}
	
	public static final class Value {
	    public static final long open = 0;
	    public static final long close = 1;
	    public static final long both = 2;
	}
	// Named list definitions.
	public static final DoorStatusChange open =
	    new DoorStatusChange();
	public static final DoorStatusChange close =
	    new DoorStatusChange(1);
	public static final DoorStatusChange both =
	    new DoorStatusChange(2);
	private final static DoorStatusChange cNamedNumbers[] = {
	     open, 
	     close, 
	     both
	};
	protected final static long cFirstNumber = 0;
	protected final static boolean cLinearNumbers = false;
	
	public Enumerated[] getNamedNumbers()
	{
	    return cNamedNumbers;
	}
	
	public boolean hasLinearNumbers()
	{
	    return cLinearNumbers;
	}
	
	public long getFirstNumber()
	{
	    return cFirstNumber;
	}
	
	public static DoorStatusChange valueOf(long value)
	{
	    return (DoorStatusChange)open.lookupValue(value);
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	    new Tags (
		new short[] {
		    (short)0x800c
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"RemoteOperationTrigger$DoorStatusChange"
	    ),
	    new QName (
		"builtin",
		"ENUMERATED"
	    ),
	    12314,
	    null,
	    new MemberList (
		new MemberListElement[] {
		    new MemberListElement (
			"open",
			0
		    ),
		    new MemberListElement (
			"close",
			1
		    ),
		    new MemberListElement (
			"both",
			2
		    )
		}
	    ),
	    0,
	    open
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DoorStatusChange object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DoorStatusChange object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DoorStatusChange

    // Methods for field "vehicleTechnicalWarning"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithVehicleTechnicalWarning(Null vehicleTechnicalWarning)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setVehicleTechnicalWarning(vehicleTechnicalWarning);
	return __object;
    }
    
    public boolean hasVehicleTechnicalWarning()
    {
	return getChosenFlag() == vehicleTechnicalWarning_chosen;
    }
    
    public void setVehicleTechnicalWarning(Null vehicleTechnicalWarning)
    {
	setChosenValue(vehicleTechnicalWarning);
	setChosenFlag(vehicleTechnicalWarning_chosen);
    }
    
    
    // Methods for field "vehicleError"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithVehicleError(Null vehicleError)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setVehicleError(vehicleError);
	return __object;
    }
    
    public boolean hasVehicleError()
    {
	return getChosenFlag() == vehicleError_chosen;
    }
    
    public void setVehicleError(Null vehicleError)
    {
	setChosenValue(vehicleError);
	setChosenFlag(vehicleError_chosen);
    }
    
    
    // Methods for field "fuelLevelChangedAbovePerc"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithFuelLevelChangedAbovePerc(long fuelLevelChangedAbovePerc)
    {
	return createRemoteOperationTriggerWithFuelLevelChangedAbovePerc(new INTEGER(fuelLevelChangedAbovePerc));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithFuelLevelChangedAbovePerc(INTEGER fuelLevelChangedAbovePerc)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setFuelLevelChangedAbovePerc(fuelLevelChangedAbovePerc);
	return __object;
    }
    
    public boolean hasFuelLevelChangedAbovePerc()
    {
	return getChosenFlag() == fuelLevelChangedAbovePerc_chosen;
    }
    
    public void setFuelLevelChangedAbovePerc(long fuelLevelChangedAbovePerc)
    {
	setFuelLevelChangedAbovePerc(new INTEGER(fuelLevelChangedAbovePerc));
    }
    
    public void setFuelLevelChangedAbovePerc(INTEGER fuelLevelChangedAbovePerc)
    {
	setChosenValue(fuelLevelChangedAbovePerc);
	setChosenFlag(fuelLevelChangedAbovePerc_chosen);
    }
    
    
    // Methods for field "fuelLevelChangedBelowPerc"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithFuelLevelChangedBelowPerc(long fuelLevelChangedBelowPerc)
    {
	return createRemoteOperationTriggerWithFuelLevelChangedBelowPerc(new INTEGER(fuelLevelChangedBelowPerc));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithFuelLevelChangedBelowPerc(INTEGER fuelLevelChangedBelowPerc)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setFuelLevelChangedBelowPerc(fuelLevelChangedBelowPerc);
	return __object;
    }
    
    public boolean hasFuelLevelChangedBelowPerc()
    {
	return getChosenFlag() == fuelLevelChangedBelowPerc_chosen;
    }
    
    public void setFuelLevelChangedBelowPerc(long fuelLevelChangedBelowPerc)
    {
	setFuelLevelChangedBelowPerc(new INTEGER(fuelLevelChangedBelowPerc));
    }
    
    public void setFuelLevelChangedBelowPerc(INTEGER fuelLevelChangedBelowPerc)
    {
	setChosenValue(fuelLevelChangedBelowPerc);
	setChosenFlag(fuelLevelChangedBelowPerc_chosen);
    }
    
    
    // Methods for field "internalTemperatureAboveDeg"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithInternalTemperatureAboveDeg(long internalTemperatureAboveDeg)
    {
	return createRemoteOperationTriggerWithInternalTemperatureAboveDeg(new INTEGER(internalTemperatureAboveDeg));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithInternalTemperatureAboveDeg(INTEGER internalTemperatureAboveDeg)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setInternalTemperatureAboveDeg(internalTemperatureAboveDeg);
	return __object;
    }
    
    public boolean hasInternalTemperatureAboveDeg()
    {
	return getChosenFlag() == internalTemperatureAboveDeg_chosen;
    }
    
    public void setInternalTemperatureAboveDeg(long internalTemperatureAboveDeg)
    {
	setInternalTemperatureAboveDeg(new INTEGER(internalTemperatureAboveDeg));
    }
    
    public void setInternalTemperatureAboveDeg(INTEGER internalTemperatureAboveDeg)
    {
	setChosenValue(internalTemperatureAboveDeg);
	setChosenFlag(internalTemperatureAboveDeg_chosen);
    }
    
    
    // Methods for field "internalTemperatureBelowDeg"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithInternalTemperatureBelowDeg(long internalTemperatureBelowDeg)
    {
	return createRemoteOperationTriggerWithInternalTemperatureBelowDeg(new INTEGER(internalTemperatureBelowDeg));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithInternalTemperatureBelowDeg(INTEGER internalTemperatureBelowDeg)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setInternalTemperatureBelowDeg(internalTemperatureBelowDeg);
	return __object;
    }
    
    public boolean hasInternalTemperatureBelowDeg()
    {
	return getChosenFlag() == internalTemperatureBelowDeg_chosen;
    }
    
    public void setInternalTemperatureBelowDeg(long internalTemperatureBelowDeg)
    {
	setInternalTemperatureBelowDeg(new INTEGER(internalTemperatureBelowDeg));
    }
    
    public void setInternalTemperatureBelowDeg(INTEGER internalTemperatureBelowDeg)
    {
	setChosenValue(internalTemperatureBelowDeg);
	setChosenFlag(internalTemperatureBelowDeg_chosen);
    }
    
    
    // Methods for field "externalTemperatureAboveDeg"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithExternalTemperatureAboveDeg(long externalTemperatureAboveDeg)
    {
	return createRemoteOperationTriggerWithExternalTemperatureAboveDeg(new INTEGER(externalTemperatureAboveDeg));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithExternalTemperatureAboveDeg(INTEGER externalTemperatureAboveDeg)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setExternalTemperatureAboveDeg(externalTemperatureAboveDeg);
	return __object;
    }
    
    public boolean hasExternalTemperatureAboveDeg()
    {
	return getChosenFlag() == externalTemperatureAboveDeg_chosen;
    }
    
    public void setExternalTemperatureAboveDeg(long externalTemperatureAboveDeg)
    {
	setExternalTemperatureAboveDeg(new INTEGER(externalTemperatureAboveDeg));
    }
    
    public void setExternalTemperatureAboveDeg(INTEGER externalTemperatureAboveDeg)
    {
	setChosenValue(externalTemperatureAboveDeg);
	setChosenFlag(externalTemperatureAboveDeg_chosen);
    }
    
    
    // Methods for field "externalTemperatureBelowDeg"
    public static RemoteOperationTrigger createRemoteOperationTriggerWithExternalTemperatureBelowDeg(long externalTemperatureBelowDeg)
    {
	return createRemoteOperationTriggerWithExternalTemperatureBelowDeg(new INTEGER(externalTemperatureBelowDeg));
    }
    
    public static RemoteOperationTrigger createRemoteOperationTriggerWithExternalTemperatureBelowDeg(INTEGER externalTemperatureBelowDeg)
    {
	RemoteOperationTrigger __object = new RemoteOperationTrigger();

	__object.setExternalTemperatureBelowDeg(externalTemperatureBelowDeg);
	return __object;
    }
    
    public boolean hasExternalTemperatureBelowDeg()
    {
	return getChosenFlag() == externalTemperatureBelowDeg_chosen;
    }
    
    public void setExternalTemperatureBelowDeg(long externalTemperatureBelowDeg)
    {
	setExternalTemperatureBelowDeg(new INTEGER(externalTemperatureBelowDeg));
    }
    
    public void setExternalTemperatureBelowDeg(INTEGER externalTemperatureBelowDeg)
    {
	setChosenValue(externalTemperatureBelowDeg);
	setChosenFlag(externalTemperatureBelowDeg_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case now_chosen:
		return new Null();
	    case at_convenience_chosen:
		return new Null();
	    case periodic_chosen:
		return new Periodic();
	    case no_later_than_chosen:
		return new TimeStamp();
	    case _generic_chosen:
		return new OctetString();
	    case distanceMtrx100_chosen:
		return new INTEGER();
	    case movementKmph_chosen:
		return new INTEGER();
	    case noMovementSec_chosen:
		return new INTEGER();
	    case engineOn_chosen:
		return new Null();
	    case engineOff_chosen:
		return new Null();
	    case ignitionOn_chosen:
		return new Null();
	    case ignitionOff_chosen:
		return new Null();
	    case doorStatusChange_chosen:
		return DoorStatusChange.open;
	    case vehicleTechnicalWarning_chosen:
		return new Null();
	    case vehicleError_chosen:
		return new Null();
	    case fuelLevelChangedAbovePerc_chosen:
		return new INTEGER();
	    case fuelLevelChangedBelowPerc_chosen:
		return new INTEGER();
	    case internalTemperatureAboveDeg_chosen:
		return new INTEGER();
	    case internalTemperatureBelowDeg_chosen:
		return new INTEGER();
	    case externalTemperatureAboveDeg_chosen:
		return new INTEGER();
	    case externalTemperatureBelowDeg_chosen:
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
	    "RemoteOperationTrigger"
	),
	new QName (
	    "NGTP-Service-Data",
	    "RemoteOperationTrigger"
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
		    "now",
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
		    "at-convenience",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "RemoteOperationTrigger$Periodic"
			)
		    ),
		    "periodic",
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
				"TimeStamp"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TimeStamp"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeStamp"
				)
			    ),
			    0
			)
		    ),
		    "no-later-than",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"OctetString"
			    ),
			    new QName (
				"builtin",
				"OCTET STRING"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(0), 
					new com.oss.asn1.INTEGER(1024),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(1024)
			    )
			)
		    ),
		    "generic",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
				    new com.oss.asn1.INTEGER(1), 
				    new com.oss.asn1.INTEGER(1000000),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(1000000)
			    ),
			    null
			)
		    ),
		    "distanceMtrx100",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
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
		    "movementKmph",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
				    new com.oss.asn1.INTEGER(86400),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(86400)
			    ),
			    null
			)
		    ),
		    "noMovementSec",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "engineOn",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
		    "engineOff",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "ignitionOn",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
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
		    "ignitionOff",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "RemoteOperationTrigger$DoorStatusChange"
			)
		    ),
		    "doorStatusChange",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
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
		    "vehicleTechnicalWarning",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
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
		    "vehicleError",
		    14,
		    2
		),
		new FieldInfo (
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
		    "fuelLevelChangedAbovePerc",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
		    "fuelLevelChangedBelowPerc",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
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
				    new com.oss.asn1.INTEGER(-100), 
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-100),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "internalTemperatureAboveDeg",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
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
				    new com.oss.asn1.INTEGER(-100), 
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-100),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "internalTemperatureBelowDeg",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
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
				    new com.oss.asn1.INTEGER(-100), 
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-100),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "externalTemperatureAboveDeg",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
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
				    new com.oss.asn1.INTEGER(-100), 
				    new com.oss.asn1.INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-100),
				new java.lang.Long(100)
			    ),
			    null
			)
		    ),
		    "externalTemperatureBelowDeg",
		    20,
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
		new TagDecoderElement((short)0x8003, 3),
		new TagDecoderElement((short)0x8004, 4),
		new TagDecoderElement((short)0x8005, 5),
		new TagDecoderElement((short)0x8006, 6),
		new TagDecoderElement((short)0x8007, 7),
		new TagDecoderElement((short)0x8008, 8),
		new TagDecoderElement((short)0x8009, 9),
		new TagDecoderElement((short)0x800a, 10),
		new TagDecoderElement((short)0x800b, 11),
		new TagDecoderElement((short)0x800c, 12),
		new TagDecoderElement((short)0x800d, 13),
		new TagDecoderElement((short)0x800e, 14),
		new TagDecoderElement((short)0x800f, 15),
		new TagDecoderElement((short)0x8010, 16),
		new TagDecoderElement((short)0x8011, 17),
		new TagDecoderElement((short)0x8012, 18),
		new TagDecoderElement((short)0x8013, 19),
		new TagDecoderElement((short)0x8014, 20)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' RemoteOperationTrigger object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RemoteOperationTrigger object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RemoteOperationTrigger
