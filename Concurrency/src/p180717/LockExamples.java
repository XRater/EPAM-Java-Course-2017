package p180717;

import utlis.Utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExamples {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

//        lock.

        new Thread(() -> {
            lock.lock();
            try {
                Utils.pause(5000);
            } finally {
                lock.unlock();
            }
        }).start();

        Utils.pause(1000);

        lock.lock();
        try {
            System.out.println("got it");
        } finally {
            lock.unlock();
        }

    }

}
