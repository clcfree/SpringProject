package com.demo.server.system.user.service.impl;

import com.demo.server.system.user.entity.SysUser;
import com.demo.server.system.user.mapper.SysUserMapper;
import com.demo.server.system.user.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-10
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
