package com.example.demo.framework.base.mapper;

import com.example.demo.framework.base.model.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CRUDMapper<M extends Mapper<T>, T extends BaseEntity> {
    List<T> getList(T entity);

    T getOne(T entity);
}
