package com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo;

import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsParameterVO;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;


/**
 * 订单具体商品子类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
public class OrderInfoVO {
    @ApiModelProperty("商品ID")
    private String goodsId;//商品ID
    @ApiModelProperty("商品名称")
    private String goodsName;//商品名称
    @ApiModelProperty("商品库存SKU")
    private String goodsSkuNo;//商品库存SKU
    @ApiModelProperty("单价")
    private BigDecimal price;//市场价格（用来展示，不用于计算）
    @ApiModelProperty("实际单价")
    private BigDecimal dprice;//实际单价
    @ApiModelProperty("加价率(第三方支付加价率  实际付款价格 = 优惠价*(1+increaseRate))")
    private double increaseRate;
    @ApiModelProperty("数量")
    private Integer quantity;//数量
    @ApiModelProperty("商品缩略图")
    private String thumbnail;  //商品缩略图
    @ApiModelProperty("供应商ID")
    private String supplierId;//供应商ID
    @ApiModelProperty("可变参数集合")
    private List<GoodsParameterVO> goodsParameters;

    @ApiModelProperty("采购价格")
    private BigDecimal settlementAmount;


    public List<GoodsParameterVO> getGoodsParameters() {
        return goodsParameters;
    }

    public void setGoodsParameters(List<GoodsParameterVO> goodsParameters) {
        this.goodsParameters = goodsParameters;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsSkuNo() {
        return goodsSkuNo;
    }

    public void setGoodsSkuNo(String goodsSkuNo) {
        this.goodsSkuNo = goodsSkuNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getDprice() {
        return dprice;
    }

    public void setDprice(BigDecimal dprice) {
        this.dprice = dprice;
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
}
