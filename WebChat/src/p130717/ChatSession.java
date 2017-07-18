package p130717;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.function.Consumer;

public class ChatSession {

    private String name;
    private long delay;

    public ChatSession(String name, long delay) {
        this.name = name;
        this.delay = delay;
    }

    private PrintWriter writer;

    void processConnection(Socket socket,
                           Consumer<String> broadcaster,
                           Consumer<ChatSession> sessionRemover) {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            writer = new PrintWriter(socket.getOutputStream());

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                broadcaster.accept(name + " > " + line);
                if (line.equals("bye"))
                    break;
            }

            socket.close();
            sessionRemover.accept(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
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
}
