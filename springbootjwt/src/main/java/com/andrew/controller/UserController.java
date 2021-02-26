package com.andrew.controller;

import com.andrew.entity.User;
import com.andrew.service.UserService;
import com.andrew.utils.JWTUtils;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    public Map<String,Object> login(User user){

        Map<String,Object> map=new HashMap<>();
        try {
            log.info("用户名：[{}]",user.getName());
            log.info("密码：[{}]",user.getPassword());
            User userDB=userService.login(user);
            Map<String,String> payload=new HashMap<>();
            payload.put("id",userDB.getId());
            payload.put("name",userDB.getName());

            //生成JWT的令牌
            String token = JWTUtils.getToken(payload);
            map.put("state",true);
            map.put("msg","认证成功");
            map.put("token",token);
        }catch(Exception e){
            map.put("state","false");
            map.put("msg",e.getMessage());
        }
        return map;
    }
    public Map<String,Object> test(String token) {
        Map<String, Object> map = new HashMap<>();
        log.info("当前token为：[{}]", token);
        try {
            DecodedJWT verify = JWTUtils.verify(token);
            map.put("state", true);
            map.put("msg", "请求成功！");
            return map;
        } catch (SignatureVerificationException e) {
            e.printStackTrace();
            map.put("msg", "无效签名");
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            map.put("msg", "token过期");
        } catch (AlgorithmMismatchException e) {
            e.printStackTrace();
            map.put("msg", "token算法不一致");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", "token无效");
        }
        map.put("state","false");
        return map;
    }
}
