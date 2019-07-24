package com.hlz.domain.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {

    private Long id;

    private String userName;

    private String passWord;

    private String realName;

}
