package com.example.demo.mapper;

import com.example.demo.dto.SysDemoDTO;
import com.example.demo.entity.SysDemo;
import com.example.demo.vo.SysDemoVo;

import java.util.List;

public interface SysDemoMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(SysDemo record);

    int insertSelective(SysDemo record);

    SysDemo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDemo record);

    int updateByPrimaryKey(SysDemo record);

    List<SysDemoVo> findByAll(SysDemoDTO sysDemoDTO);
}