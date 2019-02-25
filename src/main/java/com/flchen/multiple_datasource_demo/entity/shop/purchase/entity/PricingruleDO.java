package com.flchen.multiple_datasource_demo.entity.shop.purchase.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;

/**
 * @author JH.TAO
 * @create 2018-04-04 15:09
 */
@Data
public class PricingruleDO extends BaseDO {
    //规则类型
    public final static String TYPE_RULETYPE_INCREASERATE = "increase";//加价率
    public final static String TYPE_RULETYPE_PROFITRATE = "profit";//毛利率

    public final static Integer LEVEL_ALLOWLEVEL_PRIMARY = 1;//初审通过(业务员)
    public final static Integer LEVEL_ALLOWLEVEL_TWO = 2;//经理通过（经理）
    public final static Integer LEVEL_ALLOWLEVEL_FINAL = 3;//总经理通过（总经理）

    private String categoryId;//分类ID
    private Double startProfitRate;//起始利润率（可以等于）
    private Double endProfitRate;//结束利润率（不等）
    private Double startIncreaseRate;//起始加价率（可以等于）
    private Double endIncreaseRate;//结束加价率（不等）
    private Integer allowLevel; //最终同意等级
    private String ruleType; //规则类型

}
