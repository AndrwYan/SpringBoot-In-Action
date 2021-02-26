package com.andrew.mall.controller;

import com.andrew.mall.domain.User;
import com.andrew.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping(value = "/user",produces = {"application/json;charset=UTF-8"})
    public void getAllUser(){
        List<User> allUser=userService.getAllUser();
        for(User user:allUser){
            System.out.println(user);
        }
    }
}
