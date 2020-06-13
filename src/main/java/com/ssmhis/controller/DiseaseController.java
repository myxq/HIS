package com.ssmhis.controller;

import com.ssmhis.model.Department;
import com.ssmhis.model.Disease;
import com.ssmhis.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/20
 */
@Controller
@RequestMapping("dise")
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    /**
     * 查询疾病信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "searchDise", method = RequestMethod.POST)
    public List<Disease> searchDise(@RequestBody Disease disease){
        List<Disease> diseases = diseaseService.queryDiseases(disease);
        return diseases;
    }
}
