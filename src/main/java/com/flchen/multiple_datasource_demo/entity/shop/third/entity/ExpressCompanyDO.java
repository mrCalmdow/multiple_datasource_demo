package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author only-lilei
 * @create 2018-01-05 下午3:04
 **/
@Document(collection = "expressCompany")
public class ExpressCompanyDO extends BaseDO{
    private String expressComNo;//公司编码
    private String expressCom;//公司名称
    private String explain;//说明
    private String type;//类型
    private String country;//国家编码

    public String getExpressComNo() {
        return expressComNo;
    }

    public void setExpressComNo(String expressComNo) {
        this.expressComNo = expressComNo;
    }

    public String getExpressCom() {
        return expressCom;
    }

    public void setExpressCom(String expressCom) {
        this.expressCom = expressCom;
    }
    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
