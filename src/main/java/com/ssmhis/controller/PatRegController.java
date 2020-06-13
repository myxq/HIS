package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Doctor;
import com.ssmhis.model.PatRegist;
import com.ssmhis.model.Regist;
import com.ssmhis.model.User;
import com.ssmhis.service.PatRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/10
 */
@Controller
@RequestMapping("patreg")
@SessionAttributes("doctor")
public class PatRegController {

    @Autowired
    private PatRegService patRegService;

    /**
     * 挂号
     * @param patRegist
     * @return
     */
    @RequestMapping(value = "addpatreg",method = RequestMethod.POST)
    @ResponseBody
    public Msg addpatreg(@RequestBody PatRegist patRegist){
        patRegService.addPatReg(patRegist);
        return Msg.success();
    }

    /**
     * 退号
     * @param patRegist
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "returnReg",method = RequestMethod.POST)
    public Msg returnReg(@RequestBody PatRegist patRegist){
        boolean f = patRegService.returnreg(patRegist);
        if (!f){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }

    /**
     * 查询挂了某位医生号的待诊患者和已诊患者
     * @param doctor
     * @return
     */
    @RequestMapping(value = "querydocpatient",method = RequestMethod.POST)
    @ResponseBody
    public Msg querydocpatient(@ModelAttribute("doctor") User doctor, ModelMap modelMap){
        Regist regist = new Regist();
        regist.setrDocid(doctor.getDoctorId());
        regist.setConsultDate(LocalDate.now());
        List<Regist> docPatients = patRegService.querydocpatient(regist);
        return Msg.success().add("docPatients",docPatients);
    }

    /**
     * 查询科室的待诊患者和已诊患者
     * @param doctor
     * @return
     */
    @RequestMapping(value = "querydeppatient",method = RequestMethod.POST)
    @ResponseBody
    public Msg querydeppatient(@ModelAttribute("doctor") User doctor, ModelMap modelMap){
        Regist regist = new Regist();
        regist.setrDocid(doctor.getDoctorId());
        regist.setConsultDate(LocalDate.now());
        List<Regist> depPatients = patRegService.querydeppatient(regist);
        return Msg.success().add("depPatients",depPatients);
    }

    /**
     * 更改就诊状态
     * @param patRegist
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "changePstate",method = RequestMethod.POST)
    public Msg changePstate(@RequestBody PatRegist patRegist){
        patRegService.changePstate(patRegist);
        return Msg.success();
    }
}
