package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * PageDto
 */
@Data
public class PageDto {

    @NotNull(message = "pageNum不能为空")
    private Integer pageNum;

    @NotNull(message = "pageSize不能为空")
    private Integer pageSize;

}
