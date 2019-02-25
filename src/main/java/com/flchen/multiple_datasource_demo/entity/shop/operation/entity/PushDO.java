package com.flchen.multiple_datasource_demo.entity.shop.operation.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @outhor chen
 * @create 2017-12-13 22:34
 */
@Data
@Document(collection = "push")
public class PushDO extends BaseDO {

    public static final String TYPE_PUBLISHTYPE_IMMEDIATELY = "1";//立即发布
    public static final String TYPE_PUBLISHTYPE_TIMER = "2";//定时发布
    public static final String TYPE_PUBLISHTYPE_TEMPORARILYNOT = "3";//暂不发布
    public static final String TYPE_PUBLISHTYPE_FINISH = "4";//发布完成

    public static final String STATUS_PUBLISH_NOTPUBLISH = "1";//未发布
    public static final String STATUS_PUBLISH_PUBLISHED = "2";//已发布
    public static final String STATUS_PUBLISH_OFFLINE = "3"; // 下线

    public static final String STATUS_PUSH_NOTPUSH = "0";//暂未推送
    public static final String STATUS_PUBSH_SUCCESS = "1";//推送成功
    public static final String STATUS_PUSH_FAILURE = "2";//推送失败


    //对应文章分类
    public static final String CATEGORY_PUSH_HOME = "1";//首页
    public static final String CATEGORY_PUSH_LISTPAGE = "2";//系统消息
    public static final String CATEGORY_PUSH_ALL = "0";//全部位置


    private String title;//文章标题
    private String category;//文章分类
    private List<String> target;//推送对象
    private String publishType;//发布类型
    private long publishTime;//定时发布时间
    private String richText;//文章内容

    private long publishDate; //发布日期
    private long amount;//推送人数
    private String publishStatus;//发布状态
    private String pushResult;//推送状态 (暂时无用)
    private long inputTime;//录入时间
}