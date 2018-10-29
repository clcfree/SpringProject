package com.demo.server.auth.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("user")
    public Principal user(Principal user) {
        return user;
    }

    @GetMapping("hello")
    String hello() {
        return "hello world";
    }
}
