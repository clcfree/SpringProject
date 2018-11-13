package com.demo.server.system.auth.service.impl;

import com.demo.server.system.auth.entity.SysAuth;
import com.demo.server.system.auth.mapper.SysAuthMapper;
import com.demo.server.system.auth.service.ISysAuthService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限 服务实现类
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-12
 */
@Service
public class SysAuthServiceImpl extends ServiceImpl<SysAuthMapper, SysAuth> implements ISysAuthService {

}
