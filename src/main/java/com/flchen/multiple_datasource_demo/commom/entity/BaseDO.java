package com.flchen.multiple_datasource_demo.commom.entity;

import com.flchen.multiple_datasource_demo.commom.constants.CommonConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author Beldon.
 * @create 2017-11-3 下午2:26
 */
public class BaseDO implements Serializable{
    @Id
    protected String id;

    protected Boolean enable = CommonConstants.DATA_ENABLE;

    private String createdBy;
    private long createdTime;
    private String updatedBy;
    private long updatedTime;
    private String deletedBy;
    private long deletedTime;

    @Version
    private Integer version;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? UUID.randomUUID().hashCode() : id.hashCode());
        result += enable == null ? UUID.randomUUID().hashCode() : enable.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (id == null) {
            return false;
        }

        if (!id.equals(((BaseDO) obj).id)) {
            return false;
        }
        if (enable == null) {
            return false;
        }
        if (enable.equals (((BaseDO) obj).enable)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public long getDeletedTime() {
        return deletedTime;
    }

    public void setDeletedTime(long deletedTime) {
        this.deletedTime = deletedTime;
    }
}
