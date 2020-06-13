package com.ssmhis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmhis.dto.Msg;
import com.ssmhis.model.MediRecord;
import com.ssmhis.service.MediRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 李永庆
 * @since 2019/8/27
 */
@Controller
@RequestMapping("medi")
public class MediRecordController {

    @Autowired
    private MediRecordService mediRecordService;

    /**
     * 根据病历号查询患者的开药信息
     * @param mediRecord
     * @param model
     * @return
     */
    @RequestMapping("queryWithMedi")
    public String queryWithMedi(MediRecord mediRecord, Model model){
        // 如果
        if (mediRecord.getMedRecnum() == null){
            return "realCharge";
        }
        List<MediRecord> queryMedi = mediRecordService.queryByMediNum(mediRecord.getMedRecnum());

        model.addAttribute("queryMedi",queryMedi);

        return "realCharge";
    }

    /**
     * 查询可用的病历号码
     * @return 可用的病历号码
     */
    @ResponseBody
    @RequestMapping("querymaxmednum")
    public Integer querymaxmednum(){
        Integer maxMedNum = mediRecordService.queryMaxMedNum();
        return maxMedNum+1;
    }

    /**
     * 根据病历号查询患者基本信息
     * @param mediRecord
     * @return
     */
    @RequestMapping(value = "queryinfo", method = RequestMethod.POST)
    @ResponseBody
    public MediRecord queryinfo(@RequestBody MediRecord mediRecord){
        MediRecord mediRecord1 = mediRecordService.queryInfo(mediRecord);
        return mediRecord1;
    }

    /**
     * 查询患者挂号信息（分页查询）
     * @param pn
     * @param medRecnum
     * @param model
     * @return
     */
    @RequestMapping("queryReturnReg")
    @ResponseBody
    public Msg getMedInfoJson(@RequestParam(value = "pageNumber",defaultValue = "1")Integer pageNumber, @RequestParam(value = "medRecnum")Integer medRecnum, Model model){
        if (medRecnum == null){
            return null;
        }
        PageHelper.startPage(pageNumber,5);
        List<MediRecord> queryReg = mediRecordService.queryReg(medRecnum);
        PageInfo<MediRecord> pageInfo = new PageInfo<MediRecord>(queryReg,5);
        return Msg.success().add("pageInfo",pageInfo);
    }

    /**
     * 提交患者病历信息
     * @param mediRecord
     * @return
     */
    @RequestMapping(value = "submitinfo", method = RequestMethod.POST)
    @ResponseBody
    public Msg submitinfo(@RequestBody MediRecord mediRecord){
        Boolean f = mediRecordService.submitinfo(mediRecord);
        if (!f){
            return Msg.success();
        }
        return Msg.fail();
    }
}
