package com.ssmhis.service.impl;

import com.ssmhis.dao.DrugsDao;
import com.ssmhis.model.Drugs;
import com.ssmhis.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugsDao drugsDao;

    @Override
    public List<Drugs> searchDrugname(Drugs drugs) {
        List<Drugs> drugs1 = drugsDao.searchdrugname(drugs);
        return drugs1;
    }

    @Override
    public Drugs querydruginfo(Drugs drugs) {
        Drugs drug = drugsDao.selectByPrimaryKey(drugs.getDrugId());
        return drug;
    }
}
