package com.ssmhis.model;

import lombok.Data;

import java.io.Serializable;

/**
 * disease
 * @author 
 */
@Data
public class Disease implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 疾病助记码
     */
    private String diseaseCode;

    /**
     * 疾病名称
     */
    private String diseaseName;

    /**
     * 国际ICD编码
     */
    private String diseaseIcd;

    /**
     * 疾病所属分类
     */
    private String diseaseCategoryid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseIcd() {
        return diseaseIcd;
    }

    public void setDiseaseIcd(String diseaseIcd) {
        this.diseaseIcd = diseaseIcd;
    }

    public String getDiseaseCategoryid() {
        return diseaseCategoryid;
    }

    public void setDiseaseCategoryid(String diseaseCategoryid) {
        this.diseaseCategoryid = diseaseCategoryid;
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
        Disease other = (Disease) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiseaseCode() == null ? other.getDiseaseCode() == null : this.getDiseaseCode().equals(other.getDiseaseCode()))
            && (this.getDiseaseName() == null ? other.getDiseaseName() == null : this.getDiseaseName().equals(other.getDiseaseName()))
            && (this.getDiseaseIcd() == null ? other.getDiseaseIcd() == null : this.getDiseaseIcd().equals(other.getDiseaseIcd()))
            && (this.getDiseaseCategoryid() == null ? other.getDiseaseCategoryid() == null : this.getDiseaseCategoryid().equals(other.getDiseaseCategoryid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiseaseCode() == null) ? 0 : getDiseaseCode().hashCode());
        result = prime * result + ((getDiseaseName() == null) ? 0 : getDiseaseName().hashCode());
        result = prime * result + ((getDiseaseIcd() == null) ? 0 : getDiseaseIcd().hashCode());
        result = prime * result + ((getDiseaseCategoryid() == null) ? 0 : getDiseaseCategoryid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", diseaseCode=").append(diseaseCode);
        sb.append(", diseaseName=").append(diseaseName);
        sb.append(", diseaseIcd=").append(diseaseIcd);
        sb.append(", diseaseCategoryid=").append(diseaseCategoryid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}