package com.example.patterns._06_adapter_pattern._02_after;

import com.example.patterns._06_adapter_pattern._02_after.security.LoginHandler;
import com.example.patterns._06_adapter_pattern._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("hmin", "hmin");
        System.out.println("login = " + login);
    }

    /**
     *  어댑터를 별도으 클래스로 만들어서 사용할 때,
     *  써드파티에서 들어오는 라이브러리나, 종속성이 강하게 묶여 기존의 코드를 수정할 수 없는경우 (어댑티를 수정할 수 없는 경우)
     *  유용하게 사용할 수 있다.
     *
     *  -> 내가 직접 코드를 변경할 수 있다면 03_after
     *  (Account, AccountService, 어댑티를 직접 수정)
     */
}
