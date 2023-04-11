package com.example.patterns._13_chain_of_responsibility_pattern._01_before;

public class AuthRequestHandler extends RequestHandler {

    public void handler(Request request) {
        //무언가 인증이 필요해서 코드에 넣을 때 → 단일책임에 위배
        System.out.println("이 유저는 인증이 되었나?");
        super.handler(request);
    }
}
