package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo;

/**
 * @author only-lilei
 * @create 2018-01-03 下午3:36
 **/
public class ExpressItemVO {
    String time; //时间，原始格式
    String context; //内容
    String ftime; //格式化后时间

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }
}
