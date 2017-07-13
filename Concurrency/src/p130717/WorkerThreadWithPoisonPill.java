package p130717;

import java.util.LinkedList;
import java.util.Queue;

public class WorkerThreadWithShutDown2 {

    private final Thread thread;
    private Queue<Runnable> tasks = new LinkedList<>();
    private boolean running;

    static final private Runnable POISON_PILL = () -> {};

    public WorkerThreadWithShutDown2() {
        thread = new Thread(this::process);
        thread.start();
        running = true;
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
            task.run();
        }
    }

    public void submit(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notify();
        }
    }


}
