package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo;

/**
 * @author Beldon
 * @create 2017-12-27 上午11:26
 */
public class GoodsSearchParameterVO {
    private String parameterName;
    private String parameterValue;

    private int parameterNameLength;
    private int parameterValueLength;

    public GoodsSearchParameterVO() {
    }

    public GoodsSearchParameterVO(String parameterName, String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;

        this.parameterNameLength = parameterName.length();
        this.parameterValueLength = parameterValue.length();
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public int getParameterNameLength() {
        return parameterNameLength;
    }

    public void setParameterNameLength(int parameterNameLength) {
        this.parameterNameLength = parameterNameLength;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public int getParameterValueLength() {
        return parameterValueLength;
    }

    public void setParameterValueLength(int parameterValueLength) {
        this.parameterValueLength = parameterValueLength;
    }
}
