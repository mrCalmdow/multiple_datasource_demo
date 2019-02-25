package com.flchen.multiple_datasource_demo.entity.shop.order.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.GoodsDO;
import com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
@Document(collection = "order")
@Data
public class OrderDO extends BaseDO {
    // 若 有 修改一下状态 请同步修改
    public final static Boolean STATUS_REMIND_YES = true;
    public final static Boolean STATUS_REMIND_NO = false;

    public final static Boolean FLAG_INVOICESTATUS_NO = false;
    public final static Boolean FLAG_INVOICESTATUS_YES = true;

    // 支付状态
    public final static String STUATUS_PAYMENTSTATUS_COMPLETE = "0";//已经支付
    public final static String STUATUS_PAYMENTSTATUS_NON = "1";//未支付
    public final static String STUATUS_PAYMENTSTATUS_PART = "2";//部分支付
    public final static String STUATUS_PAYMENTSTATUS_REFUND = "3";//退款
    // 物流状态
    public final static String STUATUS_SHIPPINGSTATUS_SHIPPED = "0";//已发货
    public final static String STUATUS_SHIPPINGSTATUS_NOTSHIPPED = "1";//未发货（准备中）
    public final static String STUATUS_SHIPPINGSTATUS_RECEIVED = "2";//已收货
    public final static String STUATUS_SHIPPINGSTATUS_RETURN = "3";//退货中
    // 订单状态
    public final static String STUATUS_ORDERSTATUS_PAY_NON = "0";//待付款
    public final static String STUATUS_ORDERSTATUS_SHIP_NOTSHIPPED = "1";//待发货
    public final static String STUATUS_ORDERSTATUS_SHIP_SHIPPED = "2";//已发货
    public final static String STUATUS_ORDERSTATUS_SHIP_RECEIVED = "3";//已签收
    public final static String STUATUS_ORDERSTATUS_CANCEL = "4";//已取消（客户手动取消）
    public final static String STUATUS_ORDERSTATUS_APPLYING = "5";//退换货
    public final static String STUATUS_ORDERSTATUS_CLOSE = "6";//已关闭（商家或者系统关闭）
    public final static String STUATUS_ORDERSTATUS_REFUND_SUCCESS_CLOSE = "7";//退款成功关闭
    public final static String STUATUS_ORDERSTATUS_REFUND_FAIL_CLOSE = "8";//退款失败关闭
    public final static String STUATUS_ORDERSTATUS_RISK_CLOSE = "9";//风控关闭
    public final static String STUATUS_ORDERSTATUS_REFUND_TL_FAILURE = "10";//组合支付类型下，富宝袋退款成功，通联退款失败状态

    public final static String TYPE_PAYTYPE_ALL = "0";  //全额付款
    public final static String TYPE_PAYTYPE_PART = "1";  //分期付款

    // 组合支付状态
    public static final String GROUP_PAY_STATUS_SUCCESS = "1"; // 成功
    public static final String GROUP_PAY_STATUS_HANDLING = "2"; // 处理中
    public static final String GROUP_PAY_STATUS_FAILED = "3"; // 失败
    public static final String GROUP_PAY_STATUS_DEFAULT = "0"; // 默认

    // 支付方式
    public final static String TYPE_PAYWAY_ALIPAY = "支付宝";
    public final static String TYPE_PAYWAY_FUJFU = "富宝袋";
    public final static String TYPE_PAYWAY_PINGAN_WECHART = "微信";
    public final static String TYPE_PAYWAY_SWT_WECHART = "微信支付";
    public final static String TYPE_PAYWAY_GROUP_PAY = "组合支付";
    public final static String TYPE_PAYWAY_TONG_LIAN = "银行卡支付";

    // 换购标记
    public final static boolean FLAG_BUYACTIVITYFLAG_YES=true;//是换购
    public final static boolean FLAG_BUYACTIVITYFLAG_NO=false;//不是

    // 对账状态
    public final static String ACCOUNT_BALANCE_DEFAULT = "0"; // 默认
    public final static String ACCOUNT_BALANCE_SUCCESS = "1"; // 已对账
    public final static String ACCOUNT_BALANCE_UNUSUAL = "2"; // 异常挂起

    // 推送状态
    public final static String PUSH_STATUS_WAIT = "0"; // 未推送
    public final static String PUSH_STATUS_FINISH = "1"; // 已推送

    public final static String EXTEND_MARK_LOTTERY = "lottery_order";   // 抽奖订单标志

    // 通知核心账单生成状态
    public final static String STATE_BILL_GENERATE_DEFAULT = "0";// 默认
    public final static String STATE_BILL_GENERATE_SUCCESS = "1"; // 处理成功
    public final static String STATE_BILL_GENERATE_FAILED = "2"; // 处理失败

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 交易流水号
     */
    private String tradeNo;

    /**
     * 订单名称
     */
    private String orderName;

    /**
     * 父订单编号
     */
    private String parentOrderNo;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 会员账号
     */
    private String mobile;

    /**
     * 收货电话sw
     */
    private String receiverMobile;

    /**
     * 收货人
     */
    private String receiverName;

    /**
     * 收货地址
     */
    private String receiverAddress;

    /**
     * 留言
     */
    private String memo;

    /**
     * 留言回复
     */
    private List<String> memoReplys = new ArrayList<>();

    /**
     * 供应商ID
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 推荐人账号（USERID）
     */
    private String referrer;

    /**
     * 分享渠道（进入渠道）
     */
    private String shareType;

