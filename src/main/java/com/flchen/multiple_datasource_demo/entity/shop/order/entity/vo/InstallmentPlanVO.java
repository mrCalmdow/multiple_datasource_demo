package com.flchen.multiple_datasource_demo.entity.shop.order.entity.vo;

import java.math.BigDecimal;

/**
 * @Author JH.TAO
 * @create 2017-12-20 11:02
 */
public class InstallmentPlanVO {

    private String name;//分期名字

    private String plan;//分期计划未定以后更改

    private BigDecimal totalMoney;//分期预计总金额若为不分期则为付款应付款

    private BigDecimal firstPayment;//首付金额

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getFirstPayment() {
        return firstPayment;
    }

    public void setFirstPayment(BigDecimal firstPayment) {
        this.firstPayment = firstPayment;
    }
}
