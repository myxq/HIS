package com.ssmhis.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李永庆
 * @since 2019/9/4
 */
@Data
public class Msg {
    //状态码
    private int code;

    //提示信息
    private String msg;

    //用户要返回给浏览器的数据
    private Map<String, Object> extend = new HashMap<String, Object>();


    public static Msg success(){
        Msg result = new Msg();
        result.setCode(1000);
        result.setMsg("处理成功！");
        return result;
    }

    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(2000);
        result.setMsg("处理失败！");
        return result;
    }

    public Msg add(String key,Object value) {
        this.getExtend().put(key, value);
        return this;
    }

}
