package com.ssmhis.service;

import com.ssmhis.model.PrescriptionModel;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
public interface PresModelService {
    /**
     * 查询处方模板
     * @param prescriptionModel
     * @return
     */
    List<PrescriptionModel> searchpesmodel(PrescriptionModel prescriptionModel);
}
