package com.flchen.multiple_datasource_demo.entity.shop.activity.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author feilongchen
 * @since 2018-10-12 3:23 PM
 */
@Data
@Document(collection = "lottery")
public class LotteryDO  extends BaseDO {

    // 活动状态
    public static final String WAITING_STATUS  = "0";   // 未生效
    public static final String ACTIVITY_STATUS = "1";  // 活动中
    public static final String OVERTIME_STATUS = "2"; // 过期
    public static final String DISABLE_STATUS = "3"; // 手动禁用


    // 活动名称
    private String name;

    // 活动描述
    private String describe;

    // 活动开始时间
    private Long startTime;

    // 活动结束时间
    private Long endTime;

    // 领奖开始时间
    private Long validAwardStartTime;

    // 领奖结束时间
    private Long validAwardEndTime;

    // 活动状态
    private String state;

//    // 奖品项
//    @DBRef
//    private List<PrizeDO> prizes;

    // 每日可抽奖次数
    private Integer timesPerDay;

    // 每人最多可中奖次数
    private Integer awardsTimePerPerson;

    // 活动规则说明
    private String rules;

//    // 活动页面背景图url
//    private String backgroundImageUrl;

    // 活动背景颜色码
    private String backgroundColor;

    // 活动页面banner图url
    private String bannerImageUrl;
}
