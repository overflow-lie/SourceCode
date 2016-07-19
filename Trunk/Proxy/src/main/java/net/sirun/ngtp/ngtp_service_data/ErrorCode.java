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
 * Define the ASN1 Type ErrorCode from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class ErrorCode extends Choice {
    
    /**
     * The default constructor.
     */
    public ErrorCode()
    {
    }
    
    public static final  int  incorrectSequence_chosen = 1;
    public static final  int  incorrectEct_chosen = 2;
    public static final  int  incorrectState_chosen = 3;
    public static final  int  notAllowed_chosen = 4;
    public static final  int  invalidData_chosen = 5;
    public static final  int  invalidFormat_chosen = 6;
    public static final  int  outOfMemory_chosen = 7;
    public static final  int  noOngoingService_chosen = 8;
    public static final  int  vehiclePowerModeNotCorrect_chosen = 9;
    public static final  int  conditionsNotCorrect_chosen = 10;
    public static final  int  executionFailure_chosen = 11;
    public static final  int  fuelLevelTooLow_chosen = 12;
    public static final  int  batteryLevelTooLow_chosen = 13;
    public static final  int  runTimeExpiry_chosen = 14;
    public static final  int  theftEvent_chosen = 15;
    public static final  int  crashEvent_chosen = 16;
    public static final  int  timeout_chosen = 17;
    public static final  int  windowNotClosed_chosen = 18;
    public static final  int  hazardWarningOn_chosen = 19;
    public static final  int  vehicleNotLocked_chosen = 20;
    public static final  int  alarmActive_chosen = 21;
    public static final  int  brakePedalPressed_chosen = 22;
    public static final  int  vehicleNotStationary_chosen = 23;
    public static final  int  transmissionNotInPark_chosen = 24;
    public static final  int  climateModeNotCorrect_chosen = 25;
    public static final  int  genericError_chosen = 26;
    
    // Methods for field "incorrectSequence"
    public static ErrorCode createErrorCodeWithIncorrectSequence(Null incorrectSequence)
    {
	ErrorCode __object = new ErrorCode();

	__object.setIncorrectSequence(incorrectSequence);
	return __object;
    }
    
    public boolean hasIncorrectSequence()
    {
	return getChosenFlag() == incorrectSequence_chosen;
    }
    
    public void setIncorrectSequence(Null incorrectSequence)
    {
	setChosenValue(incorrectSequence);
	setChosenFlag(incorrectSequence_chosen);
    }
    
    
    // Methods for field "incorrectEct"
    public static ErrorCode createErrorCodeWithIncorrectEct(Null incorrectEct)
    {
	ErrorCode __object = new ErrorCode();

	__object.setIncorrectEct(incorrectEct);
	return __object;
    }
    
    public boolean hasIncorrectEct()
    {
	return getChosenFlag() == incorrectEct_chosen;
    }
    
    public void setIncorrectEct(Null incorrectEct)
    {
	setChosenValue(incorrectEct);
	setChosenFlag(incorrectEct_chosen);
    }
    
    
    // Methods for field "incorrectState"
    public static ErrorCode createErrorCodeWithIncorrectState(Null incorrectState)
    {
	ErrorCode __object = new ErrorCode();

	__object.setIncorrectState(incorrectState);
	return __object;
    }
    
    public boolean hasIncorrectState()
    {
	return getChosenFlag() == incorrectState_chosen;
    }
    
    public void setIncorrectState(Null incorrectState)
    {
	setChosenValue(incorrectState);
	setChosenFlag(incorrectState_chosen);
    }
    
    
    // Methods for field "notAllowed"
    public static ErrorCode createErrorCodeWithNotAllowed(Null notAllowed)
    {
	ErrorCode __object = new ErrorCode();

	__object.setNotAllowed(notAllowed);
	return __object;
    }
    
    public boolean hasNotAllowed()
    {
	return getChosenFlag() == notAllowed_chosen;
    }
    
    public void setNotAllowed(Null notAllowed)
    {
	setChosenValue(notAllowed);
	setChosenFlag(notAllowed_chosen);
    }
    
    
    // Methods for field "invalidData"
    public static ErrorCode createErrorCodeWithInvalidData(Null invalidData)
    {
	ErrorCode __object = new ErrorCode();

	__object.setInvalidData(invalidData);
	return __object;
    }
    
    public boolean hasInvalidData()
    {
	return getChosenFlag() == invalidData_chosen;
    }
    
    public void setInvalidData(Null invalidData)
    {
	setChosenValue(invalidData);
	setChosenFlag(invalidData_chosen);
    }
    
    
    // Methods for field "invalidFormat"
    public static ErrorCode createErrorCodeWithInvalidFormat(Null invalidFormat)
    {
	ErrorCode __object = new ErrorCode();

	__object.setInvalidFormat(invalidFormat);
	return __object;
    }
    
    public boolean hasInvalidFormat()
    {
	return getChosenFlag() == invalidFormat_chosen;
    }
    
    public void setInvalidFormat(Null invalidFormat)
    {
	setChosenValue(invalidFormat);
	setChosenFlag(invalidFormat_chosen);
    }
    
    
    // Methods for field "outOfMemory"
    public static ErrorCode createErrorCodeWithOutOfMemory(long outOfMemory)
    {
	return createErrorCodeWithOutOfMemory(new INTEGER(outOfMemory));
    }
    
    public static ErrorCode createErrorCodeWithOutOfMemory(INTEGER outOfMemory)
    {
	ErrorCode __object = new ErrorCode();

	__object.setOutOfMemory(outOfMemory);
	return __object;
    }
    
    public boolean hasOutOfMemory()
    {
	return getChosenFlag() == outOfMemory_chosen;
    }
    
    public void setOutOfMemory(long outOfMemory)
    {
	setOutOfMemory(new INTEGER(outOfMemory));
    }
    
    public void setOutOfMemory(INTEGER outOfMemory)
    {
	setChosenValue(outOfMemory);
	setChosenFlag(outOfMemory_chosen);
    }
    
    
    // Methods for field "noOngoingService"
    public static ErrorCode createErrorCodeWithNoOngoingService(Null noOngoingService)
    {
	ErrorCode __object = new ErrorCode();

	__object.setNoOngoingService(noOngoingService);
	return __object;
    }
    
    public boolean hasNoOngoingService()
    {
	return getChosenFlag() == noOngoingService_chosen;
    }
    
    public void setNoOngoingService(Null noOngoingService)
    {
	setChosenValue(noOngoingService);
	setChosenFlag(noOngoingService_chosen);
    }
    
    
    // Methods for field "vehiclePowerModeNotCorrect"
    public static ErrorCode createErrorCodeWithVehiclePowerModeNotCorrect(Null vehiclePowerModeNotCorrect)
    {
	ErrorCode __object = new ErrorCode();

	__object.setVehiclePowerModeNotCorrect(vehiclePowerModeNotCorrect);
	return __object;
    }
    
    public boolean hasVehiclePowerModeNotCorrect()
    {
	return getChosenFlag() == vehiclePowerModeNotCorrect_chosen;
    }
    
    public void setVehiclePowerModeNotCorrect(Null vehiclePowerModeNotCorrect)
    {
	setChosenValue(vehiclePowerModeNotCorrect);
	setChosenFlag(vehiclePowerModeNotCorrect_chosen);
    }
    
    
    // Methods for field "conditionsNotCorrect"
    public static ErrorCode createErrorCodeWithConditionsNotCorrect(Null conditionsNotCorrect)
    {
	ErrorCode __object = new ErrorCode();

	__object.setConditionsNotCorrect(conditionsNotCorrect);
	return __object;
    }
    
    public boolean hasConditionsNotCorrect()
    {
	return getChosenFlag() == conditionsNotCorrect_chosen;
    }
    
    public void setConditionsNotCorrect(Null conditionsNotCorrect)
    {
	setChosenValue(conditionsNotCorrect);
	setChosenFlag(conditionsNotCorrect_chosen);
    }
    
    
    // Methods for field "executionFailure"
    public static ErrorCode createErrorCodeWithExecutionFailure(Null executionFailure)
    {
	ErrorCode __object = new ErrorCode();

	__object.setExecutionFailure(executionFailure);
	return __object;
    }
    
    public boolean hasExecutionFailure()
    {
	return getChosenFlag() == executionFailure_chosen;
    }
    
    public void setExecutionFailure(Null executionFailure)
    {
	setChosenValue(executionFailure);
	setChosenFlag(executionFailure_chosen);
    }
    
    
    // Methods for field "fuelLevelTooLow"
    public static ErrorCode createErrorCodeWithFuelLevelTooLow(Null fuelLevelTooLow)
    {
	ErrorCode __object = new ErrorCode();

	__object.setFuelLevelTooLow(fuelLevelTooLow);
	return __object;
    }
    
    public boolean hasFuelLevelTooLow()
    {
	return getChosenFlag() == fuelLevelTooLow_chosen;
    }
    
    public void setFuelLevelTooLow(Null fuelLevelTooLow)
    {
	setChosenValue(fuelLevelTooLow);
	setChosenFlag(fuelLevelTooLow_chosen);
    }
    
    
    // Methods for field "batteryLevelTooLow"
    public static ErrorCode createErrorCodeWithBatteryLevelTooLow(Null batteryLevelTooLow)
    {
	ErrorCode __object = new ErrorCode();

	__object.setBatteryLevelTooLow(batteryLevelTooLow);
	return __object;
    }
    
    public boolean hasBatteryLevelTooLow()
    {
	return getChosenFlag() == batteryLevelTooLow_chosen;
    }
    
    public void setBatteryLevelTooLow(Null batteryLevelTooLow)
    {
	setChosenValue(batteryLevelTooLow);
	setChosenFlag(batteryLevelTooLow_chosen);
    }
    
    
    // Methods for field "runTimeExpiry"
    public static ErrorCode createErrorCodeWithRunTimeExpiry(Null runTimeExpiry)
    {
	ErrorCode __object = new ErrorCode();

	__object.setRunTimeExpiry(runTimeExpiry);
	return __object;
    }
    
    public boolean hasRunTimeExpiry()
    {
	return getChosenFlag() == runTimeExpiry_chosen;
    }
    
    public void setRunTimeExpiry(Null runTimeExpiry)
    {
	setChosenValue(runTimeExpiry);
	setChosenFlag(runTimeExpiry_chosen);
    }
    
    
    // Methods for field "theftEvent"
    public static ErrorCode createErrorCodeWithTheftEvent(Null theftEvent)
    {
	ErrorCode __object = new ErrorCode();

	__object.setTheftEvent(theftEvent);
	return __object;
    }
    
    public boolean hasTheftEvent()
    {
	return getChosenFlag() == theftEvent_chosen;
    }
    
    public void setTheftEvent(Null theftEvent)
    {
	setChosenValue(theftEvent);
	setChosenFlag(theftEvent_chosen);
    }
    
    
    // Methods for field "crashEvent"
    public static ErrorCode createErrorCodeWithCrashEvent(Null crashEvent)
    {
	ErrorCode __object = new ErrorCode();

	__object.setCrashEvent(crashEvent);
	return __object;
    }
    
    public boolean hasCrashEvent()
    {
	return getChosenFlag() == crashEvent_chosen;
    }
    
    public void setCrashEvent(Null crashEvent)
    {
	setChosenValue(crashEvent);
	setChosenFlag(crashEvent_chosen);
    }
    
    
    // Methods for field "timeout"
    public static ErrorCode createErrorCodeWithTimeout(Null timeout)
    {
	ErrorCode __object = new ErrorCode();

	__object.setTimeout(timeout);
	return __object;
    }
    
    public boolean hasTimeout()
    {
	return getChosenFlag() == timeout_chosen;
    }
    
    public void setTimeout(Null timeout)
    {
	setChosenValue(timeout);
	setChosenFlag(timeout_chosen);
    }
    
    
    // Methods for field "windowNotClosed"
    public static ErrorCode createErrorCodeWithWindowNotClosed(Null windowNotClosed)
    {
	ErrorCode __object = new ErrorCode();

	__object.setWindowNotClosed(windowNotClosed);
	return __object;
    }
    
    public boolean hasWindowNotClosed()
    {
	return getChosenFlag() == windowNotClosed_chosen;
    }
    
    public void setWindowNotClosed(Null windowNotClosed)
    {
	setChosenValue(windowNotClosed);
	setChosenFlag(windowNotClosed_chosen);
    }
    
    
    // Methods for field "hazardWarningOn"
    public static ErrorCode createErrorCodeWithHazardWarningOn(Null hazardWarningOn)
    {
	ErrorCode __object = new ErrorCode();

	__object.setHazardWarningOn(hazardWarningOn);
	return __object;
    }
    
    public boolean hasHazardWarningOn()
    {
	return getChosenFlag() == hazardWarningOn_chosen;
    }
    
    public void setHazardWarningOn(Null hazardWarningOn)
    {
	setChosenValue(hazardWarningOn);
	setChosenFlag(hazardWarningOn_chosen);
    }
    
    
    // Methods for field "vehicleNotLocked"
    public static ErrorCode createErrorCodeWithVehicleNotLocked(Null vehicleNotLocked)
    {
	ErrorCode __object = new ErrorCode();

	__object.setVehicleNotLocked(vehicleNotLocked);
	return __object;
    }
    
    public boolean hasVehicleNotLocked()
    {
	return getChosenFlag() == vehicleNotLocked_chosen;
    }
    
    public void setVehicleNotLocked(Null vehicleNotLocked)
    {
	setChosenValue(vehicleNotLocked);
	setChosenFlag(vehicleNotLocked_chosen);
    }
    
    
    // Methods for field "alarmActive"
    public static ErrorCode createErrorCodeWithAlarmActive(Null alarmActive)
    {
	ErrorCode __object = new ErrorCode();

	__object.setAlarmActive(alarmActive);
	return __object;
    }
    
    public boolean hasAlarmActive()
    {
	return getChosenFlag() == alarmActive_chosen;
    }
    
    public void setAlarmActive(Null alarmActive)
    {
	setChosenValue(alarmActive);
	setChosenFlag(alarmActive_chosen);
    }
    
    
    // Methods for field "brakePedalPressed"
    public static ErrorCode createErrorCodeWithBrakePedalPressed(Null brakePedalPressed)
    {
	ErrorCode __object = new ErrorCode();

	__object.setBrakePedalPressed(brakePedalPressed);
	return __object;
    }
    
    public boolean hasBrakePedalPressed()
    {
	return getChosenFlag() == brakePedalPressed_chosen;
    }
    
    public void setBrakePedalPressed(Null brakePedalPressed)
    {
	setChosenValue(brakePedalPressed);
	setChosenFlag(brakePedalPressed_chosen);
    }
    
    
    // Methods for field "vehicleNotStationary"
    public static ErrorCode createErrorCodeWithVehicleNotStationary(Null vehicleNotStationary)
    {
	ErrorCode __object = new ErrorCode();

	__object.setVehicleNotStationary(vehicleNotStationary);
	return __object;
    }
    
    public boolean hasVehicleNotStationary()
    {
	return getChosenFlag() == vehicleNotStationary_chosen;
    }
    
    public void setVehicleNotStationary(Null vehicleNotStationary)
    {
	setChosenValue(vehicleNotStationary);
	setChosenFlag(vehicleNotStationary_chosen);
    }
    
    
    // Methods for field "transmissionNotInPark"
    public static ErrorCode createErrorCodeWithTransmissionNotInPark(Null transmissionNotInPark)
    {
	ErrorCode __object = new ErrorCode();

	__object.setTransmissionNotInPark(transmissionNotInPark);
	return __object;
    }
    
    public boolean hasTransmissionNotInPark()
    {
	return getChosenFlag() == transmissionNotInPark_chosen;
    }
    
    public void setTransmissionNotInPark(Null transmissionNotInPark)
    {
	setChosenValue(transmissionNotInPark);
	setChosenFlag(transmissionNotInPark_chosen);
    }
    
    
    // Methods for field "climateModeNotCorrect"
    public static ErrorCode createErrorCodeWithClimateModeNotCorrect(Null climateModeNotCorrect)
    {
	ErrorCode __object = new ErrorCode();

	__object.setClimateModeNotCorrect(climateModeNotCorrect);
	return __object;
    }
    
    public boolean hasClimateModeNotCorrect()
    {
	return getChosenFlag() == climateModeNotCorrect_chosen;
    }
    
    public void setClimateModeNotCorrect(Null climateModeNotCorrect)
    {
	setChosenValue(climateModeNotCorrect);
	setChosenFlag(climateModeNotCorrect_chosen);
    }
    
    
    // Methods for field "genericError"
    public static ErrorCode createErrorCodeWithGenericError(PrintableString genericError)
    {
	ErrorCode __object = new ErrorCode();

	__object.setGenericError(genericError);
	return __object;
    }
    
    public boolean hasGenericError()
    {
	return getChosenFlag() == genericError_chosen;
    }
    
    public void setGenericError(PrintableString genericError)
    {
	setChosenValue(genericError);
	setChosenFlag(genericError_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case incorrectSequence_chosen:
		return new Null();
	    case incorrectEct_chosen:
		return new Null();
	    case incorrectState_chosen:
		return new Null();
	    case notAllowed_chosen:
		return new Null();
	    case invalidData_chosen:
		return new Null();
	    case invalidFormat_chosen:
		return new Null();
	    case outOfMemory_chosen:
		return new INTEGER();
	    case noOngoingService_chosen:
		return new Null();
	    case vehiclePowerModeNotCorrect_chosen:
		return new Null();
	    case conditionsNotCorrect_chosen:
		return new Null();
	    case executionFailure_chosen:
		return new Null();
	    case fuelLevelTooLow_chosen:
		return new Null();
	    case batteryLevelTooLow_chosen:
		return new Null();
	    case runTimeExpiry_chosen:
		return new Null();
	    case theftEvent_chosen:
		return new Null();
	    case crashEvent_chosen:
		return new Null();
	    case timeout_chosen:
		return new Null();
	    case windowNotClosed_chosen:
		return new Null();
	    case hazardWarningOn_chosen:
		return new Null();
	    case vehicleNotLocked_chosen:
		return new Null();
	    case alarmActive_chosen:
		return new Null();
	    case brakePedalPressed_chosen:
		return new Null();
	    case vehicleNotStationary_chosen:
		return new Null();
	    case transmissionNotInPark_chosen:
		return new Null();
	    case climateModeNotCorrect_chosen:
		return new Null();
	    case genericError_chosen:
		return new PrintableString();
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
	    "ErrorCode"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ErrorCode"
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
		    "incorrectSequence",
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
		    "incorrectEct",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "incorrectState",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    "notAllowed",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "invalidData",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
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
		    "invalidFormat",
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
				    new com.oss.asn1.INTEGER(65535),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(65535)
			    ),
			    null
			)
		    ),
		    "outOfMemory",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
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
		    "noOngoingService",
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
		    "vehiclePowerModeNotCorrect",
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
		    "conditionsNotCorrect",
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
		    "executionFailure",
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
		    "fuelLevelTooLow",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
		    "batteryLevelTooLow",
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
		    "runTimeExpiry",
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
		    "theftEvent",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
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
		    "crashEvent",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8010
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
		    "timeout",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8011
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
		    "windowNotClosed",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8012
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
		    "hazardWarningOn",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
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
		    "vehicleNotLocked",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
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
		    "alarmActive",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
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
		    "brakePedalPressed",
		    21,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
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
		    "vehicleNotStationary",
		    22,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
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
		    "transmissionNotInPark",
		    23,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
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
		    "climateModeNotCorrect",
		    24,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x80ff
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
					    new com.oss.asn1.INTEGER(1), 
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
				new java.lang.Long(1),
				new java.lang.Long(63)
			    ),
			    PrintableStringPAInfo.paInfo
			)
		    ),
		    "genericError",
		    25,
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
		new TagDecoderElement((short)0x8014, 20),
		new TagDecoderElement((short)0x8015, 21),
		new TagDecoderElement((short)0x8016, 22),
		new TagDecoderElement((short)0x8017, 23),
		new TagDecoderElement((short)0x8018, 24),
		new TagDecoderElement((short)0x80ff, 25)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ErrorCode object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ErrorCode object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ErrorCode
