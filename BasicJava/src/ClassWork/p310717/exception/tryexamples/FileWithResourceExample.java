package ClassWork.p310717.exception.tryexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileWithResourceExample {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("help.txt")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
