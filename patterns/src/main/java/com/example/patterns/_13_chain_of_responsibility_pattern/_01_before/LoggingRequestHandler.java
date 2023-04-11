package com.example.patterns._13_chain_of_responsibility_pattern._01_before;

public class LoggingRequestHandler extends RequestHandler{

    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}
