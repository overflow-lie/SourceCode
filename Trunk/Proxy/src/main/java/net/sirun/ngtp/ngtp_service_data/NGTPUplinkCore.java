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
 * Define the ASN1 Type NGTPUplinkCore from ASN1 Module NGTP_Service_Data.
 * @see Sequence
 */

public class NGTPUplinkCore extends Sequence {
    
    /**
     * The default constructor.
     */
    public NGTPUplinkCore()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public NGTPUplinkCore(ExtendedPosition positionExtension, 
		    BasicVehicleStatus vehicleStatus, 
		    ExtendedVehicleStatus extendedVehicleStatus, 
		    DashboardStatus dashboardStatus, 
		    ElectricVehicleStatus electricVehicleStatus, 
		    ClimateStatus climateStatus, TelematicUnitStatus tuStatus, 
		    BasicPearlChain pearlChain, TimeStamp lastGPSTimeStamp, 
		    VIN vin, NavigationInformation navigationInformation, 
		    POIMemoryStatus memoryStatus, 
		    VehiclePropulsionType vehiclePropulsionType, 
		    CrashInformation crashData, 
		    RemoteOperationResponseList remoteOperationResponse, 
		    GenericText genericText, 
		    GenericParameters genericParameters, Trigger trigger, 
		    Alerts alerts, Trackpoints trackpoints, Journeys journeys, 
		    MSDInformation msdInfo, DebugInfo debugInfo, 
		    ErrorCodes errorCodes)
    {
	setPositionExtension(positionExtension);
	setVehicleStatus(vehicleStatus);
	setExtendedVehicleStatus(extendedVehicleStatus);
	setDashboardStatus(dashboardStatus);
	setElectricVehicleStatus(electricVehicleStatus);
	setClimateStatus(climateStatus);
	setTuStatus(tuStatus);
	setPearlChain(pearlChain);
	setLastGPSTimeStamp(lastGPSTimeStamp);
	setVin(vin);
	setNavigationInformation(navigationInformation);
	setMemoryStatus(memoryStatus);
	setVehiclePropulsionType(vehiclePropulsionType);
	setCrashData(crashData);
	setRemoteOperationResponse(remoteOperationResponse);
	setGenericText(genericText);
	setGenericParameters(genericParameters);
	setTrigger(trigger);
	setAlerts(alerts);
	setTrackpoints(trackpoints);
	setJourneys(journeys);
	setMsdInfo(msdInfo);
	setDebugInfo(debugInfo);
	setErrorCodes(errorCodes);
    }
    
