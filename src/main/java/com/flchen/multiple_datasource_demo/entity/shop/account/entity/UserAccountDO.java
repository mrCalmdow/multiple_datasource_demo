package com.flchen.multiple_datasource_demo.entity.shop.account.entity;


import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.ReceiveAddressVO;
import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.RecommendRecordVO;
import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.RelativesVO;
import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.UserFavoriteVO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Data
@Document(collection = "userAccount")
public class UserAccountDO extends BaseDO {
    public final static String STATUS_USERSTATUS_REALNAME_NOAUTHENTICATION = "0";//没有实名认证
    public final static String STATUS_USERSTATUS_REALNAME_AUTHENTICATION = "1";//已经实名认证
    public final static String STATUS_USERSTATUS_NOLIMIT = "2";//没有申请额度
    public final static String STATUS_USERSTATUS_HADLIMIT = "3";//已经申请额度
    public final static String STATUS_USERSTATUS_ORDER = "4";//已经下单
    public final static String STATUS_USERSTATUS_UNKNOW = "5";//未知

    public static final String STATUS_DATAADDRESS_NEW = "new";
    public static final String STATUS_DATAADDRESS_OLD = "old";

    public static final String RESOURCE_USER_FROM_FBD = "FBD_SYNC";
    public static final String RESOURCE_USER_FROM_STORE = "STORE_H5";

    // 普通会员
    public static final String TYPE_ACCOUNT_NORMAL = "normal";
    // 推广员
    public static final String TYPE_ACCOUNT_PROMOTER = "promoter";

    // 账号绑定关系-正常绑定中
    public static final String STATUS_ACCOUNT_BIND_NORMAL = "0";
    // 账号绑定关系-解除
    public static final String STATUS_ACCOUNT_BIND_RELIEVE = "1";
    // 账号绑定关系-重新绑定
    public static final String STATUS_ACCOUNT_BIND_REBIND = "2";

    // 默认推广员与合作伙伴关系绑定天数
    public static final int PROMOTER_BIND_REMAIN_DAYS = 365;
    public static final int NORMAL_BIND_REMAIN_DAYS = 365;

    private String userId;
    private String account; //账号
    private String username; //用户名
    private String avatar; //头像
    private String mobile; //手机号码
    private String email; //邮箱
    private String qq;
    private String wechat;
    private String openId;

    private Long integral = 0L; //积分
    private BigDecimal totalConsumption = new BigDecimal(0); //累计消费

    private String realName; //真实姓名
    private String cardId; //证件id

    private Boolean realNameStatus; //是否实名认证
    private long realNameDate; //实名认证时间

    private String registerFrom; //注册来源
    private long registerDate; //注册时间
    private String userStatus;//会员状态

    /**
     * 推荐人 存的是userId
     */
    private String recommenderAccount; //推荐人

    private List<RecommendRecordVO> recommendRecords = new ArrayList<>(); //推荐记录

    private List<ReceiveAddressVO> receiveAddress = new ArrayList<>(); //收货地址
    private List<RelativesVO> relatives = new ArrayList<>(); //亲属


    private String creditRating;//信用等级

    private String bankCardId;//银行卡号

    // 是否在商城设置了交易密码
    private Boolean transPassStatus;

    @DBRef
    private UserGroupDO userGroup;

    //private UserWeChartVO userWeChartVO;

    private List<UserFavoriteVO> userFavorite = new ArrayList<>();

    /**
     * 账号类型：普通会员\推广员
     */
    private String accountType;

    /**
     * 推广员绑定状态
     * */
    private String promoterBindStatus;

    /**
     * 粉丝绑定状态
     * */
    private String fansBindStatus;

    /**
     * 推广员ID
     */
    private String promoterId;

    /**
     * 成为推广员的时间
     */
    private Long bePromoterTime;

    /**
     * 剩余绑定时间
     */
    private Integer remainDays;

    /**
     * 自己的销售额（自己的所有订单金额）
     */
    private BigDecimal saleAmount;

    /**
     * 粉丝的销售额
     */
    private BigDecimal fansSaleAmount;

    /**
     * 推广的总销售额 = 自己销售额 + 自己粉丝的销售额 + 合伙人的销售额（合伙人自己的订单金额 + 合伙人粉丝的销售额）
     */
    private BigDecimal totalSaleAmount;
}
