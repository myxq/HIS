package com.ssmhis.service.impl;

import com.ssmhis.dao.DoctorDao;
import com.ssmhis.model.Doctor;
import com.ssmhis.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorDao doctorDao;

    @Override
    public List<Doctor> queryDocWithDep(Doctor doctor) {
        List<Doctor> doctorList = doctorDao.querydocwithdep(doctor);
        return doctorList;
    }

    @Override
    public Doctor queryDoc(Doctor doctor) {
        Doctor doctor1 = doctorDao.querydoc(doctor);
        return doctor1;
    }
}
