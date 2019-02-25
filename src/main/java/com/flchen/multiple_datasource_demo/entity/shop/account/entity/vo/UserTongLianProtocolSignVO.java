package com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo;

import lombok.Data;

/**
 * @author feilongchen
 * @since 2018-12-13 10:46 AM
 */
@Data
public class UserTongLianProtocolSignVO {

    public static final String SIGNED_STATUS_SUCCESS = "0"; // 签约成功
    public static final String SIGNED_STATUS_HANDING = "1"; // 处理中
    public static final String SIGNED_STATUS_TERMINAL = "2"; // 已解约

    public static final Boolean DEFAULT_PAY_CARD_YES = Boolean.TRUE; // 默认卡
    public static final Boolean DEFAULT_PAY_CARD_NO = Boolean.FALSE; // 非默认卡

    public static final String TYPE_ID_CARD = "0";  // 身份证

    private String signState; // 是否签约成功

    private String protocolNo;  // 协议号

    private String userName;    // 姓名

    // 可用来唯一标识；每个银行卡只保存一条记录，避免同一张卡尝试多次
    private String bankCardNo;  // 银行卡号

    private String bankCode;    // 银行编码

    private String bankName;    // 银行名

    private String cardType; //银行卡类型：1借记卡，2准贷记卡，3贷记卡，4预付卡

    private String idType = TYPE_ID_CARD;  // 证件类型

    private String idNo;    // 证件号

    private String telephone;   // 银行预留手机号

    private Long createTime;    // 创建时间

    private Long signTime;  // 签约时间

    private String remark;  // 失败原因等备注

    private Boolean defaultPayCard = DEFAULT_PAY_CARD_NO; // 是否为默认支付卡
}
