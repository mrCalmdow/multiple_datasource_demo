package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.refund;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


/**
 * 退款结果
 * @author songsy
 * @Date 2018/12/15 17:52
 */
@Data
public class RefundResponseDetailBean {

    @JSONField(name = "INFO")
    private ResponseInfoBean responseInfo; // 通用返回信息

    @JSONField(name = "TRANSRET")
    private RefundResponseDetailTransRetBean transRet; // 退款结果
}
