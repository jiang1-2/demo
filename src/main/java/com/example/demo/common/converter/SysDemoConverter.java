package com.example.demo.common.converter;

import com.example.demo.entity.SysDemo;
import com.example.demo.vo.SysDemoVo;
import org.mapstruct.Mapper;

/**
 * @author fhj
 * @version 1.0
 * @ClassName SysDemoConverter
 * @Description TODO
 * @date 2020/11/21  19:21
 **/
@Mapper(componentModel = "spring")
public interface SysDemoConverter {

    SysDemoVo entityToVO(SysDemo sysDemo);
}
