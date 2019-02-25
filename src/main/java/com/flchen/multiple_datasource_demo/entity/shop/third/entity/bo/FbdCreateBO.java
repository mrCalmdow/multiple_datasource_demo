package com.flchen.multiple_datasource_demo.entity.shop.third.entity.bo;

import lombok.Data;

@Data
public class FbdCreateBO {

    private String orderNo;//订单号 ,
    private String payPassword;//交易密码 ,
    private String sign;//签名 ,
    private String token;//token信息 ,
    private String userId;//用户id
}
