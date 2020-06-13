package com.ssmhis.dao;

import com.ssmhis.model.Disease;

import java.util.List;

public interface DiseaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    int insertSelective(Disease record);

    Disease selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);

    /**
     * 查询疾病信息
     * @return
     */
    List<Disease> queryDiseases(Disease disease);
}