package p130717;

import utlis.Utils;

public class ThreadSleepWithLock {

    public static void main(String[] args) {

        System.out.println("Start");

        Object lock = new Object();

        Thread thread = new Thread( () -> {
            synchronized (lock) {
//                Utils.pause(20000);
                try {
                    lock.wait(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Woke up!");
            }
        });
        thread.start();

        Utils.pause(1000);

//        thread.suspend();
//        thread.resume();

        synchronized (lock) {
            System.out.println("hello");
        }
    }

}
