package com.example.patterns._06_adapter_pattern._03_after;

import com.example.patterns._06_adapter_pattern._02_after.security.UserDetails;
import com.example.patterns._06_adapter_pattern._02_after.security.UserDetailsService;

//Account 와 AccountService 는 해당 app 단위에서만 사용하는 일정의 adaptee
public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);

        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String userName) {
        return findAccountByUsername(userName);
    }
}
