package com.demo.service.biz.test.web;

import com.demo.service.biz.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
    @Autowired
    TestService testService;
    @PostMapping("test")
    public void test(){
        testService.test();
        System.out.println("test");
    }
}
