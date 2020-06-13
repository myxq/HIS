package com.ssmhis.dao;

import com.ssmhis.model.Drugs;

import java.util.List;

public interface DrugsDao {
    int deleteByPrimaryKey(Integer drugId);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    Drugs selectByPrimaryKey(Integer drugId);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);

    /**
     * 模糊查询药品名称
     * @param drugs
     * @return
     */
    List<Drugs> searchdrugname(Drugs drugs);
}