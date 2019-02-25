package com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * 商品---标签类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/7, All Rights Reserved.
 */
public class GoodsLabelVO {

    public static final String STATUS_LABELTYPE_LIMIT = "1";//限时使用
    public static final String STATUS_LABELTYPE_PERMANENT = "0";//永久使用（默认）

    public static final String STATUS_LABELSTATUS_USE = "1";//使用中（默认）
    public static final String STATUS_LABELSTATUS_UNUSED = "0";// 未使用

    @ApiModelProperty(value = "标签名字")
    private String name;//标签名字

    @ApiModelProperty(value = "开始使用时间")
    private Long startTime;//开始使用时间

    @ApiModelProperty(value = "结束使用时间")
    private Long endTime;//结束使用时间

    private String labelStatus = STATUS_LABELSTATUS_USE;//标签状态  1 正在使用   0 未使用

    private String labelType = STATUS_LABELTYPE_PERMANENT;//标签类型  1 限时使用  0 永久标签

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getLabelStatus() {
        return labelStatus;
    }

    public void setLabelStatus(String labelStatus) {
        this.labelStatus = labelStatus;
    }

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }
}
