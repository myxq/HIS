package com.ssmhis.dao;

import com.ssmhis.model.RegistRank;

public interface RegistRankDao {
    int deleteByPrimaryKey(Integer regRankid);

    int insert(RegistRank record);

    int insertSelective(RegistRank record);

    RegistRank selectByPrimaryKey(Integer regRankid);

    int updateByPrimaryKeySelective(RegistRank record);

    int updateByPrimaryKey(RegistRank record);
}