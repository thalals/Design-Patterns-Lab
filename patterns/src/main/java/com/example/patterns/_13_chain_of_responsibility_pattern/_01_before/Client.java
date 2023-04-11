package com.example.patterns._13_chain_of_responsibility_pattern._01_before;


public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");

        //클라이언트가 구체적인 클래스를 선택
        RequestHandler requestHandler = new AuthRequestHandler();
        //로깅을 할려면 또다른 클래스를 선택
        //RequestHandler requestHandler = new LoggingRequestHandler();

        //→ 하지만 2가지 기능을 동시에 하고싶을때 복잡해짐

        //클라이언트가 요청
        requestHandler.handler(request);
    }
}
