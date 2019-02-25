package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户组
 *
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "userGroup")
public class UserGroupDO extends BaseDO {
    /**
     * 分组名字
     */
    private String name;
    /**
     * 分组描述
     */
    private String description;


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
}
