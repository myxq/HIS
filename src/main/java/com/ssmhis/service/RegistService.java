package com.ssmhis.service;

import com.ssmhis.model.Regist;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/9
 */
public interface RegistService {

    /**
     * 查询医生的已用号额
     * @return Integer
     */
    Integer queryPrePat(Regist regist);

    /**
     * 添加挂号信息
     */
    void addReg(Regist regist);

    /**
     * 查询可用的挂号ID
     * @return Integer
     */
    Integer queryregid();


    /**
     * 更改挂号状态
     * @param regist
     */
    void changeRstate(Regist regist);
}
