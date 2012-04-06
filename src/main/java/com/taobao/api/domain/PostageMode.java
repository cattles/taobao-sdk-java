package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 运费方式模板收费方式
 *
 * @author auto create
 * @since 1.0, null
 */
public class PostageMode extends TaobaoObject {

	private static final long serialVersionUID = 3729619927867426619L;

	/**
	 * 邮费子项涉及的地区,多个地区用逗号连接数量串;可以用taobao.areas.get接口获取.或者参考:http://www.stats.gov.cn/tjbz/xzqhdm/t20080215_402462675.htm 例 (110000,310000,320000,330000).就代表邮费子项涉 
及(北京,上海,江苏,浙江)四个地区.填写时要注意对照地区代码值,如果填入错误地区代码,将会出现错误信息.
	 */
	@ApiField("dests")
	private String dests;

	/**
	 * 运费方式项id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 运费增价
	 */
	@ApiField("increase")
	private String increase;

	/**
	 * 运费模板ID
	 */
	@ApiField("postage_id")
	private Long postageId;

	/**
	 * 运费单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 运费方式(目前提供):平邮(post),快递公司(express),EMS(ems)
	 */
	@ApiField("type")
	private String type;

	public String getDests() {
		return this.dests;
	}
	public void setDests(String dests) {
		this.dests = dests;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getIncrease() {
		return this.increase;
	}
	public void setIncrease(String increase) {
		this.increase = increase;
	}

	public Long getPostageId() {
		return this.postageId;
	}
	public void setPostageId(Long postageId) {
		this.postageId = postageId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
