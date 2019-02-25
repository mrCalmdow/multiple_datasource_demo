package com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author JH.TAO
 * @create 2017-12-21 11:31
 */
@Data
public class AfterSaleVO {

    public static final String STATUS_RECEIVSTATUS_RECEIVED = "0";//已收货
    public static final String STATUS_RECEIVSTATUS_NOTSHIPPED = "1";//待发货
    public static final String STATUS_RECEIVSTATUS_SHIPPED = "2";//已发货（待收货）

    //退款状态   0 申请成功 1 待审核 4 审核失败  5 退款成功  6退款失败
    public final static String STATUS_REFUNDSTATUS_APPLYSUCCESS = "0";  // 审核通过
    public final static String STATUS_REFUNDSTATUS_APPLYING = "1";      // 等待初审（初始状态）
    public final static String STATUS_REFUNDSTATUS_APPLYFAIL = "4";     // 初审不通过/客服拒绝
    public final static String STATUS_REFUNDSTATUS_REFUNDSUCCESS = "5"; // 退款成功
    public final static String STATUS_REFUNDSTATUS_REFUNDFAIL = "6";    // 退款失败
    public final static String STATUS_REFUNDSTATUS_WAITCOREAUDIT = "7";    // 商城向核心发起退款申请，等待核心返回
    public final static String STATUS_REFUNDSTATUS_REFUND_TL_FAIL = "8";    //组合支付类型下，富宝袋退款成功，但通联退款失败

    //退款方式
    public final static String TYPE_AFTERSERVICETYPE_RETURN = "0";//仅退款
    public final static String TYPE_AFTERSERVICETYPE_REFUNDANDSALESRETURN = "1";//退货退款

    //客户记录
    @ApiModelProperty("售后编号")
    private String afterSaleNo;//售后编号

    @ApiModelProperty("退款状态")
    private String afterSaleStatus;

    @ApiModelProperty("退款类型")
    private String afterServiceType;//退款类型  0 仅退款 1 退货退款


    @ApiModelProperty("原因")
    private String refundReason;//原因

    @ApiModelProperty("说明")
    private String refundExplain;//说明

    @ApiModelProperty("上传凭证图片")
    private List<String> provePictureUrl = new ArrayList<>();//上传凭证图片

    @ApiModelProperty("退款申请时间")
    private long applicationDate;//退款申请时间

    @ApiModelProperty("退款金额")
    private BigDecimal refundAmount;//退款金额

    @ApiModelProperty("富宝袋退款金额")
    private BigDecimal fbdRefundAmount; // 富宝袋退款金额

    @ApiModelProperty("通联退款金额")
    private BigDecimal unionRefundAmount; // 通联退款金额

    @ApiModelProperty("退货物流公司名称")
    private String returnExpressCompany;//退货物流公司名称

    @ApiModelProperty("退货物流公司编号")
    private String returnExpressComNo;//退货物流公司编号

    @ApiModelProperty("退货物流编号")
    private String returnExpressNo;//退货物流编号

    @ApiModelProperty("退货状态")
    private String receiveStatus; //  0 已收货     1 待发货      2 已发货


    //客服记录
    @ApiModelProperty("审核结果，0-同意； 1-拒绝")
    private String result;
    @ApiModelProperty("初审审核意见")
    private String refusalCause;//初审审核意见
    @ApiModelProperty("实际退款金额")
    private BigDecimal actualRefundAmount;//实际退款金额
    @ApiModelProperty("物流图片凭证")
    private List<String> expressProof;

    @ApiModelProperty("审核时间")
    private long auditDate;

    @ApiModelProperty("客户发货时间")
    private long shippedDate;

    @ApiModelProperty("退款成功（失败）时间")
    private long refundDate;

    @ApiModelProperty("退款类型标志0-全部退款，1-部分退款")
    private String partRefund = "0"; // 部分退货标记 0 - 全部退款 1 - 部分退款

    @ApiModelProperty("收货时间")
    private long receiveDate;

    @ApiModelProperty("售后处理备注")
    private String remark;

    @ApiModelProperty("终审拒绝原因")
    private String finalRefuseReason;
}
