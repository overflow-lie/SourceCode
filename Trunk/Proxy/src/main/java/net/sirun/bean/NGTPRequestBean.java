package net.sirun.bean;

public class NGTPRequestBean {
	
	//车辆识别码
	private String vehicleIdentifier;
	//车辆识别类型
	//0=VIN, 1=DriveId, 2=EquipmentId,3=EquipmentSerial
	private String vehicleIdentifierType;
	private NGTPMessageBean ngtpMessage;
	
	//错误代码
	private int errorCode;
	//错误信息
	private String errorContent;
	
	public void initNGTPRequestBean(){
		ngtpMessage= new NGTPMessageBean();
	}
	public String getVehicleIdentifier() {
		return vehicleIdentifier;
	}
	public void setVehicleIdentifier(String vehicleIdentifier) {
		this.vehicleIdentifier = vehicleIdentifier;
	}
	public String getVehicleIdentifierType() {
		return vehicleIdentifierType;
	}
	public void setVehicleIdentifierType(String vehicleIdentifierType) {
		this.vehicleIdentifierType = vehicleIdentifierType;
	}
	public NGTPMessageBean getNgtpMessage() {
		return ngtpMessage;
	}
	public void setNgtpMessage(NGTPMessageBean ngtpMessage) {
		this.ngtpMessage = ngtpMessage;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorContent() {
		return errorContent;
	}
	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	
	
	
	
	
	

}
