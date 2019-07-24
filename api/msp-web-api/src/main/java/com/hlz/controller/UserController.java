package com.hlz.controller;


import com.hlz.domain.service.UserService;
import com.hlz.domain.viewmodels.QueryUserRes;
import com.hlz.domain.viewmodels.base.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user/",produces = {"application/json;charset=UTF-8"})
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户
     * @return
     */
    @RequestMapping(value = "queryUser",method = RequestMethod.GET)
    @ResponseBody
    public Response<List<QueryUserRes>> queryUser(
                                @RequestParam(required = false,defaultValue = "1")int pageNumber,
                                @RequestParam(required = false,defaultValue = "10")int pageSize){
        return userService.queryUserAll(pageNumber,pageSize);
    }
}
