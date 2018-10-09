package com.demo.service.biz.test.service.imp;

import com.demo.service.biz.test.mapper.TestMapper;
import com.demo.service.biz.test.model.TestEntity;
import com.demo.service.biz.test.service.TestService;
import com.demo.service.framework.service.AbstractCURDService;
import org.springframework.stereotype.Service;

@Service("TestService")
public class TestServiceImp extends AbstractCURDService<TestMapper,TestEntity> implements TestService {

    public void test(){
        TestEntity testEntity =mapper.selectById(1);
    }
}
