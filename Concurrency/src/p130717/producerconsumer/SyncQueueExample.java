package p130717.producerconsumer;

import utlis.Utils;

import java.util.Random;
import java.util.concurrent.*;

public class SyncQueueExample {

    public static void main(String[] args) {

        BlockingQueue<String> window = new LinkedBlockingQueue<>();

        Cook cook = new Cook(window);
        Waiter waiter = new Waiter(window);

        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(cook);

        service.execute(() -> {
            while (true) {
                Utils.pause(1000);
                System.out.println(window.size());
                if (window.size() > 5)
                    service.execute(waiter);
            }
        });
    }

}
