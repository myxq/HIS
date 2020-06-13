package com.ssmhis.model;

import java.io.Serializable;

/**
 * prescription_detail
 * @author 
 */
public class PrescriptionDetail extends PrescriptionDetailKey implements Serializable {
    /**
     * 药品数量
     */
    private Integer drugNum;

    /**
     * 用法
     */
    private String usage;

    /**
     * 用量
     */
    private String dosage;

    /**
     * 频次
     */
    private String frequency;

    /**
     * 处方状态
     */
    private Integer prescriptionState;

    private Integer delflag;

    private static final long serialVersionUID = 1L;

    public Integer getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(Integer drugNum) {
        this.drugNum = drugNum;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Integer getPrescriptionState() {
        return prescriptionState;
    }

    public void setPrescriptionState(Integer prescriptionState) {
        this.prescriptionState = prescriptionState;
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
        PrescriptionDetail other = (PrescriptionDetail) that;
        return (this.getPrescriptionId() == null ? other.getPrescriptionId() == null : this.getPrescriptionId().equals(other.getPrescriptionId()))
            && (this.getDrugid() == null ? other.getDrugid() == null : this.getDrugid().equals(other.getDrugid()))
            && (this.getDrugNum() == null ? other.getDrugNum() == null : this.getDrugNum().equals(other.getDrugNum()))
            && (this.getUsage() == null ? other.getUsage() == null : this.getUsage().equals(other.getUsage()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getPrescriptionState() == null ? other.getPrescriptionState() == null : this.getPrescriptionState().equals(other.getPrescriptionState()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrescriptionId() == null) ? 0 : getPrescriptionId().hashCode());
        result = prime * result + ((getDrugid() == null) ? 0 : getDrugid().hashCode());
        result = prime * result + ((getDrugNum() == null) ? 0 : getDrugNum().hashCode());
        result = prime * result + ((getUsage() == null) ? 0 : getUsage().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getPrescriptionState() == null) ? 0 : getPrescriptionState().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugNum=").append(drugNum);
        sb.append(", usage=").append(usage);
        sb.append(", dosage=").append(dosage);
        sb.append(", frequency=").append(frequency);
        sb.append(", prescriptionState=").append(prescriptionState);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}