package com.flchen.multiple_datasource_demo.entity.shop.activity.entity;

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
 * @author JH.TAO
 * @create 2018-05-30 下午4:23
 */
@Data
@Document(collection = "coupon")
public class CouponDO extends BaseDO {
    //领取方式
    public static final String TYPE_PAYMENT_LINK = "link";
    public static final String TYPE_PAYMENT_DRAW = "draw";//抽奖获取

    //单人限量
    public static final boolean FLAG_LIMITFLAG_YES = true;
    public static final boolean FLAG_LIMITFLAG_NO = false;

    //默认发行量（不限量）
    public static final Integer INT_CIRCULATION = 99999999;
    //默认单人使用量（不限量）
    public static final Integer INT_MAXUSE = 99999999;
    //优惠券类型
    public static final String TYPE_MJQ = "mjq";//满减券
    public static final String TYPE_DBQ = "dbq";//代币券
    public static final String TYPE_ZKQ = "zkq";//折扣券

    //优惠券状态
    public static final String STATUS_ONLINE = "online";//上线
    public static final String STATUS_UNPUBLISH = "unpublish";//未发布
    public static final String STATUS_DOWNLINE = "downline";//下架

    // 优惠券适用对象
    public static final String TYPE_USEGROUP_ALL = "all";//所有对象
    public static final String TYPE_USEGROUP_FIRST_REGISTER ="firstRegister";// 新注册用户
    public static final String TYPE_USEGROUP_FIRST_ORDER ="firstOrder";// 首次下单用户

    //冻结状态
    public static final Boolean FLAG_FROZEN_YES = Boolean.TRUE;
    public static final Boolean FLAG_FROZEN_NO = Boolean.FALSE;

    //手动领取
    public static final Boolean FLAG_MANUALPICKUPFLAG_YES = Boolean.TRUE;
    public static final Boolean FLAG_MANUALPICKUPFLAG_NO = Boolean.FALSE;

    // /范围类型
    // /范围类型
    public static final String RANGETYOE_ALL = "all";//通用
    public static final String RANGETYOE_GOODS = "goods";//限制单品-仅部分商品可用
    public static final String RANGETYOE_CATEGORY = "category";//限制分类
    public static final String RANGETYOE_SUPPLIER = "supplier";//限制供应商
    public static final String RANGETYOE_UNAVAILABLE_GOODS = "unavailableGoods";//限制单品-仅部分商品不可用

    public static final String STATUS_TIMERSTATUS_NO = "no";
    public static final String STATUS_TIMERSTATUS_WAIT = "wait";
    public static final String STATUS_TIMERSTATUS_SUCCESS = "success";

    private String activityNo; // 优惠券活动编号

    private String name; // 优惠券名称

    private String type; // 优惠券类型

    private String useGroup; // 优惠券适用对象

    private Long startUsingTime;// 开始使用日期

    private Long endUsingTime;// 结束使用日期

    private String rangeType;// 范围类型

    private List<RangeVO> ranges = new ArrayList<>(); // 使用范围

    private Long activityStartTime;// 优惠券活动开始时间

    private String status; // 状态

    private List<String> payment; // 领取方式

    private Boolean limitFlag; // 是否单人限量

    private Boolean residualLimitFlag; // 是否库存限量

    private Integer circulation; // 投放数量

    private Integer residualQuantity; // 库存数量

    private Integer maxUse; // 单人最大领取量

    private VoucherVO voucher;// 减满券

    private DiscountCouponVO discountCoupon;// 折扣券

    private CashCouponVO cashCoupon;// 代金券

    private Long onlineTime;// 上线时间

    private String timerStatus;// 定时任务状态

    private String content;// 内容

    private Boolean frozen = Boolean.FALSE;// 是否冻结

    private String frozenAdminId;// 冻结人id

    private Long frozenTime;// 冻结时间

    private Boolean qrCodeImageReceiveFlag = Boolean.FALSE; // 是否只能二维码领取 true（只能用二维码扫码领取）

    private Boolean manualDistributionFlag = Boolean.FALSE; // 是否手动发放 通过后台批量发放功能进行发放

    private Boolean manualPickUpFlag; // 是否能手动领取  true(可以)  false(不可以) 不可以的话在领券中心领取不到

    private Boolean customRedirect;    // 是否自定义跳转地址，true表示自定义URL，false表示默认跳转到商城列表页面

    private String redirectUrl;     // 跳转URL

}
