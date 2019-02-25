package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Beldon
 * @create 2017-11-17 上午9:21
 */
@Document(collection = "validCode")
public class ValidCodeDO extends BaseDO {


    public static final String TYPE_REGISTER = "register"; //注册验证码
    public static final String TYPE_FIND_PASSWD = "findPass"; //找回密码
    public static final String TYPE_LOGIN="login";
    public static final String TYPE_BINDING = "registerExt"; //绑定推广员

    @Indexed
    //手机号
    private String mobile;
    //发送的验证码
    private String code;
    //发送时间
    private Date sendAt;
    //是否已使用
    private boolean used;

    private String type;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getSendAt() {
        return sendAt;
    }

    public void setSendAt(Date sendAt) {
        this.sendAt = sendAt;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
