package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "dataBuryingPoint")
public class DataBuryingPointDO extends BaseDO {

    private String userId;
    private String deviceId;
    private String page;
    private String action;
    private String event;
    private String type;
    private long sendTime;
    private String attribute;
    private String channel;
    private String deviceNum;
    private String eventLable;
    private long eventTime;
    private String stage;
    private String traceId;


}
