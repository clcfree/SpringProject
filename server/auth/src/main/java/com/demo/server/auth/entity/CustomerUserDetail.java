package com.demo.server.auth.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerUserDetail implements UserDetails {
    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private Boolean enabled = true;

    private List<SystemUserRoleForList> roles;

    private List<SystemUserAuthForList> auths;

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public CustomerUserDetail(String username, String password, Boolean enabled) {
        super();
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        ArrayList<SimpleGrantedAuthority> auths= new ArrayList<SimpleGrantedAuthority>();
        if(this.roles!=null&&this.roles.size()>0){
            for(SystemUserRoleForList role:this.roles){
                auths.add(new SimpleGrantedAuthority(role.getRoleCode()));
            }
        }
        if(this.auths!=null&&this.auths.size()>0){
            for(SystemUserAuthForList auth:this.auths){
                auths.add(new SimpleGrantedAuthority(auth.getAuthCode()));
            }
        }
        return auths;
    }

    @Override
    public String getUsername() {
        return this.username;// inherited from user
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;// not for production just to show concept
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;// not for production just to show concept
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;// not for production just to show concept
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;// not for production just to show concept
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub

        return this.password;
    }

    public List<SystemUserRoleForList> getRoles() {
        return roles;
    }

    public void setRoles(List<SystemUserRoleForList> roles) {
        this.roles = roles;
    }



    public void setauths(List<SystemUserAuthForList> auths) {
        this.auths = auths;
    }
}
