package com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;


/**
 * 商品快递信息子类（可以不用VO  待查）
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
public class ExpressInfoVO {
    @ApiModelProperty(value = "物流方式(1  包邮  2  门店自提   3  物流)")
    private String type;//物流方式  1  包邮  2  门店自提   3  物流
    @ApiModelProperty(value = "快递公司名")
    private String expressCompanyName;//快递公司名
    @ApiModelProperty(value = "快递费用")
    private BigDecimal expressFee;//快递费用

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    public BigDecimal getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(BigDecimal expressFee) {
        this.expressFee = expressFee;
    }
}
