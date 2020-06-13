package com.ssmhis.service.impl;

import com.ssmhis.dao.PatientDao;
import com.ssmhis.model.Patient;
import com.ssmhis.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    @Override
    public void addPatient(Patient patient) {
        patientDao.insertSelective(patient);
    }
}
