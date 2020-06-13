package com.ssmhis.dao;

import com.ssmhis.model.Invoice;

public interface InvoiceDao {
    int deleteByPrimaryKey(Integer invoId);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(Integer invoId);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);

    Integer queryMaxNum();

    void insertNewinvo(Invoice invoice);
}