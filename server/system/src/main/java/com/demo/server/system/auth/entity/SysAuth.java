package com.demo.server.system.auth.entity;

import java.time.LocalDateTime;
import com.demo.server.system.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysAuth extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 父节点id
     */
    private Long parentId;

    private String authCode;

    private String authName;

    private String icon;

    private String url;

    /**
     * 0-菜单 1-按钮
     */
    private Integer type;

    private Integer isEnable;

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


}
