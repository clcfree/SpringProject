package com.example.demo.framework.base.web;

import com.example.demo.framework.base.service.CRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractBaseController<TS extends CRUDService> {
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
