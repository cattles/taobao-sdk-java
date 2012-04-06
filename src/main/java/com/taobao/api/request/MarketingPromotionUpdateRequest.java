package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.marketing.promotion.update request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class MarketingPromotionUpdateRequest implements TaobaoRequest<MarketingPromotionUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 减价件数。只有discount_type=PRICE有效，1只减一件，0表示多件，不为1的其他数字都作0处理；discount_type=DISCOUNT该参数无效。
	 */
	private Long decreaseNum;

	/** 
	* 折扣类型，可选PRICE(优惠价格)和DISCOUNT(折扣)，填写其它值返回错误
	 */
	private String discountType;

	/** 
	* 优惠额度，若优惠类型为折扣（DISCOUNT），则传入该商品的折扣比例，有效值范围：0.01-9.99，支持小数点后2位。若优惠类型为优惠价格(PRICE)，传入该商品的优惠价，单位：元，支持小数点后2位
	 */
	private String discountValue;

	/** 
	* 优惠结束时间
	 */
	private Date endDate;

	/** 
	* 活动描述，最多30个字符
	 */
	private String promotionDesc;

	/** 
	* 优惠ID
	 */
	private Long promotionId;

	/** 
	* 活动名称，最多5个字符
	 */
	private String promotionTitle;

	/** 
	* 优惠开始时间
	 */
	private Date startDate;

	/** 
	* 标签ID
	 */
	private Long tagId;

	public void setDecreaseNum(Long decreaseNum) {
		this.decreaseNum = decreaseNum;
	}
	public Long getDecreaseNum() {
		return this.decreaseNum;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getDiscountType() {
		return this.discountType;
	}

	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}
	public String getDiscountValue() {
		return this.discountValue;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate() {
		return this.endDate;
	}

	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}
	public String getPromotionDesc() {
		return this.promotionDesc;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}
	public Long getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionTitle(String promotionTitle) {
		this.promotionTitle = promotionTitle;
	}
	public String getPromotionTitle() {
		return this.promotionTitle;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate() {
		return this.startDate;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}
	public Long getTagId() {
		return this.tagId;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.marketing.promotion.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("decrease_num", this.decreaseNum);
		txtParams.put("discount_type", this.discountType);
		txtParams.put("discount_value", this.discountValue);
		txtParams.put("end_date", this.endDate);
		txtParams.put("promotion_desc", this.promotionDesc);
		txtParams.put("promotion_id", this.promotionId);
		txtParams.put("promotion_title", this.promotionTitle);
		txtParams.put("start_date", this.startDate);
		txtParams.put("tag_id", this.tagId);
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

	public Class<MarketingPromotionUpdateResponse> getResponseClass() {
		return MarketingPromotionUpdateResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(discountType,"discountType");
		RequestCheckUtils.checkNotEmpty(discountValue,"discountValue");
		RequestCheckUtils.checkNotEmpty(endDate,"endDate");
		RequestCheckUtils.checkNotEmpty(promotionId,"promotionId");
		RequestCheckUtils.checkNotEmpty(startDate,"startDate");
		RequestCheckUtils.checkNotEmpty(tagId,"tagId");
	}
}
