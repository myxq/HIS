package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * patient
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient implements Serializable {
    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 患者姓名
     */
    private String patName;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 年龄类型（岁，月，天）
     */
    private String ageType;

    /**
     * 出生日期
     */
    private LocalDate birth;

    /**
     * 地址
     */
    private String address;

    /**
     * 患者病历号
     */
    private Integer pMedrecnum;

    /**
     * 删除标识
     */
    private Integer pDelflag;

    private List<PatRegist> patRegists;

    private static final long serialVersionUID = 1L;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getpMedrecnum() {
        return pMedrecnum;
    }

    public void setpMedrecnum(Integer pMedrecnum) {
        this.pMedrecnum = pMedrecnum;
    }

    public Integer getpDelflag() {
        return pDelflag;
    }

    public void setpDelflag(Integer pDelflag) {
        this.pDelflag = pDelflag;
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
        Patient other = (Patient) that;
        return (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getPatName() == null ? other.getPatName() == null : this.getPatName().equals(other.getPatName()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAgeType() == null ? other.getAgeType() == null : this.getAgeType().equals(other.getAgeType()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getpMedrecnum() == null ? other.getpMedrecnum() == null : this.getpMedrecnum().equals(other.getpMedrecnum()))
            && (this.getpDelflag() == null ? other.getpDelflag() == null : this.getpDelflag().equals(other.getpDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getPatName() == null) ? 0 : getPatName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAgeType() == null) ? 0 : getAgeType().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getpMedrecnum() == null) ? 0 : getpMedrecnum().hashCode());
        result = prime * result + ((getpDelflag() == null) ? 0 : getpDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idcard=").append(idcard);
        sb.append(", patName=").append(patName);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", ageType=").append(ageType);
        sb.append(", birth=").append(birth);
        sb.append(", address=").append(address);
        sb.append(", pMedrecnum=").append(pMedrecnum);
        sb.append(", pDelflag=").append(pDelflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}