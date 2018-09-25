package com.example.demo.service.user.mapper;

import com.example.demo.service.user.model.UserEntity;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<UserEntity> {
}
