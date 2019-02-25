package com.flchen.multiple_datasource_demo.entity.shop.file.entity.bo;

import lombok.Data;

import java.net.URL;

/**
 * @author zhanghaibin
 * @Create 2018/9/11 13:47
 */
@Data
public class ExportExcelBO {
    private URL url; //excel文件地址
    private String fileName; //excel文件名称
    private String fileType; // 文件类型：导出的文档类似
}
