package com.flchen.multiple_datasource_demo.entity.shop.account.entity.ro;

import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.UserFavoriteVO;

/**
 * @Author JH.TAO
 * @create 2017-12-28 10:20
 */
public class UserFavoriteRO {
    private UserFavoriteVO userFavorite;

    public UserFavoriteVO getUserFavorite() {
        return userFavorite;
    }

    public void setUserFavorite(UserFavoriteVO userFavorite) {
        this.userFavorite = userFavorite;
    }
}
