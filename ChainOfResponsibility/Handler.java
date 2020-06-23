package com.codeWithArsalon.ChainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){ //template method pattern
        if(doHandle(request))
            return; //stop processing

        if(next != null)
            next.handle(request); //continue processing

    }

    public abstract boolean doHandle(HttpRequest request); //implemented polymorphically in objs
}
