package com.flchen.multiple_datasource_demo.entity.shop.operation.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author JH.TAO
 * @since 2018-08-13 16:43
 */
@Data
public class GoodsAreaVO {
    private String goodsAreaUrl;//图层URL
    private String goodsAreaLabel; //图层标签
    private List<TemplateAreaVO>  templateAreaVOS ;
}
