package com.demo.service.service.test.service.imp;

import com.demo.service.service.test.mapper.TestMapper;
import com.demo.service.service.test.model.TestEntity;
import com.demo.service.service.test.service.TestService;
import com.demo.service.framework.base.service.imp.AbstractCRUDService;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestServiceImp extends AbstractCRUDService<TestMapper,TestEntity> implements TestService{
    public void test(){
        TestEntity test = mapper.selectTest();
    }
}
