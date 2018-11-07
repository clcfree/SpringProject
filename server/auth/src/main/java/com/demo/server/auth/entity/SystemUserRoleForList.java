package com.demo.server.auth.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class SystemUserRoleForList implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -8262176629545347756L;
    private String roleId;
    private String roleCode;
    private String roleName;
    private String remarks;

    public SystemUserRoleForList(){
        super();
    }

    public SystemUserRoleForList(String roleId, String roleCode,
                                 String roleName, String remarks) {
        super();
        this.roleId = roleId;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.remarks = remarks;
    }
}
