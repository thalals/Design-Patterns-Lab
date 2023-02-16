package com.example.patterns._06_adapter_pattern._01_before;

//Account 와 AccountService 는 해당 app 단위에서만 사용하는 일정의 adaptee
public class AccountService {

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
}
