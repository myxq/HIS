package com.ssmhis.service;

import com.ssmhis.model.PatRegist;
import com.ssmhis.model.Regist;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/10
 */
public interface PatRegService {

    /**
     * 添加患者挂号对应信息
     * @param patRegist
     */
    void addPatReg(PatRegist patRegist);

    /**
     * 退号
     * @param patRegist
     */
    boolean returnreg(PatRegist patRegist);

    /**
     * 查询挂了某位医生号的
     * @param regist
     * @return
     */
    List<Regist> querydocpatient(Regist regist);

    /**
     * 查询科室的待诊患者和已诊患者
     * @param regist
     * @return
     */
    List<Regist> querydeppatient(Regist regist);

    /**
     * 更改就诊状态
     * @param patRegist
     * @return
     */
    void changePstate(PatRegist patRegist);
}
