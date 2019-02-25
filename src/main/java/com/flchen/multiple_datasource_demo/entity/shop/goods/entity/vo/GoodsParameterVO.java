package com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author JH.TAO
 * @create 2017-11-15 14:01
 */
@Data
public class GoodsParameterVO {
    @ApiModelProperty("参数名")
    @NotBlank
    private String parameterName;
    @ApiModelProperty("参数值")
    @NotBlank
    private String parameterValue;
}
