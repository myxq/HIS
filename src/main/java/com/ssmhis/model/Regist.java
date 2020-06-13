package com.ssmhis.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * regist
 * @author 
 */
@Data
public class Regist implements Serializable {
    /**
     * 挂号id
     */
    private Integer registId;

    /**
     * 看诊医生id
     */
    private Integer rDocid;

    /**
     * 是否要病历本
     */
    private Integer ynMedrec;

    /**
     * 发票号码
     */
    private Integer rInvoid;

    /**
     * 看诊日期
     */
    private LocalDate consultDate;

    /**
     * 看诊状态
     */
    private Integer visitState;

    /**
     * 结算类型
     */
    private Integer settleType;

    /**
     * 午别(上午/下午)
     */
    private String noonBreak;

    /**
     * 挂号时间
     */
    private LocalDateTime regTime;

    /**
     * 挂号员ID
     */
    private Integer rRegperid;

    /**
     * 删除标识
     */
    private Integer rDelflag;

    private Doctor doctor;

    private Department department;

    private Patient patient;

    private static final long serialVersionUID = 1L;

    public Integer getRegistId() {
        return registId;
    }

    public void setRegistId(Integer registId) {
        this.registId = registId;
    }

    public Integer getrDocid() {
        return rDocid;
    }

    public void setrDocid(Integer rDocid) {
        this.rDocid = rDocid;
    }

    public Integer getYnMedrec() {
        return ynMedrec;
    }

    public void setYnMedrec(Integer ynMedrec) {
        this.ynMedrec = ynMedrec;
    }

    public Integer getrInvoid() {
        return rInvoid;
    }

    public void setrInvoid(Integer rInvoid) {
        this.rInvoid = rInvoid;
    }

    public LocalDate getConsultDate() {
        return consultDate;
    }

    public void setConsultDate(LocalDate consultDate) {
        this.consultDate = consultDate;
    }

    public Integer getVisitState() {
        return visitState;
    }

    public void setVisitState(Integer visitState) {
        this.visitState = visitState;
    }

    public Integer getSettleType() {
        return settleType;
    }

    public void setSettleType(Integer settleType) {
        this.settleType = settleType;
    }

    public String getNoonBreak() {
        return noonBreak;
    }

    public void setNoonBreak(String noonBreak) {
        this.noonBreak = noonBreak;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public Integer getrRegperid() {
        return rRegperid;
    }

    public void setrRegperid(Integer rRegperid) {
        this.rRegperid = rRegperid;
    }

    public Integer getrDelflag() {
        return rDelflag;
    }

    public void setrDelflag(Integer rDelflag) {
        this.rDelflag = rDelflag;
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
        Regist other = (Regist) that;
        return (this.getRegistId() == null ? other.getRegistId() == null : this.getRegistId().equals(other.getRegistId()))
            && (this.getrDocid() == null ? other.getrDocid() == null : this.getrDocid().equals(other.getrDocid()))
            && (this.getYnMedrec() == null ? other.getYnMedrec() == null : this.getYnMedrec().equals(other.getYnMedrec()))
            && (this.getrInvoid() == null ? other.getrInvoid() == null : this.getrInvoid().equals(other.getrInvoid()))
            && (this.getConsultDate() == null ? other.getConsultDate() == null : this.getConsultDate().equals(other.getConsultDate()))
            && (this.getVisitState() == null ? other.getVisitState() == null : this.getVisitState().equals(other.getVisitState()))
            && (this.getSettleType() == null ? other.getSettleType() == null : this.getSettleType().equals(other.getSettleType()))
            && (this.getNoonBreak() == null ? other.getNoonBreak() == null : this.getNoonBreak().equals(other.getNoonBreak()))
            && (this.getRegTime() == null ? other.getRegTime() == null : this.getRegTime().equals(other.getRegTime()))
            && (this.getrRegperid() == null ? other.getrRegperid() == null : this.getrRegperid().equals(other.getrRegperid()))
            && (this.getrDelflag() == null ? other.getrDelflag() == null : this.getrDelflag().equals(other.getrDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRegistId() == null) ? 0 : getRegistId().hashCode());
        result = prime * result + ((getrDocid() == null) ? 0 : getrDocid().hashCode());
        result = prime * result + ((getYnMedrec() == null) ? 0 : getYnMedrec().hashCode());
        result = prime * result + ((getrInvoid() == null) ? 0 : getrInvoid().hashCode());
        result = prime * result + ((getConsultDate() == null) ? 0 : getConsultDate().hashCode());
        result = prime * result + ((getVisitState() == null) ? 0 : getVisitState().hashCode());
        result = prime * result + ((getSettleType() == null) ? 0 : getSettleType().hashCode());
        result = prime * result + ((getNoonBreak() == null) ? 0 : getNoonBreak().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getrRegperid() == null) ? 0 : getrRegperid().hashCode());
        result = prime * result + ((getrDelflag() == null) ? 0 : getrDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", registId=").append(registId);
        sb.append(", rDocid=").append(rDocid);
        sb.append(", ynMedrec=").append(ynMedrec);
        sb.append(", rInvoid=").append(rInvoid);
        sb.append(", consultDate=").append(consultDate);
        sb.append(", visitState=").append(visitState);
        sb.append(", settleType=").append(settleType);
        sb.append(", noonBreak=").append(noonBreak);
        sb.append(", regTime=").append(regTime);
        sb.append(", rRegperid=").append(rRegperid);
        sb.append(", rDelflag=").append(rDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}