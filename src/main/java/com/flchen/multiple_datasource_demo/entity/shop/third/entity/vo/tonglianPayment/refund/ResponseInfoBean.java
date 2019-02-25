package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.refund;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


/**
 * 返回报文通用INFO节点
 * @author songsy
 * @Date 2018/12/14 17:52
 */
@Data
public class ResponseInfoBean {

    @JSONField(name = "TRX_CODE")
    private String businessCode; // 交易代码

    @JSONField(name = "VERSION")
    private String version; // 报文版本

    @JSONField(name = "DATA_TYPE")
    private String dataType; // 数据格式

    @JSONField(name = "REQ_SN")
    private String orderNo; // 交易流水号

    @JSONField(name = "RET_CODE")
    private String returnCode; // 报文头返回代码

    @JSONField(name = "SIGNED_MSG")
    private String signedMessage; // 签名信息

    @JSONField(name = "ERR_MSG")
    private String errorMsg; // 错误信息
}


