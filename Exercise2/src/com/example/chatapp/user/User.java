package com.example.chatapp.user;

import com.example.chatapp.core.ChatRoom;

public interface User {
    String getUsername();
    void receiveMessage(String message);
    void setStatus(String status);
    String getStatus();                  // add this
    void typing(ChatRoom room);           // add this
}
