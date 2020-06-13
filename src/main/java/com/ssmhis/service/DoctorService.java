package com.ssmhis.service;

import com.ssmhis.model.Doctor;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
public interface DoctorService {

    /**
     * 根据科室ID查找该科室中的所有医生
     * @return
     */
    List<Doctor> queryDocWithDep(Doctor doctor);

    /**
     * 查询医生的挂号限额，号别和挂号费用
     * @param doctor
     * @return
     */
    Doctor queryDoc(Doctor doctor);
}
