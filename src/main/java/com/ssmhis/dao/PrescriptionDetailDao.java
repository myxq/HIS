package com.ssmhis.dao;

import com.ssmhis.model.PrescriptionDetail;
import com.ssmhis.model.PrescriptionDetailKey;

public interface PrescriptionDetailDao {
    int deleteByPrimaryKey(PrescriptionDetailKey key);

    int insert(PrescriptionDetail record);

    int insertSelective(PrescriptionDetail record);

    PrescriptionDetail selectByPrimaryKey(PrescriptionDetailKey key);

    int updateByPrimaryKeySelective(PrescriptionDetail record);

    int updateByPrimaryKey(PrescriptionDetail record);

    void addtopreDet(PrescriptionDetail prescriptionDetail);
}