package com.flchen.multiple_datasource_demo.entity.shop.order.entity.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JH.TAO
 * @create 2018-02-28 17:34
 */
public class PayOrderPushBO {
    private String systemChannelFlag="10";//渠道码
    private List<ConsumeListBO> webMallOrderList =new ArrayList<>();

    public String getSystemChannelFlag() {
        return systemChannelFlag;
    }

    public void setSystemChannelFlag(String systemChannelFlag) {
        this.systemChannelFlag = systemChannelFlag;
    }

    public List<ConsumeListBO> getWebMallOrderList() {
        return webMallOrderList;
    }

    public void setWebMallOrderList(List<ConsumeListBO> webMallOrderList) {
        this.webMallOrderList = webMallOrderList;
    }
}
