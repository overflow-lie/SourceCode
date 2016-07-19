package net.sirun.work.http.client;

import io.netty.handler.codec.http.ClientCookieEncoder;
import io.netty.handler.codec.http.Cookie;
import io.netty.handler.codec.http.HttpHeaders;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class HTTPClientDefend {
	/**
	 * 获取默认的Headers
	 * */

	public static final List<Entry<String, String>> getDefaultHeaders(
			String host, List<Entry<String, String>> cookies) {
		List<Entry<String, String>> headers = new LinkedList<Entry<String, String>>();
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.HOST, host));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.CONNECTION, HttpHeaders.Values.CLOSE));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT_ENCODING, HttpHeaders.Values.GZIP
						+ ',' + HttpHeaders.Values.DEFLATE));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT_CHARSET, "utf-8;q=0.7,*;q=0.7"));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT_LANGUAGE,
				"zh-CN,zh;q=0.8,en-US;q=0.6,en;q=0.4"));
		// 伪装chrome 30版本 浏览器
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.USER_AGENT,
				"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1588.0 Safari/537.36"));
		headers.add(new AbstractMap.SimpleEntry<String, String>(
				HttpHeaders.Names.ACCEPT,
				"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"));

		if (cookies != null) {
			for (Entry<String, String> e : cookies) {
				headers.add(new AbstractMap.SimpleEntry<String, String>(
						HttpHeaders.Names.COOKIE, ClientCookieEncoder.encode(
								e.getKey(), e.getKey())));
			}
		}

		return headers;
	}

	/**
	 * 获取默认的Headers
	 * */
	public static final List<Entry<String, String>> getDefaultHeaders(
			String host) {
		return getDefaultHeaders(host, null);
	}
}
