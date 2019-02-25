package com.flchen.multiple_datasource_demo.entity.shop.exportCenter.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author feilongchen
 * @since 2018-09-21 10:18 AM
 */
@Data
@Document(collection = "exportRecord")
public class ExportRecordDO extends BaseDO {

	public final static String NORMAL_ORDER = "order_normal";
	public final static String FINANCE_ORDER = "order_finance";
	public final static String AFTERSALE_ORDER = "order_afterSale";
	public final static String INFORMATION_GOODS = "goods_information";
	public final static String USER_COUPON = "coupon_userCoupon";
	public final static String RECODE_LOTTERY = "lottery_recode";
	public final static int GENERATING = 0;
	public final static int STANDBY = 1;

	/**
	 * 文件类型：orderExcel--订单导出 financeOrderExcel--财务报表导出
	 */
	private String fileType;

	/**
	 * file name
	 */
	private String fileName;

	/**
	 * 导出状态，0--生成中，1--上传到OSS
	 */
	private Integer state;

	/**
	 * OSS下载链接
	 */
	private String url;

}
