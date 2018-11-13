package com.demo.server.system.oauth-client-detail.entity;

import com.demo.server.system.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cuiluchuan
 * @since 2018-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OauthClientDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long accessTokenValidity;

    private String additionalInformation;

    private String authorities;

    private Boolean isAutoApprove;

    private String clientId;

    private String clientSecret;

    private String authorizedGrantTypes;

    private String webServerRedirectUri;

    private Long refreshTokenValidity;

    private String resourceIds;

    private String scope;


}
