package com.example.patterns._13_chain_of_responsibility_pattern._02_after;



public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("---------로깅-----------");
        super.handler(request);
    }
}
