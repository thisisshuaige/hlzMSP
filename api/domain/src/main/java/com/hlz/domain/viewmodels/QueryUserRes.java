package com.hlz.domain.viewmodels;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class QueryUserRes {

    private Long id;

    private String userName;

    private String passWord;

    private String realName;
}
