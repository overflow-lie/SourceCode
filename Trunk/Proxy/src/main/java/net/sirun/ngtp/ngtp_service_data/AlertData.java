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
 * Define the ASN1 Type AlertData from ASN1 Module NGTP_Service_Data.
 * @see Choice
 */

public class AlertData extends Choice {
    
    /**
     * The default constructor.
     */
    public AlertData()
    {
    }
    
    public static final  int  engineOn_chosen = 1;
    public static final  int  vehicleAlarm_chosen = 2;
    public static final  int  externalPowerRemoval_chosen = 3;
    public static final  int  gsmJamming_chosen = 4;
    public static final  int  gsmAntennaFailure_chosen = 5;
    public static final  int  gnssAntennaFailure_chosen = 6;
    public static final  int  unauthMovement_chosen = 7;
    public static final  int  coolantLevel_chosen = 8;
    public static final  int  unused_chosen = 9;
    public static final  int  washerFluidLevel_chosen = 10;
    public static final  int  brakeFluidStatus_chosen = 11;
    public static final  int  brakePadWear_chosen = 12;
    public static final  int  tyrePressureFL_chosen = 13;
    public static final  int  tyrePressureFR_chosen = 14;
    public static final  int  tyrePressureRL_chosen = 15;
    public static final  int  tyrePressureRR_chosen = 16;
    public static final  int  tyrePressSensorFail_chosen = 17;
    public static final  int  engineMalfunction_chosen = 18;
    public static final  int  oilLevel_chosen = 19;
    public static final  int  distToServiceKm_chosen = 20;
    public static final  int  odometerExceeded_chosen = 21;
    public static final  int  transportMode_chosen = 22;
    public static final  int  lowBatteryVoltx10_chosen = 23;
    public static final  int  fuelLevel_chosen = 24;
    public static final  int  fuelLevelLtrs_chosen = 25;
    public static final  int  remoteClimate_chosen = 26;
    public static final  int  vehicleUnlocked_chosen = 27;
    public static final  int  doorOpen_chosen = 28;
    public static final  int  bootOpen_chosen = 29;
    public static final  int  bonnetOpen_chosen = 30;
    public static final  int  roofOpen_chosen = 31;
    public static final  int  windowOpen_chosen = 32;
    public static final  int  alarmUnarmed_chosen = 33;
    
