package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsLabelVO;
import com.flchen.multiple_datasource_demo.entity.shop.goods.entity.vo.GoodsSkuVO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @Author JH.TAO
 * @create 2017-12-02 16:03
 */
@Document(collection = "goodsBuyNow")
public class GoodsBuyNowRO extends BaseDO {
    private String id;
    private String goodsName;//商品名
    private GoodsSkuVO goodsSkus;
    private String supplierId;//供应商ID
    private String supplierName;//供应商名字
    private List<GoodsLabelVO> goodsLabelVOS;//商品标签  置顶 ， 包邮  ， 免息  ， 推荐到首页 等等

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public GoodsSkuVO getGoodsSkus() {
        return goodsSkus;
    }

    public void setGoodsSkus(GoodsSkuVO goodsSkus) {
        this.goodsSkus = goodsSkus;
    }

    public List<GoodsLabelVO> getGoodsLabelVOS() {
        return goodsLabelVOS;
    }

    public void setGoodsLabelVOS(List<GoodsLabelVO> goodsLabelVOS) {
        this.goodsLabelVOS = goodsLabelVOS;
    }
}
