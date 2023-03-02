package com.ming.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName company
 */
public class Company implements Serializable {
    /**
     * 公司id，主键，自增长
     */
    private Object id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 状态（正常--1、注销--0）
     */
    private Integer status;

    /**
     * 所属组织机构id
     */
    private Integer affiliatedOrganization;

    /**
     * 
     */
    private Date creatTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 级别（排序）值越大级别越小
     */
    private Integer level;

    private static final long serialVersionUID = 1L;

    /**
     * 公司id，主键，自增长
     */
    public Object getId() {
        return id;
    }

    /**
     * 公司id，主键，自增长
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 公司名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 状态（正常--1、注销--0）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（正常--1、注销--0）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 所属组织机构id
     */
    public Integer getAffiliatedOrganization() {
        return affiliatedOrganization;
    }

    /**
     * 所属组织机构id
     */
    public void setAffiliatedOrganization(Integer affiliatedOrganization) {
        this.affiliatedOrganization = affiliatedOrganization;
    }

    /**
     * 
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 级别（排序）值越大级别越小
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 级别（排序）值越大级别越小
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Company other = (Company) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAffiliatedOrganization() == null ? other.getAffiliatedOrganization() == null : this.getAffiliatedOrganization().equals(other.getAffiliatedOrganization()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAffiliatedOrganization() == null) ? 0 : getAffiliatedOrganization().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", affiliatedOrganization=").append(affiliatedOrganization);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}