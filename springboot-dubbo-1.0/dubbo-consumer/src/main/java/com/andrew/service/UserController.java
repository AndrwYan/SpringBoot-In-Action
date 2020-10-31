package com.andrew.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Reference
    private IUserService userService;



}
