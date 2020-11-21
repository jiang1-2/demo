package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.common.converter.SysDemoConverter;
import com.example.demo.common.util.ResultVOUtil;
import com.example.demo.dto.SysDemoDTO;
import com.example.demo.entity.SysDemo;
import com.example.demo.mapper.SysDemoMapper;
import com.example.demo.service.SysDemoService;
import com.example.demo.vo.PageVo;
import com.example.demo.vo.SysDemoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SysDemoServiceImpl
 * @Description TODO
 * @date 2020/11/21  19:15
 **/
@Slf4j
@Service
public class SysDemoServiceImpl implements SysDemoService {

    @Autowired
    private SysDemoMapper sysDemoMapper;

    @Autowired
    private SysDemoConverter sysDemoConverter;

    @Override
    public PageVo findByAll(SysDemoDTO sysDemoDTO) {

        PageHelper.startPage(sysDemoDTO.getPageNum(),sysDemoDTO.getPageSize());
        PageInfo<SysDemoVo> pageInfo= new PageInfo<>(sysDemoMapper.findByAll(sysDemoDTO));
        return   new PageVo(pageInfo.getTotal(),pageInfo.getList());
    }

    @Override
    public SysDemoVo findByid(Integer id) {

        log.info("findByid param {} ",id);
        SysDemo sysDemo =  sysDemoMapper.selectByPrimaryKey(id);
        SysDemoVo sysDemoVo = sysDemoConverter.entityToVO(sysDemo);
        log.info("findByid sysDemoVo {} ", JSON.toJSONString(sysDemoVo));
        return sysDemoVo;
    }
}
