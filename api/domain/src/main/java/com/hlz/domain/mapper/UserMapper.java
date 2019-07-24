package com.hlz.domain.mapper;


import com.hlz.domain.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

     List<User> selectUserAll(int pageNumber,int pageSize);

     Integer countUserAll();
}
