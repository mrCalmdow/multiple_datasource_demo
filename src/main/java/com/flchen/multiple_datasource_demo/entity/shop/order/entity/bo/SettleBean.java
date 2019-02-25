package com.flchen.multiple_datasource_demo.entity.shop.order.entity.bo;

import lombok.Data;

/**
 * @author JH.TAO
 * @create 2018-03-15 16:54
 */
@Data
public class SettleBean {
    private String clearingAmount;//结算金额
    private String mallChildOrderNo;//子订单号
}
