package com.offcn.sbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = "com.offcn.sbootmybatis.mapper")

public class SbootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootmybatisApplication.class, args);
    }

}
