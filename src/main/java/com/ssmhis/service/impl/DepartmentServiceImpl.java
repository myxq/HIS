package com.ssmhis.service.impl;

import com.ssmhis.dao.DepartmentDao;
import com.ssmhis.model.Department;
import com.ssmhis.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> queryDep() {
        List<Department> departments = departmentDao.querydep();
        return departments;
    }
}
