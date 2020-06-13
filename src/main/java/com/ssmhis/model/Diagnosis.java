package com.ssmhis.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * diagnosis
 * @author 
 */
@Data
public class Diagnosis implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 病历号
     */
    private Integer diaMedinum;

    /**
     * 挂号ID
     */
    private Integer diaRegid;

    /**
     * 诊断类型 1-西医 2-中医
     */
    private Integer diaType;

    /**
     * 发病日期
     */
    private LocalDateTime diseDate;

    /**
     * 诊断种类 1-初诊 2-终诊
     */
    private Integer diaKind;

    /**
     * 疾病ID
     */
    private Integer diseid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDiaMedinum() {
        return diaMedinum;
    }

    public void setDiaMedinum(Integer diaMedinum) {
        this.diaMedinum = diaMedinum;
    }

    public Integer getDiaRegid() {
        return diaRegid;
    }

    public void setDiaRegid(Integer diaRegid) {
        this.diaRegid = diaRegid;
    }

    public Integer getDiaType() {
        return diaType;
    }

    public void setDiaType(Integer diaType) {
        this.diaType = diaType;
    }

    public LocalDateTime getDiseDate() {
        return diseDate;
    }

    public void setDiseDate(LocalDateTime diseDate) {
        this.diseDate = diseDate;
    }

    public Integer getDiaKind() {
        return diaKind;
    }

    public void setDiaKind(Integer diaKind) {
        this.diaKind = diaKind;
    }

    public Integer getDiseid() {
        return diseid;
    }

    public void setDiseid(Integer diseid) {
        this.diseid = diseid;
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
        Diagnosis other = (Diagnosis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiaMedinum() == null ? other.getDiaMedinum() == null : this.getDiaMedinum().equals(other.getDiaMedinum()))
            && (this.getDiaRegid() == null ? other.getDiaRegid() == null : this.getDiaRegid().equals(other.getDiaRegid()))
            && (this.getDiaType() == null ? other.getDiaType() == null : this.getDiaType().equals(other.getDiaType()))
            && (this.getDiseDate() == null ? other.getDiseDate() == null : this.getDiseDate().equals(other.getDiseDate()))
            && (this.getDiaKind() == null ? other.getDiaKind() == null : this.getDiaKind().equals(other.getDiaKind()))
            && (this.getDiseid() == null ? other.getDiseid() == null : this.getDiseid().equals(other.getDiseid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiaMedinum() == null) ? 0 : getDiaMedinum().hashCode());
        result = prime * result + ((getDiaRegid() == null) ? 0 : getDiaRegid().hashCode());
        result = prime * result + ((getDiaType() == null) ? 0 : getDiaType().hashCode());
        result = prime * result + ((getDiseDate() == null) ? 0 : getDiseDate().hashCode());
        result = prime * result + ((getDiaKind() == null) ? 0 : getDiaKind().hashCode());
        result = prime * result + ((getDiseid() == null) ? 0 : getDiseid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diaMedinum=").append(diaMedinum);
        sb.append(", diaRegid=").append(diaRegid);
        sb.append(", diaType=").append(diaType);
        sb.append(", diseDate=").append(diseDate);
        sb.append(", diaKind=").append(diaKind);
        sb.append(", diseid=").append(diseid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}