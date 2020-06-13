package com.ssmhis.service;

import com.ssmhis.model.Disease;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/20
 */
public interface DiseaseService {

    /**
     * 查询疾病信息
     * @return
     */
    List<Disease> queryDiseases(Disease disease);
}
