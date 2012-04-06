package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.PosterChannel;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.huabao.channel.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HuabaoChannelGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7157364365372538673L;

	/** 
	 * 频道信息
	 */
	@ApiField("channel")
	private PosterChannel channel;

	public void setChannel(PosterChannel channel) {
		this.channel = channel;
	}
	public PosterChannel getChannel( ) {
		return this.channel;
	}

}
