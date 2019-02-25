package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProtocolPaymentResponseDetailVO {

    @JSONField(name = "INFO")
    private ResponseInfoVO responseInfo = new ResponseInfoVO();

    @JSONField(name = "FASTTRXRET")
    private PaymentResultVO paymentResult = new PaymentResultVO();

    @JSONField(name = "FAGRARET")
    private SendMsgResultVO sendMsgResult = new SendMsgResultVO();

    @JSONField(name = "FAGRCRET")
    private SignResultVO signResult = new SignResultVO();
}
