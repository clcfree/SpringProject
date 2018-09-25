package com.example.demo.service.test.service.imp;

import com.example.demo.service.test.mapper.TestMapper;
import com.example.demo.service.test.model.TestEntity;
import com.example.demo.service.test.service.TestService;
import com.example.demo.framework.base.service.imp.AbstractCRUDService;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestServiceImp extends AbstractCRUDService<TestMapper,TestEntity> implements TestService{
    public void test(){
        TestEntity test = mapper.selectTest();
    }
}
