package com.hlz.domain.service;

import com.hlz.domain.viewmodels.QueryUserRes;
import com.hlz.domain.viewmodels.base.Response;

import java.util.List;

public interface UserService {


    /**
     * 查询用户
     */
    Response<List<QueryUserRes>> queryUserAll(int pageNumber,int pgaeSize);
}
