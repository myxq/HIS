package com.ssmhis.dao;

import com.ssmhis.model.Diagnosis;

public interface DiagnosisDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Diagnosis record);

    int insertSelective(Diagnosis record);

    Diagnosis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Diagnosis record);

    int updateByPrimaryKey(Diagnosis record);
}