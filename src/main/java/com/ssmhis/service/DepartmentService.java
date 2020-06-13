package com.ssmhis.service;

import com.ssmhis.model.Department;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
public interface DepartmentService {
    /**
     * 查询出所有的科室
     * @return Department对象
     */
    List<Department> queryDep();
}
