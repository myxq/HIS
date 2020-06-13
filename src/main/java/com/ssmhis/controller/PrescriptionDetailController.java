package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.PrescriptionDetail;
import com.ssmhis.service.PrescriptionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Controller
@RequestMapping("presDet")
public class PrescriptionDetailController {

    @Autowired
    private PrescriptionDetailService prescriptionDetailService;

    /**
     * 保存患者处方明细
     * @param prescriptionDetail
     * @return
     */
    @RequestMapping(value = "addtopreDet",method = RequestMethod.POST)
    @ResponseBody
    public Msg addtopreDet(@RequestBody PrescriptionDetail prescriptionDetail){

        prescriptionDetailService.addtopreDet(prescriptionDetail);
        return Msg.success();
    }
}
