package com.codeWithArsalon.ChainOfResponsibility;



public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler; //pass first Handler in chain
    }

    public void handle(HttpRequest request){
        handler.handle(request);

    }
}
