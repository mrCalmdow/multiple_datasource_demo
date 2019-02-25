package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.query;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @outhor ivan
 * @create 2018-07-13 下午4:04
 */
@Data
public class QueryTransDetailVO {
    @JSONField(name = "BATCHID")
    private String batchId;

    @JSONField(name = "SN")
    private String sn;

    @JSONField(name = "TRXDIR")
    private String trxDir;

    @JSONField(name = "SETTDAY")
    private String settleDay;

    @JSONField(name = "FINTIME")
    private String finishTime;

    @JSONField(name = "SUBMITTIME")
    private String submitTime;

    @JSONField(name = "ACCOUNT_NO")
    private String accountNo;

    @JSONField(name = "ACCOUNT_NAME")
    private String accountName;

    @JSONField(name = "AMOUNT")
    private String amount;

    @JSONField(name = "RET_CODE")
    private String retCode;

    @JSONField(name = "ERR_MSG")
    private String errMsg;
}
