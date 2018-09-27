package com.demo.service.service.test.web;

import com.demo.service.service.test.model.TestEntity;
import com.demo.service.service.test.service.TestService;
import com.demo.service.config.MybatisConfiguration;
import com.demo.service.framework.base.web.AbstractBaseController;
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
