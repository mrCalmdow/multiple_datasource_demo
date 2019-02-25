package com.flchen.multiple_datasource_demo.entity.shop.third.entity.ro;

import java.util.List;

/**
 * @author Beldon
 * @create 2017-12-29 下午2:50
 */
public class GoodsSearchParameterRO{
    private String name;
    private List<String> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

}
