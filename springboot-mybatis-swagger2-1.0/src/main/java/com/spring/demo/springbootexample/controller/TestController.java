package com.spring.demo.springbootexample.controller;


import com.spring.demo.springbootexample.mybatis.mapper.CityMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    CityMapper cityMapper;

    @ResponseBody
    @RequestMapping("/test")
    public Object test() {

        return cityMapper.selectByExample(null);
    }
}
