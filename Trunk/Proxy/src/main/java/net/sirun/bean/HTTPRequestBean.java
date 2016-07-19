package net.sirun.bean;

import io.netty.handler.codec.http.HttpMethod;

import java.util.List;
import java.util.Map.Entry;

public class HTTPRequestBean {

	private String uri;
	private List<Entry<String, String>> cookies;
	private List<Entry<String, String>> headers;
	private List<Entry<String, String>> postAttribute;
	private HttpMethod httpMethod;
	private int pool;

	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}

	public int getPool() {
		return pool;
	}

	public void setPool(int pool) {
		this.pool = pool;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public List<Entry<String, String>> getCookies() {
		return cookies;
	}

	public void setCookies(List<Entry<String, String>> cookies) {
		this.cookies = cookies;
	}

	public List<Entry<String, String>> getHeaders() {
		return headers;
	}

	public void setHeaders(List<Entry<String, String>> headers) {
		this.headers = headers;
	}

	public List<Entry<String, String>> getPostAttribute() {
		return postAttribute;
	}

	public void setPostAttribute(List<Entry<String, String>> postAttribute) {
		this.postAttribute = postAttribute;
	}

}
