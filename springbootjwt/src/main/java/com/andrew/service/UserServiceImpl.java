package com.andrew.service;

import com.andrew.dao.UserDao;
import com.andrew.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userdao;
    //根据接收的用户名密码查询数据库
    @Override
    public User login(User user) {
        User userDB = userdao.login(user);
        if(userDB!=null){
            return userDB;
        }
        throw new RuntimeException("登录失败！");

    }

}
