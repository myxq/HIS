package com.ssmhis.service.impl;

import com.ssmhis.dao.PrescriptionDetailDao;
import com.ssmhis.model.PrescriptionDetail;
import com.ssmhis.service.PrescriptionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Service
public class PrescriptionDetailServiceImpl implements PrescriptionDetailService {

    @Autowired
    private PrescriptionDetailDao prescriptionDetailDao;

    @Override
    public void addtopreDet(PrescriptionDetail prescriptionDetail) {
        prescriptionDetailDao.addtopreDet(prescriptionDetail);
    }
}
