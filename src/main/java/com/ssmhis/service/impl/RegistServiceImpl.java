package com.ssmhis.service.impl;

import com.ssmhis.dao.RegistDao;
import com.ssmhis.model.Regist;
import com.ssmhis.service.RegistService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/9
 */
@Service
public class RegistServiceImpl implements RegistService {

    @Autowired
    private RegistDao registDao;


    @Override
    public Integer queryPrePat(Regist regist) {
        Integer prePat = registDao.queryPrePat(regist);
        return prePat;
    }

    @Override
    public void addReg(Regist regist) {
        registDao.addreg(regist);
    }

    @Override
    public Integer queryregid() {
        Integer regid = registDao.queryRegID();
        return regid;
    }

    @Override
    public void changeRstate(Regist regist) {
        registDao.updateByPrimaryKeySelective(regist);
    }

}
