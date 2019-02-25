package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsSkuVO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.ExpressInfoVO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsLabelVO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.StoreInfoVO;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
@Document(collection = "goods")
public class GoodsDO extends BaseDO {
	public static final String STATUS_GOODSSTATUS_UNPUBLISHED = "2";//未发布（默认）
	public static final String STATUS_GOODSSTATUS_SOLDOUT = "1";//下架
	public static final String STATUS_GOODSSTATUS_PUTAWAY = "0"; //上架

	public static final Integer STATUS_LISTTOP_YES = 0; //上架
	public static final Integer STATUS_LISTTOP_NO = 1; //上架
	public static final String STATUS_PUTAWAYSTATUS_IMMEDIATELY = "1";//立即上架（默认）
	public static final String STATUS_PUTAWAYSTATUS_DELAY = "2";//暂不上架
	public static final String STATUS_PUTAWAYSTATUS_PLAN = "3";//定时上架
	public static final String STATUS_PUTAWAYSTATUS_FINISH = "4";//定时任务完成

	public static final Boolean STATUS_INVOICESTATUS_YES = true;//可以开发票
	public static final Boolean STATUS_INVOICESTATUS_NO = false;//不可以开发票

	public static final Boolean STATUS_DISPLAYSTATUS_YES = true;//展示
	public static final Boolean STATUS_DISPLAYSTATUS_NO = false;//不展示

	public static final String TYPE_EXPRESSTYPE_PINKAGE = "1";//包邮（默认）
	public static final String TYPE_EXPRESSTYPE_STORE = "2";//门店自提
	public static final String TYPE_EXPRESSTYPE_EXPRESS = "3";//快递

	public static final String STATUS_AUDITSTATUS_PASS = "pass";
	public static final String STATUS_AUDITSTATUS_NOPASS = "nopass";

	public static final Integer STATUS_LISTTOP_TRUE = 0;
	public static final Integer STATUS_LISTTOP_FALSE = 1;

	public static final String TYPE_GOODS_REAL = "0"; 	// 实物商品
	public static final String TYPE_GOODS_VIRTUAL = "1"; 	// 虚拟商品


	private String auditStatus;//审核状态

	private String goodsName;//商品名
	@DBRef
	private CategoryDO category;//分类
	private String categoryLinkName;//分类关系名字
	private String categoryId;//分类ID

	private String brand; //品牌

	private String supplierId;//供应商ID
	private String supplierName;//供应商名字
	private List<GoodsSkuVO> goodsSkus = new ArrayList<>();//商品参数（SKU指定）


	private Boolean invoiceStatus;//开发票状态  false不可以开(不可以) true可以开
	private String invoiceContent;//开票内容

	private Boolean displayStatus;//首页展示
	private Long displayStartTime;//首页展示开始时间
	private Long displayEndTime;//首页展示结束时间

	private List<GoodsLabelVO> goodsLabelVOS;//商品标签  置顶 ， 包邮  ， 免息  ， 推荐到首页 等等

	private String imageUrl;//商品主图片
	private List<String> banner;//商品banner图

	private String content;//商品详情图片（商品介绍）
	private String customerServiceContent;//包装售后
	private String parameterContent;//商品参数


	private String remark;//备注
	private List<ExpressInfoVO> expressInfoVOS; //物流信息
	private List<StoreInfoVO> storeInfoVOS; //门店信息
	private String expressType;//物流方式  1  包邮  2  门店自提   3  物流


	private Float score;  //评分
	private Long totalScore;// 总评分
	private Long scoreCount;  //评分数
	private Integer saleVolume = 0; // 销量
	private Integer hits = 0;//浏览量

	private String putawayStatus = STATUS_PUTAWAYSTATUS_IMMEDIATELY;//上架选择状态 1  立即上架（默认）  2 暂不上架  3 定时上架
	private long planUpDate;//计划上架时间

	private String goodsStatus = STATUS_GOODSSTATUS_SOLDOUT;//商品状态  0上架 1下架   2 未发布(默认)
	private long upDate;//上架时间
	private long downDate;//下架时间
	/**
	 * 查询列表置顶
	 */
	private Integer listTop;//查询列表置顶  0 置顶 1不置顶
	private Long listTopTime;//查询列表置顶时间

	/**
	 * 首页列表置顶
	 */
	private Integer homeTop; //首页显示置顶标识，0置顶，1不置顶
	private Long homeTopTime;//首页显示置顶设置时间

