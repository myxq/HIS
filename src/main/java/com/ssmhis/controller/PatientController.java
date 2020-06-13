package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Patient;
import com.ssmhis.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李永庆
 * @since 2019/9/7
 */
@Controller
@RequestMapping("patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    /**
     * 保存新增患者信息
     * @param patient
     * @return
     */
    @RequestMapping(value = "addpatient", method = RequestMethod.POST)
    @ResponseBody
    public Msg addpatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return Msg.success();
    }
}
