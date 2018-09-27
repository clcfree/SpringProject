package com.demo.service.service.test.mapper;

import com.demo.service.service.test.model.TestEntity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface TestMapper extends Mapper<TestEntity>{
    TestEntity selectTest();
}
