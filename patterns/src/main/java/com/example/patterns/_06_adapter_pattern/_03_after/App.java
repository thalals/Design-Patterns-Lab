package com.example.patterns._06_adapter_pattern._03_after;

import com.example.patterns._06_adapter_pattern._02_after.security.LoginHandler;
import com.example.patterns._06_adapter_pattern._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        UserDetailsService userDetailsService = new AccountService();
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("hmin", "hmin");
        System.out.println("login = " + login);
    }

    /**
     *  어댑티가 어댑터의 타겟 인터페이스를 구현하도록 수정한 경우이다.
     *
     *  장점 : 추가적인 클래스를 만들지 않기 때문에, 구조가 복잡해지지 않는다.
     *  단점 : 기존의 코드가 변경된다는 것
     *
     *  (백기선님 왈)
     *  oop - 단일책임 원칙을 지키지 못하는 상황이지만, 무조건 지키기 보다는 상황에 따라 실용적인 선택이 필요
     */
}
