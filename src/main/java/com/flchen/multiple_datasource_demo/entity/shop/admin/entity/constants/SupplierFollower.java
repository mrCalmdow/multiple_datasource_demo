package com.flchen.multiple_datasource_demo.entity.shop.admin.entity.constants;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author feilongchen
 * @since 2018-12-22 3:00 PM
 */
@Data
@ApiModel
public class SupplierFollower {

    @ApiModelProperty("管理员ID")
    String id;

    @ApiModelProperty("管理员姓名")
    String name;

    @ApiModelProperty("管理员手机")
    String mobile;
}
