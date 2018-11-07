package com.demo.server.auth.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class SystemUserAuthForList implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long parentId;
    private String authCode;
    private String authName;
    private String remarks;

    public SystemUserAuthForList() {
        super();
    }

    public SystemUserAuthForList(Long authId, String authCode, String authName, String remarks, Long parentId) {
        super();
        this.id = authId;
        this.authCode = authCode;
        this.authName = authName;
        this.remarks = remarks;
        this.parentId = parentId;
    }
}
