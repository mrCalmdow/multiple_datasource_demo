package com.flchen.multiple_datasource_demo.entity.shop.order.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author JH.TAO
 * @create 2018-02-28 13:56
 */
@Document(collection = "orderPushCore")
@Data
public class OrderPushCoreDO extends BaseDO {
    public static final String STATUS_ORDERPUSHCORE_PUSHSTATUS_SUCCESS = "0";//推送成功
    public static final String STATUS_ORDERPUSHCORE_PUSHSTATUS_FAIL = "1";//未推送

    public static final String TYPE_ORDERPUSHCORE_PUSHTYPE_PAY = "0";//支付成功推送
    public static final String TYPE_ORDERPUSHCORE_PUSHTYPE_REFUND = "1";//退款成功推送
    public static final String TYPE_ORDERPUSHCORE_FBD_SETTLE = "2";//订单发货结算信息推送

    private String parentOrderNo;//父订单编号
    private String orderNo;//父订单编号
    private String pushType;//推送类型 0  支付成功推送   1  退款成功推送   2  订单发货结算信息推送
    private String pushStatus;//推送状态  0  推送成功   1  未推送（推送失败）
    private Integer pushCount;//推送次数
}
