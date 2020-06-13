package com.ssmhis.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * prescription
 * @author 
 */
public class Prescription implements Serializable {
    /**
     * 处方ID
     */
    private Integer prescriptionId;

    /**
     * 挂号ID
     */
    private Integer pRegid;

    /**
     * 处方名
     */
    private String prescripName;

    /**
     * 开立医生ID
     */
    private Integer openDocid;

    /**
     * 开立时间
     */
    private LocalDateTime openTime;

    /**
     * 处方状态
     */
    private Integer prescripState;

    /**
     * 删除标识
     */
    private Integer delflag;

    private static final long serialVersionUID = 1L;

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Integer getpRegid() {
        return pRegid;
    }

    public void setpRegid(Integer pRegid) {
        this.pRegid = pRegid;
    }

    public String getPrescripName() {
        return prescripName;
    }

    public void setPrescripName(String prescripName) {
        this.prescripName = prescripName;
    }

    public Integer getOpenDocid() {
        return openDocid;
    }

    public void setOpenDocid(Integer openDocid) {
        this.openDocid = openDocid;
    }

    public LocalDateTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalDateTime openTime) {
        this.openTime = openTime;
    }

    public Integer getPrescripState() {
        return prescripState;
    }

    public void setPrescripState(Integer prescripState) {
        this.prescripState = prescripState;
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
        Prescription other = (Prescription) that;
        return (this.getPrescriptionId() == null ? other.getPrescriptionId() == null : this.getPrescriptionId().equals(other.getPrescriptionId()))
            && (this.getpRegid() == null ? other.getpRegid() == null : this.getpRegid().equals(other.getpRegid()))
            && (this.getPrescripName() == null ? other.getPrescripName() == null : this.getPrescripName().equals(other.getPrescripName()))
            && (this.getOpenDocid() == null ? other.getOpenDocid() == null : this.getOpenDocid().equals(other.getOpenDocid()))
            && (this.getOpenTime() == null ? other.getOpenTime() == null : this.getOpenTime().equals(other.getOpenTime()))
            && (this.getPrescripState() == null ? other.getPrescripState() == null : this.getPrescripState().equals(other.getPrescripState()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionId() == null) ? 0 : getPrescriptionId().hashCode());
        result = prime * result + ((getpRegid() == null) ? 0 : getpRegid().hashCode());
        result = prime * result + ((getPrescripName() == null) ? 0 : getPrescripName().hashCode());
        result = prime * result + ((getOpenDocid() == null) ? 0 : getOpenDocid().hashCode());
        result = prime * result + ((getOpenTime() == null) ? 0 : getOpenTime().hashCode());
        result = prime * result + ((getPrescripState() == null) ? 0 : getPrescripState().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescriptionId=").append(prescriptionId);
        sb.append(", pRegid=").append(pRegid);
        sb.append(", prescripName=").append(prescripName);
        sb.append(", openDocid=").append(openDocid);
        sb.append(", openTime=").append(openTime);
        sb.append(", prescripState=").append(prescripState);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}