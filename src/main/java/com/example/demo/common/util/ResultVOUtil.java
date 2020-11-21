package com.example.demo.common.util;


import com.example.demo.common.baseEnum.ResultEnum;
import com.example.demo.vo.ResultVo;

/**
 * ResultVOUtil
 */
public class ResultVOUtil {

    public static ResultVo success(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo saveSuccess(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("保存成功");
        return resultVO;
    }

    public static ResultVo saveSuccess(){
        return saveSuccess(null);
    }


    public static ResultVo delSuccess(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("删除成功");
        return resultVO;
    }

    public static ResultVo delSuccess(){
        return delSuccess(null);
    }

    public static ResultVo error(Integer code, String msg) {
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    //
    public static ResultVo error(ResultEnum resultEnum) {
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMessage());
        return resultVO;
    }

    public static ResultVo error(ResultEnum resultEnum, String msg) {
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(msg);
        return resultVO;
    }
    public static ResultVo delSuccess(int success, int fail) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(null);
        resultVO.setCode(0);
        resultVO.setMsg("删除成功"+success+"条,删除失败"+fail+"条");
        return resultVO;
    }

    public static ResultVo dataSuccess(String str) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(null);
        resultVO.setCode(0);
        resultVO.setMsg(str);
        return resultVO;
    }

    /**
     * 校验是否成功
     * @param resultVo
     * @return
     */
    public static boolean isSuccess(ResultVo resultVo) {
        if(resultVo != null){
            if(resultVo.getCode().equals(0)){
                return true;
            }
        }
        return false;
    }
}
