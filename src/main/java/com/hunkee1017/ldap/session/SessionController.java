package com.hunkee1017.ldap.session;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

    @GetMapping("/auth")
    public Authentication getPrincipal(Authentication auth){
        return auth;
    }
}