    /**
     * 发票信息
     */
    private InvoiceVO invoiceInfo;

    /**
     * 是否开据发票
     */
    private Boolean invoiceStatus;

    /**
     * 结算金额（业务变化暂时无用）
     */
    private BigDecimal totalSettlementAmount;

    /**
     * 实际结算金额
     */
    private BigDecimal actualSettlementAmount;

    /**
     * 订单总额
     * 商品dprice*数量+运费 （没有算优惠券） （下单时设置）
     */
    private BigDecimal totalPrice;
    /**
     * 富宝贷付款价格
     * 商品dprice*数量+运费-优惠金额    （下单时设置）
     */
    private BigDecimal fbdPayPayment;

    /**
     * 第三方支付价格
     * 商品dprice*数量+运费-优惠金额  +第三方服务费（不一定有，按支付方式来）（下单时设置）
     */
    private BigDecimal thirdPayPayment;

    /**
     * 实际付款金额(实付金额)
     * (给支付平台传过去的金额)  商品dprice*数量+运费-优惠金额  +第三方服务费（不一定有，按支付方式来） （第三方平台支付成功返回时设置）
     */
    private BigDecimal actualPayment;

    /**
     * 富宝袋折扣后金额 支付平台折扣后付款金额
     * actualPayment  - 支付平台优惠后金额 （第三方平台支付成功返回时设置）
     */
    private BigDecimal paymentAmount;

    /**
     * 商品总重量
     */
    private String weight;

    /**
     * 订单明细
     */
    private OrderInfoVO orderInfoVO;

    /**
     * 支付方式 支付宝 富宝袋 微信 微信支付 组合支付 银行卡支付
     */
    private String payWays = "";

    /**
     * 支付方式代码：1:分期支付  0全额付款
     */
    private String payType;

    /**
     * 分期总期数
     */
    private Integer installmentPeriods;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 快递单号
     */
    private String expressNo;

    /**
     * 快递公司
     */
    private String expressCompany;

    /**
     * 快递公司
     */
    private String expressComNo;

    /**
     * 卖家记录（只有后台看得到）
     */
    private String sellerNote;

    /**
     * 通联交易流水号
     */
    private String tongLianTradeNo;

    /**
     * 赠送积分
     */
    private Integer point = 0;

    /**
     * 收货时间
     */
    private long receivedTime;

    /**
     * 发货时间
     */
    private long deliveryTime;

    /**
     * 下单时间
     */
    private long orderTime;

    /**
     * 付款时间
     */
    private long paymentTime;

    /**
     * 是否短信提醒 默认未提醒
     */
    private Boolean remindStatus = STATUS_REMIND_NO;

    /**
     * 促销折扣
     */
    private BigDecimal promotionDiscount;

    /**
     * 优惠券折扣
     */
    private BigDecimal couponDiscount;

    /**
     * 富宝袋折扣金额 = fbdPayAmount - paymentAmount,(送去的值 - 返回的值)
     */
    private BigDecimal fbdDiscount;

    /**
     * 通联支付状态
     * 组合支付 0 默认 1 成功 2 处理中 3 失败
     */
    private String tongLianPayStatus;

    /**
     * 通联支付金额
     */
    private BigDecimal tongLianPayAmount;

    /**
     * 组合支付模式后 - 富宝袋实际付款金额
     */
    private BigDecimal fbdPayGroupPayment;

    /**
     * 富宝袋支付状态 - 组合支付
     */
    private String fbdPayStatus;

    /**
     * 售后申请信息
     */
    private AfterSaleVO afterSaleVO;

    /**
     * 历史售后记录
     */
    private List<AfterSaleVO> afterSaleHistory = new ArrayList<>();

    /**
     * 支付状态 0 已支付 1 未支付 2 部分支付 3 已退款
     */
    private String paymentStatus;

    /**
     * 物流状态 0 已发货 1 未发货   2 已退货  3  已收货
     */
    private String shippingStatus;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 换购标识
     */
    private Boolean buyActivityFlag=FLAG_BUYACTIVITYFLAG_NO;

    /**
     * 换购ID
     */
    private String buyActivityId;

    /**
     * 默认 - 0 已对账 - 1 异常挂起 - 2
     */
    private String accountBalanceStatus = OrderDO.ACCOUNT_BALANCE_DEFAULT;

    /**
     * 0 - 未推送   1 - 已推送
     */
    private String pushStatus = OrderDO.PUSH_STATUS_WAIT;

    /**
     * 优惠券ID
     */
    private List<String> userCouponIds = new ArrayList<>();

    /**
     * 用于标志订单 扩展标志
     */
    private String extendMark;

    /**
     * 商品类型：0-实物商品、1-虚拟商品
     */
    private String goodsType = GoodsDO.TYPE_GOODS_REAL;

    /**
     * 确认收货通知核心生成账单状态 0：默认 1：处理成功 3：处理失败
     */
    private String billGenerateNotificationStatus = STATE_BILL_GENERATE_DEFAULT;

    /**
     * 部分退款通知核心生成账单状态 0：默认 1：处理成功 3：处理失败
     */
    private String refundBillGenerateNotificationStatus = STATE_BILL_GENERATE_DEFAULT;

    /**
     * 本订单的推广员ID
     */
    private String promoterId;

    /**
     * 佣金结算状态
     */
    private String brokerageSettleState;

    /**
     * 佣金结算时间
     */
    private String brokerageSettleTime;
}
