package com.flchen.multiple_datasource_demo.entity.shop.operation.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.operation.entity.vo.AdvertisementVO;
import com.flchen.multiple_datasource_demo.entity.shop.operation.entity.vo.GoodsAreaVO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author JH.TAO
 * @since 2018-08-13 16:41
 */
@Data
@Document(collection = "poster")
public class PosterDO extends BaseDO {
    private String title;//标题
    private String mainImageUrl;//第一图层 URL
    private List<GoodsAreaVO> goodsAreas;//商品区

    private List<AdvertisementVO> advertisementVOS;

    private String ruleContent;//活动规则

    private String color;//颜色

    private String buttonName;//按钮名字
    private String buttonLinkUrl;//按钮链接
    private List<String> linkGoodsId;// 海报所有商品ID

    private String advertisementLinkUrl;

    private String advertisementUrl;

}
