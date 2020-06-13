package com.ssmhis.controller;

import com.ssmhis.model.Department;
import com.ssmhis.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
@Controller
@RequestMapping("dep")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    /**
     * 查询出所有的科室
     * @return Department对象
     */
    @ResponseBody
    @RequestMapping("querydepartment")
    public List<Department> querydepartment(){
        List<Department> department = departmentService.queryDep();
        return department;
    }
}
