package com.demo.service.biz.user.controller;


import com.demo.service.biz.user.entity.User;
import com.demo.service.biz.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-10-11
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("test")
    public String test(){
        User user = userService.getById(1);
        return "test";
    }
}
