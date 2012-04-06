package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMemberinfoUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.memberinfo.update request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class CrmMemberinfoUpdateRequest implements TaobaoRequest<CrmMemberinfoUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 买家昵称
	 */
	private String buyerNick;

	/** 
	* 城市
	 */
	private String city;

	/** 
	* 会员等级，1：普通客户，2：高级会员，3：高级会员 ，4：至尊vip
	 */
	private Long grade;

	/** 
	* 北京=1,天津=2,河北省=3,山西省=4,内蒙古自治区=5,辽宁省=6,吉林省=7,黑龙江省=8,上海=9,江苏省=10,浙江省=11,安徽省=12,福建省=13,江西省=14,山东省=15,河南省=16,湖北省=17,湖南省=18, 广东省=19,广西壮族自治区=20,海南省=21,重庆=22,四川省=23,贵州省=24,云南省=25,西藏自治区26,陕西省=27,甘肃省=28,青海省=29,宁夏回族自治区=30,新疆维吾尔自治区=31,台湾省=32,香港特别行政区=33,澳门特别行政区=34,海外=35，约定36为清除Province设置
	 */
	private String province;

	/** 
	* 用于描述会员的状态，normal表示正常，delete表示被买家删除，blacklist表示黑名单
	 */
	private String status;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}

	public void setGrade(Long grade) {
		this.grade = grade;
	}
	public Long getGrade() {
		return this.grade;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince() {
		return this.province;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.memberinfo.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("city", this.city);
		txtParams.put("grade", this.grade);
		txtParams.put("province", this.province);
		txtParams.put("status", this.status);
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

	public Class<CrmMemberinfoUpdateResponse> getResponseClass() {
		return CrmMemberinfoUpdateResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(buyerNick,"buyerNick");
		RequestCheckUtils.checkMaxLength(buyerNick,32,"buyerNick");
		RequestCheckUtils.checkMaxValue(grade,4L,"grade");
		RequestCheckUtils.checkMinValue(grade,1L,"grade");
		RequestCheckUtils.checkNotEmpty(status,"status");
		RequestCheckUtils.checkMaxLength(status,32,"status");
	}
}
