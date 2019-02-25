package com.flchen.multiple_datasource_demo.entity.shop.operation.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AdvertisementVO {
    @ApiModelProperty("广告图片URL")
    private String advertisementUrl;//广告图片URL
    @ApiModelProperty("广告跳转地址")
    private String advertisementLinkUrl;//广告跳转地址
}
