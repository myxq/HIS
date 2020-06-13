package com.ssmhis.service;

import com.ssmhis.model.PrescriptionDetail;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
public interface PrescriptionDetailService {
    /**
     * 保存患者处方明细
     * @param prescriptionDetail
     * @return
     */
    void addtopreDet(PrescriptionDetail prescriptionDetail);

}
