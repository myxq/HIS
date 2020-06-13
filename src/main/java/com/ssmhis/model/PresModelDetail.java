package com.ssmhis.model;

import lombok.Data;

import java.io.Serializable;

/**
 * pres_model_detail
 * @author 
 */
@Data
public class PresModelDetail implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 处方模板ID
     */
    private Integer prescripModid;

    /**
     * 药品ID
     */
    private Integer drugid;

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
     * 数量
     */
    private Integer number;

    /**
     * 删除标识
     */
    private Integer delflag;

    private Drugs drugs;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrescripModid() {
        return prescripModid;
    }

    public void setPrescripModid(Integer prescripModid) {
        this.prescripModid = prescripModid;
    }

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
        PresModelDetail other = (PresModelDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrescripModid() == null ? other.getPrescripModid() == null : this.getPrescripModid().equals(other.getPrescripModid()))
            && (this.getDrugid() == null ? other.getDrugid() == null : this.getDrugid().equals(other.getDrugid()))
            && (this.getUsage() == null ? other.getUsage() == null : this.getUsage().equals(other.getUsage()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrescripModid() == null) ? 0 : getPrescripModid().hashCode());
        result = prime * result + ((getDrugid() == null) ? 0 : getDrugid().hashCode());
        result = prime * result + ((getUsage() == null) ? 0 : getUsage().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prescripModid=").append(prescripModid);
        sb.append(", drugid=").append(drugid);
        sb.append(", usage=").append(usage);
        sb.append(", dosage=").append(dosage);
        sb.append(", frequency=").append(frequency);
        sb.append(", number=").append(number);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}