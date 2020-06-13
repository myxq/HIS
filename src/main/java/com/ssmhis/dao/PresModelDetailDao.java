package com.ssmhis.dao;

import com.ssmhis.model.PresModelDetail;

import java.util.List;

public interface PresModelDetailDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PresModelDetail record);

    int insertSelective(PresModelDetail record);

    PresModelDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PresModelDetail record);

    int updateByPrimaryKey(PresModelDetail record);

    List<PresModelDetail> searchModDetail(PresModelDetail presModelDetail);
}