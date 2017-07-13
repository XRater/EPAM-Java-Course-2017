package p130717.producerconsumer;

import utlis.Utils;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;


class Waiter implements Runnable {

    static final Random random = new Random();

    private BlockingQueue<String> window;

    public Waiter(BlockingQueue<String> window) {
        this.window = window;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Start waiting for dish");
            try {
                String dish = window.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("serving");
            Utils.pause(1000 + random.nextInt(8000));
        }
    }

}
