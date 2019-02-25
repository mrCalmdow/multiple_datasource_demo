package com.flchen.multiple_datasource_demo.entity.shop.operation.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * 广告类实体，如需在列表页面显示，则需要增加商品列表类型属性
 */
@Data
@Document(collection = "advertisement")
public class AdvertisementDO extends BaseDO {

    public static final String STATUS_PUBLISHSTATUS_UNPUBLISHED = "1";//未发布
    public static final String STATUS_PUBLISHSTATUS_PUBLISHED = "2";//已发布
    public static final String STATUS_PUBLISHSTATUS_OFFLINE = "3";//已下线
    public static final String STATUS_PUBLISHSTATUS_ALL = "0";//全部状态

    public static final String TYPE_PUBLISHTYPE_IMMEDIATELY = "1";//立即发布
    public static final String TYPE_PUBLISHTYPE_TIMER = "2";//定时发布
    public static final String TYPE_PUBLISHTYPE_TEMPORARILYNOT = "3";//暂不发布
    public static final String TYPE_PUBLISHTYPE_FINISH = "4";//定时发布完成

    public static final String TYPE_OFFLINETYPE_NEVER = "1";//长期有效(不下线)
    public static final String TYPE_OFFLINETYPE_TIMER = "2";//定时下线
    public static final String TYPE_OFFLINETYPE_FINISH = "3";//定时下线完成


    public static final String POSITION_ADPOSITION_HOMEPAGE = "1";//首页banner
    public static final String POSITION_ADPOSITION_LISTPAGE = "2";//用户列表页
    public static final String POSITION_ADPOSITION_ALL = "0";//全部位置
    public static final String POSITION_ADPOSITION_HOMEPOPUP = "3";//首页弹窗

    public static final String TYPE_CONTENTTYPE_RICHTEXT = "2";//富文本
    public static final String TYPE_CONTENTTYPE_LINK = "1";//跳转链接

    private String adName;//广告名称
    private String position = POSITION_ADPOSITION_HOMEPAGE;//投放位置,1-首页（默认）;2-列表页; 0-全部
    private List<String> target;//投放对象
    private Long amount = 0L;//投放人数
    private String publishStatus = STATUS_PUBLISHSTATUS_UNPUBLISHED;//发布状态
    private Long hits = 0L;//点击量

    private String publishType = TYPE_PUBLISHTYPE_IMMEDIATELY;//1-立即发布（默认); 2-定时发布; 3-暂不发布
    private long publishTime;//定时发布时间
    private String offlineType = TYPE_OFFLINETYPE_NEVER;//1-长期有效（默认）; 2-定时下线
    private long offlineTime;//定时下线时间
    private String imageURL;//图片地址
    private String contentType = TYPE_CONTENTTYPE_LINK;//1-跳转链接（默认）;2-富文本内容
    private String contentLink;//广告跳转地址
    private String richText;//富文本内容
    private long publishDate;//广告发布日期
    private long offlineDate;//广告下线日期
}
