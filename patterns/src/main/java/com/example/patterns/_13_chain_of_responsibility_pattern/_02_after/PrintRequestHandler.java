package com.example.patterns._13_chain_of_responsibility_pattern._02_after;



public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("request.getBody() = " + request.getBody());
        super.handler(request);
    }
}
