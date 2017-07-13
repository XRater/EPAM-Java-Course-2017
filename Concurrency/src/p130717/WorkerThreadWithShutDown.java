package p130717;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("SynchronizeOnNonFinalField")
public class WorkerThreadWithShutDown {

    private final Thread thread;
    private Queue<Runnable> tasks = new LinkedList<>();

    public WorkerThreadWithShutDown() {
        thread = new Thread(this::process);
        thread.start();
    }

    public void submit(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notify();
        }
    }

    public void shutdown() {
//        thread.stop(); BAD!
        thread.interrupt();
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

}
