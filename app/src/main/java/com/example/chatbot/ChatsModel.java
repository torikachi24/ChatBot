package com.example.chatbot;

public class ChatsModel {

    private String message;
    private String sender;

    public ChatsModel(String cnt) {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ChatsModel(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }
}
