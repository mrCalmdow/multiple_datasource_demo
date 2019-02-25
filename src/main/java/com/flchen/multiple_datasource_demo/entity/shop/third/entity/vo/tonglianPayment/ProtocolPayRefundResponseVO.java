package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.refund.RefundResponseDetailBean;
import lombok.Data;

/**
 * 退款ResponseBO
 * @author songsy
 * @Date 2018/12/14 16:27
 */
@Data
public class ProtocolPayRefundResponseVO {

    @JSONField(name = "AIPG")
    private RefundResponseDetailBean responseDetail;

}
