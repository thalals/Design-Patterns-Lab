package com.example.patterns._06_adapter_pattern._02_after;

import com.example.patterns._06_adapter_pattern._02_after.security.UserDetails;
import com.example.patterns._06_adapter_pattern._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String userName) {
        Account account = accountService.findAccountByUsername(userName);

        return new AccountUserDetails(account);
    }
}
