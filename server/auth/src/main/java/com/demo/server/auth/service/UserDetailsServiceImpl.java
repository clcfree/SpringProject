package com.demo.server.auth.service;
import com.demo.server.auth.entity.CustomerUserDetail;
import com.demo.server.auth.entity.SystemUserAuthForList;
import com.demo.server.auth.entity.SystemUserRoleForList;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Mr.Yangxiufeng on 2017/12/27.
 * Time:16:37
 * ProjectName:Mirco-Service-Skeleton
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

/*    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        boolean enabled = true; // 可用性 :true:可用 false:不可用
        boolean accountNonExpired = true; // 过期性 :true:没过期 false:过期
        boolean credentialsNonExpired = true; // 有效性 :true:凭证有效 false:凭证无效
        boolean accountNonLocked = true; // 锁定性 :true:未锁定 false:已锁定

        User user = new User("admin","admin",
                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, null);
        return user;
    }*/

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SystemUserRepository systemUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        username = username.toLowerCase();
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User %s does not exist!", username));
        }
        List<SystemUserRoleForList> roles=systemUserRepository.findUserRolesByUserId(user.getId());
        List<SystemUserAuthForList> authorities=systemUserRepository.findUserAuthoritiesByUserId(user.getId());
        // List<SystemUserResourcesForList> resources=systemUserRepository.findUserResourcesByUserId(user.getId());
        CustomerUserDetail detail = new CustomerUserDetail(user.getUsername(),user.getPassword(),user.getEnabled());
        detail.setRoles(roles);
        detail.setAuthorities(authorities);
        //detail.setResources(resources);
        return  detail;
    }
}
