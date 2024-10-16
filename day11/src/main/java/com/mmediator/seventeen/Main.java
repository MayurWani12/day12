package com.mmediator.seventeen;
public class Main {
    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);

        user1.sendMessage("Hello, Bob!");
        user2.sendMessage("Hey, Alice! How's it going?");
    }
}
