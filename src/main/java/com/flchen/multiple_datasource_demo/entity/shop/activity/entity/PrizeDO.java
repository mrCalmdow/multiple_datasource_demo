package com.flchen.multiple_datasource_demo.entity.shop.activity.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author feilongchen
 * @since 2018-10-16 2:18 PM
 */
@Data
@Document(collection = "prize")
public class PrizeDO extends BaseDO {

    public static final String PRIZE_TYPE_GOODS = "goods";
    public static final String PRIZE_TYPE_COUPON = "coupon";
    public static final String PRIZE_TYPE_NONE = "none";

    // 所属活动id
    private String lotteryId;

    // 奖品序号
    private Integer order;

    // 奖品等级：一、二、三等奖等等
    private String level;

    // 奖项名称：奖品真实物品名字，如苹果手机、100元手机券
    private String prizeName;

    // 奖品图
    private String prizeImage;

    // 奖品类型:商品、券
    private String prizeType;

    // 奖品中奖概率
    private Double rate;

    // 奖品数量
    private Integer quantity;

    // 商品项:商品ID
    private String goodsId;

    // 商品项:skuID
    private String goodsSkuNo;

    // 优惠券ID
    private String couponId;
}
