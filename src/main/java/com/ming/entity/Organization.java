package com.ming.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName organization
 */
public class Organization implements Serializable {
    /**
     * 主键，自增长，组织机构ID
     */
    private Object id;

    /**
     * 组织机构名称
     */
    private String name;

    /**
     * 状态（正常-1、已注销-0）
     */
    private Integer status;

    /**
     * 成立日期
     */
    private Date creatTime;

    /**
     * 级别（排序）值越大级别越小
     */
    private Integer level;

    private static final long serialVersionUID = 1L;

    /**
     * 主键，自增长，组织机构ID
     */
    public Object getId() {
        return id;
    }

    /**
     * 主键，自增长，组织机构ID
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 组织机构名称
     */
    public String getName() {
        return name;
    }

    /**
     * 组织机构名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 状态（正常-1、已注销-0）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（正常-1、已注销-0）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 成立日期
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 成立日期
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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
        Organization other = (Organization) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatTime() == null ? other.getCreatTime() == null : this.getCreatTime().equals(other.getCreatTime()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
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
        sb.append(", creatTime=").append(creatTime);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}