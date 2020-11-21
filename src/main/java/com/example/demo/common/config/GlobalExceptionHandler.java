package com.example.demo.common.config;


import com.example.demo.common.baseEnum.ResultEnum;
import com.example.demo.common.exception.BizException;
import com.example.demo.common.util.ResultVOUtil;
import com.example.demo.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;


/**
 * @author
 * @ClassName: GlobalExceptionHandler
 * @Description: 全局异常处理器
 * @date
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    private static int PARAM_FAIL_CODE = 1111;

    /**
     * 方法参数校验
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);

        return ResultVOUtil.error(ResultEnum.PARAM_FAIL_CODE,  e.getBindingResult().getFieldError().getDefaultMessage());
    }

    /**
     * 处理自定义异常--业务逻辑异常
     */
    @ExceptionHandler(BizException.class)
    public ResultVo handleRRException(BizException e) {
        log.error(e.getMessage(), e);
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }


    @ExceptionHandler(NoHandlerFoundException.class)
    public ResultVo handlerNoFoundException(NoHandlerFoundException e) {
        log.error(e.getMessage(), e);
        return ResultVOUtil.error(ResultEnum.PARAM_FAIL_CODE);
    }

    @ExceptionHandler(Exception.class)
    public ResultVo handleException(Exception e) {;
        log.error(e.getMessage(), e);
      return ResultVOUtil.error(ResultEnum.SYS_ERROR);
    }



}
