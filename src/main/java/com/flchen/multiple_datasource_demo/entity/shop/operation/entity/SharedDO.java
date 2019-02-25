package com.flchen.multiple_datasource_demo.entity.shop.operation.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 分享管理
 *
 * @author fl.chen
 * @create 2017-12-06 下午4:36
 **/
@Data
@Document(collection = "shared")
public class SharedDO extends BaseDO {

    /**
     * 编码：用于标识何时使用
     */
    private String code;

    /**
     * 分享标题
     */
    private String title;

    /**
     * 分享链接
     */
    private String link;

    /**
     * 分享小图标
     */
    private String imageUrl;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否使用默认模板
     */
    private Boolean defaultSate;
}
