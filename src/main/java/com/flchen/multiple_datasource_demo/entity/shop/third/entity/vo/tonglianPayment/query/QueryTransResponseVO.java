package com.flchen.multiple_datasource_demo.entity.shop.third.entity.vo.tonglianPayment.query;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @outhor ivan
 * @create 2018-07-13 下午4:01
 */
@Data
public class QueryTransResponseVO {
    @JSONField(name = "QTDETAIL")
    private List<QueryTransDetailVO> queryTransDetail = new ArrayList<>();
}
