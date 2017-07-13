package p130717;

import utlis.Utils;

public class SuspendResumeStopExamples {

    public static void main(String[] args) {

        System.out.println("Start");

        Object lock = new Object();

        Thread thread = new Thread( () -> {
            synchronized (lock) {
                Utils.pause(1000);
                System.out.println("Woke up!");
            }
        });
        thread.start();

        Utils.pause(1000);

        thread.suspend();
//        thread.resume();
    }

}
