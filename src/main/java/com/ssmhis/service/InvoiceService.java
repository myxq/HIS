package com.ssmhis.service;

import com.ssmhis.model.Invoice;

/**
 * @author 李永庆
 * @since 2019/9/4
 */
public interface InvoiceService {
    /**
     * 查询当前最大的发票号
     * @return 当前最大的发票号
     */
    Integer queryMaxNum();

    void saveInvo(Invoice invoice);
}
