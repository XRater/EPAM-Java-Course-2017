package p130717.producerconsumer;

import utlis.Utils;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

class Cook implements Runnable {

    static final Random random = new Random();

    private BlockingQueue<String> window;

    public Cook(BlockingQueue<String> window) {
        this.window = window;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Start cooking");
            Utils.pause(1000 + random.nextInt(3000));
            try {
                System.out.println("Dish is ready, waiting for waiter");
                window.put("dish");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
