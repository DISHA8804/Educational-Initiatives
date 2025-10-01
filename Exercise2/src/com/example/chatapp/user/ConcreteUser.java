package com.example.chatapp.user;

import com.example.chatapp.adapter.ClientAdapter;
import com.example.chatapp.core.ChatRoom;

public class ConcreteUser implements User {
    private final String username;
    private String status; // Online, Away, Busy
    private final ClientAdapter clientAdapter;

    public ConcreteUser(String username, ClientAdapter adapter) {
        this.username = username;
        this.clientAdapter = adapter;
        this.status = "Online";
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void receiveMessage(String message) {
        clientAdapter.displayMessage("[" + username + "] " + message);
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
        clientAdapter.notifyStatusChanged(this);
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void typing(ChatRoom room) {
        clientAdapter.notifyTyping(this, room);
    }
}
