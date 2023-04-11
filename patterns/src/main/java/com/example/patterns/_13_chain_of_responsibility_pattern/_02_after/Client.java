package com.example.patterns._13_chain_of_responsibility_pattern._02_after;

public class Client {

    private RequestHandler requestHandler;

    //요청을 처리할 Handler 를 주입받을
    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handler(request);
    }

    public static void main(String[] args) {
        //각 책임이 연결되게
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        Client client = new Client(chain);
    }
}
