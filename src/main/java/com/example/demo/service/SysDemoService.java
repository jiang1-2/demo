package com.example.demo.service;

import com.example.demo.dto.SysDemoDTO;
import com.example.demo.vo.PageVo;
import com.example.demo.vo.SysDemoVo;


public interface SysDemoService {


    PageVo findByAll(SysDemoDTO sysDemoDTO);

    SysDemoVo findByid(Integer id);
}
