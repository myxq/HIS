package com.ssmhis.service;

import com.ssmhis.model.Drugs;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
public interface DrugService {

    /**
     * 模糊查询药品名称
     * @param drugs
     * @return
     */
    List<Drugs> searchDrugname(Drugs drugs);

    /**
     * 根据药品ID查询药品信息
     * @param drugs
     * @return
     */
    Drugs querydruginfo(Drugs drugs);
}
