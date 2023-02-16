package com.example.patterns._06_adapter_pattern._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String userName);
}
