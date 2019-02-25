package com.flchen.multiple_datasource_demo.entity.shop.order.entity;

import com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo.AfterSaleVO;
import com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo.OrderInfoVO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderPendingResponseRO {
    private String userId;//会员ID

    private String orderNo;//订单编号

    private String orderStatus;//订单状态

    private String goodsName;//商品信息

    private BigDecimal paymentAmount;//实际付款金额(实付金额)

    private String mobile;//会员账号

    private String userName;//会员姓名

    private BigDecimal settlementAmount;//结算单价

    private BigDecimal settlementTotalAmount;//结算金额

    private long orderTime;//订单时间

    private String receiverName;//收货人姓名

    private BigDecimal couponDiscount;//优惠券

    private BigDecimal fbdDiscount; // 富宝袋折扣金额

    private BigDecimal buyActivityPrice;//换购金额

    private long deliveryTime;//发货日期

    private String supplierName;//供应商名称

    private String buyActivityId;//换购ID

    private String marque;//商品货号

    private String payWays;//支付类型

    private String payType;//支付

    private BigDecimal fbdPayGroupPayment;// 富宝袋支付金额

    private BigDecimal tongLianPayAmount;// 银行卡支付金额

    private BigDecimal thirdPayPayment;// 微信支付金额

    private String tradeNo;//微信交易流水号

    private String tongLianTradeNo;//通联交易流水号

    private OrderInfoVO orderInfoVO; //订单明细

    private AfterSaleVO afterSaleVO;

    private String accountBalanceStatus;
}
