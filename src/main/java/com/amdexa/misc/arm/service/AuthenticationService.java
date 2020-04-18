package com.amdexa.misc.arm.service;

import org.springframework.stereotype.Component;

@Component
public interface AuthenticationService {
    String login(String username, String password);
}
