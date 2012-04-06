package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.hotel.room.add request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class HotelRoomAddRequest implements TaobaoUploadRequest<HotelRoomAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 面积。可选值：A,B,C,D。分别代表：
A：15平米以下，B：16－30平米，C：31－50平米，D：50平米以上
	 */
	private String area;

	/** 
	* 宽带服务。A,B,C,D。分别代表：
A：无宽带，B：免费宽带，C：收费宽带，D：部分收费宽带
	 */
	private String bbn;

	/** 
	* 床型。可选值：A,B,C,D,E,F,G,H,I。分别代表：A：单人床，B：大床，C：双床，D：双床/大床，E：子母床，F：上下床，G：圆形床，H：多床，I：其他床型
	 */
	private String bedType;

	/** 
	* 早餐。A,B,C,D,E。分别代表：
A：无早，B：单早，C：双早，D：三早，E：多早
	 */
	private String breakfast;

	/** 
	* 订金。0～99999900的正整数。在payment_type为订金时必须输入，存储的单位是分。不能带角分。
	 */
	private Long deposit;

	/** 
	* 商品描述。不能超过25000个汉字（50000个字符）。
	 */
	private String desc;

	/** 
	* 手续费。0～99999900的正整数。在payment_type为手续费或手续费/间夜时必须输入，存储的单位是分。不能带角分。
	 */
	private Long fee;

	/** 
	* 购买须知。不能超过4000个汉字（8000个字符）。
	 */
	private String guide;

	/** 
	* 酒店id。必须为数字。
	 */
	private Long hid;

	/** 
	* 支付类型。可选值：A,B,C,D。分别代表：
A：全额支付，B：手续费，C：订金，D：手续费/间夜
	 */
	private String paymentType;

	/** 
	* 酒店商品图片。类型:JPG,GIF;最大长度:500K。支持的文件类型：gif,jpg,jpeg,png。发布的时候只能发布一张图片。如需再发图片，需要调用商品图片上传接口，1个商品最多5张图片。
	 */
	private FileItem pic;

	/** 
	* 房型id。必须为数字。
	 */
	private Long rid;

	/** 
	* 房态信息。可以传今天开始90天内的房态信息。日期必须连续。JSON格式传递。
date：代表房态日期，格式为YYYY-MM-DD，
price：代表当天房价，0～99999900，存储的单位是分，不能带角分
num：代表当天可售间数，0～999。
如：
[{"date":2011-01-28,"price":10000, "num":10},{"date":2011-01-29,"price":12000,"num":10}]
	 */
	private String roomQuotas;

	/** 
	* 设施服务。JSON格式。
value值true有此服务，false没有。
bar：吧台，catv：有线电视，ddd：国内长途电话，idd：国际长途电话，toilet：独立卫生间，pubtoliet：公共卫生间。
如：
{"bar":false,"catv":false,"ddd":false,"idd":false,"pubtoilet":false,"toilet":false}
	 */
	private String service;

	/** 
	* 床宽。可选值：A,B,C,D,E,F,G,H。分别代表：A：1米及以下，B：1.1米，C：1.2米，D：1.35米，E：1.5米，F：1.8米，G：2米，H：2.2米及以上
	 */
	private String size;

	/** 
	* 楼层。长度不超过8
	 */
	private String storey;

	/** 
	* 酒店商品名称。不能超过60字节
	 */
	private String title;

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setBbn(String bbn) {
		this.bbn = bbn;
	}
	public String getBbn() {
		return this.bbn;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public String getBedType() {
		return this.bedType;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getBreakfast() {
		return this.breakfast;
	}

	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}
	public Long getDeposit() {
		return this.deposit;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return this.desc;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}
	public Long getFee() {
		return this.fee;
	}

	public void setGuide(String guide) {
		this.guide = guide;
	}
	public String getGuide() {
		return this.guide;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}
	public Long getHid() {
		return this.hid;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPic(FileItem pic) {
		this.pic = pic;
	}
	public FileItem getPic() {
		return this.pic;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}
	public Long getRid() {
		return this.rid;
	}

	public void setRoomQuotas(String roomQuotas) {
		this.roomQuotas = roomQuotas;
	}
	public String getRoomQuotas() {
		return this.roomQuotas;
	}

	public void setService(String service) {
		this.service = service;
	}
	public String getService() {
		return this.service;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return this.size;
	}

	public void setStorey(String storey) {
		this.storey = storey;
	}
	public String getStorey() {
		return this.storey;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.hotel.room.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("bbn", this.bbn);
		txtParams.put("bed_type", this.bedType);
		txtParams.put("breakfast", this.breakfast);
		txtParams.put("deposit", this.deposit);
		txtParams.put("desc", this.desc);
		txtParams.put("fee", this.fee);
		txtParams.put("guide", this.guide);
		txtParams.put("hid", this.hid);
		txtParams.put("payment_type", this.paymentType);
		txtParams.put("rid", this.rid);
		txtParams.put("room_quotas", this.roomQuotas);
		txtParams.put("service", this.service);
		txtParams.put("size", this.size);
		txtParams.put("storey", this.storey);
		txtParams.put("title", this.title);
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

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("pic", this.pic);
		return params;
	}

	public Class<HotelRoomAddResponse> getResponseClass() {
		return HotelRoomAddResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxLength(area,1,"area");
		RequestCheckUtils.checkMaxLength(bbn,1,"bbn");
		RequestCheckUtils.checkNotEmpty(bedType,"bedType");
		RequestCheckUtils.checkMaxLength(bedType,1,"bedType");
		RequestCheckUtils.checkNotEmpty(breakfast,"breakfast");
		RequestCheckUtils.checkMaxLength(breakfast,1,"breakfast");
		RequestCheckUtils.checkMaxValue(deposit,99999900L,"deposit");
		RequestCheckUtils.checkMinValue(deposit,0L,"deposit");
		RequestCheckUtils.checkNotEmpty(desc,"desc");
		RequestCheckUtils.checkMaxLength(desc,50000,"desc");
		RequestCheckUtils.checkMaxValue(fee,99999900L,"fee");
		RequestCheckUtils.checkMinValue(fee,0L,"fee");
		RequestCheckUtils.checkNotEmpty(guide,"guide");
		RequestCheckUtils.checkMaxLength(guide,8000,"guide");
		RequestCheckUtils.checkNotEmpty(hid,"hid");
		RequestCheckUtils.checkNotEmpty(paymentType,"paymentType");
		RequestCheckUtils.checkMaxLength(paymentType,1,"paymentType");
		RequestCheckUtils.checkNotEmpty(pic,"pic");
		RequestCheckUtils.checkMaxLength(pic,512000,"pic");
		RequestCheckUtils.checkNotEmpty(rid,"rid");
		RequestCheckUtils.checkNotEmpty(roomQuotas,"roomQuotas");
		RequestCheckUtils.checkMaxLength(size,1,"size");
		RequestCheckUtils.checkMaxLength(storey,8,"storey");
		RequestCheckUtils.checkNotEmpty(title,"title");
		RequestCheckUtils.checkMaxLength(title,60,"title");
	}
}
