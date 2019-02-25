package com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品--参数子类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
public class GoodsSkuVO {

    public static final String STATUS_PAYMENT_ALL = "0";
    public static final String STATUS_PAYMENT_INSTALLMENT = "1";

    public static final String STATUS_AUDITSTATUS_PASS = "pass";
    public static final String STATUS_AUDITSTATUS_NOPASS = "nopass";

    public static final Boolean STATUS_SALE_NORMAL = Boolean.TRUE;
    public static final Boolean STATUS_SALE_SOLDOUT = Boolean.FALSE;

    // 客户类型限购所有用户
    public static final Integer PURCHASES_LIMIT_USER_TYPE_ALL = 0;
    // 客户类型限购首单用户
    public static final Integer PURCHASES_LIMIT_USER_TYPE_FISTE = 1;

    private String auditStatus;//审核状态

    @ApiModelProperty("商品SKU（商品编号）")
    private String goodsSkuNo;//商品SKU （商品编号）
    @ApiModelProperty("商品库存")
    private Integer inventory;//商品库存
    @ApiModelProperty("图片URL")
    private String skuImgUrl;
    @ApiModelProperty("原价(市场价格)")
    private BigDecimal price;// 原价
    @ApiModelProperty("优惠价(实际价格)")
    private BigDecimal dPrice; // 优惠价(实际价格)
    @ApiModelProperty("是否促销")
    private Integer salesPromotion = 1;
    @ApiModelProperty("促销活动价格")
    private BigDecimal promotionPrice;
    @ApiModelProperty(value = "促销开始时间")
    private long salesPromotionStartTime; // 促销开始时间
    @ApiModelProperty(value = "促销结束时间")
    private long salesPromotionEndTime; // 促销结束时间
    @ApiModelProperty("加价率(第三方支付加价率  实际付款价格 = 优惠价*(1+increaseRate))")
    private double increaseRate;
    @ApiModelProperty("重量（单位kg）")
    private float weight;//重量（单位kg）
    @ApiModelProperty("商品货号")
    private String marque;//商品货号
    @ApiModelProperty("付费方案   0 全额  1  分期")
    private String payMent; //付费方案  0 全额  1  分期
    @ApiModelProperty("分期方案集合")
    private List<InstallmentVO> installments = new ArrayList<>();//分期方案

    @ApiModelProperty("可变参数集合")
    private List<GoodsParameterVO> goodsParameters;

    @ApiModelProperty("采购价格")
    private BigDecimal settlementAmount;

    @ApiModelProperty("出售状态：true-正常出售，false-下架")
    private Boolean saleStatus;

    @ApiModelProperty("单个商品限购次数 (为0为null则不限制)")
    private Integer purchasesLimitNumber;

    @ApiModelProperty("单个商品限购类型 (为null则适用所有用户) 0:所有用户 1:首单用户")
    private Integer purchasesLimitUserType;

    public Boolean getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Boolean saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getSalesPromotion() {
        return salesPromotion;
    }

    public void setSalesPromotion(Integer salesPromotion) {
        this.salesPromotion = salesPromotion;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public long getSalesPromotionStartTime() {
        return salesPromotionStartTime;
    }

    public void setSalesPromotionStartTime(long salesPromotionStartTime) {
        this.salesPromotionStartTime = salesPromotionStartTime;
    }

    public long getSalesPromotionEndTime() {
        return salesPromotionEndTime;
    }

    public void setSalesPromotionEndTime(long salesPromotionEndTime) {
        this.salesPromotionEndTime = salesPromotionEndTime;
    }

    public String getGoodsSkuNo() {
        return goodsSkuNo;
    }

    public void setGoodsSkuNo(String goodsSkuNo) {
        this.goodsSkuNo = goodsSkuNo;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getSkuImgUrl() {
        return skuImgUrl;
    }

    public void setSkuImgUrl(String skuImgUrl) {
        this.skuImgUrl = skuImgUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getdPrice() {
        return dPrice;
    }

    public void setdPrice(BigDecimal dPrice) {
        this.dPrice = dPrice;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public List<GoodsParameterVO> getGoodsParameters() {
        return goodsParameters;
    }

    public void setGoodsParameters(List<GoodsParameterVO> goodsParameters) {
        this.goodsParameters = goodsParameters;
    }

    public String getPayMent() {
        return payMent;
    }

    public void setPayMent(String payMent) {
        this.payMent = payMent;
    }

    public List<InstallmentVO> getInstallments() {
        return installments;
    }

    public void setInstallments(List<InstallmentVO> installments) {
        this.installments = installments;
    }

    public double getIncreaseRate() {
        return increaseRate;
    }

    public void setIncreaseRate(double increaseRate) {
        this.increaseRate = increaseRate;
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getPurchasesLimitNumber() {
        return purchasesLimitNumber;
    }

    public void setPurchasesLimitNumber(Integer purchasesLimitNumber) {
        this.purchasesLimitNumber = purchasesLimitNumber;
    }

    public Integer getPurchasesLimitUserType() {
        return purchasesLimitUserType;
    }

    public void setPurchasesLimitUserType(Integer purchasesLimitUserType) {
        this.purchasesLimitUserType = purchasesLimitUserType;
    }
}


