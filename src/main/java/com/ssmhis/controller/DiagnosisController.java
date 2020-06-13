package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Diagnosis;
import com.ssmhis.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李永庆
 * @since 2019/9/21
 */
@Controller
@RequestMapping("diag")
public class DiagnosisController {

    @Autowired
    private DiagnosisService diagnosisService;

    /**
     * 保存西医诊断
     * @param diagnosis
     * @return
     */
    @RequestMapping(value = "submitdia",method = RequestMethod.POST)
    @ResponseBody
    public Msg submitdia(@RequestBody Diagnosis diagnosis){
        diagnosisService.submitdia(diagnosis);
        return Msg.success();
    }
}
