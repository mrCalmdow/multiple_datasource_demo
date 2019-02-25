package com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 订单--发票子类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
@Data
public class InvoiceVO {
    public static final String TYPE_KINDS_ELECTRONIC = "electronic";

    public static final String TYPE_INVOICETYPE_PERSONAL="personal";
    public static final String TYPE_INVOICETYPE_COMPANY="company";


    @ApiModelProperty("发票类型(electronic(电子))")
    private String kinds; //发票类型  电子发票  纸质发票 收据？

    @ApiModelProperty("发票抬头")
    private String invoiceTitle;  // 发票抬头

    @ApiModelProperty("发票抬头类型") //个人 单位
    private String invoiceType;

    @ApiModelProperty("纳税人识别号")
    private String taxpayerNo;

    @ApiModelProperty("开票内容")
    private String invoiceContent;//开票内容(商品明显)

    @ApiModelProperty("开票金额")
    private String invoiceAmount;//开票金额

    @ApiModelProperty("手机号码")
    private String mobile;

    @ApiModelProperty("email")
    private String email;

}
