package p200717;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockCounter {

    int count = 0;

    Lock lock = new ReentrantLock();

    public int get() {
        lock.lock();
        try {
            return count;
        } finally {
            lock.unlock();
        }
    }

    public void inc() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

}
