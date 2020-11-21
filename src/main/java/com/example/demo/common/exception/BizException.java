package com.example.demo.common.exception;



import lombok.Data;

/**
 * Created by
 */
@Data
public class BizException extends RuntimeException{
    private Object data;
    private Integer code;


    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
    }




}
