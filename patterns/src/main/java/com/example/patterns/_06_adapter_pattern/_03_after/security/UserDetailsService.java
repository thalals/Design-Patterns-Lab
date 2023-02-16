package com.example.patterns._06_adapter_pattern._03_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String userName);
}
