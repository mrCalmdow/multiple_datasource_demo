package com.flchen.multiple_datasource_demo.entity.shop.third.entity.bo;

/**
 * @Author JH.TAO
 * @create 2018-01-13 13:40
 */
public class FbdpayRetrunBO {
    private String sign;
    private String token;
    private String orderNo;
    private String payUrl;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
