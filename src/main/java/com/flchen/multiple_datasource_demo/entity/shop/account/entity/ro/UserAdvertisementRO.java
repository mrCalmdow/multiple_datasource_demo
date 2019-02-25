package com.flchen.multiple_datasource_demo.entity.shop.account.entity.ro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author feilongchen
 * @since 2019-01-24 5:52 PM
 */
@Data
public class UserAdvertisementRO implements Serializable {
//    private ObjectId id;

    private String advertisementId;//广告ID
    private boolean click;//点击  0 已经点击  1没有点击（）默认
    private String adName;//标题
    private String imageURL;//图片地址
    private String publishStatus;
    private long publishTime;
    private long publishDate;
    private String contentType;//1-跳转链接（默认）;2-富文本内容
    private String contentLink;//广告跳转地址
}
