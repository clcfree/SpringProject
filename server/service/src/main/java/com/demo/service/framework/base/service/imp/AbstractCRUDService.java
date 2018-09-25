package com.example.demo.framework.base.service.imp;

import com.example.demo.framework.base.model.BaseEntity;
import com.example.demo.framework.base.service.CRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract class AbstractCRUDService<M extends Mapper<T>, T extends BaseEntity> implements CRUDService<M,T> {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    protected M mapper;

    @Autowired
    public void setMapper(M mapper){
        this.mapper = mapper;
    }

    public List<T> getList(T entity){
        return mapper.select(entity);
    }

    public T getOne(T entity){
        return mapper.selectOne(entity);
    }
}
