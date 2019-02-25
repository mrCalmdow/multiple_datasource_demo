package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author only-lilei
 * @create 2018-02-01 上午11:03
 **/
@Data
@Document(collection = "thirdPay")
public class ThirdPayDO extends BaseDO {
    //ID为和第三方交付的流水号
    public final static String TYPE_REFUND = "refund";
    public final static String TYPE_PAYMENT = "payment";

    public final static String STATUS_SUCCESS = "success";
    public final static String STATUS_FAIL = "fail";
    public final static String STATUS_HANDLING = "handling";
    public final static String STATUS_DEFAULT = "default";

    public final static String PAY_WAY_PINGAN = "平安";
    public final static String PAY_WAY_ALIPAY = "支付宝";
    public final static String PAY_WAY_FUJFU = "富宝袋";
    public final static String PAY_WAY_SWT = "商务通";
    /**
     * 类型  退款、付款
     */
    private String type;
    /**
     * 状态 失败、成功、处理中
     */
    private String status = STATUS_DEFAULT;
    /**
     * 付款时->订单号 内部使用
     * 退款->退款编号
     * -- 支付交易时，用于存放商城的父订单号（flchen 2018-11-30）
     * -- 退款交易时，用于存放商城的子订单号（flchen 2018-12-01）
     */
    private String ourNo;
    /**
     * 第三方自己的订单号
     * -- 用于存放第三方回调的处理流水号（flchen 2018-11-30）
     * -- 第三方的支付订单号因需要唯一，使用id来替代（flchen 2018-11-30）
     */
    private String ordNo;

    /**
     * 记录生成的时间
     */
    private long createTime;
    /**
     * 支付类型 平安支付、支付宝支付
     */
    private String payWay;

    /**
     * 记录回调的时间
     */
    private long updateTime;

    /**
     * 订单金额，以分为单位
     */
    private long orderAmount;

    /**
     * 第三方返回的对账日期
     */
    private long settleDate;

    /**
     * 第三方返回的完成时间
     */
    private long completeDate;
}
