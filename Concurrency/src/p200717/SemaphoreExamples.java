package p200717;

import utlis.Utils;

import java.util.concurrent.Semaphore;

class SemaphoreExamples {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(0);

        Runnable runner = () -> {
            System.out.println("waiting for signal");
            sem.acquireUninterruptibly();
            System.out.println("got signal");
            int count = 0;
            while (true) {
                System.out.println(Thread.currentThread().toString() + (count++));
                Utils.pause(1000);
            }
        };

        new Thread(runner).start();

        Utils.pause(1000);

        System.out.println("ready...");
        Utils.pause(1000);
        System.out.println("steady...");
        Utils.pause(1000);
        System.out.println("go!");

        sem.release();
    }

}
