package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author yuqinggen
 * @create 2018-06-08 11:09
 */
@Data
public class SendMsgResultVO {

    @JSONField(name = "RET_CODE")
    private String resultReturnCode;

    @JSONField(name = "ERR_MSG")
    private String resultErrorMsg;
}
