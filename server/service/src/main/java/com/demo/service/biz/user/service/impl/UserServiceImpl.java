package com.demo.service.biz.user.service.impl;

import com.demo.service.biz.user.entity.User;
import com.demo.service.biz.user.mapper.UserMapper;
import com.demo.service.biz.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-10-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
