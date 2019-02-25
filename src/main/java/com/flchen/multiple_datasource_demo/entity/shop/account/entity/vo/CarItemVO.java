package com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo;

import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsParameterVO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author JH.TAO
 * @create 2017-12-04 16:07
 */
public class CarItemVO {
    private String groupCouponId;// 凑单分组使用优惠券ID
    private String goodsId;//商品ID
    private String goodsName;//商品名
    private String supplierId;//供应商ID
    private String supplierName;//供应商名字
    private String goodsSkuNo;//商品SKU
    private Integer quantity;//数量
    private String thumbnail;//商品缩略图
    private BigDecimal price;// 原价
    private BigDecimal dPrice; // 优惠价(实际价格)
    private List<GoodsParameterVO> goodsParameters;//商品参数

    public String getGroupCouponId() {
        return groupCouponId;
    }

    public void setGroupCouponId(String groupCouponId) {
        this.groupCouponId = groupCouponId;
    }

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

    public String getGoodsSkuNo() {
        return goodsSkuNo;
    }

    public void setGoodsSkuNo(String goodsSkuNo) {
        this.goodsSkuNo = goodsSkuNo;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public List<GoodsParameterVO> getGoodsParameters() {
        return goodsParameters;
    }

    public void setGoodsParameters(List<GoodsParameterVO> goodsParameters) {
        this.goodsParameters = goodsParameters;
    }
}
