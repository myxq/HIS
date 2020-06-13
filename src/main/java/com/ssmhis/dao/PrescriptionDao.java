package com.ssmhis.dao;

import com.ssmhis.model.Prescription;

public interface PrescriptionDao {
    int deleteByPrimaryKey(Integer prescriptionId);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(Integer prescriptionId);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);

    /**
     * 查询可用处方ID
     * @return
     */
    Integer queryPresID();

}