	/**
	 * 商品类型：0-实物商品、1-虚拟商品
	 */
	private String goodsType = TYPE_GOODS_REAL;


	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getHomeTop() {
		return homeTop;
	}

	public void setHomeTop(Integer homeTop) {
		this.homeTop = homeTop;
	}

	public Long getHomeTopTime() {
		return homeTopTime;
	}

	public void setHomeTopTime(Long homeTopTime) {
		this.homeTopTime = homeTopTime;
	}

	public Long getListTopTime() {
		return listTopTime;
	}

	public void setListTopTime(Long listTopTime) {
		this.listTopTime = listTopTime;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public CategoryDO getCategory() {
		return category;
	}

	public void setCategory(CategoryDO category) {
		this.category = category;
	}

	public String getCategoryLinkName() {
		return categoryLinkName;
	}

	public void setCategoryLinkName(String categoryLinkName) {
		this.categoryLinkName = categoryLinkName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public List<GoodsSkuVO> getGoodsSkus() {
		return goodsSkus;
	}

	public void setGoodsSkus(List<GoodsSkuVO> goodsSkus) {
		this.goodsSkus = goodsSkus;
	}

	public Boolean getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(Boolean invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceContent() {
		return invoiceContent;
	}

	public void setInvoiceContent(String invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public Boolean getDisplayStatus() {
		return displayStatus;
	}

	public void setDisplayStatus(Boolean displayStatus) {
		this.displayStatus = displayStatus;
	}

	public Long getDisplayStartTime() {
		return displayStartTime;
	}

	public void setDisplayStartTime(Long displayStartTime) {
		this.displayStartTime = displayStartTime;
	}

	public Long getDisplayEndTime() {
		return displayEndTime;
	}

	public void setDisplayEndTime(Long displayEndTime) {
		this.displayEndTime = displayEndTime;
	}

	public List<GoodsLabelVO> getGoodsLabelVOS() {
		return goodsLabelVOS;
	}

	public void setGoodsLabelVOS(List<GoodsLabelVO> goodsLabelVOS) {
		this.goodsLabelVOS = goodsLabelVOS;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<String> getBanner() {
		return banner;
	}

	public void setBanner(List<String> banner) {
		this.banner = banner;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCustomerServiceContent() {
		return customerServiceContent;
	}

	public void setCustomerServiceContent(String customerServiceContent) {
		this.customerServiceContent = customerServiceContent;
	}

	public String getParameterContent() {
		return parameterContent;
	}

	public void setParameterContent(String parameterContent) {
		this.parameterContent = parameterContent;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<ExpressInfoVO> getExpressInfoVOS() {
		return expressInfoVOS;
	}

	public void setExpressInfoVOS(List<ExpressInfoVO> expressInfoVOS) {
		this.expressInfoVOS = expressInfoVOS;
	}

	public List<StoreInfoVO> getStoreInfoVOS() {
		return storeInfoVOS;
	}

	public void setStoreInfoVOS(List<StoreInfoVO> storeInfoVOS) {
		this.storeInfoVOS = storeInfoVOS;
	}

	public String getExpressType() {
		return expressType;
	}

	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Long getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

	public Long getScoreCount() {
		return scoreCount;
	}

	public void setScoreCount(Long scoreCount) {
		this.scoreCount = scoreCount;
	}

	public Integer getSaleVolume() {
		return saleVolume;
	}

	public void setSaleVolume(Integer saleVolume) {
		this.saleVolume = saleVolume;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public String getPutawayStatus() {
		return putawayStatus;
	}

	public void setPutawayStatus(String putawayStatus) {
		this.putawayStatus = putawayStatus;
	}

	public long getPlanUpDate() {
		return planUpDate;
	}

	public void setPlanUpDate(long planUpDate) {
		this.planUpDate = planUpDate;
	}

	public String getGoodsStatus() {
		return goodsStatus;
	}

	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

	public long getUpDate() {
		return upDate;
	}

	public void setUpDate(long upDate) {
		this.upDate = upDate;
	}

	public long getDownDate() {
		return downDate;
	}

	public void setDownDate(long downDate) {
		this.downDate = downDate;
	}

	public Integer getListTop() {
		return listTop;
	}

	public void setListTop(Integer listTop) {
		this.listTop = listTop;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
}
