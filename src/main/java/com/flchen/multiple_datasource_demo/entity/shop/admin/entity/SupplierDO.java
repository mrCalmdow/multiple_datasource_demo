package com.flchen.multiple_datasource_demo.entity.shop.admin.entity;

import com.flchen.multiple_datasource_demo.entity.shop.admin.entity.constants.SupplierFollower;
import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * 供应商信息
 *
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "supplier")
@Data
public class SupplierDO extends BaseDO {
// 是否要增加 业务员KEY 用于 权限管理

    /**
     * 账户
     */
    private String name;//供应商名称
    private String address;//供应商地址
    private String serviceTel;//客服电话
    private String contact;//联系人(财务名称)
    private String contactPhone;//联系电话
    private String email;//邮箱地址
    private List<CategoryVO> categories;//经营范围/经营类别
    private String legalMan;//法人姓名
    private String legalManCardId;//法人身份证号码
    private String businessLicenseNumber;//营业执照号
    private String businessLicenseImgKey;//营业执照图片Key
    private String frontLegalManCardImgKey;//法人身份证正面图片Key
    private String backLegalManCardImgKey;//法人身份证背面图片Key
    private String coopStatus;//合作状态
    private String businessContact;//跟进业务员
    private String companyName;//公司名字


    private String clearingForm;//结算方式  0 返点
    private double rebateProportion; //返点比例
    private String supplierNo;
    private String settlementInterval;//结算周期

    private String settleAccountName; //结算账户名称
    private String settleAccountNo;//结算银行账号
    private String openingBankName;//开户行名称

    private String returnAddress;//退货地址
    private String returnContact;//退货联系人
    private String returnPhone;//退货电话
    private List<SupplierFollower> supplierFollowers = new ArrayList<>();   //业务跟进人
}
