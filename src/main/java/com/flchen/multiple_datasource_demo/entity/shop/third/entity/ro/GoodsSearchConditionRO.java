package com.flchen.multiple_datasource_demo.entity.shop.third.entity.ro;

import java.util.List;

/**
 * @author Beldon
 * @create 2017-12-29 下午2:49
 */
public class GoodsSearchConditionRO {
    private List<String> labels; //标签

    private List<String> brands; //品牌

    private List<GoodsSearchParameterRO> parameters;

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<String> getBrands() {
        return brands;
    }

    public void setBrands(List<String> brands) {
        this.brands = brands;
    }

    public List<GoodsSearchParameterRO> getParameters() {
        return parameters;
    }

    public void setParameters(List<GoodsSearchParameterRO> parameters) {
        this.parameters = parameters;
    }
}
