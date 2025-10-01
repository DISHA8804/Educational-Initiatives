package com.example.chatapp.core;

import com.example.chatapp.user.User;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ChatRoom {
    private final String roomId;
    private final Set<User> users = new HashSet<>();
    private final List<String> messageHistory = new ArrayList<>();
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public ChatRoom(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void join(User user) {
        if (users.add(user)) {
            String joinMsg = String.format("[%s] System: %s has joined the chat!", currentTime(), user.getUsername());
            broadcast(joinMsg);
            messageHistory.add(joinMsg);
        }
    }

    public void leave(User user) {
        if (users.remove(user)) {
            String leaveMsg = String.format("[%s] System: %s has left the chat!", currentTime(), user.getUsername());
            broadcast(leaveMsg);
            messageHistory.add(leaveMsg);
        }
    }

    public void sendMessage(User sender, String message) {
        String timestampedMsg = String.format("[%s] [%s]: %s", currentTime(), sender.getUsername(), message);
        messageHistory.add(timestampedMsg);
        broadcast(timestampedMsg);
    }

    public void broadcast(String message) {
        for (User u : users) {
            u.receiveMessage(message);
        }
    }

    public List<String> getMessageHistory() {
        return new ArrayList<>(messageHistory);
    }

    public List<String> listActiveUsers() {
        List<String> activeUsers = new ArrayList<>();
        for (User u : users) {
            activeUsers.add(u.getUsername() + "(" + u.getStatus() + ")");
        }
        return activeUsers;
    }

    private String currentTime() {
        return LocalTime.now().format(timeFormatter);
    }
}
