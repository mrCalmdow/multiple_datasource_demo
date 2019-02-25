package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author feilongchen
 * @since 2018-12-17 4:49 PM
 */
@Data
@Document(collection = "supportBank")
public class SupportBankDO extends BaseDO {

    // 银行名称
    private String bankName;

    // 银行编号
    private String bankCode;

    // 使用状态
    private Boolean useState;

    // 图标地址
    private String imageUrl;

    // 颜色编号
    private String colorCode;

    // 单笔限额
    private String singleLimit;

    // 日限额
    private String dayLimit;
}
