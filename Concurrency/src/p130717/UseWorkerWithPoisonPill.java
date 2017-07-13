package p130717;

import utlis.Utils;

public class UseWorkerWithPoisonPill {

    static class Task implements Runnable {

        private final int number;

        Task(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("start" + number);
            Utils.pause(2000);
            System.out.println("stop" + number);
        }
    }

    public static void main(String[] args) {
        WorkerThreadWithBlockingQueue worker = new WorkerThreadWithBlockingQueue();

        for (int i = 0; i < 3; i++) {
            worker.submit(new Task(i));
        }

        worker.shutdown();
    }

}
