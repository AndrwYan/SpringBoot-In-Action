package com.andrew.service.impl;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        context.start();
        System.out.println("发布服务成功！");
        System.in.read(); // press any key to exit
    }

}
