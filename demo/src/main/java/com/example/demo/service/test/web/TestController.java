package com.example.demo.service.test.web;

import com.example.demo.service.test.model.TestEntity;
import com.example.demo.service.test.service.TestService;
import com.example.demo.config.MybatisConfiguration;
import com.example.demo.framework.base.web.AbstractBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController extends AbstractBaseController<TestService> {
    @Autowired
    MybatisConfiguration mapperScanConfiguration;

    @PostMapping("test")
    public void test(){
        TestEntity testEntity = new TestEntity();
        TestEntity test = service.getOne(testEntity);
        service.test();
        System.out.println("test");
    }
}
