package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @author JH.TAO
 * @create 2018-06-25 上午9:11
 */
@Data
@Document(collection = "buyActivity")
public class BuyActivityDO extends BaseDO {


    public static final Integer CONSTANT_LIMIT=99999999;

    //规则类型
    public static final String TYPE_RULETYPE_SIGN = "sign";//单品满
    public static final String TYPE_RULETYPE_ALL = "all";//全场商品累加满

    //单人限量标记
    public static final Boolean FLAG_LIMITFLAG_YES = true;//限量
    public static final Boolean FLAG_LIMITFLAG_NO = false;//不限量

    //投放对象
    public static final String TYPE_USEGROUP = "all";//所有对象

    //换购商品状态
    public static final String STATUS_BUYACTIVIVYSTATUS_UNPUBLISHED = "unpublished";//未发布（默认）
    public static final String STATUS_BUYACTIVIVYSTATUS_SOLDOUT = "soldout";//下架
    public static final String STATUS_BUYACTIVIVYSTATUS_PUTAWAY = "putaway"; //上架

    //定时状态
    public static final String STATUS_TIMER_FINISH = "finish";//定时完成
    public static final String STATUS_TIMER_PLAN = "plan";//定时
    public static final String STATUS_TIMER_NO = "no";//不定时


    private String name;

    private String goodsSkuNo;//商品SKU （商品编号）
    @DBRef
    private GoodsDO goodsDO;//换购商品关联

    private String skuImgUrl;//图片URL

    private BigDecimal price;//换购价格
    private Integer inventory;//商品库存
    private Integer circulation;//发行量

    private String ruleType;//规则类型
    private Double minMoney;//最低购满多少可以购买


//    private Integer limit;//单人限量
//    private Boolean limitFlag;//单人限量标记

    private String status;

    private String upTimerStatus;//定时上架状态
    private String downTimerStatus;//定时下架状态

    private Long planUpDate;//计划上架时间
    private Long planDownDate;//计划下架时间

    private String label;//标签注释

    private String useGroupType;//投放对象

    private Long upDate;//上架日期
    private Long downDate;//下架日期

}
