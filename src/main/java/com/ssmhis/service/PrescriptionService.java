package com.ssmhis.service;

import com.ssmhis.model.Prescription;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
public interface PrescriptionService {

    /**
     * 查询可用处方ID
     * @return
     */
    Integer querypresID();

    /**
     * 添加患者处方信息
     * @param prescription
     */
    void addtopres(Prescription prescription);
}
