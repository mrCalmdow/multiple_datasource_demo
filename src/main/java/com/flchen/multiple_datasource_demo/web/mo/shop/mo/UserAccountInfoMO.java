package com.flchen.multiple_datasource_demo.web.mo.shop.mo;

import lombok.Data;

/**
 * @author feilongchen
 * @since 2019-02-20 7:18 PM
 */
@Data
public class UserAccountInfoMO {

    private String userId;

    private String mobile;

    private String userName;

    private String realName; //真实姓名

    private String cardId; //证件id
}
