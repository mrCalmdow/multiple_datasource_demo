package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author JH.TAO
 * @create 2018-04-16 16:29
 */
@Data
@Document(collection = "invitationRecord")
public class InvitationRecordDO extends BaseDO {
    public static final Boolean FLAG_INVITENEWACTIVITIES_SETTLEFLAG_YES = Boolean.TRUE;
    public static final Boolean FLAG_INVITENEWACTIVITIES_SETTLEFLAG_NO = Boolean.FALSE;
    //邀新活动 奖励点
    public static final double INVITATION_RATE = 0.02;

    public static final String TYPE_INVITETYPE_FBDFIRSTPAY = "fbdfirstpay";

    private String parentOrderNo;//首单ID
    private String inviter;//邀请人
    private String invitee;//被邀请人
    private Boolean inviterSettleFlag;//邀请人结算标记
    private Boolean inviteeSettleFlag;//被邀请人结算标记
    private String inviteType;//奖励类型
    private Long invitationDate;//邀请日期

}
