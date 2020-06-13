package com.ssmhis.dao;

import com.ssmhis.model.PatRegist;
import com.ssmhis.model.PatRegistKey;
import com.ssmhis.model.Regist;

import java.util.List;

public interface PatRegistDao {
    int deleteByPrimaryKey(PatRegistKey key);

    int insert(PatRegist record);

    int insertSelective(PatRegist record);

    PatRegist selectByPrimaryKey(PatRegistKey key);

    int updateByPrimaryKeySelective(PatRegist record);

    int updateByPrimaryKey(PatRegist record);

    void addpatreg(PatRegist patRegist);

    /**
     *查询挂了某位医生号的
     * @param regist
     * @return
     */
    List<Regist> queryDocPati(Regist regist);

    List<Regist> querydepPatient(Regist regist);

    void changepstate(PatRegist patRegist);
}