package com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author JH.TAO
 * @create 2017-11-16 10:58
 */
public class StoreInfoVO {
    @ApiModelProperty("门店名")
    private String storeName;//门店名
    @ApiModelProperty("门店地址")
    private String storeAddress;//门店地址
    @ApiModelProperty("门店联系电话")
    private String telephone;//门店联系电话

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
