package p130717;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("SynchronizeOnNonFinalField")
public class WorkerThreadWithBlockingQueue {

    BlockingQueue<Runnable> tasks = new BlockingQueue<>();
    private final Thread thread;
    volatile private boolean mayAcceptTasks;

    private final Object lock = new Object();

    static final private Runnable POISON_PILL = () -> {};

    public WorkerThreadWithBlockingQueue() {
        synchronized (lock) {
            thread = new Thread(this::process);
            thread.start();
            mayAcceptTasks = true;
        }
    }

    public void shutdown() {
        submit(POISON_PILL);
    }

    private void process() {
        while (true) {
            Runnable task = tasks.take();
            if (task == POISON_PILL)
                break;
            task.run();
        }
    }

    public boolean submit(Runnable task) {
        synchronized (lock) {
            if (!mayAcceptTasks)
                return false;
            if (task == POISON_PILL)
                mayAcceptTasks = false;
        }
        tasks.put(task);
        return true;
    }

}
