package com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo;

/**
 * 推荐记录
 *
 * @author Beldon
 * @create 2017-11-15 下午4:36
 */
public class RecommendRecordVO {

    private String userId; //用户id
    private String userAccount; //用户账户
    private String userMobile; //用户手机
    private long created; //创建时间

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
