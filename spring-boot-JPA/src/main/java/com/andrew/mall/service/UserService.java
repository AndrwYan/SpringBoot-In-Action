package com.andrew.mall.service;


import com.andrew.mall.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUser();
}
