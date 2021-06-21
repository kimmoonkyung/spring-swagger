package com.example.swagger.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRes {

    @ApiModelProperty(value = "사용자 이름", example = "노로투", required = true)
    private String name;

    @ApiModelProperty(value = "사용자 나이", example = "15", required = true)
    private int age;
}
