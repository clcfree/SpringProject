package com.demo.server.auth.service.impl;

import com.demo.server.auth.entity.SysUser;
import com.demo.server.auth.mapper.SysUserMapper;
import com.demo.server.auth.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-12
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
