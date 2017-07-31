package ClassWork.p310717.exception.finalyexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("help.txt");

            try {
                final int read = fis.read();
            } finally {
                fis.close();
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
