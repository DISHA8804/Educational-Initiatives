package com.example.chatapp;

import com.example.chatapp.adapter.ClientAdapter;
import com.example.chatapp.adapter.ConsoleClient;
import com.example.chatapp.core.ChatRoom;
import com.example.chatapp.core.ChatRoomManager;
import com.example.chatapp.user.ConcreteUser;
import com.example.chatapp.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatRoomManager manager = ChatRoomManager.getInstance();
        ClientAdapter adapter = new ConsoleClient();

        Map<String, User> users = new HashMap<>();
        System.out.println("===== Multi-Room Real-Time Chat Application =====");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add User / Join Chat Room");
            System.out.println("2. List All Chat Rooms");
            System.out.println("3. Send Message");
            System.out.println("4. List Active Users");
            System.out.println("5. Change User Status");
            System.out.println("6. Show Message History");
            System.out.println("7. Exit");

            System.out.print("Choose option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    users.putIfAbsent(username, new ConcreteUser(username, adapter));

                    System.out.print("Enter chat room ID to join/create: ");
                    String roomId = scanner.nextLine();
                    ChatRoom room = manager.getOrCreateRoom(roomId);

                    room.join(users.get(username));
                    break;

                case "2":
                    System.out.println("All Chat Rooms: " + manager.getAllRooms().keySet());
                    break;

                case "3":
                    System.out.print("Enter your username: ");
                    String senderName = scanner.nextLine();
                    if (!users.containsKey(senderName)) {
                        System.out.println("User not found.");
                        break;
                    }
                    System.out.print("Enter chat room ID: ");
                    String chatRoomId = scanner.nextLine();
                    room = manager.getOrCreateRoom(chatRoomId);

                    // Typing indicator
                    users.get(senderName).typing(room);

                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();
                    room.sendMessage(users.get(senderName), message);
                    break;

                case "4":
                    System.out.print("Enter chat room ID: ");
                    String roomToList = scanner.nextLine();
                    ChatRoom roomList = manager.getOrCreateRoom(roomToList);
                    System.out.println("Active Users: " + roomList.listActiveUsers());
                    break;

                case "5":
                    System.out.print("Enter username: ");
                    String userStatusName = scanner.nextLine();
                    if (!users.containsKey(userStatusName)) {
                        System.out.println("User not found.");
                        break;
                    }
                    System.out.print("Enter status (Online/Away/Busy): ");
                    String status = scanner.nextLine();
                    users.get(userStatusName).setStatus(status);
                    break;

                case "6":
                    System.out.print("Enter chat room ID: ");
                    String histRoomId = scanner.nextLine();
                    ChatRoom histRoom = manager.getOrCreateRoom(histRoomId);
                    histRoom.getMessageHistory().forEach(System.out::println);
                    break;

                case "7":
                    System.out.println("Exiting chat. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
