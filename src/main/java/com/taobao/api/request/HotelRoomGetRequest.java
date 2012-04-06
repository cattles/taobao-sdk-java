package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.hotel.room.get request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class HotelRoomGetRequest implements TaobaoRequest<HotelRoomGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 酒店房间商品gid。必须为数字。
	 */
	private Long gid;

	/** 
	* 是否需要返回该商品的酒店信息。可选值：true，false。
	 */
	private Boolean needHotel;

	/** 
	* 是否需要返回该商品的宝贝描述。可选值：true，false。
	 */
	private Boolean needRoomDesc;

	/** 
	* 是否需要返回该商品的房态列表。可选值：true，false。
	 */
	private Boolean needRoomQuotas;

	/** 
	* 是否需要返回该商品的房型信息。可选值：true，false。
	 */
	private Boolean needRoomType;

	public void setGid(Long gid) {
		this.gid = gid;
	}
	public Long getGid() {
		return this.gid;
	}

	public void setNeedHotel(Boolean needHotel) {
		this.needHotel = needHotel;
	}
	public Boolean getNeedHotel() {
		return this.needHotel;
	}

	public void setNeedRoomDesc(Boolean needRoomDesc) {
		this.needRoomDesc = needRoomDesc;
	}
	public Boolean getNeedRoomDesc() {
		return this.needRoomDesc;
	}

	public void setNeedRoomQuotas(Boolean needRoomQuotas) {
		this.needRoomQuotas = needRoomQuotas;
	}
	public Boolean getNeedRoomQuotas() {
		return this.needRoomQuotas;
	}

	public void setNeedRoomType(Boolean needRoomType) {
		this.needRoomType = needRoomType;
	}
	public Boolean getNeedRoomType() {
		return this.needRoomType;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("gid", this.gid);
		txtParams.put("need_hotel", this.needHotel);
		txtParams.put("need_room_desc", this.needRoomDesc);
		txtParams.put("need_room_quotas", this.needRoomQuotas);
		txtParams.put("need_room_type", this.needRoomType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<HotelRoomGetResponse> getResponseClass() {
		return HotelRoomGetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(gid,"gid");
	}
}
