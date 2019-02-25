package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.query;

import com.alibaba.fastjson.annotation.JSONField;
import com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.ResponseInfoVO;
import lombok.Data;

/**
 * @outhor ivan
 * @create 2018-07-13 下午3:56
 */
@Data
public class TLQueryResponseDetailVO {
    @JSONField(name = "INFO")
    private ResponseInfoVO responseInfo = new ResponseInfoVO();

    @JSONField(name = "QTRANSRSP")
    private QueryTransResponseVO queryTransResponse = new QueryTransResponseVO();
}
