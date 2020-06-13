package com.ssmhis.dao;

import com.ssmhis.model.Regist;

import java.util.List;

public interface RegistDao {
    int deleteByPrimaryKey(Integer registId);

    int insert(Regist record);

    int insertSelective(Regist record);

    Regist selectByPrimaryKey(Integer registId);

    int updateByPrimaryKeySelective(Regist record);

    int updateByPrimaryKey(Regist record);

    Integer queryPrePat(Regist regist);

    Integer queryRegID();

    void addreg(Regist regist);

}