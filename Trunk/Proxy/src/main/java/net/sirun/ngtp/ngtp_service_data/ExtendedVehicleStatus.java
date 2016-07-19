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
 * Define the ASN1 Type ExtendedVehicleStatus from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class ExtendedVehicleStatus extends Sequence {
    
    /**
     * The default constructor.
     */
    public ExtendedVehicleStatus()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ExtendedVehicleStatus(BOOLEXT panicAlarmTriggered, 
		    BOOLEXT crashSituation, INTEGER batteryVoltx10, 
		    WindowStatuses windowStatus, DoorStatuses doorStatus, 
		    BOOLEXT cabOpenStatus, BOOLEXT sunroofOpenStatus, 
		    BOOLEXT bootOpenStatus, INTEGER fuelAmountDl, 
		    INTEGER distToEmptyFuelKm, OdometerData odometerValue, 
		    TyreStatuses tyreStatuses, INTEGER engineCoolantTempDeg, 
		    BOOLEXT headLightOn, TimeHM vehicleDateTime, 
		    EcoGrade ecoGrade, INTEGER engHrsToSrvc, INTEGER kmToSrvc, 
		    INTEGER monthsToSrvc, ServiceWarningStatus srvcWarnStatus, 
		    ServiceWarningTrigger srvcWarnTrigger, 
		    BulbFailures bulbFailures, 
		    LiquidLevelWarning brakeFluidWarn, 
		    LiquidLevelWarning engCoolantLevelWarn, 
		    LiquidLevelWarning oilLevelWarn, 
		    PressureWarning oilPressureWarn, 
		    LiquidLevelWarning washerFluidWarn, 
		    OdometerData tripMeter1, OdometerData tripMeter2, 
		    AvgFuelConsumptionCl avgFuelConsCl, INTEGER avgSpeedKmph)
    {
	setPanicAlarmTriggered(panicAlarmTriggered);
	setCrashSituation(crashSituation);
	setBatteryVoltx10(batteryVoltx10);
	setWindowStatus(windowStatus);
	setDoorStatus(doorStatus);
	setCabOpenStatus(cabOpenStatus);
	setSunroofOpenStatus(sunroofOpenStatus);
	setBootOpenStatus(bootOpenStatus);
	setFuelAmountDl(fuelAmountDl);
	setDistToEmptyFuelKm(distToEmptyFuelKm);
	setOdometerValue(odometerValue);
	setTyreStatuses(tyreStatuses);
	setEngineCoolantTempDeg(engineCoolantTempDeg);
	setHeadLightOn(headLightOn);
	setVehicleDateTime(vehicleDateTime);
	setEcoGrade(ecoGrade);
	setEngHrsToSrvc(engHrsToSrvc);
	setKmToSrvc(kmToSrvc);
	setMonthsToSrvc(monthsToSrvc);
	setSrvcWarnStatus(srvcWarnStatus);
	setSrvcWarnTrigger(srvcWarnTrigger);
	setBulbFailures(bulbFailures);
	setBrakeFluidWarn(brakeFluidWarn);
	setEngCoolantLevelWarn(engCoolantLevelWarn);
	setOilLevelWarn(oilLevelWarn);
	setOilPressureWarn(oilPressureWarn);
	setWasherFluidWarn(washerFluidWarn);
	setTripMeter1(tripMeter1);
	setTripMeter2(tripMeter2);
	setAvgFuelConsCl(avgFuelConsCl);
	setAvgSpeedKmph(avgSpeedKmph);
    }
    
    /**
     * Construct with components.
     */
    public ExtendedVehicleStatus(BOOLEXT panicAlarmTriggered, 
		    BOOLEXT crashSituation, long batteryVoltx10, 
		    WindowStatuses windowStatus, DoorStatuses doorStatus, 
		    BOOLEXT cabOpenStatus, BOOLEXT sunroofOpenStatus, 
		    BOOLEXT bootOpenStatus, long fuelAmountDl, 
		    long distToEmptyFuelKm, OdometerData odometerValue, 
		    TyreStatuses tyreStatuses, long engineCoolantTempDeg, 
		    BOOLEXT headLightOn, TimeHM vehicleDateTime, 
		    EcoGrade ecoGrade, long engHrsToSrvc, long kmToSrvc, 
		    long monthsToSrvc, ServiceWarningStatus srvcWarnStatus, 
		    ServiceWarningTrigger srvcWarnTrigger, 
		    BulbFailures bulbFailures, 
		    LiquidLevelWarning brakeFluidWarn, 
		    LiquidLevelWarning engCoolantLevelWarn, 
		    LiquidLevelWarning oilLevelWarn, 
		    PressureWarning oilPressureWarn, 
		    LiquidLevelWarning washerFluidWarn, 
		    OdometerData tripMeter1, OdometerData tripMeter2, 
		    AvgFuelConsumptionCl avgFuelConsCl, long avgSpeedKmph)
    {
	this(panicAlarmTriggered, crashSituation, 
	     new INTEGER(batteryVoltx10), windowStatus, doorStatus, 
	     cabOpenStatus, sunroofOpenStatus, bootOpenStatus, 
	     new INTEGER(fuelAmountDl), new INTEGER(distToEmptyFuelKm), 
	     odometerValue, tyreStatuses, 
	     new INTEGER(engineCoolantTempDeg), headLightOn, 
	     vehicleDateTime, ecoGrade, new INTEGER(engHrsToSrvc), 
	     new INTEGER(kmToSrvc), new INTEGER(monthsToSrvc), 
	     srvcWarnStatus, srvcWarnTrigger, bulbFailures, 
	     brakeFluidWarn, engCoolantLevelWarn, oilLevelWarn, 
	     oilPressureWarn, washerFluidWarn, tripMeter1, tripMeter2, 
	     avgFuelConsCl, new INTEGER(avgSpeedKmph));
    }
    
    /**
     * Construct with required components.
     */
    public ExtendedVehicleStatus(BOOLEXT panicAlarmTriggered, 
		    BOOLEXT crashSituation, BOOLEXT cabOpenStatus, 
		    BOOLEXT sunroofOpenStatus, BOOLEXT bootOpenStatus, 
		    BOOLEXT headLightOn, BulbFailures bulbFailures)
    {
	setPanicAlarmTriggered(panicAlarmTriggered);
	setCrashSituation(crashSituation);
	setCabOpenStatus(cabOpenStatus);
	setSunroofOpenStatus(sunroofOpenStatus);
	setBootOpenStatus(bootOpenStatus);
	setHeadLightOn(headLightOn);
	setBulbFailures(bulbFailures);
    }
    
    public void initComponents()
    {
	mComponents[0] = BOOLEXT.isFalse;
	mComponents[1] = BOOLEXT.isFalse;
	mComponents[2] = new INTEGER();
	mComponents[3] = new WindowStatuses();
	mComponents[4] = new DoorStatuses();
	mComponents[5] = BOOLEXT.isFalse;
	mComponents[6] = BOOLEXT.isFalse;
	mComponents[7] = BOOLEXT.isFalse;
	mComponents[8] = new INTEGER();
	mComponents[9] = new INTEGER();
	mComponents[10] = new OdometerData();
	mComponents[11] = new TyreStatuses();
	mComponents[12] = new INTEGER();
	mComponents[13] = BOOLEXT.isFalse;
	mComponents[14] = new TimeHM();
	mComponents[15] = new EcoGrade();
	mComponents[16] = new INTEGER();
	mComponents[17] = new INTEGER();
	mComponents[18] = new INTEGER();
	mComponents[19] = ServiceWarningStatus.normal;
	mComponents[20] = ServiceWarningTrigger.calendar_time;
	mComponents[21] = new BulbFailures();
	mComponents[22] = LiquidLevelWarning.normal;
	mComponents[23] = LiquidLevelWarning.normal;
	mComponents[24] = LiquidLevelWarning.normal;
	mComponents[25] = PressureWarning.normal;
	mComponents[26] = LiquidLevelWarning.normal;
	mComponents[27] = new OdometerData();
	mComponents[28] = new OdometerData();
	mComponents[29] = new AvgFuelConsumptionCl();
	mComponents[30] = new INTEGER();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[31];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return BOOLEXT.isFalse;
	    case 1:
		return BOOLEXT.isFalse;
	    case 2:
		return new INTEGER();
	    case 3:
		return new WindowStatuses();
	    case 4:
		return new DoorStatuses();
	    case 5:
		return BOOLEXT.isFalse;
	    case 6:
		return BOOLEXT.isFalse;
	    case 7:
		return BOOLEXT.isFalse;
	    case 8:
		return new INTEGER();
	    case 9:
		return new INTEGER();
	    case 10:
		return new OdometerData();
	    case 11:
		return new TyreStatuses();
	    case 12:
		return new INTEGER();
	    case 13:
		return BOOLEXT.isFalse;
	    case 14:
		return new TimeHM();
	    case 15:
		return new EcoGrade();
	    case 16:
		return new INTEGER();
	    case 17:
		return new INTEGER();
	    case 18:
		return new INTEGER();
	    case 19:
		return ServiceWarningStatus.normal;
	    case 20:
		return ServiceWarningTrigger.calendar_time;
	    case 21:
		return new BulbFailures();
	    case 22:
		return LiquidLevelWarning.normal;
	    case 23:
		return LiquidLevelWarning.normal;
	    case 24:
		return LiquidLevelWarning.normal;
	    case 25:
		return PressureWarning.normal;
	    case 26:
		return LiquidLevelWarning.normal;
	    case 27:
		return new OdometerData();
	    case 28:
		return new OdometerData();
	    case 29:
		return new AvgFuelConsumptionCl();
	    case 30:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "panicAlarmTriggered"
    public BOOLEXT getPanicAlarmTriggered()
    {
	return (BOOLEXT)mComponents[0];
    }
    
    public void setPanicAlarmTriggered(BOOLEXT panicAlarmTriggered)
    {
	mComponents[0] = panicAlarmTriggered;
    }
    
    
    // Methods for field "crashSituation"
    public BOOLEXT getCrashSituation()
    {
	return (BOOLEXT)mComponents[1];
    }
    
    public void setCrashSituation(BOOLEXT crashSituation)
    {
	mComponents[1] = crashSituation;
    }
    
    
    // Methods for field "batteryVoltx10"
    public long getBatteryVoltx10()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setBatteryVoltx10(long batteryVoltx10)
    {
	setBatteryVoltx10(new INTEGER(batteryVoltx10));
    }
    
    public void setBatteryVoltx10(INTEGER batteryVoltx10)
    {
	mComponents[2] = batteryVoltx10;
    }
    
    public boolean hasBatteryVoltx10()
    {
	return componentIsPresent(2);
    }
    
    public void deleteBatteryVoltx10()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "windowStatus"
    public WindowStatuses getWindowStatus()
    {
	return (WindowStatuses)mComponents[3];
    }
    
    public void setWindowStatus(WindowStatuses windowStatus)
    {
	mComponents[3] = windowStatus;
    }
    
    public boolean hasWindowStatus()
    {
	return componentIsPresent(3);
    }
    
    public void deleteWindowStatus()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "doorStatus"
    public DoorStatuses getDoorStatus()
    {
	return (DoorStatuses)mComponents[4];
    }
    
    public void setDoorStatus(DoorStatuses doorStatus)
    {
	mComponents[4] = doorStatus;
    }
    
    public boolean hasDoorStatus()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDoorStatus()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "cabOpenStatus"
    public BOOLEXT getCabOpenStatus()
    {
	return (BOOLEXT)mComponents[5];
    }
    
    public void setCabOpenStatus(BOOLEXT cabOpenStatus)
    {
	mComponents[5] = cabOpenStatus;
    }
    
    
    // Methods for field "sunroofOpenStatus"
    public BOOLEXT getSunroofOpenStatus()
    {
	return (BOOLEXT)mComponents[6];
    }
    
    public void setSunroofOpenStatus(BOOLEXT sunroofOpenStatus)
    {
	mComponents[6] = sunroofOpenStatus;
    }
    
    
    // Methods for field "bootOpenStatus"
    public BOOLEXT getBootOpenStatus()
    {
	return (BOOLEXT)mComponents[7];
    }
    
    public void setBootOpenStatus(BOOLEXT bootOpenStatus)
    {
	mComponents[7] = bootOpenStatus;
    }
    
    
    // Methods for field "fuelAmountDl"
    public long getFuelAmountDl()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setFuelAmountDl(long fuelAmountDl)
    {
	setFuelAmountDl(new INTEGER(fuelAmountDl));
    }
    
    public void setFuelAmountDl(INTEGER fuelAmountDl)
    {
	mComponents[8] = fuelAmountDl;
    }
    
    public boolean hasFuelAmountDl()
    {
	return componentIsPresent(8);
    }
    
    public void deleteFuelAmountDl()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "distToEmptyFuelKm"
    public long getDistToEmptyFuelKm()
    {
	return ((INTEGER)mComponents[9]).longValue();
    }
    
    public void setDistToEmptyFuelKm(long distToEmptyFuelKm)
    {
	setDistToEmptyFuelKm(new INTEGER(distToEmptyFuelKm));
    }
    
    public void setDistToEmptyFuelKm(INTEGER distToEmptyFuelKm)
    {
	mComponents[9] = distToEmptyFuelKm;
    }
    
    public boolean hasDistToEmptyFuelKm()
    {
	return componentIsPresent(9);
    }
    
    public void deleteDistToEmptyFuelKm()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "odometerValue"
    public OdometerData getOdometerValue()
    {
	return (OdometerData)mComponents[10];
    }
    
    public void setOdometerValue(OdometerData odometerValue)
    {
	mComponents[10] = odometerValue;
    }
    
    public boolean hasOdometerValue()
    {
	return componentIsPresent(10);
    }
    
    public void deleteOdometerValue()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "tyreStatuses"
    public TyreStatuses getTyreStatuses()
    {
	return (TyreStatuses)mComponents[11];
    }
    
    public void setTyreStatuses(TyreStatuses tyreStatuses)
    {
	mComponents[11] = tyreStatuses;
    }
    
    public boolean hasTyreStatuses()
    {
	return componentIsPresent(11);
    }
    
    public void deleteTyreStatuses()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "engineCoolantTempDeg"
    public long getEngineCoolantTempDeg()
    {
	return ((INTEGER)mComponents[12]).longValue();
    }
    
    public void setEngineCoolantTempDeg(long engineCoolantTempDeg)
    {
	setEngineCoolantTempDeg(new INTEGER(engineCoolantTempDeg));
    }
    
    public void setEngineCoolantTempDeg(INTEGER engineCoolantTempDeg)
    {
	mComponents[12] = engineCoolantTempDeg;
    }
    
    public boolean hasEngineCoolantTempDeg()
    {
	return componentIsPresent(12);
    }
    
    public void deleteEngineCoolantTempDeg()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "headLightOn"
    public BOOLEXT getHeadLightOn()
    {
	return (BOOLEXT)mComponents[13];
    }
    
    public void setHeadLightOn(BOOLEXT headLightOn)
    {
	mComponents[13] = headLightOn;
    }
    
    
    // Methods for field "vehicleDateTime"
    public TimeHM getVehicleDateTime()
    {
	return (TimeHM)mComponents[14];
    }
    
    public void setVehicleDateTime(TimeHM vehicleDateTime)
    {
	mComponents[14] = vehicleDateTime;
    }
    
    public boolean hasVehicleDateTime()
    {
	return componentIsPresent(14);
    }
    
    public void deleteVehicleDateTime()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "ecoGrade"
    public EcoGrade getEcoGrade()
    {
	return (EcoGrade)mComponents[15];
    }
    
    public void setEcoGrade(EcoGrade ecoGrade)
    {
	mComponents[15] = ecoGrade;
    }
    
    public boolean hasEcoGrade()
    {
	return componentIsPresent(15);
    }
    
    public void deleteEcoGrade()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "engHrsToSrvc"
    public long getEngHrsToSrvc()
    {
	return ((INTEGER)mComponents[16]).longValue();
    }
    
    public void setEngHrsToSrvc(long engHrsToSrvc)
    {
	setEngHrsToSrvc(new INTEGER(engHrsToSrvc));
    }
    
    public void setEngHrsToSrvc(INTEGER engHrsToSrvc)
    {
	mComponents[16] = engHrsToSrvc;
    }
    
    public boolean hasEngHrsToSrvc()
    {
	return componentIsPresent(16);
    }
    
    public void deleteEngHrsToSrvc()
    {
	setComponentAbsent(16);
    }
    
    
    // Methods for field "kmToSrvc"
    public long getKmToSrvc()
    {
	return ((INTEGER)mComponents[17]).longValue();
    }
    
    public void setKmToSrvc(long kmToSrvc)
    {
	setKmToSrvc(new INTEGER(kmToSrvc));
    }
    
    public void setKmToSrvc(INTEGER kmToSrvc)
    {
	mComponents[17] = kmToSrvc;
    }
    
    public boolean hasKmToSrvc()
    {
	return componentIsPresent(17);
    }
    
    public void deleteKmToSrvc()
    {
	setComponentAbsent(17);
    }
    
    
    // Methods for field "monthsToSrvc"
    public long getMonthsToSrvc()
    {
	return ((INTEGER)mComponents[18]).longValue();
    }
    
    public void setMonthsToSrvc(long monthsToSrvc)
    {
	setMonthsToSrvc(new INTEGER(monthsToSrvc));
    }
    
    public void setMonthsToSrvc(INTEGER monthsToSrvc)
    {
	mComponents[18] = monthsToSrvc;
    }
    
    public boolean hasMonthsToSrvc()
    {
	return componentIsPresent(18);
    }
    
    public void deleteMonthsToSrvc()
    {
	setComponentAbsent(18);
    }
    
    
    // Methods for field "srvcWarnStatus"
    public ServiceWarningStatus getSrvcWarnStatus()
    {
	return (ServiceWarningStatus)mComponents[19];
    }
    
    public void setSrvcWarnStatus(ServiceWarningStatus srvcWarnStatus)
    {
	mComponents[19] = srvcWarnStatus;
    }
    
    public boolean hasSrvcWarnStatus()
    {
	return componentIsPresent(19);
    }
    
    public void deleteSrvcWarnStatus()
    {
	setComponentAbsent(19);
    }
    
    
    // Methods for field "srvcWarnTrigger"
    public ServiceWarningTrigger getSrvcWarnTrigger()
    {
	return (ServiceWarningTrigger)mComponents[20];
    }
    
    public void setSrvcWarnTrigger(ServiceWarningTrigger srvcWarnTrigger)
    {
	mComponents[20] = srvcWarnTrigger;
    }
    
    public boolean hasSrvcWarnTrigger()
    {
	return componentIsPresent(20);
    }
    
    public void deleteSrvcWarnTrigger()
    {
	setComponentAbsent(20);
    }
    
    
    // Methods for field "bulbFailures"
    public BulbFailures getBulbFailures()
    {
	return (BulbFailures)mComponents[21];
    }
    
    public void setBulbFailures(BulbFailures bulbFailures)
    {
	mComponents[21] = bulbFailures;
    }
    
    
    
    /**
     * Define the ASN1 Type BulbFailures from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class BulbFailures extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public BulbFailures()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public BulbFailures(Bulb[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(Bulb element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(Bulb element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized Bulb get(int atIndex)
	{
	    return (Bulb)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(Bulb element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(Bulb element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return Bulb.left_turn_any;
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8015
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"ExtendedVehicleStatus$BulbFailures"
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
			new com.oss.asn1.INTEGER(7),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(7)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "Bulb"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' BulbFailures object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' BulbFailures object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for BulbFailures

    // Methods for field "brakeFluidWarn"
    public LiquidLevelWarning getBrakeFluidWarn()
    {
	return (LiquidLevelWarning)mComponents[22];
    }
    
    public void setBrakeFluidWarn(LiquidLevelWarning brakeFluidWarn)
    {
	mComponents[22] = brakeFluidWarn;
    }
    
    public boolean hasBrakeFluidWarn()
    {
	return componentIsPresent(22);
    }
    
    public void deleteBrakeFluidWarn()
    {
	setComponentAbsent(22);
    }
    
    
    // Methods for field "engCoolantLevelWarn"
    public LiquidLevelWarning getEngCoolantLevelWarn()
    {
	return (LiquidLevelWarning)mComponents[23];
    }
    
    public void setEngCoolantLevelWarn(LiquidLevelWarning engCoolantLevelWarn)
    {
	mComponents[23] = engCoolantLevelWarn;
    }
    
    public boolean hasEngCoolantLevelWarn()
    {
	return componentIsPresent(23);
    }
    
    public void deleteEngCoolantLevelWarn()
    {
	setComponentAbsent(23);
    }
    
    
    // Methods for field "oilLevelWarn"
    public LiquidLevelWarning getOilLevelWarn()
    {
	return (LiquidLevelWarning)mComponents[24];
    }
    
    public void setOilLevelWarn(LiquidLevelWarning oilLevelWarn)
    {
	mComponents[24] = oilLevelWarn;
    }
    
    public boolean hasOilLevelWarn()
    {
	return componentIsPresent(24);
    }
    
    public void deleteOilLevelWarn()
    {
	setComponentAbsent(24);
    }
    
    
    // Methods for field "oilPressureWarn"
    public PressureWarning getOilPressureWarn()
    {
	return (PressureWarning)mComponents[25];
    }
    
    public void setOilPressureWarn(PressureWarning oilPressureWarn)
    {
	mComponents[25] = oilPressureWarn;
    }
    
    public boolean hasOilPressureWarn()
    {
	return componentIsPresent(25);
    }
    
    public void deleteOilPressureWarn()
    {
	setComponentAbsent(25);
    }
    
    
    // Methods for field "washerFluidWarn"
    public LiquidLevelWarning getWasherFluidWarn()
    {
	return (LiquidLevelWarning)mComponents[26];
    }
    
    public void setWasherFluidWarn(LiquidLevelWarning washerFluidWarn)
    {
	mComponents[26] = washerFluidWarn;
    }
    
    public boolean hasWasherFluidWarn()
    {
	return componentIsPresent(26);
    }
    
    public void deleteWasherFluidWarn()
    {
	setComponentAbsent(26);
    }
    
    
    // Methods for field "tripMeter1"
    public OdometerData getTripMeter1()
    {
	return (OdometerData)mComponents[27];
    }
    
    public void setTripMeter1(OdometerData tripMeter1)
    {
	mComponents[27] = tripMeter1;
    }
    
    public boolean hasTripMeter1()
    {
	return componentIsPresent(27);
    }
    
    public void deleteTripMeter1()
    {
	setComponentAbsent(27);
    }
    
    
    // Methods for field "tripMeter2"
    public OdometerData getTripMeter2()
    {
	return (OdometerData)mComponents[28];
    }
    
    public void setTripMeter2(OdometerData tripMeter2)
    {
	mComponents[28] = tripMeter2;
    }
    
    public boolean hasTripMeter2()
    {
	return componentIsPresent(28);
    }
    
    public void deleteTripMeter2()
    {
	setComponentAbsent(28);
    }
    
    
    // Methods for field "avgFuelConsCl"
    public AvgFuelConsumptionCl getAvgFuelConsCl()
    {
	return (AvgFuelConsumptionCl)mComponents[29];
    }
    
    public void setAvgFuelConsCl(AvgFuelConsumptionCl avgFuelConsCl)
    {
	mComponents[29] = avgFuelConsCl;
    }
    
    public boolean hasAvgFuelConsCl()
    {
	return componentIsPresent(29);
    }
    
    public void deleteAvgFuelConsCl()
    {
	setComponentAbsent(29);
    }
    
    
    // Methods for field "avgSpeedKmph"
    public long getAvgSpeedKmph()
    {
	return ((INTEGER)mComponents[30]).longValue();
    }
    
    public void setAvgSpeedKmph(long avgSpeedKmph)
    {
	setAvgSpeedKmph(new INTEGER(avgSpeedKmph));
    }
    
    public void setAvgSpeedKmph(INTEGER avgSpeedKmph)
    {
	mComponents[30] = avgSpeedKmph;
    }
    
    public boolean hasAvgSpeedKmph()
    {
	return componentIsPresent(30);
    }
    
    public void deleteAvgSpeedKmph()
    {
	setComponentAbsent(30);
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
	    "ExtendedVehicleStatus"
	),
	new QName (
	    "NGTP-Service-Data",
	    "ExtendedVehicleStatus"
	),
	12314,
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "panicAlarmTriggered",
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "crashSituation",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    "batteryVoltx10",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"WindowStatuses"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"WindowStatuses"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "WindowStatuses"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "WindowStatuses"
				)
			    ),
			    0
			)
		    ),
		    "windowStatus",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"DoorStatuses"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DoorStatuses"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatuses"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DoorStatuses"
				)
			    ),
			    0
			)
		    ),
		    "doorStatus",
		    4,
		    3,
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "cabOpenStatus",
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "sunroofOpenStatus",
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "bootOpenStatus",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "fuelAmountDl",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
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
				    new com.oss.asn1.INTEGER(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "distToEmptyFuelKm",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
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
		    "odometerValue",
		    10,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TyreStatuses"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TyreStatuses"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatuses"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TyreStatuses"
				)
			    ),
			    0
			)
		    ),
		    "tyreStatuses",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
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
				    new com.oss.asn1.INTEGER(-60), 
				    new com.oss.asn1.INTEGER(195),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(-60),
				new java.lang.Long(195)
			    ),
			    null
			)
		    ),
		    "engineCoolantTempDeg",
		    12,
		    3,
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
				"BOOLEXT"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BOOLEXT"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"isFalse",
					0
				    ),
				    new MemberListElement (
					"isTrue",
					1
				    ),
				    new MemberListElement (
					"isUnused",
					2
				    ),
				    new MemberListElement (
					"isUnknown",
					3
				    )
				}
			    ),
			    0,
			    BOOLEXT.isFalse
			)
		    ),
		    "headLightOn",
		    13,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800e
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TimeHM"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TimeHM"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeHM"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TimeHM"
				)
			    ),
			    0
			)
		    ),
		    "vehicleDateTime",
		    14,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800f
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"EcoGrade"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"EcoGrade"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "EcoGrade"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "EcoGrade"
				)
			    ),
			    0
			)
		    ),
		    "ecoGrade",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(4095),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(4095)
			    ),
			    null
			)
		    ),
		    "engHrsToSrvc",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
		    "kmToSrvc",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
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
				    new com.oss.asn1.INTEGER(0), 
				    new com.oss.asn1.INTEGER(63),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(63)
			    ),
			    null
			)
		    ),
		    "monthsToSrvc",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8013
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"ServiceWarningStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ServiceWarningStatus"
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
					"almost-time-for-srvc",
					1
				    ),
				    new MemberListElement (
					"time-for-srvc",
					2
				    ),
				    new MemberListElement (
					"time-exceeded",
					3
				    ),
				    new MemberListElement (
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    ServiceWarningStatus.normal
			)
		    ),
		    "srvcWarnStatus",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8014
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"ServiceWarningTrigger"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ServiceWarningTrigger"
			    ),
			    12314,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"calendar-time",
					0
				    ),
				    new MemberListElement (
					"distance",
					1
				    ),
				    new MemberListElement (
					"engine-hours",
					2
				    ),
				    new MemberListElement (
					"engine-req",
					3
				    ),
				    new MemberListElement (
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    ServiceWarningTrigger.calendar_time
			)
		    ),
		    "srvcWarnTrigger",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "ExtendedVehicleStatus$BulbFailures"
			)
		    ),
		    "bulbFailures",
		    21,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8016
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
		    "brakeFluidWarn",
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8017
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
		    "engCoolantLevelWarn",
		    23,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8018
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
		    "oilLevelWarn",
		    24,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8019
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"PressureWarning"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"PressureWarning"
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
					"unknown",
					7
				    )
				}
			    ),
			    0,
			    PressureWarning.normal
			)
		    ),
		    "oilPressureWarn",
		    25,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x801a
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
		    "washerFluidWarn",
		    26,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801b
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
		    "tripMeter1",
		    27,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x801c
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
		    "tripMeter2",
		    28,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801d
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"AvgFuelConsumptionCl"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"AvgFuelConsumptionCl"
			    ),
			    12314,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AvgFuelConsumptionCl(0), 
				    new AvgFuelConsumptionCl(16383),
				    0
				)
			    ),
			    new Bounds (
				new java.lang.Long(0),
				new java.lang.Long(16383)
			    ),
			    null
			)
		    ),
		    "avgFuelConsCl",
		    29,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x801e
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
		    "avgSpeedKmph",
		    30,
		    3,
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
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10),
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11),
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12),
			new TagDecoderElement((short)0x800d, 13)
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
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800f, 15),
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23),
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8018, 24),
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8019, 25),
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801a, 26),
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801b, 27),
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801c, 28),
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801d, 29),
			new TagDecoderElement((short)0x801e, 30)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x801e, 30)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ExtendedVehicleStatus object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ExtendedVehicleStatus object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ExtendedVehicleStatus
