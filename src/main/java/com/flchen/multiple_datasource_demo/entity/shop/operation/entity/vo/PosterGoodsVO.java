package com.flchen.multiple_datasource_demo.entity.shop.operation.entity.vo;

import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsLabelVO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author JH.TAO
 * @since 2018-08-13 16:43
 */
@Data
public class PosterGoodsVO {
    private String goodsId;
    private String goodsSkuNo;
    private String imageUrl;//商品图片URL
    private String linkUrl;//链接地址
    private String name;//名字
    private List<GoodsLabelVO> goodsLabelVOS;
    private String dprice;//优惠价格
    private String price;//原价
    private String sellingPoint;//卖点
    private String instalmentPrice;//分期价格
    private BigDecimal minPeriodPrice;//最低月供金额试算
    private String buttonName;//按钮名字
}
