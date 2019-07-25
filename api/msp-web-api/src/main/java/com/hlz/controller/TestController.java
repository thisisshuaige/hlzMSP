package com.hlz.controller;


import com.hlz.domain.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(tags = "测试接口",description = "黄")
@RestController
@RequestMapping(value = "test/testController/",produces = {"application/json;charset=UTF-8"})
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation("测试接口")
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Date test(){
        return testService.queryDate();
    }

}
