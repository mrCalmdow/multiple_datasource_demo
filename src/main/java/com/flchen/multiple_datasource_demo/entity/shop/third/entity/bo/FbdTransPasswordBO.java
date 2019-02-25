package com.flchen.multiple_datasource_demo.entity.shop.third.entity.bo;

import lombok.Data;

/**
 * @author songsy
 * @Date 2018/12/20 9:40
 */
@Data
public class FbdTransPasswordBO {
    /**
     * 密码是否正确 ture：正确 false：错误
     */
    private Boolean status;
    /**
     * 密码错误信息
     */
    private String payMsg;
    /**
     * 密码验证错误之后可以再试的次数
     */
    private Integer pwdCount;

}
