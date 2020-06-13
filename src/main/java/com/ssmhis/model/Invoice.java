package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * invoice
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice implements Serializable {
    /**
     * 发票号
     */
    private Integer invoId;

    /**
     * 发票金额
     */
    private Double invoAmount;

    /**
     * 发票状态
     */
    private Integer invoState;

    /**
     * 收/退费时间
     */
    private LocalDateTime collrefundTime;

    /**
     * 收/退费人员ID
     */
    private Integer collrefundPerid;

    /**
     * 收费方式
     */
    private Integer chargeId;

    /**
     * 冲红发票
     */
    private Integer redInvoid;

    /**
     * 发票状态
     */
    private Integer stateInvo;

    /**
     * 删除标识
     */
    private Integer delflag;



    private static final long serialVersionUID = 1L;

    public Integer getInvoId() {
        return invoId;
    }

    public void setInvoId(Integer invoId) {
        this.invoId = invoId;
    }

    public Double getInvoAmount() {
        return invoAmount;
    }

    public void setInvoAmount(Double invoAmount) {
        this.invoAmount = invoAmount;
    }

    public Integer getInvoState() {
        return invoState;
    }

    public void setInvoState(Integer invoState) {
        this.invoState = invoState;
    }

    public LocalDateTime getCollrefundTime() {
        return collrefundTime;
    }

    public void setCollrefundTime(LocalDateTime collrefundTime) {
        this.collrefundTime = collrefundTime;
    }

    public Integer getCollrefundPerid() {
        return collrefundPerid;
    }

    public void setCollrefundPerid(Integer collrefundPerid) {
        this.collrefundPerid = collrefundPerid;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public Integer getRedInvoid() {
        return redInvoid;
    }

    public void setRedInvoid(Integer redInvoid) {
        this.redInvoid = redInvoid;
    }

    public Integer getStateInvo() {
        return stateInvo;
    }

    public void setStateInvo(Integer stateInvo) {
        this.stateInvo = stateInvo;
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
        Invoice other = (Invoice) that;
        return (this.getInvoId() == null ? other.getInvoId() == null : this.getInvoId().equals(other.getInvoId()))
            && (this.getInvoAmount() == null ? other.getInvoAmount() == null : this.getInvoAmount().equals(other.getInvoAmount()))
            && (this.getInvoState() == null ? other.getInvoState() == null : this.getInvoState().equals(other.getInvoState()))
            && (this.getCollrefundTime() == null ? other.getCollrefundTime() == null : this.getCollrefundTime().equals(other.getCollrefundTime()))
            && (this.getCollrefundPerid() == null ? other.getCollrefundPerid() == null : this.getCollrefundPerid().equals(other.getCollrefundPerid()))
            && (this.getChargeId() == null ? other.getChargeId() == null : this.getChargeId().equals(other.getChargeId()))
            && (this.getRedInvoid() == null ? other.getRedInvoid() == null : this.getRedInvoid().equals(other.getRedInvoid()))
            && (this.getStateInvo() == null ? other.getStateInvo() == null : this.getStateInvo().equals(other.getStateInvo()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInvoId() == null) ? 0 : getInvoId().hashCode());
        result = prime * result + ((getInvoAmount() == null) ? 0 : getInvoAmount().hashCode());
        result = prime * result + ((getInvoState() == null) ? 0 : getInvoState().hashCode());
        result = prime * result + ((getCollrefundTime() == null) ? 0 : getCollrefundTime().hashCode());
        result = prime * result + ((getCollrefundPerid() == null) ? 0 : getCollrefundPerid().hashCode());
        result = prime * result + ((getChargeId() == null) ? 0 : getChargeId().hashCode());
        result = prime * result + ((getRedInvoid() == null) ? 0 : getRedInvoid().hashCode());
        result = prime * result + ((getStateInvo() == null) ? 0 : getStateInvo().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", invoId=").append(invoId);
        sb.append(", invoAmount=").append(invoAmount);
        sb.append(", invoState=").append(invoState);
        sb.append(", collrefundTime=").append(collrefundTime);
        sb.append(", collrefundPerid=").append(collrefundPerid);
        sb.append(", chargeId=").append(chargeId);
        sb.append(", redInvoid=").append(redInvoid);
        sb.append(", stateInvo=").append(stateInvo);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}