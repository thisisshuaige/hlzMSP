package com.hlz.domain.service.impl;

import com.hlz.domain.enums.ResponseStatusCode;
import com.hlz.domain.mapper.UserMapper;
import com.hlz.domain.models.User;
import com.hlz.domain.service.UserService;
import com.hlz.domain.viewmodels.QueryUserRes;
import com.hlz.domain.viewmodels.base.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询拥护
     * @return
     */
    @Override
    public Response<List<QueryUserRes>> queryUserAll(int pageNumber,int pageSize) {
        Response response = new Response("");
        QueryUserRes queryUserRes = new QueryUserRes();

        List<User> user = userMapper.selectUserAll(pageNumber - 1,pageSize);

        if (user == null){
            response.setCode(ResponseStatusCode.FAIL.code);
            response.setMsg("用户为空！");
            return response;
        }

        for (User users :user){
            queryUserRes.setId(users.getId());
            queryUserRes.setUserName(users.getUserName());
            queryUserRes.setPassWord(users.getPassWord());
            queryUserRes.setRealName(users.getRealName());
        }

        response.setPageNumber(pageNumber);
        response.setPageSize(pageSize);
        response.setTotal(userMapper.countUserAll());

        response.setContent(queryUserRes);
        return response;
    }
}
