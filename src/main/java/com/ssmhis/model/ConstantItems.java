package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * constant_items
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConstantItems implements Serializable {
    /**
     * 常数项ID
     */
    private Integer conId;

    /**
     * 所属类别ID
     */
    private Integer conTypeid;

    /**
     * 常数项编码
     */
    private String conCode;

    /**
     * 常数项名称
     */
    private String conName;

    /**
     * 删除标识
     */
    private Integer ciDelflag;

    private static final long serialVersionUID = 1L;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Integer getConTypeid() {
        return conTypeid;
    }

    public void setConTypeid(Integer conTypeid) {
        this.conTypeid = conTypeid;
    }

    public String getConCode() {
        return conCode;
    }

    public void setConCode(String conCode) {
        this.conCode = conCode;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public Integer getCiDelflag() {
        return ciDelflag;
    }

    public void setCiDelflag(Integer ciDelflag) {
        this.ciDelflag = ciDelflag;
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
        ConstantItems other = (ConstantItems) that;
        return (this.getConId() == null ? other.getConId() == null : this.getConId().equals(other.getConId()))
            && (this.getConTypeid() == null ? other.getConTypeid() == null : this.getConTypeid().equals(other.getConTypeid()))
            && (this.getConCode() == null ? other.getConCode() == null : this.getConCode().equals(other.getConCode()))
            && (this.getConName() == null ? other.getConName() == null : this.getConName().equals(other.getConName()))
            && (this.getCiDelflag() == null ? other.getCiDelflag() == null : this.getCiDelflag().equals(other.getCiDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConId() == null) ? 0 : getConId().hashCode());
        result = prime * result + ((getConTypeid() == null) ? 0 : getConTypeid().hashCode());
        result = prime * result + ((getConCode() == null) ? 0 : getConCode().hashCode());
        result = prime * result + ((getConName() == null) ? 0 : getConName().hashCode());
        result = prime * result + ((getCiDelflag() == null) ? 0 : getCiDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", conId=").append(conId);
        sb.append(", conTypeid=").append(conTypeid);
        sb.append(", conCode=").append(conCode);
        sb.append(", conName=").append(conName);
        sb.append(", ciDelflag=").append(ciDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}