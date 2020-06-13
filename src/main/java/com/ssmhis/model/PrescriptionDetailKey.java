package com.ssmhis.model;

import java.io.Serializable;

/**
 * prescription_detail
 * @author 
 */
public class PrescriptionDetailKey implements Serializable {
    /**
     * 处方ID
     */
    private Integer prescriptionId;

    /**
     * 药品ID
     */
    private Integer drugid;

    private static final long serialVersionUID = 1L;

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
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
        PrescriptionDetailKey other = (PrescriptionDetailKey) that;
        return (this.getPrescriptionId() == null ? other.getPrescriptionId() == null : this.getPrescriptionId().equals(other.getPrescriptionId()))
            && (this.getDrugid() == null ? other.getDrugid() == null : this.getDrugid().equals(other.getDrugid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionId() == null) ? 0 : getPrescriptionId().hashCode());
        result = prime * result + ((getDrugid() == null) ? 0 : getDrugid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prescriptionId=").append(prescriptionId);
        sb.append(", drugid=").append(drugid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}