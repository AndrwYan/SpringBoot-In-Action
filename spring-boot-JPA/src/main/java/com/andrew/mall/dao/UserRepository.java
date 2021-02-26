package com.andrew.mall.dao;

import com.andrew.mall.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserDao 操作数据库
 * @author Andrew
 * version 1.0
 *
 */

@ResponseBody
public interface UserRepository extends JpaRepository<User,String> {//UserRepository 继承了JpaRepository

}
