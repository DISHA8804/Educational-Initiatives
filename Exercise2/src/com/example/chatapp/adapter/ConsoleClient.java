package com.example.chatapp.adapter;

import com.example.chatapp.core.ChatRoom;
import com.example.chatapp.user.User;

public class ConsoleClient implements ClientAdapter {

    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void notifyStatusChanged(User user) {
        System.out.println("[Status] " + user.getUsername() + " is now " + user.getStatus());
    }

    @Override
    public void notifyTyping(User user, ChatRoom room) {
        System.out.println("[Typing] " + user.getUsername() + " is typing in room " + room.getRoomId() + "...");
    }
}
