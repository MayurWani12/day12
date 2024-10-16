package com.mmediator.seventeen;

import java.util.Date;

class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println(new Date() + " [" + user.getName() + "]: " + message);
    }
}
