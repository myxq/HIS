package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * pat_regist
 * @author 
 */
@Data
public class PatRegistKey implements Serializable {
    /**
     * 患者身份证号
     */
    private String prIdcard;

    /**
     * 挂号ID
     */
    private Integer prRegid;

    private static final long serialVersionUID = 1L;

    public String getPrIdcard() {
        return prIdcard;
    }

    public void setPrIdcard(String prIdcard) {
        this.prIdcard = prIdcard;
    }

    public Integer getPrRegid() {
        return prRegid;
    }

    public void setPrRegid(Integer prRegid) {
        this.prRegid = prRegid;
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
        PatRegistKey other = (PatRegistKey) that;
        return (this.getPrIdcard() == null ? other.getPrIdcard() == null : this.getPrIdcard().equals(other.getPrIdcard()))
            && (this.getPrRegid() == null ? other.getPrRegid() == null : this.getPrRegid().equals(other.getPrRegid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPrIdcard() == null) ? 0 : getPrIdcard().hashCode());
        result = prime * result + ((getPrRegid() == null) ? 0 : getPrRegid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prIdcard=").append(prIdcard);
        sb.append(", prRegid=").append(prRegid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}