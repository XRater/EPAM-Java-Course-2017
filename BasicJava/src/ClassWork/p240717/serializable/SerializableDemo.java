package ClassWork.p240717.serializable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializableDemo {

    public static void main(String[] args) throws IOException {

        A a = new A();
        a.x = 10;
        a.s = "Hello";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(baos);

        
    }

}

class A implements Serializable {

    int x;

    String s;

}
