package com.flchen.multiple_datasource_demo.client.fbdClient.bo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author feilongchen
 * @since 2019-03-06 2:05 PM
 */
@Data
public class FbdUseLoginRespBO {

    @ApiModelProperty(value = "是否设置交易密码")
    private boolean isPayPassword;
    @ApiModelProperty(value = "是否设置密码")
    private boolean isPassword = true;
    @ApiModelProperty(value = "token信息")
    private String token;
    @ApiModelProperty(value = "商城token信息")
    private String shopToken;
    @ApiModelProperty(value = "用户id")
    private String userId;
    @ApiModelProperty(value = "电话号码")
    private String mobile;
    @ApiModelProperty(value = "扫码支付状态")
    private Integer payScanState;
    @ApiModelProperty("是否需要活体认证")
    private Boolean isFaceVerify;
    @ApiModelProperty(value = "申请状态状态：0-未申请 1-已申请")
    private Integer applyStatus;
}
