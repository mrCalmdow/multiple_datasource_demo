package com.flchen.multiple_datasource_demo.entity.shop.third.entity.bo;

import lombok.Data;

@Data
public class GroupPayCreateBO {
    private String actualAmount;//实际金额 ,
    private String channel;//渠道 ,
    private String discountAmount;//折扣金额 ,
    private String isDiscount;//是否折扣 ,
    private String merchantName;//商户名称 ,
    private String orderDesc;//订单描述 ,
    private String orderNo;//订单编号 ,
    private String originalAmount;//原始金额 ,
    private String payMsg;//支付消息 ,
    private String payStatus;//支付状态:0-待支付 1-已支付 2-支付失败 3-取消 ,
    private String payTime;//支付时间 ,
    private String photoUrl;//支付分享链接图片 ,
    private Integer pwdCount;// 可输入交易密码次数 ,
    private String sign;//签名 ,
    private String tradeNo;//支付流水号

    private String errMsg;// 错误信息
    private int returnCode;
}
