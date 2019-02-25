package com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo;

import lombok.Data;

@Data
public class TongLianPayVO {
    public static final String REFUND_STATUS_SUCCESS = "1";
    public static final String REFUND_STATUS_DEFAULT = "0";
    public static final String REFUND_STATUS_FAILED = "2";
    /**
     * 支付流水
     */
    private String serialNo;
    /**
     * 支付状态
     */
    private String payStatus;
    /**
     * 创建时间
     */
    private long payTime;

    /**
     * 金额
     */
    private String amount;

    /**
     * 银行卡号
     */
    private String accountNo;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 退款状态 0 - 默认 1 - 成功 2 - 失败
     */
    private String refundStatus = REFUND_STATUS_DEFAULT;
}
