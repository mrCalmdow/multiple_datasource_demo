package com.flchen.multiple_datasource_demo.entity.shop.order.entity.bo;

import lombok.Data;

/**
 * @author JH.TAO
 * @create 2018-02-28 17:38
 */
@Data
public class ConsumeListBO {
    private String mallParentMallOrderNo;// 商城父订单编号
    private String mallChildMallOrderNo;// 商城子订单编号
    private String merchantNo;//供应商商户号
    private String amount;//子订单金额
    private String price;//单价
    private String count;//数量
    private String membershipCard;//会员账号
    private String term;//分期期数
    private String rebateRate;//返点比例
    private String settleAmount;//结算金额
    private String lawPersonId;// 法人ID
    private String goodsName;//商品名称

}
