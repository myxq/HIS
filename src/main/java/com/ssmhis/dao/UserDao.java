package com.ssmhis.dao;

import com.ssmhis.model.User;

public interface UserDao {
    int deleteByPrimaryKey(Integer doctorId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer doctorId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectWithInfo(User user);
}