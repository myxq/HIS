package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * medi_record
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediRecord  {
    /**
     * 病历号
     */
    private Integer medRecnum;

    /**
     * 主诉
     */
    private String complaints;

    /**
     * 现病史
     */
    private String curmedHis;

    /**
     * 既往史
     */
    private String pasHis;

    /**
     * 过敏史
     */
    private String allergyHis;

    /**
     * 体格检查
     */
    private String phyExam;

    /**
     * 诊断结果
     */
    private String preDiag;

    /**
     * 病历记录号
     */
    private Integer recNum;

    /**
     * 删除标识
     */
    private Integer mrDelflag;

    private Patient patient;

    private static final long serialVersionUID = 1L;

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
        MediRecord other = (MediRecord) that;
        return (this.getMedRecnum() == null ? other.getMedRecnum() == null : this.getMedRecnum().equals(other.getMedRecnum()))
            && (this.getComplaints() == null ? other.getComplaints() == null : this.getComplaints().equals(other.getComplaints()))
            && (this.getCurmedHis() == null ? other.getCurmedHis() == null : this.getCurmedHis().equals(other.getCurmedHis()))
            && (this.getPasHis() == null ? other.getPasHis() == null : this.getPasHis().equals(other.getPasHis()))
            && (this.getAllergyHis() == null ? other.getAllergyHis() == null : this.getAllergyHis().equals(other.getAllergyHis()))
            && (this.getPhyExam() == null ? other.getPhyExam() == null : this.getPhyExam().equals(other.getPhyExam()))
            && (this.getPreDiag() == null ? other.getPreDiag() == null : this.getPreDiag().equals(other.getPreDiag()))
            && (this.getRecNum() == null ? other.getRecNum() == null : this.getRecNum().equals(other.getRecNum()))
            && (this.getMrDelflag() == null ? other.getMrDelflag() == null : this.getMrDelflag().equals(other.getMrDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMedRecnum() == null) ? 0 : getMedRecnum().hashCode());
        result = prime * result + ((getComplaints() == null) ? 0 : getComplaints().hashCode());
        result = prime * result + ((getCurmedHis() == null) ? 0 : getCurmedHis().hashCode());
        result = prime * result + ((getPasHis() == null) ? 0 : getPasHis().hashCode());
        result = prime * result + ((getAllergyHis() == null) ? 0 : getAllergyHis().hashCode());
        result = prime * result + ((getPhyExam() == null) ? 0 : getPhyExam().hashCode());
        result = prime * result + ((getPreDiag() == null) ? 0 : getPreDiag().hashCode());
        result = prime * result + ((getRecNum() == null) ? 0 : getRecNum().hashCode());
        result = prime * result + ((getMrDelflag() == null) ? 0 : getMrDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", medRecnum=").append(medRecnum);
        sb.append(", complaints=").append(complaints);
        sb.append(", curmedHis=").append(curmedHis);
        sb.append(", pasHis=").append(pasHis);
        sb.append(", allergyHis=").append(allergyHis);
        sb.append(", phyExam=").append(phyExam);
        sb.append(", preDiag=").append(preDiag);
        sb.append(", recNum=").append(recNum);
        sb.append(", mrDelflag=").append(mrDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}