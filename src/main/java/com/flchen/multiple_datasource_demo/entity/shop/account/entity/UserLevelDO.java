package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "userLevel")
public class UserLevelDO {
    private String name;
    private Integer level; //等级
    private Long miniIntegral; //最小积分
    private Long maxiIntegral; //最大积分
}
