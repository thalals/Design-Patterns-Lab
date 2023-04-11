package com.example.patterns._13_chain_of_responsibility_pattern._02_after;


public abstract class RequestHandler {

    //다음 핸들러를 호출하도록 이어지게
    private RequestHandler nextHandler;

    RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler(Request request) {
        //마지막이 아닐경우
        if (nextHandler != null) {
            nextHandler.handler(request);
        }
    }
}
