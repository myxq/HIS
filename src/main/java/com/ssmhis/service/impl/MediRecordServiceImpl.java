package com.ssmhis.service.impl;

import com.ssmhis.dao.MediRecordDao;
import com.ssmhis.model.MediRecord;
import com.ssmhis.service.MediRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/8/27
 */
@Service
public class MediRecordServiceImpl implements MediRecordService {

    @Autowired
    private MediRecordDao mediRecordDao;


    @Override
    public List<MediRecord> queryByMediNum(Integer medrecnum) {

        List<MediRecord> mediRecords = mediRecordDao.queryByMediNum(medrecnum);

        return mediRecords;
    }

    @Override
    public Integer queryMaxMedNum() {
        Integer maxMedNum = mediRecordDao.querymaxmednum();
        return maxMedNum;
    }

    @Override
    public MediRecord queryInfo(MediRecord mediRecord) {
        MediRecord mediRecord2 = mediRecordDao.queryInfo(mediRecord);
        return mediRecord2;
    }

    @Override
    public List<MediRecord> queryReg(Integer medRecnum) {
        List<MediRecord> pattienReg = mediRecordDao.queryreg(medRecnum);
        return pattienReg;
    }

    @Override
    public Boolean submitinfo(MediRecord mediRecord) {
        int n = mediRecordDao.insertSelective(mediRecord);
        return n == 0;
    }

}
