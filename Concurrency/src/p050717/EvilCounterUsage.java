package p050717;

import utlis.Utils;

public class EvilCounterUsage {

    public static void main(String[] args) {

        Counter c = new Counter();

        new Thread(()-> {
            synchronized (c) {
                while (true) {}
            }
        }).start();

        Utils.pause(1000);

        System.out.println("starting good threads");

        new Thread(() -> {
            while (true) {
                c.inc();
                Utils.pause(1000);
            }
        }).start();

        new Thread(() -> {
            while (true) {
                System.out.println(c.getCount());
                Utils.pause(1000);
            }
        }).start();


    }

}
