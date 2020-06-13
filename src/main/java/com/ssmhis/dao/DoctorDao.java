package com.ssmhis.dao;

import com.ssmhis.model.Doctor;

import java.util.List;

public interface DoctorDao {
    int deleteByPrimaryKey(Integer docId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer docId);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    List<Doctor> querydocwithdep(Doctor doctor);

    Doctor querydoc(Doctor doctor);
}