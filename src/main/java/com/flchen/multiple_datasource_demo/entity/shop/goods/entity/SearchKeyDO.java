package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author JH.TAO
 * @create 2018-07-27 下午2:15
 */
@Data
@Document(collection = "searchKey")
public class SearchKeyDO extends BaseDO {
    private String key;//关键字
    private String clientId;//客户端ID
}
