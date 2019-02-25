package com.flchen.multiple_datasource_demo.entity.shop.operation.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 首页滚动消息实体
 *
 * @author fl.chen
 * @create 2017-12-01 下午7:04
 **/
@Document(collection = "rollMessage")
public class RollMessageDO extends BaseDO {
    public static boolean STATUS_DISPLAY = true;//显示（默认）
    public static boolean STATUS_HIDDEN = false;//不显示

    private String title;//消息主题
    private String imageUrl;//消息小图标
    private String content;//消息内容
    private int order;//消息序号
    private boolean displayStatus = STATUS_DISPLAY;//是否显示

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(boolean displayStatus) {
        this.displayStatus = displayStatus;
    }

}
