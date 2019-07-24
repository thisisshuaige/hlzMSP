package com.hlz.domain.service.impl;

import com.hlz.domain.service.TestService;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class TestServiceImpl implements TestService {


    @Override
    public Date queryDate() {
        return new Date();
    }
}
