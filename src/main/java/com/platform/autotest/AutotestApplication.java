package com.platform.autotest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.platform.autotest.dao")
public class AutotestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutotestApplication.class, args);
    }
}
