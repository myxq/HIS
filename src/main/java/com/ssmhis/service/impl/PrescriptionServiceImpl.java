package com.ssmhis.service.impl;

import com.ssmhis.dao.PrescriptionDao;
import com.ssmhis.model.Prescription;
import com.ssmhis.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionDao prescriptionDao;

    @Override
    public Integer querypresID() {
        Integer prescriptionID =  prescriptionDao.queryPresID();
        return prescriptionID+1;
    }

    @Override
    public void addtopres(Prescription prescription) {
        prescriptionDao.insertSelective(prescription);
    }
}
