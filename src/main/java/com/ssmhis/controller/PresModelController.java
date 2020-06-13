package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.PrescriptionModel;
import com.ssmhis.service.PresModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/22
 */
@Controller
@RequestMapping("presmodel")
public class PresModelController {

    @Autowired
    private PresModelService presModelService;

    /**
     * 查询处方模板
     * @param prescriptionModel
     * @return
     */
    @RequestMapping(value = "searchpresmodel",method = RequestMethod.POST)
    @ResponseBody
    public Msg searchpresmodel(@RequestBody PrescriptionModel prescriptionModel){
        List<PrescriptionModel> prescriptionModelList = presModelService.searchpesmodel(prescriptionModel);
        return Msg.success().add("presModelList",prescriptionModelList);
    }
}
