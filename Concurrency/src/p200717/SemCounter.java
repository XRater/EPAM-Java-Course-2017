package p200717;

import java.util.concurrent.Semaphore;

class SemCounter {

    int count = 0;

    Semaphore sem = new Semaphore(1);

    public int get() {
        sem.acquireUninterruptibly();
        try {
            return count;
        } finally {
            sem.release();
        }
    }

    public void inc() {
        sem.acquireUninterruptibly();
        try {
            count++;
        } finally {
            sem.release();
        }
    }

}
