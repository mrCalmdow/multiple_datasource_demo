package com.flchen.multiple_datasource_demo.entity.shop.file.entity;

import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
@Document(collection = "file")
public class FileDO extends BaseDO {

    /**
     * 文件原始名字
     */
    private String originalName;

    /**
     * 文件名
     */
    private String name;

    /**
     * 扩展名
     */
    private String extName;

    /**
     * 文件地址
     */
    private String url;
    /**
     * 文件md5
     */
    private String md5;

    /**
     * 文件大小
     */
    private Long size;

    /**
     * 类型，image
     */
    private String type;

    /**
     * 文件类型  如：image/png  image/jpg
     */
    private String contentType;

    /**
     * 文件夹id
     */
    private String directoryId;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtName() {
        return extName;
    }

    public void setExtName(String extName) {
        this.extName = extName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
