package com.ssmhis.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李永庆
 * @since 2019/8/25
 */
@Data
public class ResponseCode {


    public static final int SUCCESS = 2000;

    public static final int FAIL = 4000;

    private Integer code;

    private String msg;

    private String detail;

}
