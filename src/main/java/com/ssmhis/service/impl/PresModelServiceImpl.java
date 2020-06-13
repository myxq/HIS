package com.ssmhis.service.impl;

import com.ssmhis.dao.PrescriptionModelDao;
import com.ssmhis.model.PrescriptionModel;
import com.ssmhis.service.PresModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Service
public class PresModelServiceImpl implements PresModelService {

    @Autowired
    private PrescriptionModelDao prescriptionModelDao;

    @Override
    public List<PrescriptionModel> searchpesmodel(PrescriptionModel prescriptionModel) {
        List<PrescriptionModel> prescriptionModels =  prescriptionModelDao.selectWithName(prescriptionModel);

        return prescriptionModels;
    }
}
