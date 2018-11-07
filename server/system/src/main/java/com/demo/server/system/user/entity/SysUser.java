package com.demo.server.system.user.entity;

import java.time.LocalDateTime;

import com.demo.server.system.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 录登账号
     */
    private String loginName;

    /**
     * 录登密码
     */
    private String password;

    /**
     * 员工编号
     */
    private String userCode;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 手机
     */
    private String tel;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 可管理标志
     */
    private Integer editSign;

    /**
     * 账户停用标志
     */
    private Integer isStop;

    /**
     * 有效标志
     */
    private Integer valid;

    /**
     * WEB允许登录IP
     */
    private String loginIp;

    /**
     * WEB允许登录时段
     */
    private String loginTime;

    /**
     * 备注
     */
    private String comment;

    /**
     * 创建人
     */
    private Long createId;

    /**
     * 创建用户名
     */
    private String createName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新用户id
     */
    private Long updateId;

    /**
     * 更新用户名
     */
    private String updateName;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 查看客户权限类型
     */
    private Integer scopeType;


}
