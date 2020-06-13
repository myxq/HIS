package com.ssmhis.service.impl;

import com.ssmhis.dao.InvoiceDao;
import com.ssmhis.model.Invoice;
import com.ssmhis.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 李永庆
 * @since 2019/9/4
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;


    @Override
    public Integer queryMaxNum() {
        Integer maxNum = invoiceDao.queryMaxNum();
        return maxNum;
    }


    @Override
    public void saveInvo(Invoice invoice) {
        invoiceDao.insertNewinvo(invoice);
    }
}
