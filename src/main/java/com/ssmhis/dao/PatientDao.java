package com.ssmhis.dao;

import com.ssmhis.model.Patient;

public interface PatientDao {
    int deleteByPrimaryKey(String idcard);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String idcard);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}