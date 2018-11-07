package com.demo.server.auth.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lcg
 *
 */
public class CustomClientDetails implements ClientDetails {


	//serialVersionUID：
	private static final long serialVersionUID = 520683680024233369L;
	private String uuid ;
	private String clientId;
	private String clientSecret;
	private boolean autoApprove;
    private String scope;;
	private Set<String> authorizedGrantTypes;
	
	private Set<String> resourceIds;
	private Set<String> registeredRedirectUri;
	private String accsssTokenValidity;
	private String refreshTokenValidity;
	private Map<String, Object> additionalInformation;
	private Collection<GrantedAuthority> authorities;

	


	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public boolean isAutoApprove() {
		return autoApprove;
	}

	public void setAutoApprove(boolean autoApprove) {
		this.autoApprove = autoApprove;
	}

	public String getAccsssTokenValidity() {
		return accsssTokenValidity;
	}

	public void setAccsssTokenValidity(String accsssTokenValidity) {
		this.accsssTokenValidity = accsssTokenValidity;
	}

	public String getRefreshTokenValidity() {
		return refreshTokenValidity;
	}

	public void setRefreshTokenValidity(String refreshTokenValidity) {
		this.refreshTokenValidity = refreshTokenValidity;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	

	public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
		Set<String> set = new HashSet<String>();
		String [] arr = authorizedGrantTypes.split(",");
		for (String index : arr) {
			set.add(index);
		}
		this.authorizedGrantTypes = set;
	}

	public void setResourceIds(Set<String> resourceIds) {
		this.resourceIds = resourceIds;
	}

	public void setRegisteredRedirectUri(Set<String> registeredRedirectUri) {
		this.registeredRedirectUri = registeredRedirectUri;
	}

	public void setAdditionalInformation(Map<String, Object> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String getClientId() {
		// TODO Auto-generated method stub
		return clientId;
	}

	@Override
	public Set<String> getResourceIds() {
		// TODO Auto-generated method stub
		return resourceIds;
	}

	@Override
	public boolean isSecretRequired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getClientSecret() {
		// TODO Auto-generated method stub
		return clientSecret;
	}

	@Override
	public boolean isScoped() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Set<String> getScope() {
		Set<String> set = new HashSet<String>();
		String [] arr = scope.split(",");
		for (String scopeIndex : arr) {
			set.add(scopeIndex);
		}
		return set;
	}

	@Override
	public Set<String> getAuthorizedGrantTypes() {
		// TODO Auto-generated method stub
		return authorizedGrantTypes;
	}

	@Override
	public Set<String> getRegisteredRedirectUri() {
		// TODO Auto-generated method stub
		return registeredRedirectUri;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public Integer getAccessTokenValiditySeconds() {
		if(!StringUtils.isEmpty(accsssTokenValidity)) {
			return Integer.valueOf(accsssTokenValidity);
		}
		return null;
	}

	@Override
	public Integer getRefreshTokenValiditySeconds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAutoApprove(String scope) {
		// TODO Auto-generated method stub
		return autoApprove;
	}

	@Override
	public Map<String, Object> getAdditionalInformation() {
		// TODO Auto-generated method stub
		return additionalInformation;
	}

	
}
