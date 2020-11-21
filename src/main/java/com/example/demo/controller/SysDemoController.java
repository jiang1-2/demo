package com.example.demo.controller;

import com.example.demo.common.util.ResultVOUtil;
import com.example.demo.dto.SysDemoDTO;
import com.example.demo.service.SysDemoService;
import com.example.demo.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * @author fhj
 * @version 1.0
 * @ClassName SysDemoController
 * @Description TODO
 * @date 2020/11/21  19:28
 **/
@Api(description = "测试")
@RestController
@RequestMapping("/sysDemo")
public class SysDemoController {

    @Autowired
    private SysDemoService sysDemoService;


    @ApiOperation(value = "测试查询列表", notes = "查询列表")
    @RequestMapping(value = "/findByAll",method = RequestMethod.POST)
    public ResultVo findByAll(@RequestBody @Validated SysDemoDTO sysDemoDTO) {
        return ResultVOUtil.success(sysDemoService.findByAll(sysDemoDTO));
    }

    @ApiOperation(value = "测试根据id查询", notes = "根据id查询")
    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public ResultVo getById(@RequestParam("id")Integer id) {
        return ResultVOUtil.success(sysDemoService.findByid(id));
    }
}
