package p050717;

public class Counter {

    private int count;
    private final Object lock = new Object();

    int getCount() {
        synchronized (lock) {
            return count;
        }
    }

    synchronized public void inc() {
        synchronized (lock) {
            count++;
        }
    }
}
