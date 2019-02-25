package com.flchen.multiple_datasource_demo.entity.shop.goods.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * 分类
 *
 * @author JH.TAO.
 * Copyright (c) 2017/11/6, All Rights Reserved.
 */
@Data
@Document(collection = "category")
public class CategoryDO extends BaseDO {
	public final static String TOP_PARENTID = "root";//顶级目录父ID
	public final static Integer TOP_LEVEL = 1;//顶级目录父ID

	public static final String STATUS_PUTAWAY = "1";//上架(默认)
	public static final String STATUS_SOLDOUT = "0";//下架
	public static final Boolean STATUS_HOMESHOW_SHOW = true;//显示
	public static final Boolean STATUS_HOMESHOW_NOTSHOW = false;//不显示（默认）

	private String name;//分类名称

	private Integer serialNo;//分类编号

	private String parentId;

	private Integer level;

	/**
	 * 用于首页分类显示的次序，从0开始，数字越小越靠前
	 */
	private Integer order;

	@DBRef
	List<CategoryDO> children = new ArrayList<>();

	private Integer sort; //排序

	private String status = STATUS_PUTAWAY;//上下架状态   1  上架 0下架

	private Boolean homeShow = STATUS_HOMESHOW_NOTSHOW;//首页展示

	private String imgUrl;//分类显示图标
}