    // Methods for field "engineOn"
    public static AlertData createAlertDataWithEngineOn(Null engineOn)
    {
	AlertData __object = new AlertData();

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
    
    
    // Methods for field "vehicleAlarm"
    public static AlertData createAlertDataWithVehicleAlarm(Null vehicleAlarm)
    {
	AlertData __object = new AlertData();

	__object.setVehicleAlarm(vehicleAlarm);
	return __object;
    }
    
    public boolean hasVehicleAlarm()
    {
	return getChosenFlag() == vehicleAlarm_chosen;
    }
    
    public void setVehicleAlarm(Null vehicleAlarm)
    {
	setChosenValue(vehicleAlarm);
	setChosenFlag(vehicleAlarm_chosen);
    }
    
    
    // Methods for field "externalPowerRemoval"
    public static AlertData createAlertDataWithExternalPowerRemoval(Null externalPowerRemoval)
    {
	AlertData __object = new AlertData();

	__object.setExternalPowerRemoval(externalPowerRemoval);
	return __object;
    }
    
    public boolean hasExternalPowerRemoval()
    {
	return getChosenFlag() == externalPowerRemoval_chosen;
    }
    
    public void setExternalPowerRemoval(Null externalPowerRemoval)
    {
	setChosenValue(externalPowerRemoval);
	setChosenFlag(externalPowerRemoval_chosen);
    }
    
    
    // Methods for field "gsmJamming"
    public static AlertData createAlertDataWithGsmJamming(Null gsmJamming)
    {
	AlertData __object = new AlertData();

	__object.setGsmJamming(gsmJamming);
	return __object;
    }
    
    public boolean hasGsmJamming()
    {
	return getChosenFlag() == gsmJamming_chosen;
    }
    
    public void setGsmJamming(Null gsmJamming)
    {
	setChosenValue(gsmJamming);
	setChosenFlag(gsmJamming_chosen);
    }
    
    
    // Methods for field "gsmAntennaFailure"
    public static AlertData createAlertDataWithGsmAntennaFailure(Null gsmAntennaFailure)
    {
	AlertData __object = new AlertData();

	__object.setGsmAntennaFailure(gsmAntennaFailure);
	return __object;
    }
    
    public boolean hasGsmAntennaFailure()
    {
	return getChosenFlag() == gsmAntennaFailure_chosen;
    }
    
    public void setGsmAntennaFailure(Null gsmAntennaFailure)
    {
	setChosenValue(gsmAntennaFailure);
	setChosenFlag(gsmAntennaFailure_chosen);
    }
    
    
    // Methods for field "gnssAntennaFailure"
    public static AlertData createAlertDataWithGnssAntennaFailure(Null gnssAntennaFailure)
    {
	AlertData __object = new AlertData();

	__object.setGnssAntennaFailure(gnssAntennaFailure);
	return __object;
    }
    
    public boolean hasGnssAntennaFailure()
    {
	return getChosenFlag() == gnssAntennaFailure_chosen;
    }
    
    public void setGnssAntennaFailure(Null gnssAntennaFailure)
    {
	setChosenValue(gnssAntennaFailure);
	setChosenFlag(gnssAntennaFailure_chosen);
    }
    
    
    // Methods for field "unauthMovement"
    public static AlertData createAlertDataWithUnauthMovement(Null unauthMovement)
    {
	AlertData __object = new AlertData();

	__object.setUnauthMovement(unauthMovement);
	return __object;
    }
    
    public boolean hasUnauthMovement()
    {
	return getChosenFlag() == unauthMovement_chosen;
    }
    
    public void setUnauthMovement(Null unauthMovement)
    {
	setChosenValue(unauthMovement);
	setChosenFlag(unauthMovement_chosen);
    }
    
    
    // Methods for field "coolantLevel"
    public static AlertData createAlertDataWithCoolantLevel(Null coolantLevel)
    {
	AlertData __object = new AlertData();

	__object.setCoolantLevel(coolantLevel);
	return __object;
    }
    
    public boolean hasCoolantLevel()
    {
	return getChosenFlag() == coolantLevel_chosen;
    }
    
    public void setCoolantLevel(Null coolantLevel)
    {
	setChosenValue(coolantLevel);
	setChosenFlag(coolantLevel_chosen);
    }
    
    
    // Methods for field "unused"
    public static AlertData createAlertDataWithUnused(Null unused)
    {
	AlertData __object = new AlertData();

	__object.setUnused(unused);
	return __object;
    }
    
    public boolean hasUnused()
    {
	return getChosenFlag() == unused_chosen;
    }
    
    public void setUnused(Null unused)
    {
	setChosenValue(unused);
	setChosenFlag(unused_chosen);
    }
    
    
    // Methods for field "washerFluidLevel"
    public static AlertData createAlertDataWithWasherFluidLevel(Null washerFluidLevel)
    {
	AlertData __object = new AlertData();

	__object.setWasherFluidLevel(washerFluidLevel);
	return __object;
    }
    
    public boolean hasWasherFluidLevel()
    {
	return getChosenFlag() == washerFluidLevel_chosen;
    }
    
    public void setWasherFluidLevel(Null washerFluidLevel)
    {
	setChosenValue(washerFluidLevel);
	setChosenFlag(washerFluidLevel_chosen);
    }
    
    
    // Methods for field "brakeFluidStatus"
    public static AlertData createAlertDataWithBrakeFluidStatus(Null brakeFluidStatus)
    {
	AlertData __object = new AlertData();

	__object.setBrakeFluidStatus(brakeFluidStatus);
	return __object;
    }
    
    public boolean hasBrakeFluidStatus()
    {
	return getChosenFlag() == brakeFluidStatus_chosen;
    }
    
    public void setBrakeFluidStatus(Null brakeFluidStatus)
    {
	setChosenValue(brakeFluidStatus);
	setChosenFlag(brakeFluidStatus_chosen);
    }
    
    
    // Methods for field "brakePadWear"
    public static AlertData createAlertDataWithBrakePadWear(Null brakePadWear)
    {
	AlertData __object = new AlertData();

	__object.setBrakePadWear(brakePadWear);
	return __object;
    }
    
    public boolean hasBrakePadWear()
    {
	return getChosenFlag() == brakePadWear_chosen;
    }
    
    public void setBrakePadWear(Null brakePadWear)
    {
	setChosenValue(brakePadWear);
	setChosenFlag(brakePadWear_chosen);
    }
    
    
    // Methods for field "tyrePressureFL"
    public static AlertData createAlertDataWithTyrePressureFL(TyreStatus tyrePressureFL)
    {
	AlertData __object = new AlertData();

	__object.setTyrePressureFL(tyrePressureFL);
	return __object;
    }
    
    public boolean hasTyrePressureFL()
    {
	return getChosenFlag() == tyrePressureFL_chosen;
    }
    
    public void setTyrePressureFL(TyreStatus tyrePressureFL)
    {
	setChosenValue(tyrePressureFL);
	setChosenFlag(tyrePressureFL_chosen);
    }
    
    
    // Methods for field "tyrePressureFR"
    public static AlertData createAlertDataWithTyrePressureFR(TyreStatus tyrePressureFR)
    {
	AlertData __object = new AlertData();

	__object.setTyrePressureFR(tyrePressureFR);
	return __object;
    }
    
    public boolean hasTyrePressureFR()
    {
	return getChosenFlag() == tyrePressureFR_chosen;
    }
    
    public void setTyrePressureFR(TyreStatus tyrePressureFR)
    {
	setChosenValue(tyrePressureFR);
	setChosenFlag(tyrePressureFR_chosen);
    }
    
    
    // Methods for field "tyrePressureRL"
    public static AlertData createAlertDataWithTyrePressureRL(TyreStatus tyrePressureRL)
    {
	AlertData __object = new AlertData();

	__object.setTyrePressureRL(tyrePressureRL);
	return __object;
    }
    
    public boolean hasTyrePressureRL()
    {
	return getChosenFlag() == tyrePressureRL_chosen;
    }
    
    public void setTyrePressureRL(TyreStatus tyrePressureRL)
    {
	setChosenValue(tyrePressureRL);
	setChosenFlag(tyrePressureRL_chosen);
    }
    
    
    // Methods for field "tyrePressureRR"
    public static AlertData createAlertDataWithTyrePressureRR(TyreStatus tyrePressureRR)
    {
	AlertData __object = new AlertData();

	__object.setTyrePressureRR(tyrePressureRR);
	return __object;
    }
    
    public boolean hasTyrePressureRR()
    {
	return getChosenFlag() == tyrePressureRR_chosen;
    }
    
    public void setTyrePressureRR(TyreStatus tyrePressureRR)
    {
	setChosenValue(tyrePressureRR);
	setChosenFlag(tyrePressureRR_chosen);
    }
    
    
    // Methods for field "tyrePressSensorFail"
    public static AlertData createAlertDataWithTyrePressSensorFail(Null tyrePressSensorFail)
    {
	AlertData __object = new AlertData();

	__object.setTyrePressSensorFail(tyrePressSensorFail);
	return __object;
    }
    
    public boolean hasTyrePressSensorFail()
    {
	return getChosenFlag() == tyrePressSensorFail_chosen;
    }
    
    public void setTyrePressSensorFail(Null tyrePressSensorFail)
    {
	setChosenValue(tyrePressSensorFail);
	setChosenFlag(tyrePressSensorFail_chosen);
    }
    
    
    // Methods for field "engineMalfunction"
    public static AlertData createAlertDataWithEngineMalfunction(Null engineMalfunction)
    {
	AlertData __object = new AlertData();

	__object.setEngineMalfunction(engineMalfunction);
	return __object;
    }
    
    public boolean hasEngineMalfunction()
    {
	return getChosenFlag() == engineMalfunction_chosen;
    }
    
    public void setEngineMalfunction(Null engineMalfunction)
    {
	setChosenValue(engineMalfunction);
	setChosenFlag(engineMalfunction_chosen);
    }
    
    
    // Methods for field "oilLevel"
    public static AlertData createAlertDataWithOilLevel(LiquidLevelWarning oilLevel)
    {
	AlertData __object = new AlertData();

	__object.setOilLevel(oilLevel);
	return __object;
    }
    
    public boolean hasOilLevel()
    {
	return getChosenFlag() == oilLevel_chosen;
    }
    
    public void setOilLevel(LiquidLevelWarning oilLevel)
    {
	setChosenValue(oilLevel);
	setChosenFlag(oilLevel_chosen);
    }
    
    
    // Methods for field "distToServiceKm"
    public static AlertData createAlertDataWithDistToServiceKm(Null distToServiceKm)
    {
	AlertData __object = new AlertData();

	__object.setDistToServiceKm(distToServiceKm);
	return __object;
    }
    
    public boolean hasDistToServiceKm()
    {
	return getChosenFlag() == distToServiceKm_chosen;
    }
    
    public void setDistToServiceKm(Null distToServiceKm)
    {
	setChosenValue(distToServiceKm);
	setChosenFlag(distToServiceKm_chosen);
    }
    
    
    // Methods for field "odometerExceeded"
    public static AlertData createAlertDataWithOdometerExceeded(OdometerData odometerExceeded)
    {
	AlertData __object = new AlertData();

	__object.setOdometerExceeded(odometerExceeded);
	return __object;
    }
    
    public boolean hasOdometerExceeded()
    {
	return getChosenFlag() == odometerExceeded_chosen;
    }
    
    public void setOdometerExceeded(OdometerData odometerExceeded)
    {
	setChosenValue(odometerExceeded);
	setChosenFlag(odometerExceeded_chosen);
    }
    
    
    // Methods for field "transportMode"
    public static AlertData createAlertDataWithTransportMode(Null transportMode)
    {
	AlertData __object = new AlertData();

	__object.setTransportMode(transportMode);
	return __object;
    }
    
    public boolean hasTransportMode()
    {
	return getChosenFlag() == transportMode_chosen;
    }
    
    public void setTransportMode(Null transportMode)
    {
	setChosenValue(transportMode);
	setChosenFlag(transportMode_chosen);
    }
    
    
    // Methods for field "lowBatteryVoltx10"
    public static AlertData createAlertDataWithLowBatteryVoltx10(long lowBatteryVoltx10)
    {
	return createAlertDataWithLowBatteryVoltx10(new INTEGER(lowBatteryVoltx10));
    }
    
    public static AlertData createAlertDataWithLowBatteryVoltx10(INTEGER lowBatteryVoltx10)
    {
	AlertData __object = new AlertData();

	__object.setLowBatteryVoltx10(lowBatteryVoltx10);
	return __object;
    }
    
    public boolean hasLowBatteryVoltx10()
    {
	return getChosenFlag() == lowBatteryVoltx10_chosen;
    }
    
    public void setLowBatteryVoltx10(long lowBatteryVoltx10)
    {
	setLowBatteryVoltx10(new INTEGER(lowBatteryVoltx10));
    }
    
    public void setLowBatteryVoltx10(INTEGER lowBatteryVoltx10)
    {
	setChosenValue(lowBatteryVoltx10);
	setChosenFlag(lowBatteryVoltx10_chosen);
    }
    
    
    // Methods for field "fuelLevel"
    public static AlertData createAlertDataWithFuelLevel(Null fuelLevel)
    {
	AlertData __object = new AlertData();

	__object.setFuelLevel(fuelLevel);
	return __object;
    }
    
    public boolean hasFuelLevel()
    {
	return getChosenFlag() == fuelLevel_chosen;
    }
    
    public void setFuelLevel(Null fuelLevel)
    {
	setChosenValue(fuelLevel);
	setChosenFlag(fuelLevel_chosen);
    }
    
    
    // Methods for field "fuelLevelLtrs"
    public static AlertData createAlertDataWithFuelLevelLtrs(long fuelLevelLtrs)
    {
	return createAlertDataWithFuelLevelLtrs(new INTEGER(fuelLevelLtrs));
    }
    
    public static AlertData createAlertDataWithFuelLevelLtrs(INTEGER fuelLevelLtrs)
    {
	AlertData __object = new AlertData();

	__object.setFuelLevelLtrs(fuelLevelLtrs);
	return __object;
    }
    
    public boolean hasFuelLevelLtrs()
    {
	return getChosenFlag() == fuelLevelLtrs_chosen;
    }
    
    public void setFuelLevelLtrs(long fuelLevelLtrs)
    {
	setFuelLevelLtrs(new INTEGER(fuelLevelLtrs));
    }
    
    public void setFuelLevelLtrs(INTEGER fuelLevelLtrs)
    {
	setChosenValue(fuelLevelLtrs);
	setChosenFlag(fuelLevelLtrs_chosen);
    }
    
    
    // Methods for field "remoteClimate"
    public static AlertData createAlertDataWithRemoteClimate(Null remoteClimate)
    {
	AlertData __object = new AlertData();

	__object.setRemoteClimate(remoteClimate);
	return __object;
    }
    
    public boolean hasRemoteClimate()
    {
	return getChosenFlag() == remoteClimate_chosen;
    }
    
    public void setRemoteClimate(Null remoteClimate)
    {
	setChosenValue(remoteClimate);
	setChosenFlag(remoteClimate_chosen);
    }
    
    
    // Methods for field "vehicleUnlocked"
    public static AlertData createAlertDataWithVehicleUnlocked(Null vehicleUnlocked)
    {
	AlertData __object = new AlertData();

	__object.setVehicleUnlocked(vehicleUnlocked);
	return __object;
    }
    
    public boolean hasVehicleUnlocked()
    {
	return getChosenFlag() == vehicleUnlocked_chosen;
    }
    
    public void setVehicleUnlocked(Null vehicleUnlocked)
    {
	setChosenValue(vehicleUnlocked);
	setChosenFlag(vehicleUnlocked_chosen);
    }
    
    
    // Methods for field "doorOpen"
    public static AlertData createAlertDataWithDoorOpen(Null doorOpen)
    {
	AlertData __object = new AlertData();

	__object.setDoorOpen(doorOpen);
	return __object;
    }
    
    public boolean hasDoorOpen()
    {
	return getChosenFlag() == doorOpen_chosen;
    }
    
    public void setDoorOpen(Null doorOpen)
    {
	setChosenValue(doorOpen);
	setChosenFlag(doorOpen_chosen);
    }
    
    
    // Methods for field "bootOpen"
    public static AlertData createAlertDataWithBootOpen(Null bootOpen)
    {
	AlertData __object = new AlertData();

	__object.setBootOpen(bootOpen);
	return __object;
    }
    
    public boolean hasBootOpen()
    {
	return getChosenFlag() == bootOpen_chosen;
    }
    
    public void setBootOpen(Null bootOpen)
    {
	setChosenValue(bootOpen);
	setChosenFlag(bootOpen_chosen);
    }
    
    
    // Methods for field "bonnetOpen"
    public static AlertData createAlertDataWithBonnetOpen(Null bonnetOpen)
    {
	AlertData __object = new AlertData();

	__object.setBonnetOpen(bonnetOpen);
	return __object;
    }
    
    public boolean hasBonnetOpen()
    {
	return getChosenFlag() == bonnetOpen_chosen;
    }
    
    public void setBonnetOpen(Null bonnetOpen)
    {
	setChosenValue(bonnetOpen);
	setChosenFlag(bonnetOpen_chosen);
    }
    
    
    // Methods for field "roofOpen"
    public static AlertData createAlertDataWithRoofOpen(Null roofOpen)
    {
	AlertData __object = new AlertData();

	__object.setRoofOpen(roofOpen);
	return __object;
    }
    
    public boolean hasRoofOpen()
    {
	return getChosenFlag() == roofOpen_chosen;
    }
    
    public void setRoofOpen(Null roofOpen)
    {
	setChosenValue(roofOpen);
	setChosenFlag(roofOpen_chosen);
    }
    
    
    // Methods for field "windowOpen"
    public static AlertData createAlertDataWithWindowOpen(Null windowOpen)
    {
	AlertData __object = new AlertData();

	__object.setWindowOpen(windowOpen);
	return __object;
    }
    
    public boolean hasWindowOpen()
    {
	return getChosenFlag() == windowOpen_chosen;
    }
    
    public void setWindowOpen(Null windowOpen)
    {
	setChosenValue(windowOpen);
	setChosenFlag(windowOpen_chosen);
    }
    
    
    // Methods for field "alarmUnarmed"
    public static AlertData createAlertDataWithAlarmUnarmed(Null alarmUnarmed)
    {
	AlertData __object = new AlertData();

	__object.setAlarmUnarmed(alarmUnarmed);
	return __object;
    }
    
    public boolean hasAlarmUnarmed()
    {
	return getChosenFlag() == alarmUnarmed_chosen;
    }
    
    public void setAlarmUnarmed(Null alarmUnarmed)
    {
	setChosenValue(alarmUnarmed);
	setChosenFlag(alarmUnarmed_chosen);
    }
    
    
    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case engineOn_chosen:
		return new Null();
	    case vehicleAlarm_chosen:
		return new Null();
	    case externalPowerRemoval_chosen:
		return new Null();
	    case gsmJamming_chosen:
		return new Null();
	    case gsmAntennaFailure_chosen:
		return new Null();
	    case gnssAntennaFailure_chosen:
		return new Null();
	    case unauthMovement_chosen:
		return new Null();
	    case coolantLevel_chosen:
		return new Null();
	    case unused_chosen:
		return new Null();
	    case washerFluidLevel_chosen:
		return new Null();
	    case brakeFluidStatus_chosen:
		return new Null();
	    case brakePadWear_chosen:
		return new Null();
	    case tyrePressureFL_chosen:
		return new TyreStatus();
	    case tyrePressureFR_chosen:
		return new TyreStatus();
	    case tyrePressureRL_chosen:
		return new TyreStatus();
	    case tyrePressureRR_chosen:
		return new TyreStatus();
	    case tyrePressSensorFail_chosen:
		return new Null();
	    case engineMalfunction_chosen:
		return new Null();
	    case oilLevel_chosen:
		return LiquidLevelWarning.normal;
	    case distToServiceKm_chosen:
		return new Null();
	    case odometerExceeded_chosen:
		return new OdometerData();
	    case transportMode_chosen:
		return new Null();
	    case lowBatteryVoltx10_chosen:
		return new INTEGER();
	    case fuelLevel_chosen:
		return new Null();
	    case fuelLevelLtrs_chosen:
		return new INTEGER();
	    case remoteClimate_chosen:
		return new Null();
	    case vehicleUnlocked_chosen:
		return new Null();
	    case doorOpen_chosen:
		return new Null();
	    case bootOpen_chosen:
		return new Null();
	    case bonnetOpen_chosen:
		return new Null();
	    case roofOpen_chosen:
		return new Null();
	    case windowOpen_chosen:
		return new Null();
	    case alarmUnarmed_chosen:
		return new Null();
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
	    "AlertData"
	),
	new QName (
	    "NGTP-Service-Data",
	    "AlertData"
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
		    "engineOn",
		    0,
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
		    "vehicleAlarm",
		    1,
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
		    "externalPowerRemoval",
		    2,
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
		    "gsmJamming",
		    3,
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
		    "gsmAntennaFailure",
		    4,
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
		    "gnssAntennaFailure",
		    5,
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
		    "unauthMovement",
		    6,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
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
		    "coolantLevel",
		    7,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x801f
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
		    "unused",
		    8,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8020
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
		    "washerFluidLevel",
		    9,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8021
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
		    "brakeFluidStatus",
		    10,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8022
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
		    "brakePadWear",
		    11,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8023
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "tyrePressureFL",
		    12,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8024
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "tyrePressureFR",
		    13,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8025
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "tyrePressureRL",
		    14,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8026
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatus"
				)
			    ),
			    0
			)
		    ),
		    "tyrePressureRR",
		    15,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8027
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
		    "tyrePressSensorFail",
		    16,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8028
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
		    "engineMalfunction",
		    17,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8029
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"LiquidLevelWarning"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"LiquidLevelWarning"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"normal",
					0
				    ),
				    new MemberListElement (
					"low",
					1
				    ),
				    new MemberListElement (
					"very-low",
					2
				    ),
				    new MemberListElement (
					"high",
					3
				    ),
				    new MemberListElement (
					"very-high",
					4
				    ),
				    new MemberListElement (
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    LiquidLevelWarning.normal
			)
		    ),
		    "oilLevel",
		    18,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x802a
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
		    "distToServiceKm",
		    19,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x802b
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"OdometerData"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"OdometerData"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "OdometerData"
				)
			    ),
			    0
			)
		    ),
		    "odometerExceeded",
		    20,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x802c
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
		    "transportMode",
		    21,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x802d
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
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "lowBatteryVoltx10",
		    22,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x802e
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
		    "fuelLevel",
		    23,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x802f
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
				    new com.oss.asn1.INTEGER(127),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(127)
			    ),
			    null
			)
		    ),
		    "fuelLevelLtrs",
		    24,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8030
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
		    "remoteClimate",
		    25,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8032
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
		    "vehicleUnlocked",
		    26,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8033
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
		    "doorOpen",
		    27,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8034
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
		    "bootOpen",
		    28,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8035
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
		    "bonnetOpen",
		    29,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8036
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
		    "roofOpen",
		    30,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8037
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
		    "windowOpen",
		    31,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8038
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
		    "alarmUnarmed",
		    32,
		    2
		)
	    }
	),
	0,
	new TagDecoder (
	    new TagDecoderElement[] {
		new TagDecoderElement((short)0x8000, 0),
		new TagDecoderElement((short)0x800a, 1),
		new TagDecoderElement((short)0x800b, 2),
		new TagDecoderElement((short)0x800c, 3),
		new TagDecoderElement((short)0x800d, 4),
		new TagDecoderElement((short)0x800e, 5),
		new TagDecoderElement((short)0x800f, 6),
		new TagDecoderElement((short)0x801e, 7),
		new TagDecoderElement((short)0x801f, 8),
		new TagDecoderElement((short)0x8020, 9),
		new TagDecoderElement((short)0x8021, 10),
		new TagDecoderElement((short)0x8022, 11),
		new TagDecoderElement((short)0x8023, 12),
		new TagDecoderElement((short)0x8024, 13),
		new TagDecoderElement((short)0x8025, 14),
		new TagDecoderElement((short)0x8026, 15),
		new TagDecoderElement((short)0x8027, 16),
		new TagDecoderElement((short)0x8028, 17),
		new TagDecoderElement((short)0x8029, 18),
		new TagDecoderElement((short)0x802a, 19),
		new TagDecoderElement((short)0x802b, 20),
		new TagDecoderElement((short)0x802c, 21),
		new TagDecoderElement((short)0x802d, 22),
		new TagDecoderElement((short)0x802e, 23),
		new TagDecoderElement((short)0x802f, 24),
		new TagDecoderElement((short)0x8030, 25),
		new TagDecoderElement((short)0x8032, 26),
		new TagDecoderElement((short)0x8033, 27),
		new TagDecoderElement((short)0x8034, 28),
		new TagDecoderElement((short)0x8035, 29),
		new TagDecoderElement((short)0x8036, 30),
		new TagDecoderElement((short)0x8037, 31),
		new TagDecoderElement((short)0x8038, 32)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AlertData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AlertData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AlertData
