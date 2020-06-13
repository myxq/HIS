package com.ssmhis.dao;

import com.ssmhis.model.MediRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MediRecordDao {
    int deleteByPrimaryKey(Integer medRecnum);

    int insert(MediRecord record);

    int insertSelective(MediRecord record);

    MediRecord selectByPrimaryKey(Integer medRecnum);

    int updateByPrimaryKeySelective(MediRecord record);

    int updateByPrimaryKey(MediRecord record);

    List<MediRecord> queryByMediNum(Integer medrecnum);

    Integer querymaxmednum();

    MediRecord queryInfo(MediRecord mediRecord);

    List<MediRecord> queryreg(@Param("medRecnum") Integer medRecnum);
}