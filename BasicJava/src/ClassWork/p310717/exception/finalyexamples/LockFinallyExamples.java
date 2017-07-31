package ClassWork.p310717.exception.finalyexamples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockFinallyExamples {

    private static class Counter {

        Lock lock = new ReentrantLock();

        int count;

        public void inc() {
            lock.lock();
            count++;
            lock.unlock();
        }

        public int get() {
            lock.lock();
            int result = count;
            lock.unlock();
            return result;

        }
    }

    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable task = () -> {
            while (true) {
                counter.inc();
                System.out.println(counter.get());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(task).start();

        new Thread(task).start();

        new Thread(task).start();
    }
}
