package com.demo.service.framework.base.service;

import com.demo.service.framework.base.mapper.CRUDMapper;
import com.demo.service.framework.base.model.BaseEntity;
import tk.mybatis.mapper.common.Mapper;

public interface CRUDService< M extends Mapper<T>, T extends BaseEntity> extends CRUDMapper<M,T>{

}
