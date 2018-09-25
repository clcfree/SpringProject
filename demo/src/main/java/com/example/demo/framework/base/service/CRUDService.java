package com.example.demo.framework.base.service;

import com.example.demo.framework.base.mapper.CRUDMapper;
import com.example.demo.framework.base.model.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

public interface CRUDService< M extends Mapper<T>, T extends BaseEntity> extends CRUDMapper<M,T>{

}
