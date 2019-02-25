package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.CarItemVO;
import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 *
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "shoppingCar")
public class ShoppingCarDO extends BaseDO {

    public final static String STATUS_SHOPPINGCAR_OPERATION_ADD = "add";
    public final static String STATUS_SHOPPINGCAR_OPERATION_SUBTRACT = "subtract";

    private String userId;
    private List<CarItemVO> carItems = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CarItemVO> getCarItems() {
        return carItems;
    }

    public void setCarItems(List<CarItemVO> carItems) {
        this.carItems = carItems;
    }
}
