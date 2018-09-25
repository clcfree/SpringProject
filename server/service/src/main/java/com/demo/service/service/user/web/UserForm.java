/**
 * 文件：UserForm.java
 * 版本：1.0.0
 * 日期：2016-04-20
 * Copyright &reg;
 * All right reserved.
 */

package com.example.demo.service.user.web;


import com.mortals.framework.web.BaseCRUDFormLong;
import com.mortals.iot.module.system.user.model.UserEntity;
import com.mortals.iot.module.system.user.model.UserQuery;

/**
 * <p>Title: 用户信息表</p>
 * <p>Description: UserForm  </p>
 * <p>Copyright: Copyright &reg;  </p>
 * <p>Company: </p>
 *
 * @author
 * @version 1.0.0
 */
public class UserForm extends BaseCRUDFormLong<UserEntity> {
    private UserEntity user = new UserEntity();
    private UserQuery query = new UserQuery();

    public UserForm() {

    }

    @Override
    public UserEntity getEntity() {
        return user;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public UserQuery getQuery() {
        return query;
    }

    public void setQuery(UserQuery query) {
        this.query = query;
    }
}