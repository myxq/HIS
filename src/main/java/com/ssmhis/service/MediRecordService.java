package com.ssmhis.service;

import com.ssmhis.model.MediRecord;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/8/27
 */
public interface MediRecordService {
    /**
     * 根据病历号查询患者个人及用药信息
     * @param medrecnum
     * @return
     */
    List<MediRecord> queryByMediNum(Integer medrecnum);

    /**
     * 查询可用的病历号码
     * @return 可用的病历号码
     */
    Integer queryMaxMedNum();

    /**
     * 根据病历号查询患者基本信息
     * @param mediRecord
     * @return
     */
    MediRecord queryInfo(MediRecord mediRecord);

    /**
     * 根据病历号查询患者个人信息及挂号信息
     * @param medRecnum
     * @return
     */
    List<MediRecord> queryReg(Integer medRecnum);

    /**
     * 提交病历信息
     * @param mediRecord
     * @return
     */
    Boolean submitinfo(MediRecord mediRecord);
}
