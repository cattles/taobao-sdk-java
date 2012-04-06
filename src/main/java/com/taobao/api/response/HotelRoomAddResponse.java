package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Room;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.room.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4869556276814978244L;

	/** 
	 * 商品结构
	 */
	@ApiField("room")
	private Room room;

	public void setRoom(Room room) {
		this.room = room;
	}
	public Room getRoom( ) {
		return this.room;
	}

}
