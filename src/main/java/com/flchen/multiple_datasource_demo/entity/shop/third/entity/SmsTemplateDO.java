package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author only-lilei
 * @create 2018-01-16 上午10:16
 **/
@Document(collection = "smsTemplate")
public class SmsTemplateDO extends BaseDO {
    public final static String TYPE_CODE = "1";
    public final static String TYPE_NOTICE = "2";
    public final static String TYPE_MARKET = "3";

    public final static String THEME_REGISTER = "register";//注册
    public final static String THEME_FIND_PWD = "findPass";//修改密码
    public final static String THEME_SHIPMENT = "shipment";//发货
    public final static String THEME_CLOSE_ORDER = "closeOrder";//关闭订单
    public final static String THEME_REFUND_APPLY = "refundApply";//退款申请
    public final static String THEME_REFUND_SUCCESS = "refundSuccess";//退款成功
    public final static String THEME_REFUND_GOODS_APPLY = "refundGoodsApply";//退货退款申请

    private String type;//消息类型，1、验证码，2、通知，3、营销
    private String theme; //主题
    private String templateId; //模板ID
    private String content; //模板内容

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
