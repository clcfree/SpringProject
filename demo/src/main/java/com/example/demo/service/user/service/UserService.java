/**
 * 文件：UserService.java
 * 版本：1.0.0
 * 日期：2016-04-21
 * Copyright &reg;
 * All right reserved.
 */

package com.example.demo.service.user.service;

import com.example.demo.framework.base.service.CRUDService;
import com.example.demo.service.user.mapper.UserMapper;
import com.example.demo.service.user.model.UserEntity;

/**
 * <p>Title: 用户信息表</p>
 * <p>Description: UserService service接口 </p>
 * <p>Copyright: Copyright &reg;  </p>
 * <p>Company: </p>
 *
 * @author
 * @version 1.0.0
 */

public interface UserService extends CRUDService<UserMapper,UserEntity> {
}