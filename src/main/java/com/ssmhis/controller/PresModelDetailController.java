package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.PresModelDetail;
import com.ssmhis.service.PresModelDetailService;
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
@RequestMapping("presModDetail")
public class PresModelDetailController {

    @Autowired
    private PresModelDetailService presModelDetailService;

    /**
     * 查询处方明细
     * @param presModelDetail
     * @return
     */
    @RequestMapping(value = "searchmoddetail",method = RequestMethod.POST)
    @ResponseBody
    public Msg searchmoddetail(@RequestBody PresModelDetail presModelDetail){
        List<PresModelDetail> presModelDetailList = presModelDetailService.searchmoddetail(presModelDetail);
        return Msg.success().add("presModelDetailList",presModelDetailList);
    }
}
