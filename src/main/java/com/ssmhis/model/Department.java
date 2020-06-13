package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * department
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    /**
     * 科室ID
     */
    private Integer depId;

    /**
     * 科室编码
     */
    private String depCode;

    /**
     * 科室名称
     */
    private String depName;

    /**
     * 科室类别
     */
    private Integer depDepclass;

    /**
     * 科室类型
     */
    private String depDeptype;

    /**
     * 删除标识
     */
    private Boolean delflag;

    private static final long serialVersionUID = 1L;

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Integer getDepDepclass() {
        return depDepclass;
    }

    public void setDepDepclass(Integer depDepclass) {
        this.depDepclass = depDepclass;
    }

    public String getDepDeptype() {
        return depDeptype;
    }

    public void setDepDeptype(String depDeptype) {
        this.depDeptype = depDeptype;
    }

    public Boolean getDelflag() {
        return delflag;
    }

    public void setDelflag(Boolean delflag) {
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
        Department other = (Department) that;
        return (this.getDepId() == null ? other.getDepId() == null : this.getDepId().equals(other.getDepId()))
            && (this.getDepCode() == null ? other.getDepCode() == null : this.getDepCode().equals(other.getDepCode()))
            && (this.getDepName() == null ? other.getDepName() == null : this.getDepName().equals(other.getDepName()))
            && (this.getDepDepclass() == null ? other.getDepDepclass() == null : this.getDepDepclass().equals(other.getDepDepclass()))
            && (this.getDepDeptype() == null ? other.getDepDeptype() == null : this.getDepDeptype().equals(other.getDepDeptype()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepId() == null) ? 0 : getDepId().hashCode());
        result = prime * result + ((getDepCode() == null) ? 0 : getDepCode().hashCode());
        result = prime * result + ((getDepName() == null) ? 0 : getDepName().hashCode());
        result = prime * result + ((getDepDepclass() == null) ? 0 : getDepDepclass().hashCode());
        result = prime * result + ((getDepDeptype() == null) ? 0 : getDepDeptype().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", depId=").append(depId);
        sb.append(", depCode=").append(depCode);
        sb.append(", depName=").append(depName);
        sb.append(", depDepclass=").append(depDepclass);
        sb.append(", depDeptype=").append(depDeptype);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}