package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysDemo implements Serializable {
    private Integer id;

    private String testName;

    private String testDesc;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    private Integer isDelete;

}