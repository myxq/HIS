package com.ssmhis.dao;

import com.ssmhis.model.ConstantItems;

public interface ConstantItemsDao {
    int deleteByPrimaryKey(Integer conId);

    int insert(ConstantItems record);

    int insertSelective(ConstantItems record);

    ConstantItems selectByPrimaryKey(Integer conId);

    int updateByPrimaryKeySelective(ConstantItems record);

    int updateByPrimaryKey(ConstantItems record);
}