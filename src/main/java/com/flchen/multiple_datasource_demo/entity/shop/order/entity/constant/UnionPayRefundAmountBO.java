package com.flchen.multiple_datasource_demo.entity.shop.order.entity.constant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author feilongchen
 * @since 2018-12-27 3:54 PM
 */
@Data
@ApiModel
public class UnionPayRefundAmountBO {

    @ApiModelProperty("通联银行卡退款金额")
    private BigDecimal unionRefundAmount;

    @ApiModelProperty("富宝袋退款金额")
    private BigDecimal fbdRefundAmount;
}
