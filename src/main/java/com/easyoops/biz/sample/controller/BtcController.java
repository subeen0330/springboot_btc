package com.easyoops.biz.sample.controller;

import com.easyoops.biz.sample.dto.BtcDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@Api(value = "btc API")
@RestController
@RequestMapping("/btc")
public class BtcController {

    @PostMapping("/plus")
    @ApiOperation(value = "더하기 api")
    public BtcDto plusMethod(@Valid @RequestBody BtcDto btcDto) {
        int no1 = btcDto.getNo1();
        int no2 = btcDto.getNo2();
        int answer = no1 + no2;

        btcDto.setAnswer(answer);
        return btcDto;
    }
}
