package com.ssmhis.controller;

import com.ssmhis.dto.Msg;
import com.ssmhis.model.Invoice;
import com.ssmhis.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 李永庆
 * @since 2019/9/4
 */
@Controller
@RequestMapping("invo")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    /**
     * 返回可用的发票号
     * @return
     */
    @ResponseBody
    @RequestMapping("querymaxnum")
    public Integer querymaxnum(){
        Integer maxNum = invoiceService.queryMaxNum();
        return maxNum+1;
    }

    /**
     * 保存患者发票信息
     * @return
     */

    @RequestMapping(value = "saveinvo", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveinvo(@RequestBody Invoice invoice){
        invoiceService.saveInvo(invoice);
        return Msg.success();
    }

}
