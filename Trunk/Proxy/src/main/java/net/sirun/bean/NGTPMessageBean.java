package net.sirun.bean;

import net.sirun.ngtp.ngtp_dispatch.NGTPDispatcherData;
import net.sirun.ngtp.ngtp_service_data.NGTPServiceData;

public class NGTPMessageBean {
	
	private  byte[] ngtpmessage;
	private byte[] byte_ngtpmessage;
	
	//传输协议版本号
	private byte[] transportHeaderVersion;
	//消息编号 1-255随机
	private byte[] messageID;
	//Segment
	private byte[] Segment;
	
	
	
	private byte[] ProtocolVersion;
	private byte[] SecurityContext;
	private byte[] ngtpHeaderLength;
	private byte[] ngtpHeaderEncoding;
	
	
	private byte[] ngtpDispatcherDataUnencryp;
	private byte[] ngtpDispatcherData;
	
	private NGTPDispatcherData o_ngtpDispatcherData;
	private NGTPServiceData o_ngtpServiceData;

	
	private byte[] ngtpDispatcherSignature;
	
	private byte[] ngtpServiceData;
	
	private byte[] ngtpMessageSignature;
	
	private NGTPDispatcherData per_ngtpDispatcherData;
	private NGTPServiceData per_ngtpServiceData;
	public byte[] getNgtpmessage() {
		return ngtpmessage;
	}
	public void setNgtpmessage(byte[] ngtpmessage) {
		this.ngtpmessage = ngtpmessage;
	}
	public byte[] getByte_ngtpmessage() {
		return byte_ngtpmessage;
	}
	public void setByte_ngtpmessage(byte[] byte_ngtpmessage) {
		this.byte_ngtpmessage = byte_ngtpmessage;
	}
	public byte[] getTransportHeaderVersion() {
		return transportHeaderVersion;
	}
	
	
	public NGTPDispatcherData getO_ngtpDispatcherData() {
		return o_ngtpDispatcherData;
	}
	public void setO_ngtpDispatcherData(NGTPDispatcherData o_ngtpDispatcherData) {
		this.o_ngtpDispatcherData = o_ngtpDispatcherData;
	}
	public NGTPServiceData getO_ngtpServiceData() {
		return o_ngtpServiceData;
	}
	public void setO_ngtpServiceData(NGTPServiceData o_ngtpServiceData) {
		this.o_ngtpServiceData = o_ngtpServiceData;
	}
	public void setTransportHeaderVersion(byte[] transportHeaderVersion) {
		this.transportHeaderVersion = transportHeaderVersion;
	}
	public byte[] getMessageID() {
		return messageID;
	}
	public void setMessageID(byte[] messageID) {
		this.messageID = messageID;
	}
	public byte[] getSegment() {
		return Segment;
	}
	public void setSegment(byte[] segment) {
		Segment = segment;
	}
	public byte[] getProtocolVersion() {
		return ProtocolVersion;
	}
	public void setProtocolVersion(byte[] protocolVersion) {
		ProtocolVersion = protocolVersion;
	}
	public byte[] getSecurityContext() {
		return SecurityContext;
	}
	public void setSecurityContext(byte[] securityContext) {
		SecurityContext = securityContext;
	}
	public byte[] getNgtpHeaderLength() {
		return ngtpHeaderLength;
	}
	public void setNgtpHeaderLength(byte[] ngtpHeaderLength) {
		this.ngtpHeaderLength = ngtpHeaderLength;
	}
	public byte[] getNgtpHeaderEncoding() {
		return ngtpHeaderEncoding;
	}
	public void setNgtpHeaderEncoding(byte[] ngtpHeaderEncoding) {
		this.ngtpHeaderEncoding = ngtpHeaderEncoding;
	}
	public byte[] getNgtpDispatcherDataUnencryp() {
		return ngtpDispatcherDataUnencryp;
	}
	public void setNgtpDispatcherDataUnencryp(byte[] ngtpDispatcherDataUnencryp) {
		this.ngtpDispatcherDataUnencryp = ngtpDispatcherDataUnencryp;
	}
	public byte[] getNgtpDispatcherData() {
		return ngtpDispatcherData;
	}
	public void setNgtpDispatcherData(byte[] ngtpDispatcherData) {
		this.ngtpDispatcherData = ngtpDispatcherData;
	}
	public byte[] getNgtpDispatcherSignature() {
		return ngtpDispatcherSignature;
	}
	public void setNgtpDispatcherSignature(byte[] ngtpDispatcherSignature) {
		this.ngtpDispatcherSignature = ngtpDispatcherSignature;
	}
	public byte[] getNgtpServiceData() {
		return ngtpServiceData;
	}
	public void setNgtpServiceData(byte[] ngtpServiceData) {
		this.ngtpServiceData = ngtpServiceData;
	}
	public byte[] getNgtpMessageSignature() {
		return ngtpMessageSignature;
	}
	public void setNgtpMessageSignature(byte[] ngtpMessageSignature) {
		this.ngtpMessageSignature = ngtpMessageSignature;
	}
	public NGTPDispatcherData getPer_ngtpDispatcherData() {
		return per_ngtpDispatcherData;
	}
	public void setPer_ngtpDispatcherData(NGTPDispatcherData per_ngtpDispatcherData) {
		this.per_ngtpDispatcherData = per_ngtpDispatcherData;
	}
	public NGTPServiceData getPer_ngtpServiceData() {
		return per_ngtpServiceData;
	}
	public void setPer_ngtpServiceData(NGTPServiceData per_ngtpServiceData) {
		this.per_ngtpServiceData = per_ngtpServiceData;
	}
	
 
}
