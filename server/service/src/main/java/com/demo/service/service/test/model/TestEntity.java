package com.example.demo.service.test.model;

import com.example.demo.framework.base.model.BaseEntity;

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
