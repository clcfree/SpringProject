package com.demo.service.framework.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.service.framework.model.BaseEntity;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public abstract class AbstractCURDService<M extends BaseMapper<T>, T extends BaseEntity> extends SqlSessionDaoSupport implements CRUDService<M,T>{
    protected M mapper;

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Autowired
    public void setMapper(M mapper) {
        this.mapper = mapper;
    }

    public M getMapper() {
        return mapper;
    }
}
