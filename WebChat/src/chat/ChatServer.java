package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
                            ChatServer::processClientCommand,
                            ChatServer::processSessionCommand);
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

    private static void processClientCommand(ClientMessage sessionMessage) {
        String text = sessionMessage.getMessage();
        ChatSession session = sessionMessage.getSession();
        String msg;
        if (text.charAt(0) == '/') {
            String command = text.split(" ")[0];
            switch (command) {
                case ("/broadcast"):
                    msg = text.substring("/broadcast ".length(), text.length());
                    broadcast(" >" + session.getClientName() + " " + msg);
                    break;
                case ("/quit"):
                    session.closeSession();
                    break;
                case ("/private"):
                    String[] words = text.split(" ");
                    if (words.length <= 1) {
                        session.sendToClient("Receiver was not found");
                        break;
                    }
                    String receiver = words[1];
                    msg = " -->" + session.getClientName() + " ";
                    msg += text.substring(words[0].length() + words[1].length() + 1, text.length());
                    ChatSession receiverSession = findSessionByName(receiver);
                    if (receiverSession == null) {
                        session.sendToClient("Receiver was not found");
                        break;
                    }
                    session.sendToClient(msg);
                    receiverSession.sendToClient(msg);
                    break;
                default:
                    session.sendToClient("Invalid command");
                    break;
            }
            return;
        }
        broadcast(" >" + session.getClientName() + " " + text);
    }

    private static ChatSession findSessionByName(String receiver) {
        for (ChatSession session : sessions) {
            if (Objects.equals(session.getClientName(), receiver)) {
                System.out.println("found");
                return session;
            }
        }
        return null;
    }

    private static void processSessionCommand(SessionMessage sessionMessage) {
        String text = sessionMessage.getMessage();
        ChatSession session = sessionMessage.getSession();
        String command = text.split(" ")[0];
        switch (command) {
            case ("/remove"):
                removeSession(session);
                break;
            default:
                System.err.println("Invalid command from session");
                break;
        }
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
