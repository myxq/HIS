package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * fee_detail
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeeDetailKey implements Serializable {
    /**
     * 挂号ID
     */
    private Integer fdRegid;

    /**
     * 药品ID
     */
    private Integer fdDrugid;

    private static final long serialVersionUID = 1L;

    public Integer getFdRegid() {
        return fdRegid;
    }

    public void setFdRegid(Integer fdRegid) {
        this.fdRegid = fdRegid;
    }

    public Integer getFdDrugid() {
        return fdDrugid;
    }

    public void setFdDrugid(Integer fdDrugid) {
        this.fdDrugid = fdDrugid;
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
        FeeDetailKey other = (FeeDetailKey) that;
        return (this.getFdRegid() == null ? other.getFdRegid() == null : this.getFdRegid().equals(other.getFdRegid()))
            && (this.getFdDrugid() == null ? other.getFdDrugid() == null : this.getFdDrugid().equals(other.getFdDrugid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFdRegid() == null) ? 0 : getFdRegid().hashCode());
        result = prime * result + ((getFdDrugid() == null) ? 0 : getFdDrugid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fdRegid=").append(fdRegid);
        sb.append(", fdDrugid=").append(fdDrugid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}