package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品通知消息
 *
 * @author auto create
 * @since 1.0, null
 */
public class NotifyItem extends TaobaoObject {

	private static final long serialVersionUID = 4351816175585189318L;

	/**
	 * 商品此次操作所变更的字段，以“,”分割，对应于商品Item的字段名称。目前支持title，price，num，item_img，prop_img，location，cid，approve_status， list_time几个字段的更改标记返回，其中“item_img，prop_img”会同时出现表示商品相关图片列表发生了修改
	 */
	@ApiField("changed_fields")
	private String changedFields;

	/**
	 * 商品编号(注意：iid近期即将废弃，请用num_iid参数)
	 */
	@ApiField("iid")
	private String iid;

	/**
	 * 商品修改时间（格式：yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 卖家昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 商品数量
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 商品数字编号
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 商品价格，格式：5.00；单位：元；精确到：分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品SKU编号
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * 商品SKU库存
	 */
	@ApiField("sku_num")
	private Long skuNum;

	/**
	 * 商品操作所对应的商品增量消息状态。
可选值 
ItemAdd（新增商品） 
ItemUpshelf（上架商品） 
ItemDownshelf（下架商品） 
ItemDelete（删除商品） 
ItemUpdate（更新商品） 
ItemRecommendDelete（取消橱窗推荐商品） 
ItemRecommendAdd（橱窗推荐商品） 
ItemZeroStock（商品卖空）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品标题,不能超过60字节
	 */
	@ApiField("title")
	private String title;

	public String getChangedFields() {
		return this.changedFields;
	}
	public void setChangedFields(String changedFields) {
		this.changedFields = changedFields;
	}

	public String getIid() {
		return this.iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuNum() {
		return this.skuNum;
	}
	public void setSkuNum(Long skuNum) {
		this.skuNum = skuNum;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
