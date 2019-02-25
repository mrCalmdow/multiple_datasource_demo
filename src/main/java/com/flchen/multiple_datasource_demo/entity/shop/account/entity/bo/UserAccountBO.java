package com.flchen.multiple_datasource_demo.entity.shop.account.entity.bo;


/**
 * @Author JH.TAO
 * @create 2018-01-13 17:10
 */
public class UserAccountBO {
    private String account; //账号
    private String userId;
    private String realName; //真实姓名
    private String cardId; //证件id
    private long createdTime;//创建时间
    private String bankCard; //银行卡号

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }


    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }
}
