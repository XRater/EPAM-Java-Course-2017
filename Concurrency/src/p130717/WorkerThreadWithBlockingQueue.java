package p130717;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("SynchronizeOnNonFinalField")
public class WorkerThreadWithPoisonPill {

    private final Thread thread;
    private Queue<Runnable> tasks = new LinkedList<>();
    volatile private boolean mayAcceptTasks;

    static final private Runnable POISON_PILL = () -> {};

    public WorkerThreadWithPoisonPill() {
        synchronized (tasks) {
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
            Runnable task = null;
            synchronized (tasks) {
                while (tasks.isEmpty()) {
                    try {
                        tasks.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                task = tasks.poll();
            }
            if (task == POISON_PILL)
                break;
            task.run();
        }
    }

    public boolean submit(Runnable task) {
        synchronized (tasks) {
            if (!mayAcceptTasks)
                return false;
            if (task == POISON_PILL)
                mayAcceptTasks = false;
            tasks.add(task);
            tasks.notify();
        }
        return true;
    }


}
