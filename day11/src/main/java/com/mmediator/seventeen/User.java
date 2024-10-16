package com.mmediator.seventeen;

public class User {
    private String name;
    private ChatRoomMediator chatMediator;

    public User(String name, ChatRoomMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatMediator.showMessage(this, message);
    }
}
