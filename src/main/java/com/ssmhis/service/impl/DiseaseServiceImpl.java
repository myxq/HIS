package com.ssmhis.service.impl;

import com.ssmhis.dao.DiseaseDao;
import com.ssmhis.model.Disease;
import com.ssmhis.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/21
 */
@Service
public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    private DiseaseDao diseaseDao;

    @Override
    public List<Disease> queryDiseases(Disease disease) {
        List<Disease> diseaseList = diseaseDao.queryDiseases(disease);
        return diseaseList;
    }
}
