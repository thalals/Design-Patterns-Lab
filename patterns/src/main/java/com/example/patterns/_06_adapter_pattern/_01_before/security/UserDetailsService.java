package com.example.patterns._06_adapter_pattern._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String userName);
}
