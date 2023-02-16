package com.example.patterns._06_adapter_pattern._03_after;

import com.example.patterns._06_adapter_pattern._02_after.security.UserDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//어댑티가 어댑터의 타겟 인터페이스를 구현하도록 수정
public class Account implements UserDetails {

    private String name;
    private String password;
    private String email;

    @Override
    public String getUserName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
}
