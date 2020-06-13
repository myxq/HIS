package com.ssmhis.service.impl;

import com.ssmhis.dao.PatRegistDao;
import com.ssmhis.model.PatRegist;
import com.ssmhis.model.Regist;
import com.ssmhis.service.PatRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/10
 */
@Service
public class PatRegServiceImpl implements PatRegService {

    @Autowired
    private PatRegistDao patRegistDao;

    @Override
    public void addPatReg(PatRegist patRegist) {
        patRegistDao.addpatreg(patRegist);
    }

    @Override
    public boolean returnreg(PatRegist patRegist) {
        int num = patRegistDao.updateByPrimaryKeySelective(patRegist);
        return num == 0;
    }

    @Override
    public List<Regist> querydocpatient(Regist regist) {
        List<Regist> patients = patRegistDao.queryDocPati(regist);
        return patients;
    }

    @Override
    public List<Regist> querydeppatient(Regist regist) {
        List<Regist> depPatients = patRegistDao.querydepPatient(regist);
        return null;
    }

    @Override
    public void changePstate(PatRegist patRegist) {
        patRegistDao.changepstate(patRegist);
    }
}
