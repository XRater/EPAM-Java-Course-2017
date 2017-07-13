package p130717;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.function.Consumer;

import static p130717.ChatServer.DEFAULT_PORT;

class ChatClient {

    PrintWriter writer;

    public void init(Consumer<String> consumer) {
        try {
            Socket socket = new Socket("localhost", DEFAULT_PORT);

            Scanner serverScanner = new Scanner(socket.getInputStream());
            writer = new PrintWriter(socket.getOutputStream());

            new Thread(() -> {
                while (serverScanner.hasNextLine()) {
                    String line = serverScanner.nextLine();
                    consumer.accept(line);
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendTextToServer(String line) {
        System.out.println(line);
        writer.println(line);
        writer.flush();
    }

    public static void main(String[] args) {

        ChatClient chat = new ChatClient();
        Scanner keyboardScanner = new Scanner(System.in);

        chat.init(System.out::println);

        new Thread( () -> {
            while (keyboardScanner.hasNextLine()) {
                String line = keyboardScanner.nextLine();
                chat.sendTextToServer(line);
            }
        }).start();

    }

}
