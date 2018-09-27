package com.demo.service.framework.base.mapper;

import com.demo.service.framework.base.model.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CRUDMapper<M extends Mapper<T>, T extends BaseEntity> {
    List<T> getList(T entity);

    T getOne(T entity);
}
