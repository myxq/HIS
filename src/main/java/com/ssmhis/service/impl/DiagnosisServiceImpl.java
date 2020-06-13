package com.ssmhis.service.impl;

import com.ssmhis.dao.DiagnosisDao;
import com.ssmhis.model.Diagnosis;
import com.ssmhis.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李永庆
 * @since 2019/9/21
 */
@Service
public class DiagnosisServiceImpl implements DiagnosisService {

    @Autowired
    private DiagnosisDao diagnosisDao;

    @Override
    public void submitdia(Diagnosis diagnosis) {
        diagnosisDao.insertSelective(diagnosis);
    }
}
