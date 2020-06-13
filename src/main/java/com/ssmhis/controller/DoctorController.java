package com.ssmhis.controller;

import com.ssmhis.model.Doctor;
import com.ssmhis.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
@Controller
@RequestMapping("doc")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    /**
     * 根据科室ID查找出该科室的所有医生
     * @param doctor
     * @return
     */
    @RequestMapping(value = "querydocwithdep", method = RequestMethod.POST)
    @ResponseBody
    public List<Doctor> querydocwithdep(@RequestBody Doctor doctor){
        List<Doctor> doctors = doctorService.queryDocWithDep(doctor);
        return doctors;
    }

    /**
     * 查询医生的号别、挂号费用和限额
     * @param doctor
     * @return
     */
    @RequestMapping(value = "querydoc", method = RequestMethod.POST)
    @ResponseBody
    public Doctor querydoc(@RequestBody Doctor doctor){
        Doctor doc = doctorService.queryDoc(doctor);
        return doc;
    }
}
