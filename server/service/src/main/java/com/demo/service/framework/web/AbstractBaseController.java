package com.demo.service.framework.web;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.service.framework.model.BaseEntity;
import com.demo.service.framework.service.CRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractBaseController<TS extends CRUDService<M,T>,M extends BaseMapper<T>, T extends BaseEntity> {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    protected TS service;

    @Autowired
    public void setService(TS service){
        this.service = service;
    }

    public TS getService(){
        return this.service;
    }
}
