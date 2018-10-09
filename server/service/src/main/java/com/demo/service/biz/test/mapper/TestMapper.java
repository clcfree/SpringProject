package com.demo.service.biz.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.service.biz.test.model.TestEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper extends BaseMapper<TestEntity> {
        TestEntity selectTest();
}
