package com.flchen.multiple_datasource_demo.entity.shop.operation.entity.vo;

import lombok.Data;

import java.util.List;

/**
 * @author JH.TAO
 * @since 2018-08-13 18:24
 */
@Data
public class TemplateAreaVO {

    public static final String POST_TEMPLATE_TYPE_ONE = "1";
    public static final String POST_TEMPLATE_TYPE_TEO = "1";
    public static final String POST_TEMPLATE_TYPE_THREE = "1";

    private String type;//模板类型
    private List<PosterGoodsVO> posterGoodsVOS;
}
