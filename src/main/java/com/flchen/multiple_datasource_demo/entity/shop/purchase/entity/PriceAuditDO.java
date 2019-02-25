package com.flchen.multiple_datasource_demo.entity.shop.purchase.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author JH.TAO
 * @create 2018-04-09 9:23
 */
@Data
public class PriceAuditDO extends BaseDO {

    public final static String BATCHAUDIT_YES = "批量审核同意";//总经理通过
    public final static String BATCHAUDIT_NO = "批量审核拒绝";//总经理通过


    public final static Integer STATUS_PROCESS_ERROR = 0;//未审核流程不对
    public final static Integer STATUS_PROCESS_PRIMARY = 1;//初审通过
    public final static Integer STATUS_PROCESS_TWO = 2;//经理通过
    public final static Integer STATUS_PROCESS_FINAL = 3;//总经理通过

    //审核状态 0审核成功  1 待审核    2 审核失败
    public final static String STATUS_AUDITSTATUS_APPLING = "1";
    public final static String STATUS_AUDITSTATUS_FINISH = "2";

    //审核结果
    public final static String STATUS_AUDITRESULT_SUCCESS = "success";
    public final static String STATUS_AUDITRESULT_FAIL = "fail";
    public final static String STATUS_AUDITRESULT_NOAUDIT = "noaudit";//没有审核

    public final static String CONSTANT_OPINION_TWOAUDITOROPINION = "经理提交默认同意";
    public final static String CONSTANT_OPINION_FINALAUDITOROPINION = "总经理提交默认同意";

    private String goodsId;//商品ID
    private String goodsName;//商品名称
    private String goodsSkuNo;//商品SKU （商品编号）

    private BigDecimal settlementAmount;//采购价格
    private BigDecimal applyPrice;//申请售卖价格（实际价格）
    private BigDecimal applyPromotionPrice;//申请促销售卖价格（实际价格）
    private Double grossInterestRate;//毛利率

    private BigDecimal oldSettlementAmount;//原采购价格
    private BigDecimal oldDprice;//（原实际价格）
    private BigDecimal oldPromotionDprice;//（原促销价格）
    private Double oldGrossInterestRate;//原毛利率

    private Double increaseRate;//加价率
    private Double oldIncreaseRate;//原加价率

    private BigDecimal price;//市场价格

    private Long applyTime;//申请时间
    private String adminId;//申请人

    private String finalAuditorId;//最后审核人ID（一级）
    private String twoAuditorId;//二级审核人ID
    private String primaryAuditorId;//初审核人ID(三级)

    private String finalAuditResult = STATUS_AUDITRESULT_NOAUDIT;//最后审核人结果（一级）
    private String twoAuditorResult = STATUS_AUDITRESULT_NOAUDIT;//二级审核人结果
    private String primaryAuditorResult = STATUS_AUDITRESULT_NOAUDIT;//初审核人结果(三级)

    private String finalAuditorOpinion;//最后审核人意见（一级）
    private String twoAuditorOpinion;//二级审核人意见

    private Long twoAuditorTime;//二级审核时间（经理）
    private Long finalAuditorTime;//终级审核时间（总经理/总监）


    //审核状态  1 待审核    2 已审核
    private String auditStatus;
    private String auditResult;


    private Integer allowLevel; //最终同意等级
    private Integer process; //审核步骤

    private String supplierId;//供应商ID
    private String supplierName;//供应商名字
    private String linkCategoryName;//分类联系名

    private Integer salesPromotion; // 是否促销
    private long promotionStartTime; //
    private long promotionEndTime; // 促销结束时间

}
