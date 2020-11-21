package com.example.demo.common.baseEnum;

import lombok.Getter;

/**
 * Created by
 */
@Getter
public enum ResultEnum {


    SYS_ERROR(500,"系统繁忙,请稍后再试"),
    URL_ERROR(404,"路径不存在，请检查路径是否正确"),
    PARAM_FAIL_CODE(5001,"参数校验异常"),
    PARAM_EXPIRED_ERROR(1001,"请求参数已过期"),

    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
