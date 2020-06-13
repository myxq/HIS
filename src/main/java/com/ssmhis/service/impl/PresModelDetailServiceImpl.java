package com.ssmhis.service.impl;

import com.ssmhis.dao.PresModelDetailDao;
import com.ssmhis.model.PresModelDetail;
import com.ssmhis.service.PresModelDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Service
public class PresModelDetailServiceImpl implements PresModelDetailService {

    @Autowired
    private PresModelDetailDao presModelDetailDao;

    @Override
    public List<PresModelDetail> searchmoddetail(PresModelDetail presModelDetail) {
        List<PresModelDetail> presModelDetails = presModelDetailDao.searchModDetail(presModelDetail);
        return presModelDetails;
    }
}
