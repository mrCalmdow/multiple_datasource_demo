package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Beldon
 * @create 2017-11-17 上午9:04
 */
@Document(collection = "smsLog")
public class SmsLogDO extends BaseDO{
    private String mobile; //手机号码
    private String content; //发送内容
    private Date created; //发送的时间
    private Boolean success = Boolean.FALSE; //发送状态

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
