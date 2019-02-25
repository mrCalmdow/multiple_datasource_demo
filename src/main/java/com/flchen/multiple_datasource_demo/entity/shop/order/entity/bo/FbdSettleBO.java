package com.flchen.multiple_datasource_demo.entity.shop.order.entity.bo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JH.TAO
 * @create 2018-03-15 16:53
 */
@Data
public class FbdSettleBO {
    private List<SettleBean> orderInfoBeans = new ArrayList<>();
    private String systemChannelFlag;
}
