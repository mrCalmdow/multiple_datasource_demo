package com.flchen.multiple_datasource_demo.entity.shop.order.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo.InvoiceVO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "parentOrder")
public class ParentOrderDO extends BaseDO {
    //若 有 修改一下状态 请同步修改
    public final static Boolean STATUS_REMIND_YES = true;
    public final static Boolean STATUS_REMIND_NO = false;

    public final static Boolean STUATUS_INVOICESTATUS_NO = false;
    public final static Boolean STUATUS_INVOICESTATUS_YES = true;

    //支付状态
    public final static String STUATUS_PAYMENTSTATUS_COMPLETE = "0";//已经支付
    public final static String STUATUS_PAYMENTSTATUS_NON = "1";//未支付
    public final static String STUATUS_PAYMENTSTATUS_PART = "2";//部分支付

    //订单状态
    public final static String STUATUS_ORDERSTATUS_PAY_NON = "0";//待付款
    public final static String STUATUS_ORDERSTATUS_SHIP_NOTSHIPPED = "1";//待发货
    public final static String STUATUS_ORDERSTATUS_SHIP_SHIPPED = "2";//已发货
    public final static String STUATUS_ORDERSTATUS_SHIP_RECEIVED = "3";//已签收
    public final static String STUATUS_ORDERSTATUS_CANCEL = "4";//已取消
    public final static String STUATUS_ORDERSTATUS_APPLYING = "5";//退换货
    public final static String STUATUS_ORDERSTATUS_CLOSE = "6";//已关闭
    public final static String STUATUS_ORDERSTATUS_REFUND_SUCCESS_CLOSE = "7";//退款成功关闭
    public final static String STUATUS_ORDERSTATUS_REFUND_FAIL_CLOSE = "8";//退款失败关闭
    public final static String STUATUS_ORDERSTATUS_RISK_CLOSE = "9";//风控关闭
    public final static String STUATUS_ORDERSTATUS_REFUND_TL_FAILURE = "1O";//组合支付类型下，富宝袋退款成功，通联退款失败状态

    public final static String TYPE_PAYTYPE_ALL = "0";  //全额付款
    public final static String TYPE_PAYTYPE_PART = "1";  //分期付款

    //支付方式
    public final static String TYPE_PAYWAY_ALIPAY = "支付宝";
    public final static String TYPE_PAYWAY_FUJFU = "富宝袋";
    public final static String TYPE_PAYWAY_PINGAN_WECHART = "微信";
    public final static String TYPE_PAYWAY_SWT_WECHART = "微信支付";
    public final static String TYPE_PAYWAY_GROUP_PAY = "组合支付";
    public final static String TYPE_PAYWAY_TONG_LIAN = "银行卡支付";

    //组合支付状态
    public static final String GROUP_PAY_STATUS_SUCCESS = "1"; // 成功
    public static final String GROUP_PAY_STATUS_HANDLING = "2"; // 处理中
    public static final String GROUP_PAY_STATUS_FAILED = "3"; // 失败
    public static final String GROUP_PAY_STATUS_DEFAULT = "0"; // 默认

    //换购标记
    public final static boolean FLAG_EXISTBUYACTIVITY_YES = true;//存在
    public final static boolean FLAG_EXISTBUYACTIVITY_NO = false;//不存在

    // 通知核心账单生成
    public final static boolean STATE_BILL_GENERATE_TRUE = Boolean.TRUE;
    public final static boolean STATE_BILL_GENERATE_FALSE = Boolean.FALSE;

    /**
     * 父订单编号
     */
    private String orderNo;

    /**
     * 订单名称
     */
    private String orderName;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 会员账号
     */
    private String mobile;

    /**
     * 发票信息
     */
    private InvoiceVO invoiceInfo;

    /**
     * 是否开据发票
     */
    private Boolean invoiceStatus;

    /**
     * 订单总额(活动价格相加)
     */
    private BigDecimal totalPrice;

    /**
     * 富宝贷付款价格
     */
    private BigDecimal fbdPayPayment;

    /**
     * 第三方支付价格
     */
    private BigDecimal thirdPayPayment;

    /**
     * 实际付款金额(实付金额)
     */
    private BigDecimal actualPayment;

    /**
     * 实际付款金额
     */
    private BigDecimal totalPaymentAmount;

    /**
     * 商品总重量
     */
    private String weight;

    /**
     * 支付宝 富宝袋 微信 微信支付 组合支付 银行卡支付
     * 这里调用OrderDO里面定义的常量
     */
    private String payWays = "";

    /**
     * 支付方式代码：1:分期支付  0全额付款
     */
    private String payType;

    /**
     * 交易流水号
     */
    private String tradeNo;

    /**
     * 通联交易流水号
     */
    private String tongLianTradeNo;

    /**
     * 赠送积分
     */
    private Integer point = 0;

    /**
     * 下单时间
     */
    private long orderTime;

    /**
     * 付款时间
     */
    private long paymentTime;

    /**
     * 促销折扣
     */
    private BigDecimal promotionDiscount;

    /**
     * 优惠券折扣
     */
    private BigDecimal couponDiscount;

    /**
     * 支付状态 0 已支付 1 未支付 2 部分支付
     */
    public String paymentStatus;

    /**
     * 订单状态  0 已完成  1未完成  2已取消
     */
    public String orderStatus;

    /**
     * 推荐人账号（USERID）
     */
    private String referrer;

    /**
     * 分享渠道（进入渠道）
     */
    private String shareType;

    /**
     * 通联支付状态 - 组合支付 0 默认 1 成功 2 处理中 3 失败
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
     * 支付失败原因
     */
    private String failedMsg;

    /**
     * 子订单
     */
    @DBRef
    private List<OrderDO> children = new ArrayList<>();

    /**
     * 微信openid  用作推送使用
     */
    private String openid;

    /**
     * 是否短信提醒 默认未提醒
     */
    private Boolean remindStatus = STATUS_REMIND_NO;

    /**
     * 换购标记
     */
    private Boolean existBuyActivity = FLAG_EXISTBUYACTIVITY_NO;

    /**
     * 使用优惠券id
     */
    private List<String> userCouponIds = new ArrayList<>();

    /**
     * 核心账单生成有状态: true-已生成，false-未生成(默认)
     */
    private boolean billGenerateState = STATE_BILL_GENERATE_FALSE;

    /**
     * 分期期数
     */
    private Integer installmentPeriods;

    /**
     * 本订单的推广员ID
     */
    private String promoterId;
}
