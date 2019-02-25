package com.flchen.multiple_datasource_demo.entity.shop.operation.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author feilongchen
 * @since 2018-10-31 10:24 AM
 */
@Data
@Document(collection = "homeEntry")
public class HomeEntryDO extends BaseDO {

    public static final Boolean STATE_ACTIVITY = Boolean.TRUE;       // 上线（生效）
    public static final Boolean STATE_INACTIVITY = Boolean.FALSE;    // 下线（失效）

    // 位置
    private Integer order;

    // 主题
    private String title;

    // 图片URL
    private String imageUrl;

    // 跳转URL
    private String linkUrl;

    // 描述
    private String describe;

    // 入口状态：true是生效，false是未生效
    private Boolean state = STATE_ACTIVITY;
}
