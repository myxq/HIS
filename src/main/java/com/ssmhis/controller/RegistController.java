package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Regist;
import com.ssmhis.model.User;
import com.ssmhis.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author 李永庆
 * @since 2019/9/9
 */
@Controller
@RequestMapping("regist")
public class RegistController {

    @Autowired
    RegistService registService;

    /**
     * 查询医生的已用号额
     * @param regist
     * @return
     */
    @RequestMapping(value = "queryprepat",method = RequestMethod.POST)
    @ResponseBody
    public Integer queryprepat(@RequestBody Regist regist){
        Integer prePat = registService.queryPrePat(regist);
        return prePat;
    }

    /**
     * 添加挂号信息
     * @param regist
     * @return
     */
    @RequestMapping(value = "addreg", method = RequestMethod.POST)
    @ResponseBody
    public Msg addreg(@RequestBody Regist regist){
        registService.addReg(regist);
        return Msg.success();
    }

    /**
     * 查询可用的挂号ID
     */
    @RequestMapping("queryregid")
    @ResponseBody
    public Integer queryregid(){
        Integer registID = registService.queryregid();
        return registID+1;
    }

    /**
     * 更改挂号状态
     * @param regist
     * @return
     */
    @RequestMapping(value = "changeRstate",method = RequestMethod.POST)
    @ResponseBody
    public Msg  changeRstate(@RequestBody Regist regist){
        registService.changeRstate(regist);
        return Msg.success();
    }


}
