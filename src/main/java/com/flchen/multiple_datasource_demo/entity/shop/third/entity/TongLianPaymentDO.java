package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.ProtocolPayRefundResponseVO;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.ProtocolPaymentResponseVO;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.TLSingleResponseVO;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.query.TLQueryResponseVO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author feilongchen
 * @since 2018-12-13 10:27 AM
 */
@Document(collection = "tonglianPayment")
@Data
public class TongLianPaymentDO extends BaseDO {
    public static final String REFUND_STATUS_SUCCESS = "1";
    public static final String REFUND_STATUS_DEFAULT = "0";
    public static final String REFUND_STATUS_FAILED = "2";

    /**
     * 银行账号
     */
    private String accountNo;

    /**
     * 账号名称
     */
    private String accountName;

    /**
     * 银行编码
     */
    private String bankCode;

    /**
     * 身份证号码
     */
    private String certId;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 流水号
     */
    private String sourceOrderNo;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 退款状态
     */
    private String refundStatus;

    /**
     * 来源渠道
     */
    private String sourceChannel;

    /**
     * 金额
     */
    private BigDecimal amount;


    /**
     * 开户省
     */
    private String province;

    /**
     * 开户市
     */
    private String city;

    /**
     * 开户支行名称
     */
    private String bankName;

    /**
     * 商户类型(1.富龙 2.富之富)
     */
    private Integer merchantType;

    /**
     * 协议号
     */
    private String protocolNo;

    /**
     * 流水类型：1- 协议支付  2- 单笔代付（退款） 3- 查询
     */
    private String paymentType;

    /**
     * 单笔代付通联返回信息
     */
    private TLSingleResponseVO tlSingleResponseVO = new TLSingleResponseVO();

    /**
     * 协议支付通联返回信息
     */
    private ProtocolPaymentResponseVO protocolPaymentResponse = new ProtocolPaymentResponseVO();

    /**
     * 查询通联返回参数
     */
    private TLQueryResponseVO tlQueryResponse = new TLQueryResponseVO();

    /**
     * 退款返回信息
     */
    private ProtocolPayRefundResponseVO protocolPayRefundResponseVO = new ProtocolPayRefundResponseVO();
}
