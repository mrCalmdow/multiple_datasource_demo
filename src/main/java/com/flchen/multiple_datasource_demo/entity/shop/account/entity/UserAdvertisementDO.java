package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.operation.entity.AdvertisementDO;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author JH.TAO
 * @create 2018-01-03 11:27
 */
@Document(collection = "userAdvertisement")
public class UserAdvertisementDO extends BaseDO {
    public static final boolean CLICK_STATUS_NO = false;
    public static final boolean CLICK_STATUS_YES = true;

    private String userId;
    private boolean click = CLICK_STATUS_NO;//点击  true 已经点击  false没有点击（false）默认
    @DBRef
    private AdvertisementDO advertisementDO;

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

    public AdvertisementDO getAdvertisementDO() {
        return advertisementDO;
    }

    public void setAdvertisementDO(AdvertisementDO advertisementDO) {
        this.advertisementDO = advertisementDO;
    }
}
