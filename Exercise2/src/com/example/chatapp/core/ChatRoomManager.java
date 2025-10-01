package com.example.chatapp.core;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomManager {
    private static ChatRoomManager instance;
    private final Map<String, ChatRoom> rooms = new HashMap<>();

    private ChatRoomManager() {
    }

    public static synchronized ChatRoomManager getInstance() {
        if (instance == null) {
            instance = new ChatRoomManager();
        }
        return instance;
    }

    public ChatRoom getOrCreateRoom(String roomId) {
        rooms.putIfAbsent(roomId, new ChatRoom(roomId));
        return rooms.get(roomId);
    }

    public Map<String, ChatRoom> getAllRooms() {
        return rooms;
    }
}
