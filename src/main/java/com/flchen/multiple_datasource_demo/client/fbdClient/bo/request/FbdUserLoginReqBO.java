package com.flchen.multiple_datasource_demo.client.fbdClient.bo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

/**
 * @author feilongchen
 * @since 2019-03-06 1:53 PM
 */
@Data
public class FbdUserLoginReqBO {

    @ApiModelProperty(value = "手机号")
    @Pattern(regexp = "^1[0-9]{10}$", message = "用户手机号码格式错误")
    private String mobile;
    @NotEmpty(message = "密码不能为空")
    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "openId")
    private String openId;
    @ApiModelProperty(value = "requestId")
    private String requestId;
    @ApiModelProperty(value = "validationCode")
    private String validationCode;
    @ApiModelProperty(value = "gps")
    private String gps;
}
