package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * fee_detail
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeeDetail extends FeeDetailKey implements Serializable {
    /**
     * 检查项目ID
     */
    private Integer fdCheckproid;

    /**
     * 药品数量
     */
    private Integer fdDrugnum;

    /**
     * 开立时间
     */
    private LocalDateTime fdOpentime;

    /**
     * 状态
     */
    private Integer fdState;

    /**
     * 删除标识
     */
    private Integer fdDelflag;

    public List<Drugs> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drugs> drugs) {
        this.drugs = drugs;
    }

    private List<Drugs> drugs;

    private static final long serialVersionUID = 1L;



    public Integer getFdCheckproid() {
        return fdCheckproid;
    }

    public void setFdCheckproid(Integer fdCheckproid) {
        this.fdCheckproid = fdCheckproid;
    }

    public Integer getFdDrugnum() {
        return fdDrugnum;
    }

    public void setFdDrugnum(Integer fdDrugnum) {
        this.fdDrugnum = fdDrugnum;
    }

    public LocalDateTime getFdOpentime() {
        return fdOpentime;
    }

    public void setFdOpentime(LocalDateTime fdOpentime) {
        this.fdOpentime = fdOpentime;
    }

    public Integer getFdState() {
        return fdState;
    }

    public void setFdState(Integer fdState) {
        this.fdState = fdState;
    }

    public Integer getFdDelflag() {
        return fdDelflag;
    }

    public void setFdDelflag(Integer fdDelflag) {
        this.fdDelflag = fdDelflag;
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
        FeeDetail other = (FeeDetail) that;
        return (this.getFdRegid() == null ? other.getFdRegid() == null : this.getFdRegid().equals(other.getFdRegid()))
            && (this.getFdDrugid() == null ? other.getFdDrugid() == null : this.getFdDrugid().equals(other.getFdDrugid()))
            && (this.getFdCheckproid() == null ? other.getFdCheckproid() == null : this.getFdCheckproid().equals(other.getFdCheckproid()))
            && (this.getFdDrugnum() == null ? other.getFdDrugnum() == null : this.getFdDrugnum().equals(other.getFdDrugnum()))
            && (this.getFdOpentime() == null ? other.getFdOpentime() == null : this.getFdOpentime().equals(other.getFdOpentime()))
            && (this.getFdState() == null ? other.getFdState() == null : this.getFdState().equals(other.getFdState()))
            && (this.getFdDelflag() == null ? other.getFdDelflag() == null : this.getFdDelflag().equals(other.getFdDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFdRegid() == null) ? 0 : getFdRegid().hashCode());
        result = prime * result + ((getFdDrugid() == null) ? 0 : getFdDrugid().hashCode());
        result = prime * result + ((getFdCheckproid() == null) ? 0 : getFdCheckproid().hashCode());
        result = prime * result + ((getFdDrugnum() == null) ? 0 : getFdDrugnum().hashCode());
        result = prime * result + ((getFdOpentime() == null) ? 0 : getFdOpentime().hashCode());
        result = prime * result + ((getFdState() == null) ? 0 : getFdState().hashCode());
        result = prime * result + ((getFdDelflag() == null) ? 0 : getFdDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fdCheckproid=").append(fdCheckproid);
        sb.append(", fdDrugnum=").append(fdDrugnum);
        sb.append(", fdOpentime=").append(fdOpentime);
        sb.append(", fdState=").append(fdState);
        sb.append(", fdDelflag=").append(fdDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}