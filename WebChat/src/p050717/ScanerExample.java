package p050717;

import java.util.Scanner;

public class ScanerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("print your name: ");

        String name = scanner.nextLine();

        System.out.println("Hi, " + name);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            if (line.equals("buy"))
                break;
        }
    }

}
