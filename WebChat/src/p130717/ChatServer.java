package p130717;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ChatServer {

    static final int DEFAULT_PORT = 10000;
    private static List<ChatSession> sessions;
    private static ExecutorService broadcastService;
    private static int counter = 0;

    public static void main(String[] args) {

        System.out.println("Start");

        sessions = new ArrayList<>();

        broadcastService = Executors.newCachedThreadPool();

        try {
            ServerSocket serverSocket = new ServerSocket(DEFAULT_PORT);

            while (true) {
                Socket socket = serverSocket.accept(); //waiting for connection
                System.out.println("Got connection" + socket);

                new Thread(() -> {
                    ChatSession chatSession = createNewSession(socket);
                    chatSession.processConnection(
                            ChatServer::broadcast,
                            ChatServer::removeSession);
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ChatSession createNewSession(Socket socket) {
        String name = "User" + ++counter;
        ChatSession chatSession = new ChatSession(socket, name, 0);
        broadcastUserName(chatSession);
        sessions.add(chatSession);
        sendNameListToClient(chatSession);
        return chatSession;
    }

    private static void broadcastUserName(ChatSession chatSession) {
        String command = "/add " + chatSession.getClientName();
        broadcast(command);
    }

    private static void sendNameListToClient(ChatSession chatSession) {
        StringBuilder nameList = new StringBuilder("/list");
        for (ChatSession session : sessions) {
            nameList.append(" ").append(session.getClientName());
        }
        chatSession.sendToClient(nameList.toString());
    }

    private static void broadcast(String line) {
        for (ChatSession session : sessions) {
            broadcastService.execute(() -> session.sendToClient(line));
        }
    }

    private static void removeSession(ChatSession session) {
        sessions.remove(session);
        broadcast("/remove " + session.getClientName());
    }

}
