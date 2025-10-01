# Exercise 2: Real-Time Chat Application

## Overview
This is a console-based real-time chat application in Java. It allows multiple users to join or create chat rooms, send and receive messages, and interact in real-time. The project demonstrates **design patterns (Observer, Singleton, Adapter)**, **SOLID principles**, and **OOP concepts**.

---

## Features
1. **Join or Create Chat Rooms**  
   Users can create a new chat room or join an existing one using a unique Chat Room ID.

2. **Multiple Users per Chat Room**  
   Multiple users can join the same chat room and communicate simultaneously.

3. **Send and Receive Messages in Real-Time**  
   Messages are broadcasted immediately to all active users in the chat room.

4. **List Active Users**  
   Displays all active users in a chat room along with their status.

5. **Message History**  
   Users can view the history of messages in the chat room.

6. **User Status Management**  
   Users can set their status (`Online`, `Away`, `Busy`) which is visible to others.

7. **Typing Notification**  
   Shows which user is currently typing a message.

8. **Private Messaging (Optional Feature)**  
   Users can send messages directly to a specific user within the chat room.

9. **Observer Pattern**  
   Updates all users in real-time about new messages, user joins/leaves, and typing notifications.

10. **Singleton Pattern**  
    Manages chat room instances globally to ensure a single point of truth.

11. **Adapter Pattern**  
    Abstracts the client interface for different communication mechanisms (console in this case).

---

## Possible Inputs
- **Chat Room ID:** `"Room123"`  
- **Messages:** `"Hello, everyone!"`, `"How's it going?"`, `"Goodbye!"`  
- **Active Users:** `["Alice", "Bob", "Charlie"]`

---

## Possible Outputs
- **Chat Messages:** Displayed as  

===== Multi-Room Real-Time Chat Application =====

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 1
Enter username: Disha
Enter chat room ID to join/create: 777
[Disha] [15:20:51] System: Disha has joined the chat!

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 1
Enter username: Vaishnavi
Enter chat room ID to join/create: 777
[Vaishnavi] [15:21:14] System: Vaishnavi has joined the chat!
[Disha] [15:21:14] System: Vaishnavi has joined the chat!

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 3
Enter your username: Vaishnavi
Enter chat room ID: 777
[Typing] Vaishnavi is typing in room 777...
Enter message: Hi Disha
[Vaishnavi] [15:21:50] [Vaishnavi]: Hi Disha
[Disha] [15:21:50] [Vaishnavi]: Hi Disha

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 3
Enter your username: Disha
Enter chat room ID: 777
[Typing] Disha is typing in room 777...
Enter message: Hello
[Vaishnavi] [15:23:40] [Disha]: Hello
[Disha] [15:23:40] [Disha]: Hello

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 1
Enter username: Sudha
Enter chat room ID to join/create: 777
[Vaishnavi] [15:23:51] System: Sudha has joined the chat!
[Disha] [15:23:51] System: Sudha has joined the chat!
[Sudha] [15:23:51] System: Sudha has joined the chat!

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 5
Enter username: Disha
Enter status (Online/Away/Busy): Online
[Status] Disha is now Online

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 4
Enter chat room ID: 333
Active Users: []

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 4
Enter chat room ID: 777
Active Users: [Vaishnavi(Online), Disha(Online), Sudha(Online)]

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 5
Enter username: Disha
Enter status (Online/Away/Busy): Away
[Status] Disha is now Away

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 4
Enter chat room ID: 777
Active Users: [Vaishnavi(Online), Disha(Away), Sudha(Online)]

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 6
Enter chat room ID: 333

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 6
Enter chat room ID: 777
[15:20:51] System: Disha has joined the chat!
[15:21:14] System: Vaishnavi has joined the chat!
[15:21:50] [Vaishnavi]: Hi Disha
[15:23:40] [Disha]: Hello
[15:23:51] System: Sudha has joined the chat!

Menu:
1. Add User / Join Chat Room
2. List All Chat Rooms
3. Send Message
4. List Active Users
5. Change User Status
6. Show Message History
7. Exit
Choose option: 7
Exiting chat. Goodbye!

## File / Directory Structure

Exercise2/
├── src/
│ └── com/
│ └── example/
│ └── chatapp/
│ ├── Main.java
│ ├── adapter/
│ │ ├── ClientAdapter.java
│ │ └── ConsoleClient.java
│ ├── core/
│ │ └── ChatRoom.java
│ └── user/
│ ├── User.java
│ └── ConcreteUser.java
└── out/ (compiled classes go here)


---

## Compilation & Execution

### Compile
```powershell
cd D:\Educational-Initiatives\Exercise2\src
javac -d ../out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

### Run
```powershell
java -cp ../out com.example.chatapp.Main
```
