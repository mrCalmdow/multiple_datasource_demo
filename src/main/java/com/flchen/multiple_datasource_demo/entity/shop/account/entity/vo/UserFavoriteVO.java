package com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo;

import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsLabelVO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author JH.TAO
 * @create 2017-12-27 15:44
 */
public class UserFavoriteVO {
    public static final boolean STATUS_FAVORITESTATUS_YES = true;
    public static final boolean STATUS_FAVORITESTATUS_NO = false;

    private String goodsId;
    private String goodsName;//商品名
    private String imageUrl;//商品主图片
    private BigDecimal price;// 原价
    private BigDecimal dPrice; // 优惠价(实际价格)
    private List<GoodsLabelVO> goodsLabelVOS;
    private long addTime;//收藏时间

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getdPrice() {
        return dPrice;
    }

    public void setdPrice(BigDecimal dPrice) {
        this.dPrice = dPrice;
    }

    public List<GoodsLabelVO> getGoodsLabelVOS() {
        return goodsLabelVOS;
    }

    public void setGoodsLabelVOS(List<GoodsLabelVO> goodsLabelVOS) {
        this.goodsLabelVOS = goodsLabelVOS;
    }

    public long getAddTime() {
        return addTime;
    }

    public void setAddTime(long addTime) {
        this.addTime = addTime;
    }
}
