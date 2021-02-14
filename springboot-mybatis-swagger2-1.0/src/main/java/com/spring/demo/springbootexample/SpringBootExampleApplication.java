package com.spring.demo.springbootexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.spring.demo.springbootexample.mybatis.mapper")
@SpringBootApplication
@EnableSwagger2
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        System.out.println("0信1息2信息3");
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }
}
