package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.operation.entity.PushDO;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author JH.TAO
 * @create 2018-01-03 17:31
 */
@Document(collection = "userPush")
public class UserPushDO extends BaseDO{
    public static final boolean CLICK_STATUS_NO = false; //没有查看
    public static final boolean CLICK_STATUS_YES = true;//已查看

    private String userId;
    private boolean click = CLICK_STATUS_NO;//点击  true;已查看 false 没有查看（）默认
    @DBRef
    private PushDO pushDO;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean getClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public PushDO getPushDO() {
        return pushDO;
    }

    public void setPushDO(PushDO pushDO) {
        this.pushDO = pushDO;
    }
}
