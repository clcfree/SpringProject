package com.example.demo.service.test.service;

import com.example.demo.service.test.mapper.TestMapper;
import com.example.demo.service.test.model.TestEntity;
import com.example.demo.framework.base.service.CRUDService;

public interface TestService extends CRUDService <TestMapper,TestEntity>{
    void test();
}
