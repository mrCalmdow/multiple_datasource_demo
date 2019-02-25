package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "accountRecord")
public class AccountRecordDO {

    private String serialNo; //交易流水号

    private String type; //交易类型

    private BigDecimal changeMoney;

    private BigDecimal beforeMoney;

    private BigDecimal afterMoney;

    private String remark; //备注

//    private String money;//金额
//    private String fee = WebConstants.DEFAULT_MONEY;//手续费
//    private String total = WebConstants.DEFAULT_MONEY;//总金额
//    private String cash = WebConstants.DEFAULT_MONEY;//可用余额
//    private String frost = WebConstants.DEFAULT_MONEY;//冻结金额
}
