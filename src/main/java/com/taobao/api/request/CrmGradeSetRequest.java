package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGradeSetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.crm.grade.set request
 * 
 * @author auto create
 * @since 1.0, 2011-09-09 13:49:10
 */
public class CrmGradeSetRequest implements TaobaoRequest<CrmGradeSetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 必须要在amount和count参数中选择一个<br>
amount参数的填写规范：升级到下一个级别的需要的交易额，单位为分,必须全部填写.例如10000,20000,30000，其中10000表示普通会员升级到高级会员需要达到100元的交易额。至尊VIP为最高等级，不需要填写。会员等级越高，所需交易额必须越高。
	 */
	private String amount;

	/** 
	* 必须要在amount和count参数中选择一个<br>
count参数的填写规范：
升级到下一个级别的需要的交易量,必须全部填写. 以逗号分隔,例如100,200,300，其中100表示普通会员升级到高级会员需要100笔交易。至尊VIP为最高等级，不需要填写。会员等级越高，交易量必须越高。
	 */
	private String count;

	/** 
	* 会员级别折扣率。会员等级越高，折扣必须越低。
950即9.5折，888折即8.88折8。出于安全原因，折扣现最低只能设置到700即7折。
	 */
	private String discount;

	/** 
	* 会员等级,必须全部填写。用逗号分隔。买家会员级别 1：普通会员 2 ：高级会员 3：VIP会员 4：至尊VIP
	 */
	private String grade;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return this.amount;
	}

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount() {
		return this.count;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiscount() {
		return this.discount;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return this.grade;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.crm.grade.set";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("amount", this.amount);
		txtParams.put("count", this.count);
		txtParams.put("discount", this.discount);
		txtParams.put("grade", this.grade);
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

	public Class<CrmGradeSetResponse> getResponseClass() {
		return CrmGradeSetResponse.class;
	}
	
	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxListSize(amount,3,"amount");
		RequestCheckUtils.checkMaxListSize(count,3,"count");
		RequestCheckUtils.checkNotEmpty(discount,"discount");
		RequestCheckUtils.checkMaxListSize(discount,4,"discount");
		RequestCheckUtils.checkNotEmpty(grade,"grade");
		RequestCheckUtils.checkMaxListSize(grade,4,"grade");
	}
}
