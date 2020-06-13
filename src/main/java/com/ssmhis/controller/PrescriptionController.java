package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Prescription;
import com.ssmhis.model.User;
import com.ssmhis.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Controller
@RequestMapping("prescrip")
@SessionAttributes("doctor")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;


    @ResponseBody
    @RequestMapping("querypresID")
    public Integer querypresID(){
        Integer presID = prescriptionService.querypresID();
        return presID;
    }


    @RequestMapping(value = "addtopres",method = RequestMethod.POST)
    @ResponseBody
    public Msg addtopres(@ModelAttribute("doctor") User doctor, ModelMap modelMap, @RequestBody Prescription prescription){
        prescription.setOpenTime( LocalDateTime.now());
        prescription.setOpenDocid(doctor.getDoctorId());
        prescriptionService.addtopres(prescription);
        return Msg.success();
    }
}
