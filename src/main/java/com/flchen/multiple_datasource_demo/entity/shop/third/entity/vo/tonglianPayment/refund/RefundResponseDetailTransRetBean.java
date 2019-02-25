package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.refund;

import lombok.Data;

/**
 * 退款结果
 * @author songsy
 * @Date 2018/12/15 10:45
 */
@Data
public class RefundResponseDetailTransRetBean {

    private String RET_CODE; // 返回码

    private String SETTLE_DAY; // 清算日期

    private String ERR_MSG; // 错误文本
}
