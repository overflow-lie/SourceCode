package hoperun.proxyserver.bean;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * @classname: HttpInfo
 * @description: 记录访问Url等信息
 * @author: shemi
 * @version: V1.0
 * @createdate: 22-四月-2015 14:55:16
 */
public class HttpInfo {
	/**
	 * URL信息
	 */
	private String url;
	/**
	 * 请求method
	 */
	private String method;

	private Map<String, String> requestBody;
	/**
	 * 请求的cookies
	 */
	private String requestCookies;

	/**
	 * 内容类型
	 */
	private String contentType;
	/**
	 * 请求字节数
	 */
	private int requestBytes;
	/**
	 * 响应时间
	 */
	private long totalMillis;
	/**
	 * 响应内容
	 */
	private String responseContent;
	/**
	 * 响应字节数
	 */
	private int responseBytesLength;
	/**
	 * 响应Code
	 */
	private int responseCode;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getRequestBytes() {
		return requestBytes;
	}

	public void setRequestBytes(int requestBytes) {
		this.requestBytes = requestBytes;
	}

	public long getTotalMillis() {
		return totalMillis;
	}

	public void setTotalMillis(long totalMillis) {
		this.totalMillis = totalMillis;
	}

	public String getResponseContent() {
		return responseContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getRequestCookies() {
		return requestCookies;
	}

	public void setRequestCookies(String requestCookies) {
		this.requestCookies = requestCookies;
	}

	public int getResponseBytesLength() {
		return responseBytesLength;
	}

	public void setResponseBytesLength(int responseBytesLength) {
		this.responseBytesLength = responseBytesLength;
	}

	public Map<String, String> getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(Map<String, String> requestBody) {
		this.requestBody = requestBody;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
}
