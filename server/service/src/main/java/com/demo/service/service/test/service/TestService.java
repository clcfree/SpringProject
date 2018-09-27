package com.demo.service.service.test.service;

import com.demo.service.service.test.mapper.TestMapper;
import com.demo.service.service.test.model.TestEntity;
import com.demo.service.framework.base.service.CRUDService;

public interface TestService extends CRUDService <TestMapper,TestEntity>{
    void test();
}
