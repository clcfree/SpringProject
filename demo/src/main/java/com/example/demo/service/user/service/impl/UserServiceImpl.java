/**
 * 文件：UserServiceImpl.java
 * 版本：1.0.0
 * 日期：2016-04-21
 * Copyright &reg;
 * All right reserved.
 */

package com.example.demo.service.user.service.impl;

import com.example.demo.framework.base.service.imp.AbstractCRUDService;
import com.example.demo.service.user.mapper.UserMapper;
import com.example.demo.service.user.model.UserEntity;
import com.example.demo.service.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * <p>Title: 用户信息表</p>
 * <p>Description: UserServiceImpl service接口 </p>
 * <p>Copyright: Copyright &reg;  </p>
 * <p>Company: </p>
 *
 * @author
 * @version 1.0.0
 */
@Service("userService")
public class UserServiceImpl extends AbstractCRUDService<UserMapper,UserEntity> implements UserService {

}