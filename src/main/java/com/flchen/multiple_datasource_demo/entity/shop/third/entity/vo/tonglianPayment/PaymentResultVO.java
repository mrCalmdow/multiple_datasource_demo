package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PaymentResultVO {

    @JSONField(name = "RET_CODE")
    private String resultReturnCode;

    @JSONField(name = "ERR_MSG")
    private String resultErrorMsg;
}
