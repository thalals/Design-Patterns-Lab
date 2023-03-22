package com.example.patterns._13_chain_of_responsibility_pattern._02_after;



public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("인증 ,,,,중... 완료!");
        super.handler(request);
    }
}
