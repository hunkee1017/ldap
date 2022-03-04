package com.hunkee1017.ldap.session;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SessionController {

    @GetMapping("/principal")
    public Principal getPrincipal(Principal principal){
        return principal;
    }
}
