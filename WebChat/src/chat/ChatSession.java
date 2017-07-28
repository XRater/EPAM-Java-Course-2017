package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.function.Consumer;

public class ChatSession {

    private Socket socket;

    private String name;
    private long delay;

    private PrintWriter writer;
    private Scanner scanner;

    public ChatSession(Socket socket, String name, long delay) {
        this.socket = socket;
        this.name = name;
        this.delay = delay;

        try {
            scanner = new Scanner(socket.getInputStream());
            writer = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void processConnection(Consumer<ClientMessage> clientConsumer, Consumer<SessionMessage> sessionConsumer) {

        sendToClient("/name " + name);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            clientConsumer.accept(sendClientCommand(line));
        }

        closeSession();
        sessionConsumer.accept(sendSessionCommand("/remove"));
    }

    public void closeSession() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private SessionMessage sendSessionCommand(String cmd) {
        return new SessionMessage(this, cmd);
    }

    private ClientMessage sendClientCommand(String cmd) {
        return new ClientMessage(this, cmd);
    }

    public void sendToClient(String line) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        writer.println(line);
        writer.flush();
    }

    public String getClientName() {
        return name;
    }
}
