package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    /**
     * 主键，标识每一个用户
     */
    private Integer doctorId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 职务ID
     */
    private Integer dutyId;

    /**
     * 是否参与排班
     */
    private String ynSchedul;

    /**
     * 用户所处科室ID
     */
    private Integer depId;

    /**
     * 挂号级别
     */
    private Integer regRankid;

    /**
     * 删除标识
     */
    private Integer delflag;

    private static final long serialVersionUID = 1L;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getDutyId() {
        return dutyId;
    }

    public void setDutyId(Integer dutyId) {
        this.dutyId = dutyId;
    }

    public String getYnSchedul() {
        return ynSchedul;
    }

    public void setYnSchedul(String ynSchedul) {
        this.ynSchedul = ynSchedul;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getRegRankid() {
        return regRankid;
    }

    public void setRegRankid(Integer regRankid) {
        this.regRankid = regRankid;
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
        User other = (User) that;
        return (this.getDoctorId() == null ? other.getDoctorId() == null : this.getDoctorId().equals(other.getDoctorId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getDutyId() == null ? other.getDutyId() == null : this.getDutyId().equals(other.getDutyId()))
            && (this.getYnSchedul() == null ? other.getYnSchedul() == null : this.getYnSchedul().equals(other.getYnSchedul()))
            && (this.getDepId() == null ? other.getDepId() == null : this.getDepId().equals(other.getDepId()))
            && (this.getRegRankid() == null ? other.getRegRankid() == null : this.getRegRankid().equals(other.getRegRankid()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDoctorId() == null) ? 0 : getDoctorId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getDutyId() == null) ? 0 : getDutyId().hashCode());
        result = prime * result + ((getYnSchedul() == null) ? 0 : getYnSchedul().hashCode());
        result = prime * result + ((getDepId() == null) ? 0 : getDepId().hashCode());
        result = prime * result + ((getRegRankid() == null) ? 0 : getRegRankid().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", doctorId=").append(doctorId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", realName=").append(realName);
        sb.append(", userType=").append(userType);
        sb.append(", dutyId=").append(dutyId);
        sb.append(", ynSchedul=").append(ynSchedul);
        sb.append(", depId=").append(depId);
        sb.append(", regRankid=").append(regRankid);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}