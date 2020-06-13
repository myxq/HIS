package com.ssmhis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * doctor
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor implements Serializable {
    /**
     * 医生ID 
     */
    private Integer docId;

    /**
     * 医生姓名
     */
    private String docName;

    /**
     * 职务ID
     */
    private Integer docDutyid;

    /**
     * 所属科室ID
     */
    private Integer docDepid;

    /**
     * 医生登录用户名
     */
    private String docUsername;

    /**
     * 医生登录密码
     */
    private String docPassword;

    /**
     * 医生挂号级别
     */
    private Integer docRegrankid;

    /**
     * 删除标识
     */
    private Integer delflag;

    private RegistRank registRank;

    private Department department;

    private static final long serialVersionUID = 1L;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Integer getDocDutyid() {
        return docDutyid;
    }

    public void setDocDutyid(Integer docDutyid) {
        this.docDutyid = docDutyid;
    }

    public Integer getDocDepid() {
        return docDepid;
    }

    public void setDocDepid(Integer docDepid) {
        this.docDepid = docDepid;
    }

    public String getDocUsername() {
        return docUsername;
    }

    public void setDocUsername(String docUsername) {
        this.docUsername = docUsername;
    }

    public String getDocPassword() {
        return docPassword;
    }

    public void setDocPassword(String docPassword) {
        this.docPassword = docPassword;
    }

    public Integer getDocRegrankid() {
        return docRegrankid;
    }

    public void setDocRegrankid(Integer docRegrankid) {
        this.docRegrankid = docRegrankid;
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
        Doctor other = (Doctor) that;
        return (this.getDocId() == null ? other.getDocId() == null : this.getDocId().equals(other.getDocId()))
            && (this.getDocName() == null ? other.getDocName() == null : this.getDocName().equals(other.getDocName()))
            && (this.getDocDutyid() == null ? other.getDocDutyid() == null : this.getDocDutyid().equals(other.getDocDutyid()))
            && (this.getDocDepid() == null ? other.getDocDepid() == null : this.getDocDepid().equals(other.getDocDepid()))
            && (this.getDocUsername() == null ? other.getDocUsername() == null : this.getDocUsername().equals(other.getDocUsername()))
            && (this.getDocPassword() == null ? other.getDocPassword() == null : this.getDocPassword().equals(other.getDocPassword()))
            && (this.getDocRegrankid() == null ? other.getDocRegrankid() == null : this.getDocRegrankid().equals(other.getDocRegrankid()))
            && (this.getDelflag() == null ? other.getDelflag() == null : this.getDelflag().equals(other.getDelflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDocId() == null) ? 0 : getDocId().hashCode());
        result = prime * result + ((getDocName() == null) ? 0 : getDocName().hashCode());
        result = prime * result + ((getDocDutyid() == null) ? 0 : getDocDutyid().hashCode());
        result = prime * result + ((getDocDepid() == null) ? 0 : getDocDepid().hashCode());
        result = prime * result + ((getDocUsername() == null) ? 0 : getDocUsername().hashCode());
        result = prime * result + ((getDocPassword() == null) ? 0 : getDocPassword().hashCode());
        result = prime * result + ((getDocRegrankid() == null) ? 0 : getDocRegrankid().hashCode());
        result = prime * result + ((getDelflag() == null) ? 0 : getDelflag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docId=").append(docId);
        sb.append(", docName=").append(docName);
        sb.append(", docDutyid=").append(docDutyid);
        sb.append(", docDepid=").append(docDepid);
        sb.append(", docUsername=").append(docUsername);
        sb.append(", docPassword=").append(docPassword);
        sb.append(", docRegrankid=").append(docRegrankid);
        sb.append(", delflag=").append(delflag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}