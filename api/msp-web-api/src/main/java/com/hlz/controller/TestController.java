package com.hlz.controller;


import com.hlz.domain.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "test/testController/",produces = {"application/json;charset=UTF-8"})
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Date test(){
        return testService.queryDate();
    }

}
