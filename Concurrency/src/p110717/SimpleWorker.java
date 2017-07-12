package p110717;

public class SimpleWorker {

    public void process(Runnable task) {
        new Thread(task).start();
    }

}
