package com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author JH.TAO
 * @create 2017-11-17 14:19
 */
public class InstallmentVO {
    @ApiModelProperty("分期方案名称")
    private String name;//分期方案名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
