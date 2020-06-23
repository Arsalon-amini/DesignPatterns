package com.codeWithArsalon.Facade;

public class NotificationService {
    //If changes are needed in send method, only change this class
    //clients implementing this service will not be broken

    public void send(String message, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();

    }
}
