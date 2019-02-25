package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProtocolPaymentResponseVO {
    @JSONField(name = "AIPG")
    private ProtocolPaymentResponseDetailVO responseDetail = new ProtocolPaymentResponseDetailVO();
}
