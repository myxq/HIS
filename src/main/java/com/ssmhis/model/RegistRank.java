package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * regist_rank
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistRank implements Serializable {
    /**
     * 挂号级别ID
     */
    private Integer regRankid;

    /**
     * 挂号级别编码
     */
    private String rankCode;

    /**
     * 挂号级别名称
     */
    private String rankName;

    /**
     * 显示顺序号
     */
    private Integer showSeqnum;

    /**
     * 挂号费用
     */
    private Integer regFee;

    /**
     * 挂号限额
     */
    private Integer regLimit;

    /**
     * 删除标识
     */
    private Integer delflag;

    private static final long serialVersionUID = 1L;

    public Integer getRegRankid() {
        return regRankid;
    }

    public void setRegRankid(Integer regRankid) {
        this.regRankid = regRankid;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public Integer getShowSeqnum() {
        return showSeqnum;
    }

    public void setShowSeqnum(Integer showSeqnum) {
        this.showSeqnum = showSeqnum;
    }

    public Integer getRegFee() {
        return regFee;
    }

    public void setRegFee(Integer regFee) {
        this.regFee = regFee;
    }

    public Integer getRegLimit() {
        return regLimit;
    }

    public void setRegLimit(Integer regLimit) {
        this.regLimit = regLimit;
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
        RegistRank other = (RegistRank) that;
        return (this.getRegRankid() == null ? other.getRegRankid() == null : this.getRegRankid().equals(other.getRegRankid()))
            && (this.getRankCode() == null ? other.getRankCode() == null : this.getRankCode().equals(other.getRankCode()))
            && (this.getRankName() == null ? other.getRankName() == null : this.getRankName().equals(other.getRankName()))
            && (this.getShowSeqnum() == null ? other.getShowSeqnum() == null : this.getShowSeqnum().equals(other.getShowSeqnum()))
            && (this.getRegFee() == null ? other.getRegFee() == null : this.getRegFee().equals(other.getRegFee()))
            && (this.getRegLimit() == null ? other.getRegLimit() == null : this.getRegLimit().equals(other.getRegLimit()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegRankid() == null) ? 0 : getRegRankid().hashCode());
        result = prime * result + ((getRankCode() == null) ? 0 : getRankCode().hashCode());
        result = prime * result + ((getRankName() == null) ? 0 : getRankName().hashCode());
        result = prime * result + ((getShowSeqnum() == null) ? 0 : getShowSeqnum().hashCode());
        result = prime * result + ((getRegFee() == null) ? 0 : getRegFee().hashCode());
        result = prime * result + ((getRegLimit() == null) ? 0 : getRegLimit().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", regRankid=").append(regRankid);
        sb.append(", rankCode=").append(rankCode);
        sb.append(", rankName=").append(rankName);
        sb.append(", showSeqnum=").append(showSeqnum);
        sb.append(", regFee=").append(regFee);
        sb.append(", regLimit=").append(regLimit);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}