package com.easyoops.biz.sample.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;

@Data
@Valid
public class BtcDto {
    @ApiModelProperty(value = "no1", required = true, example = "1")
    private int no1;

    @ApiModelProperty(value = "no2", required = true, example = "2")
    private int no2;

    @ApiModelProperty(hidden = true)
    private int answer;

}
