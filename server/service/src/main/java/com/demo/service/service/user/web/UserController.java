/**
 * 文件：UserController.java
 * 版本：1.0.0
 * 日期：2016-04-20
 * Copyright &reg;
 * All right reserved.
 */

package com.example.demo.service.user.web;

import com.example.demo.framework.base.web.AbstractBaseController;
import com.example.demo.service.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: 用户信息表</p>
 * <p>Description: UserController  </p>
 * <p>Copyright: Copyright &reg;  </p>
 * <p>Company: </p>
 *
 * @author
 * @version 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserController extends AbstractBaseController<UserService> {

}