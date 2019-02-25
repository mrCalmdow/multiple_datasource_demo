package com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
public class ReceiveAddressVO {
    public static final Boolean STATUS_ISDEFAULT_YES=true;
    public static final Boolean STATUS_ISDEFAULT_NO=false;
    private String serialId; //地址唯一id
    private String consignee;//收货人
    private String mobile;//手机号
    private String telephone;//固定电话
    private String postcard;//邮编
    private String area;//省市区
    private String detailedAddress;//详细地址
    private Boolean isDefault = STATUS_ISDEFAULT_NO;//是否默认地址
    private long updated;//更新时间

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPostcard() {
        return postcard;
    }

    public void setPostcard(String postcard) {
        this.postcard = postcard;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }
}
