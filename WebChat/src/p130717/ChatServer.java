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
                    long delay = sessions.size() == 0 ? 2000 : 100;
                    ChatSession chatSession = new ChatSession(delay);
                    sessions.add(chatSession);

                    chatSession.processConnection(socket,
                            ChatServer::broadcast,
                            ChatServer::removeSession);
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void broadcast(String line) {
        for (ChatSession session: sessions) {
            broadcastService.execute( () -> session.sendToClient(line));
        }
    }

    private static void removeSession(ChatSession session) {
        sessions.remove(session);
    }

}
