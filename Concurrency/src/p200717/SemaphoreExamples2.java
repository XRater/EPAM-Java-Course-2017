package p200717;

import utlis.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class SemaphoreExamples2 {

    static volatile int count = 0;

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(0);

        List<Runner> runners = Arrays.asList(
                new Runner(sem),
                new Runner(sem),
                new Runner(sem),
                new Runner(sem),
                new Runner(sem),
                new Runner(sem),
                new Runner(sem)
        );

        ExecutorService service = Executors.newCachedThreadPool();

        for (Runner runner : runners) {
            Utils.pause(200);
            service.execute(runner);
        }

        Utils.pause(1000);

//        System.out.println("ready...");
//        Utils.pause(1000);
//        System.out.println("steady...");
//        Utils.pause(1000);
//        System.out.println("go!");

        sem.release();
    }

    private static final class Runner implements Runnable {

        private Semaphore sem;

        private Runner(Semaphore sem) {
            this.sem = sem;
        }

        @Override
        public void run() {
            int number = count++;
            System.out.println("waiting for signal " + number);
            sem.acquireUninterruptibly();
            System.out.println("got signal " + number);
        }

    }

}
