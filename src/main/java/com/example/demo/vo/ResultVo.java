package com.example.demo.vo;

import com.example.demo.common.baseEnum.ResultEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * http请求返回最外层的对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> {
    /**
     * 错误码.
     */
    private Integer code;
    /**
     * 提示信息.
     */
    private String msg;
    /**
     * 具体内容.
     */
    private T data;

}
