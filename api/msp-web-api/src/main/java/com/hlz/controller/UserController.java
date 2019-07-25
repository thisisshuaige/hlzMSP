package com.hlz.controller;


import com.hlz.domain.service.UserService;
import com.hlz.domain.viewmodels.QueryUserRes;
import com.hlz.domain.viewmodels.base.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "用户相关接口",description = "黄")
@RestController
@RequestMapping(value = "/user/",produces = {"application/json;charset=UTF-8"})
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户
     * @return
     */
    @ApiOperation(value = "查询用户")
    @ResponseBody
    @RequestMapping(value = "queryUser",method = RequestMethod.GET)
    public Response<List<QueryUserRes>> queryUser(
                                @RequestParam(value = "pageNumber",required = false,defaultValue = "1")@ApiParam("当前页") int pageNumber,
                                @RequestParam(value = "pageSize",required = false,defaultValue = "10")@ApiParam("每页显示条数") int pageSize){
        return userService.queryUserAll(pageNumber,pageSize);
    }
}
