package com.flchen.multiple_datasource_demo.entity.shop.file.entity;

import lombok.Data;

/**
 * @author songsy
 * @Create 2019/01/18 13:47
 */
@Data
public class FileOssBO {
    /**
     * 文件地址
     */
    private String url;
    /**
     * 文件名称
     */
    private String fileName;
}
