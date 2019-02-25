package com.flchen.multiple_datasource_demo.entity.shop.activity.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * @author feilongchen
 * @since 2018-10-16 3:05 PM
 */
@Data
public class DrawLotteryRecordDO extends BaseDO {

    public static final Boolean HAS_AWARD = Boolean.TRUE;
    public static final Boolean HAS_NOT_AWARD = Boolean.FALSE;

    public static final Boolean ACCEPTFLAG_NO = Boolean.FALSE;//没领取
    public static final Boolean ACCEPTFLAG_YES = Boolean.TRUE;//已经领取


    //手机
    private String mobile;

    private String userId;

    // 奖品信息
    @DBRef
    private PrizeDO prize;

    // 抽奖活动id
    @Indexed
    private String lotteryId;

    // 抽奖时间
    private Long drawTime;

    // 是否中奖
    private Boolean hasAward;

    // 领奖时间
    private Long acceptTime;

    //是否领奖
    private Boolean acceptFlag;

    //用户优惠券
    private String userCouponId;

//    // 抽奖次数
//    public Integer drawTimes;

//    // 中奖次数
//    public Integer awardTimes;
}
