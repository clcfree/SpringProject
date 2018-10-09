package com.demo.service.biz.test.model;


import com.baomidou.mybatisplus.annotation.TableName;
import com.demo.service.framework.model.BaseEntity;

@TableName( "tbl_sys_user")
public class TestEntity extends BaseEntity {
    private Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
