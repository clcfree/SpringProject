package com.demo.server.system.role.entity;

import java.time.LocalDateTime;
import com.demo.server.system.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色类型，1.系统角色
     */
    private Integer type;

    /**
     * 状态，1:启用，0:禁用，默认1
     */
    private Boolean isEnable;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建用户id
     */
    private Long createId;

    /**
     * 创建用户名
     */
    private String createName;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新用户id
     */
    private Long updateId;

    /**
     * 更新用户名
     */
    private String updateName;


}
