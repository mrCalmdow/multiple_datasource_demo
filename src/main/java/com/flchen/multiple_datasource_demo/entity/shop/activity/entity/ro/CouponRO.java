package com.flchen.multiple_datasource_demo.entity.shop.activity.entity.ro;

import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.CashCouponVO;
import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.DiscountCouponVO;
import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.RangeVO;
import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.VoucherVO;
import lombok.Data;

/**
 * @author JH.TAO
 * @create 2018-06-07 下午2:21
 */
@Data
public class CouponRO {

    private String id;
    private String activityNo;//优惠券活动编号
    private String name;//优惠券名称
    private String type;//优惠券类型

    private String useGroup;//投放对象

    private Long startUsingTime;//开始使用日期
    private Long endUsingTime;//结束使用日期

    private String rangeType;//范围类型

    private RangeVO range;

    private Long activityStartTime;

    private String status;//状态

    //是否限量
    private Boolean limitFlag;

    private Integer circulation;//投放数量

    private Integer residualQuantity;//库存

    private Integer maxUse;//单人最大领取量


    private VoucherVO voucher;//减满券

    private DiscountCouponVO discountCoupon;//折扣券

    private CashCouponVO cashCoupon;//代金券

    private Long onlineTime;//上线时间

    private String TimerStatus;//定时任务状态

    private String content;//内容

    private Boolean frozen = Boolean.FALSE;//是否冻结

}
