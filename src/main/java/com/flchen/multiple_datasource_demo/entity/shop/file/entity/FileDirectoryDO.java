package com.flchen.multiple_datasource_demo.entity.shop.file.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 文件id
 *
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "fileDirector")
public class FileDirectoryDO extends BaseDO {

    private String name;
    private String description;
    private String parentId;
    private Integer sort;//排序

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
