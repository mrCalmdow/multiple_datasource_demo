package com.flchen.multiple_datasource_demo.entity.shop.third.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.ExpressItemVO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author only-lilei
 * @create 2018-01-04 上午10:34
 **/
@Document(collection = "express")
public class ExpressDO extends BaseDO {

    public static final String STATUS_RECEIVED = "3";

    public static final String FLAG_TRUE="0";//已经自动签收
    public static final String FLAG_FALSE="1";//没有自动签收
    /**
     * 后台运营人员确认收货
     */
    public static final String FLAG_MANUAL_RECEIVED = "2";


    public static int EXPRESS_ERROR = 1;
    public static int EXPRESS_SUCCESS = 0;
    private String expressNo;//快递单号
    private String expressComNo;//快递公司编码
    private long addTime;//添加时间
    private long updateTime;//修改时间
    private int isError = EXPRESS_SUCCESS; //快递单是否正确
    private String state;//快递单当前签收状态
    private List<ExpressItemVO> expressItemVOList = new ArrayList<>(); //快递信息
    private String comNew; //快递100纠正后的新的快递公司编码
    private long receivedDate;
    private String timerFlag;

    private String receiverMobile;// 收件人电话，之前的数据没有存，顺丰快递临时需要

    public String getTimerFlag() {
        return timerFlag;
    }

    public void setTimerFlag(String timerFlag) {
        this.timerFlag = timerFlag;
    }

    public long getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(long receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getExpressComNo() {
        return expressComNo;
    }

    public void setExpressComNo(String expressComNo) {
        this.expressComNo = expressComNo;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public List<ExpressItemVO> getExpressItemVOList() {
        return expressItemVOList;
    }

    public void setExpressItemVOList(List<ExpressItemVO> expressItemVOList) {
        this.expressItemVOList = expressItemVOList;
    }

    public int getIsError() {
        return isError;
    }

    public void setIsError(int isError) {
        this.isError = isError;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComNew() {
        return comNew;
    }

    public void setComNew(String comNew) {
        this.comNew = comNew;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }
}
