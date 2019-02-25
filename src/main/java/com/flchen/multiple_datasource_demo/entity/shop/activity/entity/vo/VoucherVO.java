package com.flchen.multiple_datasource_demo.entity.shop.activity.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 满减券
 *
 * @author JH.TAO
 * @create 2018-05-30 下午5:25
 */
@Data
public class VoucherVO {
    @ApiModelProperty("优惠金额")
    private BigDecimal preferentialAmount;//优惠金额
    @ApiModelProperty("最低使用金额")
    private BigDecimal minAmount;//最低使用金额
}
