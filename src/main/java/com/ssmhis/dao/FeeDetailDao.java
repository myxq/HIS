package com.ssmhis.dao;

import com.ssmhis.model.FeeDetail;
import com.ssmhis.model.FeeDetailKey;

public interface FeeDetailDao {
    int deleteByPrimaryKey(FeeDetailKey key);

    int insert(FeeDetail record);

    int insertSelective(FeeDetail record);

    FeeDetail selectByPrimaryKey(FeeDetailKey key);

    int updateByPrimaryKeySelective(FeeDetail record);

    int updateByPrimaryKey(FeeDetail record);
}