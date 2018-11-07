package com.demo.server.auth.service;

import com.demo.server.auth.entity.CustomClientDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Service
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomerClientDetailsService implements ClientDetailsService {
//    @Autowired
//    private OauthClientsDetailsRepository oauthClientsDetailsRepository;


    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

//        OauthClientDetails oauthclientdetails = oauthClientsDetailsRepository.findByClientId(clientId);
        CustomClientDetails clientDetails =  new CustomClientDetails();
        clientDetails.setAdditionalInformation(new HashMap<String, Object>());
//        clientDetails.setClientId(oauthclientdetails.getClientId());
//        clientDetails.setClientSecret(oauthclientdetails.getClientSecret());
//        clientDetails.setAuthorizedGrantTypes(oauthclientdetails.getGrantTypes());
//        clientDetails.setAccsssTokenValidity(oauthclientdetails.getAccsssTokenValidity());
//        clientDetails.setUuid(oauthclientdetails.getUuid());
//        clientDetails.setScope(oauthclientdetails.getScope());
        clientDetails.setAutoApprove(true);
        clientDetails.isSecretRequired();
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("tourist"));
        clientDetails.setAuthorities(authorities);
        return clientDetails;
    }
}
