package com.hlz.domain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.hlz.*")
@MapperScan("com.hlz.domain.mapper")
@EnableScheduling
public class HlzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlzApplication.class, args);
    }

}
