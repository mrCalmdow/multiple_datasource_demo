package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.query;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @outhor ivan
 * @create 2018-07-13 上午10:25
 */
@Data
public class TLQueryResponseVO {
    @JSONField(name = "AIPG")
    private TLQueryResponseDetailVO responseDetail = new TLQueryResponseDetailVO();
}
