package com.example.patterns._06_adapter_pattern._01_before.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {

    UserDetailsService userDetailsService;

    public String login(String username, String password) {

        UserDetails userDetails = userDetailsService.loadUser(username);

        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        }

        throw new IllegalArgumentException();
    }

}
