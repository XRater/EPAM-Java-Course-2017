package p110717;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("SynchronizeOnNonFinalField")
public class WorkerThread {

    private Queue<Runnable> tasks = new LinkedList<>();

    public WorkerThread() {
        new Thread(this::process).start();
    }

    public void submit(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notify();
        }
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