    public void initComponents()
    {
	mComponents[0] = new ExtendedPosition();
	mComponents[1] = new BasicVehicleStatus();
	mComponents[2] = new ExtendedVehicleStatus();
	mComponents[3] = new DashboardStatus();
	mComponents[4] = new ElectricVehicleStatus();
	mComponents[5] = new ClimateStatus();
	mComponents[6] = new TelematicUnitStatus();
	mComponents[7] = new BasicPearlChain();
	mComponents[8] = new TimeStamp();
	mComponents[9] = new VIN();
	mComponents[10] = new NavigationInformation();
	mComponents[11] = new POIMemoryStatus();
	mComponents[12] = new VehiclePropulsionType();
	mComponents[13] = new CrashInformation();
	mComponents[14] = new RemoteOperationResponseList();
	mComponents[15] = new GenericText();
	mComponents[16] = new GenericParameters();
	mComponents[17] = new Trigger();
	mComponents[18] = new Alerts();
	mComponents[19] = new Trackpoints();
	mComponents[20] = new Journeys();
	mComponents[21] = new MSDInformation();
	mComponents[22] = new DebugInfo();
	mComponents[23] = new ErrorCodes();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[24];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new ExtendedPosition();
	    case 1:
		return new BasicVehicleStatus();
	    case 2:
		return new ExtendedVehicleStatus();
	    case 3:
		return new DashboardStatus();
	    case 4:
		return new ElectricVehicleStatus();
	    case 5:
		return new ClimateStatus();
	    case 6:
		return new TelematicUnitStatus();
	    case 7:
		return new BasicPearlChain();
	    case 8:
		return new TimeStamp();
	    case 9:
		return new VIN();
	    case 10:
		return new NavigationInformation();
	    case 11:
		return new POIMemoryStatus();
	    case 12:
		return new VehiclePropulsionType();
	    case 13:
		return new CrashInformation();
	    case 14:
		return new RemoteOperationResponseList();
	    case 15:
		return new GenericText();
	    case 16:
		return new GenericParameters();
	    case 17:
		return new Trigger();
	    case 18:
		return new Alerts();
	    case 19:
		return new Trackpoints();
	    case 20:
		return new Journeys();
	    case 21:
		return new MSDInformation();
	    case 22:
		return new DebugInfo();
	    case 23:
		return new ErrorCodes();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "positionExtension"
    public ExtendedPosition getPositionExtension()
    {
	return (ExtendedPosition)mComponents[0];
    }
    
    public void setPositionExtension(ExtendedPosition positionExtension)
    {
	mComponents[0] = positionExtension;
    }
    
    public boolean hasPositionExtension()
    {
	return componentIsPresent(0);
    }
    
    public void deletePositionExtension()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "vehicleStatus"
    public BasicVehicleStatus getVehicleStatus()
    {
	return (BasicVehicleStatus)mComponents[1];
    }
    
    public void setVehicleStatus(BasicVehicleStatus vehicleStatus)
    {
	mComponents[1] = vehicleStatus;
    }
    
    public boolean hasVehicleStatus()
    {
	return componentIsPresent(1);
    }
    
    public void deleteVehicleStatus()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "extendedVehicleStatus"
    public ExtendedVehicleStatus getExtendedVehicleStatus()
    {
	return (ExtendedVehicleStatus)mComponents[2];
    }
    
    public void setExtendedVehicleStatus(ExtendedVehicleStatus extendedVehicleStatus)
    {
	mComponents[2] = extendedVehicleStatus;
    }
    
    public boolean hasExtendedVehicleStatus()
    {
	return componentIsPresent(2);
    }
    
    public void deleteExtendedVehicleStatus()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "dashboardStatus"
    public DashboardStatus getDashboardStatus()
    {
	return (DashboardStatus)mComponents[3];
    }
    
    public void setDashboardStatus(DashboardStatus dashboardStatus)
    {
	mComponents[3] = dashboardStatus;
    }
    
    public boolean hasDashboardStatus()
    {
	return componentIsPresent(3);
    }
    
    public void deleteDashboardStatus()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "electricVehicleStatus"
    public ElectricVehicleStatus getElectricVehicleStatus()
    {
	return (ElectricVehicleStatus)mComponents[4];
    }
    
    public void setElectricVehicleStatus(ElectricVehicleStatus electricVehicleStatus)
    {
	mComponents[4] = electricVehicleStatus;
    }
    
    public boolean hasElectricVehicleStatus()
    {
	return componentIsPresent(4);
    }
    
    public void deleteElectricVehicleStatus()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "climateStatus"
    public ClimateStatus getClimateStatus()
    {
	return (ClimateStatus)mComponents[5];
    }
    
    public void setClimateStatus(ClimateStatus climateStatus)
    {
	mComponents[5] = climateStatus;
    }
    
    public boolean hasClimateStatus()
    {
	return componentIsPresent(5);
    }
    
    public void deleteClimateStatus()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "tuStatus"
    public TelematicUnitStatus getTuStatus()
    {
	return (TelematicUnitStatus)mComponents[6];
    }
    
    public void setTuStatus(TelematicUnitStatus tuStatus)
    {
	mComponents[6] = tuStatus;
    }
    
    public boolean hasTuStatus()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTuStatus()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "pearlChain"
    public BasicPearlChain getPearlChain()
    {
	return (BasicPearlChain)mComponents[7];
    }
    
    public void setPearlChain(BasicPearlChain pearlChain)
    {
	mComponents[7] = pearlChain;
    }
    
    public boolean hasPearlChain()
    {
	return componentIsPresent(7);
    }
    
    public void deletePearlChain()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "lastGPSTimeStamp"
    public TimeStamp getLastGPSTimeStamp()
    {
	return (TimeStamp)mComponents[8];
    }
    
    public void setLastGPSTimeStamp(TimeStamp lastGPSTimeStamp)
    {
	mComponents[8] = lastGPSTimeStamp;
    }
    
    public boolean hasLastGPSTimeStamp()
    {
	return componentIsPresent(8);
    }
    
    public void deleteLastGPSTimeStamp()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "vin"
    public VIN getVin()
    {
	return (VIN)mComponents[9];
    }
    
    public void setVin(VIN vin)
    {
	mComponents[9] = vin;
    }
    
    public boolean hasVin()
    {
	return componentIsPresent(9);
    }
    
    public void deleteVin()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "navigationInformation"
    public NavigationInformation getNavigationInformation()
    {
	return (NavigationInformation)mComponents[10];
    }
    
    public void setNavigationInformation(NavigationInformation navigationInformation)
    {
	mComponents[10] = navigationInformation;
    }
    
    public boolean hasNavigationInformation()
    {
	return componentIsPresent(10);
    }
    
    public void deleteNavigationInformation()
    {
	setComponentAbsent(10);
    }
    
    
    // Methods for field "memoryStatus"
    public POIMemoryStatus getMemoryStatus()
    {
	return (POIMemoryStatus)mComponents[11];
    }
    
    public void setMemoryStatus(POIMemoryStatus memoryStatus)
    {
	mComponents[11] = memoryStatus;
    }
    
    public boolean hasMemoryStatus()
    {
	return componentIsPresent(11);
    }
    
    public void deleteMemoryStatus()
    {
	setComponentAbsent(11);
    }
    
    
    // Methods for field "vehiclePropulsionType"
    public VehiclePropulsionType getVehiclePropulsionType()
    {
	return (VehiclePropulsionType)mComponents[12];
    }
    
    public void setVehiclePropulsionType(VehiclePropulsionType vehiclePropulsionType)
    {
	mComponents[12] = vehiclePropulsionType;
    }
    
    public boolean hasVehiclePropulsionType()
    {
	return componentIsPresent(12);
    }
    
    public void deleteVehiclePropulsionType()
    {
	setComponentAbsent(12);
    }
    
    
    // Methods for field "crashData"
    public CrashInformation getCrashData()
    {
	return (CrashInformation)mComponents[13];
    }
    
    public void setCrashData(CrashInformation crashData)
    {
	mComponents[13] = crashData;
    }
    
    public boolean hasCrashData()
    {
	return componentIsPresent(13);
    }
    
    public void deleteCrashData()
    {
	setComponentAbsent(13);
    }
    
    
    // Methods for field "remoteOperationResponse"
    public RemoteOperationResponseList getRemoteOperationResponse()
    {
	return (RemoteOperationResponseList)mComponents[14];
    }
    
    public void setRemoteOperationResponse(RemoteOperationResponseList remoteOperationResponse)
    {
	mComponents[14] = remoteOperationResponse;
    }
    
    public boolean hasRemoteOperationResponse()
    {
	return componentIsPresent(14);
    }
    
    public void deleteRemoteOperationResponse()
    {
	setComponentAbsent(14);
    }
    
    
    // Methods for field "genericText"
    public GenericText getGenericText()
    {
	return (GenericText)mComponents[15];
    }
    
    public void setGenericText(GenericText genericText)
    {
	mComponents[15] = genericText;
    }
    
    public boolean hasGenericText()
    {
	return componentIsPresent(15);
    }
    
    public void deleteGenericText()
    {
	setComponentAbsent(15);
    }
    
    
    // Methods for field "genericParameters"
    public GenericParameters getGenericParameters()
    {
	return (GenericParameters)mComponents[16];
    }
    
    public void setGenericParameters(GenericParameters genericParameters)
    {
	mComponents[16] = genericParameters;
    }
    
    public boolean hasGenericParameters()
    {
	return componentIsPresent(16);
    }
    
    public void deleteGenericParameters()
    {
	setComponentAbsent(16);
    }
    
    
    
    /**
     * Define the ASN1 Type GenericParameters from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class GenericParameters extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public GenericParameters()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public GenericParameters(GenericParameter[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(GenericParameter element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(GenericParameter element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized GenericParameter get(int atIndex)
	{
	    return (GenericParameter)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(GenericParameter element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(GenericParameter element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new GenericParameter();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8010
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$GenericParameters"
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
			new com.oss.asn1.INTEGER(255),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(255)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "GenericParameter"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' GenericParameters object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' GenericParameters object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for GenericParameters

    // Methods for field "trigger"
    public Trigger getTrigger()
    {
	return (Trigger)mComponents[17];
    }
    
    public void setTrigger(Trigger trigger)
    {
	mComponents[17] = trigger;
    }
    
    public boolean hasTrigger()
    {
	return componentIsPresent(17);
    }
    
    public void deleteTrigger()
    {
	setComponentAbsent(17);
    }
    
    
    
    /**
     * Define the ASN1 Type Trigger from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Trigger extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Trigger()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Trigger(TriggerType[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TriggerType element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TriggerType element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TriggerType get(int atIndex)
	{
	    return (TriggerType)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TriggerType element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TriggerType element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return TriggerType.eCallButton;
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8011
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$Trigger"
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
			new com.oss.asn1.INTEGER(15),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(15)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "TriggerType"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Trigger object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Trigger object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Trigger

    // Methods for field "alerts"
    public Alerts getAlerts()
    {
	return (Alerts)mComponents[18];
    }
    
    public void setAlerts(Alerts alerts)
    {
	mComponents[18] = alerts;
    }
    
    public boolean hasAlerts()
    {
	return componentIsPresent(18);
    }
    
    public void deleteAlerts()
    {
	setComponentAbsent(18);
    }
    
    
    
    /**
     * Define the ASN1 Type Alerts from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Alerts extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Alerts()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Alerts(AlertType[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(AlertType element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(AlertType element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized AlertType get(int atIndex)
	{
	    return (AlertType)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(AlertType element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(AlertType element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new AlertType();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8012
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$Alerts"
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
			new com.oss.asn1.INTEGER(15),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(15)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "AlertType"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Alerts object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Alerts object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Alerts

    // Methods for field "trackpoints"
    public Trackpoints getTrackpoints()
    {
	return (Trackpoints)mComponents[19];
    }
    
    public void setTrackpoints(Trackpoints trackpoints)
    {
	mComponents[19] = trackpoints;
    }
    
    public boolean hasTrackpoints()
    {
	return componentIsPresent(19);
    }
    
    public void deleteTrackpoints()
    {
	setComponentAbsent(19);
    }
    
    
    
    /**
     * Define the ASN1 Type Trackpoints from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Trackpoints extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Trackpoints()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Trackpoints(TrackPoint[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(TrackPoint element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(TrackPoint element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized TrackPoint get(int atIndex)
	{
	    return (TrackPoint)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(TrackPoint element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(TrackPoint element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new TrackPoint();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8013
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$Trackpoints"
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
			new com.oss.asn1.INTEGER(127),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(127)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "TrackPoint"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Trackpoints object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Trackpoints object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Trackpoints

    // Methods for field "journeys"
    public Journeys getJourneys()
    {
	return (Journeys)mComponents[20];
    }
    
    public void setJourneys(Journeys journeys)
    {
	mComponents[20] = journeys;
    }
    
    public boolean hasJourneys()
    {
	return componentIsPresent(20);
    }
    
    public void deleteJourneys()
    {
	setComponentAbsent(20);
    }
    
    
    
    /**
     * Define the ASN1 Type Journeys from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class Journeys extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public Journeys()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Journeys(JourneySummary[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(JourneySummary element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(JourneySummary element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized JourneySummary get(int atIndex)
	{
	    return (JourneySummary)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(JourneySummary element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(JourneySummary element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new JourneySummary();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8014
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$Journeys"
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
			new com.oss.asn1.INTEGER(127),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(127)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "JourneySummary"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Journeys object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Journeys object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Journeys

    // Methods for field "msdInfo"
    public MSDInformation getMsdInfo()
    {
	return (MSDInformation)mComponents[21];
    }
    
    public void setMsdInfo(MSDInformation msdInfo)
    {
	mComponents[21] = msdInfo;
    }
    
    public boolean hasMsdInfo()
    {
	return componentIsPresent(21);
    }
    
    public void deleteMsdInfo()
    {
	setComponentAbsent(21);
    }
    
    
    // Methods for field "debugInfo"
    public DebugInfo getDebugInfo()
    {
	return (DebugInfo)mComponents[22];
    }
    
    public void setDebugInfo(DebugInfo debugInfo)
    {
	mComponents[22] = debugInfo;
    }
    
    public boolean hasDebugInfo()
    {
	return componentIsPresent(22);
    }
    
    public void deleteDebugInfo()
    {
	setComponentAbsent(22);
    }
    
    
    
    /**
     * Define the ASN1 Type DebugInfo from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class DebugInfo extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public DebugInfo()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public DebugInfo(net.sirun.ngtp.ngtp_service_data.DebugInfo[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(net.sirun.ngtp.ngtp_service_data.DebugInfo element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(net.sirun.ngtp.ngtp_service_data.DebugInfo element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized net.sirun.ngtp.ngtp_service_data.DebugInfo get(int atIndex)
	{
	    return (net.sirun.ngtp.ngtp_service_data.DebugInfo)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(net.sirun.ngtp.ngtp_service_data.DebugInfo element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(net.sirun.ngtp.ngtp_service_data.DebugInfo element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new net.sirun.ngtp.ngtp_service_data.DebugInfo();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8016
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$DebugInfo"
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
			new com.oss.asn1.INTEGER(10),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(10)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "DebugInfo"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' DebugInfo object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' DebugInfo object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for DebugInfo

    // Methods for field "errorCodes"
    public ErrorCodes getErrorCodes()
    {
	return (ErrorCodes)mComponents[23];
    }
    
    public void setErrorCodes(ErrorCodes errorCodes)
    {
	mComponents[23] = errorCodes;
    }
    
    public boolean hasErrorCodes()
    {
	return componentIsPresent(23);
    }
    
    public void deleteErrorCodes()
    {
	setComponentAbsent(23);
    }
    
    
    
    /**
     * Define the ASN1 Type ErrorCodes from ASN1 Module NGTP_Service_Data.
     * @see SequenceOf
     */
    public static class ErrorCodes extends SequenceOf {
	
	/**
	 * The default constructor.
	 */
	public ErrorCodes()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public ErrorCodes(ErrorCode[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Add an Element to the SEQUENCE OF/SET OF.
	 */
	public synchronized void add(ErrorCode element)
	{
	    super.addElement(element);
	}
	
	/**
	 * Set an Element in the SEQUENCE OF/SET OF.
	 */
	public synchronized void set(ErrorCode element, int atIndex)
	{
	    super.setElement(element, atIndex);
	}
	
	/**
	 * Get an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized ErrorCode get(int atIndex)
	{
	    return (ErrorCode)super.getElement(atIndex);
	}
	
	/**
	 * Insert an Element into the SEQUENCE OF/SET OF.
	 */
	public synchronized void insert(ErrorCode element, int atIndex)
	{
	    super.insertElement(element, atIndex);
	}
	
	/**
	 * Remove an Element from the SEQUENCE OF/SET OF.
	 */
	public synchronized void remove(ErrorCode element)
	{
	    super.removeElement(element);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new ErrorCode();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8017
		}
	    ),
	    new QName (
		"net.sirun.ngtp.ngtp_service_data",
		"NGTPUplinkCore$ErrorCodes"
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
			new com.oss.asn1.INTEGER(255),
			0
		    )
		)
	    ),
	    new Bounds (
		new java.lang.Long(0),
		new java.lang.Long(255)
	    ),
	    new TypeInfoRef (
		new QName (
		    "net.sirun.ngtp.ngtp_service_data",
		    "ErrorCode"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' ErrorCodes object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' ErrorCodes object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for ErrorCodes

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
	    "NGTPUplinkCore"
	),
	new QName (
	    "NGTP-Service-Data",
	    "NGTPUplinkCore"
	),
	12318,
	null,
	new Fields (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"ExtendedPosition"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ExtendedPosition"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ExtendedPosition"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ExtendedPosition"
				)
			    ),
			    0
			)
		    ),
		    "positionExtension",
		    0,
		    3,
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
				"BasicVehicleStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicVehicleStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicVehicleStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "BasicVehicleStatus"
				)
			    ),
			    0
			)
		    ),
		    "vehicleStatus",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ExtendedVehicleStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ExtendedVehicleStatus"
				)
			    ),
			    0
			)
		    ),
		    "extendedVehicleStatus",
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
				"DashboardStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"DashboardStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DashboardStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "DashboardStatus"
				)
			    ),
			    0
			)
		    ),
		    "dashboardStatus",
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
				"ElectricVehicleStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ElectricVehicleStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ElectricVehicleStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ElectricVehicleStatus"
				)
			    ),
			    0
			)
		    ),
		    "electricVehicleStatus",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"ClimateStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"ClimateStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ClimateStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "ClimateStatus"
				)
			    ),
			    0
			)
		    ),
		    "climateStatus",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"TelematicUnitStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"TelematicUnitStatus"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TelematicUnitStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "TelematicUnitStatus"
				)
			    ),
			    0
			)
		    ),
		    "tuStatus",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"BasicPearlChain"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"BasicPearlChain"
			    ),
			    12314,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new com.oss.asn1.INTEGER(1), 
					new com.oss.asn1.INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				new java.lang.Long(1),
				new java.lang.Long(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "FullPosition"
				)
			    )
			)
		    ),
		    "pearlChain",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
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
		    "lastGPSTimeStamp",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"VIN"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"VIN"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "VIN"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "VIN"
				)
			    ),
			    0
			)
		    ),
		    "vin",
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
				"NavigationInformation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"NavigationInformation"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NavigationInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "NavigationInformation"
				)
			    ),
			    0
			)
		    ),
		    "navigationInformation",
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
				"POIMemoryStatus"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"POIMemoryStatus"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "POIMemoryStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "POIMemoryStatus"
				)
			    ),
			    0
			)
		    ),
		    "memoryStatus",
		    11,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"VehiclePropulsionType"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"VehiclePropulsionType"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "VehiclePropulsionType"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "VehiclePropulsionType"
				)
			    ),
			    0
			)
		    ),
		    "vehiclePropulsionType",
		    12,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"CrashInformation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"CrashInformation"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "CrashInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "CrashInformation"
				)
			    ),
			    0
			)
		    ),
		    "crashData",
		    13,
		    3,
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
				"RemoteOperationResponseList"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"RemoteOperationResponseList"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "RemoteOperationResponseList"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "RemoteOperationResponseList"
				)
			    ),
			    0
			)
		    ),
		    "remoteOperationResponse",
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
				"GenericText"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"GenericText"
			    ),
			    12314,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GenericText"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "GenericText"
				)
			    ),
			    0
			)
		    ),
		    "genericText",
		    15,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$GenericParameters"
			)
		    ),
		    "genericParameters",
		    16,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$Trigger"
			)
		    ),
		    "trigger",
		    17,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$Alerts"
			)
		    ),
		    "alerts",
		    18,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$Trackpoints"
			)
		    ),
		    "trackpoints",
		    19,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$Journeys"
			)
		    ),
		    "journeys",
		    20,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8015
				}
			    ),
			    new QName (
				"net.sirun.ngtp.ngtp_service_data",
				"MSDInformation"
			    ),
			    new QName (
				"NGTP-Service-Data",
				"MSDInformation"
			    ),
			    12318,
			    null,
			    new FieldsRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "MSDInformation"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "net.sirun.ngtp.ngtp_service_data",
				    "MSDInformation"
				)
			    ),
			    0
			)
		    ),
		    "msdInfo",
		    21,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$DebugInfo"
			)
		    ),
		    "debugInfo",
		    22,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "net.sirun.ngtp.ngtp_service_data",
			    "NGTPUplinkCore$ErrorCodes"
			)
		    ),
		    "errorCodes",
		    23,
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
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
			new TagDecoderElement((short)0x8017, 23)
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
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
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
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8010, 16),
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8011, 17),
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8012, 18),
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8013, 19),
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8014, 20),
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8015, 21),
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8016, 22),
			new TagDecoderElement((short)0x8017, 23)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8017, 23)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' NGTPUplinkCore object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' NGTPUplinkCore object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for NGTPUplinkCore
