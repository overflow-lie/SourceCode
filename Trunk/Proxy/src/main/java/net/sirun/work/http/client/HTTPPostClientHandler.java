/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package net.sirun.work.http.client;

import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;

import java.util.logging.Logger;

/**
 * Handler that just dumps the contents of the response from the server
 */
public class HTTPPostClientHandler extends
		SimpleChannelInboundHandler<HttpObject> {

	private static final Logger logger = Logger
			.getLogger(HTTPPostClientHandler.class.getName());

	private boolean readingChunks;

	@Override
	public void channelRead0(ChannelHandlerContext ctx, HttpObject msg)
			throws Exception {
		System.out.println("callback:"+ctx.channel().toString());
		
		System.out.println(".<-");
		StringBuffer sb = new StringBuffer();
		if (msg instanceof HttpResponse) {
			HttpResponse response = (HttpResponse) msg;
			System.out.println(response.getStatus());

			logger.info("收到返回消息  STATUS: " + response.getStatus() + "VERSION: "
					+ response.getProtocolVersion());
			if (!response.headers().isEmpty()) {
				for (String name : response.headers().names()) {
					for (String value : response.headers().getAll(name)) {
						sb.append("HEADER: " + name + " = " + value+"\n");
					}
				}
			}
		

			if (response.getStatus().code() == 200
					&& HttpHeaders.isTransferEncodingChunked(response)) {
				readingChunks = true;
				sb.append("CHUNKED CONTENT {");
			} else {
				sb.append("CONTENT {");
			}
//			logger.info(sb.toString());
		}
		if (msg instanceof HttpContent) {
			HttpContent chunk = (HttpContent) msg;

			
//			logger.info(chunk.content().toString(CharsetUtil.UTF_8));
			 
		}
		ctx.close().addListener(ChannelFutureListener.CLOSE);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		cause.printStackTrace();
		ctx.channel().close();
	}
}
