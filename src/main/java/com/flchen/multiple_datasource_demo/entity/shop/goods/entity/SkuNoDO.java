package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author JH.TAO
 * @create 2018-03-19 10:24
 */
@Data
@Document(collection = "skuNo")
public class SkuNoDO extends BaseDO {
    private String skuNo;//库存编号
    private Integer prefix;//分类号，SKU前缀
}
