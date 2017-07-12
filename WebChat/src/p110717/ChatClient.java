package p110717;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 10000);

            Scanner serverScanner = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            Scanner keyboardScanner = new Scanner(System.in);

            readMessages(writer, keyboardScanner);


            while (serverScanner.hasNextLine()) {
                String line = serverScanner.nextLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readMessages(PrintWriter writer, Scanner keyboardScanner) {
        new Thread( () -> {
            while (keyboardScanner.hasNextLine()) {
                String line = keyboardScanner.nextLine();
                writer.println(line);
                writer.flush();
            }
        }).start();
    }

}
