package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * pat_regist
 * @author 
 */
@Data
public class PatRegist extends PatRegistKey implements Serializable {
    /**
     * 挂号状态
     */
    private Integer prRegstate;

    /**
     * 删除标识
     */
    private Integer prDelflag;

    private FeeDetail feeDetail;

    private Regist regist;

    private Patient patient;

    public FeeDetail getFeeDetail() {
        return feeDetail;
    }

    public void setFeeDetail(FeeDetail feeDetail) {
        this.feeDetail = feeDetail;
    }

    private static final long serialVersionUID = 1L;

    public Integer getPrRegstate() {
        return prRegstate;
    }

    public void setPrRegstate(Integer prRegstate) {
        this.prRegstate = prRegstate;
    }

    public Integer getPrDelflag() {
        return prDelflag;
    }

    public void setPrDelflag(Integer prDelflag) {
        this.prDelflag = prDelflag;
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
        PatRegist other = (PatRegist) that;
        return (this.getPrIdcard() == null ? other.getPrIdcard() == null : this.getPrIdcard().equals(other.getPrIdcard()))
            && (this.getPrRegid() == null ? other.getPrRegid() == null : this.getPrRegid().equals(other.getPrRegid()))
            && (this.getPrRegstate() == null ? other.getPrRegstate() == null : this.getPrRegstate().equals(other.getPrRegstate()))
            && (this.getPrDelflag() == null ? other.getPrDelflag() == null : this.getPrDelflag().equals(other.getPrDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrIdcard() == null) ? 0 : getPrIdcard().hashCode());
        result = prime * result + ((getPrRegid() == null) ? 0 : getPrRegid().hashCode());
        result = prime * result + ((getPrRegstate() == null) ? 0 : getPrRegstate().hashCode());
        result = prime * result + ((getPrDelflag() == null) ? 0 : getPrDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prRegstate=").append(prRegstate);
        sb.append(", prDelflag=").append(prDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}