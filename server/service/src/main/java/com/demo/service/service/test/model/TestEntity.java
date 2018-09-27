package com.demo.service.service.test.model;

import com.demo.service.framework.base.model.BaseEntity;

import javax.persistence.*;

@Table(name = "test")
public class TestEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "test")
    private String test;
}
