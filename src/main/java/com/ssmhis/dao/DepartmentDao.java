package com.ssmhis.dao;

import com.ssmhis.model.Department;

import java.util.List;

public interface DepartmentDao {
    int deleteByPrimaryKey(Integer depId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer depId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> querydep();
}