package com.example.chatapp.adapter;

import com.example.chatapp.core.ChatRoom;
import com.example.chatapp.user.User;

public interface ClientAdapter {
    void displayMessage(String message);

    void notifyStatusChanged(User user);

    void notifyTyping(User user, ChatRoom room);
}
