package com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo;

/**
 * 亲属
 *
 * @author Beldon
 * @create 2017-11-15 下午3:56
 */
public class RelativesVO {
    private String name; //姓名
    private String mobile; //手机号码
    private String relationship; //关系，直接保存文字
    private String auditStatus; //审核状态

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
