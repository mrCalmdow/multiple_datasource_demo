package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashSet;

/**
 * @author Beldon
 * @create 2017-11-13 下午1:42
 */
@Document(collection = "parameter")
public class ParameterDO extends BaseDO {
    public final static String TYPE_SYS = "sys"; //系统用户配置的参数
    public final static String TYPE_SUPPLIER = "supplier"; //供应商配置的参数

    private String name; //名字
    private String type = TYPE_SUPPLIER; //类型
    private String userId; //后台添加用户的id

    private LinkedHashSet<String> value;

    public static String getTypeSys() {
        return TYPE_SYS;
    }

    public static String getTypeSupplier() {
        return TYPE_SUPPLIER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LinkedHashSet<String> getValue() {
        return value;
    }

    public void setValue(LinkedHashSet<String> value) {
        this.value = value;
    }
}
