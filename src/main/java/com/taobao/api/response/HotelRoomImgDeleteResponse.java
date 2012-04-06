package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.RoomImage;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.room.img.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelRoomImgDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3567677445291448448L;

	/** 
	 * 商品图片结构
	 */
	@ApiField("room_image")
	private RoomImage roomImage;

	public void setRoomImage(RoomImage roomImage) {
		this.roomImage = roomImage;
	}
	public RoomImage getRoomImage( ) {
		return this.roomImage;
	}

}
