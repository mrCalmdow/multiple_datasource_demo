package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TLSingleResponseDetailVO {

    @JSONField(name = "INFO")
    private ResponseInfoVO responseInfo = new ResponseInfoVO();

    @JSONField(name = "TRANSRET")
    private TransRet transRet = new TransRet();
}
