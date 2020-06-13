package com.ssmhis.dao;

import com.ssmhis.model.PrescriptionModel;

import java.util.List;

public interface PrescriptionModelDao {
    int deleteByPrimaryKey(Integer prescripModid);

    int insert(PrescriptionModel record);

    int insertSelective(PrescriptionModel record);

    PrescriptionModel selectByPrimaryKey(Integer prescripModid);

    int updateByPrimaryKeySelective(PrescriptionModel record);

    int updateByPrimaryKey(PrescriptionModel record);

    /**
     * 查询处方模板
     * @param prescriptionModel
     * @return
     */
    List<PrescriptionModel> selectWithName(PrescriptionModel prescriptionModel);
}