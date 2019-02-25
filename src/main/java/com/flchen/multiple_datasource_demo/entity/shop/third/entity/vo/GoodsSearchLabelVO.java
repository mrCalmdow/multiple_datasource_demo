package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo;

/**
 * @author Beldon
 * @create 2017-12-28 下午4:23
 */
public class GoodsSearchLabelVO {
    private String name;
    private int length;
    public GoodsSearchLabelVO() {
    }

    public GoodsSearchLabelVO(String name) {
        this.name = name;
        this.length = name.length();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
