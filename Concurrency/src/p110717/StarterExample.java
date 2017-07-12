package p110717;

import utlis.Utils;

import java.util.Arrays;
import java.util.List;

public class StarterExample {

    static class Runner implements Runnable {

        private Object pager;

        public Runner(Object pager) {
            this.pager = pager;
        }

        @Override
        public void run() {
            synchronized (pager) {
                try {
                    pager.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                System.out.println("Running " + this);
        }

    }

    public static void main(String[] args) {

        Object starter = new Object();

        List<Runner> runners = Arrays.asList(new Runner(starter),
                new Runner(starter), new Runner(starter));

        for (Runner runner : runners)
            new Thread(runner).start();

        Utils.pause(1000);
        System.out.println("Ready...");
        Utils.pause(1000);
        System.out.println("Steady...");
        Utils.pause(1000);
        System.out.println("Go!");

        synchronized (starter) {
            starter.notifyAll();
        }
    }

}
