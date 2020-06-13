package com.ssmhis.service;

import com.ssmhis.model.PresModelDetail;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
public interface PresModelDetailService {

    /**
     * 查询处方明细
     * @param presModelDetail
     * @return
     */
    List<PresModelDetail> searchmoddetail(PresModelDetail presModelDetail);
}
