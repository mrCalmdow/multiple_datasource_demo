package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author yuqinggen
 * @create 2018-06-08 11:10
 */
@Data
public class SignResultVO {

    @JSONField(name = "RET_CODE")
    private String resultReturnCode;

    @JSONField(name = "AGRMNO")
    private String signSerialNo;//签约号

    @JSONField(name = "ERR_MSG")
    private String resultErrorMsg;
}
