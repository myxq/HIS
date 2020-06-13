package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * drugs
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drugs implements Serializable {
    /**
     * 药品ID
     */
    private Integer drugId;

    /**
     * 药品编码
     */
    private String drugCode;

    /**
     * 药品名称
     */
    private String drugName;

    /**
     * 药品规格
     */
    private String drugFormat;

    /**
     * 药品包装单位
     */
    private String drugUnit;

    /**
     * 生产厂家
     */
    private String manufacturer;

    /**
     * 药品剂型
     */
    private Integer drugDosageid;

    /**
     * 药品类型
     */
    private Integer drugType;

    /**
     * 药品单价
     */
    private BigDecimal drugPrice;

    /**
     * 拼音助记码
     */
    private String mnemonicCode;

    /**
     * 创建时间
     */
    private LocalDateTime creationDate;

    /**
     * 删除标识
     */
    private Integer dDelflag;

    private static final long serialVersionUID = 1L;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugFormat() {
        return drugFormat;
    }

    public void setDrugFormat(String drugFormat) {
        this.drugFormat = drugFormat;
    }

    public String getDrugUnit() {
        return drugUnit;
    }

    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getDrugDosageid() {
        return drugDosageid;
    }

    public void setDrugDosageid(Integer drugDosageid) {
        this.drugDosageid = drugDosageid;
    }

    public Integer getDrugType() {
        return drugType;
    }

    public void setDrugType(Integer drugType) {
        this.drugType = drugType;
    }

    public BigDecimal getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(BigDecimal drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getdDelflag() {
        return dDelflag;
    }

    public void setdDelflag(Integer dDelflag) {
        this.dDelflag = dDelflag;
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
        Drugs other = (Drugs) that;
        return (this.getDrugId() == null ? other.getDrugId() == null : this.getDrugId().equals(other.getDrugId()))
            && (this.getDrugCode() == null ? other.getDrugCode() == null : this.getDrugCode().equals(other.getDrugCode()))
            && (this.getDrugName() == null ? other.getDrugName() == null : this.getDrugName().equals(other.getDrugName()))
            && (this.getDrugFormat() == null ? other.getDrugFormat() == null : this.getDrugFormat().equals(other.getDrugFormat()))
            && (this.getDrugUnit() == null ? other.getDrugUnit() == null : this.getDrugUnit().equals(other.getDrugUnit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugDosageid() == null ? other.getDrugDosageid() == null : this.getDrugDosageid().equals(other.getDrugDosageid()))
            && (this.getDrugType() == null ? other.getDrugType() == null : this.getDrugType().equals(other.getDrugType()))
            && (this.getDrugPrice() == null ? other.getDrugPrice() == null : this.getDrugPrice().equals(other.getDrugPrice()))
            && (this.getMnemonicCode() == null ? other.getMnemonicCode() == null : this.getMnemonicCode().equals(other.getMnemonicCode()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getdDelflag() == null ? other.getdDelflag() == null : this.getdDelflag().equals(other.getdDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrugId() == null) ? 0 : getDrugId().hashCode());
        result = prime * result + ((getDrugCode() == null) ? 0 : getDrugCode().hashCode());
        result = prime * result + ((getDrugName() == null) ? 0 : getDrugName().hashCode());
        result = prime * result + ((getDrugFormat() == null) ? 0 : getDrugFormat().hashCode());
        result = prime * result + ((getDrugUnit() == null) ? 0 : getDrugUnit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugDosageid() == null) ? 0 : getDrugDosageid().hashCode());
        result = prime * result + ((getDrugType() == null) ? 0 : getDrugType().hashCode());
        result = prime * result + ((getDrugPrice() == null) ? 0 : getDrugPrice().hashCode());
        result = prime * result + ((getMnemonicCode() == null) ? 0 : getMnemonicCode().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getdDelflag() == null) ? 0 : getdDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugId=").append(drugId);
        sb.append(", drugCode=").append(drugCode);
        sb.append(", drugName=").append(drugName);
        sb.append(", drugFormat=").append(drugFormat);
        sb.append(", drugUnit=").append(drugUnit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugDosageid=").append(drugDosageid);
        sb.append(", drugType=").append(drugType);
        sb.append(", drugPrice=").append(drugPrice);
        sb.append(", mnemonicCode=").append(mnemonicCode);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", dDelflag=").append(dDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}