package net.sirun.bean;
/**
 * 对使用GetAllDown 返回的接口的封装
 * @author jnad
 *
 */
public class GetALLDownlinkBean {
	
	
	
	private String eventID;
	private String messageID;
	private String serviceType;
	public String getEventID() {
		return eventID;
	}
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	

}
