package com.flchen.multiple_datasource_demo.entity.shop.third.entity.bo;

import lombok.Data;

/**
 * @author feilongchen
 * @since 2018-12-20 4:07 PM
 */
@Data
public class FbdBankCardInfoBO {

    private String bankCard;    // 银行卡号

    private String bankCode;    //银行编号

    private String bankName;    // 银行名

    private String bankPhone;   // 银行预留手机号

    private String realName;    // 真实姓名

    private String cardId;      // 身份证号
}
