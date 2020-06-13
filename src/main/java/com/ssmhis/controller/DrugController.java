package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Drugs;
import com.ssmhis.service.DrugService;
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
@RequestMapping("drug")
public class DrugController {

    @Autowired
    private DrugService drugService;

    /**
     * 根据药品名称模糊查询药品信息
     * @param drugs
     * @return
     */
    @RequestMapping(value = "searchDrugname",method = RequestMethod.POST)
    @ResponseBody
    public Msg searchDrugname(@RequestBody Drugs drugs){
        List<Drugs> drugsList = drugService.searchDrugname(drugs);
        return Msg.success().add("drugsList",drugsList);
    }


    @RequestMapping(value = "querydruginfo",method = RequestMethod.POST)
    @ResponseBody
    public Msg querydruginfo(@RequestBody Drugs drugs){
        Drugs thisdrugs= drugService.querydruginfo(drugs);
        return Msg.success().add("drug",thisdrugs);
    }
}
