package com.andrew.mall;

import com.andrew.mall.controller.UserController;
import com.andrew.mall.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class mallApplication {
    public static void main(String[] args){

        SpringApplication.run(UserController.class,args);
    }
}
