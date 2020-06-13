package com.ssmhis.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * prescription_model
 * @author 
 */
@Data
public class PrescriptionModel implements Serializable {
    /**
     * 处方模板ID
     */
    private Integer prescripModid;

    /**
     * 处方模板名
     */
    private String prescripName;

    /**
     * 创建该模板医生ID
     */
    private Integer createDocid;

    /**
     * 创建时间
     */
    private LocalDateTime creationDate;

    /**
     * 使用范围
     */
    private Integer usageRange;

    /**
     * 删除标识
     */
    private Integer delflag;

    private static final long serialVersionUID = 1L;

    public Integer getPrescripModid() {
        return prescripModid;
    }

    public void setPrescripModid(Integer prescripModid) {
        this.prescripModid = prescripModid;
    }

    public String getPrescripName() {
        return prescripName;
    }

    public void setPrescripName(String prescripName) {
        this.prescripName = prescripName;
    }

    public Integer getCreateDocid() {
        return createDocid;
    }

    public void setCreateDocid(Integer createDocid) {
        this.createDocid = createDocid;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getUsageRange() {
        return usageRange;
    }

    public void setUsageRange(Integer usageRange) {
        this.usageRange = usageRange;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
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
        PrescriptionModel other = (PrescriptionModel) that;
        return (this.getPrescripModid() == null ? other.getPrescripModid() == null : this.getPrescripModid().equals(other.getPrescripModid()))
            && (this.getPrescripName() == null ? other.getPrescripName() == null : this.getPrescripName().equals(other.getPrescripName()))
            && (this.getCreateDocid() == null ? other.getCreateDocid() == null : this.getCreateDocid().equals(other.getCreateDocid()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getUsageRange() == null ? other.getUsageRange() == null : this.getUsageRange().equals(other.getUsageRange()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescripModid() == null) ? 0 : getPrescripModid().hashCode());
        result = prime * result + ((getPrescripName() == null) ? 0 : getPrescripName().hashCode());
        result = prime * result + ((getCreateDocid() == null) ? 0 : getCreateDocid().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getUsageRange() == null) ? 0 : getUsageRange().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescripModid=").append(prescripModid);
        sb.append(", prescripName=").append(prescripName);
        sb.append(", createDocid=").append(createDocid);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", usageRange=").append(usageRange);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}