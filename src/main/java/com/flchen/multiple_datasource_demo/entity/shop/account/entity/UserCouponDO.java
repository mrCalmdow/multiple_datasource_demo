package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.CashCouponVO;
import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.DiscountCouponVO;
import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.RangeVO;
import com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo.VoucherVO;
import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @create 2017-11-15 下午4:01
 */
@Data
@Document(collection = "userCoupon")
public class UserCouponDO extends BaseDO {

    // /范围类型
    public static final String TYPE_RANGETYPE_ALL = "all";//通用
    public static final String TYPE_RANGETYPE_GOODS = "goods";//限制单品
    public static final String TYPE_RANGETYPE_CATEGORY = "category";//限制分类
    public static final String TYPE_RANGETYPE_SUPPLIER = "supplier";//限制供应商
    public static final String TYPE_RANGETYPE_UNAVAILABLE_GOODS = "unavailableGoods";//限制单品-仅部分商品不可用

    //使用状态
    public static final Boolean FLAG_USE_YES = Boolean.TRUE;
    public static final Boolean FLAG_USE_NO = Boolean.FALSE;

    //冻结状态
    public static final Boolean FLAG_FROZEN_YES = Boolean.TRUE;
    public static final Boolean FLAG_FROZEN_NO = Boolean.FALSE;


    private String couponId; //优惠券对应的id

    private String orderNo;//使用优惠券的父订单

    private String userId;//userId
    private String mobile;//手机号

    private Long useTime;//使用时间

    private Boolean use = Boolean.FALSE; //是否使用

    private Boolean frozen = Boolean.FALSE;//是否冻结

    //优惠券内容

    private VoucherVO voucher;//减满券

    private DiscountCouponVO discountCoupon;//折扣券

    private CashCouponVO cashCoupon;//代金券

    private String name;

    private String content;//内容


    private String type;//优惠券类型

    private String rangeType;//范围类型
    private List<RangeVO> ranges = new ArrayList<>();

    private Long startUsingTime;//开始使用日期
    private Long endUsingTime;//结束使用日期

    private String frozenAdminId;//管理员ID
    private Long frozenTime;//冻结时间


}
