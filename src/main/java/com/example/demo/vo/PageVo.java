package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description: 返回的页面的分页实体
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVo {

    private Integer total;

    private List objList;

    public PageVo(Long total, List objList) {
        this.total = total.intValue();
        this.objList = objList;
    }
}
