package com.ssmhis.service;

import com.ssmhis.model.Patient;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
public interface PatientService {

    /**
     * 患者首次挂号保存患者信息
     * @param patient
     */
    void addPatient(Patient patient);
}
